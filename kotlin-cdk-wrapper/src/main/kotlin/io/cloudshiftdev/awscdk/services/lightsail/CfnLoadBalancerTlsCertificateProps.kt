@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLoadBalancerTlsCertificateProps {
  public fun certificateAlternativeNames(): List<String> =
      unwrap(this).getCertificateAlternativeNames() ?: emptyList()

  public fun certificateDomainName(): String

  public fun certificateName(): String

  public fun httpsRedirectionEnabled(): Any? = unwrap(this).getHttpsRedirectionEnabled()

  public fun isAttached(): Any? = unwrap(this).getIsAttached()

  public fun loadBalancerName(): String

  @CdkDslMarker
  public interface Builder {
    public fun certificateAlternativeNames(certificateAlternativeNames: List<String>)

    public fun certificateAlternativeNames(vararg certificateAlternativeNames: String)

    public fun certificateDomainName(certificateDomainName: String)

    public fun certificateName(certificateName: String)

    public fun httpsRedirectionEnabled(httpsRedirectionEnabled: Boolean)

    public fun httpsRedirectionEnabled(httpsRedirectionEnabled: IResolvable)

    public fun isAttached(isAttached: Boolean)

    public fun isAttached(isAttached: IResolvable)

    public fun loadBalancerName(loadBalancerName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps.builder()

    override fun certificateAlternativeNames(certificateAlternativeNames: List<String>) {
      cdkBuilder.certificateAlternativeNames(certificateAlternativeNames)
    }

    override fun certificateAlternativeNames(vararg certificateAlternativeNames: String): Unit =
        certificateAlternativeNames(certificateAlternativeNames.toList())

    override fun certificateDomainName(certificateDomainName: String) {
      cdkBuilder.certificateDomainName(certificateDomainName)
    }

    override fun certificateName(certificateName: String) {
      cdkBuilder.certificateName(certificateName)
    }

    override fun httpsRedirectionEnabled(httpsRedirectionEnabled: Boolean) {
      cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled)
    }

    override fun httpsRedirectionEnabled(httpsRedirectionEnabled: IResolvable) {
      cdkBuilder.httpsRedirectionEnabled(httpsRedirectionEnabled.let(IResolvable::unwrap))
    }

    override fun isAttached(isAttached: Boolean) {
      cdkBuilder.isAttached(isAttached)
    }

    override fun isAttached(isAttached: IResolvable) {
      cdkBuilder.isAttached(isAttached.let(IResolvable::unwrap))
    }

    override fun loadBalancerName(loadBalancerName: String) {
      cdkBuilder.loadBalancerName(loadBalancerName)
    }

    public fun build(): software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps,
  ) : CdkObject(cdkObject), CfnLoadBalancerTlsCertificateProps {
    override fun certificateAlternativeNames(): List<String> =
        unwrap(this).getCertificateAlternativeNames() ?: emptyList()

    override fun certificateDomainName(): String = unwrap(this).getCertificateDomainName()

    override fun certificateName(): String = unwrap(this).getCertificateName()

    override fun httpsRedirectionEnabled(): Any? = unwrap(this).getHttpsRedirectionEnabled()

    override fun isAttached(): Any? = unwrap(this).getIsAttached()

    override fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLoadBalancerTlsCertificateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps):
        CfnLoadBalancerTlsCertificateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancerTlsCertificateProps):
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificateProps
  }
}
