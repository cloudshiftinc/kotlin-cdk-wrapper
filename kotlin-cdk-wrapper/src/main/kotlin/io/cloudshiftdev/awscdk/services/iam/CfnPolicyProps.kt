@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object policyDocument;
 * CfnPolicyProps cfnPolicyProps = CfnPolicyProps.builder()
 * .policyDocument(policyDocument)
 * .policyName("policyName")
 * // the properties below are optional
 * .groups(List.of("groups"))
 * .roles(List.of("roles"))
 * .users(List.of("users"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html)
 */
public interface CfnPolicyProps {
  /**
   * The name of the group to associate the policy with.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups)
   */
  public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  /**
   * The policy document.
   *
   * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
   * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
   * converts a YAML policy to JSON format before submitting it to IAM.
   *
   * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
   * validate this parameter is a string of characters consisting of the following:
   *
   * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
   * of the ASCII character range
   * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
   * `\u00FF` )
   * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
   * `\u000D` )
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
   */
  public fun policyDocument(): Any

  /**
   * The name of the policy document.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname)
   */
  public fun policyName(): String

  /**
   * The name of the role to associate the policy with.
   *
   * This parameter allows (per its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   *
   * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref` to
   * a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role, add a
   * `DependsOn` attribute to the resource to make the resource depend on the external policy. This
   * dependency ensures that the role's policy is available throughout the resource's lifecycle. For
   * example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn` attribute
   * ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before deleting its
   * role's policy.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-roles)
   */
  public fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

  /**
   * The name of the user to associate the policy with.
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users)
   */
  public fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()

  /**
   * A builder for [CfnPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param groups The name of the group to associate the policy with.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-.
     */
    public fun groups(groups: List<String>)

    /**
     * @param groups The name of the group to associate the policy with.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-.
     */
    public fun groups(vararg groups: String)

    /**
     * @param policyDocument The policy document. 
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     *
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     * of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     * `\u000D` )
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * @param policyName The name of the policy document. 
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun policyName(policyName: String)

    /**
     * @param roles The name of the role to associate the policy with.
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external policy.
     * This dependency ensures that the role's policy is available throughout the resource's lifecycle.
     * For example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn`
     * attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before
     * deleting its role's policy.
     */
    public fun roles(roles: List<String>)

    /**
     * @param roles The name of the role to associate the policy with.
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external policy.
     * This dependency ensures that the role's policy is available throughout the resource's lifecycle.
     * For example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn`
     * attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before
     * deleting its role's policy.
     */
    public fun roles(vararg roles: String)

    /**
     * @param users The name of the user to associate the policy with.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun users(users: List<String>)

    /**
     * @param users The name of the user to associate the policy with.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    public fun users(vararg users: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnPolicyProps.Builder =
        software.amazon.awscdk.services.iam.CfnPolicyProps.builder()

    /**
     * @param groups The name of the group to associate the policy with.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-.
     */
    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    /**
     * @param groups The name of the group to associate the policy with.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-.
     */
    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    /**
     * @param policyDocument The policy document. 
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     *
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     * of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     * `\u000D` )
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param policyName The name of the policy document. 
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * @param roles The name of the role to associate the policy with.
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external policy.
     * This dependency ensures that the role's policy is available throughout the resource's lifecycle.
     * For example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn`
     * attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before
     * deleting its role's policy.
     */
    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

    /**
     * @param roles The name of the role to associate the policy with.
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external policy.
     * This dependency ensures that the role's policy is available throughout the resource's lifecycle.
     * For example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn`
     * attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before
     * deleting its role's policy.
     */
    override fun roles(vararg roles: String): Unit = roles(roles.toList())

    /**
     * @param users The name of the user to associate the policy with.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    /**
     * @param users The name of the user to associate the policy with.
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     */
    override fun users(vararg users: String): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iam.CfnPolicyProps,
  ) : CdkObject(cdkObject), CfnPolicyProps {
    /**
     * The name of the group to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups)
     */
    override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    /**
     * The policy document.
     *
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation always
     * converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     *
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     * of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     * `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     * `\u000D` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     */
    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

    /**
     * The name of the policy document.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname)
     */
    override fun policyName(): String = unwrap(this).getPolicyName()

    /**
     * The name of the role to associate the policy with.
     *
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external policy.
     * This dependency ensures that the role's policy is available throughout the resource's lifecycle.
     * For example, when you delete a stack with an `AWS::ECS::Service` resource, the `DependsOn`
     * attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service` resource before
     * deleting its role's policy.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-roles)
     */
    override fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

    /**
     * The name of the user to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users)
     */
    override fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnPolicyProps): CfnPolicyProps
        = CdkObjectWrappers.wrap(cdkObject) as? CfnPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyProps): software.amazon.awscdk.services.iam.CfnPolicyProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnPolicyProps
  }
}
