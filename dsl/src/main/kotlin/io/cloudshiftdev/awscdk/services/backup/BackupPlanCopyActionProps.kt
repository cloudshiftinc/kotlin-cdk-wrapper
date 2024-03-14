package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Duration
import kotlin.Unit

public interface BackupPlanCopyActionProps {
  public fun deleteAfter(): Duration? = unwrap(this).getDeleteAfter()?.let(Duration::wrap)

  public fun destinationBackupVault(): IBackupVault

  public fun moveToColdStorageAfter(): Duration? =
      unwrap(this).getMoveToColdStorageAfter()?.let(Duration::wrap)

  public interface Builder {
    public fun deleteAfter(deleteAfter: Duration) {
    }

    public fun destinationBackupVault(destinationBackupVault: IBackupVault) {
    }

    public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupPlanCopyActionProps.Builder
        = software.amazon.awscdk.services.backup.BackupPlanCopyActionProps.builder()

    public override fun deleteAfter(deleteAfter: Duration) {
      cdkBuilder.deleteAfter(deleteAfter.let(Duration::unwrap))
    }

    public override fun destinationBackupVault(destinationBackupVault: IBackupVault) {
      cdkBuilder.destinationBackupVault(destinationBackupVault.let(IBackupVault::unwrap))
    }

    public override fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
      cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupPlanCopyActionProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.backup.BackupPlanCopyActionProps,
  ) : BackupPlanCopyActionProps {
    public override fun deleteAfter(): Duration? =
        unwrap(this).getDeleteAfter()?.let(Duration::wrap)

    public override fun destinationBackupVault(): IBackupVault =
        unwrap(this).getDestinationBackupVault().let(IBackupVault::wrap)

    public override fun moveToColdStorageAfter(): Duration? =
        unwrap(this).getMoveToColdStorageAfter()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BackupPlanCopyActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupPlanCopyActionProps):
        BackupPlanCopyActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupPlanCopyActionProps):
        software.amazon.awscdk.services.backup.BackupPlanCopyActionProps = (wrapped as
        Wrapper).cdkObject
  }
}
