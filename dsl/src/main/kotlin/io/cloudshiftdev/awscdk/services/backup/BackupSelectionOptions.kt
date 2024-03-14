package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface BackupSelectionOptions {
  public fun allowRestores(): Boolean? = unwrap(this).getAllowRestores()

  public fun backupSelectionName(): String? = unwrap(this).getBackupSelectionName()

  public fun disableDefaultBackupPolicy(): Boolean? = unwrap(this).getDisableDefaultBackupPolicy()

  public fun resources(): List<BackupResource>

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public interface Builder {
    public fun allowRestores(allowRestores: Boolean) {
    }

    public fun backupSelectionName(backupSelectionName: String) {
    }

    public fun disableDefaultBackupPolicy(disableDefaultBackupPolicy: Boolean) {
    }

    public fun resources(resources: List<BackupResource>) {
    }

    public fun role(role: IRole) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupSelectionOptions.Builder =
        software.amazon.awscdk.services.backup.BackupSelectionOptions.builder()

    public override fun allowRestores(allowRestores: Boolean) {
      cdkBuilder.allowRestores(allowRestores)
    }

    public override fun backupSelectionName(backupSelectionName: String) {
      cdkBuilder.backupSelectionName(backupSelectionName)
    }

    public override fun disableDefaultBackupPolicy(disableDefaultBackupPolicy: Boolean) {
      cdkBuilder.disableDefaultBackupPolicy(disableDefaultBackupPolicy)
    }

    public override fun resources(resources: List<BackupResource>) {
      cdkBuilder.resources(resources.map(BackupResource::unwrap))
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupSelectionOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.backup.BackupSelectionOptions,
  ) : BackupSelectionOptions {
    public override fun allowRestores(): Boolean? = unwrap(this).getAllowRestores()

    public override fun backupSelectionName(): String? = unwrap(this).getBackupSelectionName()

    public override fun disableDefaultBackupPolicy(): Boolean? =
        unwrap(this).getDisableDefaultBackupPolicy()

    public override fun resources(): List<BackupResource> =
        unwrap(this).getResources().map(BackupResource::wrap)

    public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BackupSelectionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupSelectionOptions):
        BackupSelectionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupSelectionOptions):
        software.amazon.awscdk.services.backup.BackupSelectionOptions = (wrapped as
        Wrapper).cdkObject
  }
}
