@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface EfsVolumeConfiguration {
  public fun authorizationConfig(): AuthorizationConfig? =
      unwrap(this).getAuthorizationConfig()?.let(AuthorizationConfig::wrap)

  public fun fileSystemId(): String

  public fun rootDirectory(): String? = unwrap(this).getRootDirectory()

  public fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

  public fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

  @CdkDslMarker
  public interface Builder {
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80a8c257fd515eb33be01d31bda37823a6289b072ab0c2f096de3cfce94dd8eb")
    public fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit)

    public fun fileSystemId(fileSystemId: String)

    public fun rootDirectory(rootDirectory: String)

    public fun transitEncryption(transitEncryption: String)

    public fun transitEncryptionPort(transitEncryptionPort: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.EfsVolumeConfiguration.Builder =
        software.amazon.awscdk.services.ecs.EfsVolumeConfiguration.builder()

    override fun authorizationConfig(authorizationConfig: AuthorizationConfig) {
      cdkBuilder.authorizationConfig(authorizationConfig.let(AuthorizationConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("80a8c257fd515eb33be01d31bda37823a6289b072ab0c2f096de3cfce94dd8eb")
    override fun authorizationConfig(authorizationConfig: AuthorizationConfig.Builder.() -> Unit):
        Unit = authorizationConfig(AuthorizationConfig(authorizationConfig))

    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    override fun rootDirectory(rootDirectory: String) {
      cdkBuilder.rootDirectory(rootDirectory)
    }

    override fun transitEncryption(transitEncryption: String) {
      cdkBuilder.transitEncryption(transitEncryption)
    }

    override fun transitEncryptionPort(transitEncryptionPort: Number) {
      cdkBuilder.transitEncryptionPort(transitEncryptionPort)
    }

    public fun build(): software.amazon.awscdk.services.ecs.EfsVolumeConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.EfsVolumeConfiguration,
  ) : CdkObject(cdkObject), EfsVolumeConfiguration {
    override fun authorizationConfig(): AuthorizationConfig? =
        unwrap(this).getAuthorizationConfig()?.let(AuthorizationConfig::wrap)

    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    override fun rootDirectory(): String? = unwrap(this).getRootDirectory()

    override fun transitEncryption(): String? = unwrap(this).getTransitEncryption()

    override fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EfsVolumeConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EfsVolumeConfiguration):
        EfsVolumeConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EfsVolumeConfiguration):
        software.amazon.awscdk.services.ecs.EfsVolumeConfiguration = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.EfsVolumeConfiguration
  }
}
