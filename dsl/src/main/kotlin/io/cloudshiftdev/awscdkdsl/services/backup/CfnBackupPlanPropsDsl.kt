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
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.amazon.awscdk.services.backup.CfnBackupPlanProps

/**
 * Properties for defining a `CfnBackupPlan`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * Object backupOptions;
 * CfnBackupPlanProps cfnBackupPlanProps = CfnBackupPlanProps.builder()
 * .backupPlan(BackupPlanResourceTypeProperty.builder()
 * .backupPlanName("backupPlanName")
 * .backupPlanRule(List.of(BackupRuleResourceTypeProperty.builder()
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
 * .build()))
 * // the properties below are optional
 * .advancedBackupSettings(List.of(AdvancedBackupSettingResourceTypeProperty.builder()
 * .backupOptions(backupOptions)
 * .resourceType("resourceType")
 * .build()))
 * .build())
 * // the properties below are optional
 * .backupPlanTags(Map.of(
 * "backupPlanTagsKey", "backupPlanTags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html)
 */
@CdkDslMarker
public class CfnBackupPlanPropsDsl {
    private val cdkBuilder: CfnBackupPlanProps.Builder = CfnBackupPlanProps.builder()

    /**
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     *   resources.
     */
    public fun backupPlan(backupPlan: IResolvable) {
        cdkBuilder.backupPlan(backupPlan)
    }

    /**
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     *   resources.
     */
    public fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty) {
        cdkBuilder.backupPlan(backupPlan)
    }

    /**
     * @param backupPlanTags To help organize your resources, you can assign your own metadata to
     *   the resources that you create. Each tag is a key-value pair. The specified tags are
     *   assigned to all backups created with this plan.
     */
    public fun backupPlanTags(backupPlanTags: Map<String, String>) {
        cdkBuilder.backupPlanTags(backupPlanTags)
    }

    /**
     * @param backupPlanTags To help organize your resources, you can assign your own metadata to
     *   the resources that you create. Each tag is a key-value pair. The specified tags are
     *   assigned to all backups created with this plan.
     */
    public fun backupPlanTags(backupPlanTags: IResolvable) {
        cdkBuilder.backupPlanTags(backupPlanTags)
    }

    public fun build(): CfnBackupPlanProps = cdkBuilder.build()
}
