@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPoolUser

/**
 * Specifies whether the attribute is standard or custom.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * AttributeTypeProperty attributeTypeProperty = AttributeTypeProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooluser-attributetype.html)
 */
@CdkDslMarker
public class CfnUserPoolUserAttributeTypePropertyDsl {
  private val cdkBuilder: CfnUserPoolUser.AttributeTypeProperty.Builder =
      CfnUserPoolUser.AttributeTypeProperty.builder()

  /**
   * @param name The name of the attribute.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value The value of the attribute.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnUserPoolUser.AttributeTypeProperty = cdkBuilder.build()
}
