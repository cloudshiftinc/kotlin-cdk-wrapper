package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface AutoRollbackConfig {
    /**
     * Whether to automatically roll back a deployment during which one of the configured CloudWatch
     * alarms for this Deployment Group went off.
     *
     * Default: true if you've provided any Alarms with the `alarms` property, false otherwise
     */
    public fun deploymentInAlarm(): Boolean? = unwrap(this).getDeploymentInAlarm()

    /**
     * Whether to automatically roll back a deployment that fails.
     *
     * Default: true
     */
    public fun failedDeployment(): Boolean? = unwrap(this).getFailedDeployment()

    /**
     * Whether to automatically roll back a deployment that was manually stopped.
     *
     * Default: false
     */
    public fun stoppedDeployment(): Boolean? = unwrap(this).getStoppedDeployment()

    /** A builder for [AutoRollbackConfig] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param deploymentInAlarm Whether to automatically roll back a deployment during which one
         *   of the configured CloudWatch alarms for this Deployment Group went off.
         */
        public fun deploymentInAlarm(deploymentInAlarm: Boolean)

        /** @param failedDeployment Whether to automatically roll back a deployment that fails. */
        public fun failedDeployment(failedDeployment: Boolean)

        /**
         * @param stoppedDeployment Whether to automatically roll back a deployment that was
         *   manually stopped.
         */
        public fun stoppedDeployment(stoppedDeployment: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.codedeploy.AutoRollbackConfig.Builder =
            software.amazon.awscdk.services.codedeploy.AutoRollbackConfig.builder()

        /**
         * @param deploymentInAlarm Whether to automatically roll back a deployment during which one
         *   of the configured CloudWatch alarms for this Deployment Group went off.
         */
        override fun deploymentInAlarm(deploymentInAlarm: Boolean) {
            cdkBuilder.deploymentInAlarm(deploymentInAlarm)
        }

        /** @param failedDeployment Whether to automatically roll back a deployment that fails. */
        override fun failedDeployment(failedDeployment: Boolean) {
            cdkBuilder.failedDeployment(failedDeployment)
        }

        /**
         * @param stoppedDeployment Whether to automatically roll back a deployment that was
         *   manually stopped.
         */
        override fun stoppedDeployment(stoppedDeployment: Boolean) {
            cdkBuilder.stoppedDeployment(stoppedDeployment)
        }

        public fun build(): software.amazon.awscdk.services.codedeploy.AutoRollbackConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.codedeploy.AutoRollbackConfig,
    ) : AutoRollbackConfig {
        /**
         * Whether to automatically roll back a deployment during which one of the configured
         * CloudWatch alarms for this Deployment Group went off.
         *
         * Default: true if you've provided any Alarms with the `alarms` property, false otherwise
         */
        override fun deploymentInAlarm(): Boolean? = unwrap(this).getDeploymentInAlarm()

        /**
         * Whether to automatically roll back a deployment that fails.
         *
         * Default: true
         */
        override fun failedDeployment(): Boolean? = unwrap(this).getFailedDeployment()

        /**
         * Whether to automatically roll back a deployment that was manually stopped.
         *
         * Default: false
         */
        override fun stoppedDeployment(): Boolean? = unwrap(this).getStoppedDeployment()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): AutoRollbackConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codedeploy.AutoRollbackConfig
        ): AutoRollbackConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: AutoRollbackConfig
        ): software.amazon.awscdk.services.codedeploy.AutoRollbackConfig =
            (wrapped as Wrapper).cdkObject
    }
}
