package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ArnComponents {
    /**
     * The ID of the AWS account that owns the resource, without the hyphens.
     *
     * For example, 123456789012. Note that the ARNs for some resources don't require an account
     * number, so this component might be omitted.
     *
     * Default: The account the stack is deployed to.
     */
    public fun account(): String? = unwrap(this).getAccount()

    /**
     * The specific ARN format to use for this ARN value.
     *
     * Default: - uses value of `sep` as the separator for formatting,
     * `ArnFormat.SLASH_RESOURCE_NAME` if that property was also not provided
     */
    public fun arnFormat(): ArnFormat? = unwrap(this).getArnFormat()?.let(ArnFormat::wrap)

    /**
     * The partition that the resource is in.
     *
     * For standard AWS regions, the partition is aws. If you have resources in other partitions,
     * the partition is aws-partitionname. For example, the partition for resources in the China
     * (Beijing) region is aws-cn.
     *
     * Default: The AWS partition the stack is deployed to.
     */
    public fun partition(): String? = unwrap(this).getPartition()

    /**
     * The region the resource resides in.
     *
     * Note that the ARNs for some resources do not require a region, so this component might be
     * omitted.
     *
     * Default: The region the stack is deployed to.
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * Resource type (e.g. "table", "autoScalingGroup", "certificate"). For some resource types,
     * e.g. S3 buckets, this field defines the bucket name.
     */
    public fun resource(): String

    /**
     * Resource name or path within the resource (i.e. S3 bucket object key) or a wildcard such as
     * `"*"`. This is service-dependent.
     */
    public fun resourceName(): String? = unwrap(this).getResourceName()

    /**
     * The service namespace that identifies the AWS product (for example, 's3', 'iam',
     * 'codepipline').
     */
    public fun service(): String

    /** A builder for [ArnComponents] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param account The ID of the AWS account that owns the resource, without the hyphens. For
         *   example, 123456789012. Note that the ARNs for some resources don't require an account
         *   number, so this component might be omitted.
         */
        public fun account(account: String)

        /** @param arnFormat The specific ARN format to use for this ARN value. */
        public fun arnFormat(arnFormat: ArnFormat)

        /**
         * @param partition The partition that the resource is in. For standard AWS regions, the
         *   partition is aws. If you have resources in other partitions, the partition is
         *   aws-partitionname. For example, the partition for resources in the China (Beijing)
         *   region is aws-cn.
         */
        public fun partition(partition: String)

        /**
         * @param region The region the resource resides in. Note that the ARNs for some resources
         *   do not require a region, so this component might be omitted.
         */
        public fun region(region: String)

        /**
         * @param resource Resource type (e.g. "table", "autoScalingGroup", "certificate"). For some
         *   resource types, e.g. S3 buckets, this field defines the bucket name.
         */
        public fun resource(resource: String)

        /**
         * @param resourceName Resource name or path within the resource (i.e. S3 bucket object key)
         *   or a wildcard such as `"*"`. This is service-dependent.
         */
        public fun resourceName(resourceName: String)

        /**
         * @param service The service namespace that identifies the AWS product (for example, 's3',
         *   'iam', 'codepipline').
         */
        public fun service(service: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.ArnComponents.Builder =
            software.amazon.awscdk.ArnComponents.builder()

        /**
         * @param account The ID of the AWS account that owns the resource, without the hyphens. For
         *   example, 123456789012. Note that the ARNs for some resources don't require an account
         *   number, so this component might be omitted.
         */
        override fun account(account: String) {
            cdkBuilder.account(account)
        }

        /** @param arnFormat The specific ARN format to use for this ARN value. */
        override fun arnFormat(arnFormat: ArnFormat) {
            cdkBuilder.arnFormat(arnFormat.let(ArnFormat::unwrap))
        }

        /**
         * @param partition The partition that the resource is in. For standard AWS regions, the
         *   partition is aws. If you have resources in other partitions, the partition is
         *   aws-partitionname. For example, the partition for resources in the China (Beijing)
         *   region is aws-cn.
         */
        override fun partition(partition: String) {
            cdkBuilder.partition(partition)
        }

        /**
         * @param region The region the resource resides in. Note that the ARNs for some resources
         *   do not require a region, so this component might be omitted.
         */
        override fun region(region: String) {
            cdkBuilder.region(region)
        }

        /**
         * @param resource Resource type (e.g. "table", "autoScalingGroup", "certificate"). For some
         *   resource types, e.g. S3 buckets, this field defines the bucket name.
         */
        override fun resource(resource: String) {
            cdkBuilder.resource(resource)
        }

        /**
         * @param resourceName Resource name or path within the resource (i.e. S3 bucket object key)
         *   or a wildcard such as `"*"`. This is service-dependent.
         */
        override fun resourceName(resourceName: String) {
            cdkBuilder.resourceName(resourceName)
        }

        /**
         * @param service The service namespace that identifies the AWS product (for example, 's3',
         *   'iam', 'codepipline').
         */
        override fun service(service: String) {
            cdkBuilder.service(service)
        }

        public fun build(): software.amazon.awscdk.ArnComponents = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.ArnComponents,
    ) : ArnComponents {
        /**
         * The ID of the AWS account that owns the resource, without the hyphens.
         *
         * For example, 123456789012. Note that the ARNs for some resources don't require an account
         * number, so this component might be omitted.
         *
         * Default: The account the stack is deployed to.
         */
        override fun account(): String? = unwrap(this).getAccount()

        /**
         * The specific ARN format to use for this ARN value.
         *
         * Default: - uses value of `sep` as the separator for formatting,
         * `ArnFormat.SLASH_RESOURCE_NAME` if that property was also not provided
         */
        override fun arnFormat(): ArnFormat? = unwrap(this).getArnFormat()?.let(ArnFormat::wrap)

        /**
         * The partition that the resource is in.
         *
         * For standard AWS regions, the partition is aws. If you have resources in other
         * partitions, the partition is aws-partitionname. For example, the partition for resources
         * in the China (Beijing) region is aws-cn.
         *
         * Default: The AWS partition the stack is deployed to.
         */
        override fun partition(): String? = unwrap(this).getPartition()

        /**
         * The region the resource resides in.
         *
         * Note that the ARNs for some resources do not require a region, so this component might be
         * omitted.
         *
         * Default: The region the stack is deployed to.
         */
        override fun region(): String? = unwrap(this).getRegion()

        /**
         * Resource type (e.g. "table", "autoScalingGroup", "certificate"). For some resource types,
         * e.g. S3 buckets, this field defines the bucket name.
         */
        override fun resource(): String = unwrap(this).getResource()

        /**
         * Resource name or path within the resource (i.e. S3 bucket object key) or a wildcard such
         * as `"*"`. This is service-dependent.
         */
        override fun resourceName(): String? = unwrap(this).getResourceName()

        /**
         * The service namespace that identifies the AWS product (for example, 's3', 'iam',
         * 'codepipline').
         */
        override fun service(): String = unwrap(this).getService()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ArnComponents {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.ArnComponents): ArnComponents =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: ArnComponents): software.amazon.awscdk.ArnComponents =
            (wrapped as Wrapper).cdkObject
    }
}
