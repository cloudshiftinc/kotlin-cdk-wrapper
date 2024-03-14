package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.s3.Location
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface BedrockInvokeModelInputProps {
    /**
     * S3 object to retrieve the input data from.
     *
     * If the S3 location is not set, then the Body must be set.
     *
     * Default: Input data is retrieved from the `body` field
     */
    public fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)

    /** A builder for [BedrockInvokeModelInputProps] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param s3Location S3 object to retrieve the input data from. If the S3 location is not
         *   set, then the Body must be set.
         */
        public fun s3Location(s3Location: Location)

        /**
         * @param s3Location S3 object to retrieve the input data from. If the S3 location is not
         *   set, then the Body must be set.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2b187a28fa1b63eb5484ceff47fbc536aae7c8a9ff0f76477660323bf8a8a376")
        public fun s3Location(s3Location: Location.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps.Builder =
            software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps
                .builder()

        /**
         * @param s3Location S3 object to retrieve the input data from. If the S3 location is not
         *   set, then the Body must be set.
         */
        override fun s3Location(s3Location: Location) {
            cdkBuilder.s3Location(s3Location.let(Location::unwrap))
        }

        /**
         * @param s3Location S3 object to retrieve the input data from. If the S3 location is not
         *   set, then the Body must be set.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("2b187a28fa1b63eb5484ceff47fbc536aae7c8a9ff0f76477660323bf8a8a376")
        override fun s3Location(s3Location: Location.Builder.() -> Unit): Unit =
            s3Location(Location(s3Location))

        public fun build():
            software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps,
    ) : BedrockInvokeModelInputProps {
        /**
         * S3 object to retrieve the input data from.
         *
         * If the S3 location is not set, then the Body must be set.
         *
         * Default: Input data is retrieved from the `body` field
         */
        override fun s3Location(): Location? = unwrap(this).getS3Location()?.let(Location::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): BedrockInvokeModelInputProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject:
                software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps
        ): BedrockInvokeModelInputProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: BedrockInvokeModelInputProps
        ): software.amazon.awscdk.services.stepfunctions.tasks.BedrockInvokeModelInputProps =
            (wrapped as Wrapper).cdkObject
    }
}
