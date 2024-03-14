package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface VpnGatewayProps {
  public fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

  public fun type(): String

  public interface Builder {
    public fun amazonSideAsn(amazonSideAsn: Number)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.VpnGatewayProps.builder()

    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnGatewayProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.VpnGatewayProps,
  ) : VpnGatewayProps {
    override fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpnGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnGatewayProps):
        VpnGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnGatewayProps):
        software.amazon.awscdk.services.ec2.VpnGatewayProps = (wrapped as Wrapper).cdkObject
  }
}
