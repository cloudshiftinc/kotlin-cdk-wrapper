@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.constructs.Construct

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
   * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
   * resources. 
   */
  public fun backupPlan(backupPlan: IResolvable) {
    cdkBuilder.backupPlan(backupPlan)
  }

  /**
   * Uniquely identifies the backup plan to be associated with the selection of resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplan)
   * @param backupPlan Uniquely identifies the backup plan to be associated with the selection of
   * resources. 
   */
  public fun backupPlan(backupPlan: CfnBackupPlan.BackupPlanResourceTypeProperty) {
    cdkBuilder.backupPlan(backupPlan)
  }

  /**
   * To help organize your resources, you can assign your own metadata to the resources that you
   * create.
   *
   * Each tag is a key-value pair. The specified tags are assigned to all backups created with this
   * plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplantags)
   * @param backupPlanTags To help organize your resources, you can assign your own metadata to the
   * resources that you create. 
   */
  public fun backupPlanTags(backupPlanTags: Map<String, String>) {
    cdkBuilder.backupPlanTags(backupPlanTags)
  }

  /**
   * To help organize your resources, you can assign your own metadata to the resources that you
   * create.
   *
   * Each tag is a key-value pair. The specified tags are assigned to all backups created with this
   * plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupplan.html#cfn-backup-backupplan-backupplantags)
   * @param backupPlanTags To help organize your resources, you can assign your own metadata to the
   * resources that you create. 
   */
  public fun backupPlanTags(backupPlanTags: IResolvable) {
    cdkBuilder.backupPlanTags(backupPlanTags)
  }

  public fun build(): CfnBackupPlan = cdkBuilder.build()
}
