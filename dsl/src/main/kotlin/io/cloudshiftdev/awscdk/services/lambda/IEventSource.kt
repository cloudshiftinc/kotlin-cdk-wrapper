package io.cloudshiftdev.awscdk.services.lambda

public interface IEventSource {
    /**
     * Called by `lambda.addEventSource` to allow the event source to bind to this function.
     *
     * @param target That lambda function to bind to.
     */
    public fun bind(target: IFunction)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.lambda.IEventSource,
    ) : IEventSource {
        /**
         * Called by `lambda.addEventSource` to allow the event source to bind to this function.
         *
         * @param target That lambda function to bind to.
         */
        override fun bind(target: IFunction) {
            unwrap(this).bind(target.let(IFunction::unwrap))
        }
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.IEventSource
        ): IEventSource = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IEventSource
        ): software.amazon.awscdk.services.lambda.IEventSource = (wrapped as Wrapper).cdkObject
    }
}
