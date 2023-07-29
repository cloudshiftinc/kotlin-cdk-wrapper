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
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iam.CfnRoleProps

/**
 * Properties for defining a `CfnRole`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
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
@CdkDslMarker
public class CfnRolePropsDsl {
    private val cdkBuilder: CfnRoleProps.Builder = CfnRoleProps.builder()

    private val _managedPolicyArns: MutableList<String> = mutableListOf()

    private val _policies: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param assumeRolePolicyDocument The trust policy that is associated with this role. Trust
     *   policies define which entities can assume the role. You can associate only one trust policy
     *   with a role. For an example of a policy that can be used to assume a role, see
     *   [Template Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#aws-resource-iam-role--examples)
     *   . For more information about the elements that you can use in an IAM policy, see
     *   [IAM Policy Elements Reference](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html)
     *   in the *IAM User Guide* .
     */
    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(assumeRolePolicyDocument)
        cdkBuilder.assumeRolePolicyDocument(builder.map)
    }

    /**
     * @param assumeRolePolicyDocument The trust policy that is associated with this role. Trust
     *   policies define which entities can assume the role. You can associate only one trust policy
     *   with a role. For an example of a policy that can be used to assume a role, see
     *   [Template Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#aws-resource-iam-role--examples)
     *   . For more information about the elements that you can use in an IAM policy, see
     *   [IAM Policy Elements Reference](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html)
     *   in the *IAM User Guide* .
     */
    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
        cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
    }

    /** @param description A description of the role that you provide. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     *   that you want to attach to the role. For more information about ARNs, see
     *   [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
     *   in the *AWS General Reference* .
     */
    public fun managedPolicyArns(vararg managedPolicyArns: String) {
        _managedPolicyArns.addAll(listOf(*managedPolicyArns))
    }

    /**
     * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed policies
     *   that you want to attach to the role. For more information about ARNs, see
     *   [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
     *   in the *AWS General Reference* .
     */
    public fun managedPolicyArns(managedPolicyArns: Collection<String>) {
        _managedPolicyArns.addAll(managedPolicyArns)
    }

    /**
     * @param maxSessionDuration The maximum session duration (in seconds) that you want to set for
     *   the specified role. If you do not specify a value for this setting, the default value of
     *   one hour is applied. This setting can have a value from 1 hour to 12 hours.
     *
     * Anyone who assumes the role from the AWS CLI or API can use the `DurationSeconds` API
     * parameter or the `duration-seconds` AWS CLI parameter to request a longer session. The
     * `MaxSessionDuration` setting determines the maximum duration that can be requested using the
     * `DurationSeconds` parameter. If users don't specify a value for the `DurationSeconds`
     * parameter, their security credentials are valid for one hour by default. This applies when
     * you use the `AssumeRole*` API operations or the `assume-role*` AWS CLI operations but does
     * not apply when you use those operations to create a console URL. For more information, see
     * [Using IAM roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in the
     * *IAM User Guide* .
     */
    public fun maxSessionDuration(maxSessionDuration: Number) {
        cdkBuilder.maxSessionDuration(maxSessionDuration)
    }

    /**
     * @param path The path to the role. For more information about paths, see
     *   [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
     *   in the *IAM User Guide* . This parameter is optional. If it is not included, it defaults to
     *   a slash (/).
     *
     * This parameter allows (through its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of either a forward slash (/) by itself or a string that must begin and
     * end with forward slashes. In addition, it can contain any ASCII character from the ! (
     * `\u0021` ) through the DEL character ( `\u007F` ), including most punctuation characters,
     * digits, and upper and lowercased letters.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /**
     * @param permissionsBoundary The ARN of the policy used to set the permissions boundary for the
     *   role. For more information about permissions boundaries, see
     *   [Permissions boundaries for IAM identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html)
     *   in the *IAM User Guide* .
     */
    public fun permissionsBoundary(permissionsBoundary: String) {
        cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     *   IAM role. When you embed an inline policy in a role, the inline policy is used as part of
     *   the role's access (permissions) policy. The role's trust policy is created at the same time
     *   as the role. You can update a role's trust policy later. For more information about IAM
     *   roles, go to
     *   [Using Roles to Delegate Permissions and Federate Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html)
     *   .
     *
     * A role can also have an attached managed policy. For information about policies, see
     * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
     * in the *IAM User Guide* .
     *
     * For information about limits on the number of inline policies that you can embed with a role,
     * see
     * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
     * in the *IAM User Guide* .
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external
     * policy. This dependency ensures that the role's policy is available throughout the resource's
     * lifecycle. For example, when you delete a stack with an `AWS::ECS::Service` resource, the
     * `DependsOn` attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service`
     * resource before deleting its role's policy.
     */
    public fun policies(vararg policies: Any) {
        _policies.addAll(listOf(*policies))
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     *   IAM role. When you embed an inline policy in a role, the inline policy is used as part of
     *   the role's access (permissions) policy. The role's trust policy is created at the same time
     *   as the role. You can update a role's trust policy later. For more information about IAM
     *   roles, go to
     *   [Using Roles to Delegate Permissions and Federate Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html)
     *   .
     *
     * A role can also have an attached managed policy. For information about policies, see
     * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
     * in the *IAM User Guide* .
     *
     * For information about limits on the number of inline policies that you can embed with a role,
     * see
     * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
     * in the *IAM User Guide* .
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external
     * policy. This dependency ensures that the role's policy is available throughout the resource's
     * lifecycle. For example, when you delete a stack with an `AWS::ECS::Service` resource, the
     * `DependsOn` attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service`
     * resource before deleting its role's policy.
     */
    public fun policies(policies: Collection<Any>) {
        _policies.addAll(policies)
    }

    /**
     * @param policies Adds or updates an inline policy document that is embedded in the specified
     *   IAM role. When you embed an inline policy in a role, the inline policy is used as part of
     *   the role's access (permissions) policy. The role's trust policy is created at the same time
     *   as the role. You can update a role's trust policy later. For more information about IAM
     *   roles, go to
     *   [Using Roles to Delegate Permissions and Federate Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html)
     *   .
     *
     * A role can also have an attached managed policy. For information about policies, see
     * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
     * in the *IAM User Guide* .
     *
     * For information about limits on the number of inline policies that you can embed with a role,
     * see
     * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
     * in the *IAM User Guide* .
     *
     * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a `Ref`
     * to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the same role,
     * add a `DependsOn` attribute to the resource to make the resource depend on the external
     * policy. This dependency ensures that the role's policy is available throughout the resource's
     * lifecycle. For example, when you delete a stack with an `AWS::ECS::Service` resource, the
     * `DependsOn` attribute ensures that AWS CloudFormation deletes the `AWS::ECS::Service`
     * resource before deleting its role's policy.
     */
    public fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies)
    }

    /**
     * @param roleName A name for the IAM role, up to 64 characters in length. For valid values, see
     *   the `RoleName` parameter for the
     *   [`CreateRole`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html)
     *   action in the *IAM User Guide* .
     *
     * This parameter allows (per its
     * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string of
     * characters consisting of upper and lowercase alphanumeric characters with no spaces. You can
     * also include any of the following characters: _+=,.&#64;-. The role name must be unique
     * within the account. Role names are not distinguished by case. For example, you cannot create
     * roles named both "Role1" and "role1".
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the role name.
     *
     * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge your
     * template's capabilities. For more information, see
     * [Acknowledging IAM Resources in AWS CloudFormation Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
     * .
     *
     * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
     * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to create
     * a Region-specific name, as in the following example: `{"Fn::Join":
     * ["", [{"Ref": "AWS::Region"}, {"Ref": "MyResourceName"}]]}` .
     */
    public fun roleName(roleName: String) {
        cdkBuilder.roleName(roleName)
    }

    /**
     * @param tags A list of tags that are attached to the role. For more information about tagging,
     *   see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html)
     *   in the *IAM User Guide* .
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A list of tags that are attached to the role. For more information about tagging,
     *   see [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html)
     *   in the *IAM User Guide* .
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRoleProps {
        if (_managedPolicyArns.isNotEmpty()) cdkBuilder.managedPolicyArns(_managedPolicyArns)
        if (_policies.isNotEmpty()) cdkBuilder.policies(_policies)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
