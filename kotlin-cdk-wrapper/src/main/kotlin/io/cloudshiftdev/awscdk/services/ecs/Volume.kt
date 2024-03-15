@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface Volume {
  public fun configuredAtLaunch(): Boolean? = unwrap(this).getConfiguredAtLaunch()

  public fun dockerVolumeConfiguration(): DockerVolumeConfiguration? =
      unwrap(this).getDockerVolumeConfiguration()?.let(DockerVolumeConfiguration::wrap)

  public fun efsVolumeConfiguration(): EfsVolumeConfiguration? =
      unwrap(this).getEfsVolumeConfiguration()?.let(EfsVolumeConfiguration::wrap)

  public fun host(): Host? = unwrap(this).getHost()?.let(Host::wrap)

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun configuredAtLaunch(configuredAtLaunch: Boolean)

    public fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f047a4c374e3eba7acf19a6828c9c8bfde1ef12b1af4dbcc7c1df3ad284ae9e3")
    public
        fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfiguration.Builder.() -> Unit)

    public fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfiguration)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("982c162fa79f15e1fcfd518c32b2b5424089a1efb1dc478723b6679c9d27d95c")
    public
        fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfiguration.Builder.() -> Unit)

    public fun host(host: Host)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05f1a0b5c066a7f46da0fce9f3cdc97f7f91205274cae381cf6657260d4bf39")
    public fun host(host: Host.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Volume.Builder =
        software.amazon.awscdk.services.ecs.Volume.builder()

    override fun configuredAtLaunch(configuredAtLaunch: Boolean) {
      cdkBuilder.configuredAtLaunch(configuredAtLaunch)
    }

    override fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfiguration) {
      cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration.let(DockerVolumeConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f047a4c374e3eba7acf19a6828c9c8bfde1ef12b1af4dbcc7c1df3ad284ae9e3")
    override
        fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfiguration.Builder.() -> Unit):
        Unit = dockerVolumeConfiguration(DockerVolumeConfiguration(dockerVolumeConfiguration))

    override fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfiguration) {
      cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(EfsVolumeConfiguration::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("982c162fa79f15e1fcfd518c32b2b5424089a1efb1dc478723b6679c9d27d95c")
    override
        fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfiguration.Builder.() -> Unit):
        Unit = efsVolumeConfiguration(EfsVolumeConfiguration(efsVolumeConfiguration))

    override fun host(host: Host) {
      cdkBuilder.host(host.let(Host::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05f1a0b5c066a7f46da0fce9f3cdc97f7f91205274cae381cf6657260d4bf39")
    override fun host(host: Host.Builder.() -> Unit): Unit = host(Host(host))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.ecs.Volume = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.Volume,
  ) : CdkObject(cdkObject), Volume {
    override fun configuredAtLaunch(): Boolean? = unwrap(this).getConfiguredAtLaunch()

    override fun dockerVolumeConfiguration(): DockerVolumeConfiguration? =
        unwrap(this).getDockerVolumeConfiguration()?.let(DockerVolumeConfiguration::wrap)

    override fun efsVolumeConfiguration(): EfsVolumeConfiguration? =
        unwrap(this).getEfsVolumeConfiguration()?.let(EfsVolumeConfiguration::wrap)

    override fun host(): Host? = unwrap(this).getHost()?.let(Host::wrap)

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Volume {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.Volume): Volume =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Volume): software.amazon.awscdk.services.ecs.Volume = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.Volume
  }
}
