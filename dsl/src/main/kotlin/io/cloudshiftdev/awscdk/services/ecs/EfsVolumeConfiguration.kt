package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface EfsVolumeConfiguration {
  /**
   * The authorization configuration details for the Amazon EFS file system.
   *
   * Default: No configuration.
   */
  public fun authorizationConfig(): AuthorizationConfig? =
      unwrap(this).getAuthorizationConfig()?.let(AuthorizationConfig::wrap)

  /**
   * The Amazon EFS file system ID to use.
   */
  public fun fileSystemId(): String

  /**
   * The directory within the Amazon EFS file system to mount as the root directory inside the host.
   *
   * Specifying / will have the same effect as omitting this parameter.
   *
   * Default: The root of the Amazon EFS volume
   */
  public fun rootDirectory(): String? = unwrap(this).getRootDirectory()

  /**
   * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS host
   * and the Amazon EFS server.
   *
   * Transit encryption must be enabled if Amazon EFS IAM authorization is used.
   *
   * Valid values: ENABLED | DISABLED
   *
   * Default: DISABLED
   */
  public fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

  /**
   * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS
   * server.
   *
   * EFS mount helper uses.
   *
   * Default: Port selection strategy that the Amazon EFS mount helper uses.
   */
  public fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

  /**
   * A builder for [EfsVolumeConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizationConfig The authorization configuration details for the Amazon EFS file
     * system.
     */
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig)

    /**
     * @param authorizationConfig The authorization configuration details for the Amazon EFS file
     * system.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80a8c257fd515eb33be01d31bda37823a6289b072ab0c2f096de3cfce94dd8eb")
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit)

    /**
     * @param fileSystemId The Amazon EFS file system ID to use. 
     */
    public fun fileSystemId(fileSystemId: String)

    /**
     * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
     * directory inside the host.
     * Specifying / will have the same effect as omitting this parameter.
     */
    public fun rootDirectory(rootDirectory: String)

    /**
     * @param transitEncryption Whether or not to enable encryption for Amazon EFS data in transit
     * between the Amazon ECS host and the Amazon EFS server.
     * Transit encryption must be enabled if Amazon EFS IAM authorization is used.
     *
     * Valid values: ENABLED | DISABLED
     */
    public fun transitEncryption(transitEncryption: String)

    /**
     * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
     * ECS host and the Amazon EFS server.
     * EFS mount helper uses.
     */
    public fun transitEncryptionPort(transitEncryptionPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.EfsVolumeConfiguration.Builder =
        software.amazon.awscdk.services.ecs.EfsVolumeConfiguration.builder()

    /**
     * @param authorizationConfig The authorization configuration details for the Amazon EFS file
     * system.
     */
    override fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfig::unwrap))
    }

    /**
     * @param authorizationConfig The authorization configuration details for the Amazon EFS file
     * system.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80a8c257fd515eb33be01d31bda37823a6289b072ab0c2f096de3cfce94dd8eb")
    override fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit):
        Unit = authorizationConfig(AuthorizationConfig(authorizationConfig))

    /**
     * @param fileSystemId The Amazon EFS file system ID to use. 
     */
    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    /**
     * @param rootDirectory The directory within the Amazon EFS file system to mount as the root
     * directory inside the host.
     * Specifying / will have the same effect as omitting this parameter.
     */
    override fun rootDirectory(rootDirectory: String) {
      cdkBuilder.rootDirectory(rootDirectory)
    }

    /**
     * @param transitEncryption Whether or not to enable encryption for Amazon EFS data in transit
     * between the Amazon ECS host and the Amazon EFS server.
     * Transit encryption must be enabled if Amazon EFS IAM authorization is used.
     *
     * Valid values: ENABLED | DISABLED
     */
    override fun transitEncryption(transitEncryption: String) {
      cdkBuilder.transitEncryption(transitEncryption)
    }

    /**
     * @param transitEncryptionPort The port to use when sending encrypted data between the Amazon
     * ECS host and the Amazon EFS server.
     * EFS mount helper uses.
     */
    override fun transitEncryptionPort(transitEncryptionPort: Number) {
      cdkBuilder.transitEncryptionPort(transitEncryptionPort)
    }

    public fun build(): software.amazon.awscdk.services.ecs.EfsVolumeConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.EfsVolumeConfiguration,
  ) : EfsVolumeConfiguration {
    /**
     * The authorization configuration details for the Amazon EFS file system.
     *
     * Default: No configuration.
     */
    override fun authorizationConfig(): AuthorizationConfig? =
        unwrap(this).getAuthorizationConfig()?.let(AuthorizationConfig::wrap)

    /**
     * The Amazon EFS file system ID to use.
     */
    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    /**
     * The directory within the Amazon EFS file system to mount as the root directory inside the
     * host.
     *
     * Specifying / will have the same effect as omitting this parameter.
     *
     * Default: The root of the Amazon EFS volume
     */
    override fun rootDirectory(): String? = unwrap(this).getRootDirectory()

    /**
     * Whether or not to enable encryption for Amazon EFS data in transit between the Amazon ECS
     * host and the Amazon EFS server.
     *
     * Transit encryption must be enabled if Amazon EFS IAM authorization is used.
     *
     * Valid values: ENABLED | DISABLED
     *
     * Default: DISABLED
     */
    override fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

    /**
     * The port to use when sending encrypted data between the Amazon ECS host and the Amazon EFS
     * server.
     *
     * EFS mount helper uses.
     *
     * Default: Port selection strategy that the Amazon EFS mount helper uses.
     */
    override fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EfsVolumeConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EfsVolumeConfiguration):
        EfsVolumeConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EfsVolumeConfiguration):
        software.amazon.awscdk.services.ecs.EfsVolumeConfiguration = (wrapped as Wrapper).cdkObject
  }
}
