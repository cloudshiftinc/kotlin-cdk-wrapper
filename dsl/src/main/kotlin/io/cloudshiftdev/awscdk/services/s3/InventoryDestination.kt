package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface InventoryDestination {
    /** Bucket where all inventories will be saved in. */
    public fun bucket(): IBucket

    /**
     * The account ID that owns the destination S3 bucket.
     *
     * If no account ID is provided, the owner is not validated before exporting data. It's
     * recommended to set an account ID to prevent problems if the destination bucket ownership
     * changes.
     *
     * Default: - No account ID.
     */
    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    /**
     * The prefix to be used when saving the inventory.
     *
     * Default: - No prefix.
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /** A builder for [InventoryDestination] */
    @CdkDslMarker
    public interface Builder {
        /** @param bucket Bucket where all inventories will be saved in. */
        public fun bucket(bucket: IBucket)

        /**
         * @param bucketOwner The account ID that owns the destination S3 bucket. If no account ID
         *   is provided, the owner is not validated before exporting data. It's recommended to set
         *   an account ID to prevent problems if the destination bucket ownership changes.
         */
        public fun bucketOwner(bucketOwner: String)

        /** @param prefix The prefix to be used when saving the inventory. */
        public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.s3.InventoryDestination.Builder =
            software.amazon.awscdk.services.s3.InventoryDestination.builder()

        /** @param bucket Bucket where all inventories will be saved in. */
        override fun bucket(bucket: IBucket) {
            cdkBuilder.bucket(bucket.let(IBucket::unwrap))
        }

        /**
         * @param bucketOwner The account ID that owns the destination S3 bucket. If no account ID
         *   is provided, the owner is not validated before exporting data. It's recommended to set
         *   an account ID to prevent problems if the destination bucket ownership changes.
         */
        override fun bucketOwner(bucketOwner: String) {
            cdkBuilder.bucketOwner(bucketOwner)
        }

        /** @param prefix The prefix to be used when saving the inventory. */
        override fun prefix(prefix: String) {
            cdkBuilder.prefix(prefix)
        }

        public fun build(): software.amazon.awscdk.services.s3.InventoryDestination =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.s3.InventoryDestination,
    ) : InventoryDestination {
        /** Bucket where all inventories will be saved in. */
        override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

        /**
         * The account ID that owns the destination S3 bucket.
         *
         * If no account ID is provided, the owner is not validated before exporting data. It's
         * recommended to set an account ID to prevent problems if the destination bucket ownership
         * changes.
         *
         * Default: - No account ID.
         */
        override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

        /**
         * The prefix to be used when saving the inventory.
         *
         * Default: - No prefix.
         */
        override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): InventoryDestination {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.InventoryDestination
        ): InventoryDestination = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: InventoryDestination
        ): software.amazon.awscdk.services.s3.InventoryDestination = (wrapped as Wrapper).cdkObject
    }
}
