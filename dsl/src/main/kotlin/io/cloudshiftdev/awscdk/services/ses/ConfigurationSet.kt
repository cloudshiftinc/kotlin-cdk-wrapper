package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
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
  public open fun addEventDestination(id: String, options: ConfigurationSetEventDestinationOptions):
      ConfigurationSetEventDestination = unwrap(this).addEventDestination(id,
      options.let(ConfigurationSetEventDestinationOptions::unwrap)).let(ConfigurationSetEventDestination::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ea100c5e6aace511da29a5b6d3a88c64cf14d151334a4b00ec9b0c0d3eae92c")
  public open fun addEventDestination(id: String,
      options: ConfigurationSetEventDestinationOptions.Builder.() -> Unit):
      ConfigurationSetEventDestination = addEventDestination(id,
      ConfigurationSetEventDestinationOptions(options))

  public override fun configurationSetName(): String = unwrap(this).getConfigurationSetName()

  public interface Builder {
    public fun configurationSetName(configurationSetName: String)

    public fun customTrackingRedirectDomain(customTrackingRedirectDomain: String)

    public fun dedicatedIpPool(dedicatedIpPool: IDedicatedIpPool)

    public fun reputationMetrics(reputationMetrics: Boolean)

    public fun sendingEnabled(sendingEnabled: Boolean)

    public fun suppressionReasons(suppressionReasons: SuppressionReasons)

    public fun tlsPolicy(tlsPolicy: ConfigurationSetTlsPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ConfigurationSet.Builder =
        software.amazon.awscdk.services.ses.ConfigurationSet.Builder.create(scope, id)

    override fun configurationSetName(configurationSetName: String) {
      cdkBuilder.configurationSetName(configurationSetName)
    }

    override fun customTrackingRedirectDomain(customTrackingRedirectDomain: String) {
      cdkBuilder.customTrackingRedirectDomain(customTrackingRedirectDomain)
    }

    override fun dedicatedIpPool(dedicatedIpPool: IDedicatedIpPool) {
      cdkBuilder.dedicatedIpPool(dedicatedIpPool.let(IDedicatedIpPool::unwrap))
    }

    override fun reputationMetrics(reputationMetrics: Boolean) {
      cdkBuilder.reputationMetrics(reputationMetrics)
    }

    override fun sendingEnabled(sendingEnabled: Boolean) {
      cdkBuilder.sendingEnabled(sendingEnabled)
    }

    override fun suppressionReasons(suppressionReasons: SuppressionReasons) {
      cdkBuilder.suppressionReasons(suppressionReasons.let(SuppressionReasons::unwrap))
    }

    override fun tlsPolicy(tlsPolicy: ConfigurationSetTlsPolicy) {
      cdkBuilder.tlsPolicy(tlsPolicy.let(ConfigurationSetTlsPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSet = cdkBuilder.build()
  }

  public companion object {
    public open fun fromConfigurationSetName(
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
