@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Traffic routing configuration settings.
 *
 * The type of the `CfnCodeDeployBlueGreenHookProps.trafficRoutingConfig` property.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * CfnTrafficRoutingConfig cfnTrafficRoutingConfig = CfnTrafficRoutingConfig.builder()
 * .type(CfnTrafficRoutingType.ALL_AT_ONCE)
 * // the properties below are optional
 * .timeBasedCanary(CfnTrafficRoutingTimeBasedCanary.builder()
 * .bakeTimeMins(123)
 * .stepPercentage(123)
 * .build())
 * .timeBasedLinear(CfnTrafficRoutingTimeBasedLinear.builder()
 * .bakeTimeMins(123)
 * .stepPercentage(123)
 * .build())
 * .build();
 * ```
 */
public interface CfnTrafficRoutingConfig {
  /**
   * The configuration for traffic routing when `type` is `CfnTrafficRoutingType.TIME_BASED_CANARY`.
   *
   * Default: - none
   */
  public fun timeBasedCanary(): CfnTrafficRoutingTimeBasedCanary? =
      unwrap(this).getTimeBasedCanary()?.let(CfnTrafficRoutingTimeBasedCanary::wrap)

  /**
   * The configuration for traffic routing when `type` is `CfnTrafficRoutingType.TIME_BASED_LINEAR`.
   *
   * Default: - none
   */
  public fun timeBasedLinear(): CfnTrafficRoutingTimeBasedLinear? =
      unwrap(this).getTimeBasedLinear()?.let(CfnTrafficRoutingTimeBasedLinear::wrap)

  /**
   * The type of traffic shifting used by the blue-green deployment configuration.
   */
  public fun type(): CfnTrafficRoutingType

  /**
   * A builder for [CfnTrafficRoutingConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param timeBasedCanary The configuration for traffic routing when `type` is
     * `CfnTrafficRoutingType.TIME_BASED_CANARY`.
     */
    public fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary)

    /**
     * @param timeBasedCanary The configuration for traffic routing when `type` is
     * `CfnTrafficRoutingType.TIME_BASED_CANARY`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2f18a4c00dee6b1717fe36ccb423739ed976d7942ee012bb49626ecfa8f6d32")
    public fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary.Builder.() -> Unit)

    /**
     * @param timeBasedLinear The configuration for traffic routing when `type` is
     * `CfnTrafficRoutingType.TIME_BASED_LINEAR`.
     */
    public fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear)

    /**
     * @param timeBasedLinear The configuration for traffic routing when `type` is
     * `CfnTrafficRoutingType.TIME_BASED_LINEAR`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4673ccdf5a8b5ba95ef4c0e7c337fca978ab5873ea1eddbdc5b40984ac4bbb70")
    public fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear.Builder.() -> Unit)

    /**
     * @param type The type of traffic shifting used by the blue-green deployment configuration. 
     */
    public fun type(type: CfnTrafficRoutingType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CfnTrafficRoutingConfig.Builder =
        software.amazon.awscdk.CfnTrafficRoutingConfig.builder()

    /**
     * @param timeBasedCanary The configuration for traffic routing when `type` is
     * `CfnTrafficRoutingType.TIME_BASED_CANARY`.
     */
    override fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary) {
      cdkBuilder.timeBasedCanary(timeBasedCanary.let(CfnTrafficRoutingTimeBasedCanary::unwrap))
    }

    /**
     * @param timeBasedCanary The configuration for traffic routing when `type` is
     * `CfnTrafficRoutingType.TIME_BASED_CANARY`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c2f18a4c00dee6b1717fe36ccb423739ed976d7942ee012bb49626ecfa8f6d32")
    override
        fun timeBasedCanary(timeBasedCanary: CfnTrafficRoutingTimeBasedCanary.Builder.() -> Unit):
        Unit = timeBasedCanary(CfnTrafficRoutingTimeBasedCanary(timeBasedCanary))

    /**
     * @param timeBasedLinear The configuration for traffic routing when `type` is
     * `CfnTrafficRoutingType.TIME_BASED_LINEAR`.
     */
    override fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear) {
      cdkBuilder.timeBasedLinear(timeBasedLinear.let(CfnTrafficRoutingTimeBasedLinear::unwrap))
    }

    /**
     * @param timeBasedLinear The configuration for traffic routing when `type` is
     * `CfnTrafficRoutingType.TIME_BASED_LINEAR`.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4673ccdf5a8b5ba95ef4c0e7c337fca978ab5873ea1eddbdc5b40984ac4bbb70")
    override
        fun timeBasedLinear(timeBasedLinear: CfnTrafficRoutingTimeBasedLinear.Builder.() -> Unit):
        Unit = timeBasedLinear(CfnTrafficRoutingTimeBasedLinear(timeBasedLinear))

    /**
     * @param type The type of traffic shifting used by the blue-green deployment configuration. 
     */
    override fun type(type: CfnTrafficRoutingType) {
      cdkBuilder.type(type.let(CfnTrafficRoutingType::unwrap))
    }

    public fun build(): software.amazon.awscdk.CfnTrafficRoutingConfig = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CfnTrafficRoutingConfig,
  ) : CdkObject(cdkObject), CfnTrafficRoutingConfig {
    /**
     * The configuration for traffic routing when `type` is
     * `CfnTrafficRoutingType.TIME_BASED_CANARY`.
     *
     * Default: - none
     */
    override fun timeBasedCanary(): CfnTrafficRoutingTimeBasedCanary? =
        unwrap(this).getTimeBasedCanary()?.let(CfnTrafficRoutingTimeBasedCanary::wrap)

    /**
     * The configuration for traffic routing when `type` is
     * `CfnTrafficRoutingType.TIME_BASED_LINEAR`.
     *
     * Default: - none
     */
    override fun timeBasedLinear(): CfnTrafficRoutingTimeBasedLinear? =
        unwrap(this).getTimeBasedLinear()?.let(CfnTrafficRoutingTimeBasedLinear::wrap)

    /**
     * The type of traffic shifting used by the blue-green deployment configuration.
     */
    override fun type(): CfnTrafficRoutingType =
        unwrap(this).getType().let(CfnTrafficRoutingType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficRoutingConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CfnTrafficRoutingConfig):
        CfnTrafficRoutingConfig = CdkObjectWrappers.wrap(cdkObject) as CfnTrafficRoutingConfig

    internal fun unwrap(wrapped: CfnTrafficRoutingConfig):
        software.amazon.awscdk.CfnTrafficRoutingConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.CfnTrafficRoutingConfig
  }
}
