@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

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
public interface FunctionAttributes {
  /**
   * The architecture of this Lambda Function (this is an optional attribute and defaults to
   * X86_64).
   *
   * Default: - Architecture.X86_64
   */
  public fun architecture(): Architecture? = unwrap(this).getArchitecture()?.let(Architecture::wrap)

  /**
   * The ARN of the Lambda function.
   *
   * Format: arn:<partition>:lambda:<region>:<account-id>:function:<function-name>
   */
  public fun functionArn(): String

  /**
   * The IAM execution role associated with this function.
   *
   * If the role is not specified, any role-related operations will no-op.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * Setting this property informs the CDK that the imported function is in the same environment as
   * the stack.
   *
   * This affects certain behaviours such as, whether this function's permission can be modified.
   * When not configured, the CDK attempts to auto-determine this. For environment agnostic stacks,
   * i.e., stacks
   * where the account is not specified with the `env` property, this is determined to be false.
   *
   * Set this to property *ONLY IF* the imported function is in the same account as the stack
   * it's imported in.
   *
   * Default: - depends: true, if the Stack is configured with an explicit `env` (account and
   * region) and the account is the same as this function.
   * For environment-agnostic stacks this will default to `false`.
   */
  public fun sameEnvironment(): Boolean? = unwrap(this).getSameEnvironment()

  /**
   * The security group of this Lambda, if in a VPC.
   *
   * This needs to be given in order to support allowing connections
   * to this Lambda.
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * Setting this property informs the CDK that the imported function ALREADY HAS the necessary
   * permissions for what you are trying to do.
   *
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
   *
   * Default: false
   */
  public fun skipPermissions(): Boolean? = unwrap(this).getSkipPermissions()

  /**
   * A builder for [FunctionAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param architecture The architecture of this Lambda Function (this is an optional attribute
     * and defaults to X86_64).
     */
    public fun architecture(architecture: Architecture)

    /**
     * @param functionArn The ARN of the Lambda function. 
     * Format: arn:<partition>:lambda:<region>:<account-id>:function:<function-name>
     */
    public fun functionArn(functionArn: String)

    /**
     * @param role The IAM execution role associated with this function.
     * If the role is not specified, any role-related operations will no-op.
     */
    public fun role(role: IRole)

    /**
     * @param sameEnvironment Setting this property informs the CDK that the imported function is in
     * the same environment as the stack.
     * This affects certain behaviours such as, whether this function's permission can be modified.
     * When not configured, the CDK attempts to auto-determine this. For environment agnostic
     * stacks, i.e., stacks
     * where the account is not specified with the `env` property, this is determined to be false.
     *
     * Set this to property *ONLY IF* the imported function is in the same account as the stack
     * it's imported in.
     */
    public fun sameEnvironment(sameEnvironment: Boolean)

    /**
     * @param securityGroup The security group of this Lambda, if in a VPC.
     * This needs to be given in order to support allowing connections
     * to this Lambda.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)

    /**
     * @param skipPermissions Setting this property informs the CDK that the imported function
     * ALREADY HAS the necessary permissions for what you are trying to do.
     * When not configured, the CDK attempts to auto-determine whether or not
     * additional permissions are necessary on the function when grant APIs are used. If the CDK
     * tried to add
     * permissions on an imported lambda, it will fail.
     *
     * Set this property *ONLY IF* you are committing to manage the imported function's permissions
     * outside of
     * CDK. You are acknowledging that your CDK code alone will have insufficient permissions to
     * access the
     * imported function.
     */
    public fun skipPermissions(skipPermissions: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.FunctionAttributes.Builder =
        software.amazon.awscdk.services.lambda.FunctionAttributes.builder()

    /**
     * @param architecture The architecture of this Lambda Function (this is an optional attribute
     * and defaults to X86_64).
     */
    override fun architecture(architecture: Architecture) {
      cdkBuilder.architecture(architecture.let(Architecture::unwrap))
    }

    /**
     * @param functionArn The ARN of the Lambda function. 
     * Format: arn:<partition>:lambda:<region>:<account-id>:function:<function-name>
     */
    override fun functionArn(functionArn: String) {
      cdkBuilder.functionArn(functionArn)
    }

    /**
     * @param role The IAM execution role associated with this function.
     * If the role is not specified, any role-related operations will no-op.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param sameEnvironment Setting this property informs the CDK that the imported function is in
     * the same environment as the stack.
     * This affects certain behaviours such as, whether this function's permission can be modified.
     * When not configured, the CDK attempts to auto-determine this. For environment agnostic
     * stacks, i.e., stacks
     * where the account is not specified with the `env` property, this is determined to be false.
     *
     * Set this to property *ONLY IF* the imported function is in the same account as the stack
     * it's imported in.
     */
    override fun sameEnvironment(sameEnvironment: Boolean) {
      cdkBuilder.sameEnvironment(sameEnvironment)
    }

    /**
     * @param securityGroup The security group of this Lambda, if in a VPC.
     * This needs to be given in order to support allowing connections
     * to this Lambda.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    /**
     * @param skipPermissions Setting this property informs the CDK that the imported function
     * ALREADY HAS the necessary permissions for what you are trying to do.
     * When not configured, the CDK attempts to auto-determine whether or not
     * additional permissions are necessary on the function when grant APIs are used. If the CDK
     * tried to add
     * permissions on an imported lambda, it will fail.
     *
     * Set this property *ONLY IF* you are committing to manage the imported function's permissions
     * outside of
     * CDK. You are acknowledging that your CDK code alone will have insufficient permissions to
     * access the
     * imported function.
     */
    override fun skipPermissions(skipPermissions: Boolean) {
      cdkBuilder.skipPermissions(skipPermissions)
    }

    public fun build(): software.amazon.awscdk.services.lambda.FunctionAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.FunctionAttributes,
  ) : CdkObject(cdkObject), FunctionAttributes {
    /**
     * The architecture of this Lambda Function (this is an optional attribute and defaults to
     * X86_64).
     *
     * Default: - Architecture.X86_64
     */
    override fun architecture(): Architecture? =
        unwrap(this).getArchitecture()?.let(Architecture::wrap)

    /**
     * The ARN of the Lambda function.
     *
     * Format: arn:<partition>:lambda:<region>:<account-id>:function:<function-name>
     */
    override fun functionArn(): String = unwrap(this).getFunctionArn()

    /**
     * The IAM execution role associated with this function.
     *
     * If the role is not specified, any role-related operations will no-op.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * Setting this property informs the CDK that the imported function is in the same environment
     * as the stack.
     *
     * This affects certain behaviours such as, whether this function's permission can be modified.
     * When not configured, the CDK attempts to auto-determine this. For environment agnostic
     * stacks, i.e., stacks
     * where the account is not specified with the `env` property, this is determined to be false.
     *
     * Set this to property *ONLY IF* the imported function is in the same account as the stack
     * it's imported in.
     *
     * Default: - depends: true, if the Stack is configured with an explicit `env` (account and
     * region) and the account is the same as this function.
     * For environment-agnostic stacks this will default to `false`.
     */
    override fun sameEnvironment(): Boolean? = unwrap(this).getSameEnvironment()

    /**
     * The security group of this Lambda, if in a VPC.
     *
     * This needs to be given in order to support allowing connections
     * to this Lambda.
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

    /**
     * Setting this property informs the CDK that the imported function ALREADY HAS the necessary
     * permissions for what you are trying to do.
     *
     * When not configured, the CDK attempts to auto-determine whether or not
     * additional permissions are necessary on the function when grant APIs are used. If the CDK
     * tried to add
     * permissions on an imported lambda, it will fail.
     *
     * Set this property *ONLY IF* you are committing to manage the imported function's permissions
     * outside of
     * CDK. You are acknowledging that your CDK code alone will have insufficient permissions to
     * access the
     * imported function.
     *
     * Default: false
     */
    override fun skipPermissions(): Boolean? = unwrap(this).getSkipPermissions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FunctionAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.FunctionAttributes):
        FunctionAttributes = CdkObjectWrappers.wrap(cdkObject) as FunctionAttributes

    internal fun unwrap(wrapped: FunctionAttributes):
        software.amazon.awscdk.services.lambda.FunctionAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.FunctionAttributes
  }
}
