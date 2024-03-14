package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class TrafficRouting internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codedeploy.TrafficRouting,
) : CdkObject(cdkObject) {
  /**
   * Returns the traffic routing configuration.
   *
   * @param scope 
   */
  public open fun bind(scope: Construct): TrafficRoutingConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(TrafficRoutingConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.TrafficRouting,
  ) : TrafficRouting(cdkObject)

  public companion object {
    public fun allAtOnce(): TrafficRouting =
        software.amazon.awscdk.services.codedeploy.TrafficRouting.allAtOnce().let(TrafficRouting::wrap)

    public fun timeBasedCanary(props: TimeBasedCanaryTrafficRoutingProps): TrafficRouting =
        software.amazon.awscdk.services.codedeploy.TrafficRouting.timeBasedCanary(props.let(TimeBasedCanaryTrafficRoutingProps::unwrap)).let(TrafficRouting::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abccf0bf455bf39b5f48fcab5a5958ea2f660482f3ef7fe583281696b58153e9")
    public fun timeBasedCanary(props: TimeBasedCanaryTrafficRoutingProps.Builder.() -> Unit):
        TrafficRouting = timeBasedCanary(TimeBasedCanaryTrafficRoutingProps(props))

    public fun timeBasedLinear(props: TimeBasedLinearTrafficRoutingProps): TrafficRouting =
        software.amazon.awscdk.services.codedeploy.TrafficRouting.timeBasedLinear(props.let(TimeBasedLinearTrafficRoutingProps::unwrap)).let(TrafficRouting::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("afd27f22931c615a08a4ca56d4c8f7cc8c9751fc692fd927be173e7f33ff4998")
    public fun timeBasedLinear(props: TimeBasedLinearTrafficRoutingProps.Builder.() -> Unit):
        TrafficRouting = timeBasedLinear(TimeBasedLinearTrafficRoutingProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.TrafficRouting):
        TrafficRouting = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TrafficRouting):
        software.amazon.awscdk.services.codedeploy.TrafficRouting = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.codedeploy.TrafficRouting
  }
}
