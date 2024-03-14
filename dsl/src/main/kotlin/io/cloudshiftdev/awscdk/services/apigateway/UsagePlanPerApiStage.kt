package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.List

public interface UsagePlanPerApiStage {
    /** Default: none */
    public fun api(): IRestApi? = unwrap(this).getApi()?.let(IRestApi::wrap)

    /**
     * [disable-awslint:ref-via-interface].
     *
     * Default: none
     */
    public fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)

    /** Default: none */
    public fun throttle(): List<ThrottlingPerMethod> =
        unwrap(this).getThrottle()?.map(ThrottlingPerMethod::wrap) ?: emptyList()

    /** A builder for [UsagePlanPerApiStage] */
    @CdkDslMarker
    public interface Builder {
        /** @param api the value to be set. */
        public fun api(api: IRestApi)

        /** @param stage [disable-awslint:ref-via-interface]. */
        public fun stage(stage: Stage)

        /** @param throttle the value to be set. */
        public fun throttle(throttle: List<ThrottlingPerMethod>)

        /** @param throttle the value to be set. */
        public fun throttle(vararg throttle: ThrottlingPerMethod)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage.Builder =
            software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage.builder()

        /** @param api the value to be set. */
        override fun api(api: IRestApi) {
            cdkBuilder.api(api.let(IRestApi::unwrap))
        }

        /** @param stage [disable-awslint:ref-via-interface]. */
        override fun stage(stage: Stage) {
            cdkBuilder.stage(stage.let(Stage::unwrap))
        }

        /** @param throttle the value to be set. */
        override fun throttle(throttle: List<ThrottlingPerMethod>) {
            cdkBuilder.throttle(throttle.map(ThrottlingPerMethod::unwrap))
        }

        /** @param throttle the value to be set. */
        override fun throttle(vararg throttle: ThrottlingPerMethod): Unit =
            throttle(throttle.toList())

        public fun build(): software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage,
    ) : UsagePlanPerApiStage {
        /** Default: none */
        override fun api(): IRestApi? = unwrap(this).getApi()?.let(IRestApi::wrap)

        /**
         * [disable-awslint:ref-via-interface].
         *
         * Default: none
         */
        override fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)

        /** Default: none */
        override fun throttle(): List<ThrottlingPerMethod> =
            unwrap(this).getThrottle()?.map(ThrottlingPerMethod::wrap) ?: emptyList()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): UsagePlanPerApiStage {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage
        ): UsagePlanPerApiStage = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: UsagePlanPerApiStage
        ): software.amazon.awscdk.services.apigateway.UsagePlanPerApiStage =
            (wrapped as Wrapper).cdkObject
    }
}
