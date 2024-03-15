@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEIPProps {
  public fun domain(): String? = unwrap(this).getDomain()

  public fun instanceId(): String? = unwrap(this).getInstanceId()

  public fun networkBorderGroup(): String? = unwrap(this).getNetworkBorderGroup()

  public fun publicIpv4Pool(): String? = unwrap(this).getPublicIpv4Pool()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transferAddress(): String? = unwrap(this).getTransferAddress()

  @CdkDslMarker
  public interface Builder {
    public fun domain(domain: String)

    public fun instanceId(instanceId: String)

    public fun networkBorderGroup(networkBorderGroup: String)

    public fun publicIpv4Pool(publicIpv4Pool: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transferAddress(transferAddress: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnEIPProps.Builder =
        software.amazon.awscdk.services.ec2.CfnEIPProps.builder()

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun networkBorderGroup(networkBorderGroup: String) {
      cdkBuilder.networkBorderGroup(networkBorderGroup)
    }

    override fun publicIpv4Pool(publicIpv4Pool: String) {
      cdkBuilder.publicIpv4Pool(publicIpv4Pool)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transferAddress(transferAddress: String) {
      cdkBuilder.transferAddress(transferAddress)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnEIPProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnEIPProps,
  ) : CdkObject(cdkObject), CfnEIPProps {
    override fun domain(): String? = unwrap(this).getDomain()

    override fun instanceId(): String? = unwrap(this).getInstanceId()

    override fun networkBorderGroup(): String? = unwrap(this).getNetworkBorderGroup()

    override fun publicIpv4Pool(): String? = unwrap(this).getPublicIpv4Pool()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transferAddress(): String? = unwrap(this).getTransferAddress()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEIPProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnEIPProps): CfnEIPProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEIPProps): software.amazon.awscdk.services.ec2.CfnEIPProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnEIPProps
  }
}
