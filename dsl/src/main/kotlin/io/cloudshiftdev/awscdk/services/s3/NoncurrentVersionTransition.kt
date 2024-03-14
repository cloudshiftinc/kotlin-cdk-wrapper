package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface NoncurrentVersionTransition {
    /**
     * Indicates the number of noncurrent version objects to be retained.
     *
     * Can be up to 100 noncurrent versions retained.
     *
     * Default: - No noncurrent version retained.
     */
    public fun noncurrentVersionsToRetain(): Number? = unwrap(this).getNoncurrentVersionsToRetain()

    /** The storage class to which you want the object to transition. */
    public fun storageClass(): StorageClass

    /**
     * Indicates the number of days after creation when objects are transitioned to the specified
     * storage class.
     *
     * Default: - No transition count.
     */
    public fun transitionAfter(): Duration

    /** A builder for [NoncurrentVersionTransition] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param noncurrentVersionsToRetain Indicates the number of noncurrent version objects to
         *   be retained. Can be up to 100 noncurrent versions retained.
         */
        public fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number)

        /** @param storageClass The storage class to which you want the object to transition. */
        public fun storageClass(storageClass: StorageClass)

        /**
         * @param transitionAfter Indicates the number of days after creation when objects are
         *   transitioned to the specified storage class.
         */
        public fun transitionAfter(transitionAfter: Duration)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.s3.NoncurrentVersionTransition.Builder =
            software.amazon.awscdk.services.s3.NoncurrentVersionTransition.builder()

        /**
         * @param noncurrentVersionsToRetain Indicates the number of noncurrent version objects to
         *   be retained. Can be up to 100 noncurrent versions retained.
         */
        override fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number) {
            cdkBuilder.noncurrentVersionsToRetain(noncurrentVersionsToRetain)
        }

        /** @param storageClass The storage class to which you want the object to transition. */
        override fun storageClass(storageClass: StorageClass) {
            cdkBuilder.storageClass(storageClass.let(StorageClass::unwrap))
        }

        /**
         * @param transitionAfter Indicates the number of days after creation when objects are
         *   transitioned to the specified storage class.
         */
        override fun transitionAfter(transitionAfter: Duration) {
            cdkBuilder.transitionAfter(transitionAfter.let(Duration::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.s3.NoncurrentVersionTransition =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.s3.NoncurrentVersionTransition,
    ) : NoncurrentVersionTransition {
        /**
         * Indicates the number of noncurrent version objects to be retained.
         *
         * Can be up to 100 noncurrent versions retained.
         *
         * Default: - No noncurrent version retained.
         */
        override fun noncurrentVersionsToRetain(): Number? =
            unwrap(this).getNoncurrentVersionsToRetain()

        /** The storage class to which you want the object to transition. */
        override fun storageClass(): StorageClass =
            unwrap(this).getStorageClass().let(StorageClass::wrap)

        /**
         * Indicates the number of days after creation when objects are transitioned to the
         * specified storage class.
         *
         * Default: - No transition count.
         */
        override fun transitionAfter(): Duration =
            unwrap(this).getTransitionAfter().let(Duration::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): NoncurrentVersionTransition {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.NoncurrentVersionTransition
        ): NoncurrentVersionTransition = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: NoncurrentVersionTransition
        ): software.amazon.awscdk.services.s3.NoncurrentVersionTransition =
            (wrapped as Wrapper).cdkObject
    }
}
