@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.constructs.Construct

/**
 * Specifies a set of resources to assign to a backup plan.
 *
 * For a sample AWS CloudFormation template, see the [AWS Backup Developer
 * Guide](https://docs.aws.amazon.com/aws-backup/latest/devguide/assigning-resources.html#assigning-resources-cfn)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * Object conditions;
 * CfnBackupSelection cfnBackupSelection = CfnBackupSelection.Builder.create(this,
 * "MyCfnBackupSelection")
 * .backupPlanId("backupPlanId")
 * .backupSelection(BackupSelectionResourceTypeProperty.builder()
 * .iamRoleArn("iamRoleArn")
 * .selectionName("selectionName")
 * // the properties below are optional
 * .conditions(conditions)
 * .listOfTags(List.of(ConditionResourceTypeProperty.builder()
 * .conditionKey("conditionKey")
 * .conditionType("conditionType")
 * .conditionValue("conditionValue")
 * .build()))
 * .notResources(List.of("notResources"))
 * .resources(List.of("resources"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-backup-backupselection.html)
 */
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
