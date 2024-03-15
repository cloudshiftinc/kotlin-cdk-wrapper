@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnModel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * Object schema;
 * CfnModelProps cfnModelProps = CfnModelProps.builder()
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
public interface CfnModelProps {
  /**
   * The API identifier.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-apiid)
   */
  public fun apiId(): String

  /**
   * The content-type for the model, for example, "application/json".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-contenttype)
   */
  public fun contentType(): String? = unwrap(this).getContentType()

  /**
   * The description of the model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-name)
   */
  public fun name(): String

  /**
   * The schema for the model.
   *
   * For application/json models, this should be JSON schema draft 4 model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-schema)
   */
  public fun schema(): Any

  /**
   * A builder for [CfnModelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * @param contentType The content-type for the model, for example, "application/json".
     */
    public fun contentType(contentType: String)

    /**
     * @param description The description of the model.
     */
    public fun description(description: String)

    /**
     * @param name The name of the model. 
     */
    public fun name(name: String)

    /**
     * @param schema The schema for the model. 
     * For application/json models, this should be JSON schema draft 4 model.
     */
    public fun schema(schema: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnModelProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnModelProps.builder()

    /**
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param contentType The content-type for the model, for example, "application/json".
     */
    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    /**
     * @param description The description of the model.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the model. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param schema The schema for the model. 
     * For application/json models, this should be JSON schema draft 4 model.
     */
    override fun schema(schema: Any) {
      cdkBuilder.schema(schema)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnModelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnModelProps,
  ) : CdkObject(cdkObject), CfnModelProps {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * The content-type for the model, for example, "application/json".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-contenttype)
     */
    override fun contentType(): String? = unwrap(this).getContentType()

    /**
     * The description of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The schema for the model.
     *
     * For application/json models, this should be JSON schema draft 4 model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-model.html#cfn-apigatewayv2-model-schema)
     */
    override fun schema(): Any = unwrap(this).getSchema()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnModelProps):
        CfnModelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelProps):
        software.amazon.awscdk.services.apigatewayv2.CfnModelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnModelProps
  }
}
