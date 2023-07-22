@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.CpuArchitecture
import software.amazon.awscdk.services.ecs.OperatingSystemFamily
import software.amazon.awscdk.services.ecs.RuntimePlatform

@CdkDslMarker
public class RuntimePlatformDsl {
  private val cdkBuilder: RuntimePlatform.Builder = RuntimePlatform.builder()

  /**
   * @param cpuArchitecture The CpuArchitecture for Fargate Runtime Platform.
   */
  public fun cpuArchitecture(cpuArchitecture: CpuArchitecture) {
    cdkBuilder.cpuArchitecture(cpuArchitecture)
  }

  /**
   * @param operatingSystemFamily The operating system for Fargate Runtime Platform.
   */
  public fun operatingSystemFamily(operatingSystemFamily: OperatingSystemFamily) {
    cdkBuilder.operatingSystemFamily(operatingSystemFamily)
  }

  public fun build(): RuntimePlatform = cdkBuilder.build()
}
