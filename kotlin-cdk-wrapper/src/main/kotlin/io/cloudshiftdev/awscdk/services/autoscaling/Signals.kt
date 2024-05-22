@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CfnCreationPolicy
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Configure whether the AutoScalingGroup waits for signals.
 *
 * If you do configure waiting for signals, you should make sure the instances
 * invoke `cfn-signal` somewhere in their UserData to signal that they have
 * started up (either successfully or unsuccessfully).
 *
 * Signals are used both during intial creation and subsequent updates.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * InstanceType instanceType;
 * IMachineImage machineImage;
 * AutoScalingGroup.Builder.create(this, "ASG")
 * .vpc(vpc)
 * .instanceType(instanceType)
 * .machineImage(machineImage)
 * // ...
 * .init(CloudFormationInit.fromElements(InitFile.fromString("/etc/my_instance", "This got written
 * during instance startup")))
 * .signals(Signals.waitForAll(SignalsOptions.builder()
 * .timeout(Duration.minutes(10))
 * .build()))
 * .build();
 * ```
 */
public abstract class Signals(
  cdkObject: software.amazon.awscdk.services.autoscaling.Signals,
) : CdkObject(cdkObject) {
  /**
   * Render the ASG's CreationPolicy.
   *
   * @param renderOptions 
   */
  public open fun renderCreationPolicy(renderOptions: RenderSignalsOptions): CfnCreationPolicy =
      unwrap(this).renderCreationPolicy(renderOptions.let(RenderSignalsOptions.Companion::unwrap)).let(CfnCreationPolicy::wrap)

  /**
   * Render the ASG's CreationPolicy.
   *
   * @param renderOptions 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9e6894cb911f30f7b42ee393580a5093316e05aace45596c013289c9d8909406")
  public open fun renderCreationPolicy(renderOptions: RenderSignalsOptions.Builder.() -> Unit):
      CfnCreationPolicy = renderCreationPolicy(RenderSignalsOptions(renderOptions))

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.Signals,
  ) : Signals(cdkObject)

  public companion object {
    public fun waitForAll(): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForAll().let(Signals::wrap)

    public fun waitForAll(options: SignalsOptions): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForAll(options.let(SignalsOptions.Companion::unwrap)).let(Signals::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fe2212c2d0f76a2e61d2f4cdb806b6da61fbceaa5c17d715c6dcf2dd2a14e06")
    public fun waitForAll(options: SignalsOptions.Builder.() -> Unit): Signals =
        waitForAll(SignalsOptions(options))

    public fun waitForCount(count: Number): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForCount(count).let(Signals::wrap)

    public fun waitForCount(count: Number, options: SignalsOptions): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForCount(count,
        options.let(SignalsOptions.Companion::unwrap)).let(Signals::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2d3874b7973774c5fe1fc1f212989f1c0a1acacdd92a717ab56c79309941861a")
    public fun waitForCount(count: Number, options: SignalsOptions.Builder.() -> Unit): Signals =
        waitForCount(count, SignalsOptions(options))

    public fun waitForMinCapacity(): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForMinCapacity().let(Signals::wrap)

    public fun waitForMinCapacity(options: SignalsOptions): Signals =
        software.amazon.awscdk.services.autoscaling.Signals.waitForMinCapacity(options.let(SignalsOptions.Companion::unwrap)).let(Signals::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6e6b98b3471adb47ede929262fc35c345ebc9dd3ca20226e3b327ba411315586")
    public fun waitForMinCapacity(options: SignalsOptions.Builder.() -> Unit): Signals =
        waitForMinCapacity(SignalsOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.Signals): Signals =
        CdkObjectWrappers.wrap(cdkObject) as? Signals ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: Signals): software.amazon.awscdk.services.autoscaling.Signals =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.Signals
  }
}
