package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

public interface IPrivateHostedZone : IHostedZone {
    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.route53.IPrivateHostedZone,
    ) : IPrivateHostedZone {
        /**
         * Apply the given removal policy to this resource.
         *
         * The Removal Policy controls what happens to this resource when it stops being managed by
         * CloudFormation, either because you've removed it from the CDK application or because
         * you've made a change that requires the resource to be replaced.
         *
         * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS account for
         * data recovery and cleanup later (`RemovalPolicy.RETAIN`).
         *
         * @param policy
         */
        override fun applyRemovalPolicy(policy: RemovalPolicy) {
            unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
        }

        /**
         * The environment this resource belongs to.
         *
         * For resources that are created and managed by the CDK (generally, those created by
         * creating new class instances like Role, Bucket, etc.), this is always the same as the
         * environment of the stack they belong to; however, for imported resources (those obtained
         * from static methods like fromRoleArn, fromBucketName, etc.), that might be different than
         * the stack they were imported into.
         */
        override fun env(): ResourceEnvironment =
            unwrap(this).getEnv().let(ResourceEnvironment::wrap)

        /**
         * Grant permissions to add delegation records to this zone.
         *
         * @param grantee
         */
        override fun grantDelegation(grantee: IGrantable): Grant =
            unwrap(this).grantDelegation(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

        /** ARN of this hosted zone, such as arn:${Partition}:route53:::hostedzone/${Id}. */
        override fun hostedZoneArn(): String = unwrap(this).getHostedZoneArn()

        /** ID of this hosted zone, such as "Z23ABC4XYZL05B". */
        override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

        /**
         * Returns the set of name servers for the specific hosted zone. For example:
         * ns1.example.com.
         *
         * This attribute will be undefined for private hosted zones or hosted zones imported from
         * another stack.
         */
        override fun hostedZoneNameServers(): List<String> =
            unwrap(this).getHostedZoneNameServers() ?: emptyList()

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /** The stack in which this resource is defined. */
        override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

        /** FQDN of this hosted zone. */
        override fun zoneName(): String = unwrap(this).getZoneName()
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.route53.IPrivateHostedZone
        ): IPrivateHostedZone = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IPrivateHostedZone
        ): software.amazon.awscdk.services.route53.IPrivateHostedZone =
            (wrapped as Wrapper).cdkObject
    }
}
