package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface TaskEnvironmentVariable {
    /**
     * Name for the environment variable.
     *
     * Exactly one of `name` and `namePath` must be specified.
     */
    public fun name(): String

    /**
     * Value of the environment variable.
     *
     * Exactly one of `value` and `valuePath` must be specified.
     */
    public fun `value`(): String

    /** A builder for [TaskEnvironmentVariable] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param name Name for the environment variable. Exactly one of `name` and `namePath` must
         *   be specified.
         */
        public fun name(name: String)

        /**
         * @param value Value of the environment variable. Exactly one of `value` and `valuePath`
         *   must be specified.
         */
        public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable.Builder =
            software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable.builder()

        /**
         * @param name Name for the environment variable. Exactly one of `name` and `namePath` must
         *   be specified.
         */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * @param value Value of the environment variable. Exactly one of `value` and `valuePath`
         *   must be specified.
         */
        override fun `value`(`value`: String) {
            cdkBuilder.`value`(`value`)
        }

        public fun build(): software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable,
    ) : TaskEnvironmentVariable {
        /**
         * Name for the environment variable.
         *
         * Exactly one of `name` and `namePath` must be specified.
         */
        override fun name(): String = unwrap(this).getName()

        /**
         * Value of the environment variable.
         *
         * Exactly one of `value` and `valuePath` must be specified.
         */
        override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): TaskEnvironmentVariable {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable
        ): TaskEnvironmentVariable = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: TaskEnvironmentVariable
        ): software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable =
            (wrapped as Wrapper).cdkObject
    }
}
