@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CustomAttributeConfig
import software.amazon.awscdk.services.cognito.NumberAttributeConstraints
import software.amazon.awscdk.services.cognito.StringAttributeConstraints

/**
 * Configuration that will be fed into CloudFormation for any custom attribute type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CustomAttributeConfig customAttributeConfig = CustomAttributeConfig.builder()
 * .dataType("dataType")
 * // the properties below are optional
 * .mutable(false)
 * .numberConstraints(NumberAttributeConstraints.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .stringConstraints(StringAttributeConstraints.builder()
 * .maxLen(123)
 * .minLen(123)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class CustomAttributeConfigDsl {
  private val cdkBuilder: CustomAttributeConfig.Builder = CustomAttributeConfig.builder()

  /**
   * @param dataType The data type of the custom attribute. 
   */
  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param mutable Specifies whether the value of the attribute can be changed.
   * For any user pool attribute that's mapped to an identity provider attribute, you must set this
   * parameter to true.
   * Amazon Cognito updates mapped attributes when users sign in to your application through an
   * identity provider.
   * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
   * attribute.
   */
  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  /**
   * @param numberConstraints The constraints for a custom attribute of the 'Number' data type.
   */
  public fun numberConstraints(numberConstraints: NumberAttributeConstraintsDsl.() -> Unit = {}) {
    val builder = NumberAttributeConstraintsDsl()
    builder.apply(numberConstraints)
    cdkBuilder.numberConstraints(builder.build())
  }

  /**
   * @param numberConstraints The constraints for a custom attribute of the 'Number' data type.
   */
  public fun numberConstraints(numberConstraints: NumberAttributeConstraints) {
    cdkBuilder.numberConstraints(numberConstraints)
  }

  /**
   * @param stringConstraints The constraints for a custom attribute of 'String' data type.
   */
  public fun stringConstraints(stringConstraints: StringAttributeConstraintsDsl.() -> Unit = {}) {
    val builder = StringAttributeConstraintsDsl()
    builder.apply(stringConstraints)
    cdkBuilder.stringConstraints(builder.build())
  }

  /**
   * @param stringConstraints The constraints for a custom attribute of 'String' data type.
   */
  public fun stringConstraints(stringConstraints: StringAttributeConstraints) {
    cdkBuilder.stringConstraints(stringConstraints)
  }

  public fun build(): CustomAttributeConfig = cdkBuilder.build()
}
