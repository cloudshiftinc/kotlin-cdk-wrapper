package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRouteResponse internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The API identifier.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * The API identifier.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * The route response ID.
   */
  public open fun attrRouteResponseId(): String = unwrap(this).getAttrRouteResponseId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The model selection expression for the route response.
   */
  public open fun modelSelectionExpression(): String? = unwrap(this).getModelSelectionExpression()

  /**
   * The model selection expression for the route response.
   */
  public open fun modelSelectionExpression(`value`: String) {
    unwrap(this).setModelSelectionExpression(`value`)
  }

  /**
   * The response models for the route response.
   */
  public open fun responseModels(): Any? = unwrap(this).getResponseModels()

  /**
   * The response models for the route response.
   */
  public open fun responseModels(`value`: Any) {
    unwrap(this).setResponseModels(`value`)
  }

  /**
   * The route response parameters.
   */
  public open fun responseParameters(): Any? = unwrap(this).getResponseParameters()

  /**
   * The route response parameters.
   */
  public open fun responseParameters(`value`: IResolvable) {
    unwrap(this).setResponseParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * The route response parameters.
   */
  public open fun responseParameters(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setResponseParameters(__item_ac66f0)
  }

  /**
   * The route ID.
   */
  public open fun routeId(): String = unwrap(this).getRouteId()

  /**
   * The route ID.
   */
  public open fun routeId(`value`: String) {
    unwrap(this).setRouteId(`value`)
  }

  /**
   * The route response key.
   */
  public open fun routeResponseKey(): String = unwrap(this).getRouteResponseKey()

  /**
   * The route response key.
   */
  public open fun routeResponseKey(`value`: String) {
    unwrap(this).setRouteResponseKey(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnRouteResponse].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-apiid)
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * The model selection expression for the route response.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-modelselectionexpression)
     * @param modelSelectionExpression The model selection expression for the route response. 
     */
    public fun modelSelectionExpression(modelSelectionExpression: String)

    /**
     * The response models for the route response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responsemodels)
     * @param responseModels The response models for the route response. 
     */
    public fun responseModels(responseModels: Any)

    /**
     * The route response parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters)
     * @param responseParameters The route response parameters. 
     */
    public fun responseParameters(responseParameters: IResolvable)

    /**
     * The route response parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters)
     * @param responseParameters The route response parameters. 
     */
    public fun responseParameters(responseParameters: Map<String, Any>)

    /**
     * The route ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeid)
     * @param routeId The route ID. 
     */
    public fun routeId(routeId: String)

    /**
     * The route response key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeresponsekey)
     * @param routeResponseKey The route response key. 
     */
    public fun routeResponseKey(routeResponseKey: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.Builder.create(scope, id)

    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-apiid)
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * The model selection expression for the route response.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-modelselectionexpression)
     * @param modelSelectionExpression The model selection expression for the route response. 
     */
    override fun modelSelectionExpression(modelSelectionExpression: String) {
      cdkBuilder.modelSelectionExpression(modelSelectionExpression)
    }

    /**
     * The response models for the route response.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responsemodels)
     * @param responseModels The response models for the route response. 
     */
    override fun responseModels(responseModels: Any) {
      cdkBuilder.responseModels(responseModels)
    }

    /**
     * The route response parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters)
     * @param responseParameters The route response parameters. 
     */
    override fun responseParameters(responseParameters: IResolvable) {
      cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
    }

    /**
     * The route response parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-responseparameters)
     * @param responseParameters The route response parameters. 
     */
    override fun responseParameters(responseParameters: Map<String, Any>) {
      cdkBuilder.responseParameters(responseParameters)
    }

    /**
     * The route ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeid)
     * @param routeId The route ID. 
     */
    override fun routeId(routeId: String) {
      cdkBuilder.routeId(routeId)
    }

    /**
     * The route response key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-routeresponse.html#cfn-apigatewayv2-routeresponse-routeresponsekey)
     * @param routeResponseKey The route response key. 
     */
    override fun routeResponseKey(routeResponseKey: String) {
      cdkBuilder.routeResponseKey(routeResponseKey)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRouteResponse {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRouteResponse(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse):
        CfnRouteResponse = CfnRouteResponse(cdkObject)

    internal fun unwrap(wrapped: CfnRouteResponse):
        software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse = wrapped.cdkObject
  }

  public interface ParameterConstraintsProperty {
    /**
     * Specifies whether the parameter is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routeresponse-parameterconstraints.html#cfn-apigatewayv2-routeresponse-parameterconstraints-required)
     */
    public fun required(): Any

    /**
     * A builder for [ParameterConstraintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param required Specifies whether the parameter is required. 
       */
      public fun required(required: Boolean)

      /**
       * @param required Specifies whether the parameter is required. 
       */
      public fun required(required: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty.builder()

      /**
       * @param required Specifies whether the parameter is required. 
       */
      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      /**
       * @param required Specifies whether the parameter is required. 
       */
      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty,
    ) : CdkObject(cdkObject), ParameterConstraintsProperty {
      /**
       * Specifies whether the parameter is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routeresponse-parameterconstraints.html#cfn-apigatewayv2-routeresponse-parameterconstraints-required)
       */
      override fun required(): Any = unwrap(this).getRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty):
          ParameterConstraintsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterConstraintsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnRouteResponse.ParameterConstraintsProperty
    }
  }
}
