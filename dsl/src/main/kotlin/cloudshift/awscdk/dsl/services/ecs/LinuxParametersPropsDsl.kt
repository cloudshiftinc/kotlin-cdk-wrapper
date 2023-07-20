@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.ecs.LinuxParametersProps

@CdkDslMarker
public class LinuxParametersPropsDsl {
  private val cdkBuilder: LinuxParametersProps.Builder = LinuxParametersProps.builder()

  public fun initProcessEnabled(initProcessEnabled: Boolean) {
    cdkBuilder.initProcessEnabled(initProcessEnabled)
  }

  public fun maxSwap(maxSwap: Size) {
    cdkBuilder.maxSwap(maxSwap)
  }

  public fun sharedMemorySize(sharedMemorySize: Number) {
    cdkBuilder.sharedMemorySize(sharedMemorySize)
  }

  public fun swappiness(swappiness: Number) {
    cdkBuilder.swappiness(swappiness)
  }

  public fun build(): LinuxParametersProps = cdkBuilder.build()
}
