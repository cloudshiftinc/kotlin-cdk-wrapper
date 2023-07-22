@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.ec2.CfnInstance

@CdkDslMarker
public class CfnInstanceCpuOptionsPropertyDsl {
  private val cdkBuilder: CfnInstance.CpuOptionsProperty.Builder =
      CfnInstance.CpuOptionsProperty.builder()

  /**
   * @param coreCount The number of CPU cores for the instance.
   */
  public fun coreCount(coreCount: Number) {
    cdkBuilder.coreCount(coreCount)
  }

  /**
   * @param threadsPerCore The number of threads per CPU core.
   */
  public fun threadsPerCore(threadsPerCore: Number) {
    cdkBuilder.threadsPerCore(threadsPerCore)
  }

  public fun build(): CfnInstance.CpuOptionsProperty = cdkBuilder.build()
}
