package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface RuleProps : EventCommonOptions {
    /**
     * Indicates whether the rule is enabled.
     *
     * Default: true
     */
    public fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * The event bus to associate with this rule.
     *
     * Default: - The default event bus.
     */
    public fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

    /**
     * The schedule or rate (frequency) that determines when EventBridge runs the rule.
     *
     * You must specify this property, the `eventPattern` property, or both.
     *
     * For more information, see Schedule Expression Syntax for Rules in the Amazon EventBridge User
     * Guide.
     *
     * Default: - None.
     *
     * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/scheduled-events.html)
     */
    public fun schedule(): Schedule? = unwrap(this).getSchedule()?.let(Schedule::wrap)

    /**
     * Targets to invoke when this rule matches an event.
     *
     * Input will be the full matched event. If you wish to specify custom target input, use
     * `addTarget(target[, inputOptions])`.
     *
     * Default: - No targets.
     */
    public fun targets(): List<IRuleTarget> =
        unwrap(this).getTargets()?.map(IRuleTarget::wrap) ?: emptyList()

    /** A builder for [RuleProps] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param crossStackScope The scope to use if the source of the rule and its target are in
         *   different Stacks (but in the same account &amp; region). This helps dealing with cycles
         *   that often arise in these situations.
         */
        public fun crossStackScope(crossStackScope: Construct)

        /** @param description A description of the rule's purpose. */
        public fun description(description: String)

        /** @param enabled Indicates whether the rule is enabled. */
        public fun enabled(enabled: Boolean)

        /** @param eventBus The event bus to associate with this rule. */
        public fun eventBus(eventBus: IEventBus)

        /**
         * @param eventPattern Additional restrictions for the event to route to the specified
         *   target. The method that generates the rule probably imposes some type of event
         *   filtering. The filtering implied by what you pass here is added on top of that
         *   filtering.
         */
        public fun eventPattern(eventPattern: EventPattern)

        /**
         * @param eventPattern Additional restrictions for the event to route to the specified
         *   target. The method that generates the rule probably imposes some type of event
         *   filtering. The filtering implied by what you pass here is added on top of that
         *   filtering.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("0ab104f4a3c722682a4e6ee29c6b84abd481a6aa2221ac103ed943ba770e5b91")
        public fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit)

        /** @param ruleName A name for the rule. */
        public fun ruleName(ruleName: String)

        /**
         * @param schedule The schedule or rate (frequency) that determines when EventBridge runs
         *   the rule. You must specify this property, the `eventPattern` property, or both.
         *
         * For more information, see Schedule Expression Syntax for Rules in the Amazon EventBridge
         * User Guide.
         */
        public fun schedule(schedule: Schedule)

        /**
         * @param targets Targets to invoke when this rule matches an event. Input will be the full
         *   matched event. If you wish to specify custom target input, use `addTarget(target[,
         *   inputOptions])`.
         */
        public fun targets(targets: List<IRuleTarget>)

        /**
         * @param targets Targets to invoke when this rule matches an event. Input will be the full
         *   matched event. If you wish to specify custom target input, use `addTarget(target[,
         *   inputOptions])`.
         */
        public fun targets(vararg targets: IRuleTarget)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.events.RuleProps.Builder =
            software.amazon.awscdk.services.events.RuleProps.builder()

        /**
         * @param crossStackScope The scope to use if the source of the rule and its target are in
         *   different Stacks (but in the same account &amp; region). This helps dealing with cycles
         *   that often arise in these situations.
         */
        override fun crossStackScope(crossStackScope: Construct) {
            cdkBuilder.crossStackScope(crossStackScope.let(Construct::unwrap))
        }

        /** @param description A description of the rule's purpose. */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /** @param enabled Indicates whether the rule is enabled. */
        override fun enabled(enabled: Boolean) {
            cdkBuilder.enabled(enabled)
        }

        /** @param eventBus The event bus to associate with this rule. */
        override fun eventBus(eventBus: IEventBus) {
            cdkBuilder.eventBus(eventBus.let(IEventBus::unwrap))
        }

        /**
         * @param eventPattern Additional restrictions for the event to route to the specified
         *   target. The method that generates the rule probably imposes some type of event
         *   filtering. The filtering implied by what you pass here is added on top of that
         *   filtering.
         */
        override fun eventPattern(eventPattern: EventPattern) {
            cdkBuilder.eventPattern(eventPattern.let(EventPattern::unwrap))
        }

        /**
         * @param eventPattern Additional restrictions for the event to route to the specified
         *   target. The method that generates the rule probably imposes some type of event
         *   filtering. The filtering implied by what you pass here is added on top of that
         *   filtering.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("0ab104f4a3c722682a4e6ee29c6b84abd481a6aa2221ac103ed943ba770e5b91")
        override fun eventPattern(eventPattern: EventPattern.Builder.() -> Unit): Unit =
            eventPattern(EventPattern(eventPattern))

        /** @param ruleName A name for the rule. */
        override fun ruleName(ruleName: String) {
            cdkBuilder.ruleName(ruleName)
        }

        /**
         * @param schedule The schedule or rate (frequency) that determines when EventBridge runs
         *   the rule. You must specify this property, the `eventPattern` property, or both.
         *
         * For more information, see Schedule Expression Syntax for Rules in the Amazon EventBridge
         * User Guide.
         */
        override fun schedule(schedule: Schedule) {
            cdkBuilder.schedule(schedule.let(Schedule::unwrap))
        }

        /**
         * @param targets Targets to invoke when this rule matches an event. Input will be the full
         *   matched event. If you wish to specify custom target input, use `addTarget(target[,
         *   inputOptions])`.
         */
        override fun targets(targets: List<IRuleTarget>) {
            cdkBuilder.targets(targets.map(IRuleTarget::unwrap))
        }

        /**
         * @param targets Targets to invoke when this rule matches an event. Input will be the full
         *   matched event. If you wish to specify custom target input, use `addTarget(target[,
         *   inputOptions])`.
         */
        override fun targets(vararg targets: IRuleTarget): Unit = targets(targets.toList())

        public fun build(): software.amazon.awscdk.services.events.RuleProps = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.events.RuleProps,
    ) : RuleProps {
        /**
         * The scope to use if the source of the rule and its target are in different Stacks (but in
         * the same account &amp; region).
         *
         * This helps dealing with cycles that often arise in these situations.
         *
         * Default: - none (the main scope will be used, even for cross-stack Events)
         */
        override fun crossStackScope(): Construct? =
            unwrap(this).getCrossStackScope()?.let(Construct::wrap)

        /**
         * A description of the rule's purpose.
         *
         * Default: - No description
         */
        override fun description(): String? = unwrap(this).getDescription()

        /**
         * Indicates whether the rule is enabled.
         *
         * Default: true
         */
        override fun enabled(): Boolean? = unwrap(this).getEnabled()

        /**
         * The event bus to associate with this rule.
         *
         * Default: - The default event bus.
         */
        override fun eventBus(): IEventBus? = unwrap(this).getEventBus()?.let(IEventBus::wrap)

        /**
         * Additional restrictions for the event to route to the specified target.
         *
         * The method that generates the rule probably imposes some type of event filtering. The
         * filtering implied by what you pass here is added on top of that filtering.
         *
         * Default: - No additional filtering based on an event pattern.
         *
         * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
         */
        override fun eventPattern(): EventPattern? =
            unwrap(this).getEventPattern()?.let(EventPattern::wrap)

        /**
         * A name for the rule.
         *
         * Default: AWS CloudFormation generates a unique physical ID.
         */
        override fun ruleName(): String? = unwrap(this).getRuleName()

        /**
         * The schedule or rate (frequency) that determines when EventBridge runs the rule.
         *
         * You must specify this property, the `eventPattern` property, or both.
         *
         * For more information, see Schedule Expression Syntax for Rules in the Amazon EventBridge
         * User Guide.
         *
         * Default: - None.
         *
         * [Documentation](https://docs.aws.amazon.com/eventbridge/latest/userguide/scheduled-events.html)
         */
        override fun schedule(): Schedule? = unwrap(this).getSchedule()?.let(Schedule::wrap)

        /**
         * Targets to invoke when this rule matches an event.
         *
         * Input will be the full matched event. If you wish to specify custom target input, use
         * `addTarget(target[, inputOptions])`.
         *
         * Default: - No targets.
         */
        override fun targets(): List<IRuleTarget> =
            unwrap(this).getTargets()?.map(IRuleTarget::wrap) ?: emptyList()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): RuleProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.events.RuleProps): RuleProps =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: RuleProps): software.amazon.awscdk.services.events.RuleProps =
            (wrapped as Wrapper).cdkObject
    }
}
