@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * A Docker volume.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * DockerVolume dockerVolume = DockerVolume.builder()
 * .containerPath("containerPath")
 * .hostPath("hostPath")
 * // the properties below are optional
 * .consistency(DockerVolumeConsistency.CONSISTENT)
 * .build();
 * ```
 */
public interface DockerVolume {
  /**
   * Mount consistency.
   *
   * Only applicable for macOS
   *
   * Default: DockerConsistency.DELEGATED
   *
   * [Documentation](https://docs.docker.com/storage/bind-mounts/#configure-mount-consistency-for-macos)
   */
  public fun consistency(): DockerVolumeConsistency? =
      unwrap(this).getConsistency()?.let(DockerVolumeConsistency::wrap)

  /**
   * The path where the file or directory is mounted in the container.
   */
  public fun containerPath(): String

  /**
   * The path to the file or directory on the host machine.
   */
  public fun hostPath(): String

  /**
   * A builder for [DockerVolume]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param consistency Mount consistency.
     * Only applicable for macOS
     */
    public fun consistency(consistency: DockerVolumeConsistency)

    /**
     * @param containerPath The path where the file or directory is mounted in the container. 
     */
    public fun containerPath(containerPath: String)

    /**
     * @param hostPath The path to the file or directory on the host machine. 
     */
    public fun hostPath(hostPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DockerVolume.Builder =
        software.amazon.awscdk.DockerVolume.builder()

    /**
     * @param consistency Mount consistency.
     * Only applicable for macOS
     */
    override fun consistency(consistency: DockerVolumeConsistency) {
      cdkBuilder.consistency(consistency.let(DockerVolumeConsistency.Companion::unwrap))
    }

    /**
     * @param containerPath The path where the file or directory is mounted in the container. 
     */
    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param hostPath The path to the file or directory on the host machine. 
     */
    override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
    }

    public fun build(): software.amazon.awscdk.DockerVolume = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.DockerVolume,
  ) : CdkObject(cdkObject),
      DockerVolume {
    /**
     * Mount consistency.
     *
     * Only applicable for macOS
     *
     * Default: DockerConsistency.DELEGATED
     *
     * [Documentation](https://docs.docker.com/storage/bind-mounts/#configure-mount-consistency-for-macos)
     */
    override fun consistency(): DockerVolumeConsistency? =
        unwrap(this).getConsistency()?.let(DockerVolumeConsistency::wrap)

    /**
     * The path where the file or directory is mounted in the container.
     */
    override fun containerPath(): String = unwrap(this).getContainerPath()

    /**
     * The path to the file or directory on the host machine.
     */
    override fun hostPath(): String = unwrap(this).getHostPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerVolume {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerVolume): DockerVolume =
        CdkObjectWrappers.wrap(cdkObject) as? DockerVolume ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerVolume): software.amazon.awscdk.DockerVolume = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.DockerVolume
  }
}
