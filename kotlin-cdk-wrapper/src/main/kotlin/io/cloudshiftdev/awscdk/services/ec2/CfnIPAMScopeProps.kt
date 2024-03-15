@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnIPAMScopeProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun ipamId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun ipamId(ipamId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnIPAMScopeProps.Builder =
        software.amazon.awscdk.services.ec2.CfnIPAMScopeProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun ipamId(ipamId: String) {
      cdkBuilder.ipamId(ipamId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnIPAMScopeProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMScopeProps,
  ) : CdkObject(cdkObject), CfnIPAMScopeProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun ipamId(): String = unwrap(this).getIpamId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIPAMScopeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnIPAMScopeProps):
        CfnIPAMScopeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIPAMScopeProps):
        software.amazon.awscdk.services.ec2.CfnIPAMScopeProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnIPAMScopeProps
  }
}
