package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface S3LocationBindOptions {
    /**
     * Allow reading from the S3 Location.
     *
     * Default: false
     */
    public fun forReading(): Boolean? = unwrap(this).getForReading()

    /**
     * Allow writing to the S3 Location.
     *
     * Default: false
     */
    public fun forWriting(): Boolean? = unwrap(this).getForWriting()

    /** A builder for [S3LocationBindOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param forReading Allow reading from the S3 Location. */
        public fun forReading(forReading: Boolean)

        /** @param forWriting Allow writing to the S3 Location. */
        public fun forWriting(forWriting: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions.Builder =
            software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions.builder()

        /** @param forReading Allow reading from the S3 Location. */
        override fun forReading(forReading: Boolean) {
            cdkBuilder.forReading(forReading)
        }

        /** @param forWriting Allow writing to the S3 Location. */
        override fun forWriting(forWriting: Boolean) {
            cdkBuilder.forWriting(forWriting)
        }

        public fun build():
            software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions,
    ) : S3LocationBindOptions {
        /**
         * Allow reading from the S3 Location.
         *
         * Default: false
         */
        override fun forReading(): Boolean? = unwrap(this).getForReading()

        /**
         * Allow writing to the S3 Location.
         *
         * Default: false
         */
        override fun forWriting(): Boolean? = unwrap(this).getForWriting()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationBindOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions
        ): S3LocationBindOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: S3LocationBindOptions
        ): software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions =
            (wrapped as Wrapper).cdkObject
    }
}
