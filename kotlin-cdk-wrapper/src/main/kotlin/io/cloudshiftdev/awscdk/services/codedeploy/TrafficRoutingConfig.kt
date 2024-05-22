@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the structure to pass into the underlying CfnDeploymentConfig class.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codedeploy.*;
 * TrafficRoutingConfig trafficRoutingConfig = TrafficRoutingConfig.builder()
 * .type("type")
 * // the properties below are optional
 * .timeBasedCanary(CanaryTrafficRoutingConfig.builder()
 * .canaryInterval(123)
 * .canaryPercentage(123)
 * .build())
 * .timeBasedLinear(LinearTrafficRoutingConfig.builder()
 * .linearInterval(123)
 * .linearPercentage(123)
 * .build())
 * .build();
 * ```
 */
public interface TrafficRoutingConfig {
  /**
   * A configuration that shifts traffic from one version of a Lambda function or ECS task set to
   * another in two increments.
   *
   * Default: none
   */
  public fun timeBasedCanary(): CanaryTrafficRoutingConfig? =
      unwrap(this).getTimeBasedCanary()?.let(CanaryTrafficRoutingConfig::wrap)

  /**
   * A configuration that shifts traffic from one version of a Lambda function or Amazon ECS task
   * set to another in equal increments, with an equal number of minutes between each increment.
   *
   * Default: none
   */
  public fun timeBasedLinear(): LinearTrafficRoutingConfig? =
      unwrap(this).getTimeBasedLinear()?.let(LinearTrafficRoutingConfig::wrap)

  /**
   * The type of traffic shifting ( `TimeBasedCanary` or `TimeBasedLinear` ) used by a deployment
   * configuration.
   */
  public fun type(): String

  /**
   * A builder for [TrafficRoutingConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
     * function or ECS task set to another in two increments.
     */
    public fun timeBasedCanary(timeBasedCanary: CanaryTrafficRoutingConfig)

    /**
     * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
     * function or ECS task set to another in two increments.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f076af8f5e555c9cf21b1c3c6778faf9db6ca3c9f4adaa14681641c21b3014e6")
    public fun timeBasedCanary(timeBasedCanary: CanaryTrafficRoutingConfig.Builder.() -> Unit)

    /**
     * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
     * function or Amazon ECS task set to another in equal increments, with an equal number of minutes
     * between each increment.
     */
    public fun timeBasedLinear(timeBasedLinear: LinearTrafficRoutingConfig)

    /**
     * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
     * function or Amazon ECS task set to another in equal increments, with an equal number of minutes
     * between each increment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("edc4691914a3070d0dba4be8b71d60519eadc7f3016a9134a914bd4ee0702eca")
    public fun timeBasedLinear(timeBasedLinear: LinearTrafficRoutingConfig.Builder.() -> Unit)

    /**
     * @param type The type of traffic shifting ( `TimeBasedCanary` or `TimeBasedLinear` ) used by a
     * deployment configuration. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig.Builder
        = software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig.builder()

    /**
     * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
     * function or ECS task set to another in two increments.
     */
    override fun timeBasedCanary(timeBasedCanary: CanaryTrafficRoutingConfig) {
      cdkBuilder.timeBasedCanary(timeBasedCanary.let(CanaryTrafficRoutingConfig.Companion::unwrap))
    }

    /**
     * @param timeBasedCanary A configuration that shifts traffic from one version of a Lambda
     * function or ECS task set to another in two increments.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f076af8f5e555c9cf21b1c3c6778faf9db6ca3c9f4adaa14681641c21b3014e6")
    override fun timeBasedCanary(timeBasedCanary: CanaryTrafficRoutingConfig.Builder.() -> Unit):
        Unit = timeBasedCanary(CanaryTrafficRoutingConfig(timeBasedCanary))

    /**
     * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
     * function or Amazon ECS task set to another in equal increments, with an equal number of minutes
     * between each increment.
     */
    override fun timeBasedLinear(timeBasedLinear: LinearTrafficRoutingConfig) {
      cdkBuilder.timeBasedLinear(timeBasedLinear.let(LinearTrafficRoutingConfig.Companion::unwrap))
    }

    /**
     * @param timeBasedLinear A configuration that shifts traffic from one version of a Lambda
     * function or Amazon ECS task set to another in equal increments, with an equal number of minutes
     * between each increment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("edc4691914a3070d0dba4be8b71d60519eadc7f3016a9134a914bd4ee0702eca")
    override fun timeBasedLinear(timeBasedLinear: LinearTrafficRoutingConfig.Builder.() -> Unit):
        Unit = timeBasedLinear(LinearTrafficRoutingConfig(timeBasedLinear))

    /**
     * @param type The type of traffic shifting ( `TimeBasedCanary` or `TimeBasedLinear` ) used by a
     * deployment configuration. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig,
  ) : CdkObject(cdkObject), TrafficRoutingConfig {
    /**
     * A configuration that shifts traffic from one version of a Lambda function or ECS task set to
     * another in two increments.
     *
     * Default: none
     */
    override fun timeBasedCanary(): CanaryTrafficRoutingConfig? =
        unwrap(this).getTimeBasedCanary()?.let(CanaryTrafficRoutingConfig::wrap)

    /**
     * A configuration that shifts traffic from one version of a Lambda function or Amazon ECS task
     * set to another in equal increments, with an equal number of minutes between each increment.
     *
     * Default: none
     */
    override fun timeBasedLinear(): LinearTrafficRoutingConfig? =
        unwrap(this).getTimeBasedLinear()?.let(LinearTrafficRoutingConfig::wrap)

    /**
     * The type of traffic shifting ( `TimeBasedCanary` or `TimeBasedLinear` ) used by a deployment
     * configuration.
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TrafficRoutingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig):
        TrafficRoutingConfig = CdkObjectWrappers.wrap(cdkObject) as? TrafficRoutingConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TrafficRoutingConfig):
        software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.TrafficRoutingConfig
  }
}
