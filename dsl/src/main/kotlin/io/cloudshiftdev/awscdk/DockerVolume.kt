package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Unit

public interface DockerVolume {
  public fun consistency(): DockerVolumeConsistency? =
      unwrap(this).getConsistency()?.let(DockerVolumeConsistency::wrap)

  public fun containerPath(): String

  public fun hostPath(): String

  public interface Builder {
    public fun consistency(consistency: DockerVolumeConsistency) {
    }

    public fun containerPath(containerPath: String) {
    }

    public fun hostPath(hostPath: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.DockerVolume.Builder =
        software.amazon.awscdk.DockerVolume.builder()

    public override fun consistency(consistency: DockerVolumeConsistency) {
      cdkBuilder.consistency(consistency.let(DockerVolumeConsistency::unwrap))
    }

    public override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    public override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
    }

    public fun build(): software.amazon.awscdk.DockerVolume = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.DockerVolume,
  ) : DockerVolume {
    public override fun consistency(): DockerVolumeConsistency? =
        unwrap(this).getConsistency()?.let(DockerVolumeConsistency::wrap)

    public override fun containerPath(): String = unwrap(this).getContainerPath()

    public override fun hostPath(): String = unwrap(this).getHostPath()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DockerVolume {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.DockerVolume): DockerVolume =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerVolume): software.amazon.awscdk.DockerVolume = (wrapped as
        Wrapper).cdkObject
  }
}
