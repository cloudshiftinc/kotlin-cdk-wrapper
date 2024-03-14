package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGroup
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.iam.CfnGroup,
) : CfnResource(cdkObject), IInspectable {
    /**
     * Returns the Amazon Resource Name (ARN) for the specified `AWS::IAM::Group` resource.
     *
     * For example: `arn:aws:iam::123456789012:group/mystack-mygroup-1DZETITOWEKVO` .
     */
    public open fun attrArn(): String = unwrap(this).getAttrArn()

    /**
     * The name of the group to create.
     *
     * Do not include the path in this value.
     */
    public open fun groupName(): String? = unwrap(this).getGroupName()

    /**
     * The name of the group to create.
     *
     * Do not include the path in this value.
     */
    public open fun groupName(`value`: String) {
        unwrap(this).setGroupName(`value`)
    }

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The Amazon Resource Name (ARN) of the IAM policy you want to attach. */
    public open fun managedPolicyArns(): List<String> =
        unwrap(this).getManagedPolicyArns() ?: emptyList()

    /** The Amazon Resource Name (ARN) of the IAM policy you want to attach. */
    public open fun managedPolicyArns(`value`: List<String>) {
        unwrap(this).setManagedPolicyArns(`value`)
    }

    /** The Amazon Resource Name (ARN) of the IAM policy you want to attach. */
    public open fun managedPolicyArns(vararg `value`: String): Unit =
        managedPolicyArns(`value`.toList())

    /**
     * The path to the group.
     *
     * For more information about paths, see
     * [IAM identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in
     * the *IAM User Guide* .
     */
    public open fun path(): String? = unwrap(this).getPath()

    /**
     * The path to the group.
     *
     * For more information about paths, see
     * [IAM identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html) in
     * the *IAM User Guide* .
     */
    public open fun path(`value`: String) {
        unwrap(this).setPath(`value`)
    }

    /** Adds or updates an inline policy document that is embedded in the specified IAM group. */
    public open fun policies(): Any? = unwrap(this).getPolicies()

    /** Adds or updates an inline policy document that is embedded in the specified IAM group. */
    public open fun policies(`value`: IResolvable) {
        unwrap(this).setPolicies(`value`.let(IResolvable::unwrap))
    }

    /** Adds or updates an inline policy document that is embedded in the specified IAM group. */
    public open fun policies(__idx_ac66f0: List<Any>) {
        unwrap(this).setPolicies(__idx_ac66f0)
    }

    /** Adds or updates an inline policy document that is embedded in the specified IAM group. */
    public open fun policies(vararg __idx_ac66f0: Any): Unit = policies(__idx_ac66f0.toList())

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.iam.CfnGroup]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the group to create. Do not include the path in this value.
         *
         * The group name must be unique within the account. Group names are not distinguished by
         * case. For example, you cannot create groups named both "ADMINS" and "admins". If you
         * don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
         * for the group name.
         *
         * If you specify a name, you cannot perform updates that require replacement of this
         * resource. You can perform updates that require no or some interruption. If you must
         * replace the resource, specify a new name.
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
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-groupname)
         *
         * @param groupName The name of the group to create. Do not include the path in this value.
         */
        public fun groupName(groupName: String)

        /**
         * The Amazon Resource Name (ARN) of the IAM policy you want to attach.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-managedpolicyarns)
         *
         * @param managedPolicyArns The Amazon Resource Name (ARN) of the IAM policy you want to
         *   attach.
         */
        public fun managedPolicyArns(managedPolicyArns: List<String>)

        /**
         * The Amazon Resource Name (ARN) of the IAM policy you want to attach.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-managedpolicyarns)
         *
         * @param managedPolicyArns The Amazon Resource Name (ARN) of the IAM policy you want to
         *   attach.
         */
        public fun managedPolicyArns(vararg managedPolicyArns: String)

        /**
         * The path to the group. For more information about paths, see
         * [IAM identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
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
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-path)
         *
         * @param path The path to the group. For more information about paths, see
         *   [IAM identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
         *   in the *IAM User Guide* .
         */
        public fun path(path: String)

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM group.
         *
         * To view AWS::IAM::Group snippets, see
         * [Declaring an IAM Group Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
         * .
         *
         * The name of each inline policy for a role, user, or group must be unique. If you don't
         * choose unique names, updates to the IAM identity will fail.
         *
         * For information about limits on the number of inline policies that you can embed in a
         * group, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM group.
         */
        public fun policies(policies: IResolvable)

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM group.
         *
         * To view AWS::IAM::Group snippets, see
         * [Declaring an IAM Group Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
         * .
         *
         * The name of each inline policy for a role, user, or group must be unique. If you don't
         * choose unique names, updates to the IAM identity will fail.
         *
         * For information about limits on the number of inline policies that you can embed in a
         * group, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM group.
         */
        public fun policies(policies: List<Any>)

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM group.
         *
         * To view AWS::IAM::Group snippets, see
         * [Declaring an IAM Group Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
         * .
         *
         * The name of each inline policy for a role, user, or group must be unique. If you don't
         * choose unique names, updates to the IAM identity will fail.
         *
         * For information about limits on the number of inline policies that you can embed in a
         * group, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM group.
         */
        public fun policies(vararg policies: Any)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.iam.CfnGroup.Builder =
            software.amazon.awscdk.services.iam.CfnGroup.Builder.create(scope, id)

        /**
         * The name of the group to create. Do not include the path in this value.
         *
         * The group name must be unique within the account. Group names are not distinguished by
         * case. For example, you cannot create groups named both "ADMINS" and "admins". If you
         * don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
         * for the group name.
         *
         * If you specify a name, you cannot perform updates that require replacement of this
         * resource. You can perform updates that require no or some interruption. If you must
         * replace the resource, specify a new name.
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
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-groupname)
         *
         * @param groupName The name of the group to create. Do not include the path in this value.
         */
        override fun groupName(groupName: String) {
            cdkBuilder.groupName(groupName)
        }

        /**
         * The Amazon Resource Name (ARN) of the IAM policy you want to attach.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-managedpolicyarns)
         *
         * @param managedPolicyArns The Amazon Resource Name (ARN) of the IAM policy you want to
         *   attach.
         */
        override fun managedPolicyArns(managedPolicyArns: List<String>) {
            cdkBuilder.managedPolicyArns(managedPolicyArns)
        }

        /**
         * The Amazon Resource Name (ARN) of the IAM policy you want to attach.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs)](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-managedpolicyarns)
         *
         * @param managedPolicyArns The Amazon Resource Name (ARN) of the IAM policy you want to
         *   attach.
         */
        override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
            managedPolicyArns(managedPolicyArns.toList())

        /**
         * The path to the group. For more information about paths, see
         * [IAM identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
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
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-path)
         *
         * @param path The path to the group. For more information about paths, see
         *   [IAM identifiers](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html)
         *   in the *IAM User Guide* .
         */
        override fun path(path: String) {
            cdkBuilder.path(path)
        }

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM group.
         *
         * To view AWS::IAM::Group snippets, see
         * [Declaring an IAM Group Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
         * .
         *
         * The name of each inline policy for a role, user, or group must be unique. If you don't
         * choose unique names, updates to the IAM identity will fail.
         *
         * For information about limits on the number of inline policies that you can embed in a
         * group, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM group.
         */
        override fun policies(policies: IResolvable) {
            cdkBuilder.policies(policies.let(IResolvable::unwrap))
        }

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM group.
         *
         * To view AWS::IAM::Group snippets, see
         * [Declaring an IAM Group Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
         * .
         *
         * The name of each inline policy for a role, user, or group must be unique. If you don't
         * choose unique names, updates to the IAM identity will fail.
         *
         * For information about limits on the number of inline policies that you can embed in a
         * group, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM group.
         */
        override fun policies(policies: List<Any>) {
            cdkBuilder.policies(policies)
        }

        /**
         * Adds or updates an inline policy document that is embedded in the specified IAM group.
         *
         * To view AWS::IAM::Group snippets, see
         * [Declaring an IAM Group Resource](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/quickref-iam.html#scenario-iam-group)
         * .
         *
         * The name of each inline policy for a role, user, or group must be unique. If you don't
         * choose unique names, updates to the IAM identity will fail.
         *
         * For information about limits on the number of inline policies that you can embed in a
         * group, see
         * [Limitations on IAM Entities](https://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html)
         * in the *IAM User Guide* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iam-group.html#cfn-iam-group-policies)
         *
         * @param policies Adds or updates an inline policy document that is embedded in the
         *   specified IAM group.
         */
        override fun policies(vararg policies: Any): Unit = policies(policies.toList())

        public fun build(): software.amazon.awscdk.services.iam.CfnGroup = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnGroup {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnGroup(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnGroup): CfnGroup =
            CfnGroup(cdkObject)

        internal fun unwrap(wrapped: CfnGroup): software.amazon.awscdk.services.iam.CfnGroup =
            wrapped.cdkObject
    }

    public interface PolicyProperty {
        /**
         * The policy document.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group-policy.html#cfn-iam-group-policy-policydocument)
         */
        public fun policyDocument(): Any

        /**
         * The friendly name (not ARN) identifying the policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group-policy.html#cfn-iam-group-policy-policyname)
         */
        public fun policyName(): String

        /** A builder for [PolicyProperty] */
        @CdkDslMarker
        public interface Builder {
            /** @param policyDocument The policy document. */
            public fun policyDocument(policyDocument: Any)

            /** @param policyName The friendly name (not ARN) identifying the policy. */
            public fun policyName(policyName: String)
        }

        private class BuilderImpl : Builder {
            private val cdkBuilder:
                software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty.Builder =
                software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty.builder()

            /** @param policyDocument The policy document. */
            override fun policyDocument(policyDocument: Any) {
                cdkBuilder.policyDocument(policyDocument)
            }

            /** @param policyName The friendly name (not ARN) identifying the policy. */
            override fun policyName(policyName: String) {
                cdkBuilder.policyName(policyName)
            }

            public fun build(): software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty =
                cdkBuilder.build()
        }

        private class Wrapper
        internal constructor(
            internal val cdkObject: software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty,
        ) : PolicyProperty {
            /**
             * The policy document.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group-policy.html#cfn-iam-group-policy-policydocument)
             */
            override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

            /**
             * The friendly name (not ARN) identifying the policy.
             *
             * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-group-policy.html#cfn-iam-group-policy-policyname)
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
                cdkObject: software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty
            ): PolicyProperty = Wrapper(cdkObject)

            internal fun unwrap(
                wrapped: PolicyProperty
            ): software.amazon.awscdk.services.iam.CfnGroup.PolicyProperty =
                (wrapped as Wrapper).cdkObject
        }
    }
}
