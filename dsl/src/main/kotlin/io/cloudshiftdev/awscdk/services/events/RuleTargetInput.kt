package io.cloudshiftdev.awscdk.services.events

import kotlin.Any
import kotlin.String

public abstract class RuleTargetInput
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.events.RuleTargetInput,
) {
    /**
     * Return the input properties for this input object.
     *
     * @param rule
     */
    public open fun bind(rule: IRule): RuleTargetInputProperties =
        unwrap(this).bind(rule.let(IRule::unwrap)).let(RuleTargetInputProperties::wrap)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.events.RuleTargetInput,
    ) : RuleTargetInput(cdkObject)

    public companion object {
        public fun fromEventPath(path: String): RuleTargetInput =
            software.amazon.awscdk.services.events.RuleTargetInput.fromEventPath(path)
                .let(RuleTargetInput::wrap)

        public fun fromMultilineText(text: String): RuleTargetInput =
            software.amazon.awscdk.services.events.RuleTargetInput.fromMultilineText(text)
                .let(RuleTargetInput::wrap)

        public fun fromObject(obj: Any): RuleTargetInput =
            software.amazon.awscdk.services.events.RuleTargetInput.fromObject(obj)
                .let(RuleTargetInput::wrap)

        public fun fromText(text: String): RuleTargetInput =
            software.amazon.awscdk.services.events.RuleTargetInput.fromText(text)
                .let(RuleTargetInput::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.events.RuleTargetInput
        ): RuleTargetInput = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: RuleTargetInput
        ): software.amazon.awscdk.services.events.RuleTargetInput = (wrapped as Wrapper).cdkObject
    }
}
