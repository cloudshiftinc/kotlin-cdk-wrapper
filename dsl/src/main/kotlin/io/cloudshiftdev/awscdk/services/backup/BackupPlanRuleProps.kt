package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.events.Schedule
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface BackupPlanRuleProps {
  public fun backupVault(): IBackupVault? = unwrap(this).getBackupVault()?.let(IBackupVault::wrap)

  public fun completionWindow(): Duration? = unwrap(this).getCompletionWindow()?.let(Duration::wrap)

  public fun copyActions(): List<BackupPlanCopyActionProps> =
      unwrap(this).getCopyActions()?.map(BackupPlanCopyActionProps::wrap) ?: emptyList()

  public fun deleteAfter(): Duration? = unwrap(this).getDeleteAfter()?.let(Duration::wrap)

  public fun enableContinuousBackup(): Boolean? = unwrap(this).getEnableContinuousBackup()

  public fun moveToColdStorageAfter(): Duration? =
      unwrap(this).getMoveToColdStorageAfter()?.let(Duration::wrap)

  public fun recoveryPointTags(): Map<String, String> = unwrap(this).getRecoveryPointTags() ?:
      emptyMap()

  public fun ruleName(): String? = unwrap(this).getRuleName()

  public fun scheduleExpression(): Schedule? =
      unwrap(this).getScheduleExpression()?.let(Schedule::wrap)

  public fun startWindow(): Duration? = unwrap(this).getStartWindow()?.let(Duration::wrap)

  public interface Builder {
    public fun backupVault(backupVault: IBackupVault) {
    }

    public fun completionWindow(completionWindow: Duration) {
    }

    public fun copyActions(copyActions: List<BackupPlanCopyActionProps>) {
    }

    public fun deleteAfter(deleteAfter: Duration) {
    }

    public fun enableContinuousBackup(enableContinuousBackup: Boolean) {
    }

    public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
    }

    public fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
    }

    public fun ruleName(ruleName: String) {
    }

    public fun scheduleExpression(scheduleExpression: Schedule) {
    }

    public fun startWindow(startWindow: Duration) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupPlanRuleProps.Builder =
        software.amazon.awscdk.services.backup.BackupPlanRuleProps.builder()

    public override fun backupVault(backupVault: IBackupVault) {
      cdkBuilder.backupVault(backupVault.let(IBackupVault::unwrap))
    }

    public override fun completionWindow(completionWindow: Duration) {
      cdkBuilder.completionWindow(completionWindow.let(Duration::unwrap))
    }

    public override fun copyActions(copyActions: List<BackupPlanCopyActionProps>) {
      cdkBuilder.copyActions(copyActions.map(BackupPlanCopyActionProps::unwrap))
    }

    public override fun deleteAfter(deleteAfter: Duration) {
      cdkBuilder.deleteAfter(deleteAfter.let(Duration::unwrap))
    }

    public override fun enableContinuousBackup(enableContinuousBackup: Boolean) {
      cdkBuilder.enableContinuousBackup(enableContinuousBackup)
    }

    public override fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
      cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter.let(Duration::unwrap))
    }

    public override fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
      cdkBuilder.recoveryPointTags(recoveryPointTags)
    }

    public override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    public override fun scheduleExpression(scheduleExpression: Schedule) {
      cdkBuilder.scheduleExpression(scheduleExpression.let(Schedule::unwrap))
    }

    public override fun startWindow(startWindow: Duration) {
      cdkBuilder.startWindow(startWindow.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupPlanRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.backup.BackupPlanRuleProps,
  ) : BackupPlanRuleProps {
    public override fun backupVault(): IBackupVault? =
        unwrap(this).getBackupVault()?.let(IBackupVault::wrap)

    public override fun completionWindow(): Duration? =
        unwrap(this).getCompletionWindow()?.let(Duration::wrap)

    public override fun copyActions(): List<BackupPlanCopyActionProps> =
        unwrap(this).getCopyActions()?.map(BackupPlanCopyActionProps::wrap) ?: emptyList()

    public override fun deleteAfter(): Duration? =
        unwrap(this).getDeleteAfter()?.let(Duration::wrap)

    public override fun enableContinuousBackup(): Boolean? =
        unwrap(this).getEnableContinuousBackup()

    public override fun moveToColdStorageAfter(): Duration? =
        unwrap(this).getMoveToColdStorageAfter()?.let(Duration::wrap)

    public override fun recoveryPointTags(): Map<String, String> =
        unwrap(this).getRecoveryPointTags() ?: emptyMap()

    public override fun ruleName(): String? = unwrap(this).getRuleName()

    public override fun scheduleExpression(): Schedule? =
        unwrap(this).getScheduleExpression()?.let(Schedule::wrap)

    public override fun startWindow(): Duration? =
        unwrap(this).getStartWindow()?.let(Duration::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BackupPlanRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupPlanRuleProps):
        BackupPlanRuleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupPlanRuleProps):
        software.amazon.awscdk.services.backup.BackupPlanRuleProps = (wrapped as Wrapper).cdkObject
  }
}
