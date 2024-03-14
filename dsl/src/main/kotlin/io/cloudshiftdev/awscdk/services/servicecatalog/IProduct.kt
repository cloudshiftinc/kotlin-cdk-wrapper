package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.s3.IBucket
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

public interface IProduct : IResource {
    /** The asset buckets of a product created via product stack. */
    public fun assetBuckets(): List<IBucket>

    /**
     * Associate Tag Options.
     *
     * A TagOption is a key-value pair managed in AWS Service Catalog. It is not an AWS tag, but
     * serves as a template for creating an AWS tag based on the TagOption.
     *
     * @param tagOptions
     */
    public fun associateTagOptions(tagOptions: TagOptions)

    /** The ARN of the product. */
    public fun productArn(): String

    /** The id of the product. */
    public fun productId(): String

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.servicecatalog.IProduct,
    ) : IProduct {
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

        /** The asset buckets of a product created via product stack. */
        override fun assetBuckets(): List<IBucket> =
            unwrap(this).getAssetBuckets().map(IBucket::wrap)

        /**
         * Associate Tag Options.
         *
         * A TagOption is a key-value pair managed in AWS Service Catalog. It is not an AWS tag, but
         * serves as a template for creating an AWS tag based on the TagOption.
         *
         * @param tagOptions
         */
        override fun associateTagOptions(tagOptions: TagOptions) {
            unwrap(this).associateTagOptions(tagOptions.let(TagOptions::unwrap))
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

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /** The ARN of the product. */
        override fun productArn(): String = unwrap(this).getProductArn()

        /** The id of the product. */
        override fun productId(): String = unwrap(this).getProductId()

        /** The stack in which this resource is defined. */
        override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicecatalog.IProduct
        ): IProduct = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IProduct
        ): software.amazon.awscdk.services.servicecatalog.IProduct = (wrapped as Wrapper).cdkObject
    }
}
