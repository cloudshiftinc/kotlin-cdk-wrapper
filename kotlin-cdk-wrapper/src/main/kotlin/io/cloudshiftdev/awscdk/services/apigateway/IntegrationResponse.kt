@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * IntegrationResponse integrationResponse = IntegrationResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .selectionPattern("selectionPattern")
 * .build();
 * ```
 */
public interface IntegrationResponse {
  /**
   * Specifies how to handle request payload content type conversions.
   *
   * Default: none the request payload is passed through from the method
   * request to the integration request without modification.
   */
  public fun contentHandling(): ContentHandling? =
      unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

  /**
   * The response parameters from the backend response that API Gateway sends to the method
   * response.
   *
   * Use the destination as the key and the source as the value:
   *
   * * The destination must be an existing response parameter in the
   * MethodResponse property.
   * * The source must be an existing method request parameter or a static
   * value. You must enclose static values in single quotation marks and
   * pre-encode these values based on the destination specified in the
   * request.
   *
   * [Documentation](http://docs.aws.amazon.com/apigateway/latest/developerguide/request-response-data-mappings.html)
   */
  public fun responseParameters(): Map<String, String> = unwrap(this).getResponseParameters() ?:
      emptyMap()

  /**
   * The templates that are used to transform the integration response body.
   *
   * Specify templates as key-value pairs, with a content type as the key and
   * a template as the value.
   *
   * [Documentation](http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html)
   */
  public fun responseTemplates(): Map<String, String> = unwrap(this).getResponseTemplates() ?:
      emptyMap()

  /**
   * Specifies the regular expression (regex) pattern used to choose an integration response based
   * on the response from the back end.
   *
   * For example, if the success response returns nothing and the error response returns some
   * string, you
   * could use the `.+` regex to match error response. However, make sure that the error response
   * does not contain any
   * newline (`\n`) character in such cases. If the back end is an AWS Lambda function, the AWS
   * Lambda function error
   * header is matched. For all other HTTP and AWS back ends, the HTTP status code is matched.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-integration-settings-integration-response.html)
   */
  public fun selectionPattern(): String? = unwrap(this).getSelectionPattern()

  /**
   * The status code that API Gateway uses to map the integration response to a MethodResponse
   * status code.
   */
  public fun statusCode(): String

  /**
   * A builder for [IntegrationResponse]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentHandling Specifies how to handle request payload content type conversions.
     */
    public fun contentHandling(contentHandling: ContentHandling)

    /**
     * @param responseParameters The response parameters from the backend response that API Gateway
     * sends to the method response.
     * Use the destination as the key and the source as the value:
     *
     * * The destination must be an existing response parameter in the
     * MethodResponse property.
     * * The source must be an existing method request parameter or a static
     * value. You must enclose static values in single quotation marks and
     * pre-encode these values based on the destination specified in the
     * request.
     */
    public fun responseParameters(responseParameters: Map<String, String>)

    /**
     * @param responseTemplates The templates that are used to transform the integration response
     * body.
     * Specify templates as key-value pairs, with a content type as the key and
     * a template as the value.
     */
    public fun responseTemplates(responseTemplates: Map<String, String>)

    /**
     * @param selectionPattern Specifies the regular expression (regex) pattern used to choose an
     * integration response based on the response from the back end.
     * For example, if the success response returns nothing and the error response returns some
     * string, you
     * could use the `.+` regex to match error response. However, make sure that the error response
     * does not contain any
     * newline (`\n`) character in such cases. If the back end is an AWS Lambda function, the AWS
     * Lambda function error
     * header is matched. For all other HTTP and AWS back ends, the HTTP status code is matched.
     */
    public fun selectionPattern(selectionPattern: String)

    /**
     * @param statusCode The status code that API Gateway uses to map the integration response to a
     * MethodResponse status code. 
     */
    public fun statusCode(statusCode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.IntegrationResponse.Builder =
        software.amazon.awscdk.services.apigateway.IntegrationResponse.builder()

    /**
     * @param contentHandling Specifies how to handle request payload content type conversions.
     */
    override fun contentHandling(contentHandling: ContentHandling) {
      cdkBuilder.contentHandling(contentHandling.let(ContentHandling::unwrap))
    }

    /**
     * @param responseParameters The response parameters from the backend response that API Gateway
     * sends to the method response.
     * Use the destination as the key and the source as the value:
     *
     * * The destination must be an existing response parameter in the
     * MethodResponse property.
     * * The source must be an existing method request parameter or a static
     * value. You must enclose static values in single quotation marks and
     * pre-encode these values based on the destination specified in the
     * request.
     */
    override fun responseParameters(responseParameters: Map<String, String>) {
      cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param responseTemplates The templates that are used to transform the integration response
     * body.
     * Specify templates as key-value pairs, with a content type as the key and
     * a template as the value.
     */
    override fun responseTemplates(responseTemplates: Map<String, String>) {
      cdkBuilder.responseTemplates(responseTemplates)
    }

    /**
     * @param selectionPattern Specifies the regular expression (regex) pattern used to choose an
     * integration response based on the response from the back end.
     * For example, if the success response returns nothing and the error response returns some
     * string, you
     * could use the `.+` regex to match error response. However, make sure that the error response
     * does not contain any
     * newline (`\n`) character in such cases. If the back end is an AWS Lambda function, the AWS
     * Lambda function error
     * header is matched. For all other HTTP and AWS back ends, the HTTP status code is matched.
     */
    override fun selectionPattern(selectionPattern: String) {
      cdkBuilder.selectionPattern(selectionPattern)
    }

    /**
     * @param statusCode The status code that API Gateway uses to map the integration response to a
     * MethodResponse status code. 
     */
    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.IntegrationResponse =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.IntegrationResponse,
  ) : CdkObject(cdkObject), IntegrationResponse {
    /**
     * Specifies how to handle request payload content type conversions.
     *
     * Default: none the request payload is passed through from the method
     * request to the integration request without modification.
     */
    override fun contentHandling(): ContentHandling? =
        unwrap(this).getContentHandling()?.let(ContentHandling::wrap)

    /**
     * The response parameters from the backend response that API Gateway sends to the method
     * response.
     *
     * Use the destination as the key and the source as the value:
     *
     * * The destination must be an existing response parameter in the
     * MethodResponse property.
     * * The source must be an existing method request parameter or a static
     * value. You must enclose static values in single quotation marks and
     * pre-encode these values based on the destination specified in the
     * request.
     *
     * [Documentation](http://docs.aws.amazon.com/apigateway/latest/developerguide/request-response-data-mappings.html)
     */
    override fun responseParameters(): Map<String, String> = unwrap(this).getResponseParameters() ?:
        emptyMap()

    /**
     * The templates that are used to transform the integration response body.
     *
     * Specify templates as key-value pairs, with a content type as the key and
     * a template as the value.
     *
     * [Documentation](http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html)
     */
    override fun responseTemplates(): Map<String, String> = unwrap(this).getResponseTemplates() ?:
        emptyMap()

    /**
     * Specifies the regular expression (regex) pattern used to choose an integration response based
     * on the response from the back end.
     *
     * For example, if the success response returns nothing and the error response returns some
     * string, you
     * could use the `.+` regex to match error response. However, make sure that the error response
     * does not contain any
     * newline (`\n`) character in such cases. If the back end is an AWS Lambda function, the AWS
     * Lambda function error
     * header is matched. For all other HTTP and AWS back ends, the HTTP status code is matched.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-integration-settings-integration-response.html)
     */
    override fun selectionPattern(): String? = unwrap(this).getSelectionPattern()

    /**
     * The status code that API Gateway uses to map the integration response to a MethodResponse
     * status code.
     */
    override fun statusCode(): String = unwrap(this).getStatusCode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.IntegrationResponse):
        IntegrationResponse = CdkObjectWrappers.wrap(cdkObject) as IntegrationResponse

    internal fun unwrap(wrapped: IntegrationResponse):
        software.amazon.awscdk.services.apigateway.IntegrationResponse = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.IntegrationResponse
  }
}
