package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAssignment
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.sso.CfnAssignment,
) : CfnResource(cdkObject), IInspectable {
    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** The ARN of the IAM Identity Center instance under which the operation will be executed. */
    public open fun instanceArn(): String = unwrap(this).getInstanceArn()

    /** The ARN of the IAM Identity Center instance under which the operation will be executed. */
    public open fun instanceArn(`value`: String) {
        unwrap(this).setInstanceArn(`value`)
    }

    /** The ARN of the permission set. */
    public open fun permissionSetArn(): String = unwrap(this).getPermissionSetArn()

    /** The ARN of the permission set. */
    public open fun permissionSetArn(`value`: String) {
        unwrap(this).setPermissionSetArn(`value`)
    }

    /** An identifier for an object in IAM Identity Center, such as a user or group. */
    public open fun principalId(): String = unwrap(this).getPrincipalId()

    /** An identifier for an object in IAM Identity Center, such as a user or group. */
    public open fun principalId(`value`: String) {
        unwrap(this).setPrincipalId(`value`)
    }

    /** The entity type for which the assignment will be created. */
    public open fun principalType(): String = unwrap(this).getPrincipalType()

    /** The entity type for which the assignment will be created. */
    public open fun principalType(`value`: String) {
        unwrap(this).setPrincipalType(`value`)
    }

    /** TargetID is an AWS account identifier, (For example, 123456789012). */
    public open fun targetId(): String = unwrap(this).getTargetId()

    /** TargetID is an AWS account identifier, (For example, 123456789012). */
    public open fun targetId(`value`: String) {
        unwrap(this).setTargetId(`value`)
    }

    /** The entity type for which the assignment will be created. */
    public open fun targetType(): String = unwrap(this).getTargetType()

    /** The entity type for which the assignment will be created. */
    public open fun targetType(`value`: String) {
        unwrap(this).setTargetType(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.sso.CfnAssignment]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The ARN of the IAM Identity Center instance under which the operation will be executed.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-instancearn)
         *
         * @param instanceArn The ARN of the IAM Identity Center instance under which the operation
         *   will be executed.
         */
        public fun instanceArn(instanceArn: String)

        /**
         * The ARN of the permission set.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-permissionsetarn)
         *
         * @param permissionSetArn The ARN of the permission set.
         */
        public fun permissionSetArn(permissionSetArn: String)

        /**
         * An identifier for an object in IAM Identity Center, such as a user or group.
         *
         * PrincipalIds are GUIDs (For example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more
         * information about PrincipalIds in IAM Identity Center, see the
         * [IAM Identity Center Identity Store API Reference](https://docs.aws.amazon.com//singlesignon/latest/IdentityStoreAPIReference/welcome.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-principalid)
         *
         * @param principalId An identifier for an object in IAM Identity Center, such as a user or
         *   group.
         */
        public fun principalId(principalId: String)

        /**
         * The entity type for which the assignment will be created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-principaltype)
         *
         * @param principalType The entity type for which the assignment will be created.
         */
        public fun principalType(principalType: String)

        /**
         * TargetID is an AWS account identifier, (For example, 123456789012).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-targetid)
         *
         * @param targetId TargetID is an AWS account identifier, (For example, 123456789012).
         */
        public fun targetId(targetId: String)

        /**
         * The entity type for which the assignment will be created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-targettype)
         *
         * @param targetType The entity type for which the assignment will be created.
         */
        public fun targetType(targetType: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.sso.CfnAssignment.Builder =
            software.amazon.awscdk.services.sso.CfnAssignment.Builder.create(scope, id)

        /**
         * The ARN of the IAM Identity Center instance under which the operation will be executed.
         *
         * For more information about ARNs, see
         * [Amazon Resource Names (ARNs) and AWS Service Namespaces](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html)
         * in the *AWS General Reference* .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-instancearn)
         *
         * @param instanceArn The ARN of the IAM Identity Center instance under which the operation
         *   will be executed.
         */
        override fun instanceArn(instanceArn: String) {
            cdkBuilder.instanceArn(instanceArn)
        }

        /**
         * The ARN of the permission set.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-permissionsetarn)
         *
         * @param permissionSetArn The ARN of the permission set.
         */
        override fun permissionSetArn(permissionSetArn: String) {
            cdkBuilder.permissionSetArn(permissionSetArn)
        }

        /**
         * An identifier for an object in IAM Identity Center, such as a user or group.
         *
         * PrincipalIds are GUIDs (For example, f81d4fae-7dec-11d0-a765-00a0c91e6bf6). For more
         * information about PrincipalIds in IAM Identity Center, see the
         * [IAM Identity Center Identity Store API Reference](https://docs.aws.amazon.com//singlesignon/latest/IdentityStoreAPIReference/welcome.html)
         * .
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-principalid)
         *
         * @param principalId An identifier for an object in IAM Identity Center, such as a user or
         *   group.
         */
        override fun principalId(principalId: String) {
            cdkBuilder.principalId(principalId)
        }

        /**
         * The entity type for which the assignment will be created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-principaltype)
         *
         * @param principalType The entity type for which the assignment will be created.
         */
        override fun principalType(principalType: String) {
            cdkBuilder.principalType(principalType)
        }

        /**
         * TargetID is an AWS account identifier, (For example, 123456789012).
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-targetid)
         *
         * @param targetId TargetID is an AWS account identifier, (For example, 123456789012).
         */
        override fun targetId(targetId: String) {
            cdkBuilder.targetId(targetId)
        }

        /**
         * The entity type for which the assignment will be created.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-assignment.html#cfn-sso-assignment-targettype)
         *
         * @param targetType The entity type for which the assignment will be created.
         */
        override fun targetType(targetType: String) {
            cdkBuilder.targetType(targetType)
        }

        public fun build(): software.amazon.awscdk.services.sso.CfnAssignment = cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnAssignment {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnAssignment(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.sso.CfnAssignment
        ): CfnAssignment = CfnAssignment(cdkObject)

        internal fun unwrap(
            wrapped: CfnAssignment
        ): software.amazon.awscdk.services.sso.CfnAssignment = wrapped.cdkObject
    }
}
