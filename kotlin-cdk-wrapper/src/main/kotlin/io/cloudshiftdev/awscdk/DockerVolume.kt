@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface DockerVolume {
  public fun consistency(): DockerVolumeConsistency? =
      unwrap(this).getConsistency()?.let(DockerVolumeConsistency::wrap)

  public fun containerPath(): String

  public fun hostPath(): String

  @CdkDslMarker
  public interface Builder {
    public fun consistency(consistency: DockerVolumeConsistency)

    public fun containerPath(containerPath: String)

    public fun hostPath(hostPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DockerVolume.Builder =
        software.amazon.awscdk.DockerVolume.builder()

    override fun consistency(consistency: DockerVolumeConsistency) {
      cdkBuilder.consistency(consistency.let(DockerVolumeConsistency::unwrap))
    }

    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
    }

    public fun build(): software.amazon.awscdk.DockerVolume = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.DockerVolume,
  ) : CdkObject(cdkObject), DockerVolume {
    override fun consistency(): DockerVolumeConsistency? =
        unwrap(this).getConsistency()?.let(DockerVolumeConsistency::wrap)

    override fun containerPath(): String = unwrap(this).getContainerPath()

    override fun hostPath(): String = unwrap(this).getHostPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerVolume {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerVolume): DockerVolume =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerVolume): software.amazon.awscdk.DockerVolume = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.DockerVolume
  }
}
