package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface BundlingOptions {
  /**
   * The access mechanism used to make source files available to the bundling container and to
   * return the bundling output back to the host.
   *
   * Default: - BundlingFileAccess.BIND_MOUNT
   */
  public fun bundlingFileAccess(): BundlingFileAccess? =
      unwrap(this).getBundlingFileAccess()?.let(BundlingFileAccess::wrap)

  /**
   * The command to run in the Docker container.
   *
   * Example value: `['npm', 'install']`
   *
   * Default: - run the command defined in the image
   *
   * [Documentation](https://docs.docker.com/engine/reference/run/)
   */
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * The entrypoint to run in the Docker container.
   *
   * Example value: `['/bin/sh', '-c']`
   *
   * Default: - run the entrypoint defined in the image
   *
   * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
   */
  public fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

  /**
   * The environment variables to pass to the Docker container.
   *
   * Default: - no environment variables.
   */
  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  /**
   * The Docker image where the command will run.
   */
  public fun image(): DockerImage

  /**
   * Local bundling provider.
   *
   * The provider implements a method `tryBundle()` which should return `true`
   * if local bundling was performed. If `false` is returned, docker bundling
   * will be done.
   *
   * Default: - bundling will only be performed in a Docker container
   */
  public fun local(): ILocalBundling? = unwrap(this).getLocal()?.let(ILocalBundling::wrap)

  /**
   * Docker [Networking
   * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
   *
   * Default: - no networking options
   */
  public fun network(): String? = unwrap(this).getNetwork()

  /**
   * The type of output that this bundling operation is producing.
   *
   * Default: BundlingOutput.AUTO_DISCOVER
   */
  public fun outputType(): BundlingOutput? = unwrap(this).getOutputType()?.let(BundlingOutput::wrap)

  /**
   * Platform to build for. *Requires Docker Buildx*.
   *
   * Specify this property to build images on a specific platform.
   *
   * Default: - no platform specified (the current machine architecture will be used)
   */
  public fun platform(): String? = unwrap(this).getPlatform()

  /**
   * [Security configuration](https://docs.docker.com/engine/reference/run/#security-configuration)
   * when running the docker container.
   *
   * Default: - no security options
   */
  public fun securityOpt(): String? = unwrap(this).getSecurityOpt()

  /**
   * The user to use when running the Docker container.
   *
   * user | user:group | uid | uid:gid | user:gid | uid:group
   *
   * Default: - uid:gid of the current user or 1000:1000 on Windows
   *
   * [Documentation](https://docs.docker.com/engine/reference/run/#user)
   */
  public fun user(): String? = unwrap(this).getUser()

  /**
   * Additional Docker volumes to mount.
   *
   * Default: - no additional volumes are mounted
   */
  public fun volumes(): List<DockerVolume> = unwrap(this).getVolumes()?.map(DockerVolume::wrap) ?:
      emptyList()

  /**
   * Where to mount the specified volumes from.
   *
   * Default: - no containers are specified to mount volumes from
   *
   * [Documentation](https://docs.docker.com/engine/reference/commandline/run/#mount-volumes-from-container---volumes-from)
   */
  public fun volumesFrom(): List<String> = unwrap(this).getVolumesFrom() ?: emptyList()

  /**
   * Working directory inside the Docker container.
   *
   * Default: /asset-input
   */
  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  /**
   * A builder for [BundlingOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bundlingFileAccess The access mechanism used to make source files available to the
     * bundling container and to return the bundling output back to the host.
     */
    public fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess)

    /**
     * @param command The command to run in the Docker container.
     * Example value: `['npm', 'install']`
     */
    public fun command(command: List<String>)

    /**
     * @param command The command to run in the Docker container.
     * Example value: `['npm', 'install']`
     */
    public fun command(vararg command: String)

    /**
     * @param entrypoint The entrypoint to run in the Docker container.
     * Example value: `['/bin/sh', '-c']`
     */
    public fun entrypoint(entrypoint: List<String>)

    /**
     * @param entrypoint The entrypoint to run in the Docker container.
     * Example value: `['/bin/sh', '-c']`
     */
    public fun entrypoint(vararg entrypoint: String)

    /**
     * @param environment The environment variables to pass to the Docker container.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param image The Docker image where the command will run. 
     */
    public fun image(image: DockerImage)

    /**
     * @param local Local bundling provider.
     * The provider implements a method `tryBundle()` which should return `true`
     * if local bundling was performed. If `false` is returned, docker bundling
     * will be done.
     */
    public fun local(local: ILocalBundling)

    /**
     * @param network Docker [Networking
     * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
     */
    public fun network(network: String)

    /**
     * @param outputType The type of output that this bundling operation is producing.
     */
    public fun outputType(outputType: BundlingOutput)

    /**
     * @param platform Platform to build for. *Requires Docker Buildx*.
     * Specify this property to build images on a specific platform.
     */
    public fun platform(platform: String)

    /**
     * @param securityOpt [Security
     * configuration](https://docs.docker.com/engine/reference/run/#security-configuration) when
     * running the docker container.
     */
    public fun securityOpt(securityOpt: String)

    /**
     * @param user The user to use when running the Docker container.
     * user | user:group | uid | uid:gid | user:gid | uid:group
     */
    public fun user(user: String)

    /**
     * @param volumes Additional Docker volumes to mount.
     */
    public fun volumes(volumes: List<DockerVolume>)

    /**
     * @param volumes Additional Docker volumes to mount.
     */
    public fun volumes(vararg volumes: DockerVolume)

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    public fun volumesFrom(volumesFrom: List<String>)

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    public fun volumesFrom(vararg volumesFrom: String)

    /**
     * @param workingDirectory Working directory inside the Docker container.
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.BundlingOptions.Builder =
        software.amazon.awscdk.BundlingOptions.builder()

    /**
     * @param bundlingFileAccess The access mechanism used to make source files available to the
     * bundling container and to return the bundling output back to the host.
     */
    override fun bundlingFileAccess(bundlingFileAccess: BundlingFileAccess) {
      cdkBuilder.bundlingFileAccess(bundlingFileAccess.let(BundlingFileAccess::unwrap))
    }

    /**
     * @param command The command to run in the Docker container.
     * Example value: `['npm', 'install']`
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command The command to run in the Docker container.
     * Example value: `['npm', 'install']`
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param entrypoint The entrypoint to run in the Docker container.
     * Example value: `['/bin/sh', '-c']`
     */
    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    /**
     * @param entrypoint The entrypoint to run in the Docker container.
     * Example value: `['/bin/sh', '-c']`
     */
    override fun entrypoint(vararg entrypoint: String): Unit = entrypoint(entrypoint.toList())

    /**
     * @param environment The environment variables to pass to the Docker container.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param image The Docker image where the command will run. 
     */
    override fun image(image: DockerImage) {
      cdkBuilder.image(image.let(DockerImage::unwrap))
    }

    /**
     * @param local Local bundling provider.
     * The provider implements a method `tryBundle()` which should return `true`
     * if local bundling was performed. If `false` is returned, docker bundling
     * will be done.
     */
    override fun local(local: ILocalBundling) {
      cdkBuilder.local(local.let(ILocalBundling::unwrap))
    }

    /**
     * @param network Docker [Networking
     * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
     */
    override fun network(network: String) {
      cdkBuilder.network(network)
    }

    /**
     * @param outputType The type of output that this bundling operation is producing.
     */
    override fun outputType(outputType: BundlingOutput) {
      cdkBuilder.outputType(outputType.let(BundlingOutput::unwrap))
    }

    /**
     * @param platform Platform to build for. *Requires Docker Buildx*.
     * Specify this property to build images on a specific platform.
     */
    override fun platform(platform: String) {
      cdkBuilder.platform(platform)
    }

    /**
     * @param securityOpt [Security
     * configuration](https://docs.docker.com/engine/reference/run/#security-configuration) when
     * running the docker container.
     */
    override fun securityOpt(securityOpt: String) {
      cdkBuilder.securityOpt(securityOpt)
    }

    /**
     * @param user The user to use when running the Docker container.
     * user | user:group | uid | uid:gid | user:gid | uid:group
     */
    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    /**
     * @param volumes Additional Docker volumes to mount.
     */
    override fun volumes(volumes: List<DockerVolume>) {
      cdkBuilder.volumes(volumes.map(DockerVolume::unwrap))
    }

    /**
     * @param volumes Additional Docker volumes to mount.
     */
    override fun volumes(vararg volumes: DockerVolume): Unit = volumes(volumes.toList())

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    override fun volumesFrom(volumesFrom: List<String>) {
      cdkBuilder.volumesFrom(volumesFrom)
    }

    /**
     * @param volumesFrom Where to mount the specified volumes from.
     */
    override fun volumesFrom(vararg volumesFrom: String): Unit = volumesFrom(volumesFrom.toList())

    /**
     * @param workingDirectory Working directory inside the Docker container.
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.BundlingOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.BundlingOptions,
  ) : CdkObject(cdkObject), BundlingOptions {
    /**
     * The access mechanism used to make source files available to the bundling container and to
     * return the bundling output back to the host.
     *
     * Default: - BundlingFileAccess.BIND_MOUNT
     */
    override fun bundlingFileAccess(): BundlingFileAccess? =
        unwrap(this).getBundlingFileAccess()?.let(BundlingFileAccess::wrap)

    /**
     * The command to run in the Docker container.
     *
     * Example value: `['npm', 'install']`
     *
     * Default: - run the command defined in the image
     *
     * [Documentation](https://docs.docker.com/engine/reference/run/)
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The entrypoint to run in the Docker container.
     *
     * Example value: `['/bin/sh', '-c']`
     *
     * Default: - run the entrypoint defined in the image
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     */
    override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    /**
     * The environment variables to pass to the Docker container.
     *
     * Default: - no environment variables.
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * The Docker image where the command will run.
     */
    override fun image(): DockerImage = unwrap(this).getImage().let(DockerImage::wrap)

    /**
     * Local bundling provider.
     *
     * The provider implements a method `tryBundle()` which should return `true`
     * if local bundling was performed. If `false` is returned, docker bundling
     * will be done.
     *
     * Default: - bundling will only be performed in a Docker container
     */
    override fun local(): ILocalBundling? = unwrap(this).getLocal()?.let(ILocalBundling::wrap)

    /**
     * Docker [Networking
     * options](https://docs.docker.com/engine/reference/commandline/run/#connect-a-container-to-a-network---network).
     *
     * Default: - no networking options
     */
    override fun network(): String? = unwrap(this).getNetwork()

    /**
     * The type of output that this bundling operation is producing.
     *
     * Default: BundlingOutput.AUTO_DISCOVER
     */
    override fun outputType(): BundlingOutput? =
        unwrap(this).getOutputType()?.let(BundlingOutput::wrap)

    /**
     * Platform to build for. *Requires Docker Buildx*.
     *
     * Specify this property to build images on a specific platform.
     *
     * Default: - no platform specified (the current machine architecture will be used)
     */
    override fun platform(): String? = unwrap(this).getPlatform()

    /**
     * [Security
     * configuration](https://docs.docker.com/engine/reference/run/#security-configuration) when
     * running the docker container.
     *
     * Default: - no security options
     */
    override fun securityOpt(): String? = unwrap(this).getSecurityOpt()

    /**
     * The user to use when running the Docker container.
     *
     * user | user:group | uid | uid:gid | user:gid | uid:group
     *
     * Default: - uid:gid of the current user or 1000:1000 on Windows
     *
     * [Documentation](https://docs.docker.com/engine/reference/run/#user)
     */
    override fun user(): String? = unwrap(this).getUser()

    /**
     * Additional Docker volumes to mount.
     *
     * Default: - no additional volumes are mounted
     */
    override fun volumes(): List<DockerVolume> = unwrap(this).getVolumes()?.map(DockerVolume::wrap)
        ?: emptyList()

    /**
     * Where to mount the specified volumes from.
     *
     * Default: - no containers are specified to mount volumes from
     *
     * [Documentation](https://docs.docker.com/engine/reference/commandline/run/#mount-volumes-from-container---volumes-from)
     */
    override fun volumesFrom(): List<String> = unwrap(this).getVolumesFrom() ?: emptyList()

    /**
     * Working directory inside the Docker container.
     *
     * Default: /asset-input
     */
    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BundlingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.BundlingOptions): BundlingOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BundlingOptions): software.amazon.awscdk.BundlingOptions = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.BundlingOptions
  }
}
