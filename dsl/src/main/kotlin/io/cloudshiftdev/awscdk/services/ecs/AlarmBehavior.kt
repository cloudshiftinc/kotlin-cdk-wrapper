package io.cloudshiftdev.awscdk.services.ecs

public enum class AlarmBehavior(
    private val cdkObject: software.amazon.awscdk.services.ecs.AlarmBehavior,
) {
    ROLLBACK_ON_ALARM(software.amazon.awscdk.services.ecs.AlarmBehavior.ROLLBACK_ON_ALARM),
    FAIL_ON_ALARM(software.amazon.awscdk.services.ecs.AlarmBehavior.FAIL_ON_ALARM),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.AlarmBehavior
        ): AlarmBehavior =
            when (cdkObject) {
                software.amazon.awscdk.services.ecs.AlarmBehavior.ROLLBACK_ON_ALARM ->
                    AlarmBehavior.ROLLBACK_ON_ALARM
                software.amazon.awscdk.services.ecs.AlarmBehavior.FAIL_ON_ALARM ->
                    AlarmBehavior.FAIL_ON_ALARM
            }

        internal fun unwrap(
            wrapped: AlarmBehavior
        ): software.amazon.awscdk.services.ecs.AlarmBehavior = wrapped.cdkObject
    }
}
