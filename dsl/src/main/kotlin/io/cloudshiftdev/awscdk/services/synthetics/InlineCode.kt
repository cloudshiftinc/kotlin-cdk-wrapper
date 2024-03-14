package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.constructs.Construct
import kotlin.String

public open class InlineCode
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.synthetics.InlineCode,
) : Code(cdkObject) {
    /**
     * Called when the canary is initialized to allow this object to bind to the stack, add
     * resources and have fun.
     *
     * @param _scope
     * @param handler
     * @param _family
     */
    public override fun bind(
        _scope: Construct,
        handler: String,
        _family: RuntimeFamily,
    ): CodeConfig =
        unwrap(this)
            .bind(_scope.let(Construct::unwrap), handler, _family.let(RuntimeFamily::unwrap))
            .let(CodeConfig::wrap)

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.synthetics.InlineCode
        ): InlineCode = InlineCode(cdkObject)

        internal fun unwrap(
            wrapped: InlineCode
        ): software.amazon.awscdk.services.synthetics.InlineCode = wrapped.cdkObject
    }
}
