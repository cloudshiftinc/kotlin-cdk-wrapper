@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * The VpnGateway Properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * VpnGatewayProps vpnGatewayProps = VpnGatewayProps.builder()
 * .type("type")
 * // the properties below are optional
 * .amazonSideAsn(123)
 * .build();
 * ```
 */
public interface VpnGatewayProps {
  /**
   * Explicitly specify an Asn or let aws pick an Asn for you.
   *
   * Default: 65000
   */
  public fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

  /**
   * Default type ipsec.1.
   */
  public fun type(): String

  /**
   * A builder for [VpnGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amazonSideAsn Explicitly specify an Asn or let aws pick an Asn for you.
     */
    public fun amazonSideAsn(amazonSideAsn: Number)

    /**
     * @param type Default type ipsec.1. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.VpnGatewayProps.builder()

    /**
     * @param amazonSideAsn Explicitly specify an Asn or let aws pick an Asn for you.
     */
    override fun amazonSideAsn(amazonSideAsn: Number) {
      cdkBuilder.amazonSideAsn(amazonSideAsn)
    }

    /**
     * @param type Default type ipsec.1. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.VpnGatewayProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.VpnGatewayProps,
  ) : CdkObject(cdkObject), VpnGatewayProps {
    /**
     * Explicitly specify an Asn or let aws pick an Asn for you.
     *
     * Default: 65000
     */
    override fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

    /**
     * Default type ipsec.1.
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VpnGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.VpnGatewayProps):
        VpnGatewayProps = CdkObjectWrappers.wrap(cdkObject) as? VpnGatewayProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VpnGatewayProps):
        software.amazon.awscdk.services.ec2.VpnGatewayProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.VpnGatewayProps
  }
}
