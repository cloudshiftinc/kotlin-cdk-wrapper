@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRole`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Object assumeRolePolicyDocument;
 * Object policyDocument;
 * CfnRoleProps cfnRoleProps = CfnRoleProps.builder()
 * .assumeRolePolicyDocument(assumeRolePolicyDocument)
 * // the properties below are optional
 * .description("description")
 * .managedPolicyArns(List.of("managedPolicyArns"))
 * .maxSessionDuration(123)
 * .path("path")
 * .permissionsBoundary("permissionsBoundary")
 * .policies(List.of(PolicyProperty.builder()
 * .policyDocument(policyDocument)
 * .policyName("policyName")
 * .build()))
 * .roleName("roleName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html)
 */
public interface CfnRoleProps {
  /**
   * The trust policy that is associated with this role.
   *
   * Trust policies define which entities can assume the role. You can associate only one trust
   * policy with a role. For an example of a policy that can be used to assume a role, see [Template
   * Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#aws-resource-iam-role--examples)
   * . For more information about the elements that you can use in an IAM policy, see [IAM Policy
   * Elements
   * Reference](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html) in
   * the *IAM User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-assumerolepolicydocument)
   */
  public fun assumeRolePolicyDocument(): Any

  /**
   * A description of the role that you provide.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
   * the role.
   *
   * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
   * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
   * *AWS General Reference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managedpolicyarns)
   */
  public fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?: emptyList()

  /**
   * The maximum session duration (in seconds) that you want to set for the specified role.
   *
   * If you do not specify a value for this setting, the default value of one hour is applied. This
   * setting can have a value from 1 hour to 12 hours.
   *
   * Anyone who assumes the role from the AWS CLI or API can use the `DurationSeconds` API parameter
   * or the `duration-seconds` AWS CLI parameter to request a longer session. The `MaxSessionDuration`
   * setting determines the maximum duration that can be requested using the `DurationSeconds`
   * parameter. If users don't specify a value for the `DurationSeconds` parameter, their security
   * credentials are valid for one hour by default. This applies when you use the `AssumeRole*` API
   * operations or the `assume-role*` AWS CLI operations but does not apply when you use those
   * operations to create a console URL. For more information, see [Using IAM
   * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the *IAM User Guide*
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-maxsessionduration)
   */
  public fun maxSessionDuration(): Number? = unwrap(this).getMaxSessionDuration()

  /**
   * The path to the role. For more information about paths, see [IAM
   * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the *IAM
   * User Guide* .
   *
   * This parameter is optional. If it is not included, it defaults to a slash (/).
   *
   * This parameter allows (through its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of either a forward slash (/) by itself or a string that must begin and end with
   * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
   * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
   * lowercased letters.
   *
   * Default: - "/"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-path)
   */
  public fun path(): String? = unwrap(this).getPath()

  /**
   * The ARN of the policy used to set the permissions boundary for the role.
   *
   * For more information about permissions boundaries, see [Permissions boundaries for IAM
   * identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
   * the *IAM User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-permissionsboundary)
   */
  public fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

  /**
   * Adds or updates an inline policy document that is embedded in the specified IAM role.
   *
   * When you embed an inline policy in a role, the inline policy is used as part of the role's
   * access (permissions) policy. The role's trust policy is created at the same time as the role. You
   * can update a role's trust policy later. For more information about IAM roles, go to [Using Roles
   * to Delegate Permissions and Federate
   * Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html) .
   *
   * A role can also have an attached managed policy. For information about policies, see [Managed
   * Policies and Inline
   * Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in the
   * *IAM User Guide* .
   *
   * For information about limits on the number of inline policies that you can embed with a role,
   * see [Limitations on IAM
   * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the *IAM
   * User Guide* .
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies)
   */
  public fun policies(): Any? = unwrap(this).getPolicies()

  /**
   * A name for the IAM role, up to 64 characters in length.
   *
   * For valid values, see the `RoleName` parameter for the
   * [`CreateRole`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html) action in
   * the *IAM User Guide* .
   *
   * This parameter allows (per its [regex
   * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
   * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any
   * of the following characters: _+=,.&#64;-. The role name must be unique within the account. Role
   * names are not distinguished by case. For example, you cannot create roles named both "Role1" and
   * "role1".
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the role name.
   *
   * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
   * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
   * CloudFormation
   * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
   * .
   *
   *
   * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
   * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
   * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
   * {"Ref": "MyResourceName"}]]}` .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-rolename)
   */
  public fun roleName(): String? = unwrap(this).getRoleName()

  /**
   * A list of tags that are attached to the role.
   *
   * For more information about tagging, see [Tagging IAM
   * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User Guide*
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnRoleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumeRolePolicyDocument The trust policy that is associated with this role. 
     * Trust policies define which entities can assume the role. You can associate only one trust
     * policy with a role. For an example of a policy that can be used to assume a role, see [Template
     * Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#aws-resource-iam-role--examples)
     * . For more information about the elements that you can use in an IAM policy, see [IAM Policy
     * Elements
     * Reference](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html) in
     * the *IAM User Guide* .
     */
    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any)

    /**
     * @param description A description of the role that you provide.
     */
    public fun description(description: String)

    /**
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the role.
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    public fun managedPolicyArns(managedPolicyArns: List<String>)

    /**
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the role.
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    public fun managedPolicyArns(vararg managedPolicyArns: String)

    /**
     * @param maxSessionDuration The maximum session duration (in seconds) that you want to set for
     * the specified role.
     * If you do not specify a value for this setting, the default value of one hour is applied.
     * This setting can have a value from 1 hour to 12 hours.
     *
     * Anyone who assumes the role from the AWS CLI or API can use the `DurationSeconds` API
     * parameter or the `duration-seconds` AWS CLI parameter to request a longer session. The
     * `MaxSessionDuration` setting determines the maximum duration that can be requested using the
     * `DurationSeconds` parameter. If users don't specify a value for the `DurationSeconds` parameter,
     * their security credentials are valid for one hour by default. This applies when you use the
     * `AssumeRole*` API operations or the `assume-role*` AWS CLI operations but does not apply when
     * you use those operations to create a console URL. For more information, see [Using IAM
     * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the *IAM User
     * Guide* .
     */
    public fun maxSessionDuration(maxSessionDuration: Number)

    /**
     * @param path The path to the role. For more information about paths, see [IAM
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
     * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
     * lowercased letters.
     */
    public fun path(path: String)

    /**
     * @param permissionsBoundary The ARN of the policy used to set the permissions boundary for the
     * role.
     * For more information about permissions boundaries, see [Permissions boundaries for IAM
     * identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     */
    public fun permissionsBoundary(permissionsBoundary: String)

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM role.
     * When you embed an inline policy in a role, the inline policy is used as part of the role's
     * access (permissions) policy. The role's trust policy is created at the same time as the role.
     * You can update a role's trust policy later. For more information about IAM roles, go to [Using
     * Roles to Delegate Permissions and Federate
     * Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html) .
     *
     * A role can also have an attached managed policy. For information about policies, see [Managed
     * Policies and Inline
     * Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in
     * the *IAM User Guide* .
     *
     * For information about limits on the number of inline policies that you can embed with a role,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
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
    public fun policies(policies: IResolvable)

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM role.
     * When you embed an inline policy in a role, the inline policy is used as part of the role's
     * access (permissions) policy. The role's trust policy is created at the same time as the role.
     * You can update a role's trust policy later. For more information about IAM roles, go to [Using
     * Roles to Delegate Permissions and Federate
     * Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html) .
     *
     * A role can also have an attached managed policy. For information about policies, see [Managed
     * Policies and Inline
     * Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in
     * the *IAM User Guide* .
     *
     * For information about limits on the number of inline policies that you can embed with a role,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
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
    public fun policies(policies: List<Any>)

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM role.
     * When you embed an inline policy in a role, the inline policy is used as part of the role's
     * access (permissions) policy. The role's trust policy is created at the same time as the role.
     * You can update a role's trust policy later. For more information about IAM roles, go to [Using
     * Roles to Delegate Permissions and Federate
     * Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html) .
     *
     * A role can also have an attached managed policy. For information about policies, see [Managed
     * Policies and Inline
     * Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in
     * the *IAM User Guide* .
     *
     * For information about limits on the number of inline policies that you can embed with a role,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
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
    public fun policies(vararg policies: Any)

    /**
     * @param roleName A name for the IAM role, up to 64 characters in length.
     * For valid values, see the `RoleName` parameter for the
     * [`CreateRole`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html) action
     * in the *IAM User Guide* .
     *
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-. The role name must be unique within the account.
     * Role names are not distinguished by case. For example, you cannot create roles named both
     * "Role1" and "role1".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the role name.
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
     * CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
     * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
     * {"Ref": "MyResourceName"}]]}` .
     */
    public fun roleName(roleName: String)

    /**
     * @param tags A list of tags that are attached to the role.
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags that are attached to the role.
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnRoleProps.Builder =
        software.amazon.awscdk.services.iam.CfnRoleProps.builder()

    /**
     * @param assumeRolePolicyDocument The trust policy that is associated with this role. 
     * Trust policies define which entities can assume the role. You can associate only one trust
     * policy with a role. For an example of a policy that can be used to assume a role, see [Template
     * Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#aws-resource-iam-role--examples)
     * . For more information about the elements that you can use in an IAM policy, see [IAM Policy
     * Elements
     * Reference](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html) in
     * the *IAM User Guide* .
     */
    override fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
      cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
    }

    /**
     * @param description A description of the role that you provide.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the role.
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    /**
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     * that you want to attach to the role.
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     */
    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

    /**
     * @param maxSessionDuration The maximum session duration (in seconds) that you want to set for
     * the specified role.
     * If you do not specify a value for this setting, the default value of one hour is applied.
     * This setting can have a value from 1 hour to 12 hours.
     *
     * Anyone who assumes the role from the AWS CLI or API can use the `DurationSeconds` API
     * parameter or the `duration-seconds` AWS CLI parameter to request a longer session. The
     * `MaxSessionDuration` setting determines the maximum duration that can be requested using the
     * `DurationSeconds` parameter. If users don't specify a value for the `DurationSeconds` parameter,
     * their security credentials are valid for one hour by default. This applies when you use the
     * `AssumeRole*` API operations or the `assume-role*` AWS CLI operations but does not apply when
     * you use those operations to create a console URL. For more information, see [Using IAM
     * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the *IAM User
     * Guide* .
     */
    override fun maxSessionDuration(maxSessionDuration: Number) {
      cdkBuilder.maxSessionDuration(maxSessionDuration)
    }

    /**
     * @param path The path to the role. For more information about paths, see [IAM
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
     * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
     * lowercased letters.
     */
    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    /**
     * @param permissionsBoundary The ARN of the policy used to set the permissions boundary for the
     * role.
     * For more information about permissions boundaries, see [Permissions boundaries for IAM
     * identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     */
    override fun permissionsBoundary(permissionsBoundary: String) {
      cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM role.
     * When you embed an inline policy in a role, the inline policy is used as part of the role's
     * access (permissions) policy. The role's trust policy is created at the same time as the role.
     * You can update a role's trust policy later. For more information about IAM roles, go to [Using
     * Roles to Delegate Permissions and Federate
     * Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html) .
     *
     * A role can also have an attached managed policy. For information about policies, see [Managed
     * Policies and Inline
     * Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in
     * the *IAM User Guide* .
     *
     * For information about limits on the number of inline policies that you can embed with a role,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
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
    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM role.
     * When you embed an inline policy in a role, the inline policy is used as part of the role's
     * access (permissions) policy. The role's trust policy is created at the same time as the role.
     * You can update a role's trust policy later. For more information about IAM roles, go to [Using
     * Roles to Delegate Permissions and Federate
     * Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html) .
     *
     * A role can also have an attached managed policy. For information about policies, see [Managed
     * Policies and Inline
     * Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in
     * the *IAM User Guide* .
     *
     * For information about limits on the number of inline policies that you can embed with a role,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
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
    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     * IAM role.
     * When you embed an inline policy in a role, the inline policy is used as part of the role's
     * access (permissions) policy. The role's trust policy is created at the same time as the role.
     * You can update a role's trust policy later. For more information about IAM roles, go to [Using
     * Roles to Delegate Permissions and Federate
     * Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html) .
     *
     * A role can also have an attached managed policy. For information about policies, see [Managed
     * Policies and Inline
     * Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in
     * the *IAM User Guide* .
     *
     * For information about limits on the number of inline policies that you can embed with a role,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
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
    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    /**
     * @param roleName A name for the IAM role, up to 64 characters in length.
     * For valid values, see the `RoleName` parameter for the
     * [`CreateRole`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html) action
     * in the *IAM User Guide* .
     *
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-. The role name must be unique within the account.
     * Role names are not distinguished by case. For example, you cannot create roles named both
     * "Role1" and "role1".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the role name.
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
     * CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
     * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
     * {"Ref": "MyResourceName"}]]}` .
     */
    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    /**
     * @param tags A list of tags that are attached to the role.
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags that are attached to the role.
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnRoleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnRoleProps,
  ) : CdkObject(cdkObject), CfnRoleProps {
    /**
     * The trust policy that is associated with this role.
     *
     * Trust policies define which entities can assume the role. You can associate only one trust
     * policy with a role. For an example of a policy that can be used to assume a role, see [Template
     * Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#aws-resource-iam-role--examples)
     * . For more information about the elements that you can use in an IAM policy, see [IAM Policy
     * Elements
     * Reference](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html) in
     * the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-assumerolepolicydocument)
     */
    override fun assumeRolePolicyDocument(): Any = unwrap(this).getAssumeRolePolicyDocument()

    /**
     * A description of the role that you provide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
     * the role.
     *
     * For more information about ARNs, see [Amazon Resource Names (ARNs) and AWS Service
     * Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html) in the
     * *AWS General Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managedpolicyarns)
     */
    override fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
        emptyList()

    /**
     * The maximum session duration (in seconds) that you want to set for the specified role.
     *
     * If you do not specify a value for this setting, the default value of one hour is applied.
     * This setting can have a value from 1 hour to 12 hours.
     *
     * Anyone who assumes the role from the AWS CLI or API can use the `DurationSeconds` API
     * parameter or the `duration-seconds` AWS CLI parameter to request a longer session. The
     * `MaxSessionDuration` setting determines the maximum duration that can be requested using the
     * `DurationSeconds` parameter. If users don't specify a value for the `DurationSeconds` parameter,
     * their security credentials are valid for one hour by default. This applies when you use the
     * `AssumeRole*` API operations or the `assume-role*` AWS CLI operations but does not apply when
     * you use those operations to create a console URL. For more information, see [Using IAM
     * roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the *IAM User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-maxsessionduration)
     */
    override fun maxSessionDuration(): Number? = unwrap(this).getMaxSessionDuration()

    /**
     * The path to the role. For more information about paths, see [IAM
     * Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in the
     * *IAM User Guide* .
     *
     * This parameter is optional. If it is not included, it defaults to a slash (/).
     *
     * This parameter allows (through its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of either a forward slash (/) by itself or a string that must begin and end with
     * forward slashes. In addition, it can contain any ASCII character from the ! ( `\u0021` ) through
     * the DEL character ( `\u007F` ), including most punctuation characters, digits, and upper and
     * lowercased letters.
     *
     * Default: - "/"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-path)
     */
    override fun path(): String? = unwrap(this).getPath()

    /**
     * The ARN of the policy used to set the permissions boundary for the role.
     *
     * For more information about permissions boundaries, see [Permissions boundaries for IAM
     * identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html) in
     * the *IAM User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-permissionsboundary)
     */
    override fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

    /**
     * Adds or updates an inline policy document that is embedded in the specified IAM role.
     *
     * When you embed an inline policy in a role, the inline policy is used as part of the role's
     * access (permissions) policy. The role's trust policy is created at the same time as the role.
     * You can update a role's trust policy later. For more information about IAM roles, go to [Using
     * Roles to Delegate Permissions and Federate
     * Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html) .
     *
     * A role can also have an attached managed policy. For information about policies, see [Managed
     * Policies and Inline
     * Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html) in
     * the *IAM User Guide* .
     *
     * For information about limits on the number of inline policies that you can embed with a role,
     * see [Limitations on IAM
     * Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html) in the
     * *IAM User Guide* .
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies)
     */
    override fun policies(): Any? = unwrap(this).getPolicies()

    /**
     * A name for the IAM role, up to 64 characters in length.
     *
     * For valid values, see the `RoleName` parameter for the
     * [`CreateRole`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html) action
     * in the *IAM User Guide* .
     *
     * This parameter allows (per its [regex
     * pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of characters
     * consisting of upper and lowercase alphanumeric characters with no spaces. You can also include
     * any of the following characters: _+=,.&#64;-. The role name must be unique within the account.
     * Role names are not distinguished by case. For example, you cannot create roles named both
     * "Role1" and "role1".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the role name.
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see [Acknowledging IAM Resources in AWS
     * CloudFormation
     * Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create a
     * Region-specific name, as in the following example: `{"Fn::Join": ["", [{"Ref": "AWS::Region"},
     * {"Ref": "MyResourceName"}]]}` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-rolename)
     */
    override fun roleName(): String? = unwrap(this).getRoleName()

    /**
     * A list of tags that are attached to the role.
     *
     * For more information about tagging, see [Tagging IAM
     * resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in the *IAM User
     * Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRoleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnRoleProps): CfnRoleProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRoleProps): software.amazon.awscdk.services.iam.CfnRoleProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnRoleProps
  }
}
