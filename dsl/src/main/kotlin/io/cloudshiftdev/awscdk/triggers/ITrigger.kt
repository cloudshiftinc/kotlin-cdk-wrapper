package io.cloudshiftdev.awscdk.triggers

import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import io.cloudshiftdev.constructs.Node

public interface ITrigger : IConstruct {
    /**
     * Adds trigger dependencies.
     *
     * Execute this trigger only after these construct scopes have been provisioned.
     *
     * @param scopes A list of construct scopes which this trigger will depend on.
     */
    public fun executeAfter(scopes: Construct)

    /**
     * Adds this trigger as a dependency on other constructs.
     *
     * This means that this trigger will get executed *before* the given construct(s).
     *
     * @param scopes A list of construct scopes which will take a dependency on this trigger.
     */
    public fun executeBefore(scopes: Construct)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.triggers.ITrigger,
    ) : ITrigger {
        /**
         * Adds trigger dependencies.
         *
         * Execute this trigger only after these construct scopes have been provisioned.
         *
         * @param scopes A list of construct scopes which this trigger will depend on.
         */
        override fun executeAfter(scopes: Construct) {
            unwrap(this).executeAfter(scopes.let(Construct::unwrap))
        }

        /**
         * Adds this trigger as a dependency on other constructs.
         *
         * This means that this trigger will get executed *before* the given construct(s).
         *
         * @param scopes A list of construct scopes which will take a dependency on this trigger.
         */
        override fun executeBefore(scopes: Construct) {
            unwrap(this).executeBefore(scopes.let(Construct::unwrap))
        }

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(cdkObject: software.amazon.awscdk.triggers.ITrigger): ITrigger =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: ITrigger): software.amazon.awscdk.triggers.ITrigger =
            (wrapped as Wrapper).cdkObject
    }
}
