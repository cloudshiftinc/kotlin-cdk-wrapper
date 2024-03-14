package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface Volume {
  /**
   * Indicates if the volume should be configured at launch.
   *
   * Default: false
   */
  public fun configuredAtLaunch(): Boolean? = unwrap(this).getConfiguredAtLaunch()

  /**
   * This property is specified when you are using Docker volumes.
   *
   * Docker volumes are only supported when you are using the EC2 launch type.
   * Windows containers only support the use of the local driver.
   * To use bind mounts, specify a host instead.
   */
  public fun dockerVolumeConfiguration(): DockerVolumeConfiguration? =
      unwrap(this).getDockerVolumeConfiguration()?.let(DockerVolumeConfiguration::wrap)

  /**
   * This property is specified when you are using Amazon EFS.
   *
   * When specifying Amazon EFS volumes in tasks using the Fargate launch type,
   * Fargate creates a supervisor container that is responsible for managing the Amazon EFS volume.
   * The supervisor container uses a small amount of the task's memory.
   * The supervisor container is visible when querying the task metadata version 4 endpoint,
   * but is not visible in CloudWatch Container Insights.
   *
   * Default: No Elastic FileSystem is setup
   */
  public fun efsVolumeConfiguration(): EfsVolumeConfiguration? =
      unwrap(this).getEfsVolumeConfiguration()?.let(EfsVolumeConfiguration::wrap)

  /**
   * This property is specified when you are using bind mount host volumes.
   *
   * Bind mount host volumes are supported when you are using either the EC2 or Fargate launch
   * types.
   * The contents of the host parameter determine whether your bind mount host volume persists on
   * the
   * host container instance and where it is stored. If the host parameter is empty, then the Docker
   * daemon assigns a host path for your data volume. However, the data is not guaranteed to persist
   * after the containers associated with it stop running.
   */
  public fun host(): Host? = unwrap(this).getHost()?.let(Host::wrap)

  /**
   * The name of the volume.
   *
   * Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed.
   * This name is referenced in the sourceVolume parameter of container definition mountPoints.
   */
  public fun name(): String

  /**
   * A builder for [Volume]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configuredAtLaunch Indicates if the volume should be configured at launch.
     */
    public fun configuredAtLaunch(configuredAtLaunch: Boolean)

    /**
     * @param dockerVolumeConfiguration This property is specified when you are using Docker
     * volumes.
     * Docker volumes are only supported when you are using the EC2 launch type.
     * Windows containers only support the use of the local driver.
     * To use bind mounts, specify a host instead.
     */
    public fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfiguration)

    /**
     * @param dockerVolumeConfiguration This property is specified when you are using Docker
     * volumes.
     * Docker volumes are only supported when you are using the EC2 launch type.
     * Windows containers only support the use of the local driver.
     * To use bind mounts, specify a host instead.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f047a4c374e3eba7acf19a6828c9c8bfde1ef12b1af4dbcc7c1df3ad284ae9e3")
    public
        fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfiguration.Builder.() -> Unit)

    /**
     * @param efsVolumeConfiguration This property is specified when you are using Amazon EFS.
     * When specifying Amazon EFS volumes in tasks using the Fargate launch type,
     * Fargate creates a supervisor container that is responsible for managing the Amazon EFS
     * volume.
     * The supervisor container uses a small amount of the task's memory.
     * The supervisor container is visible when querying the task metadata version 4 endpoint,
     * but is not visible in CloudWatch Container Insights.
     */
    public fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfiguration)

    /**
     * @param efsVolumeConfiguration This property is specified when you are using Amazon EFS.
     * When specifying Amazon EFS volumes in tasks using the Fargate launch type,
     * Fargate creates a supervisor container that is responsible for managing the Amazon EFS
     * volume.
     * The supervisor container uses a small amount of the task's memory.
     * The supervisor container is visible when querying the task metadata version 4 endpoint,
     * but is not visible in CloudWatch Container Insights.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("982c162fa79f15e1fcfd518c32b2b5424089a1efb1dc478723b6679c9d27d95c")
    public
        fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfiguration.Builder.() -> Unit)

    /**
     * @param host This property is specified when you are using bind mount host volumes.
     * Bind mount host volumes are supported when you are using either the EC2 or Fargate launch
     * types.
     * The contents of the host parameter determine whether your bind mount host volume persists on
     * the
     * host container instance and where it is stored. If the host parameter is empty, then the
     * Docker
     * daemon assigns a host path for your data volume. However, the data is not guaranteed to
     * persist
     * after the containers associated with it stop running.
     */
    public fun host(host: Host)

    /**
     * @param host This property is specified when you are using bind mount host volumes.
     * Bind mount host volumes are supported when you are using either the EC2 or Fargate launch
     * types.
     * The contents of the host parameter determine whether your bind mount host volume persists on
     * the
     * host container instance and where it is stored. If the host parameter is empty, then the
     * Docker
     * daemon assigns a host path for your data volume. However, the data is not guaranteed to
     * persist
     * after the containers associated with it stop running.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05f1a0b5c066a7f46da0fce9f3cdc97f7f91205274cae381cf6657260d4bf39")
    public fun host(host: Host.Builder.() -> Unit)

    /**
     * @param name The name of the volume. 
     * Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed.
     * This name is referenced in the sourceVolume parameter of container definition mountPoints.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.Volume.Builder =
        software.amazon.awscdk.services.ecs.Volume.builder()

    /**
     * @param configuredAtLaunch Indicates if the volume should be configured at launch.
     */
    override fun configuredAtLaunch(configuredAtLaunch: Boolean) {
      cdkBuilder.configuredAtLaunch(configuredAtLaunch)
    }

    /**
     * @param dockerVolumeConfiguration This property is specified when you are using Docker
     * volumes.
     * Docker volumes are only supported when you are using the EC2 launch type.
     * Windows containers only support the use of the local driver.
     * To use bind mounts, specify a host instead.
     */
    override fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfiguration) {
      cdkBuilder.dockerVolumeConfiguration(dockerVolumeConfiguration.let(DockerVolumeConfiguration::unwrap))
    }

    /**
     * @param dockerVolumeConfiguration This property is specified when you are using Docker
     * volumes.
     * Docker volumes are only supported when you are using the EC2 launch type.
     * Windows containers only support the use of the local driver.
     * To use bind mounts, specify a host instead.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f047a4c374e3eba7acf19a6828c9c8bfde1ef12b1af4dbcc7c1df3ad284ae9e3")
    override
        fun dockerVolumeConfiguration(dockerVolumeConfiguration: DockerVolumeConfiguration.Builder.() -> Unit):
        Unit = dockerVolumeConfiguration(DockerVolumeConfiguration(dockerVolumeConfiguration))

    /**
     * @param efsVolumeConfiguration This property is specified when you are using Amazon EFS.
     * When specifying Amazon EFS volumes in tasks using the Fargate launch type,
     * Fargate creates a supervisor container that is responsible for managing the Amazon EFS
     * volume.
     * The supervisor container uses a small amount of the task's memory.
     * The supervisor container is visible when querying the task metadata version 4 endpoint,
     * but is not visible in CloudWatch Container Insights.
     */
    override fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfiguration) {
      cdkBuilder.efsVolumeConfiguration(efsVolumeConfiguration.let(EfsVolumeConfiguration::unwrap))
    }

    /**
     * @param efsVolumeConfiguration This property is specified when you are using Amazon EFS.
     * When specifying Amazon EFS volumes in tasks using the Fargate launch type,
     * Fargate creates a supervisor container that is responsible for managing the Amazon EFS
     * volume.
     * The supervisor container uses a small amount of the task's memory.
     * The supervisor container is visible when querying the task metadata version 4 endpoint,
     * but is not visible in CloudWatch Container Insights.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("982c162fa79f15e1fcfd518c32b2b5424089a1efb1dc478723b6679c9d27d95c")
    override
        fun efsVolumeConfiguration(efsVolumeConfiguration: EfsVolumeConfiguration.Builder.() -> Unit):
        Unit = efsVolumeConfiguration(EfsVolumeConfiguration(efsVolumeConfiguration))

    /**
     * @param host This property is specified when you are using bind mount host volumes.
     * Bind mount host volumes are supported when you are using either the EC2 or Fargate launch
     * types.
     * The contents of the host parameter determine whether your bind mount host volume persists on
     * the
     * host container instance and where it is stored. If the host parameter is empty, then the
     * Docker
     * daemon assigns a host path for your data volume. However, the data is not guaranteed to
     * persist
     * after the containers associated with it stop running.
     */
    override fun host(host: Host) {
      cdkBuilder.host(host.let(Host::unwrap))
    }

    /**
     * @param host This property is specified when you are using bind mount host volumes.
     * Bind mount host volumes are supported when you are using either the EC2 or Fargate launch
     * types.
     * The contents of the host parameter determine whether your bind mount host volume persists on
     * the
     * host container instance and where it is stored. If the host parameter is empty, then the
     * Docker
     * daemon assigns a host path for your data volume. However, the data is not guaranteed to
     * persist
     * after the containers associated with it stop running.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b05f1a0b5c066a7f46da0fce9f3cdc97f7f91205274cae381cf6657260d4bf39")
    override fun host(host: Host.Builder.() -> Unit): Unit = host(Host(host))

    /**
     * @param name The name of the volume. 
     * Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed.
     * This name is referenced in the sourceVolume parameter of container definition mountPoints.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.ecs.Volume = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.Volume,
  ) : CdkObject(cdkObject), Volume {
    /**
     * Indicates if the volume should be configured at launch.
     *
     * Default: false
     */
    override fun configuredAtLaunch(): Boolean? = unwrap(this).getConfiguredAtLaunch()

    /**
     * This property is specified when you are using Docker volumes.
     *
     * Docker volumes are only supported when you are using the EC2 launch type.
     * Windows containers only support the use of the local driver.
     * To use bind mounts, specify a host instead.
     */
    override fun dockerVolumeConfiguration(): DockerVolumeConfiguration? =
        unwrap(this).getDockerVolumeConfiguration()?.let(DockerVolumeConfiguration::wrap)

    /**
     * This property is specified when you are using Amazon EFS.
     *
     * When specifying Amazon EFS volumes in tasks using the Fargate launch type,
     * Fargate creates a supervisor container that is responsible for managing the Amazon EFS
     * volume.
     * The supervisor container uses a small amount of the task's memory.
     * The supervisor container is visible when querying the task metadata version 4 endpoint,
     * but is not visible in CloudWatch Container Insights.
     *
     * Default: No Elastic FileSystem is setup
     */
    override fun efsVolumeConfiguration(): EfsVolumeConfiguration? =
        unwrap(this).getEfsVolumeConfiguration()?.let(EfsVolumeConfiguration::wrap)

    /**
     * This property is specified when you are using bind mount host volumes.
     *
     * Bind mount host volumes are supported when you are using either the EC2 or Fargate launch
     * types.
     * The contents of the host parameter determine whether your bind mount host volume persists on
     * the
     * host container instance and where it is stored. If the host parameter is empty, then the
     * Docker
     * daemon assigns a host path for your data volume. However, the data is not guaranteed to
     * persist
     * after the containers associated with it stop running.
     */
    override fun host(): Host? = unwrap(this).getHost()?.let(Host::wrap)

    /**
     * The name of the volume.
     *
     * Up to 255 letters (uppercase and lowercase), numbers, and hyphens are allowed.
     * This name is referenced in the sourceVolume parameter of container definition mountPoints.
     */
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
