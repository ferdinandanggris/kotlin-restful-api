package demo.kotlin.restful.controller

import demo.kotlin.restful.error.NotFoundException
import demo.kotlin.restful.error.UnauthorizedException
import demo.kotlin.restful.model.WebResponse
import jakarta.validation.ConstraintViolationException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ErrorController {

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandler(constraintviolationException : ConstraintViolationException): WebResponse<String>{
        return WebResponse(
            code = 400,
            status = "BAD REQUEST",
            data = constraintviolationException.message!!
        )
    }

    @ExceptionHandler(value = [NotFoundException::class])
    fun notFound(notfoundException : NotFoundException): WebResponse<String>{
        return WebResponse(
            code = 404,
            status = "NOT FOUND",
            data = "Not Found"
        )
    }

    @ExceptionHandler(value = [UnauthorizedException::class])
    fun notFound(unauthorizedException: UnauthorizedException ): WebResponse<String>{
        return WebResponse(
            code = 401,
            status = "Unauthorized",
            data = "Please put your X-Api-Key"
        )
    }
}