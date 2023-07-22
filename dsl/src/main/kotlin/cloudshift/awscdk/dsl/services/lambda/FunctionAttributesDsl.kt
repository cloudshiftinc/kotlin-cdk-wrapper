@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.Architecture
import software.amazon.awscdk.services.lambda.FunctionAttributes

/**
 * Represents a Lambda function defined outside of this stack.
 *
 * Example:
 *
 * ```
 * IFunction fn = Function.fromFunctionAttributes(this, "Function", FunctionAttributes.builder()
 * .functionArn("arn:aws:lambda:us-east-1:123456789012:function:MyFn")
 * // The following are optional properties for specific use cases and should be used with caution:
 * // Use Case: imported function is in the same account as the stack. This tells the CDK that it
 * // can modify the function's permissions.
 * .sameEnvironment(true)
 * // Use Case: imported function is in a different account and user commits to ensuring that the
 * // imported function has the correct permissions outside the CDK.
 * .skipPermissions(true)
 * .build());
 * ```
 */
@CdkDslMarker
public class FunctionAttributesDsl {
  private val cdkBuilder: FunctionAttributes.Builder = FunctionAttributes.builder()

  /**
   * @param architecture The architecture of this Lambda Function (this is an optional attribute and
   * defaults to X86_64).
   */
  public fun architecture(architecture: Architecture) {
    cdkBuilder.architecture(architecture)
  }

  /**
   * @param functionArn The ARN of the Lambda function. 
   * Format: arn:<partition>:lambda:<region>:<account-id>:function:<function-name>
   */
  public fun functionArn(functionArn: String) {
    cdkBuilder.functionArn(functionArn)
  }

  /**
   * @param role The IAM execution role associated with this function.
   * If the role is not specified, any role-related operations will no-op.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param sameEnvironment Setting this property informs the CDK that the imported function is in
   * the same environment as the stack.
   * This affects certain behaviours such as, whether this function's permission can be modified.
   * When not configured, the CDK attempts to auto-determine this. For environment agnostic stacks,
   * i.e., stacks
   * where the account is not specified with the `env` property, this is determined to be false.
   *
   * Set this to property *ONLY IF* the imported function is in the same account as the stack
   * it's imported in.
   */
  public fun sameEnvironment(sameEnvironment: Boolean) {
    cdkBuilder.sameEnvironment(sameEnvironment)
  }

  /**
   * @param securityGroup The security group of this Lambda, if in a VPC.
   * This needs to be given in order to support allowing connections
   * to this Lambda.
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  /**
   * @param skipPermissions Setting this property informs the CDK that the imported function ALREADY
   * HAS the necessary permissions for what you are trying to do.
   * When not configured, the CDK attempts to auto-determine whether or not
   * additional permissions are necessary on the function when grant APIs are used. If the CDK tried
   * to add
   * permissions on an imported lambda, it will fail.
   *
   * Set this property *ONLY IF* you are committing to manage the imported function's permissions
   * outside of
   * CDK. You are acknowledging that your CDK code alone will have insufficient permissions to
   * access the
   * imported function.
   */
  public fun skipPermissions(skipPermissions: Boolean) {
    cdkBuilder.skipPermissions(skipPermissions)
  }

  public fun build(): FunctionAttributes = cdkBuilder.build()
}
