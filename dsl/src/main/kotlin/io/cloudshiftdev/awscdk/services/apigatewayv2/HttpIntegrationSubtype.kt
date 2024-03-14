package io.cloudshiftdev.awscdk.services.apigatewayv2

public enum class HttpIntegrationSubtype(
    private val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype,
) {
    EVENTBRIDGE_PUT_EVENTS(
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype.EVENTBRIDGE_PUT_EVENTS
    ),
    SQS_SEND_MESSAGE(
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype.SQS_SEND_MESSAGE
    ),
    SQS_RECEIVE_MESSAGE(
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype.SQS_RECEIVE_MESSAGE
    ),
    SQS_DELETE_MESSAGE(
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype.SQS_DELETE_MESSAGE
    ),
    SQS_PURGE_QUEUE(
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype.SQS_PURGE_QUEUE
    ),
    APPCONFIG_GET_CONFIGURATION(
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
            .APPCONFIG_GET_CONFIGURATION
    ),
    KINESIS_PUT_RECORD(
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype.KINESIS_PUT_RECORD
    ),
    STEPFUNCTIONS_START_EXECUTION(
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
            .STEPFUNCTIONS_START_EXECUTION
    ),
    STEPFUNCTIONS_START_SYNC_EXECUTION(
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
            .STEPFUNCTIONS_START_SYNC_EXECUTION
    ),
    STEPFUNCTIONS_STOP_EXECUTION(
        software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
            .STEPFUNCTIONS_STOP_EXECUTION
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
        ): HttpIntegrationSubtype =
            when (cdkObject) {
                software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
                    .EVENTBRIDGE_PUT_EVENTS -> HttpIntegrationSubtype.EVENTBRIDGE_PUT_EVENTS
                software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
                    .SQS_SEND_MESSAGE -> HttpIntegrationSubtype.SQS_SEND_MESSAGE
                software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
                    .SQS_RECEIVE_MESSAGE -> HttpIntegrationSubtype.SQS_RECEIVE_MESSAGE
                software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
                    .SQS_DELETE_MESSAGE -> HttpIntegrationSubtype.SQS_DELETE_MESSAGE
                software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
                    .SQS_PURGE_QUEUE -> HttpIntegrationSubtype.SQS_PURGE_QUEUE
                software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
                    .APPCONFIG_GET_CONFIGURATION ->
                    HttpIntegrationSubtype.APPCONFIG_GET_CONFIGURATION
                software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
                    .KINESIS_PUT_RECORD -> HttpIntegrationSubtype.KINESIS_PUT_RECORD
                software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
                    .STEPFUNCTIONS_START_EXECUTION ->
                    HttpIntegrationSubtype.STEPFUNCTIONS_START_EXECUTION
                software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
                    .STEPFUNCTIONS_START_SYNC_EXECUTION ->
                    HttpIntegrationSubtype.STEPFUNCTIONS_START_SYNC_EXECUTION
                software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype
                    .STEPFUNCTIONS_STOP_EXECUTION ->
                    HttpIntegrationSubtype.STEPFUNCTIONS_STOP_EXECUTION
            }

        internal fun unwrap(
            wrapped: HttpIntegrationSubtype
        ): software.amazon.awscdk.services.apigatewayv2.HttpIntegrationSubtype = wrapped.cdkObject
    }
}
