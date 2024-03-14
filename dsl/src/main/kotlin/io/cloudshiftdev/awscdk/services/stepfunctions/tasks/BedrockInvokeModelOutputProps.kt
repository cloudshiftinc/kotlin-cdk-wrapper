package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BedrockInvokeModelOutputProps {
    /**
     * S3 object where the Bedrock InvokeModel API response is written.
     *
     * If you specify this field, the API response body is replaced with a reference to the Amazon
     * S3 location of the original output.
     *
     * Default: Response body is returned in the task result
     */
    public fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)

    /** A builder for [BedrockInvokeModelOutputProps] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param s3Location S3 object where the Bedrock InvokeModel API response is written. If you
         *   specify this field, the API response body is replaced with a reference to the Amazon S3
         *   location of the original output.
         */
        public fun s3Location(s3Location: Location)

        /**
         * @param s3Location S3 object where the Bedrock InvokeModel API response is written. If you
         *   specify this field, the API response body is replaced with a reference to the Amazon S3
         *   location of the original output.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e5257a3476a510565c590204e38431da4e61b6b37c4c561db431ef52d6de54db")
        public fun s3Location(s3Location: Location.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps.Builder =
            software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps
                .builder()

        /**
         * @param s3Location S3 object where the Bedrock InvokeModel API response is written. If you
         *   specify this field, the API response body is replaced with a reference to the Amazon S3
         *   location of the original output.
         */
        override fun s3Location(s3Location: Location) {
            cdkBuilder.s3Location(s3Location.let(Location::unwrap))
        }

        /**
         * @param s3Location S3 object where the Bedrock InvokeModel API response is written. If you
         *   specify this field, the API response body is replaced with a reference to the Amazon S3
         *   location of the original output.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e5257a3476a510565c590204e38431da4e61b6b37c4c561db431ef52d6de54db")
        override fun s3Location(s3Location: Location.Builder.() -> Unit): Unit =
            s3Location(Location(s3Location))

        public fun build():
            software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps,
    ) : BedrockInvokeModelOutputProps {
        /**
         * S3 object where the Bedrock InvokeModel API response is written.
         *
         * If you specify this field, the API response body is replaced with a reference to the
         * Amazon S3 location of the original output.
         *
         * Default: Response body is returned in the task result
         */
        override fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): BedrockInvokeModelOutputProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps
        ): BedrockInvokeModelOutputProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: BedrockInvokeModelOutputProps
        ): software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelOutputProps =
            (wrapped as Wrapper).cdkObject
    }
}
