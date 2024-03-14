package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.events.Schedule
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public open class BackupPlanRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.backup.BackupPlanRule,
) {
  public open fun props(): BackupPlanRuleProps =
      unwrap(this).getProps().let(BackupPlanRuleProps::wrap)

  public interface Builder {
    public fun backupVault(backupVault: IBackupVault)

    public fun completionWindow(completionWindow: Duration)

    public fun copyActions(copyActions: List<BackupPlanCopyActionProps>)

    public fun deleteAfter(deleteAfter: Duration)

    public fun enableContinuousBackup(enableContinuousBackup: Boolean)

    public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration)

    public fun recoveryPointTags(recoveryPointTags: Map<String, String>)

    public fun ruleName(ruleName: String)

    public fun scheduleExpression(scheduleExpression: Schedule)

    public fun startWindow(startWindow: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupPlanRule.Builder =
        software.amazon.awscdk.services.backup.BackupPlanRule.Builder.create()

    override fun backupVault(backupVault: IBackupVault) {
      cdkBuilder.backupVault(backupVault.let(IBackupVault::unwrap))
    }

    override fun completionWindow(completionWindow: Duration) {
      cdkBuilder.completionWindow(completionWindow.let(Duration::unwrap))
    }

    override fun copyActions(copyActions: List<BackupPlanCopyActionProps>) {
      cdkBuilder.copyActions(copyActions.map(BackupPlanCopyActionProps::unwrap))
    }

    override fun deleteAfter(deleteAfter: Duration) {
      cdkBuilder.deleteAfter(deleteAfter.let(Duration::unwrap))
    }

    override fun enableContinuousBackup(enableContinuousBackup: Boolean) {
      cdkBuilder.enableContinuousBackup(enableContinuousBackup)
    }

    override fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
      cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter.let(Duration::unwrap))
    }

    override fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
      cdkBuilder.recoveryPointTags(recoveryPointTags)
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun scheduleExpression(scheduleExpression: Schedule) {
      cdkBuilder.scheduleExpression(scheduleExpression.let(Schedule::unwrap))
    }

    override fun startWindow(startWindow: Duration) {
      cdkBuilder.startWindow(startWindow.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupPlanRule = cdkBuilder.build()
  }

  public companion object {
    public open fun daily(): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.daily().let(BackupPlanRule::wrap)

    public open fun daily(backupVault: IBackupVault): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.daily(backupVault.let(IBackupVault::unwrap)).let(BackupPlanRule::wrap)

    public open fun monthly1Year(): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly1Year().let(BackupPlanRule::wrap)

    public open fun monthly1Year(backupVault: IBackupVault): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly1Year(backupVault.let(IBackupVault::unwrap)).let(BackupPlanRule::wrap)

    public open fun monthly5Year(): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly5Year().let(BackupPlanRule::wrap)

    public open fun monthly5Year(backupVault: IBackupVault): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly5Year(backupVault.let(IBackupVault::unwrap)).let(BackupPlanRule::wrap)

    public open fun monthly7Year(): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly7Year().let(BackupPlanRule::wrap)

    public open fun monthly7Year(backupVault: IBackupVault): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly7Year(backupVault.let(IBackupVault::unwrap)).let(BackupPlanRule::wrap)

    public open fun weekly(): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.weekly().let(BackupPlanRule::wrap)

    public open fun weekly(backupVault: IBackupVault): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.weekly(backupVault.let(IBackupVault::unwrap)).let(BackupPlanRule::wrap)

    public operator fun invoke(block: Builder.() -> Unit = {}): BackupPlanRule {
      val builderImpl = BuilderImpl()
      return BackupPlanRule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupPlanRule):
        BackupPlanRule = BackupPlanRule(cdkObject)

    internal fun unwrap(wrapped: BackupPlanRule):
        software.amazon.awscdk.services.backup.BackupPlanRule = wrapped.cdkObject
  }
}
