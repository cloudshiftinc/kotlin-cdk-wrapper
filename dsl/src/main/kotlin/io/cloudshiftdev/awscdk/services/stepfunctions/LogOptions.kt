package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.logs.ILogGroup
import kotlin.Boolean
import kotlin.Unit

public interface LogOptions {
    /** The log group where the execution history events will be logged. */
    public fun destination(): ILogGroup

    /**
     * Determines whether execution data is included in your log.
     *
     * Default: false
     */
    public fun includeExecutionData(): Boolean? = unwrap(this).getIncludeExecutionData()

    /**
     * Defines which category of execution history events are logged.
     *
     * Default: ERROR
     */
    public fun level(): LogLevel? = unwrap(this).getLevel()?.let(LogLevel::wrap)

    /** A builder for [LogOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param destination The log group where the execution history events will be logged. */
        public fun destination(destination: ILogGroup)

        /**
         * @param includeExecutionData Determines whether execution data is included in your log.
         */
        public fun includeExecutionData(includeExecutionData: Boolean)

        /** @param level Defines which category of execution history events are logged. */
        public fun level(level: LogLevel)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.LogOptions.Builder =
            software.amazon.awscdk.services.stepfunctions.LogOptions.builder()

        /** @param destination The log group where the execution history events will be logged. */
        override fun destination(destination: ILogGroup) {
            cdkBuilder.destination(destination.let(ILogGroup::unwrap))
        }

        /**
         * @param includeExecutionData Determines whether execution data is included in your log.
         */
        override fun includeExecutionData(includeExecutionData: Boolean) {
            cdkBuilder.includeExecutionData(includeExecutionData)
        }

        /** @param level Defines which category of execution history events are logged. */
        override fun level(level: LogLevel) {
            cdkBuilder.level(level.let(LogLevel::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.stepfunctions.LogOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.stepfunctions.LogOptions,
    ) : LogOptions {
        /** The log group where the execution history events will be logged. */
        override fun destination(): ILogGroup = unwrap(this).getDestination().let(ILogGroup::wrap)

        /**
         * Determines whether execution data is included in your log.
         *
         * Default: false
         */
        override fun includeExecutionData(): Boolean? = unwrap(this).getIncludeExecutionData()

        /**
         * Defines which category of execution history events are logged.
         *
         * Default: ERROR
         */
        override fun level(): LogLevel? = unwrap(this).getLevel()?.let(LogLevel::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): LogOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.LogOptions
        ): LogOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: LogOptions
        ): software.amazon.awscdk.services.stepfunctions.LogOptions = (wrapped as Wrapper).cdkObject
    }
}
