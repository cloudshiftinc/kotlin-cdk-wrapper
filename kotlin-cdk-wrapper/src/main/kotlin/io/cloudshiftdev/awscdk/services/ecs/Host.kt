@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The details on a container instance bind mount host volume.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * Host host = Host.builder()
 * .sourcePath("sourcePath")
 * .build();
 * ```
 */
public interface Host {
  /**
   * Specifies the path on the host container instance that is presented to the container.
   *
   * If the sourcePath value does not exist on the host container instance, the Docker daemon
   * creates it.
   * If the location does exist, the contents of the source path folder are exported.
   *
   * This property is not supported for tasks that use the Fargate launch type.
   */
  public fun sourcePath(): String? = unwrap(this).getSourcePath()

  /**
   * A builder for [Host]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param sourcePath Specifies the path on the host container instance that is presented to the
     * container.
     * If the sourcePath value does not exist on the host container instance, the Docker daemon
     * creates it.
     * If the location does exist, the contents of the source path folder are exported.
     *
     * This property is not supported for tasks that use the Fargate launch type.
     */
    public fun sourcePath(sourcePath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Host.Builder =
        software.amazon.awscdk.services.ecs.Host.builder()

    /**
     * @param sourcePath Specifies the path on the host container instance that is presented to the
     * container.
     * If the sourcePath value does not exist on the host container instance, the Docker daemon
     * creates it.
     * If the location does exist, the contents of the source path folder are exported.
     *
     * This property is not supported for tasks that use the Fargate launch type.
     */
    override fun sourcePath(sourcePath: String) {
      cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): software.amazon.awscdk.services.ecs.Host = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.Host,
  ) : CdkObject(cdkObject), Host {
    /**
     * Specifies the path on the host container instance that is presented to the container.
     *
     * If the sourcePath value does not exist on the host container instance, the Docker daemon
     * creates it.
     * If the location does exist, the contents of the source path folder are exported.
     *
     * This property is not supported for tasks that use the Fargate launch type.
     */
    override fun sourcePath(): String? = unwrap(this).getSourcePath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Host {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Host): Host =
        CdkObjectWrappers.wrap(cdkObject) as? Host ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Host): software.amazon.awscdk.services.ecs.Host = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.Host
  }
}
