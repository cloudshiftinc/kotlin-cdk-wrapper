@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Billing internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dynamodb.Billing,
) : CdkObject(cdkObject) {
  public open fun mode(): BillingMode = unwrap(this).getMode().let(BillingMode::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.Billing,
  ) : Billing(cdkObject)

  public companion object {
    public fun onDemand(): Billing =
        software.amazon.awscdk.services.dynamodb.Billing.onDemand().let(Billing::wrap)

    public fun provisioned(props: ThroughputProps): Billing =
        software.amazon.awscdk.services.dynamodb.Billing.provisioned(props.let(ThroughputProps::unwrap)).let(Billing::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a809155c8ce7d1be4bf74289d5a94ae5c101cc12d650e3fdd8528190ca8597a")
    public fun provisioned(props: ThroughputProps.Builder.() -> Unit): Billing =
        provisioned(ThroughputProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.Billing): Billing =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Billing): software.amazon.awscdk.services.dynamodb.Billing =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.Billing
  }
}
