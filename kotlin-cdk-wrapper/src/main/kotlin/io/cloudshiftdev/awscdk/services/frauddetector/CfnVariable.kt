@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Manages a variable.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.frauddetector.*;
 * CfnVariable cfnVariable = CfnVariable.Builder.create(this, "MyCfnVariable")
 * .dataSource("dataSource")
 * .dataType("dataType")
 * .defaultValue("defaultValue")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .variableType("variableType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html)
 */
public open class CfnVariable(
  cdkObject: software.amazon.awscdk.services.frauddetector.CfnVariable,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVariableProps,
  ) :
      this(software.amazon.awscdk.services.frauddetector.CfnVariable(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnVariableProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVariableProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVariableProps(props)
  )

  /**
   * The ARN of the variable.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Timestamp of when variable was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * Timestamp of when variable was last updated.
   */
  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  /**
   * The data source of the variable.
   */
  public open fun dataSource(): String = unwrap(this).getDataSource()

  /**
   * The data source of the variable.
   */
  public open fun dataSource(`value`: String) {
    unwrap(this).setDataSource(`value`)
  }

  /**
   * The data type of the variable.
   */
  public open fun dataType(): String = unwrap(this).getDataType()

  /**
   * The data type of the variable.
   */
  public open fun dataType(`value`: String) {
    unwrap(this).setDataType(`value`)
  }

  /**
   * The default value of the variable.
   */
  public open fun defaultValue(): String = unwrap(this).getDefaultValue()

  /**
   * The default value of the variable.
   */
  public open fun defaultValue(`value`: String) {
    unwrap(this).setDefaultValue(`value`)
  }

  /**
   * The description of the variable.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the variable.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the variable.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the variable.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The type of the variable.
   *
   * For more information see [Variable
   * types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
   * .
   */
  public open fun variableType(): String? = unwrap(this).getVariableType()

  /**
   * The type of the variable.
   *
   * For more information see [Variable
   * types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
   * .
   */
  public open fun variableType(`value`: String) {
    unwrap(this).setVariableType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.frauddetector.CfnVariable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The data source of the variable.
     *
     * Valid values: `EVENT | EXTERNAL_MODEL_SCORE`
     *
     * When defining a variable within a detector, you can only use the `EVENT` value for DataSource
     * when the *Inline* property is set to true. If the *Inline* property is set false, you can use
     * either `EVENT` or `MODEL_SCORE` for DataSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-datasource)
     * @param dataSource The data source of the variable. 
     */
    public fun dataSource(dataSource: String)

    /**
     * The data type of the variable.
     *
     * Valid data types: `STRING | INTEGER | BOOLEAN | FLOAT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-datatype)
     * @param dataType The data type of the variable. 
     */
    public fun dataType(dataType: String)

    /**
     * The default value of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-defaultvalue)
     * @param defaultValue The default value of the variable. 
     */
    public fun defaultValue(defaultValue: String)

    /**
     * The description of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-description)
     * @param description The description of the variable. 
     */
    public fun description(description: String)

    /**
     * The name of the variable.
     *
     * Pattern: `^[0-9a-z_-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-name)
     * @param name The name of the variable. 
     */
    public fun name(name: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of the variable. For more information see [Variable
     * types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
     * .
     *
     * Valid Values: `AUTH_CODE | AVS | BILLING_ADDRESS_L1 | BILLING_ADDRESS_L2 | BILLING_CITY |
     * BILLING_COUNTRY | BILLING_NAME | BILLING_PHONE | BILLING_STATE | BILLING_ZIP | CARD_BIN |
     * CATEGORICAL | CURRENCY_CODE | EMAIL_ADDRESS | FINGERPRINT | FRAUD_LABEL | FREE_FORM_TEXT |
     * IP_ADDRESS | NUMERIC | ORDER_ID | PAYMENT_TYPE | PHONE_NUMBER | PRICE | PRODUCT_CATEGORY |
     * SHIPPING_ADDRESS_L1 | SHIPPING_ADDRESS_L2 | SHIPPING_CITY | SHIPPING_COUNTRY | SHIPPING_NAME |
     * SHIPPING_PHONE | SHIPPING_STATE | SHIPPING_ZIP | USERAGENT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-variabletype)
     * @param variableType The type of the variable. For more information see [Variable
     * types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
     * . 
     */
    public fun variableType(variableType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnVariable.Builder =
        software.amazon.awscdk.services.frauddetector.CfnVariable.Builder.create(scope, id)

    /**
     * The data source of the variable.
     *
     * Valid values: `EVENT | EXTERNAL_MODEL_SCORE`
     *
     * When defining a variable within a detector, you can only use the `EVENT` value for DataSource
     * when the *Inline* property is set to true. If the *Inline* property is set false, you can use
     * either `EVENT` or `MODEL_SCORE` for DataSource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-datasource)
     * @param dataSource The data source of the variable. 
     */
    override fun dataSource(dataSource: String) {
      cdkBuilder.dataSource(dataSource)
    }

    /**
     * The data type of the variable.
     *
     * Valid data types: `STRING | INTEGER | BOOLEAN | FLOAT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-datatype)
     * @param dataType The data type of the variable. 
     */
    override fun dataType(dataType: String) {
      cdkBuilder.dataType(dataType)
    }

    /**
     * The default value of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-defaultvalue)
     * @param defaultValue The default value of the variable. 
     */
    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * The description of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-description)
     * @param description The description of the variable. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the variable.
     *
     * Pattern: `^[0-9a-z_-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-name)
     * @param name The name of the variable. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of the variable. For more information see [Variable
     * types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
     * .
     *
     * Valid Values: `AUTH_CODE | AVS | BILLING_ADDRESS_L1 | BILLING_ADDRESS_L2 | BILLING_CITY |
     * BILLING_COUNTRY | BILLING_NAME | BILLING_PHONE | BILLING_STATE | BILLING_ZIP | CARD_BIN |
     * CATEGORICAL | CURRENCY_CODE | EMAIL_ADDRESS | FINGERPRINT | FRAUD_LABEL | FREE_FORM_TEXT |
     * IP_ADDRESS | NUMERIC | ORDER_ID | PAYMENT_TYPE | PHONE_NUMBER | PRICE | PRODUCT_CATEGORY |
     * SHIPPING_ADDRESS_L1 | SHIPPING_ADDRESS_L2 | SHIPPING_CITY | SHIPPING_COUNTRY | SHIPPING_NAME |
     * SHIPPING_PHONE | SHIPPING_STATE | SHIPPING_ZIP | USERAGENT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-variabletype)
     * @param variableType The type of the variable. For more information see [Variable
     * types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
     * . 
     */
    override fun variableType(variableType: String) {
      cdkBuilder.variableType(variableType)
    }

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnVariable =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.frauddetector.CfnVariable.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVariable {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVariable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnVariable):
        CfnVariable = CfnVariable(cdkObject)

    internal fun unwrap(wrapped: CfnVariable):
        software.amazon.awscdk.services.frauddetector.CfnVariable = wrapped.cdkObject as
        software.amazon.awscdk.services.frauddetector.CfnVariable
  }
}
