package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRole
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.iam.CfnRole,
) : CfnResource(cdkObject), IInspectable, ITaggable {
    /** The trust policy that is associated with this role. */
    public open fun assumeRolePolicyDocument(): Any = unwrap(this).getAssumeRolePolicyDocument()

    /** The trust policy that is associated with this role. */
    public open fun assumeRolePolicyDocument(`value`: Any) {
        unwrap(this).setAssumeRolePolicyDocument(`value`)
    }

    /**
     * Returns the Amazon Resource Name (ARN) for the role. For example:.
     *
     * `{"Fn::GetAtt" : ["MyRole", "Arn"] }`
     *
     * This will return a value such as `arn:aws:iam::1234567890:role/MyRole-AJJHDSKSDF` .
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * Returns the stable and unique string identifying the role. For example,
     * `AIDAJQABLZS4A3QDU576Q` .
     *
     * For more information about IDs, see
     * [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html)
     * in the *IAM User Guide* .
     */
    public open fun attrRoleId(): String = unwrap(this).getAttrRoleId()

    /** A description of the role that you provide. */
    public open fun description(): String? = unwrap(this).getDescription()

    /** A description of the role that you provide. */
    public open fun description(`value`: String) {
        unwrap(this).setDescription(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
     * the role.
     */
    public open fun managedPolicyArns(): List<String> =
        unwrap(this).getManagedPolicyArns() ?: emptyList()

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
     * the role.
     */
    public open fun managedPolicyArns(`value`: List<String>) {
        unwrap(this).setManagedPolicyArns(`value`)
    }

    /**
     * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to attach to
     * the role.
     */
    public open fun managedPolicyArns(vararg `value`: String): Unit =
        managedPolicyArns(`value`.toList())

    /** The maximum session duration (in seconds) that you want to set for the specified role. */
    public open fun maxSessionDuration(): Number? = unwrap(this).getMaxSessionDuration()

    /** The maximum session duration (in seconds) that you want to set for the specified role. */
    public open fun maxSessionDuration(`value`: Number) {
        unwrap(this).setMaxSessionDuration(`value`)
    }

    /**
     * The path to the role.
     *
     * For more information about paths, see
     * [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in
     * the *IAM User Guide* .
     */
    public open fun path(): String? = unwrap(this).getPath()

    /**
     * The path to the role.
     *
     * For more information about paths, see
     * [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in
     * the *IAM User Guide* .
     */
    public open fun path(`value`: String) {
        unwrap(this).setPath(`value`)
    }

    /** The ARN of the policy used to set the permissions boundary for the role. */
    public open fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

    /** The ARN of the policy used to set the permissions boundary for the role. */
    public open fun permissionsBoundary(`value`: String) {
        unwrap(this).setPermissionsBoundary(`value`)
    }

    /** Adds or updates an inline policy document that is embedded in the specified IAM role. */
    public open fun policies(): Any? = unwrap(this).getPolicies()

    /** Adds or updates an inline policy document that is embedded in the specified IAM role. */
    public open fun policies(`value`: IResolvable) {
        unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
    }

    /** Adds or updates an inline policy document that is embedded in the specified IAM role. */
    public open fun policies(__idx_ac66f0: List<Any>) {
        unwrap(this).setPolicies(__idx_ac66f0)
    }

    /** Adds or updates an inline policy document that is embedded in the specified IAM role. */
    public open fun policies(vararg __idx_ac66f0: Any): Unit = policies(__idx_ac66f0.toList())

    /** A name for the IAM role, up to 64 characters in length. */
    public open fun roleName(): String? = unwrap(this).getRoleName()

    /** A name for the IAM role, up to 64 characters in length. */
    public open fun roleName(`value`: String) {
        unwrap(this).setRoleName(`value`)
    }

    /** Tag Manager which manages the tags for this resource. */
    public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

    /** A list of tags that are attached to the role. */
    public open fun tagsRaw(): List<CfnTag> =
        unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?: emptyList()

    /** A list of tags that are attached to the role. */
    public open fun tagsRaw(`value`: List<CfnTag>) {
        unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
    }

    /** A list of tags that are attached to the role. */
    public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnRole]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The trust policy that is associated with this role.
         *
         * Trust policies define which entities can assume the role. You can associate only one
         * trust policy with a role. For an example of a policy that can be used to assume a role,
         * see
         * [Template Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#aws-resource-iam-role--examples)
         * . For more information about the elements that you can use in an IAM policy, see
         * [IAM Policy Elements Reference](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html)
         * in the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-assumerolepolicydocument)
         *
         * @param assumeRolePolicyDocument The trust policy that is associated with this role.
         */
        public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any)

        /**
         * A description of the role that you provide.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-description)
         *
         * @param description A description of the role that you provide.
         */
        public fun description(description: String)

        /**
         * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to
         * attach to the role.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managedpolicyarns)
         *
         * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed
         *   policies that you want to attach to the role.
         */
        public fun managedPolicyArns(managedPolicyArns: List<String>)

        /**
         * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to
         * attach to the role.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managedpolicyarns)
         *
         * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed
         *   policies that you want to attach to the role.
         */
        public fun managedPolicyArns(vararg managedPolicyArns: String)

        /**
         * The maximum session duration (in seconds) that you want to set for the specified role.
         *
         * If you do not specify a value for this setting, the default value of one hour is applied.
         * This setting can have a value from 1 hour to 12 hours.
         *
         * Anyone who assumes the role from the AWS CLI or API can use the `DurationSeconds` API
         * parameter or the `duration-seconds` AWS CLI parameter to request a longer session. The
         * `MaxSessionDuration` setting determines the maximum duration that can be requested using
         * the `DurationSeconds` parameter. If users don't specify a value for the `DurationSeconds`
         * parameter, their security credentials are valid for one hour by default. This applies
         * when you use the `AssumeRole*` API operations or the `assume-role*` AWS CLI operations
         * but does not apply when you use those operations to create a console URL. For more
         * information, see
         * [Using IAM roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in
         * the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-maxsessionduration)
         *
         * @param maxSessionDuration The maximum session duration (in seconds) that you want to set
         *   for the specified role.
         */
        public fun maxSessionDuration(maxSessionDuration: Number)

        /**
         * The path to the role. For more information about paths, see
         * [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
         * in the *IAM User Guide* .
         *
         * This parameter is optional. If it is not included, it defaults to a slash (/).
         *
         * This parameter allows (through its
         * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string
         * of characters consisting of either a forward slash (/) by itself or a string that must
         * begin and end with forward slashes. In addition, it can contain any ASCII character from
         * the ! ( `\u0021` ) through the DEL character ( `\u007F` ), including most punctuation
         * characters, digits, and upper and lowercased letters.
         *
         * Default: - "/"
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-path)
         *
         * @param path The path to the role. For more information about paths, see
         *   [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
         *   in the *IAM User Guide* .
         */
        public fun path(path: String)

        /**
         * The ARN of the policy used to set the permissions boundary for the role.
         *
         * For more information about permissions boundaries, see
         * [Permissions boundaries for IAM identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html)
         * in the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-permissionsboundary)
         *
         * @param permissionsBoundary The ARN of the policy used to set the permissions boundary for
         *   the role.
         */
        public fun permissionsBoundary(permissionsBoundary: String)

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM role.
         *
         * When you embed an inline policy in a role, the inline policy is used as part of the
         * role's access (permissions) policy. The role's trust policy is created at the same time
         * as the role. You can update a role's trust policy later. For more information about IAM
         * roles, go to
         * [Using Roles to Delegate Permissions and Federate Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html)
         * .
         *
         * A role can also have an attached managed policy. For information about policies, see
         * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
         * in the *IAM User Guide* .
         *
         * For information about limits on the number of inline policies that you can embed with a
         * role, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a
         * `Ref` to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the
         * same role, add a `DependsOn` attribute to the resource to make the resource depend on the
         * external policy. This dependency ensures that the role's policy is available throughout
         * the resource's lifecycle. For example, when you delete a stack with an
         * `AWS::ECS::Service` resource, the `DependsOn` attribute ensures that AWS CloudFormation
         * deletes the `AWS::ECS::Service` resource before deleting its role's policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM role.
         */
        public fun policies(policies: IResolvable)

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM role.
         *
         * When you embed an inline policy in a role, the inline policy is used as part of the
         * role's access (permissions) policy. The role's trust policy is created at the same time
         * as the role. You can update a role's trust policy later. For more information about IAM
         * roles, go to
         * [Using Roles to Delegate Permissions and Federate Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html)
         * .
         *
         * A role can also have an attached managed policy. For information about policies, see
         * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
         * in the *IAM User Guide* .
         *
         * For information about limits on the number of inline policies that you can embed with a
         * role, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a
         * `Ref` to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the
         * same role, add a `DependsOn` attribute to the resource to make the resource depend on the
         * external policy. This dependency ensures that the role's policy is available throughout
         * the resource's lifecycle. For example, when you delete a stack with an
         * `AWS::ECS::Service` resource, the `DependsOn` attribute ensures that AWS CloudFormation
         * deletes the `AWS::ECS::Service` resource before deleting its role's policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM role.
         */
        public fun policies(policies: List<Any>)

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM role.
         *
         * When you embed an inline policy in a role, the inline policy is used as part of the
         * role's access (permissions) policy. The role's trust policy is created at the same time
         * as the role. You can update a role's trust policy later. For more information about IAM
         * roles, go to
         * [Using Roles to Delegate Permissions and Federate Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html)
         * .
         *
         * A role can also have an attached managed policy. For information about policies, see
         * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
         * in the *IAM User Guide* .
         *
         * For information about limits on the number of inline policies that you can embed with a
         * role, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a
         * `Ref` to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the
         * same role, add a `DependsOn` attribute to the resource to make the resource depend on the
         * external policy. This dependency ensures that the role's policy is available throughout
         * the resource's lifecycle. For example, when you delete a stack with an
         * `AWS::ECS::Service` resource, the `DependsOn` attribute ensures that AWS CloudFormation
         * deletes the `AWS::ECS::Service` resource before deleting its role's policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM role.
         */
        public fun policies(vararg policies: Any)

        /**
         * A name for the IAM role, up to 64 characters in length.
         *
         * For valid values, see the `RoleName` parameter for the
         * [`CreateRole`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html)
         * action in the *IAM User Guide* .
         *
         * This parameter allows (per its
         * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string
         * of characters consisting of upper and lowercase alphanumeric characters with no spaces.
         * You can also include any of the following characters: _+=,.&#64;-. The role name must be
         * unique within the account. Role names are not distinguished by case. For example, you
         * cannot create roles named both "Role1" and "role1".
         *
         * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses
         * that ID for the role name.
         *
         * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge
         * your template's capabilities. For more information, see
         * [Acknowledging IAM Resources in AWS CloudFormation Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
         * .
         *
         * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
         * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to
         * create a Region-specific name, as in the following example: `{"Fn::Join":
         * ["", [{"Ref": "AWS::Region"}, {"Ref": "MyResourceName"}]]}` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-rolename)
         *
         * @param roleName A name for the IAM role, up to 64 characters in length.
         */
        public fun roleName(roleName: String)

        /**
         * A list of tags that are attached to the role.
         *
         * For more information about tagging, see
         * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
         * the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-tags)
         *
         * @param tags A list of tags that are attached to the role.
         */
        public fun tags(tags: List<CfnTag>)

        /**
         * A list of tags that are attached to the role.
         *
         * For more information about tagging, see
         * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
         * the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-tags)
         *
         * @param tags A list of tags that are attached to the role.
         */
        public fun tags(vararg tags: CfnTag)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.iam.CfnRole.Builder =
            software.amazon.awscdk.services.iam.CfnRole.Builder.create(scope, id)

        /**
         * The trust policy that is associated with this role.
         *
         * Trust policies define which entities can assume the role. You can associate only one
         * trust policy with a role. For an example of a policy that can be used to assume a role,
         * see
         * [Template Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#aws-resource-iam-role--examples)
         * . For more information about the elements that you can use in an IAM policy, see
         * [IAM Policy Elements Reference](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html)
         * in the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-assumerolepolicydocument)
         *
         * @param assumeRolePolicyDocument The trust policy that is associated with this role.
         */
        override fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
            cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
        }

        /**
         * A description of the role that you provide.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-description)
         *
         * @param description A description of the role that you provide.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to
         * attach to the role.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managedpolicyarns)
         *
         * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed
         *   policies that you want to attach to the role.
         */
        override fun managedPolicyArns(managedPolicyArns: List<String>) {
            cdkBuilder.managedPolicyArns(managedPolicyArns)
        }

        /**
         * A list of Amazon Resource Names (ARNs) of the IAM managed policies that you want to
         * attach to the role.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-managedpolicyarns)
         *
         * @param managedPolicyArns A list of Amazon Resource Names (ARNs) of the IAM managed
         *   policies that you want to attach to the role.
         */
        override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
            managedPolicyArns(managedPolicyArns.toList())

        /**
         * The maximum session duration (in seconds) that you want to set for the specified role.
         *
         * If you do not specify a value for this setting, the default value of one hour is applied.
         * This setting can have a value from 1 hour to 12 hours.
         *
         * Anyone who assumes the role from the AWS CLI or API can use the `DurationSeconds` API
         * parameter or the `duration-seconds` AWS CLI parameter to request a longer session. The
         * `MaxSessionDuration` setting determines the maximum duration that can be requested using
         * the `DurationSeconds` parameter. If users don't specify a value for the `DurationSeconds`
         * parameter, their security credentials are valid for one hour by default. This applies
         * when you use the `AssumeRole*` API operations or the `assume-role*` AWS CLI operations
         * but does not apply when you use those operations to create a console URL. For more
         * information, see
         * [Using IAM roles](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html) in
         * the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-maxsessionduration)
         *
         * @param maxSessionDuration The maximum session duration (in seconds) that you want to set
         *   for the specified role.
         */
        override fun maxSessionDuration(maxSessionDuration: Number) {
            cdkBuilder.maxSessionDuration(maxSessionDuration)
        }

        /**
         * The path to the role. For more information about paths, see
         * [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
         * in the *IAM User Guide* .
         *
         * This parameter is optional. If it is not included, it defaults to a slash (/).
         *
         * This parameter allows (through its
         * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string
         * of characters consisting of either a forward slash (/) by itself or a string that must
         * begin and end with forward slashes. In addition, it can contain any ASCII character from
         * the ! ( `\u0021` ) through the DEL character ( `\u007F` ), including most punctuation
         * characters, digits, and upper and lowercased letters.
         *
         * Default: - "/"
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-path)
         *
         * @param path The path to the role. For more information about paths, see
         *   [IAM Identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
         *   in the *IAM User Guide* .
         */
        override fun path(path: String) {
            cdkBuilder.path(path)
        }

        /**
         * The ARN of the policy used to set the permissions boundary for the role.
         *
         * For more information about permissions boundaries, see
         * [Permissions boundaries for IAM identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_boundaries.html)
         * in the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-permissionsboundary)
         *
         * @param permissionsBoundary The ARN of the policy used to set the permissions boundary for
         *   the role.
         */
        override fun permissionsBoundary(permissionsBoundary: String) {
            cdkBuilder.permissionsBoundary(permissionsBoundary)
        }

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM role.
         *
         * When you embed an inline policy in a role, the inline policy is used as part of the
         * role's access (permissions) policy. The role's trust policy is created at the same time
         * as the role. You can update a role's trust policy later. For more information about IAM
         * roles, go to
         * [Using Roles to Delegate Permissions and Federate Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html)
         * .
         *
         * A role can also have an attached managed policy. For information about policies, see
         * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
         * in the *IAM User Guide* .
         *
         * For information about limits on the number of inline policies that you can embed with a
         * role, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a
         * `Ref` to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the
         * same role, add a `DependsOn` attribute to the resource to make the resource depend on the
         * external policy. This dependency ensures that the role's policy is available throughout
         * the resource's lifecycle. For example, when you delete a stack with an
         * `AWS::ECS::Service` resource, the `DependsOn` attribute ensures that AWS CloudFormation
         * deletes the `AWS::ECS::Service` resource before deleting its role's policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM role.
         */
        override fun policies(policies: IResolvable) {
            cdkBuilder.policies(policies.let(IResolvable::unwrap))
        }

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM role.
         *
         * When you embed an inline policy in a role, the inline policy is used as part of the
         * role's access (permissions) policy. The role's trust policy is created at the same time
         * as the role. You can update a role's trust policy later. For more information about IAM
         * roles, go to
         * [Using Roles to Delegate Permissions and Federate Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html)
         * .
         *
         * A role can also have an attached managed policy. For information about policies, see
         * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
         * in the *IAM User Guide* .
         *
         * For information about limits on the number of inline policies that you can embed with a
         * role, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a
         * `Ref` to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the
         * same role, add a `DependsOn` attribute to the resource to make the resource depend on the
         * external policy. This dependency ensures that the role's policy is available throughout
         * the resource's lifecycle. For example, when you delete a stack with an
         * `AWS::ECS::Service` resource, the `DependsOn` attribute ensures that AWS CloudFormation
         * deletes the `AWS::ECS::Service` resource before deleting its role's policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM role.
         */
        override fun policies(policies: List<Any>) {
            cdkBuilder.policies(policies)
        }

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM role.
         *
         * When you embed an inline policy in a role, the inline policy is used as part of the
         * role's access (permissions) policy. The role's trust policy is created at the same time
         * as the role. You can update a role's trust policy later. For more information about IAM
         * roles, go to
         * [Using Roles to Delegate Permissions and Federate Identities](https://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html)
         * .
         *
         * A role can also have an attached managed policy. For information about policies, see
         * [Managed Policies and Inline Policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html)
         * in the *IAM User Guide* .
         *
         * For information about limits on the number of inline policies that you can embed with a
         * role, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * If an external policy (such as `AWS::IAM::Policy` or `AWS::IAM::ManagedPolicy` ) has a
         * `Ref` to a role and if a resource (such as `AWS::ECS::Service` ) also has a `Ref` to the
         * same role, add a `DependsOn` attribute to the resource to make the resource depend on the
         * external policy. This dependency ensures that the role's policy is available throughout
         * the resource's lifecycle. For example, when you delete a stack with an
         * `AWS::ECS::Service` resource, the `DependsOn` attribute ensures that AWS CloudFormation
         * deletes the `AWS::ECS::Service` resource before deleting its role's policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM role.
         */
        override fun policies(vararg policies: Any): Unit = policies(policies.toList())

        /**
         * A name for the IAM role, up to 64 characters in length.
         *
         * For valid values, see the `RoleName` parameter for the
         * [`CreateRole`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_CreateRole.html)
         * action in the *IAM User Guide* .
         *
         * This parameter allows (per its
         * [regex pattern](https://docs.aws.amazon.com/http://wikipedia.org/wiki/regex) ) a string
         * of characters consisting of upper and lowercase alphanumeric characters with no spaces.
         * You can also include any of the following characters: _+=,.&#64;-. The role name must be
         * unique within the account. Role names are not distinguished by case. For example, you
         * cannot create roles named both "Role1" and "role1".
         *
         * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses
         * that ID for the role name.
         *
         * If you specify a name, you must specify the `CAPABILITY_NAMED_IAM` value to acknowledge
         * your template's capabilities. For more information, see
         * [Acknowledging IAM Resources in AWS CloudFormation Templates](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-iam-template.html#using-iam-capabilities)
         * .
         *
         * Naming an IAM resource can cause an unrecoverable error if you reuse the same template in
         * multiple Regions. To prevent this, we recommend using `Fn::Join` and `AWS::Region` to
         * create a Region-specific name, as in the following example: `{"Fn::Join":
         * ["", [{"Ref": "AWS::Region"}, {"Ref": "MyResourceName"}]]}` .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-rolename)
         *
         * @param roleName A name for the IAM role, up to 64 characters in length.
         */
        override fun roleName(roleName: String) {
            cdkBuilder.roleName(roleName)
        }

        /**
         * A list of tags that are attached to the role.
         *
         * For more information about tagging, see
         * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
         * the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-tags)
         *
         * @param tags A list of tags that are attached to the role.
         */
        override fun tags(tags: List<CfnTag>) {
            cdkBuilder.tags(tags.map(CfnTag::unwrap))
        }

        /**
         * A list of tags that are attached to the role.
         *
         * For more information about tagging, see
         * [Tagging IAM resources](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html) in
         * the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-role.html#cfn-iam-role-tags)
         *
         * @param tags A list of tags that are attached to the role.
         */
        override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

        public fun build(): software.amazon.awscdk.services.iam.CfnRole = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnRole {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnRole(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnRole): CfnRole =
            CfnRole(cdkObject)

        internal fun unwrap(wrapped: CfnRole): software.amazon.awscdk.services.iam.CfnRole =
            wrapped.cdkObject
    }

    public interface PolicyProperty {
        /**
         * The entire contents of the policy that defines permissions.
         *
         * For more information, see
         * [Overview of JSON policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-role-policy.html#cfn-iam-role-policy-policydocument)
         */
        public fun policyDocument(): Any

        /**
         * The friendly name (not ARN) identifying the policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-role-policy.html#cfn-iam-role-policy-policyname)
         */
        public fun policyName(): String

        /** A builder for [PolicyProperty] */
        @CdkDslMarker
        public interface Builder {
            /**
             * @param policyDocument The entire contents of the policy that defines permissions. For
             *   more information, see
             *   [Overview of JSON policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
             *   .
             */
            public fun policyDocument(policyDocument: Any)

            /** @param policyName The friendly name (not ARN) identifying the policy. */
            public fun policyName(policyName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iam.CfnRole.PolicyProperty.Builder =
                software.amazon.awscdk.services.iam.CfnRole.PolicyProperty.builder()

            /**
             * @param policyDocument The entire contents of the policy that defines permissions. For
             *   more information, see
             *   [Overview of JSON policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
             *   .
             */
            override fun policyDocument(policyDocument: Any) {
                cdkBuilder.policyDocument(policyDocument)
            }

            /** @param policyName The friendly name (not ARN) identifying the policy. */
            override fun policyName(policyName: String) {
                cdkBuilder.policyName(policyName)
            }

            public fun build(): software.amazon.awscdk.services.iam.CfnRole.PolicyProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject: software.amazon.awscdk.services.iam.CfnRole.PolicyProperty,
        ) : PolicyProperty {
            /**
             * The entire contents of the policy that defines permissions.
             *
             * For more information, see
             * [Overview of JSON policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json)
             * .
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-role-policy.html#cfn-iam-role-policy-policydocument)
             */
            override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

            /**
             * The friendly name (not ARN) identifying the policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-role-policy.html#cfn-iam-role-policy-policyname)
             */
            override fun policyName(): String = unwrap(this).getPolicyName()
        }

        public companion object {
            init {}

            public operator fun invoke(block: Builder.() -> Unit = {}): PolicyProperty {
                val builderImpl = BuilderImpl()
                return Wrapper(builderImpl.apply(block).build())
            }

            internal fun wrap(
                cdkObject: software.amazon.awscdk.services.iam.CfnRole.PolicyProperty
            ): PolicyProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PolicyProperty
            ): software.amazon.awscdk.services.iam.CfnRole.PolicyProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
