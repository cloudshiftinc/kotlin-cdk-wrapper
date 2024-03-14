package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.events.Schedule
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public open class BackupPlanRule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.backup.BackupPlanRule,
) {
  /**
   * Properties of BackupPlanRule.
   */
  public open fun props(): BackupPlanRuleProps =
      unwrap(this).getProps().let(BackupPlanRuleProps::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.backup.BackupPlanRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The backup vault where backups are.
     *
     * Default: - use the vault defined at the plan level. If not defined a new
     * common vault for the plan will be created
     *
     * @param backupVault The backup vault where backups are. 
     */
    public fun backupVault(backupVault: IBackupVault)

    /**
     * The duration after a backup job is successfully started before it must be completed or it is
     * canceled by AWS Backup.
     *
     * Default: - 7 days
     *
     * @param completionWindow The duration after a backup job is successfully started before it
     * must be completed or it is canceled by AWS Backup. 
     */
    public fun completionWindow(completionWindow: Duration)

    /**
     * Copy operations to perform on recovery points created by this rule.
     *
     * Default: - no copy actions
     *
     * @param copyActions Copy operations to perform on recovery points created by this rule. 
     */
    public fun copyActions(copyActions: List<BackupPlanCopyActionProps>)

    /**
     * Copy operations to perform on recovery points created by this rule.
     *
     * Default: - no copy actions
     *
     * @param copyActions Copy operations to perform on recovery points created by this rule. 
     */
    public fun copyActions(vararg copyActions: BackupPlanCopyActionProps)

    /**
     * Specifies the duration after creation that a recovery point is deleted.
     *
     * Must be greater than `moveToColdStorageAfter`.
     *
     * Default: - recovery point is never deleted
     *
     * @param deleteAfter Specifies the duration after creation that a recovery point is deleted. 
     */
    public fun deleteAfter(deleteAfter: Duration)

    /**
     * Enables continuous backup and point-in-time restores (PITR).
     *
     * Property `deleteAfter` defines the retention period for the backup. It is mandatory if PITR
     * is enabled.
     * If no value is specified, the retention period is set to 35 days which is the maximum
     * retention period supported by PITR.
     *
     * Property `moveToColdStorageAfter` must not be specified because PITR does not support this
     * option.
     *
     * Default: false
     *
     * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR). 
     */
    public fun enableContinuousBackup(enableContinuousBackup: Boolean)

    /**
     * Specifies the duration after creation that a recovery point is moved to cold storage.
     *
     * Default: - recovery point is never moved to cold storage
     *
     * @param moveToColdStorageAfter Specifies the duration after creation that a recovery point is
     * moved to cold storage. 
     */
    public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration)

    /**
     * To help organize your resources, you can assign your own metadata to the resources that you
     * create.
     *
     * Each tag is a key-value pair.
     *
     * Default: - no recovery point tags.
     *
     * @param recoveryPointTags To help organize your resources, you can assign your own metadata to
     * the resources that you create. 
     */
    public fun recoveryPointTags(recoveryPointTags: Map<String, String>)

    /**
     * A display name for the backup rule.
     *
     * Default: - a CDK generated name
     *
     * @param ruleName A display name for the backup rule. 
     */
    public fun ruleName(ruleName: String)

    /**
     * A CRON expression specifying when AWS Backup initiates a backup job.
     *
     * Default: - no schedule
     *
     * @param scheduleExpression A CRON expression specifying when AWS Backup initiates a backup
     * job. 
     */
    public fun scheduleExpression(scheduleExpression: Schedule)

    /**
     * The duration after a backup is scheduled before a job is canceled if it doesn't start
     * successfully.
     *
     * Default: - 8 hours
     *
     * @param startWindow The duration after a backup is scheduled before a job is canceled if it
     * doesn't start successfully. 
     */
    public fun startWindow(startWindow: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupPlanRule.Builder =
        software.amazon.awscdk.services.backup.BackupPlanRule.Builder.create()

    /**
     * The backup vault where backups are.
     *
     * Default: - use the vault defined at the plan level. If not defined a new
     * common vault for the plan will be created
     *
     * @param backupVault The backup vault where backups are. 
     */
    override fun backupVault(backupVault: IBackupVault) {
      cdkBuilder.backupVault(backupVault.let(IBackupVault::unwrap))
    }

    /**
     * The duration after a backup job is successfully started before it must be completed or it is
     * canceled by AWS Backup.
     *
     * Default: - 7 days
     *
     * @param completionWindow The duration after a backup job is successfully started before it
     * must be completed or it is canceled by AWS Backup. 
     */
    override fun completionWindow(completionWindow: Duration) {
      cdkBuilder.completionWindow(completionWindow.let(Duration::unwrap))
    }

    /**
     * Copy operations to perform on recovery points created by this rule.
     *
     * Default: - no copy actions
     *
     * @param copyActions Copy operations to perform on recovery points created by this rule. 
     */
    override fun copyActions(copyActions: List<BackupPlanCopyActionProps>) {
      cdkBuilder.copyActions(copyActions.map(BackupPlanCopyActionProps::unwrap))
    }

    /**
     * Copy operations to perform on recovery points created by this rule.
     *
     * Default: - no copy actions
     *
     * @param copyActions Copy operations to perform on recovery points created by this rule. 
     */
    override fun copyActions(vararg copyActions: BackupPlanCopyActionProps): Unit =
        copyActions(copyActions.toList())

    /**
     * Specifies the duration after creation that a recovery point is deleted.
     *
     * Must be greater than `moveToColdStorageAfter`.
     *
     * Default: - recovery point is never deleted
     *
     * @param deleteAfter Specifies the duration after creation that a recovery point is deleted. 
     */
    override fun deleteAfter(deleteAfter: Duration) {
      cdkBuilder.deleteAfter(deleteAfter.let(Duration::unwrap))
    }

    /**
     * Enables continuous backup and point-in-time restores (PITR).
     *
     * Property `deleteAfter` defines the retention period for the backup. It is mandatory if PITR
     * is enabled.
     * If no value is specified, the retention period is set to 35 days which is the maximum
     * retention period supported by PITR.
     *
     * Property `moveToColdStorageAfter` must not be specified because PITR does not support this
     * option.
     *
     * Default: false
     *
     * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR). 
     */
    override fun enableContinuousBackup(enableContinuousBackup: Boolean) {
      cdkBuilder.enableContinuousBackup(enableContinuousBackup)
    }

    /**
     * Specifies the duration after creation that a recovery point is moved to cold storage.
     *
     * Default: - recovery point is never moved to cold storage
     *
     * @param moveToColdStorageAfter Specifies the duration after creation that a recovery point is
     * moved to cold storage. 
     */
    override fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
      cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter.let(Duration::unwrap))
    }

    /**
     * To help organize your resources, you can assign your own metadata to the resources that you
     * create.
     *
     * Each tag is a key-value pair.
     *
     * Default: - no recovery point tags.
     *
     * @param recoveryPointTags To help organize your resources, you can assign your own metadata to
     * the resources that you create. 
     */
    override fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
      cdkBuilder.recoveryPointTags(recoveryPointTags)
    }

    /**
     * A display name for the backup rule.
     *
     * Default: - a CDK generated name
     *
     * @param ruleName A display name for the backup rule. 
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * A CRON expression specifying when AWS Backup initiates a backup job.
     *
     * Default: - no schedule
     *
     * @param scheduleExpression A CRON expression specifying when AWS Backup initiates a backup
     * job. 
     */
    override fun scheduleExpression(scheduleExpression: Schedule) {
      cdkBuilder.scheduleExpression(scheduleExpression.let(Schedule::unwrap))
    }

    /**
     * The duration after a backup is scheduled before a job is canceled if it doesn't start
     * successfully.
     *
     * Default: - 8 hours
     *
     * @param startWindow The duration after a backup is scheduled before a job is canceled if it
     * doesn't start successfully. 
     */
    override fun startWindow(startWindow: Duration) {
      cdkBuilder.startWindow(startWindow.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupPlanRule = cdkBuilder.build()
  }

  public companion object {
    public fun daily(): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.daily().let(BackupPlanRule::wrap)

    public fun daily(backupVault: IBackupVault): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.daily(backupVault.let(IBackupVault::unwrap)).let(BackupPlanRule::wrap)

    public fun monthly1Year(): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly1Year().let(BackupPlanRule::wrap)

    public fun monthly1Year(backupVault: IBackupVault): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly1Year(backupVault.let(IBackupVault::unwrap)).let(BackupPlanRule::wrap)

    public fun monthly5Year(): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly5Year().let(BackupPlanRule::wrap)

    public fun monthly5Year(backupVault: IBackupVault): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly5Year(backupVault.let(IBackupVault::unwrap)).let(BackupPlanRule::wrap)

    public fun monthly7Year(): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly7Year().let(BackupPlanRule::wrap)

    public fun monthly7Year(backupVault: IBackupVault): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.monthly7Year(backupVault.let(IBackupVault::unwrap)).let(BackupPlanRule::wrap)

    public fun weekly(): BackupPlanRule =
        software.amazon.awscdk.services.backup.BackupPlanRule.weekly().let(BackupPlanRule::wrap)

    public fun weekly(backupVault: IBackupVault): BackupPlanRule =
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
