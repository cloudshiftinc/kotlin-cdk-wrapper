@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A container orchestrated by ECS that uses EC2 resources.
 */
public interface IEcsEc2ContainerDefinition : IEcsContainerDefinition {
  /**
   * Add a ulimit to this container.
   *
   * @param ulimit 
   */
  public fun addUlimit(ulimit: Ulimit)

  /**
   * Add a ulimit to this container.
   *
   * @param ulimit 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a0d25fa71c4ef0333f45890e42d61da3c880f3fe8da2e4cc0ad769dfba1854d9")
  public fun addUlimit(ulimit: Ulimit.Builder.() -> Unit)

  /**
   * The number of physical GPUs to reserve for the container.
   *
   * Make sure that the number of GPUs reserved for all containers in a job doesn't exceed
   * the number of available GPUs on the compute resource that the job is launched on.
   *
   * Default: - no gpus
   */
  public fun gpu(): Number? = unwrap(this).getGpu()

  /**
   * When this parameter is true, the container is given elevated permissions on the host container
   * instance (similar to the root user).
   *
   * Default: false
   */
  public fun privileged(): Boolean? = unwrap(this).getPrivileged()

  /**
   * Limits to set for the user this docker container will run as.
   */
  public fun ulimits(): List<Ulimit>

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition):
        IEcsEc2ContainerDefinition = CdkObjectWrappers.wrap(cdkObject) as IEcsEc2ContainerDefinition

    internal fun unwrap(wrapped: IEcsEc2ContainerDefinition):
        software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.IEcsEc2ContainerDefinition
  }
}
