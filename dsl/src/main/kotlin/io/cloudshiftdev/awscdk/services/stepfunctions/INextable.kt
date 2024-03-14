package io.cloudshiftdev.awscdk.services.stepfunctions

public interface INextable {
    /**
     * Go to the indicated state after this state.
     *
     * @param state
     * @return The chain of states built up
     */
    public fun next(state: IChainable): Chain

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.stepfunctions.INextable,
    ) : INextable {
        /**
         * Go to the indicated state after this state.
         *
         * @param state
         * @return The chain of states built up
         */
        override fun next(state: IChainable): Chain =
            unwrap(this).next(state.let(IChainable::unwrap)).let(Chain::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.stepfunctions.INextable
        ): INextable = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: INextable
        ): software.amazon.awscdk.services.stepfunctions.INextable = (wrapped as Wrapper).cdkObject
    }
}
