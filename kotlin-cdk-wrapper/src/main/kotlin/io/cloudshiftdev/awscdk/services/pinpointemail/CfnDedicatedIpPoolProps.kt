@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpointemail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDedicatedIpPoolProps {
  public fun poolName(): String? = unwrap(this).getPoolName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun poolName(poolName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps.Builder =
        software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps.builder()

    override fun poolName(poolName: String) {
      cdkBuilder.poolName(poolName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps,
  ) : CdkObject(cdkObject), CfnDedicatedIpPoolProps {
    override fun poolName(): String? = unwrap(this).getPoolName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDedicatedIpPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps):
        CfnDedicatedIpPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDedicatedIpPoolProps):
        software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps
  }
}
