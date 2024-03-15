@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnIPAMResourceDiscoveryAssociationProps {
  public fun ipamId(): String

  public fun ipamResourceDiscoveryId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun ipamId(ipamId: String)

    public fun ipamResourceDiscoveryId(ipamResourceDiscoveryId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps.builder()

    override fun ipamId(ipamId: String) {
      cdkBuilder.ipamId(ipamId)
    }

    override fun ipamResourceDiscoveryId(ipamResourceDiscoveryId: String) {
      cdkBuilder.ipamResourceDiscoveryId(ipamResourceDiscoveryId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps,
  ) : CdkObject(cdkObject), CfnIPAMResourceDiscoveryAssociationProps {
    override fun ipamId(): String = unwrap(this).getIpamId()

    override fun ipamResourceDiscoveryId(): String = unwrap(this).getIpamResourceDiscoveryId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnIPAMResourceDiscoveryAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps):
        CfnIPAMResourceDiscoveryAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMResourceDiscoveryAssociationProps):
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryAssociationProps
  }
}
