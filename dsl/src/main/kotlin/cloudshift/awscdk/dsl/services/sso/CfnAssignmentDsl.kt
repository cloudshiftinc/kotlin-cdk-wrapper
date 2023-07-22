@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sso.CfnAssignment
import software.constructs.Construct

/**
 * Assigns access to a Principal for a specified AWS account using a specified permission set.
 *
 *
 * The term *principal* here refers to a user or group that is defined in IAM Identity Center .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sso.*;
 * CfnAssignment cfnAssignment = CfnAssignment.Builder.create(this, "MyCfnAssignment")
 * .instanceArn("instanceArn")
 * .permissionSetArn("permissionSetArn")
 * .principalId("principalId")
 * .principalType("principalType")
 * .targetId("targetId")
 * .targetType("targetType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html)
 */
@CdkDslMarker
public class CfnAssignmentDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAssignment.Builder = CfnAssignment.Builder.create(scope, id)

  /**
   * The ARN of the IAM Identity Center instance under which the operation will be executed.
   *
   * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
   * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
   * *AWS General Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-instancearn)
   * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
   * be executed. 
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  /**
   * The ARN of the permission set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-permissionsetarn)
   * @param permissionSetArn The ARN of the permission set. 
   */
  public fun permissionSetArn(permissionSetArn: String) {
    cdkBuilder.permissionSetArn(permissionSetArn)
  }

  /**
   * An identifier for an object in IAM Identity Center, such as a user or group.
   *
   * PrincipalIds are GUIDs (For example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more
   * information about PrincipalIds in IAM Identity Center, see the [IAM Identity Center Identity Store
   * API
   * Reference](https://docs.aws.amazon.com//singlesignon/latest/IdentityStoreAPIReference/welcome.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-principalid)
   * @param principalId An identifier for an object in IAM Identity Center, such as a user or group.
   * 
   */
  public fun principalId(principalId: String) {
    cdkBuilder.principalId(principalId)
  }

  /**
   * The entity type for which the assignment will be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-principaltype)
   * @param principalType The entity type for which the assignment will be created. 
   */
  public fun principalType(principalType: String) {
    cdkBuilder.principalType(principalType)
  }

  /**
   * TargetID is an AWS account identifier, (For example, 123456789012).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-targetid)
   * @param targetId TargetID is an AWS account identifier, (For example, 123456789012). 
   */
  public fun targetId(targetId: String) {
    cdkBuilder.targetId(targetId)
  }

  /**
   * The entity type for which the assignment will be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-targettype)
   * @param targetType The entity type for which the assignment will be created. 
   */
  public fun targetType(targetType: String) {
    cdkBuilder.targetType(targetType)
  }

  public fun build(): CfnAssignment = cdkBuilder.build()
}
