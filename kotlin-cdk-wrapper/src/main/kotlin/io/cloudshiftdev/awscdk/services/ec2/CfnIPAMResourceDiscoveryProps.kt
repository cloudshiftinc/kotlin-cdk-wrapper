@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnIPAMResourceDiscoveryProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun operatingRegions(): Any? = unwrap(this).getOperatingRegions()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun operatingRegions(operatingRegions: IResolvable)

    public fun operatingRegions(operatingRegions: List<Any>)

    public fun operatingRegions(vararg operatingRegions: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun operatingRegions(operatingRegions: IResolvable) {
      cdkBuilder.operatingRegions(operatingRegions.let(IResolvable::unwrap))
    }

    override fun operatingRegions(operatingRegions: List<Any>) {
      cdkBuilder.operatingRegions(operatingRegions)
    }

    override fun operatingRegions(vararg operatingRegions: Any): Unit =
        operatingRegions(operatingRegions.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps,
  ) : CdkObject(cdkObject), CfnIPAMResourceDiscoveryProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun operatingRegions(): Any? = unwrap(this).getOperatingRegions()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPAMResourceDiscoveryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps):
        CfnIPAMResourceDiscoveryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMResourceDiscoveryProps):
        software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnIPAMResourceDiscoveryProps
  }
}
