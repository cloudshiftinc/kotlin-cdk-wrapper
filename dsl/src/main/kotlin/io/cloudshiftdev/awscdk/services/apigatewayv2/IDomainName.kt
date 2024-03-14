package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IDomainName : IResource {
    /** The custom domain name. */
    public fun name(): String

    /** The domain name associated with the regional endpoint for this custom domain name. */
    public fun regionalDomainName(): String

    /** The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint. */
    public fun regionalHostedZoneId(): String

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.IDomainName,
    ) : IDomainName {
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

        /** The custom domain name. */
        override fun name(): String = unwrap(this).getName()

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /** The domain name associated with the regional endpoint for this custom domain name. */
        override fun regionalDomainName(): String = unwrap(this).getRegionalDomainName()

        /** The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint. */
        override fun regionalHostedZoneId(): String = unwrap(this).getRegionalHostedZoneId()

        /** The stack in which this resource is defined. */
        override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.IDomainName
        ): IDomainName = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IDomainName
        ): software.amazon.awscdk.services.apigatewayv2.IDomainName = (wrapped as Wrapper).cdkObject
    }
}
