@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * Object schema;
 * CfnModelProps cfnModelProps = CfnModelProps.builder()
 * .restApiId("restApiId")
 * // the properties below are optional
 * .contentType("contentType")
 * .description("description")
 * .name("name")
 * .schema(schema)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html)
 */
public interface CfnModelProps {
  /**
   * The content-type for the model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-contenttype)
   */
  public fun contentType(): String? = unwrap(this).getContentType()

  /**
   * The description of the model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A name for the model.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the model name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-restapiid)
   */
  public fun restApiId(): String

  /**
   * The schema for the model.
   *
   * For `application/json` models, this should be JSON schema draft 4 model. Do not include "* /"
   * characters in the description of any properties because such "* /" characters may be interpreted
   * as the closing marker for comments in some languages, such as Java or JavaScript, causing the
   * installation of your API's SDK generated by API Gateway to fail.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-schema)
   */
  public fun schema(): Any? = unwrap(this).getSchema()

  /**
   * A builder for [CfnModelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentType The content-type for the model.
     */
    public fun contentType(contentType: String)

    /**
     * @param description The description of the model.
     */
    public fun description(description: String)

    /**
     * @param name A name for the model.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the model name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun name(name: String)

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)

    /**
     * @param schema The schema for the model.
     * For `application/json` models, this should be JSON schema draft 4 model. Do not include "* /"
     * characters in the description of any properties because such "* /" characters may be interpreted
     * as the closing marker for comments in some languages, such as Java or JavaScript, causing the
     * installation of your API's SDK generated by API Gateway to fail.
     */
    public fun schema(schema: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnModelProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnModelProps.builder()

    /**
     * @param contentType The content-type for the model.
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
     * @param name A name for the model.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the model name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    /**
     * @param schema The schema for the model.
     * For `application/json` models, this should be JSON schema draft 4 model. Do not include "* /"
     * characters in the description of any properties because such "* /" characters may be interpreted
     * as the closing marker for comments in some languages, such as Java or JavaScript, causing the
     * installation of your API's SDK generated by API Gateway to fail.
     */
    override fun schema(schema: Any) {
      cdkBuilder.schema(schema)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnModelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.CfnModelProps,
  ) : CdkObject(cdkObject),
      CfnModelProps {
    /**
     * The content-type for the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-contenttype)
     */
    override fun contentType(): String? = unwrap(this).getContentType()

    /**
     * The description of the model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A name for the model.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the model name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-restapiid)
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()

    /**
     * The schema for the model.
     *
     * For `application/json` models, this should be JSON schema draft 4 model. Do not include "* /"
     * characters in the description of any properties because such "* /" characters may be interpreted
     * as the closing marker for comments in some languages, such as Java or JavaScript, causing the
     * installation of your API's SDK generated by API Gateway to fail.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-schema)
     */
    override fun schema(): Any? = unwrap(this).getSchema()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnModelProps):
        CfnModelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnModelProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelProps):
        software.amazon.awscdk.services.apigateway.CfnModelProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.CfnModelProps
  }
}
