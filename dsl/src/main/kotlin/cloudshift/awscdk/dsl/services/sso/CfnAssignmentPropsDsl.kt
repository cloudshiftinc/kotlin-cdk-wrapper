@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sso.CfnAssignmentProps

@CdkDslMarker
public class CfnAssignmentPropsDsl {
  private val cdkBuilder: CfnAssignmentProps.Builder = CfnAssignmentProps.builder()

  /**
   * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
   * be executed. 
   * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
   * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
   * *AWS General Reference* .
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  /**
   * @param permissionSetArn The ARN of the permission set. 
   */
  public fun permissionSetArn(permissionSetArn: String) {
    cdkBuilder.permissionSetArn(permissionSetArn)
  }

  /**
   * @param principalId An identifier for an object in IAM Identity Center, such as a user or group.
   * 
   * PrincipalIds are GUIDs (For example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more
   * information about PrincipalIds in IAM Identity Center, see the [IAM Identity Center Identity Store
   * API
   * Reference](https://docs.aws.amazon.com//singlesignon/latest/IdentityStoreAPIReference/welcome.html)
   * .
   */
  public fun principalId(principalId: String) {
    cdkBuilder.principalId(principalId)
  }

  /**
   * @param principalType The entity type for which the assignment will be created. 
   */
  public fun principalType(principalType: String) {
    cdkBuilder.principalType(principalType)
  }

  /**
   * @param targetId TargetID is an AWS account identifier, (For example, 123456789012). 
   */
  public fun targetId(targetId: String) {
    cdkBuilder.targetId(targetId)
  }

  /**
   * @param targetType The entity type for which the assignment will be created. 
   */
  public fun targetType(targetType: String) {
    cdkBuilder.targetType(targetType)
  }

  public fun build(): CfnAssignmentProps = cdkBuilder.build()
}
