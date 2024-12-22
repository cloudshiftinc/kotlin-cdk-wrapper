@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Represents the properties of an alias target destination.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * AliasRecordTargetConfig aliasRecordTargetConfig = AliasRecordTargetConfig.builder()
 * .dnsName("dnsName")
 * .hostedZoneId("hostedZoneId")
 * // the properties below are optional
 * .evaluateTargetHealth(false)
 * .build();
 * ```
 */
public interface AliasRecordTargetConfig {
  /**
   * DNS name of the target.
   */
  public fun dnsName(): String

  /**
   * Evaluate the target health.
   *
   * Default: - no health check configuration
   */
  public fun evaluateTargetHealth(): Boolean? = unwrap(this).getEvaluateTargetHealth()

  /**
   * Hosted zone ID of the target.
   */
  public fun hostedZoneId(): String

  /**
   * A builder for [AliasRecordTargetConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dnsName DNS name of the target. 
     */
    public fun dnsName(dnsName: String)

    /**
     * @param evaluateTargetHealth Evaluate the target health.
     */
    public fun evaluateTargetHealth(evaluateTargetHealth: Boolean)

    /**
     * @param hostedZoneId Hosted zone ID of the target. 
     */
    public fun hostedZoneId(hostedZoneId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.AliasRecordTargetConfig.Builder
        = software.amazon.awscdk.services.route53.AliasRecordTargetConfig.builder()

    /**
     * @param dnsName DNS name of the target. 
     */
    override fun dnsName(dnsName: String) {
      cdkBuilder.dnsName(dnsName)
    }

    /**
     * @param evaluateTargetHealth Evaluate the target health.
     */
    override fun evaluateTargetHealth(evaluateTargetHealth: Boolean) {
      cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
    }

    /**
     * @param hostedZoneId Hosted zone ID of the target. 
     */
    override fun hostedZoneId(hostedZoneId: String) {
      cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun build(): software.amazon.awscdk.services.route53.AliasRecordTargetConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53.AliasRecordTargetConfig,
  ) : CdkObject(cdkObject),
      AliasRecordTargetConfig {
    /**
     * DNS name of the target.
     */
    override fun dnsName(): String = unwrap(this).getDnsName()

    /**
     * Evaluate the target health.
     *
     * Default: - no health check configuration
     */
    override fun evaluateTargetHealth(): Boolean? = unwrap(this).getEvaluateTargetHealth()

    /**
     * Hosted zone ID of the target.
     */
    override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AliasRecordTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.AliasRecordTargetConfig):
        AliasRecordTargetConfig = CdkObjectWrappers.wrap(cdkObject) as? AliasRecordTargetConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AliasRecordTargetConfig):
        software.amazon.awscdk.services.route53.AliasRecordTargetConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.AliasRecordTargetConfig
  }
}
