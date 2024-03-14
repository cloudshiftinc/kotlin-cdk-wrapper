package io.cloudshiftdev.awscdk.services.cloudwatch

import kotlin.Any

public interface IVariable {
    /** Return the variable JSON for use in the dashboard. */
    public fun toJson(): Any

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cloudwatch.IVariable,
    ) : IVariable {
        /** Return the variable JSON for use in the dashboard. */
        override fun toJson(): Any = unwrap(this).toJson()
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudwatch.IVariable
        ): IVariable = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IVariable
        ): software.amazon.awscdk.services.cloudwatch.IVariable = (wrapped as Wrapper).cdkObject
    }
}
