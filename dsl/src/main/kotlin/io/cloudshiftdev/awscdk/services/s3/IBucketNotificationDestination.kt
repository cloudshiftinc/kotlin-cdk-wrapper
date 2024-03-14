package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.constructs.Construct

public interface IBucketNotificationDestination {
    /**
     * Registers this resource to receive notifications for the specified bucket.
     *
     * This method will only be called once for each destination/bucket pair and the result will be
     * cached, so there is no need to implement idempotency in each destination.
     *
     * @param scope
     * @param bucket The bucket object to bind to.
     */
    public fun bind(scope: Construct, bucket: IBucket): BucketNotificationDestinationConfig

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.s3.IBucketNotificationDestination,
    ) : IBucketNotificationDestination {
        /**
         * Registers this resource to receive notifications for the specified bucket.
         *
         * This method will only be called once for each destination/bucket pair and the result will
         * be cached, so there is no need to implement idempotency in each destination.
         *
         * @param scope
         * @param bucket The bucket object to bind to.
         */
        override fun bind(scope: Construct, bucket: IBucket): BucketNotificationDestinationConfig =
            unwrap(this)
                .bind(scope.let(Construct::unwrap), bucket.let(IBucket::unwrap))
                .let(BucketNotificationDestinationConfig::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.IBucketNotificationDestination
        ): IBucketNotificationDestination = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IBucketNotificationDestination
        ): software.amazon.awscdk.services.s3.IBucketNotificationDestination =
            (wrapped as Wrapper).cdkObject
    }
}
