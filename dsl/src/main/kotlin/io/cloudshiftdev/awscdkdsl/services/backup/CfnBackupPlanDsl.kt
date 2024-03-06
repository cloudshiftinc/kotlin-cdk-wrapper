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
import software.constructs.Construct

/**
 * Contains an optional backup plan display name and an array of `BackupRule` objects, each of which
 * specifies a backup rule.
 *
 * Each rule in a backup plan is a separate scheduled task and can back up a different selection of
 * AWS resources.
 *
 * For a sample AWS CloudFormation template, see the
 * [AWS Backup Developer Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/assigning-resources.html#assigning-resources-cfn)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * Object backupOptions;
 * CfnBackupPlan cfnBackupPlan = CfnBackupPlan.Builder.create(this, "MyCfnBackupPlan")
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
 * .optInToArchiveForSupportedResources(false)
 * .build())
 * .build()))
 * .enableContinuousBackup(false)
 * .lifecycle(LifecycleResourceTypeProperty.builder()
 * .deleteAfterDays(123)
 * .moveToColdStorageAfterDays(123)
 * .optInToArchiveForSupportedResources(false)
 * .build())
 * .recoveryPointTags(Map.of(
 * "recoveryPointTagsKey", "recoveryPointTags"))
 * .scheduleExpression("scheduleExpression")
 * .scheduleExpressionTimezone("scheduleExpressionTimezone")
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
public class CfnBackupPlanDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBackupPlan.Builder = CfnBackupPlan.Builder.create(scope, id)

    /**
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplan)
     *
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     *   resources.
     */
    public fun backupPlan(backupPlan: IResolvable) {
        cdkBuilder.backupPlan(backupPlan)
    }

    /**
     * Uniquely identifies the backup plan to be associated with the selection of resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplan)
     *
     * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
     *   resources.
     */
    public fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty) {
        cdkBuilder.backupPlan(backupPlan)
    }

    /**
     * To help organize your resources, you can assign your own metadata to the resources that you
     * create.
     *
     * Each tag is a key-value pair. The specified tags are assigned to all backups created with
     * this plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplantags)
     *
     * @param backupPlanTags To help organize your resources, you can assign your own metadata to
     *   the resources that you create.
     */
    public fun backupPlanTags(backupPlanTags: Map<String, String>) {
        cdkBuilder.backupPlanTags(backupPlanTags)
    }

    public fun build(): CfnBackupPlan = cdkBuilder.build()
}
