@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.CfnPolicy
import software.constructs.Construct

/**
 * Adds or updates an inline policy document that is embedded in the specified IAM group, user or
 * role.
 *
 * An IAM user can also have a managed policy attached to it. For information about policies, see
 * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
 * in the *IAM User Guide* .
 *
 * The Groups, Roles, and Users properties are optional. However, you must specify at least one of
 * these properties.
 *
 * For information about policy documents see
 * [Creating IAM policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_create.html)
 * in the *IAM User Guide* .
 *
 * For information about limits on the number of inline policies that you can embed in an identity,
 * see
 * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
 * in the *IAM User Guide* .
 *
 * This resource does not support
 * [drift detection](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html)
 * . The following inline policy resource types support drift detection:
 * *
 * [`AWS::IAM::GroupPolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-grouppolicy.html)
 * *
 * [`AWS::IAM::RolePolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-rolepolicy.html)
 * *
 * [`AWS::IAM::UserPolicy`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-userpolicy.html)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
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
@CdkDslMarker
public class CfnPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPolicy.Builder = CfnPolicy.Builder.create(scope, id)

    private val _groups: MutableList<String> = mutableListOf()

    private val _roles: MutableList<String> = mutableListOf()

    private val _users: MutableList<String> = mutableListOf()

    /**
     * The name of the group to associate the policy with.
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups)
     *
     * @param groups The name of the group to associate the policy with.
     */
    public fun groups(vararg groups: String) {
        _groups.addAll(listOf(*groups))
    }

    /**
     * The name of the group to associate the policy with.
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-groups)
     *
     * @param groups The name of the group to associate the policy with.
     */
    public fun groups(groups: Collection<String>) {
        _groups.addAll(groups)
    }

    /**
     * The policy document.
     *
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation
     * always converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     *   of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     *   `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     *   `\u000D` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     *
     * @param policyDocument The policy document.
     */
    public fun policyDocument(policyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyDocument)
        cdkBuilder.policyDocument(builder.map)
    }

    /**
     * The policy document.
     *
     * You must provide policies in JSON format in IAM. However, for AWS CloudFormation templates
     * formatted in YAML, you can provide the policy in JSON or YAML format. AWS CloudFormation
     * always converts a YAML policy to JSON format before submitting it to IAM.
     *
     * The [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) used to
     * validate this parameter is a string of characters consisting of the following:
     * * Any printable ASCII character ranging from the space character ( `\u0020` ) through the end
     *   of the ASCII character range
     * * The printable characters in the Basic Latin and Latin-1 Supplement character set (through
     *   `\u00FF` )
     * * The special characters tab ( `\u0009` ), line feed ( `\u000A` ), and carriage return (
     *   `\u000D` )
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policydocument)
     *
     * @param policyDocument The policy document.
     */
    public fun policyDocument(policyDocument: Any) {
        cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * The name of the policy document.
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-policyname)
     *
     * @param policyName The name of the policy document.
     */
    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    /**
     * The name of the role to associate the policy with.
     *
     * This parameter allows (per its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external
     * policy. This dependency ensures that the role's policy is available throughout the resource's
     * lifecycle. For example, when you delete a stack with an `AWS::ECS::Service` resource, the
     * `DependsOn` attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service`
     * resource before deleting its role's policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-roles)
     *
     * @param roles The name of the role to associate the policy with.
     */
    public fun roles(vararg roles: String) {
        _roles.addAll(listOf(*roles))
    }

    /**
     * The name of the role to associate the policy with.
     *
     * This parameter allows (per its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external
     * policy. This dependency ensures that the role's policy is available throughout the resource's
     * lifecycle. For example, when you delete a stack with an `AWS::ECS::Service` resource, the
     * `DependsOn` attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service`
     * resource before deleting its role's policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-roles)
     *
     * @param roles The name of the role to associate the policy with.
     */
    public fun roles(roles: Collection<String>) {
        _roles.addAll(roles)
    }

    /**
     * The name of the user to associate the policy with.
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users)
     *
     * @param users The name of the user to associate the policy with.
     */
    public fun users(vararg users: String) {
        _users.addAll(listOf(*users))
    }

    /**
     * The name of the user to associate the policy with.
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-policy.html#cfn-iam-policy-users)
     *
     * @param users The name of the user to associate the policy with.
     */
    public fun users(users: Collection<String>) {
        _users.addAll(users)
    }

    public fun build(): CfnPolicy {
        if (_groups.isNotEmpty()) cdkBuilder.groups(_groups)
        if (_roles.isNotEmpty()) cdkBuilder.roles(_roles)
        if (_users.isNotEmpty()) cdkBuilder.users(_users)
        return cdkBuilder.build()
    }
}
