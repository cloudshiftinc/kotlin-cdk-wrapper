@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface HostVolumeOptions : EcsVolumeOptions {
  public fun hostPath(): String? = unwrap(this).getHostPath()

  @CdkDslMarker
  public interface Builder {
    public fun containerPath(containerPath: String)

    public fun hostPath(hostPath: String)

    public fun name(name: String)

    public fun readonly(readonly: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.HostVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.HostVolumeOptions.builder()

    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    override fun hostPath(hostPath: String) {
      cdkBuilder.hostPath(hostPath)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    public fun build(): software.amazon.awscdk.services.batch.HostVolumeOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.HostVolumeOptions,
  ) : CdkObject(cdkObject), HostVolumeOptions {
    override fun containerPath(): String = unwrap(this).getContainerPath()

    override fun hostPath(): String? = unwrap(this).getHostPath()

    override fun name(): String = unwrap(this).getName()

    override fun readonly(): Boolean? = unwrap(this).getReadonly()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HostVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.HostVolumeOptions):
        HostVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostVolumeOptions):
        software.amazon.awscdk.services.batch.HostVolumeOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.batch.HostVolumeOptions
  }
}
