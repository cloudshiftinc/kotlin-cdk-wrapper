package io.cloudshiftdev.awscdk.services.batch

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Reason internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.Reason,
) {
  public companion object {
    public open fun custom(customReasonProps: CustomReason): Reason =
        software.amazon.awscdk.services.batch.Reason.custom(customReasonProps.let(CustomReason::unwrap)).let(Reason::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0480ecfc6e4061fd4538b746d5169cbfc3fa6a0d7d9393c764aba66b5778a9ba")
    public open fun custom(customReasonProps: CustomReason.Builder.() -> Unit): Reason =
        custom(CustomReason(customReasonProps))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.Reason): Reason =
        Reason(cdkObject)

    internal fun unwrap(wrapped: Reason): software.amazon.awscdk.services.batch.Reason =
        wrapped.cdkObject
  }
}
