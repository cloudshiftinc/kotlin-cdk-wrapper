package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.String
import kotlin.Unit

public interface VpcLinkAttributes {
  public fun vpc(): IVpc

  public fun vpcLinkId(): String

  public interface Builder {
    public fun vpc(vpc: IVpc) {
    }

    public fun vpcLinkId(vpcLinkId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes.builder()

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public override fun vpcLinkId(vpcLinkId: String) {
      cdkBuilder.vpcLinkId(vpcLinkId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes,
  ) : VpcLinkAttributes {
    public override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    public override fun vpcLinkId(): String = unwrap(this).getVpcLinkId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VpcLinkAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes):
        VpcLinkAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcLinkAttributes):
        software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
