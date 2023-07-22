@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateMemoryMiBPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.MemoryMiBProperty.Builder =
      CfnLaunchTemplate.MemoryMiBProperty.builder()

  /**
   * @param max The maximum amount of memory, in MiB.
   * To specify no maximum limit, omit this parameter.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min The minimum amount of memory, in MiB.
   * To specify no minimum limit, specify `0` .
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): CfnLaunchTemplate.MemoryMiBProperty = cdkBuilder.build()
}
