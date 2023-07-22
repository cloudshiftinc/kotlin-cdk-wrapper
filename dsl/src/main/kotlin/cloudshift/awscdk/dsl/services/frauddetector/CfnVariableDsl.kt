@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.frauddetector

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.frauddetector.CfnVariable
import software.constructs.Construct

/**
 * Manages a variable.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.frauddetector.*;
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
@CdkDslMarker
public class CfnVariableDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnVariable.Builder = CfnVariable.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
  public fun dataSource(dataSource: String) {
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
  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * The default value of the variable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-defaultvalue)
   * @param defaultValue The default value of the variable. 
   */
  public fun defaultValue(defaultValue: String) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * The description of the variable.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-frauddetector-variable.html#cfn-frauddetector-variable-description)
   * @param description The description of the variable. 
   */
  public fun description(description: String) {
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
  public fun name(name: String) {
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

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
  public fun variableType(variableType: String) {
    cdkBuilder.variableType(variableType)
  }

  public fun build(): CfnVariable {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
