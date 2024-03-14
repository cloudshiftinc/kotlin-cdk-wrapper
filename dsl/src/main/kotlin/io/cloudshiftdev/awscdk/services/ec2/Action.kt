package io.cloudshiftdev.awscdk.services.ec2

public enum class Action(
    private val cdkObject: software.amazon.awscdk.services.ec2.Action,
) {
    ALLOW(software.amazon.awscdk.services.ec2.Action.ALLOW),
    DENY(software.amazon.awscdk.services.ec2.Action.DENY),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.Action): Action =
            when (cdkObject) {
                software.amazon.awscdk.services.ec2.Action.ALLOW -> Action.ALLOW
                software.amazon.awscdk.services.ec2.Action.DENY -> Action.DENY
            }

        internal fun unwrap(wrapped: Action): software.amazon.awscdk.services.ec2.Action =
            wrapped.cdkObject
    }
}
