@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface ConfigurationSetProps {
  public fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()

  public fun customTrackingRedirectDomain(): String? =
      unwrap(this).getCustomTrackingRedirectDomain()

  public fun dedicatedIpPool(): IDedicatedIpPool? =
      unwrap(this).getDedicatedIpPool()?.let(IDedicatedIpPool::wrap)

  public fun reputationMetrics(): Boolean? = unwrap(this).getReputationMetrics()

  public fun sendingEnabled(): Boolean? = unwrap(this).getSendingEnabled()

  public fun suppressionReasons(): SuppressionReasons? =
      unwrap(this).getSuppressionReasons()?.let(SuppressionReasons::wrap)

  public fun tlsPolicy(): ConfigurationSetTlsPolicy? =
      unwrap(this).getTlsPolicy()?.let(ConfigurationSetTlsPolicy::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun configurationSetName(configurationSetName: String)

    public fun customTrackingRedirectDomain(customTrackingRedirectDomain: String)

    public fun dedicatedIpPool(dedicatedIpPool: IDedicatedIpPool)

    public fun reputationMetrics(reputationMetrics: Boolean)

    public fun sendingEnabled(sendingEnabled: Boolean)

    public fun suppressionReasons(suppressionReasons: SuppressionReasons)

    public fun tlsPolicy(tlsPolicy: ConfigurationSetTlsPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.ConfigurationSetProps.Builder =
        software.amazon.awscdk.services.ses.ConfigurationSetProps.builder()

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

    public fun build(): software.amazon.awscdk.services.ses.ConfigurationSetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetProps,
  ) : CdkObject(cdkObject), ConfigurationSetProps {
    override fun configurationSetName(): String? = unwrap(this).getConfigurationSetName()

    override fun customTrackingRedirectDomain(): String? =
        unwrap(this).getCustomTrackingRedirectDomain()

    override fun dedicatedIpPool(): IDedicatedIpPool? =
        unwrap(this).getDedicatedIpPool()?.let(IDedicatedIpPool::wrap)

    override fun reputationMetrics(): Boolean? = unwrap(this).getReputationMetrics()

    override fun sendingEnabled(): Boolean? = unwrap(this).getSendingEnabled()

    override fun suppressionReasons(): SuppressionReasons? =
        unwrap(this).getSuppressionReasons()?.let(SuppressionReasons::wrap)

    override fun tlsPolicy(): ConfigurationSetTlsPolicy? =
        unwrap(this).getTlsPolicy()?.let(ConfigurationSetTlsPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ConfigurationSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.ConfigurationSetProps):
        ConfigurationSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ConfigurationSetProps):
        software.amazon.awscdk.services.ses.ConfigurationSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ses.ConfigurationSetProps
  }
}
