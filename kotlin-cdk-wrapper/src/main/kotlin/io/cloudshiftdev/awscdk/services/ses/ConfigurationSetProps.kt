@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for a configuration set.
 *
 * Example:
 *
 * ```
 * IDedicatedIpPool myPool;
 * ConfigurationSet.Builder.create(this, "ConfigurationSet")
 * .customTrackingRedirectDomain("track.cdk.dev")
 * .suppressionReasons(SuppressionReasons.COMPLAINTS_ONLY)
 * .tlsPolicy(ConfigurationSetTlsPolicy.REQUIRE)
 * .dedicatedIpPool(myPool)
 * .build();
 * ```
 */
public interface ConfigurationSetProps {
  /**
   * A name for the configuration set.
   *
   * Default: - a CloudFormation generated name
   */
  public fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()

  /**
   * The custom subdomain that is used to redirect email recipients to the Amazon SES event tracking
   * domain.
   *
   * Default: - use the default awstrack.me domain
   */
  public fun customTrackingRedirectDomain(): String? =
      unwrap(this).getCustomTrackingRedirectDomain()

  /**
   * The dedicated IP pool to associate with the configuration set.
   *
   * Default: - do not use a dedicated IP pool
   */
  public fun dedicatedIpPool(): IDedicatedIpPool? =
      unwrap(this).getDedicatedIpPool()?.let(IDedicatedIpPool::wrap)

  /**
   * Whether to publish reputation metrics for the configuration set, such as bounce and complaint
   * rates, to Amazon CloudWatch.
   *
   * Default: false
   */
  public fun reputationMetrics(): Boolean? = unwrap(this).getReputationMetrics()

  /**
   * Whether email sending is enabled.
   *
   * Default: true
   */
  public fun sendingEnabled(): Boolean? = unwrap(this).getSendingEnabled()

  /**
   * The reasons for which recipient email addresses should be automatically added to your account's
   * suppression list.
   *
   * Default: - use account level settings
   */
  public fun suppressionReasons(): SuppressionReasons? =
      unwrap(this).getSuppressionReasons()?.let(SuppressionReasons::wrap)

  /**
   * Specifies whether messages that use the configuration set are required to use Transport Layer
   * Security (TLS).
   *
   * Default: ConfigurationSetTlsPolicy.OPTIONAL
   */
  public fun tlsPolicy(): ConfigurationSetTlsPolicy? =
      unwrap(this).getTlsPolicy()?.let(ConfigurationSetTlsPolicy::wrap)

  /**
   * A builder for [ConfigurationSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationSetName A name for the configuration set.
     */
    public fun configurationSetName(configurationSetName: String)

    /**
     * @param customTrackingRedirectDomain The custom subdomain that is used to redirect email
     * recipients to the Amazon SES event tracking domain.
     */
    public fun customTrackingRedirectDomain(customTrackingRedirectDomain: String)

    /**
     * @param dedicatedIpPool The dedicated IP pool to associate with the configuration set.
     */
    public fun dedicatedIpPool(dedicatedIpPool: IDedicatedIpPool)

    /**
     * @param reputationMetrics Whether to publish reputation metrics for the configuration set,
     * such as bounce and complaint rates, to Amazon CloudWatch.
     */
    public fun reputationMetrics(reputationMetrics: Boolean)

    /**
     * @param sendingEnabled Whether email sending is enabled.
     */
    public fun sendingEnabled(sendingEnabled: Boolean)

    /**
     * @param suppressionReasons The reasons for which recipient email addresses should be
     * automatically added to your account's suppression list.
     */
    public fun suppressionReasons(suppressionReasons: SuppressionReasons)

    /**
     * @param tlsPolicy Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS).
     */
    public fun tlsPolicy(tlsPolicy: ConfigurationSetTlsPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ConfigurationSetProps.Builder =
        software.amazon.awscdk.services.ses.ConfigurationSetProps.builder()

    /**
     * @param configurationSetName A name for the configuration set.
     */
    override fun configurationSetName(configurationSetName: String) {
      cdkBuilder.configurationSetName(configurationSetName)
    }

    /**
     * @param customTrackingRedirectDomain The custom subdomain that is used to redirect email
     * recipients to the Amazon SES event tracking domain.
     */
    override fun customTrackingRedirectDomain(customTrackingRedirectDomain: String) {
      cdkBuilder.customTrackingRedirectDomain(customTrackingRedirectDomain)
    }

    /**
     * @param dedicatedIpPool The dedicated IP pool to associate with the configuration set.
     */
    override fun dedicatedIpPool(dedicatedIpPool: IDedicatedIpPool) {
      cdkBuilder.dedicatedIpPool(dedicatedIpPool.let(IDedicatedIpPool::unwrap))
    }

    /**
     * @param reputationMetrics Whether to publish reputation metrics for the configuration set,
     * such as bounce and complaint rates, to Amazon CloudWatch.
     */
    override fun reputationMetrics(reputationMetrics: Boolean) {
      cdkBuilder.reputationMetrics(reputationMetrics)
    }

    /**
     * @param sendingEnabled Whether email sending is enabled.
     */
    override fun sendingEnabled(sendingEnabled: Boolean) {
      cdkBuilder.sendingEnabled(sendingEnabled)
    }

    /**
     * @param suppressionReasons The reasons for which recipient email addresses should be
     * automatically added to your account's suppression list.
     */
    override fun suppressionReasons(suppressionReasons: SuppressionReasons) {
      cdkBuilder.suppressionReasons(suppressionReasons.let(SuppressionReasons::unwrap))
    }

    /**
     * @param tlsPolicy Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS).
     */
    override fun tlsPolicy(tlsPolicy: ConfigurationSetTlsPolicy) {
      cdkBuilder.tlsPolicy(tlsPolicy.let(ConfigurationSetTlsPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetProps,
  ) : CdkObject(cdkObject), ConfigurationSetProps {
    /**
     * A name for the configuration set.
     *
     * Default: - a CloudFormation generated name
     */
    override fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()

    /**
     * The custom subdomain that is used to redirect email recipients to the Amazon SES event
     * tracking domain.
     *
     * Default: - use the default awstrack.me domain
     */
    override fun customTrackingRedirectDomain(): String? =
        unwrap(this).getCustomTrackingRedirectDomain()

    /**
     * The dedicated IP pool to associate with the configuration set.
     *
     * Default: - do not use a dedicated IP pool
     */
    override fun dedicatedIpPool(): IDedicatedIpPool? =
        unwrap(this).getDedicatedIpPool()?.let(IDedicatedIpPool::wrap)

    /**
     * Whether to publish reputation metrics for the configuration set, such as bounce and complaint
     * rates, to Amazon CloudWatch.
     *
     * Default: false
     */
    override fun reputationMetrics(): Boolean? = unwrap(this).getReputationMetrics()

    /**
     * Whether email sending is enabled.
     *
     * Default: true
     */
    override fun sendingEnabled(): Boolean? = unwrap(this).getSendingEnabled()

    /**
     * The reasons for which recipient email addresses should be automatically added to your
     * account's suppression list.
     *
     * Default: - use account level settings
     */
    override fun suppressionReasons(): SuppressionReasons? =
        unwrap(this).getSuppressionReasons()?.let(SuppressionReasons::wrap)

    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer
     * Security (TLS).
     *
     * Default: ConfigurationSetTlsPolicy.OPTIONAL
     */
    override fun tlsPolicy(): ConfigurationSetTlsPolicy? =
        unwrap(this).getTlsPolicy()?.let(ConfigurationSetTlsPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetProps):
        ConfigurationSetProps = CdkObjectWrappers.wrap(cdkObject) as? ConfigurationSetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigurationSetProps):
        software.amazon.awscdk.services.ses.ConfigurationSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.ConfigurationSetProps
  }
}
