@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * The `StringAttributeConstraints` property type defines the string attribute constraints of an
 * Amazon Cognito user pool.
 *
 * `StringAttributeConstraints` is a subproperty of the
 * [SchemaAttribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-schemaattribute.html)
 * property type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * StringAttributeConstraintsProperty stringAttributeConstraintsProperty =
 * StringAttributeConstraintsProperty.builder()
 * .maxLength("maxLength")
 * .minLength("minLength")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-stringattributeconstraints.html)
 */
@CdkDslMarker
public class CfnUserPoolStringAttributeConstraintsPropertyDsl {
  private val cdkBuilder: CfnUserPool.StringAttributeConstraintsProperty.Builder =
      CfnUserPool.StringAttributeConstraintsProperty.builder()

  /**
   * @param maxLength The maximum length.
   */
  public fun maxLength(maxLength: String) {
    cdkBuilder.maxLength(maxLength)
  }

  /**
   * @param minLength The minimum length.
   */
  public fun minLength(minLength: String) {
    cdkBuilder.minLength(minLength)
  }

  public fun build(): CfnUserPool.StringAttributeConstraintsProperty = cdkBuilder.build()
}
