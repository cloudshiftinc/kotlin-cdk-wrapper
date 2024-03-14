package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Capacity internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dynamodb.Capacity,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun mode(): CapacityMode = unwrap(this).getMode().let(CapacityMode::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.Capacity,
  ) : Capacity(cdkObject)

  public companion object {
    public fun autoscaled(options: AutoscaledCapacityOptions): Capacity =
        software.amazon.awscdk.services.dynamodb.Capacity.autoscaled(options.let(AutoscaledCapacityOptions::unwrap)).let(Capacity::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("96f6dbb03cf6826a48596492729e14be59467cc53d33e92c46267f599b4579ad")
    public fun autoscaled(options: AutoscaledCapacityOptions.Builder.() -> Unit): Capacity =
        autoscaled(AutoscaledCapacityOptions(options))

    public fun fixed(iops: Number): Capacity =
        software.amazon.awscdk.services.dynamodb.Capacity.fixed(iops).let(Capacity::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.Capacity): Capacity =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Capacity): software.amazon.awscdk.services.dynamodb.Capacity =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.Capacity
  }
}
