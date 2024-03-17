@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnGatewayResponse`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnGatewayResponseProps cfnGatewayResponseProps = CfnGatewayResponseProps.builder()
 * .responseType("responseType")
 * .restApiId("restApiId")
 * // the properties below are optional
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .statusCode("statusCode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html)
 */
public interface CfnGatewayResponseProps {
  /**
   * Response parameters (paths, query strings and headers) of the GatewayResponse as a
   * string-to-string map of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters)
   */
  public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  /**
   * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates)
   */
  public fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

  /**
   * The response type of the associated GatewayResponse.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype)
   */
  public fun responseType(): String

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid)
   */
  public fun restApiId(): String

  /**
   * The HTTP status code for this GatewayResponse.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode)
   */
  public fun statusCode(): String? = unwrap(this).getStatusCode()

  /**
   * A builder for [CfnGatewayResponseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     * GatewayResponse as a string-to-string map of key-value pairs.
     */
    public fun responseParameters(responseParameters: IResolvable)

    /**
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     * GatewayResponse as a string-to-string map of key-value pairs.
     */
    public fun responseParameters(responseParameters: Map<String, String>)

    /**
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     * of key-value pairs.
     */
    public fun responseTemplates(responseTemplates: IResolvable)

    /**
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     * of key-value pairs.
     */
    public fun responseTemplates(responseTemplates: Map<String, String>)

    /**
     * @param responseType The response type of the associated GatewayResponse. 
     */
    public fun responseType(responseType: String)

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * @param statusCode The HTTP status code for this GatewayResponse.
     */
    public fun statusCode(statusCode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps.builder()

    /**
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     * GatewayResponse as a string-to-string map of key-value pairs.
     */
    override fun responseParameters(responseParameters: IResolvable) {
      cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
    }

    /**
     * @param responseParameters Response parameters (paths, query strings and headers) of the
     * GatewayResponse as a string-to-string map of key-value pairs.
     */
    override fun responseParameters(responseParameters: Map<String, String>) {
      cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     * of key-value pairs.
     */
    override fun responseTemplates(responseTemplates: IResolvable) {
      cdkBuilder.responseTemplates(responseTemplates.let(IResolvable::unwrap))
    }

    /**
     * @param responseTemplates Response templates of the GatewayResponse as a string-to-string map
     * of key-value pairs.
     */
    override fun responseTemplates(responseTemplates: Map<String, String>) {
      cdkBuilder.responseTemplates(responseTemplates)
    }

    /**
     * @param responseType The response type of the associated GatewayResponse. 
     */
    override fun responseType(responseType: String) {
      cdkBuilder.responseType(responseType)
    }

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param statusCode The HTTP status code for this GatewayResponse.
     */
    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps,
  ) : CdkObject(cdkObject), CfnGatewayResponseProps {
    /**
     * Response parameters (paths, query strings and headers) of the GatewayResponse as a
     * string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responseparameters)
     */
    override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    /**
     * Response templates of the GatewayResponse as a string-to-string map of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetemplates)
     */
    override fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

    /**
     * The response type of the associated GatewayResponse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-responsetype)
     */
    override fun responseType(): String = unwrap(this).getResponseType()

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-restapiid)
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()

    /**
     * The HTTP status code for this GatewayResponse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-gatewayresponse.html#cfn-apigateway-gatewayresponse-statuscode)
     */
    override fun statusCode(): String? = unwrap(this).getStatusCode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGatewayResponseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps):
        CfnGatewayResponseProps = CdkObjectWrappers.wrap(cdkObject) as? CfnGatewayResponseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayResponseProps):
        software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnGatewayResponseProps
  }
}
