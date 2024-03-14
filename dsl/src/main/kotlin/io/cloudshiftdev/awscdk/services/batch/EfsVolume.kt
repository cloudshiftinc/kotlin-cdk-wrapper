package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.services.efs.IFileSystem
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public open class EfsVolume internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.EfsVolume,
) : EcsVolume(cdkObject) {
  public open fun accessPointId(): String? = unwrap(this).getAccessPointId()

  public open fun enableTransitEncryption(): Boolean? = unwrap(this).getEnableTransitEncryption()

  public open fun fileSystem(): IFileSystem = unwrap(this).getFileSystem().let(IFileSystem::wrap)

  public open fun rootDirectory(): String? = unwrap(this).getRootDirectory()

  public open fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

  public open fun useJobRole(): Boolean? = unwrap(this).getUseJobRole()

  public interface Builder {
    public fun accessPointId(accessPointId: String)

    public fun containerPath(containerPath: String)

    public fun enableTransitEncryption(enableTransitEncryption: Boolean)

    public fun fileSystem(fileSystem: IFileSystem)

    public fun name(name: String)

    public fun readonly(readonly: Boolean)

    public fun rootDirectory(rootDirectory: String)

    public fun transitEncryptionPort(transitEncryptionPort: Number)

    public fun useJobRole(useJobRole: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EfsVolume.Builder =
        software.amazon.awscdk.services.batch.EfsVolume.Builder.create()

    override fun accessPointId(accessPointId: String) {
      cdkBuilder.accessPointId(accessPointId)
    }

    override fun containerPath(containerPath: String) {
      cdkBuilder.containerPath(containerPath)
    }

    override fun enableTransitEncryption(enableTransitEncryption: Boolean) {
      cdkBuilder.enableTransitEncryption(enableTransitEncryption)
    }

    override fun fileSystem(fileSystem: IFileSystem) {
      cdkBuilder.fileSystem(fileSystem.let(IFileSystem::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun readonly(readonly: Boolean) {
      cdkBuilder.readonly(readonly)
    }

    override fun rootDirectory(rootDirectory: String) {
      cdkBuilder.rootDirectory(rootDirectory)
    }

    override fun transitEncryptionPort(transitEncryptionPort: Number) {
      cdkBuilder.transitEncryptionPort(transitEncryptionPort)
    }

    override fun useJobRole(useJobRole: Boolean) {
      cdkBuilder.useJobRole(useJobRole)
    }

    public fun build(): software.amazon.awscdk.services.batch.EfsVolume = cdkBuilder.build()
  }

  public companion object {
    public open fun isEfsVolume(x: Any): Boolean =
        software.amazon.awscdk.services.batch.EfsVolume.isEfsVolume(x)

    public operator fun invoke(block: Builder.() -> Unit = {}): EfsVolume {
      val builderImpl = BuilderImpl()
      return EfsVolume(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EfsVolume): EfsVolume =
        EfsVolume(cdkObject)

    internal fun unwrap(wrapped: EfsVolume): software.amazon.awscdk.services.batch.EfsVolume =
        wrapped.cdkObject
  }
}
