@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.backup.BackupPlanCopyActionProps
import software.amazon.awscdk.services.backup.BackupPlanRule
import software.amazon.awscdk.services.backup.IBackupVault
import software.amazon.awscdk.services.events.Schedule

/**
 * A backup plan rule.
 *
 * Example:
 * ```
 * BackupPlan plan;
 * plan.addRule(BackupPlanRule.Builder.create()
 * .enableContinuousBackup(true)
 * .deleteAfter(Duration.days(14))
 * .build());
 * ```
 */
@CdkDslMarker
public class BackupPlanRuleDsl {
    private val cdkBuilder: BackupPlanRule.Builder = BackupPlanRule.Builder.create()

    private val _copyActions: MutableList<BackupPlanCopyActionProps> = mutableListOf()

    /**
     * The backup vault where backups are.
     *
     * Default: - use the vault defined at the plan level. If not defined a new common vault for the
     * plan will be created
     *
     * @param backupVault The backup vault where backups are.
     */
    public fun backupVault(backupVault: IBackupVault) {
        cdkBuilder.backupVault(backupVault)
    }

    /**
     * The duration after a backup job is successfully started before it must be completed or it is
     * canceled by AWS Backup.
     *
     * Default: - 7 days
     *
     * @param completionWindow The duration after a backup job is successfully started before it
     *   must be completed or it is canceled by AWS Backup.
     */
    public fun completionWindow(completionWindow: Duration) {
        cdkBuilder.completionWindow(completionWindow)
    }

    /**
     * Copy operations to perform on recovery points created by this rule.
     *
     * Default: - no copy actions
     *
     * @param copyActions Copy operations to perform on recovery points created by this rule.
     */
    public fun copyActions(copyActions: BackupPlanCopyActionPropsDsl.() -> Unit) {
        _copyActions.add(BackupPlanCopyActionPropsDsl().apply(copyActions).build())
    }

    /**
     * Copy operations to perform on recovery points created by this rule.
     *
     * Default: - no copy actions
     *
     * @param copyActions Copy operations to perform on recovery points created by this rule.
     */
    public fun copyActions(copyActions: Collection<BackupPlanCopyActionProps>) {
        _copyActions.addAll(copyActions)
    }

    /**
     * Specifies the duration after creation that a recovery point is deleted.
     *
     * Must be greater than `moveToColdStorageAfter`.
     *
     * Default: - recovery point is never deleted
     *
     * @param deleteAfter Specifies the duration after creation that a recovery point is deleted.
     */
    public fun deleteAfter(deleteAfter: Duration) {
        cdkBuilder.deleteAfter(deleteAfter)
    }

    /**
     * Enables continuous backup and point-in-time restores (PITR).
     *
     * Property `deleteAfter` defines the retention period for the backup. It is mandatory if PITR
     * is enabled. If no value is specified, the retention period is set to 35 days which is the
     * maximum retention period supported by PITR.
     *
     * Property `moveToColdStorageAfter` must not be specified because PITR does not support this
     * option.
     *
     * Default: false
     *
     * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR).
     */
    public fun enableContinuousBackup(enableContinuousBackup: Boolean) {
        cdkBuilder.enableContinuousBackup(enableContinuousBackup)
    }

    /**
     * Specifies the duration after creation that a recovery point is moved to cold storage.
     *
     * Default: - recovery point is never moved to cold storage
     *
     * @param moveToColdStorageAfter Specifies the duration after creation that a recovery point is
     *   moved to cold storage.
     */
    public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
        cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter)
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
     *   the resources that you create.
     */
    public fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
        cdkBuilder.recoveryPointTags(recoveryPointTags)
    }

    /**
     * A display name for the backup rule.
     *
     * Default: - a CDK generated name
     *
     * @param ruleName A display name for the backup rule.
     */
    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    /**
     * A CRON expression specifying when AWS Backup initiates a backup job.
     *
     * Default: - no schedule
     *
     * @param scheduleExpression A CRON expression specifying when AWS Backup initiates a backup
     *   job.
     */
    public fun scheduleExpression(scheduleExpression: Schedule) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * The duration after a backup is scheduled before a job is canceled if it doesn't start
     * successfully.
     *
     * Default: - 8 hours
     *
     * @param startWindow The duration after a backup is scheduled before a job is canceled if it
     *   doesn't start successfully.
     */
    public fun startWindow(startWindow: Duration) {
        cdkBuilder.startWindow(startWindow)
    }

    public fun build(): BackupPlanRule {
        if (_copyActions.isNotEmpty()) cdkBuilder.copyActions(_copyActions)
        return cdkBuilder.build()
    }
}
