package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Arn
internal constructor(
    private val cdkObject: software.amazon.awscdk.Arn,
) {
    public companion object {
        public fun extractResourceName(arn: String, resourceType: String): String =
            software.amazon.awscdk.Arn.extractResourceName(arn, resourceType)

        public fun format(components: ArnComponents): String =
            software.amazon.awscdk.Arn.format(components.let(ArnComponents::unwrap))

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("83161df07d376e5b5e803618627b191a1ad135e49cc4e2242ec6d546f408d688")
        public fun format(components: ArnComponents.Builder.() -> Unit): String =
            format(ArnComponents(components))

        public fun format(components: ArnComponents, stack: Stack): String =
            software.amazon.awscdk.Arn.format(
                components.let(ArnComponents::unwrap),
                stack.let(Stack::unwrap)
            )

        public fun split(arn: String, arnFormat: ArnFormat): ArnComponents =
            software.amazon.awscdk.Arn.split(arn, arnFormat.let(ArnFormat::unwrap))
                .let(ArnComponents::wrap)

        internal fun wrap(cdkObject: software.amazon.awscdk.Arn): Arn = Arn(cdkObject)

        internal fun unwrap(wrapped: Arn): software.amazon.awscdk.Arn = wrapped.cdkObject
    }
}
