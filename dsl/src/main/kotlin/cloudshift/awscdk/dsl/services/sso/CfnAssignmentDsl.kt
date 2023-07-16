@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sso.CfnAssignment
import software.constructs.Construct

@CdkDslMarker
public class CfnAssignmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAssignment.Builder = CfnAssignment.Builder.create(scope, id)

  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  public fun permissionSetArn(permissionSetArn: String) {
    cdkBuilder.permissionSetArn(permissionSetArn)
  }

  public fun principalId(principalId: String) {
    cdkBuilder.principalId(principalId)
  }

  public fun principalType(principalType: String) {
    cdkBuilder.principalType(principalType)
  }

  public fun targetId(targetId: String) {
    cdkBuilder.targetId(targetId)
  }

  public fun targetType(targetType: String) {
    cdkBuilder.targetType(targetType)
  }

  public fun build(): CfnAssignment = cdkBuilder.build()
}
