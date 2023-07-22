@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.constructs.Construct

@CdkDslMarker
public class CfnBackupSelectionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBackupSelection.Builder = CfnBackupSelection.Builder.create(scope, id)

  /**
   * Uniquely identifies a backup plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupplanid)
   * @param backupPlanId Uniquely identifies a backup plan. 
   */
  public fun backupPlanId(backupPlanId: String) {
    cdkBuilder.backupPlanId(backupPlanId)
  }

  /**
   * Specifies the body of a request to assign a set of resources to a backup plan.
   *
   * It includes an array of resources, an optional array of patterns to exclude resources, an
   * optional role to provide access to the AWS service the resource belongs to, and an optional array
   * of tags used to identify a set of resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupselection)
   * @param backupSelection Specifies the body of a request to assign a set of resources to a backup
   * plan. 
   */
  public fun backupSelection(backupSelection: IResolvable) {
    cdkBuilder.backupSelection(backupSelection)
  }

  /**
   * Specifies the body of a request to assign a set of resources to a backup plan.
   *
   * It includes an array of resources, an optional array of patterns to exclude resources, an
   * optional role to provide access to the AWS service the resource belongs to, and an optional array
   * of tags used to identify a set of resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html#cfn-backup-backupselection-backupselection)
   * @param backupSelection Specifies the body of a request to assign a set of resources to a backup
   * plan. 
   */
  public
      fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty) {
    cdkBuilder.backupSelection(backupSelection)
  }

  public fun build(): CfnBackupSelection = cdkBuilder.build()
}
