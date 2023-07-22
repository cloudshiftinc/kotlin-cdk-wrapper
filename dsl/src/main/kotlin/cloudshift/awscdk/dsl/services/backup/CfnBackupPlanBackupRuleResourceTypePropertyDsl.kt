@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupPlan

/**
 * Specifies an object containing properties used to schedule a task to back up a selection of
 * resources.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * BackupRuleResourceTypeProperty backupRuleResourceTypeProperty =
 * BackupRuleResourceTypeProperty.builder()
 * .ruleName("ruleName")
 * .targetBackupVault("targetBackupVault")
 * // the properties below are optional
 * .completionWindowMinutes(123)
 * .copyActions(List.of(CopyActionResourceTypeProperty.builder()
 * .destinationBackupVaultArn("destinationBackupVaultArn")
 * // the properties below are optional
 * .lifecycle(LifecycleResourceTypeProperty.builder()
 * .deleteAfterDays(123)
 * .moveToColdStorageAfterDays(123)
 * .build())
 * .build()))
 * .enableContinuousBackup(false)
 * .lifecycle(LifecycleResourceTypeProperty.builder()
 * .deleteAfterDays(123)
 * .moveToColdStorageAfterDays(123)
 * .build())
 * .recoveryPointTags(Map.of(
 * "recoveryPointTagsKey", "recoveryPointTags"))
 * .scheduleExpression("scheduleExpression")
 * .startWindowMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupplan-backupruleresourcetype.html)
 */
@CdkDslMarker
public class CfnBackupPlanBackupRuleResourceTypePropertyDsl {
  private val cdkBuilder: CfnBackupPlan.BackupRuleResourceTypeProperty.Builder =
      CfnBackupPlan.BackupRuleResourceTypeProperty.builder()

  private val _copyActions: MutableList<Any> = mutableListOf()

  /**
   * @param completionWindowMinutes A value in minutes after a backup job is successfully started
   * before it must be completed or it is canceled by AWS Backup .
   */
  public fun completionWindowMinutes(completionWindowMinutes: Number) {
    cdkBuilder.completionWindowMinutes(completionWindowMinutes)
  }

  /**
   * @param copyActions An array of CopyAction objects, which contains the details of the copy
   * operation.
   */
  public fun copyActions(vararg copyActions: Any) {
    _copyActions.addAll(listOf(*copyActions))
  }

  /**
   * @param copyActions An array of CopyAction objects, which contains the details of the copy
   * operation.
   */
  public fun copyActions(copyActions: Collection<Any>) {
    _copyActions.addAll(copyActions)
  }

  /**
   * @param copyActions An array of CopyAction objects, which contains the details of the copy
   * operation.
   */
  public fun copyActions(copyActions: IResolvable) {
    cdkBuilder.copyActions(copyActions)
  }

  /**
   * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR).
   */
  public fun enableContinuousBackup(enableContinuousBackup: Boolean) {
    cdkBuilder.enableContinuousBackup(enableContinuousBackup)
  }

  /**
   * @param enableContinuousBackup Enables continuous backup and point-in-time restores (PITR).
   */
  public fun enableContinuousBackup(enableContinuousBackup: IResolvable) {
    cdkBuilder.enableContinuousBackup(enableContinuousBackup)
  }

  /**
   * @param lifecycle The lifecycle defines when a protected resource is transitioned to cold
   * storage and when it expires.
   * AWS Backup transitions and expires backups automatically according to the lifecycle that you
   * define.
   */
  public fun lifecycle(lifecycle: IResolvable) {
    cdkBuilder.lifecycle(lifecycle)
  }

  /**
   * @param lifecycle The lifecycle defines when a protected resource is transitioned to cold
   * storage and when it expires.
   * AWS Backup transitions and expires backups automatically according to the lifecycle that you
   * define.
   */
  public fun lifecycle(lifecycle: CfnBackupPlan.LifecycleResourceTypeProperty) {
    cdkBuilder.lifecycle(lifecycle)
  }

  /**
   * @param recoveryPointTags To help organize your resources, you can assign your own metadata to
   * the resources that you create.
   * Each tag is a key-value pair.
   */
  public fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
    cdkBuilder.recoveryPointTags(recoveryPointTags)
  }

  /**
   * @param recoveryPointTags To help organize your resources, you can assign your own metadata to
   * the resources that you create.
   * Each tag is a key-value pair.
   */
  public fun recoveryPointTags(recoveryPointTags: IResolvable) {
    cdkBuilder.recoveryPointTags(recoveryPointTags)
  }

  /**
   * @param ruleName A display name for a backup rule. 
   */
  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  /**
   * @param scheduleExpression A CRON expression specifying when AWS Backup initiates a backup job.
   */
  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  /**
   * @param startWindowMinutes An optional value that specifies a period of time in minutes after a
   * backup is scheduled before a job is canceled if it doesn't start successfully.
   * If this value is included, it must be at least 60 minutes to avoid errors.
   */
  public fun startWindowMinutes(startWindowMinutes: Number) {
    cdkBuilder.startWindowMinutes(startWindowMinutes)
  }

  /**
   * @param targetBackupVault The name of a logical container where backups are stored. 
   * Backup vaults are identified by names that are unique to the account used to create them and
   * the AWS Region where they are created. They consist of letters, numbers, and hyphens.
   */
  public fun targetBackupVault(targetBackupVault: String) {
    cdkBuilder.targetBackupVault(targetBackupVault)
  }

  public fun build(): CfnBackupPlan.BackupRuleResourceTypeProperty {
    if(_copyActions.isNotEmpty()) cdkBuilder.copyActions(_copyActions)
    return cdkBuilder.build()
  }
}
