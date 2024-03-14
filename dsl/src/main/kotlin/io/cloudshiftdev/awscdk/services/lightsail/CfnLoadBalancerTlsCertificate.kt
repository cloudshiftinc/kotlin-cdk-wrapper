package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLoadBalancerTlsCertificate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrLoadBalancerTlsCertificateArn(): String =
      unwrap(this).getAttrLoadBalancerTlsCertificateArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun certificateAlternativeNames(): List<String> =
      unwrap(this).getCertificateAlternativeNames() ?: emptyList()

  public open fun certificateAlternativeNames(`value`: List<String>) {
    unwrap(this).setCertificateAlternativeNames(`value`)
  }

  public open fun certificateDomainName(): String = unwrap(this).getCertificateDomainName()

  public open fun certificateDomainName(`value`: String) {
    unwrap(this).setCertificateDomainName(`value`)
  }

  public open fun certificateName(): String = unwrap(this).getCertificateName()

  public open fun certificateName(`value`: String) {
    unwrap(this).setCertificateName(`value`)
  }

  public open fun httpsRedirectionEnabled(): Any? = unwrap(this).getHttpsRedirectionEnabled()

  public open fun httpsRedirectionEnabled(`value`: Boolean) {
    unwrap(this).setHttpsRedirectionEnabled(`value`)
  }

  public open fun httpsRedirectionEnabled(`value`: IResolvable) {
    unwrap(this).setHttpsRedirectionEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun isAttached(): Any? = unwrap(this).getIsAttached()

  public open fun isAttached(`value`: Boolean) {
    unwrap(this).setIsAttached(`value`)
  }

  public open fun isAttached(`value`: IResolvable) {
    unwrap(this).setIsAttached(`value`.let(IResolvable::unwrap))
  }

  public open fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()

  public open fun loadBalancerName(`value`: String) {
    unwrap(this).setLoadBalancerName(`value`)
  }

  public interface Builder {
    public fun certificateAlternativeNames(certificateAlternativeNames: List<String>)

    public fun certificateDomainName(certificateDomainName: String)

    public fun certificateName(certificateName: String)

    public fun httpsRedirectionEnabled(httpsRedirectionEnabled: Boolean)

    public fun httpsRedirectionEnabled(httpsRedirectionEnabled: IResolvable)

    public fun isAttached(isAttached: Boolean)

    public fun isAttached(isAttached: IResolvable)

    public fun loadBalancerName(loadBalancerName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate.Builder =
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate.Builder.create(scope,
        id)

    override fun certificateAlternativeNames(certificateAlternativeNames: List<String>) {
      cdkBuilder.certificateAlternativeNames(certificateAlternativeNames)
    }

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

    public fun build(): software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLoadBalancerTlsCertificate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLoadBalancerTlsCertificate(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate):
        CfnLoadBalancerTlsCertificate = CfnLoadBalancerTlsCertificate(cdkObject)

    internal fun unwrap(wrapped: CfnLoadBalancerTlsCertificate):
        software.amazon.awscdk.services.lightsail.CfnLoadBalancerTlsCertificate = wrapped.cdkObject
  }
}
