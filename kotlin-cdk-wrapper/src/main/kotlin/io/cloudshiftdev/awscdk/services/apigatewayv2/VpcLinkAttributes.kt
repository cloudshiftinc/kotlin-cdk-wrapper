@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.String
import kotlin.Unit

/**
 * Attributes when importing a new VpcLink.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * Vpc vpc;
 * IVpcLink awesomeLink = VpcLink.fromVpcLinkAttributes(this, "awesome-vpc-link",
 * VpcLinkAttributes.builder()
 * .vpcLinkId("us-east-1_oiuR12Abd")
 * .vpc(vpc)
 * .build());
 * ```
 */
public interface VpcLinkAttributes {
  /**
   * The VPC to which this VPC link is associated with.
   */
  public fun vpc(): IVpc

  /**
   * The VPC Link id.
   */
  public fun vpcLinkId(): String

  /**
   * A builder for [VpcLinkAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param vpc The VPC to which this VPC link is associated with. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param vpcLinkId The VPC Link id. 
     */
    public fun vpcLinkId(vpcLinkId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes.builder()

    /**
     * @param vpc The VPC to which this VPC link is associated with. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param vpcLinkId The VPC Link id. 
     */
    override fun vpcLinkId(vpcLinkId: String) {
      cdkBuilder.vpcLinkId(vpcLinkId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes,
  ) : CdkObject(cdkObject), VpcLinkAttributes {
    /**
     * The VPC to which this VPC link is associated with.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * The VPC Link id.
     */
    override fun vpcLinkId(): String = unwrap(this).getVpcLinkId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpcLinkAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes):
        VpcLinkAttributes = CdkObjectWrappers.wrap(cdkObject) as? VpcLinkAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpcLinkAttributes):
        software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.VpcLinkAttributes
  }
}
