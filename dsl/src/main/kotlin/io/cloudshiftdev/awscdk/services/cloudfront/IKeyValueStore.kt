package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IKeyValueStore : IResource {
    /** The ARN of the Key Value Store. */
    public fun keyValueStoreArn(): String

    /** The Unique ID of the Key Value Store. */
    public fun keyValueStoreId(): String

    /** The status of the Key Value Store. */
    public fun keyValueStoreStatus(): String

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cloudfront.IKeyValueStore,
    ) : IKeyValueStore {
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

        /** The ARN of the Key Value Store. */
        override fun keyValueStoreArn(): String = unwrap(this).getKeyValueStoreArn()

        /** The Unique ID of the Key Value Store. */
        override fun keyValueStoreId(): String = unwrap(this).getKeyValueStoreId()

        /** The status of the Key Value Store. */
        override fun keyValueStoreStatus(): String = unwrap(this).getKeyValueStoreStatus()

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /** The stack in which this resource is defined. */
        override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.IKeyValueStore
        ): IKeyValueStore = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IKeyValueStore
        ): software.amazon.awscdk.services.cloudfront.IKeyValueStore =
            (wrapped as Wrapper).cdkObject
    }
}
