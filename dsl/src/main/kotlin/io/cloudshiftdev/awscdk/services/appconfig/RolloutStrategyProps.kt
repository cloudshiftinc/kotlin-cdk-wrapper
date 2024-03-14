package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface RolloutStrategyProps {
    /**
     * The deployment duration of the deployment strategy.
     *
     * This defines the total amount of time for a deployment to last.
     */
    public fun deploymentDuration(): Duration

    /**
     * The final bake time of the deployment strategy.
     *
     * This setting specifies the amount of time AWS AppConfig monitors for Amazon CloudWatch alarms
     * after the configuration has been deployed to 100% of its targets, before considering the
     * deployment to be complete. If an alarm is triggered during this time, AWS AppConfig rolls
     * back the deployment.
     *
     * Default: Duration.minutes(0)
     */
    public fun finalBakeTime(): Duration? = unwrap(this).getFinalBakeTime()?.let(Duration::wrap)

    /**
     * The growth factor of the deployment strategy.
     *
     * This defines the percentage of targets to receive a deployed configuration during each
     * interval.
     */
    public fun growthFactor(): Number

    /** A builder for [RolloutStrategyProps] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param deploymentDuration The deployment duration of the deployment strategy. This
         *   defines the total amount of time for a deployment to last.
         */
        public fun deploymentDuration(deploymentDuration: Duration)

        /**
         * @param finalBakeTime The final bake time of the deployment strategy. This setting
         *   specifies the amount of time AWS AppConfig monitors for Amazon CloudWatch alarms after
         *   the configuration has been deployed to 100% of its targets, before considering the
         *   deployment to be complete. If an alarm is triggered during this time, AWS AppConfig
         *   rolls back the deployment.
         */
        public fun finalBakeTime(finalBakeTime: Duration)

        /**
         * @param growthFactor The growth factor of the deployment strategy. This defines the
         *   percentage of targets to receive a deployed configuration during each interval.
         */
        public fun growthFactor(growthFactor: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.appconfig.RolloutStrategyProps.Builder =
            software.amazon.awscdk.services.appconfig.RolloutStrategyProps.builder()

        /**
         * @param deploymentDuration The deployment duration of the deployment strategy. This
         *   defines the total amount of time for a deployment to last.
         */
        override fun deploymentDuration(deploymentDuration: Duration) {
            cdkBuilder.deploymentDuration(deploymentDuration.let(Duration::unwrap))
        }

        /**
         * @param finalBakeTime The final bake time of the deployment strategy. This setting
         *   specifies the amount of time AWS AppConfig monitors for Amazon CloudWatch alarms after
         *   the configuration has been deployed to 100% of its targets, before considering the
         *   deployment to be complete. If an alarm is triggered during this time, AWS AppConfig
         *   rolls back the deployment.
         */
        override fun finalBakeTime(finalBakeTime: Duration) {
            cdkBuilder.finalBakeTime(finalBakeTime.let(Duration::unwrap))
        }

        /**
         * @param growthFactor The growth factor of the deployment strategy. This defines the
         *   percentage of targets to receive a deployed configuration during each interval.
         */
        override fun growthFactor(growthFactor: Number) {
            cdkBuilder.growthFactor(growthFactor)
        }

        public fun build(): software.amazon.awscdk.services.appconfig.RolloutStrategyProps =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appconfig.RolloutStrategyProps,
    ) : RolloutStrategyProps {
        /**
         * The deployment duration of the deployment strategy.
         *
         * This defines the total amount of time for a deployment to last.
         */
        override fun deploymentDuration(): Duration =
            unwrap(this).getDeploymentDuration().let(Duration::wrap)

        /**
         * The final bake time of the deployment strategy.
         *
         * This setting specifies the amount of time AWS AppConfig monitors for Amazon CloudWatch
         * alarms after the configuration has been deployed to 100% of its targets, before
         * considering the deployment to be complete. If an alarm is triggered during this time, AWS
         * AppConfig rolls back the deployment.
         *
         * Default: Duration.minutes(0)
         */
        override fun finalBakeTime(): Duration? =
            unwrap(this).getFinalBakeTime()?.let(Duration::wrap)

        /**
         * The growth factor of the deployment strategy.
         *
         * This defines the percentage of targets to receive a deployed configuration during each
         * interval.
         */
        override fun growthFactor(): Number = unwrap(this).getGrowthFactor()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): RolloutStrategyProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appconfig.RolloutStrategyProps
        ): RolloutStrategyProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: RolloutStrategyProps
        ): software.amazon.awscdk.services.appconfig.RolloutStrategyProps =
            (wrapped as Wrapper).cdkObject
    }
}
