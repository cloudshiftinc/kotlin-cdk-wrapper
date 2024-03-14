package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration

public open class ObjectLockRetention
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.s3.ObjectLockRetention,
) {
    /** The default period for which objects should be retained. */
    public open fun duration(): Duration = unwrap(this).getDuration().let(Duration::wrap)

    /**
     * The retention mode to use for the object lock configuration.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonS3/latest/userguide/object-lock-overview.html#object-lock-retention-modes)
     */
    public open fun mode(): ObjectLockMode = unwrap(this).getMode().let(ObjectLockMode::wrap)

    public companion object {
        public fun compliance(duration: Duration): ObjectLockRetention =
            software.amazon.awscdk.services.s3.ObjectLockRetention.compliance(
                    duration.let(Duration::unwrap)
                )
                .let(ObjectLockRetention::wrap)

        public fun governance(duration: Duration): ObjectLockRetention =
            software.amazon.awscdk.services.s3.ObjectLockRetention.governance(
                    duration.let(Duration::unwrap)
                )
                .let(ObjectLockRetention::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.ObjectLockRetention
        ): ObjectLockRetention = ObjectLockRetention(cdkObject)

        internal fun unwrap(
            wrapped: ObjectLockRetention
        ): software.amazon.awscdk.services.s3.ObjectLockRetention = wrapped.cdkObject
    }
}
