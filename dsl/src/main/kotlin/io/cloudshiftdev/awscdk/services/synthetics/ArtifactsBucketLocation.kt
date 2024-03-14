package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface ArtifactsBucketLocation {
    /** The s3 location that stores the data of each run. */
    public fun bucket(): IBucket

    /**
     * The S3 bucket prefix.
     *
     * Specify this if you want a more specific path within the artifacts bucket.
     *
     * Default: - no prefix
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /** A builder for [ArtifactsBucketLocation] */
    @CdkDslMarker
    public interface Builder {
        /** @param bucket The s3 location that stores the data of each run. */
        public fun bucket(bucket: IBucket)

        /**
         * @param prefix The S3 bucket prefix. Specify this if you want a more specific path within
         *   the artifacts bucket.
         */
        public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation.Builder =
            software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation.builder()

        /** @param bucket The s3 location that stores the data of each run. */
        override fun bucket(bucket: IBucket) {
            cdkBuilder.bucket(bucket.let(IBucket::unwrap))
        }

        /**
         * @param prefix The S3 bucket prefix. Specify this if you want a more specific path within
         *   the artifacts bucket.
         */
        override fun prefix(prefix: String) {
            cdkBuilder.prefix(prefix)
        }

        public fun build(): software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation,
    ) : ArtifactsBucketLocation {
        /** The s3 location that stores the data of each run. */
        override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

        /**
         * The S3 bucket prefix.
         *
         * Specify this if you want a more specific path within the artifacts bucket.
         *
         * Default: - no prefix
         */
        override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactsBucketLocation {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation
        ): ArtifactsBucketLocation = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ArtifactsBucketLocation
        ): software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation =
            (wrapped as Wrapper).cdkObject
    }
}
