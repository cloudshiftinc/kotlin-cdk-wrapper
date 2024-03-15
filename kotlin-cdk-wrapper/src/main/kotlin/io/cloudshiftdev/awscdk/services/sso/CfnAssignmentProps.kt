@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnAssignment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sso.*;
 * CfnAssignmentProps cfnAssignmentProps = CfnAssignmentProps.builder()
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
public interface CfnAssignmentProps {
  /**
   * The ARN of the IAM Identity Center instance under which the operation will be executed.
   *
   * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
   * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
   * *AWS General Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The ARN of the permission set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-permissionsetarn)
   */
  public fun permissionSetArn(): String

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
   */
  public fun principalId(): String

  /**
   * The entity type for which the assignment will be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-principaltype)
   */
  public fun principalType(): String

  /**
   * TargetID is an AWS account identifier, (For example, 123456789012).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-targetid)
   */
  public fun targetId(): String

  /**
   * The entity type for which the assignment will be created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-targettype)
   */
  public fun targetType(): String

  /**
   * A builder for [CfnAssignmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     * be executed. 
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param permissionSetArn The ARN of the permission set. 
     */
    public fun permissionSetArn(permissionSetArn: String)

    /**
     * @param principalId An identifier for an object in IAM Identity Center, such as a user or
     * group. 
     * PrincipalIds are GUIDs (For example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more
     * information about PrincipalIds in IAM Identity Center, see the [IAM Identity Center Identity
     * Store API
     * Reference](https://docs.aws.amazon.com//singlesignon/latest/IdentityStoreAPIReference/welcome.html)
     * .
     */
    public fun principalId(principalId: String)

    /**
     * @param principalType The entity type for which the assignment will be created. 
     */
    public fun principalType(principalType: String)

    /**
     * @param targetId TargetID is an AWS account identifier, (For example, 123456789012). 
     */
    public fun targetId(targetId: String)

    /**
     * @param targetType The entity type for which the assignment will be created. 
     */
    public fun targetType(targetType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnAssignmentProps.Builder =
        software.amazon.awscdk.services.sso.CfnAssignmentProps.builder()

    /**
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     * be executed. 
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param permissionSetArn The ARN of the permission set. 
     */
    override fun permissionSetArn(permissionSetArn: String) {
      cdkBuilder.permissionSetArn(permissionSetArn)
    }

    /**
     * @param principalId An identifier for an object in IAM Identity Center, such as a user or
     * group. 
     * PrincipalIds are GUIDs (For example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more
     * information about PrincipalIds in IAM Identity Center, see the [IAM Identity Center Identity
     * Store API
     * Reference](https://docs.aws.amazon.com//singlesignon/latest/IdentityStoreAPIReference/welcome.html)
     * .
     */
    override fun principalId(principalId: String) {
      cdkBuilder.principalId(principalId)
    }

    /**
     * @param principalType The entity type for which the assignment will be created. 
     */
    override fun principalType(principalType: String) {
      cdkBuilder.principalType(principalType)
    }

    /**
     * @param targetId TargetID is an AWS account identifier, (For example, 123456789012). 
     */
    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    /**
     * @param targetType The entity type for which the assignment will be created. 
     */
    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build(): software.amazon.awscdk.services.sso.CfnAssignmentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sso.CfnAssignmentProps,
  ) : CdkObject(cdkObject), CfnAssignmentProps {
    /**
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     *
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The ARN of the permission set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-permissionsetarn)
     */
    override fun permissionSetArn(): String = unwrap(this).getPermissionSetArn()

    /**
     * An identifier for an object in IAM Identity Center, such as a user or group.
     *
     * PrincipalIds are GUIDs (For example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more
     * information about PrincipalIds in IAM Identity Center, see the [IAM Identity Center Identity
     * Store API
     * Reference](https://docs.aws.amazon.com//singlesignon/latest/IdentityStoreAPIReference/welcome.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-principalid)
     */
    override fun principalId(): String = unwrap(this).getPrincipalId()

    /**
     * The entity type for which the assignment will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-principaltype)
     */
    override fun principalType(): String = unwrap(this).getPrincipalType()

    /**
     * TargetID is an AWS account identifier, (For example, 123456789012).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-targetid)
     */
    override fun targetId(): String = unwrap(this).getTargetId()

    /**
     * The entity type for which the assignment will be created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-targettype)
     */
    override fun targetType(): String = unwrap(this).getTargetType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssignmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnAssignmentProps):
        CfnAssignmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssignmentProps):
        software.amazon.awscdk.services.sso.CfnAssignmentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sso.CfnAssignmentProps
  }
}
