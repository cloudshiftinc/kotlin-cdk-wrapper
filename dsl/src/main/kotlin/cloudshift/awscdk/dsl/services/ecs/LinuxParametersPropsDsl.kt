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

  /**
   * @param initProcessEnabled Specifies whether to run an init process inside the container that
   * forwards signals and reaps processes.
   */
  public fun initProcessEnabled(initProcessEnabled: Boolean) {
    cdkBuilder.initProcessEnabled(initProcessEnabled)
  }

  /**
   * @param maxSwap The total amount of swap memory a container can use.
   * This parameter
   * will be translated to the --memory-swap option to docker run.
   *
   * This parameter is only supported when you are using the EC2 launch type.
   * Accepted values are positive integers.
   */
  public fun maxSwap(maxSwap: Size) {
    cdkBuilder.maxSwap(maxSwap)
  }

  /**
   * @param sharedMemorySize The value for the size of the /dev/shm volume.
   */
  public fun sharedMemorySize(sharedMemorySize: Number) {
    cdkBuilder.sharedMemorySize(sharedMemorySize)
  }

  /**
   * @param swappiness This allows you to tune a container's memory swappiness behavior.
   * This parameter
   * maps to the --memory-swappiness option to docker run. The swappiness relates
   * to the kernel's tendency to swap memory. A value of 0 will cause swapping to
   * not happen unless absolutely necessary. A value of 100 will cause pages to
   * be swapped very aggressively.
   *
   * This parameter is only supported when you are using the EC2 launch type.
   * Accepted values are whole numbers between 0 and 100. If a value is not
   * specified for maxSwap then this parameter is ignored.
   */
  public fun swappiness(swappiness: Number) {
    cdkBuilder.swappiness(swappiness)
  }

  public fun build(): LinuxParametersProps = cdkBuilder.build()
}
