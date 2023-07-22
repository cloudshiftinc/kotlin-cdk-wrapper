@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnInstance

/**
 * `MonthlyTransfer` is a property of the
 * [Networking](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-networking.html)
 * property. It describes the amount of allocated monthly data transfer (in GB) for an instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * MonthlyTransferProperty monthlyTransferProperty = MonthlyTransferProperty.builder()
 * .gbPerMonthAllocated("gbPerMonthAllocated")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-instance-monthlytransfer.html)
 */
@CdkDslMarker
public class CfnInstanceMonthlyTransferPropertyDsl {
  private val cdkBuilder: CfnInstance.MonthlyTransferProperty.Builder =
      CfnInstance.MonthlyTransferProperty.builder()

  /**
   * @param gbPerMonthAllocated The amount of allocated monthly data transfer (in GB) for an
   * instance.
   */
  public fun gbPerMonthAllocated(gbPerMonthAllocated: String) {
    cdkBuilder.gbPerMonthAllocated(gbPerMonthAllocated)
  }

  public fun build(): CfnInstance.MonthlyTransferProperty = cdkBuilder.build()
}
