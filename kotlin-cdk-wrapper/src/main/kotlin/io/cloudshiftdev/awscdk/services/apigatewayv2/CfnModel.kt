@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGatewayV2::Model` resource updates data model for a WebSocket API.
 *
 * For more information, see [Model Selection
 * Expressions](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-model-selection-expressions)
 * in the *API Gateway Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * Object schema;
 * CfnModel cfnModel = CfnModel.Builder.create(this, "MyCfnModel")
 * .apiId("apiId")
 * .name("name")
 * .schema(schema)
 * // the properties below are optional
 * .contentType("contentType")
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html)
 */
public open class CfnModel internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnModel,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.CfnModel(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnModelProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnModelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnModelProps(props)
  )

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
   * The model ID.
   */
  public open fun attrModelId(): String = unwrap(this).getAttrModelId()

  /**
   * The content-type for the model, for example, "application/json".
   */
  public open fun contentType(): String? = unwrap(this).getContentType()

  /**
   * The content-type for the model, for example, "application/json".
   */
  public open fun contentType(`value`: String) {
    unwrap(this).setContentType(`value`)
  }

  /**
   * The description of the model.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the model.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the model.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the model.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The schema for the model.
   */
  public open fun schema(): Any = unwrap(this).getSchema()

  /**
   * The schema for the model.
   */
  public open fun schema(`value`: Any) {
    unwrap(this).setSchema(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnModel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-apiid)
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * The content-type for the model, for example, "application/json".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-contenttype)
     * @param contentType The content-type for the model, for example, "application/json". 
     */
    public fun contentType(contentType: String)

    /**
     * The description of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-description)
     * @param description The description of the model. 
     */
    public fun description(description: String)

    /**
     * The name of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-name)
     * @param name The name of the model. 
     */
    public fun name(name: String)

    /**
     * The schema for the model.
     *
     * For application/json models, this should be JSON schema draft 4 model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-schema)
     * @param schema The schema for the model. 
     */
    public fun schema(schema: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnModel.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnModel.Builder.create(scope, id)

    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-apiid)
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * The content-type for the model, for example, "application/json".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-contenttype)
     * @param contentType The content-type for the model, for example, "application/json". 
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * The description of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-description)
     * @param description The description of the model. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-name)
     * @param name The name of the model. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The schema for the model.
     *
     * For application/json models, this should be JSON schema draft 4 model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-schema)
     * @param schema The schema for the model. 
     */
    override fun schema(schema: Any) {
      cdkBuilder.schema(schema)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnModel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigatewayv2.CfnModel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnModel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnModel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnModel): CfnModel =
        CfnModel(cdkObject)

    internal fun unwrap(wrapped: CfnModel): software.amazon.awscdk.services.apigatewayv2.CfnModel =
        wrapped.cdkObject
  }
}
