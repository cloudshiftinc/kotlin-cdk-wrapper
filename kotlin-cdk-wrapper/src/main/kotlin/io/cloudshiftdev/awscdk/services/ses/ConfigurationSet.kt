@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A configuration set.
 *
 * Example:
 *
 * ```
 * ConfigurationSet.Builder.create(this, "ConfigurationSet")
 * .customTrackingRedirectDomain("track.cdk.dev")
 * .customTrackingHttpsPolicy(HttpsPolicy.REQUIRE)
 * .build();
 * ```
 */
public open class ConfigurationSet(
  cdkObject: software.amazon.awscdk.services.ses.ConfigurationSet,
) : Resource(cdkObject),
    IConfigurationSet {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ses.ConfigurationSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ConfigurationSetProps,
  ) :
      this(software.amazon.awscdk.services.ses.ConfigurationSet(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(ConfigurationSetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ConfigurationSetProps.Builder.() -> Unit,
  ) : this(scope, id, ConfigurationSetProps(props)
  )

  /**
   * Adds an event destination to this configuration set.
   *
   * @param id 
   * @param options 
   */
  public open fun addEventDestination(id: String, options: ConfigurationSetEventDestinationOptions):
      ConfigurationSetEventDestination = unwrap(this).addEventDestination(id,
      options.let(ConfigurationSetEventDestinationOptions.Companion::unwrap)).let(ConfigurationSetEventDestination::wrap)

  /**
   * Adds an event destination to this configuration set.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ea100c5e6aace511da29a5b6d3a88c64cf14d151334a4b00ec9b0c0d3eae92c")
  public open fun addEventDestination(id: String,
      options: ConfigurationSetEventDestinationOptions.Builder.() -> Unit):
      ConfigurationSetEventDestination = addEventDestination(id,
      ConfigurationSetEventDestinationOptions(options))

  /**
   * The name of the configuration set.
   */
  public override fun configurationSetName(): String = unwrap(this).getConfigurationSetName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.ConfigurationSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the configuration set.
     *
     * Default: - a CloudFormation generated name
     *
     * @param configurationSetName A name for the configuration set. 
     */
    public fun configurationSetName(configurationSetName: String)

    /**
     * The https policy to use for tracking open and click events.
     *
     * Default: - HttpsPolicy.OPTIONAL if customTrackingRedirectDomain is set, otherwise undefined
     *
     * @param customTrackingHttpsPolicy The https policy to use for tracking open and click events. 
     */
    public fun customTrackingHttpsPolicy(customTrackingHttpsPolicy: HttpsPolicy)

    /**
     * The custom subdomain that is used to redirect email recipients to the Amazon SES event
     * tracking domain.
     *
     * Default: - use the default awstrack.me domain
     *
     * @param customTrackingRedirectDomain The custom subdomain that is used to redirect email
     * recipients to the Amazon SES event tracking domain. 
     */
    public fun customTrackingRedirectDomain(customTrackingRedirectDomain: String)

    /**
     * The dedicated IP pool to associate with the configuration set.
     *
     * Default: - do not use a dedicated IP pool
     *
     * @param dedicatedIpPool The dedicated IP pool to associate with the configuration set. 
     */
    public fun dedicatedIpPool(dedicatedIpPool: IDedicatedIpPool)

    /**
     * If true, account-level suppression list is disabled;
     *
     * email sent with this configuration set
     * will not use any suppression settings at all
     *
     * Default: false
     *
     * @param disableSuppressionList If true, account-level suppression list is disabled;. 
     */
    public fun disableSuppressionList(disableSuppressionList: Boolean)

    /**
     * The maximum amount of time that Amazon SES API v2 will attempt delivery of email.
     *
     * This value must be greater than or equal to 5 minutes and less than or equal to 14 hours.
     *
     * Default: undefined - SES defaults to 14 hours
     *
     * @param maxDeliveryDuration The maximum amount of time that Amazon SES API v2 will attempt
     * delivery of email. 
     */
    public fun maxDeliveryDuration(maxDeliveryDuration: Duration)

    /**
     * Whether to publish reputation metrics for the configuration set, such as bounce and complaint
     * rates, to Amazon CloudWatch.
     *
     * Default: true
     *
     * @param reputationMetrics Whether to publish reputation metrics for the configuration set,
     * such as bounce and complaint rates, to Amazon CloudWatch. 
     */
    public fun reputationMetrics(reputationMetrics: Boolean)

    /**
     * Whether email sending is enabled.
     *
     * Default: true
     *
     * @param sendingEnabled Whether email sending is enabled. 
     */
    public fun sendingEnabled(sendingEnabled: Boolean)

    /**
     * The reasons for which recipient email addresses should be automatically added to your
     * account's suppression list.
     *
     * Default: - use account level settings
     *
     * @param suppressionReasons The reasons for which recipient email addresses should be
     * automatically added to your account's suppression list. 
     */
    public fun suppressionReasons(suppressionReasons: SuppressionReasons)

    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer
     * Security (TLS).
     *
     * Default: ConfigurationSetTlsPolicy.OPTIONAL
     *
     * @param tlsPolicy Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS). 
     */
    public fun tlsPolicy(tlsPolicy: ConfigurationSetTlsPolicy)

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * Default: - VDM options not configured at the configuration set level. In this case, use
     * account level settings. (To set the account level settings using CDK, use the `VdmAttributes`
     * Construct.)
     *
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set. 
     */
    public fun vdmOptions(vdmOptions: VdmOptions)

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * Default: - VDM options not configured at the configuration set level. In this case, use
     * account level settings. (To set the account level settings using CDK, use the `VdmAttributes`
     * Construct.)
     *
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e22393d09df982d6f0a448d030df788bf607ae094ec905346ac34cd152af619")
    public fun vdmOptions(vdmOptions: VdmOptions.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ConfigurationSet.Builder =
        software.amazon.awscdk.services.ses.ConfigurationSet.Builder.create(scope, id)

    /**
     * A name for the configuration set.
     *
     * Default: - a CloudFormation generated name
     *
     * @param configurationSetName A name for the configuration set. 
     */
    override fun configurationSetName(configurationSetName: String) {
      cdkBuilder.configurationSetName(configurationSetName)
    }

    /**
     * The https policy to use for tracking open and click events.
     *
     * Default: - HttpsPolicy.OPTIONAL if customTrackingRedirectDomain is set, otherwise undefined
     *
     * @param customTrackingHttpsPolicy The https policy to use for tracking open and click events. 
     */
    override fun customTrackingHttpsPolicy(customTrackingHttpsPolicy: HttpsPolicy) {
      cdkBuilder.customTrackingHttpsPolicy(customTrackingHttpsPolicy.let(HttpsPolicy.Companion::unwrap))
    }

    /**
     * The custom subdomain that is used to redirect email recipients to the Amazon SES event
     * tracking domain.
     *
     * Default: - use the default awstrack.me domain
     *
     * @param customTrackingRedirectDomain The custom subdomain that is used to redirect email
     * recipients to the Amazon SES event tracking domain. 
     */
    override fun customTrackingRedirectDomain(customTrackingRedirectDomain: String) {
      cdkBuilder.customTrackingRedirectDomain(customTrackingRedirectDomain)
    }

    /**
     * The dedicated IP pool to associate with the configuration set.
     *
     * Default: - do not use a dedicated IP pool
     *
     * @param dedicatedIpPool The dedicated IP pool to associate with the configuration set. 
     */
    override fun dedicatedIpPool(dedicatedIpPool: IDedicatedIpPool) {
      cdkBuilder.dedicatedIpPool(dedicatedIpPool.let(IDedicatedIpPool.Companion::unwrap))
    }

    /**
     * If true, account-level suppression list is disabled;
     *
     * email sent with this configuration set
     * will not use any suppression settings at all
     *
     * Default: false
     *
     * @param disableSuppressionList If true, account-level suppression list is disabled;. 
     */
    override fun disableSuppressionList(disableSuppressionList: Boolean) {
      cdkBuilder.disableSuppressionList(disableSuppressionList)
    }

    /**
     * The maximum amount of time that Amazon SES API v2 will attempt delivery of email.
     *
     * This value must be greater than or equal to 5 minutes and less than or equal to 14 hours.
     *
     * Default: undefined - SES defaults to 14 hours
     *
     * @param maxDeliveryDuration The maximum amount of time that Amazon SES API v2 will attempt
     * delivery of email. 
     */
    override fun maxDeliveryDuration(maxDeliveryDuration: Duration) {
      cdkBuilder.maxDeliveryDuration(maxDeliveryDuration.let(Duration.Companion::unwrap))
    }

    /**
     * Whether to publish reputation metrics for the configuration set, such as bounce and complaint
     * rates, to Amazon CloudWatch.
     *
     * Default: true
     *
     * @param reputationMetrics Whether to publish reputation metrics for the configuration set,
     * such as bounce and complaint rates, to Amazon CloudWatch. 
     */
    override fun reputationMetrics(reputationMetrics: Boolean) {
      cdkBuilder.reputationMetrics(reputationMetrics)
    }

    /**
     * Whether email sending is enabled.
     *
     * Default: true
     *
     * @param sendingEnabled Whether email sending is enabled. 
     */
    override fun sendingEnabled(sendingEnabled: Boolean) {
      cdkBuilder.sendingEnabled(sendingEnabled)
    }

    /**
     * The reasons for which recipient email addresses should be automatically added to your
     * account's suppression list.
     *
     * Default: - use account level settings
     *
     * @param suppressionReasons The reasons for which recipient email addresses should be
     * automatically added to your account's suppression list. 
     */
    override fun suppressionReasons(suppressionReasons: SuppressionReasons) {
      cdkBuilder.suppressionReasons(suppressionReasons.let(SuppressionReasons.Companion::unwrap))
    }

    /**
     * Specifies whether messages that use the configuration set are required to use Transport Layer
     * Security (TLS).
     *
     * Default: ConfigurationSetTlsPolicy.OPTIONAL
     *
     * @param tlsPolicy Specifies whether messages that use the configuration set are required to
     * use Transport Layer Security (TLS). 
     */
    override fun tlsPolicy(tlsPolicy: ConfigurationSetTlsPolicy) {
      cdkBuilder.tlsPolicy(tlsPolicy.let(ConfigurationSetTlsPolicy.Companion::unwrap))
    }

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * Default: - VDM options not configured at the configuration set level. In this case, use
     * account level settings. (To set the account level settings using CDK, use the `VdmAttributes`
     * Construct.)
     *
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set. 
     */
    override fun vdmOptions(vdmOptions: VdmOptions) {
      cdkBuilder.vdmOptions(vdmOptions.let(VdmOptions.Companion::unwrap))
    }

    /**
     * The Virtual Deliverability Manager (VDM) options that apply to the configuration set.
     *
     * Default: - VDM options not configured at the configuration set level. In this case, use
     * account level settings. (To set the account level settings using CDK, use the `VdmAttributes`
     * Construct.)
     *
     * @param vdmOptions The Virtual Deliverability Manager (VDM) options that apply to the
     * configuration set. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e22393d09df982d6f0a448d030df788bf607ae094ec905346ac34cd152af619")
    override fun vdmOptions(vdmOptions: VdmOptions.Builder.() -> Unit): Unit =
        vdmOptions(VdmOptions(vdmOptions))

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSet = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.ses.ConfigurationSet.PROPERTY_INJECTION_ID

    public fun fromConfigurationSetName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      configurationSetName: String,
    ): IConfigurationSet =
        software.amazon.awscdk.services.ses.ConfigurationSet.fromConfigurationSetName(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, configurationSetName).let(IConfigurationSet::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ConfigurationSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ConfigurationSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ConfigurationSet):
        ConfigurationSet = ConfigurationSet(cdkObject)

    internal fun unwrap(wrapped: ConfigurationSet):
        software.amazon.awscdk.services.ses.ConfigurationSet = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.ConfigurationSet
  }
}
