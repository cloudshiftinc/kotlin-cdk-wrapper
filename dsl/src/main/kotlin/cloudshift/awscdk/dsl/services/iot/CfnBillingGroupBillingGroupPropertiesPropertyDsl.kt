@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnBillingGroup

/**
 * The properties of a billing group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * BillingGroupPropertiesProperty billingGroupPropertiesProperty =
 * BillingGroupPropertiesProperty.builder()
 * .billingGroupDescription("billingGroupDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-billinggroup-billinggroupproperties.html)
 */
@CdkDslMarker
public class CfnBillingGroupBillingGroupPropertiesPropertyDsl {
  private val cdkBuilder: CfnBillingGroup.BillingGroupPropertiesProperty.Builder =
      CfnBillingGroup.BillingGroupPropertiesProperty.builder()

  /**
   * @param billingGroupDescription The description of the billing group.
   */
  public fun billingGroupDescription(billingGroupDescription: String) {
    cdkBuilder.billingGroupDescription(billingGroupDescription)
  }

  public fun build(): CfnBillingGroup.BillingGroupPropertiesProperty = cdkBuilder.build()
}
