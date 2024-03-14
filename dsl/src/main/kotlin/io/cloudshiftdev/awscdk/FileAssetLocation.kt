package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface FileAssetLocation {
    /** The name of the Amazon S3 bucket. */
    public fun bucketName(): String

    /**
     * The HTTP URL of this asset on Amazon S3.
     *
     * This value suitable for inclusion in a CloudFormation template, and may be an encoded token.
     *
     * Example value: `https://s3-us-east-1.amazonaws.com/mybucket/myobject`
     */
    public fun httpUrl(): String

    /**
     * The ARN of the KMS key used to encrypt the file asset bucket, if any.
     *
     * The CDK bootstrap stack comes with a key policy that does not require setting this property,
     * so you only need to set this property if you have customized the bootstrap stack to require
     * it.
     *
     * Default: - Asset bucket is not encrypted, or decryption permissions are defined by a Key
     * Policy.
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /** The Amazon S3 object key. */
    public fun objectKey(): String

    /**
     * The S3 URL of this asset on Amazon S3.
     *
     * This value suitable for inclusion in a CloudFormation template, and may be an encoded token.
     *
     * Example value: `s3://mybucket/myobject`
     */
    public fun s3ObjectUrl(): String

    /**
     * Like `s3ObjectUrl`, but not suitable for CloudFormation consumption.
     *
     * If there are placeholders in the S3 URL, they will be returned un-replaced and un-evaluated.
     *
     * Default: - This feature cannot be used
     */
    public fun s3ObjectUrlWithPlaceholders(): String? =
        unwrap(this).getS3ObjectUrlWithPlaceholders()

    /** A builder for [FileAssetLocation] */
    @CdkDslMarker
    public interface Builder {
        /** @param bucketName The name of the Amazon S3 bucket. */
        public fun bucketName(bucketName: String)

        /**
         * @param httpUrl The HTTP URL of this asset on Amazon S3. This value suitable for inclusion
         *   in a CloudFormation template, and may be an encoded token.
         *
         * Example value: `https://s3-us-east-1.amazonaws.com/mybucket/myobject`
         */
        public fun httpUrl(httpUrl: String)

        /**
         * @param kmsKeyArn The ARN of the KMS key used to encrypt the file asset bucket, if any.
         *   The CDK bootstrap stack comes with a key policy that does not require setting this
         *   property, so you only need to set this property if you have customized the bootstrap
         *   stack to require it.
         */
        public fun kmsKeyArn(kmsKeyArn: String)

        /** @param objectKey The Amazon S3 object key. */
        public fun objectKey(objectKey: String)

        /**
         * @param s3ObjectUrl The S3 URL of this asset on Amazon S3. This value suitable for
         *   inclusion in a CloudFormation template, and may be an encoded token.
         *
         * Example value: `s3://mybucket/myobject`
         */
        public fun s3ObjectUrl(s3ObjectUrl: String)

        /**
         * @param s3ObjectUrlWithPlaceholders Like `s3ObjectUrl`, but not suitable for
         *   CloudFormation consumption. If there are placeholders in the S3 URL, they will be
         *   returned un-replaced and un-evaluated.
         */
        public fun s3ObjectUrlWithPlaceholders(s3ObjectUrlWithPlaceholders: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.FileAssetLocation.Builder =
            software.amazon.awscdk.FileAssetLocation.builder()

        /** @param bucketName The name of the Amazon S3 bucket. */
        override fun bucketName(bucketName: String) {
            cdkBuilder.bucketName(bucketName)
        }

        /**
         * @param httpUrl The HTTP URL of this asset on Amazon S3. This value suitable for inclusion
         *   in a CloudFormation template, and may be an encoded token.
         *
         * Example value: `https://s3-us-east-1.amazonaws.com/mybucket/myobject`
         */
        override fun httpUrl(httpUrl: String) {
            cdkBuilder.httpUrl(httpUrl)
        }

        /**
         * @param kmsKeyArn The ARN of the KMS key used to encrypt the file asset bucket, if any.
         *   The CDK bootstrap stack comes with a key policy that does not require setting this
         *   property, so you only need to set this property if you have customized the bootstrap
         *   stack to require it.
         */
        override fun kmsKeyArn(kmsKeyArn: String) {
            cdkBuilder.kmsKeyArn(kmsKeyArn)
        }

        /** @param objectKey The Amazon S3 object key. */
        override fun objectKey(objectKey: String) {
            cdkBuilder.objectKey(objectKey)
        }

        /**
         * @param s3ObjectUrl The S3 URL of this asset on Amazon S3. This value suitable for
         *   inclusion in a CloudFormation template, and may be an encoded token.
         *
         * Example value: `s3://mybucket/myobject`
         */
        override fun s3ObjectUrl(s3ObjectUrl: String) {
            cdkBuilder.s3ObjectUrl(s3ObjectUrl)
        }

        /**
         * @param s3ObjectUrlWithPlaceholders Like `s3ObjectUrl`, but not suitable for
         *   CloudFormation consumption. If there are placeholders in the S3 URL, they will be
         *   returned un-replaced and un-evaluated.
         */
        override fun s3ObjectUrlWithPlaceholders(s3ObjectUrlWithPlaceholders: String) {
            cdkBuilder.s3ObjectUrlWithPlaceholders(s3ObjectUrlWithPlaceholders)
        }

        public fun build(): software.amazon.awscdk.FileAssetLocation = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.FileAssetLocation,
    ) : FileAssetLocation {
        /** The name of the Amazon S3 bucket. */
        override fun bucketName(): String = unwrap(this).getBucketName()

        /**
         * The HTTP URL of this asset on Amazon S3.
         *
         * This value suitable for inclusion in a CloudFormation template, and may be an encoded
         * token.
         *
         * Example value: `https://s3-us-east-1.amazonaws.com/mybucket/myobject`
         */
        override fun httpUrl(): String = unwrap(this).getHttpUrl()

        /**
         * The ARN of the KMS key used to encrypt the file asset bucket, if any.
         *
         * The CDK bootstrap stack comes with a key policy that does not require setting this
         * property, so you only need to set this property if you have customized the bootstrap
         * stack to require it.
         *
         * Default: - Asset bucket is not encrypted, or decryption permissions are defined by a Key
         * Policy.
         */
        override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

        /** The Amazon S3 object key. */
        override fun objectKey(): String = unwrap(this).getObjectKey()

        /**
         * The S3 URL of this asset on Amazon S3.
         *
         * This value suitable for inclusion in a CloudFormation template, and may be an encoded
         * token.
         *
         * Example value: `s3://mybucket/myobject`
         */
        override fun s3ObjectUrl(): String = unwrap(this).getS3ObjectUrl()

        /**
         * Like `s3ObjectUrl`, but not suitable for CloudFormation consumption.
         *
         * If there are placeholders in the S3 URL, they will be returned un-replaced and
         * un-evaluated.
         *
         * Default: - This feature cannot be used
         */
        override fun s3ObjectUrlWithPlaceholders(): String? =
            unwrap(this).getS3ObjectUrlWithPlaceholders()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): FileAssetLocation {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.FileAssetLocation): FileAssetLocation =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: FileAssetLocation): software.amazon.awscdk.FileAssetLocation =
            (wrapped as Wrapper).cdkObject
    }
}
