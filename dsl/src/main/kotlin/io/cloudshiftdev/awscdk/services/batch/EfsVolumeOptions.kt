package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.services.efs.IFileSystem
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface EfsVolumeOptions : EcsVolumeOptions {
  public fun accessPointId(): String? = unwrap(this).getAccessPointId()

  public fun enableTransitEncryption(): Boolean? = unwrap(this).getEnableTransitEncryption()

  public fun fileSystem(): IFileSystem

  public fun rootDirectory(): String? = unwrap(this).getRootDirectory()

  public fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

  public fun useJobRole(): Boolean? = unwrap(this).getUseJobRole()

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
    private val cdkBuilder: software.amazon.awscdk.services.batch.EfsVolumeOptions.Builder =
        software.amazon.awscdk.services.batch.EfsVolumeOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.batch.EfsVolumeOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.batch.EfsVolumeOptions,
  ) : EfsVolumeOptions {
    override fun accessPointId(): String? = unwrap(this).getAccessPointId()

    override fun containerPath(): String = unwrap(this).getContainerPath()

    override fun enableTransitEncryption(): Boolean? = unwrap(this).getEnableTransitEncryption()

    override fun fileSystem(): IFileSystem = unwrap(this).getFileSystem().let(IFileSystem::wrap)

    override fun name(): String = unwrap(this).getName()

    override fun readonly(): Boolean? = unwrap(this).getReadonly()

    override fun rootDirectory(): String? = unwrap(this).getRootDirectory()

    override fun transitEncryptionPort(): Number? = unwrap(this).getTransitEncryptionPort()

    override fun useJobRole(): Boolean? = unwrap(this).getUseJobRole()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EfsVolumeOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EfsVolumeOptions):
        EfsVolumeOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EfsVolumeOptions):
        software.amazon.awscdk.services.batch.EfsVolumeOptions = (wrapped as Wrapper).cdkObject
  }
}
