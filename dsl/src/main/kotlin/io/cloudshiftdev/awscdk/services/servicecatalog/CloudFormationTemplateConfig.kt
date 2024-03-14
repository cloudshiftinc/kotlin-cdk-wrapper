package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface CloudFormationTemplateConfig {
    /**
     * The S3 bucket containing product stack assets.
     *
     * Default: - None - no assets are used in this product
     */
    public fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

    /** The http url of the template in S3. */
    public fun httpUrl(): String

    /** A builder for [CloudFormationTemplateConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param assetBucket The S3 bucket containing product stack assets. */
        public fun assetBucket(assetBucket: IBucket)

        /** @param httpUrl The http url of the template in S3. */
        public fun httpUrl(httpUrl: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig.Builder =
            software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig.builder()

        /** @param assetBucket The S3 bucket containing product stack assets. */
        override fun assetBucket(assetBucket: IBucket) {
            cdkBuilder.assetBucket(assetBucket.let(IBucket::unwrap))
        }

        /** @param httpUrl The http url of the template in S3. */
        override fun httpUrl(httpUrl: String) {
            cdkBuilder.httpUrl(httpUrl)
        }

        public fun build():
            software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig,
    ) : CloudFormationTemplateConfig {
        /**
         * The S3 bucket containing product stack assets.
         *
         * Default: - None - no assets are used in this product
         */
        override fun assetBucket(): IBucket? = unwrap(this).getAssetBucket()?.let(IBucket::wrap)

        /** The http url of the template in S3. */
        override fun httpUrl(): String = unwrap(this).getHttpUrl()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationTemplateConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig
        ): CloudFormationTemplateConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: CloudFormationTemplateConfig
        ): software.amazon.awscdk.services.servicecatalog.CloudFormationTemplateConfig =
            (wrapped as Wrapper).cdkObject
    }
}
