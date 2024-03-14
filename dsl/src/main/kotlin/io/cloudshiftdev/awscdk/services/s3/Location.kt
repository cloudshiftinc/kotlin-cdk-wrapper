package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface Location {
    /** The name of the S3 Bucket the object is in. */
    public fun bucketName(): String

    /** The path inside the Bucket where the object is located at. */
    public fun objectKey(): String

    /** The S3 object version. */
    public fun objectVersion(): String? = unwrap(this).getObjectVersion()

    /** A builder for [Location] */
    @CdkDslMarker
    public interface Builder {
        /** @param bucketName The name of the S3 Bucket the object is in. */
        public fun bucketName(bucketName: String)

        /** @param objectKey The path inside the Bucket where the object is located at. */
        public fun objectKey(objectKey: String)

        /** @param objectVersion The S3 object version. */
        public fun objectVersion(objectVersion: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.s3.Location.Builder =
            software.amazon.awscdk.services.s3.Location.builder()

        /** @param bucketName The name of the S3 Bucket the object is in. */
        override fun bucketName(bucketName: String) {
            cdkBuilder.bucketName(bucketName)
        }

        /** @param objectKey The path inside the Bucket where the object is located at. */
        override fun objectKey(objectKey: String) {
            cdkBuilder.objectKey(objectKey)
        }

        /** @param objectVersion The S3 object version. */
        override fun objectVersion(objectVersion: String) {
            cdkBuilder.objectVersion(objectVersion)
        }

        public fun build(): software.amazon.awscdk.services.s3.Location = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.s3.Location,
    ) : Location {
        /** The name of the S3 Bucket the object is in. */
        override fun bucketName(): String = unwrap(this).getBucketName()

        /** The path inside the Bucket where the object is located at. */
        override fun objectKey(): String = unwrap(this).getObjectKey()

        /** The S3 object version. */
        override fun objectVersion(): String? = unwrap(this).getObjectVersion()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): Location {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.Location): Location =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: Location): software.amazon.awscdk.services.s3.Location =
            (wrapped as Wrapper).cdkObject
    }
}
