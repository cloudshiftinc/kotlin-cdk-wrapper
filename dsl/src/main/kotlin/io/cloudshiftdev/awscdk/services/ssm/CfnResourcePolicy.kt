package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnResourcePolicy
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ssm.CfnResourcePolicy,
) : CfnResource(cdkObject), IInspectable {
    /**
     * ID of the current policy version.
     *
     * The hash helps to prevent a situation where multiple users attempt to overwrite a policy. You
     * must provide this hash and the policy ID when updating or deleting a policy.
     */
    public open fun attrPolicyHash(): String = unwrap(this).getAttrPolicyHash()

    /** ID of the current policy version. */
    public open fun attrPolicyId(): String = unwrap(this).getAttrPolicyId()

    /**
     * Examines the CloudFormation resource and discloses attributes.
     *
     * @param inspector tree inspector to collect and process attributes.
     */
    public override fun inspect(inspector: TreeInspector) {
        unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
    }

    /** A policy you want to associate with a resource. */
    public open fun policy(): Any = unwrap(this).getPolicy()

    /** A policy you want to associate with a resource. */
    public open fun policy(`value`: Any) {
        unwrap(this).setPolicy(`value`)
    }

    /** The Amazon Resource Name (ARN) of the resource to which you want to attach a policy. */
    public open fun resourceArn(): String = unwrap(this).getResourceArn()

    /** The Amazon Resource Name (ARN) of the resource to which you want to attach a policy. */
    public open fun resourceArn(`value`: String) {
        unwrap(this).setResourceArn(`value`)
    }

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.ssm.CfnResourcePolicy]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * A policy you want to associate with a resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-policy)
         *
         * @param policy A policy you want to associate with a resource.
         */
        public fun policy(policy: Any)

        /**
         * The Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-resourcearn)
         *
         * @param resourceArn The Amazon Resource Name (ARN) of the resource to which you want to
         *   attach a policy.
         */
        public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnResourcePolicy.Builder =
            software.amazon.awscdk.services.ssm.CfnResourcePolicy.Builder.create(scope, id)

        /**
         * A policy you want to associate with a resource.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-policy)
         *
         * @param policy A policy you want to associate with a resource.
         */
        override fun policy(policy: Any) {
            cdkBuilder.policy(policy)
        }

        /**
         * The Amazon Resource Name (ARN) of the resource to which you want to attach a policy.
         *
         * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcepolicy.html#cfn-ssm-resourcepolicy-resourcearn)
         *
         * @param resourceArn The Amazon Resource Name (ARN) of the resource to which you want to
         *   attach a policy.
         */
        override fun resourceArn(resourceArn: String) {
            cdkBuilder.resourceArn(resourceArn)
        }

        public fun build(): software.amazon.awscdk.services.ssm.CfnResourcePolicy =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CfnResourcePolicy {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CfnResourcePolicy(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ssm.CfnResourcePolicy
        ): CfnResourcePolicy = CfnResourcePolicy(cdkObject)

        internal fun unwrap(
            wrapped: CfnResourcePolicy
        ): software.amazon.awscdk.services.ssm.CfnResourcePolicy = wrapped.cdkObject
    }
}
