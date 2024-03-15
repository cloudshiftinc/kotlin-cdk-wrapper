@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.frauddetector

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVariable`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.frauddetector.*;
 * CfnVariableProps cfnVariableProps = CfnVariableProps.builder()
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
public interface CfnVariableProps {
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
   */
  public fun dataSource(): String

  /**
   * The data type of the variable.
   *
   * Valid data types: `STRING | INTEGER | BOOLEAN | FLOAT`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-datatype)
   */
  public fun dataType(): String

  /**
   * The default value of the variable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-defaultvalue)
   */
  public fun defaultValue(): String

  /**
   * The description of the variable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the variable.
   *
   * Pattern: `^[0-9a-z_-]+$`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-name)
   */
  public fun name(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
   */
  public fun variableType(): String? = unwrap(this).getVariableType()

  /**
   * A builder for [CfnVariableProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataSource The data source of the variable. 
     * Valid values: `EVENT | EXTERNAL_MODEL_SCORE`
     *
     * When defining a variable within a detector, you can only use the `EVENT` value for DataSource
     * when the *Inline* property is set to true. If the *Inline* property is set false, you can use
     * either `EVENT` or `MODEL_SCORE` for DataSource.
     */
    public fun dataSource(dataSource: String)

    /**
     * @param dataType The data type of the variable. 
     * Valid data types: `STRING | INTEGER | BOOLEAN | FLOAT`
     */
    public fun dataType(dataType: String)

    /**
     * @param defaultValue The default value of the variable. 
     */
    public fun defaultValue(defaultValue: String)

    /**
     * @param description The description of the variable.
     */
    public fun description(description: String)

    /**
     * @param name The name of the variable. 
     * Pattern: `^[0-9a-z_-]+$`
     */
    public fun name(name: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param variableType The type of the variable. For more information see [Variable
     * types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
     * .
     * Valid Values: `AUTH_CODE | AVS | BILLING_ADDRESS_L1 | BILLING_ADDRESS_L2 | BILLING_CITY |
     * BILLING_COUNTRY | BILLING_NAME | BILLING_PHONE | BILLING_STATE | BILLING_ZIP | CARD_BIN |
     * CATEGORICAL | CURRENCY_CODE | EMAIL_ADDRESS | FINGERPRINT | FRAUD_LABEL | FREE_FORM_TEXT |
     * IP_ADDRESS | NUMERIC | ORDER_ID | PAYMENT_TYPE | PHONE_NUMBER | PRICE | PRODUCT_CATEGORY |
     * SHIPPING_ADDRESS_L1 | SHIPPING_ADDRESS_L2 | SHIPPING_CITY | SHIPPING_COUNTRY | SHIPPING_NAME |
     * SHIPPING_PHONE | SHIPPING_STATE | SHIPPING_ZIP | USERAGENT`
     */
    public fun variableType(variableType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.frauddetector.CfnVariableProps.Builder =
        software.amazon.awscdk.services.frauddetector.CfnVariableProps.builder()

    /**
     * @param dataSource The data source of the variable. 
     * Valid values: `EVENT | EXTERNAL_MODEL_SCORE`
     *
     * When defining a variable within a detector, you can only use the `EVENT` value for DataSource
     * when the *Inline* property is set to true. If the *Inline* property is set false, you can use
     * either `EVENT` or `MODEL_SCORE` for DataSource.
     */
    override fun dataSource(dataSource: String) {
      cdkBuilder.dataSource(dataSource)
    }

    /**
     * @param dataType The data type of the variable. 
     * Valid data types: `STRING | INTEGER | BOOLEAN | FLOAT`
     */
    override fun dataType(dataType: String) {
      cdkBuilder.dataType(dataType)
    }

    /**
     * @param defaultValue The default value of the variable. 
     */
    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    /**
     * @param description The description of the variable.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the variable. 
     * Pattern: `^[0-9a-z_-]+$`
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param variableType The type of the variable. For more information see [Variable
     * types](https://docs.aws.amazon.com/frauddetector/latest/ug/create-a-variable.html#variable-types)
     * .
     * Valid Values: `AUTH_CODE | AVS | BILLING_ADDRESS_L1 | BILLING_ADDRESS_L2 | BILLING_CITY |
     * BILLING_COUNTRY | BILLING_NAME | BILLING_PHONE | BILLING_STATE | BILLING_ZIP | CARD_BIN |
     * CATEGORICAL | CURRENCY_CODE | EMAIL_ADDRESS | FINGERPRINT | FRAUD_LABEL | FREE_FORM_TEXT |
     * IP_ADDRESS | NUMERIC | ORDER_ID | PAYMENT_TYPE | PHONE_NUMBER | PRICE | PRODUCT_CATEGORY |
     * SHIPPING_ADDRESS_L1 | SHIPPING_ADDRESS_L2 | SHIPPING_CITY | SHIPPING_COUNTRY | SHIPPING_NAME |
     * SHIPPING_PHONE | SHIPPING_STATE | SHIPPING_ZIP | USERAGENT`
     */
    override fun variableType(variableType: String) {
      cdkBuilder.variableType(variableType)
    }

    public fun build(): software.amazon.awscdk.services.frauddetector.CfnVariableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.frauddetector.CfnVariableProps,
  ) : CdkObject(cdkObject), CfnVariableProps {
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
     */
    override fun dataSource(): String = unwrap(this).getDataSource()

    /**
     * The data type of the variable.
     *
     * Valid data types: `STRING | INTEGER | BOOLEAN | FLOAT`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-datatype)
     */
    override fun dataType(): String = unwrap(this).getDataType()

    /**
     * The default value of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-defaultvalue)
     */
    override fun defaultValue(): String = unwrap(this).getDefaultValue()

    /**
     * The description of the variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the variable.
     *
     * Pattern: `^[0-9a-z_-]+$`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     */
    override fun variableType(): String? = unwrap(this).getVariableType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVariableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.frauddetector.CfnVariableProps):
        CfnVariableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVariableProps):
        software.amazon.awscdk.services.frauddetector.CfnVariableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.frauddetector.CfnVariableProps
  }
}
