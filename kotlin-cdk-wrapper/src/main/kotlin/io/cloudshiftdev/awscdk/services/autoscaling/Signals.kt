@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CfnCreationPolicy
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Signals internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.autoscaling.Signals,
) : CdkObject(cdkObject) {
  public open fun renderCreationPolicy(arg0: RenderSignalsOptions): CfnCreationPolicy =
      unwrap(this).renderCreationPolicy(arg0.let(RenderSignalsOptions::unwrap)).let(CfnCreationPolicy::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e6894cb911f30f7b42ee393580a5093316e05aace45596c013289c9d8909406")
  public open fun renderCreationPolicy(arg0: RenderSignalsOptions.Builder.() -> Unit):
      CfnCreationPolicy = renderCreationPolicy(RenderSignalsOptions(arg0))

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.Signals,
  ) : Signals(cdkObject)

  public companion object {
    public fun waitForAll(): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForAll().let(Signals::wrap)

    public fun waitForAll(options: SignalsOptions): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForAll(options.let(SignalsOptions::unwrap)).let(Signals::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fe2212c2d0f76a2e61d2f4cdb806b6da61fbceaa5c17d715c6dcf2dd2a14e06")
    public fun waitForAll(options: SignalsOptions.Builder.() -> Unit): Signals =
        waitForAll(SignalsOptions(options))

    public fun waitForCount(count: Number): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForCount(count).let(Signals::wrap)

    public fun waitForCount(count: Number, options: SignalsOptions): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForCount(count,
        options.let(SignalsOptions::unwrap)).let(Signals::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d3874b7973774c5fe1fc1f212989f1c0a1acacdd92a717ab56c79309941861a")
    public fun waitForCount(count: Number, options: SignalsOptions.Builder.() -> Unit): Signals =
        waitForCount(count, SignalsOptions(options))

    public fun waitForMinCapacity(): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForMinCapacity().let(Signals::wrap)

    public fun waitForMinCapacity(options: SignalsOptions): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForMinCapacity(options.let(SignalsOptions::unwrap)).let(Signals::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e6b98b3471adb47ede929262fc35c345ebc9dd3ca20226e3b327ba411315586")
    public fun waitForMinCapacity(options: SignalsOptions.Builder.() -> Unit): Signals =
        waitForMinCapacity(SignalsOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.Signals): Signals =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Signals): software.amazon.awscdk.services.autoscaling.Signals =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.Signals
  }
}
