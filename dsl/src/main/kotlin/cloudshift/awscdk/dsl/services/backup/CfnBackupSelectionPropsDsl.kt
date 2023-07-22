@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.backup.CfnBackupSelection
import software.amazon.awscdk.services.backup.CfnBackupSelectionProps

/**
 * Properties for defining a `CfnBackupSelection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * Object conditions;
 * CfnBackupSelectionProps cfnBackupSelectionProps = CfnBackupSelectionProps.builder()
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
public class CfnBackupSelectionPropsDsl {
  private val cdkBuilder: CfnBackupSelectionProps.Builder = CfnBackupSelectionProps.builder()

  /**
   * @param backupPlanId Uniquely identifies a backup plan. 
   */
  public fun backupPlanId(backupPlanId: String) {
    cdkBuilder.backupPlanId(backupPlanId)
  }

  /**
   * @param backupSelection Specifies the body of a request to assign a set of resources to a backup
   * plan. 
   * It includes an array of resources, an optional array of patterns to exclude resources, an
   * optional role to provide access to the AWS service the resource belongs to, and an optional array
   * of tags used to identify a set of resources.
   */
  public fun backupSelection(backupSelection: IResolvable) {
    cdkBuilder.backupSelection(backupSelection)
  }

  /**
   * @param backupSelection Specifies the body of a request to assign a set of resources to a backup
   * plan. 
   * It includes an array of resources, an optional array of patterns to exclude resources, an
   * optional role to provide access to the AWS service the resource belongs to, and an optional array
   * of tags used to identify a set of resources.
   */
  public
      fun backupSelection(backupSelection: CfnBackupSelection.BackupSelectionResourceTypeProperty) {
    cdkBuilder.backupSelection(backupSelection)
  }

  public fun build(): CfnBackupSelectionProps = cdkBuilder.build()
}
