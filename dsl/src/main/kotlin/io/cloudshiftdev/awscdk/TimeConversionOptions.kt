package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface TimeConversionOptions {
    /**
     * If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if the
     * result is not an integer.
     *
     * Default: true
     */
    public fun integral(): Boolean? = unwrap(this).getIntegral()

    /** A builder for [TimeConversionOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param integral If `true`, conversions into a larger time unit (e.g. `Seconds` to
         *   `Minutes`) will fail if the result is not an integer.
         */
        public fun integral(integral: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.TimeConversionOptions.Builder =
            software.amazon.awscdk.TimeConversionOptions.builder()

        /**
         * @param integral If `true`, conversions into a larger time unit (e.g. `Seconds` to
         *   `Minutes`) will fail if the result is not an integer.
         */
        override fun integral(integral: Boolean) {
            cdkBuilder.integral(integral)
        }

        public fun build(): software.amazon.awscdk.TimeConversionOptions = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.TimeConversionOptions,
    ) : TimeConversionOptions {
        /**
         * If `true`, conversions into a larger time unit (e.g. `Seconds` to `Minutes`) will fail if
         * the result is not an integer.
         *
         * Default: true
         */
        override fun integral(): Boolean? = unwrap(this).getIntegral()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): TimeConversionOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.TimeConversionOptions
        ): TimeConversionOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: TimeConversionOptions
        ): software.amazon.awscdk.TimeConversionOptions = (wrapped as Wrapper).cdkObject
    }
}
