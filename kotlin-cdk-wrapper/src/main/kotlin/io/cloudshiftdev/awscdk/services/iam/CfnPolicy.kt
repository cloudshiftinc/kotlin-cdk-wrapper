@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds or updates an inline policy document that is embedded in the specified IAM group, user or
 * role.
 *
 * An IAM user can also have a managed policy attached to it. For information about policies, see
 * [Managed Policies and Inline
 * Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in the
 * *IAM User Guide* .
 *
 * The Groups, Roles, and Users properties are optional. However, you must specify at least one of
 * these properties.
 *
 * For information about policy documents see [Creating IAM
 * policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_create.html) in the *IAM
 * User Guide* .
 *
 * For information about limits on the number of inline policies that you can embed in an identity,
 * see [Limitations on IAM
 * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the *IAM
 * User Guide* .
 *
 *
 * This resource does not support [drift
 * detection](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html)
 * . The following inline policy resource types support drift detection:
 *
 * *
 * [`AWS::IAM::GroupPolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-grouppolicy.html)
 * *
 * [`AWS::IAM::RolePolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html)
 * *
 * [`AWS::IAM::UserPolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-userpolicy.html)
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object policyDocument;
 * CfnPolicy cfnPolicy = CfnPolicy.Builder.create(this, "MyCfnPolicy")
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
public open class CfnPolicy(
  cdkObject: software.amazon.awscdk.services.iam.CfnPolicy,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPolicyProps,
  ) :
      this(software.amazon.awscdk.services.iam.CfnPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPolicyProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the group to associate the policy with.
   */
  public open fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  /**
   * The name of the group to associate the policy with.
   */
  public open fun groups(`value`: List<String>) {
    unwrap(this).setGroups(`value`)
  }

  /**
   * The name of the group to associate the policy with.
   */
  public open fun groups(vararg `value`: String): Unit = groups(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The policy document.
   */
  public open fun policyDocument(): Any = unwrap(this).getPolicyDocument()

  /**
   * The policy document.
   */
  public open fun policyDocument(`value`: Any) {
    unwrap(this).setPolicyDocument(`value`)
  }

  /**
   * The name of the policy document.
   */
  public open fun policyName(): String = unwrap(this).getPolicyName()

  /**
   * The name of the policy document.
   */
  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  /**
   * The name of the role to associate the policy with.
   */
  public open fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

  /**
   * The name of the role to associate the policy with.
   */
  public open fun roles(`value`: List<String>) {
    unwrap(this).setRoles(`value`)
  }

  /**
   * The name of the role to associate the policy with.
   */
  public open fun roles(vararg `value`: String): Unit = roles(`value`.toList())

  /**
   * The name of the user to associate the policy with.
   */
  public open fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()

  /**
   * The name of the user to associate the policy with.
   */
  public open fun users(`value`: List<String>) {
    unwrap(this).setUsers(`value`)
  }

  /**
   * The name of the user to associate the policy with.
   */
  public open fun users(vararg `value`: String): Unit = users(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the group to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups)
     * @param groups The name of the group to associate the policy with. 
     */
    public fun groups(groups: List<String>)

    /**
     * The name of the group to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups)
     * @param groups The name of the group to associate the policy with. 
     */
    public fun groups(vararg groups: String)

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
     * @param policyDocument The policy document. 
     */
    public fun policyDocument(policyDocument: Any)

    /**
     * The name of the policy document.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname)
     * @param policyName The name of the policy document. 
     */
    public fun policyName(policyName: String)

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
     * @param roles The name of the role to associate the policy with. 
     */
    public fun roles(roles: List<String>)

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
     * @param roles The name of the role to associate the policy with. 
     */
    public fun roles(vararg roles: String)

    /**
     * The name of the user to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users)
     * @param users The name of the user to associate the policy with. 
     */
    public fun users(users: List<String>)

    /**
     * The name of the user to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users)
     * @param users The name of the user to associate the policy with. 
     */
    public fun users(vararg users: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnPolicy.Builder =
        software.amazon.awscdk.services.iam.CfnPolicy.Builder.create(scope, id)

    /**
     * The name of the group to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups)
     * @param groups The name of the group to associate the policy with. 
     */
    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    /**
     * The name of the group to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups)
     * @param groups The name of the group to associate the policy with. 
     */
    override fun groups(vararg groups: String): Unit = groups(groups.toList())

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
     * @param policyDocument The policy document. 
     */
    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The name of the policy document.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname)
     * @param policyName The name of the policy document. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

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
     * @param roles The name of the role to associate the policy with. 
     */
    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

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
     * @param roles The name of the role to associate the policy with. 
     */
    override fun roles(vararg roles: String): Unit = roles(roles.toList())

    /**
     * The name of the user to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users)
     * @param users The name of the user to associate the policy with. 
     */
    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    /**
     * The name of the user to associate the policy with.
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users)
     * @param users The name of the user to associate the policy with. 
     */
    override fun users(vararg users: String): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnPolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.iam.CfnPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnPolicy): CfnPolicy =
        CfnPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnPolicy): software.amazon.awscdk.services.iam.CfnPolicy =
        wrapped.cdkObject as software.amazon.awscdk.services.iam.CfnPolicy
  }
}
