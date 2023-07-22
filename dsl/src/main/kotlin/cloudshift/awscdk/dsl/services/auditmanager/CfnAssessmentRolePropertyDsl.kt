@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.auditmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.auditmanager.CfnAssessment

@CdkDslMarker
public class CfnAssessmentRolePropertyDsl {
  private val cdkBuilder: CfnAssessment.RoleProperty.Builder = CfnAssessment.RoleProperty.builder()

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the IAM role.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param roleType The type of customer persona.
   *
   * In `CreateAssessment` , `roleType` can only be `PROCESS_OWNER` .
   *
   * In `UpdateSettings` , `roleType` can only be `PROCESS_OWNER` .
   *
   * In `BatchCreateDelegationByAssessment` , `roleType` can only be `RESOURCE_OWNER` .
   */
  public fun roleType(roleType: String) {
    cdkBuilder.roleType(roleType)
  }

  public fun build(): CfnAssessment.RoleProperty = cdkBuilder.build()
}
