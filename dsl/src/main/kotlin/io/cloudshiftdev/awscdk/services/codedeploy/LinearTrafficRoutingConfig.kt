package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface LinearTrafficRoutingConfig {
    /**
     * The number of minutes between each incremental traffic shift of a `TimeBasedLinear`
     * deployment.
     */
    public fun linearInterval(): Number

    /**
     * The percentage of traffic that is shifted at the start of each increment of a
     * `TimeBasedLinear` deployment.
     */
    public fun linearPercentage(): Number

    /** A builder for [LinearTrafficRoutingConfig] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param linearInterval The number of minutes between each incremental traffic shift of a
         *   `TimeBasedLinear` deployment.
         */
        public fun linearInterval(linearInterval: Number)

        /**
         * @param linearPercentage The percentage of traffic that is shifted at the start of each
         *   increment of a `TimeBasedLinear` deployment.
         */
        public fun linearPercentage(linearPercentage: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig.Builder =
            software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig.builder()

        /**
         * @param linearInterval The number of minutes between each incremental traffic shift of a
         *   `TimeBasedLinear` deployment.
         */
        override fun linearInterval(linearInterval: Number) {
            cdkBuilder.linearInterval(linearInterval)
        }

        /**
         * @param linearPercentage The percentage of traffic that is shifted at the start of each
         *   increment of a `TimeBasedLinear` deployment.
         */
        override fun linearPercentage(linearPercentage: Number) {
            cdkBuilder.linearPercentage(linearPercentage)
        }

        public fun build(): software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig,
    ) : LinearTrafficRoutingConfig {
        /**
         * The number of minutes between each incremental traffic shift of a `TimeBasedLinear`
         * deployment.
         */
        override fun linearInterval(): Number = unwrap(this).getLinearInterval()

        /**
         * The percentage of traffic that is shifted at the start of each increment of a
         * `TimeBasedLinear` deployment.
         */
        override fun linearPercentage(): Number = unwrap(this).getLinearPercentage()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): LinearTrafficRoutingConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig
        ): LinearTrafficRoutingConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: LinearTrafficRoutingConfig
        ): software.amazon.awscdk.services.codedeploy.LinearTrafficRoutingConfig =
            (wrapped as Wrapper).cdkObject
    }
}
