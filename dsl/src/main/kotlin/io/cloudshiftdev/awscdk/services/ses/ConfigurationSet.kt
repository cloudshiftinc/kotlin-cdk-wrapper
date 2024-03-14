package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ConfigurationSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.ConfigurationSet,
) : Resource(cdkObject), IConfigurationSet {
  /**
   * Adds an event destination to this configuration set.
   *
   * @param id 
   * @param options 
   */
  public open fun addEventDestination(id: String, options: ConfigurationSetEventDestinationOptions):
      ConfigurationSetEventDestination = unwrap(this).addEventDestination(id,
      options.let(ConfigurationSetEventDestinationOptions::unwrap)).let(ConfigurationSetEventDestination::wrap)

  /**
   * Adds an event destination to this configuration set.
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
     * Whether to publish reputation metrics for the configuration set, such as bounce and complaint
     * rates, to Amazon CloudWatch.
     *
     * Default: false
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
      cdkBuilder.dedicatedIpPool(dedicatedIpPool.let(IDedicatedIpPool::unwrap))
    }

    /**
     * Whether to publish reputation metrics for the configuration set, such as bounce and complaint
     * rates, to Amazon CloudWatch.
     *
     * Default: false
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
      cdkBuilder.suppressionReasons(suppressionReasons.let(SuppressionReasons::unwrap))
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
      cdkBuilder.tlsPolicy(tlsPolicy.let(ConfigurationSetTlsPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSet = cdkBuilder.build()
  }

  public companion object {
    public fun fromConfigurationSetName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      configurationSetName: String,
    ): IConfigurationSet =
        software.amazon.awscdk.services.ses.ConfigurationSet.fromConfigurationSetName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
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
        software.amazon.awscdk.services.ses.ConfigurationSet = wrapped.cdkObject
  }
}
