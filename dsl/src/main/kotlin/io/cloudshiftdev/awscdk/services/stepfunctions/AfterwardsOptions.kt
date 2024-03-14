package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface AfterwardsOptions {
    /**
     * Whether to include error handling states.
     *
     * If this is true, all states which are error handlers (added through 'onError') and states
     * reachable via error handlers will be included as well.
     *
     * Default: false
     */
    public fun includeErrorHandlers(): Boolean? = unwrap(this).getIncludeErrorHandlers()

    /**
     * Whether to include the default/otherwise transition for the current Choice state.
     *
     * If this is true and the current Choice does not have a default outgoing transition, one will
     * be added included when .next() is called on the chain.
     *
     * Default: false
     */
    public fun includeOtherwise(): Boolean? = unwrap(this).getIncludeOtherwise()

    /** A builder for [AfterwardsOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param includeErrorHandlers Whether to include error handling states. If this is true,
         *   all states which are error handlers (added through 'onError') and states reachable via
         *   error handlers will be included as well.
         */
        public fun includeErrorHandlers(includeErrorHandlers: Boolean)

        /**
         * @param includeOtherwise Whether to include the default/otherwise transition for the
         *   current Choice state. If this is true and the current Choice does not have a default
         *   outgoing transition, one will be added included when .next() is called on the chain.
         */
        public fun includeOtherwise(includeOtherwise: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.Builder =
            software.amazon.awscdk.services.stepfunctions.AfterwardsOptions.builder()

        /**
         * @param includeErrorHandlers Whether to include error handling states. If this is true,
         *   all states which are error handlers (added through 'onError') and states reachable via
         *   error handlers will be included as well.
         */
        override fun includeErrorHandlers(includeErrorHandlers: Boolean) {
            cdkBuilder.includeErrorHandlers(includeErrorHandlers)
        }

        /**
         * @param includeOtherwise Whether to include the default/otherwise transition for the
         *   current Choice state. If this is true and the current Choice does not have a default
         *   outgoing transition, one will be added included when .next() is called on the chain.
         */
        override fun includeOtherwise(includeOtherwise: Boolean) {
            cdkBuilder.includeOtherwise(includeOtherwise)
        }

        public fun build(): software.amazon.awscdk.services.stepfunctions.AfterwardsOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.stepfunctions.AfterwardsOptions,
    ) : AfterwardsOptions {
        /**
         * Whether to include error handling states.
         *
         * If this is true, all states which are error handlers (added through 'onError') and states
         * reachable via error handlers will be included as well.
         *
         * Default: false
         */
        override fun includeErrorHandlers(): Boolean? = unwrap(this).getIncludeErrorHandlers()

        /**
         * Whether to include the default/otherwise transition for the current Choice state.
         *
         * If this is true and the current Choice does not have a default outgoing transition, one
         * will be added included when .next() is called on the chain.
         *
         * Default: false
         */
        override fun includeOtherwise(): Boolean? = unwrap(this).getIncludeOtherwise()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): AfterwardsOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.AfterwardsOptions
        ): AfterwardsOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: AfterwardsOptions
        ): software.amazon.awscdk.services.stepfunctions.AfterwardsOptions =
            (wrapped as Wrapper).cdkObject
    }
}
