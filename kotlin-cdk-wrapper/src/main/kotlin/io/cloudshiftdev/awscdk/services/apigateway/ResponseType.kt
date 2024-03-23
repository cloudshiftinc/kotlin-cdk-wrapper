@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Supported types of gateway responses.
 *
 * Example:
 *
 * ```
 * RestApi api = new RestApi(this, "books-api");
 * api.addGatewayResponse("test-response", GatewayResponseOptions.builder()
 * .type(ResponseType.ACCESS_DENIED)
 * .statusCode("500")
 * .responseHeaders(Map.of(
 * // Note that values must be enclosed within a pair of single quotes
 * "Access-Control-Allow-Origin", "'test.com'",
 * "test-key", "'test-value'"))
 * .templates(Map.of(
 * "application/json", "{ \"message\": $context.error.messageString, \"statusCode\": \"488\",
 * \"type\": \"$context.error.responseType\" }"))
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/supported-gateway-response-types.html)
 */
public open class ResponseType(
  cdkObject: software.amazon.awscdk.services.apigateway.ResponseType,
) : CdkObject(cdkObject) {
  /**
   * Valid value of response type.
   */
  public open fun responseType(): String = unwrap(this).getResponseType()

  public companion object {
    public val ACCESS_DENIED: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.ACCESS_DENIED)

    public val API_CONFIGURATION_ERROR: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.API_CONFIGURATION_ERROR)

    public val AUTHORIZER_CONFIGURATION_ERROR: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.AUTHORIZER_CONFIGURATION_ERROR)

    public val AUTHORIZER_FAILURE: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.AUTHORIZER_FAILURE)

    public val BAD_REQUEST_BODY: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.BAD_REQUEST_BODY)

    public val BAD_REQUEST_PARAMETERS: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.BAD_REQUEST_PARAMETERS)

    public val DEFAULT_4_XX: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.DEFAULT_4_XX)

    public val DEFAULT_5_XX: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.DEFAULT_5_XX)

    public val EXPIRED_TOKEN: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.EXPIRED_TOKEN)

    public val INTEGRATION_FAILURE: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.INTEGRATION_FAILURE)

    public val INTEGRATION_TIMEOUT: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.INTEGRATION_TIMEOUT)

    public val INVALID_API_KEY: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.INVALID_API_KEY)

    public val INVALID_SIGNATURE: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.INVALID_SIGNATURE)

    public val MISSING_AUTHENTICATION_TOKEN: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.MISSING_AUTHENTICATION_TOKEN)

    public val QUOTA_EXCEEDED: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.QUOTA_EXCEEDED)

    public val REQUEST_TOO_LARGE: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.REQUEST_TOO_LARGE)

    public val RESOURCE_NOT_FOUND: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.RESOURCE_NOT_FOUND)

    public val THROTTLED: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.THROTTLED)

    public val UNAUTHORIZED: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.UNAUTHORIZED)

    public val UNSUPPORTED_MEDIA_TYPE: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.UNSUPPORTED_MEDIA_TYPE)

    public val WAF_FILTERED: ResponseType =
        ResponseType.wrap(software.amazon.awscdk.services.apigateway.ResponseType.WAF_FILTERED)

    public fun of(type: String): ResponseType =
        software.amazon.awscdk.services.apigateway.ResponseType.of(type).let(ResponseType::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ResponseType):
        ResponseType = ResponseType(cdkObject)

    internal fun unwrap(wrapped: ResponseType):
        software.amazon.awscdk.services.apigateway.ResponseType = wrapped.cdkObject as
        software.amazon.awscdk.services.apigateway.ResponseType
  }
}
