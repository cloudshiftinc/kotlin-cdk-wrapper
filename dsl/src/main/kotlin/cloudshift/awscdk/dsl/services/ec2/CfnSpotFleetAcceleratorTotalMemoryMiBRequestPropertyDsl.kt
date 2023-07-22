@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnSpotFleet

@CdkDslMarker
public class CfnSpotFleetAcceleratorTotalMemoryMiBRequestPropertyDsl {
  private val cdkBuilder: CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty.Builder =
      CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty.builder()

  /**
   * @param max The maximum amount of accelerator memory, in MiB.
   * To specify no maximum limit, omit this parameter.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum amount of accelerator memory, in MiB.
   * To specify no minimum limit, omit this parameter.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnSpotFleet.AcceleratorTotalMemoryMiBRequestProperty = cdkBuilder.build()
}
