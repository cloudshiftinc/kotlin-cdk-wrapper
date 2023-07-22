@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnInstance

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
