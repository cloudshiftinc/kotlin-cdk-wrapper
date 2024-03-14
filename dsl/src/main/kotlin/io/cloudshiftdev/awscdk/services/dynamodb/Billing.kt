package io.cloudshiftdev.awscdk.services.dynamodb

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Billing internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.Billing,
) {
  public open fun mode(): BillingMode = unwrap(this).getMode().let(BillingMode::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.Billing,
  ) : Billing(cdkObject)

  public companion object {
    public open fun onDemand(): Billing =
        software.amazon.awscdk.services.dynamodb.Billing.onDemand().let(Billing::wrap)

    public open fun provisioned(props: ThroughputProps): Billing =
        software.amazon.awscdk.services.dynamodb.Billing.provisioned(props.let(ThroughputProps::unwrap)).let(Billing::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a809155c8ce7d1be4bf74289d5a94ae5c101cc12d650e3fdd8528190ca8597a")
    public open fun provisioned(props: ThroughputProps.Builder.() -> Unit): Billing =
        provisioned(ThroughputProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.Billing): Billing =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Billing): software.amazon.awscdk.services.dynamodb.Billing =
        (wrapped as Wrapper).cdkObject
  }
}
