@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnRouteResponse`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * Object responseModels;
 * CfnRouteResponseProps cfnRouteResponseProps = CfnRouteResponseProps.builder()
 * .apiId("apiId")
 * .routeId("routeId")
 * .routeResponseKey("routeResponseKey")
 * // the properties below are optional
 * .modelSelectionExpression("modelSelectionExpression")
 * .responseModels(responseModels)
 * .responseParameters(Map.of(
 * "responseParametersKey", ParameterConstraintsProperty.builder()
 * .required(false)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html)
 */
public interface CfnRouteResponseProps {
  /**
   * The API identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-apiid)
   */
  public fun apiId(): String

  /**
   * The model selection expression for the route response.
   *
   * Supported only for WebSocket APIs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-modelselectionexpression)
   */
  public fun modelSelectionExpression(): String? = unwrap(this).getModelSelectionExpression()

  /**
   * The response models for the route response.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responsemodels)
   */
  public fun responseModels(): Any? = unwrap(this).getResponseModels()

  /**
   * The route response parameters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters)
   */
  public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  /**
   * The route ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeid)
   */
  public fun routeId(): String

  /**
   * The route response key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeresponsekey)
   */
  public fun routeResponseKey(): String

  /**
   * A builder for [CfnRouteResponseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * @param modelSelectionExpression The model selection expression for the route response.
     * Supported only for WebSocket APIs.
     */
    public fun modelSelectionExpression(modelSelectionExpression: String)

    /**
     * @param responseModels The response models for the route response.
     */
    public fun responseModels(responseModels: Any)

    /**
     * @param responseParameters The route response parameters.
     */
    public fun responseParameters(responseParameters: IResolvable)

    /**
     * @param responseParameters The route response parameters.
     */
    public fun responseParameters(responseParameters: Map<String, Any>)

    /**
     * @param routeId The route ID. 
     */
    public fun routeId(routeId: String)

    /**
     * @param routeResponseKey The route response key. 
     */
    public fun routeResponseKey(routeResponseKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps.builder()

    /**
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param modelSelectionExpression The model selection expression for the route response.
     * Supported only for WebSocket APIs.
     */
    override fun modelSelectionExpression(modelSelectionExpression: String) {
      cdkBuilder.modelSelectionExpression(modelSelectionExpression)
    }

    /**
     * @param responseModels The response models for the route response.
     */
    override fun responseModels(responseModels: Any) {
      cdkBuilder.responseModels(responseModels)
    }

    /**
     * @param responseParameters The route response parameters.
     */
    override fun responseParameters(responseParameters: IResolvable) {
      cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
    }

    /**
     * @param responseParameters The route response parameters.
     */
    override fun responseParameters(responseParameters: Map<String, Any>) {
      cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * @param routeId The route ID. 
     */
    override fun routeId(routeId: String) {
      cdkBuilder.routeId(routeId)
    }

    /**
     * @param routeResponseKey The route response key. 
     */
    override fun routeResponseKey(routeResponseKey: String) {
      cdkBuilder.routeResponseKey(routeResponseKey)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps,
  ) : CdkObject(cdkObject), CfnRouteResponseProps {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The model selection expression for the route response.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-modelselectionexpression)
     */
    override fun modelSelectionExpression(): String? = unwrap(this).getModelSelectionExpression()

    /**
     * The response models for the route response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responsemodels)
     */
    override fun responseModels(): Any? = unwrap(this).getResponseModels()

    /**
     * The route response parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters)
     */
    override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    /**
     * The route ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeid)
     */
    override fun routeId(): String = unwrap(this).getRouteId()

    /**
     * The route response key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeresponsekey)
     */
    override fun routeResponseKey(): String = unwrap(this).getRouteResponseKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRouteResponseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps):
        CfnRouteResponseProps = CdkObjectWrappers.wrap(cdkObject) as? CfnRouteResponseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRouteResponseProps):
        software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnRouteResponseProps
  }
}
