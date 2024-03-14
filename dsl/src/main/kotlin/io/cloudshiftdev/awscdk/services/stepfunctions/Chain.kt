package io.cloudshiftdev.awscdk.services.stepfunctions

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class Chain
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.stepfunctions.Chain,
) : IChainable {
    /** The chainable end state(s) of this chain. */
    public override fun endStates(): List<INextable> =
        unwrap(this).getEndStates().map(INextable::wrap)

    /** Identify this Chain. */
    public override fun id(): String = unwrap(this).getId()

    /**
     * Continue normal execution with the given state.
     *
     * @param next
     */
    public open fun next(next: IChainable): Chain =
        unwrap(this).next(next.let(IChainable::unwrap)).let(Chain::wrap)

    /** The start state of this chain. */
    public override fun startState(): State = unwrap(this).getStartState().let(State::wrap)

    /**
     * Return a single state that encompasses all states in the chain.
     *
     * This can be used to add error handling to a sequence of states.
     *
     * Be aware that this changes the result of the inner state machine to be an array with the
     * result of the state machine in it. Adjust your paths accordingly. For example, change
     * 'outputPath' to '$[0]'.
     *
     * @param id
     * @param props
     */
    public open fun toSingleState(id: String): Parallel =
        unwrap(this).toSingleState(id).let(Parallel::wrap)

    /**
     * Return a single state that encompasses all states in the chain.
     *
     * This can be used to add error handling to a sequence of states.
     *
     * Be aware that this changes the result of the inner state machine to be an array with the
     * result of the state machine in it. Adjust your paths accordingly. For example, change
     * 'outputPath' to '$[0]'.
     *
     * @param id
     * @param props
     */
    public open fun toSingleState(id: String, props: ParallelProps): Parallel =
        unwrap(this).toSingleState(id, props.let(ParallelProps::unwrap)).let(Parallel::wrap)

    /**
     * Return a single state that encompasses all states in the chain.
     *
     * This can be used to add error handling to a sequence of states.
     *
     * Be aware that this changes the result of the inner state machine to be an array with the
     * result of the state machine in it. Adjust your paths accordingly. For example, change
     * 'outputPath' to '$[0]'.
     *
     * @param id
     * @param props
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bfbc6fc4c1263bfdf5b466cb84f72995423df5a217f266edfb800629a41991e5")
    public open fun toSingleState(id: String, props: ParallelProps.Builder.() -> Unit): Parallel =
        toSingleState(id, ParallelProps(props))

    public companion object {
        public fun custom(
            startState: State,
            endStates: List<INextable>,
            lastAdded: IChainable,
        ): Chain =
            software.amazon.awscdk.services.stepfunctions.Chain.custom(
                    startState.let(State::unwrap),
                    endStates.map(INextable::unwrap),
                    lastAdded.let(IChainable::unwrap)
                )
                .let(Chain::wrap)

        public fun sequence(start: IChainable, next: IChainable): Chain =
            software.amazon.awscdk.services.stepfunctions.Chain.sequence(
                    start.let(IChainable::unwrap),
                    next.let(IChainable::unwrap)
                )
                .let(Chain::wrap)

        public fun start(state: IChainable): Chain =
            software.amazon.awscdk.services.stepfunctions.Chain.start(state.let(IChainable::unwrap))
                .let(Chain::wrap)

        internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.Chain): Chain =
            Chain(cdkObject)

        internal fun unwrap(wrapped: Chain): software.amazon.awscdk.services.stepfunctions.Chain =
            wrapped.cdkObject
    }
}
