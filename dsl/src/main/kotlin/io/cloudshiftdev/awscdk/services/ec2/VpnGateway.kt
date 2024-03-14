package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VpnGateway internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.VpnGateway,
) : Resource(cdkObject), IVpnGateway {
  public override fun gatewayId(): String = unwrap(this).getGatewayId()

  public interface Builder {
    public fun amazonSideAsn(amazonSideAsn: Number)

    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnGateway.Builder =
        software.amazon.awscdk.services.ec2.VpnGateway.Builder.create(scope, id)

    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnGateway = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VpnGateway {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VpnGateway(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnGateway): VpnGateway =
        VpnGateway(cdkObject)

    internal fun unwrap(wrapped: VpnGateway): software.amazon.awscdk.services.ec2.VpnGateway =
        wrapped.cdkObject
  }
}
