@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@CdkDslMarker
public class CfnEC2FleetVCpuCountRangeRequestPropertyDsl {
  private val cdkBuilder: CfnEC2Fleet.VCpuCountRangeRequestProperty.Builder =
      CfnEC2Fleet.VCpuCountRangeRequestProperty.builder()

  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnEC2Fleet.VCpuCountRangeRequestProperty = cdkBuilder.build()
}
