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

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.backup.BackupPlanCopyActionProps
import software.amazon.awscdk.services.backup.BackupPlanRuleProps
import software.amazon.awscdk.services.backup.IBackupVault
import software.amazon.awscdk.services.events.Schedule

/**
 * Properties for a BackupPlanRule.
 *
 * Example:
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
@CdkDslMarker
public class BackupPlanRulePropsDsl {
    private val cdkBuilder: BackupPlanRuleProps.Builder = BackupPlanRuleProps.builder()

    private val _copyActions: MutableList<BackupPlanCopyActionProps> = mutableListOf()

    /** @param backupVault The backup vault where backups are. */
    public fun backupVault(backupVault: IBackupVault) {
        cdkBuilder.backupVault(backupVault)
    }

    /**
     * @param completionWindow The duration after a backup job is successfully started before it
     *   must be completed or it is canceled by AWS Backup.
     */
    public fun completionWindow(completionWindow: Duration) {
        cdkBuilder.completionWindow(completionWindow)
    }

    /** @param copyActions Copy operations to perform on recovery points created by this rule. */
    public fun copyActions(copyActions: BackupPlanCopyActionPropsDsl.() -> Unit) {
        _copyActions.add(BackupPlanCopyActionPropsDsl().apply(copyActions).build())
    }

    /** @param copyActions Copy operations to perform on recovery points created by this rule. */
    public fun copyActions(copyActions: Collection<BackupPlanCopyActionProps>) {
        _copyActions.addAll(copyActions)
    }

    /**
     * @param deleteAfter Specifies the duration after creation that a recovery point is deleted.
     *   Must be greater than `moveToColdStorageAfter`.
     */
    public fun deleteAfter(deleteAfter: Duration) {
        cdkBuilder.deleteAfter(deleteAfter)
    }

    /**
     * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR).
     *   Property `deleteAfter` defines the retention period for the backup. It is mandatory if PITR
     *   is enabled. If no value is specified, the retention period is set to 35 days which is the
     *   maximum retention period supported by PITR.
     *
     * Property `moveToColdStorageAfter` must not be specified because PITR does not support this
     * option.
     */
    public fun enableContinuousBackup(enableContinuousBackup: Boolean) {
        cdkBuilder.enableContinuousBackup(enableContinuousBackup)
    }

    /**
     * @param moveToColdStorageAfter Specifies the duration after creation that a recovery point is
     *   moved to cold storage.
     */
    public fun moveToColdStorageAfter(moveToColdStorageAfter: Duration) {
        cdkBuilder.moveToColdStorageAfter(moveToColdStorageAfter)
    }

    /**
     * @param recoveryPointTags To help organize your resources, you can assign your own metadata to
     *   the resources that you create. Each tag is a key-value pair.
     */
    public fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
        cdkBuilder.recoveryPointTags(recoveryPointTags)
    }

    /** @param ruleName A display name for the backup rule. */
    public fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
    }

    /**
     * @param scheduleExpression A CRON expression specifying when AWS Backup initiates a backup
     *   job.
     */
    public fun scheduleExpression(scheduleExpression: Schedule) {
        cdkBuilder.scheduleExpression(scheduleExpression)
    }

    /**
     * @param startWindow The duration after a backup is scheduled before a job is canceled if it
     *   doesn't start successfully.
     */
    public fun startWindow(startWindow: Duration) {
        cdkBuilder.startWindow(startWindow)
    }

    public fun build(): BackupPlanRuleProps {
        if (_copyActions.isNotEmpty()) cdkBuilder.copyActions(_copyActions)
        return cdkBuilder.build()
    }
}
