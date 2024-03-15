@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnCustomerGatewayProps {
  public fun bgpAsn(): Number

  public fun deviceName(): String? = unwrap(this).getDeviceName()

  public fun ipAddress(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun bgpAsn(bgpAsn: Number)

    public fun deviceName(deviceName: String)

    public fun ipAddress(ipAddress: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps.builder()

    override fun bgpAsn(bgpAsn: Number) {
      cdkBuilder.bgpAsn(bgpAsn)
    }

    override fun deviceName(deviceName: String) {
      cdkBuilder.deviceName(deviceName)
    }

    override fun ipAddress(ipAddress: String) {
      cdkBuilder.ipAddress(ipAddress)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps,
  ) : CdkObject(cdkObject), CfnCustomerGatewayProps {
    override fun bgpAsn(): Number = unwrap(this).getBgpAsn()

    override fun deviceName(): String? = unwrap(this).getDeviceName()

    override fun ipAddress(): String = unwrap(this).getIpAddress()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCustomerGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps):
        CfnCustomerGatewayProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCustomerGatewayProps):
        software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps
  }
}
