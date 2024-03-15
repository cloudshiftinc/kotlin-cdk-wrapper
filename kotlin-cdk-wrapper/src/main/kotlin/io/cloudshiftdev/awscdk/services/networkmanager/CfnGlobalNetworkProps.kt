@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnGlobalNetworkProps {
  public fun createdAt(): String? = unwrap(this).getCreatedAt()

  public fun description(): String? = unwrap(this).getDescription()

  public fun state(): String? = unwrap(this).getState()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun createdAt(createdAt: String)

    public fun description(description: String)

    public fun state(state: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps.builder()

    override fun createdAt(createdAt: String) {
      cdkBuilder.createdAt(createdAt)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps,
  ) : CdkObject(cdkObject), CfnGlobalNetworkProps {
    override fun createdAt(): String? = unwrap(this).getCreatedAt()

    override fun description(): String? = unwrap(this).getDescription()

    override fun state(): String? = unwrap(this).getState()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGlobalNetworkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps):
        CfnGlobalNetworkProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalNetworkProps):
        software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps
  }
}
