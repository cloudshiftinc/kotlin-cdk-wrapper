@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrafficMirrorFilterProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun networkServices(): List<String> = unwrap(this).getNetworkServices() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun networkServices(networkServices: List<String>)

    public fun networkServices(vararg networkServices: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps.Builder
        = software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun networkServices(networkServices: List<String>) {
      cdkBuilder.networkServices(networkServices)
    }

    override fun networkServices(vararg networkServices: String): Unit =
        networkServices(networkServices.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps,
  ) : CdkObject(cdkObject), CfnTrafficMirrorFilterProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun networkServices(): List<String> = unwrap(this).getNetworkServices() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficMirrorFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps):
        CfnTrafficMirrorFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorFilterProps):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps
  }
}
