package io.cloudshiftdev.awscdk.services.route53

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface HostedZoneProviderProps {
  public fun domainName(): String

  public fun privateZone(): Boolean? = unwrap(this).getPrivateZone()

  public fun vpcId(): String? = unwrap(this).getVpcId()

  public interface Builder {
    public fun domainName(domainName: String) {
    }

    public fun privateZone(privateZone: Boolean) {
    }

    public fun vpcId(vpcId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.HostedZoneProviderProps.Builder
        = software.amazon.awscdk.services.route53.HostedZoneProviderProps.builder()

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun privateZone(privateZone: Boolean) {
      cdkBuilder.privateZone(privateZone)
    }

    public override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.route53.HostedZoneProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.route53.HostedZoneProviderProps,
  ) : HostedZoneProviderProps {
    public override fun domainName(): String = unwrap(this).getDomainName()

    public override fun privateZone(): Boolean? = unwrap(this).getPrivateZone()

    public override fun vpcId(): String? = unwrap(this).getVpcId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.HostedZoneProviderProps):
        HostedZoneProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedZoneProviderProps):
        software.amazon.awscdk.services.route53.HostedZoneProviderProps = (wrapped as
        Wrapper).cdkObject
  }
}
