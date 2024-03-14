package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface DeploymentAlarmOptions {
    /**
     * Default rollback on alarm.
     *
     * Default: AlarmBehavior.ROLLBACK_ON_ALARM
     */
    public fun behavior(): AlarmBehavior? = unwrap(this).getBehavior()?.let(AlarmBehavior::wrap)

    /** A builder for [DeploymentAlarmOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param behavior Default rollback on alarm. */
        public fun behavior(behavior: AlarmBehavior)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.DeploymentAlarmOptions.Builder =
            software.amazon.awscdk.services.ecs.DeploymentAlarmOptions.builder()

        /** @param behavior Default rollback on alarm. */
        override fun behavior(behavior: AlarmBehavior) {
            cdkBuilder.behavior(behavior.let(AlarmBehavior::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.ecs.DeploymentAlarmOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.DeploymentAlarmOptions,
    ) : DeploymentAlarmOptions {
        /**
         * Default rollback on alarm.
         *
         * Default: AlarmBehavior.ROLLBACK_ON_ALARM
         */
        override fun behavior(): AlarmBehavior? =
            unwrap(this).getBehavior()?.let(AlarmBehavior::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): DeploymentAlarmOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.DeploymentAlarmOptions
        ): DeploymentAlarmOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: DeploymentAlarmOptions
        ): software.amazon.awscdk.services.ecs.DeploymentAlarmOptions =
            (wrapped as Wrapper).cdkObject
    }
}
