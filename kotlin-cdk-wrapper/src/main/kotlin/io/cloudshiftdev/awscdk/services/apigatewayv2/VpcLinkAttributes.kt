@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.String
import kotlin.Unit

public interface VpcLinkAttributes {
  public fun vpc(): IVpc

  public fun vpcLinkId(): String

  @CdkDslMarker
  public interface Builder {
    public fun vpc(vpc: IVpc)

    public fun vpcLinkId(vpcLinkId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes.builder()

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    override fun vpcLinkId(vpcLinkId: String) {
      cdkBuilder.vpcLinkId(vpcLinkId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes,
  ) : CdkObject(cdkObject), VpcLinkAttributes {
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    override fun vpcLinkId(): String = unwrap(this).getVpcLinkId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcLinkAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes):
        VpcLinkAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcLinkAttributes):
        software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes
  }
}
