@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.Schedule
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for a BackupPlanRule.
 *
 * Example:
 *
 * ```
 * BackupPlan plan;
 * BackupVault secondaryVault;
 * plan.addRule(BackupPlanRule.Builder.create()
 * .copyActions(List.of(BackupPlanCopyActionProps.builder()
 * .destinationBackupVault(secondaryVault)
 * .moveToColdStorageAfter(Duration.days(30))
 * .deleteAfter(Duration.days(120))
 * .build()))
 * .build());
 * ```
 */
public interface BackupPlanRuleProps {
  /**
   * The backup vault where backups are.
   *
   * Default: - use the vault defined at the plan level. If not defined a new
   * common vault for the plan will be created
   */
  public fun backupVault(): IBackupVault? = unwrap(this).getBackupVault()?.let(IBackupVault::wrap)

  /**
   * The duration after a backup job is successfully started before it must be completed or it is
   * canceled by AWS Backup.
   *
   * Default: - 7 days
   */
  public fun completionWindow(): Duration? = unwrap(this).getCompletionWindow()?.let(Duration::wrap)

  /**
   * Copy operations to perform on recovery points created by this rule.
   *
   * Default: - no copy actions
   */
  public fun copyActions(): List<BackupPlanCopyActionProps> =
      unwrap(this).getCopyActions()?.map(BackupPlanCopyActionProps::wrap) ?: emptyList()

  /**
   * Specifies the duration after creation that a recovery point is deleted.
   *
   * Must be greater than `moveToColdStorageAfter`.
   *
   * Default: - recovery point is never deleted
   */
  public fun deleteAfter(): Duration? = unwrap(this).getDeleteAfter()?.let(Duration::wrap)

  /**
   * Enables continuous backup and point-in-time restores (PITR).
   *
   * Property `deleteAfter` defines the retention period for the backup. It is mandatory if PITR is
   * enabled.
   * If no value is specified, the retention period is set to 35 days which is the maximum retention
   * period supported by PITR.
   *
   * Property `moveToColdStorageAfter` must not be specified because PITR does not support this
   * option.
   *
   * Default: false
   */
  public fun enableContinuousBackup(): Boolean? = unwrap(this).getEnableContinuousBackup()

  /**
   * Specifies the duration after creation that a recovery point is moved to cold storage.
   *
   * Default: - recovery point is never moved to cold storage
   */
  public fun moveToColdStorageAfter(): Duration? =
      unwrap(this).getMoveToColdStorageAfter()?.let(Duration::wrap)

  /**
   * To help organize your resources, you can assign your own metadata to the resources that you
   * create.
   *
   * Each tag is a key-value pair.
   *
   * Default: - no recovery point tags.
   */
  public fun recoveryPointTags(): Map<String, String> = unwrap(this).getRecoveryPointTags() ?:
      emptyMap()

  /**
   * A display name for the backup rule.
   *
   * Default: - a CDK generated name
   */
  public fun ruleName(): String? = unwrap(this).getRuleName()

  /**
   * A CRON expression specifying when AWS Backup initiates a backup job.
   *
   * Default: - no schedule
   */
  public fun scheduleExpression(): Schedule? =
      unwrap(this).getScheduleExpression()?.let(Schedule::wrap)

  /**
   * The duration after a backup is scheduled before a job is canceled if it doesn't start
   * successfully.
   *
   * Default: - 8 hours
   */
  public fun startWindow(): Duration? = unwrap(this).getStartWindow()?.let(Duration::wrap)

  /**
   * A builder for [BackupPlanRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param backupVault The backup vault where backups are.
     */
    public fun backupVault(backupVault: IBackupVault)

    /**
     * @param completionWindow The duration after a backup job is successfully started before it
     * must be completed or it is canceled by AWS Backup.
     */
    public fun completionWindow(completionWindow: Duration)

    /**
     * @param copyActions Copy operations to perform on recovery points created by this rule.
     */
    public fun copyActions(copyActions: List<BackupPlanCopyActionProps>)

    /**
     * @param copyActions Copy operations to perform on recovery points created by this rule.
     */
    public fun copyActions(vararg copyActions: BackupPlanCopyActionProps)

    /**
     * @param deleteAfter Specifies the duration after creation that a recovery point is deleted.
     * Must be greater than `moveToColdStorageAfter`.
     */
    public fun deleteAfter(deleteAfter: Duration)

    /**
     * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR).
     * Property `deleteAfter` defines the retention period for the backup. It is mandatory if PITR
     * is enabled.
     * If no value is specified, the retention period is set to 35 days which is the maximum
     * retention period supported by PITR.
     *
     * Property `moveToColdStorageAfter` must not be specified because PITR does not support this
     * option.
     */
    public fun enableContinuousBackup(enableContinuousBackup: Boolean)

    /**
     * @param moveToColdStorageAfter Specifies the duration after creation that a recovery point is
     * moved to cold storage.
     */
    public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration)

    /**
     * @param recoveryPointTags To help organize your resources, you can assign your own metadata to
     * the resources that you create.
     * Each tag is a key-value pair.
     */
    public fun recoveryPointTags(recoveryPointTags: Map<String, String>)

    /**
     * @param ruleName A display name for the backup rule.
     */
    public fun ruleName(ruleName: String)

    /**
     * @param scheduleExpression A CRON expression specifying when AWS Backup initiates a backup
     * job.
     */
    public fun scheduleExpression(scheduleExpression: Schedule)

    /**
     * @param startWindow The duration after a backup is scheduled before a job is canceled if it
     * doesn't start successfully.
     */
    public fun startWindow(startWindow: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.BackupPlanRuleProps.Builder =
        software.amazon.awscdk.services.backup.BackupPlanRuleProps.builder()

    /**
     * @param backupVault The backup vault where backups are.
     */
    override fun backupVault(backupVault: IBackupVault) {
      cdkBuilder.backupVault(backupVault.let(IBackupVault::unwrap))
    }

    /**
     * @param completionWindow The duration after a backup job is successfully started before it
     * must be completed or it is canceled by AWS Backup.
     */
    override fun completionWindow(completionWindow: Duration) {
      cdkBuilder.completionWindow(completionWindow.let(Duration::unwrap))
    }

    /**
     * @param copyActions Copy operations to perform on recovery points created by this rule.
     */
    override fun copyActions(copyActions: List<BackupPlanCopyActionProps>) {
      cdkBuilder.copyActions(copyActions.map(BackupPlanCopyActionProps::unwrap))
    }

    /**
     * @param copyActions Copy operations to perform on recovery points created by this rule.
     */
    override fun copyActions(vararg copyActions: BackupPlanCopyActionProps): Unit =
        copyActions(copyActions.toList())

    /**
     * @param deleteAfter Specifies the duration after creation that a recovery point is deleted.
     * Must be greater than `moveToColdStorageAfter`.
     */
    override fun deleteAfter(deleteAfter: Duration) {
      cdkBuilder.deleteAfter(deleteAfter.let(Duration::unwrap))
    }

    /**
     * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR).
     * Property `deleteAfter` defines the retention period for the backup. It is mandatory if PITR
     * is enabled.
     * If no value is specified, the retention period is set to 35 days which is the maximum
     * retention period supported by PITR.
     *
     * Property `moveToColdStorageAfter` must not be specified because PITR does not support this
     * option.
     */
    override fun enableContinuousBackup(enableContinuousBackup: Boolean) {
      cdkBuilder.enableContinuousBackup(enableContinuousBackup)
    }

    /**
     * @param moveToColdStorageAfter Specifies the duration after creation that a recovery point is
     * moved to cold storage.
     */
    override fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
      cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter.let(Duration::unwrap))
    }

    /**
     * @param recoveryPointTags To help organize your resources, you can assign your own metadata to
     * the resources that you create.
     * Each tag is a key-value pair.
     */
    override fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
      cdkBuilder.recoveryPointTags(recoveryPointTags)
    }

    /**
     * @param ruleName A display name for the backup rule.
     */
    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param scheduleExpression A CRON expression specifying when AWS Backup initiates a backup
     * job.
     */
    override fun scheduleExpression(scheduleExpression: Schedule) {
      cdkBuilder.scheduleExpression(scheduleExpression.let(Schedule::unwrap))
    }

    /**
     * @param startWindow The duration after a backup is scheduled before a job is canceled if it
     * doesn't start successfully.
     */
    override fun startWindow(startWindow: Duration) {
      cdkBuilder.startWindow(startWindow.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.backup.BackupPlanRuleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.backup.BackupPlanRuleProps,
  ) : CdkObject(cdkObject), BackupPlanRuleProps {
    /**
     * The backup vault where backups are.
     *
     * Default: - use the vault defined at the plan level. If not defined a new
     * common vault for the plan will be created
     */
    override fun backupVault(): IBackupVault? =
        unwrap(this).getBackupVault()?.let(IBackupVault::wrap)

    /**
     * The duration after a backup job is successfully started before it must be completed or it is
     * canceled by AWS Backup.
     *
     * Default: - 7 days
     */
    override fun completionWindow(): Duration? =
        unwrap(this).getCompletionWindow()?.let(Duration::wrap)

    /**
     * Copy operations to perform on recovery points created by this rule.
     *
     * Default: - no copy actions
     */
    override fun copyActions(): List<BackupPlanCopyActionProps> =
        unwrap(this).getCopyActions()?.map(BackupPlanCopyActionProps::wrap) ?: emptyList()

    /**
     * Specifies the duration after creation that a recovery point is deleted.
     *
     * Must be greater than `moveToColdStorageAfter`.
     *
     * Default: - recovery point is never deleted
     */
    override fun deleteAfter(): Duration? = unwrap(this).getDeleteAfter()?.let(Duration::wrap)

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
     */
    override fun enableContinuousBackup(): Boolean? = unwrap(this).getEnableContinuousBackup()

    /**
     * Specifies the duration after creation that a recovery point is moved to cold storage.
     *
     * Default: - recovery point is never moved to cold storage
     */
    override fun moveToColdStorageAfter(): Duration? =
        unwrap(this).getMoveToColdStorageAfter()?.let(Duration::wrap)

    /**
     * To help organize your resources, you can assign your own metadata to the resources that you
     * create.
     *
     * Each tag is a key-value pair.
     *
     * Default: - no recovery point tags.
     */
    override fun recoveryPointTags(): Map<String, String> = unwrap(this).getRecoveryPointTags() ?:
        emptyMap()

    /**
     * A display name for the backup rule.
     *
     * Default: - a CDK generated name
     */
    override fun ruleName(): String? = unwrap(this).getRuleName()

    /**
     * A CRON expression specifying when AWS Backup initiates a backup job.
     *
     * Default: - no schedule
     */
    override fun scheduleExpression(): Schedule? =
        unwrap(this).getScheduleExpression()?.let(Schedule::wrap)

    /**
     * The duration after a backup is scheduled before a job is canceled if it doesn't start
     * successfully.
     *
     * Default: - 8 hours
     */
    override fun startWindow(): Duration? = unwrap(this).getStartWindow()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BackupPlanRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.BackupPlanRuleProps):
        BackupPlanRuleProps = CdkObjectWrappers.wrap(cdkObject) as? BackupPlanRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: BackupPlanRuleProps):
        software.amazon.awscdk.services.backup.BackupPlanRuleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.backup.BackupPlanRuleProps
  }
}
