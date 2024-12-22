@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for a configuration set.
 *
 * Example:
 *
 * ```
 * ConfigurationSet.Builder.create(this, "ConfigurationSetWithVdmOptions")
 * .vdmOptions(VdmOptions.builder()
 * .engagementMetrics(true)
 * .optimizedSharedDelivery(true)
 * .build())
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
   * If true, account-level suppression list is disabled;
   *
   * email sent with this configuration set
   * will not use any suppression settings at all
   *
   * Default: false
   */
  public fun disableSuppressionList(): Boolean? = unwrap(this).getDisableSuppressionList()

  /**
   * The maximum amount of time that Amazon SES API v2 will attempt delivery of email.
   *
   * This value must be greater than or equal to 5 minutes and less than or equal to 14 hours.
   *
   * Default: undefined - SES defaults to 14 hours
   */
  public fun maxDeliveryDuration(): Duration? =
      unwrap(this).getMaxDeliveryDuration()?.let(Duration::wrap)

  /**
   * Whether to publish reputation metrics for the configuration set, such as bounce and complaint
   * rates, to Amazon CloudWatch.
   *
   * Default: true
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
   * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
   *
   * Default: - VDM options not configured at the configuration set level. In this case, use account
   * level settings. (To set the account level settings using CDK, use the `VdmAttributes` Construct.)
   */
  public fun vdmOptions(): VdmOptions? = unwrap(this).getVdmOptions()?.let(VdmOptions::wrap)

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
     * @param disableSuppressionList If true, account-level suppression list is disabled;.
     * email sent with this configuration set
     * will not use any suppression settings at all
     */
    public fun disableSuppressionList(disableSuppressionList: Boolean)

    /**
     * @param maxDeliveryDuration The maximum amount of time that Amazon SES API v2 will attempt
     * delivery of email.
     * This value must be greater than or equal to 5 minutes and less than or equal to 14 hours.
     */
    public fun maxDeliveryDuration(maxDeliveryDuration: Duration)

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

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set.
     */
    public fun vdmOptions(vdmOptions: VdmOptions)

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f76a9207ec6cc886f1001b778f6a3c9ef2329f2daf5cb599cb2fdb2772be574")
    public fun vdmOptions(vdmOptions: VdmOptions.Builder.() -> Unit)
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
      cdkBuilder.dedicatedIpPool(dedicatedIpPool.let(IDedicatedIpPool.Companion::unwrap))
    }

    /**
     * @param disableSuppressionList If true, account-level suppression list is disabled;.
     * email sent with this configuration set
     * will not use any suppression settings at all
     */
    override fun disableSuppressionList(disableSuppressionList: Boolean) {
      cdkBuilder.disableSuppressionList(disableSuppressionList)
    }

    /**
     * @param maxDeliveryDuration The maximum amount of time that Amazon SES API v2 will attempt
     * delivery of email.
     * This value must be greater than or equal to 5 minutes and less than or equal to 14 hours.
     */
    override fun maxDeliveryDuration(maxDeliveryDuration: Duration) {
      cdkBuilder.maxDeliveryDuration(maxDeliveryDuration.let(Duration.Companion::unwrap))
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
      cdkBuilder.suppressionReasons(suppressionReasons.let(SuppressionReasons.Companion::unwrap))
    }

    /**
     * @param tlsPolicy Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS).
     */
    override fun tlsPolicy(tlsPolicy: ConfigurationSetTlsPolicy) {
      cdkBuilder.tlsPolicy(tlsPolicy.let(ConfigurationSetTlsPolicy.Companion::unwrap))
    }

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set.
     */
    override fun vdmOptions(vdmOptions: VdmOptions) {
      cdkBuilder.vdmOptions(vdmOptions.let(VdmOptions.Companion::unwrap))
    }

    /**
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f76a9207ec6cc886f1001b778f6a3c9ef2329f2daf5cb599cb2fdb2772be574")
    override fun vdmOptions(vdmOptions: VdmOptions.Builder.() -> Unit): Unit =
        vdmOptions(VdmOptions(vdmOptions))

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetProps,
  ) : CdkObject(cdkObject),
      ConfigurationSetProps {
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
     * If true, account-level suppression list is disabled;
     *
     * email sent with this configuration set
     * will not use any suppression settings at all
     *
     * Default: false
     */
    override fun disableSuppressionList(): Boolean? = unwrap(this).getDisableSuppressionList()

    /**
     * The maximum amount of time that Amazon SES API v2 will attempt delivery of email.
     *
     * This value must be greater than or equal to 5 minutes and less than or equal to 14 hours.
     *
     * Default: undefined - SES defaults to 14 hours
     */
    override fun maxDeliveryDuration(): Duration? =
        unwrap(this).getMaxDeliveryDuration()?.let(Duration::wrap)

    /**
     * Whether to publish reputation metrics for the configuration set, such as bounce and complaint
     * rates, to Amazon CloudWatch.
     *
     * Default: true
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

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * Default: - VDM options not configured at the configuration set level. In this case, use
     * account level settings. (To set the account level settings using CDK, use the `VdmAttributes`
     * Construct.)
     */
    override fun vdmOptions(): VdmOptions? = unwrap(this).getVdmOptions()?.let(VdmOptions::wrap)
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
