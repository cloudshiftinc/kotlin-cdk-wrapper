package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface AwsIamConfig {
    /** The signing region for AWS IAM authorization. */
    public fun signingRegion(): String

    /** The signing service name for AWS IAM authorization. */
    public fun signingServiceName(): String

    /** A builder for [AwsIamConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param signingRegion The signing region for AWS IAM authorization. */
        public fun signingRegion(signingRegion: String)

        /** @param signingServiceName The signing service name for AWS IAM authorization. */
        public fun signingServiceName(signingServiceName: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.appsync.AwsIamConfig.Builder =
            software.amazon.awscdk.services.appsync.AwsIamConfig.builder()

        /** @param signingRegion The signing region for AWS IAM authorization. */
        override fun signingRegion(signingRegion: String) {
            cdkBuilder.signingRegion(signingRegion)
        }

        /** @param signingServiceName The signing service name for AWS IAM authorization. */
        override fun signingServiceName(signingServiceName: String) {
            cdkBuilder.signingServiceName(signingServiceName)
        }

        public fun build(): software.amazon.awscdk.services.appsync.AwsIamConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appsync.AwsIamConfig,
    ) : AwsIamConfig {
        /** The signing region for AWS IAM authorization. */
        override fun signingRegion(): String = unwrap(this).getSigningRegion()

        /** The signing service name for AWS IAM authorization. */
        override fun signingServiceName(): String = unwrap(this).getSigningServiceName()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): AwsIamConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appsync.AwsIamConfig
        ): AwsIamConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: AwsIamConfig
        ): software.amazon.awscdk.services.appsync.AwsIamConfig = (wrapped as Wrapper).cdkObject
    }
}
