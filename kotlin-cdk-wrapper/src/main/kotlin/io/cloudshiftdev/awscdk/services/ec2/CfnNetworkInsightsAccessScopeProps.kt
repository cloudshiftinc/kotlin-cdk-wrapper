@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List

public interface CfnNetworkInsightsAccessScopeProps {
  public fun excludePaths(): Any? = unwrap(this).getExcludePaths()

  public fun matchPaths(): Any? = unwrap(this).getMatchPaths()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun excludePaths(excludePaths: IResolvable)

    public fun excludePaths(excludePaths: List<Any>)

    public fun excludePaths(vararg excludePaths: Any)

    public fun matchPaths(matchPaths: IResolvable)

    public fun matchPaths(matchPaths: List<Any>)

    public fun matchPaths(vararg matchPaths: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps.builder()

    override fun excludePaths(excludePaths: IResolvable) {
      cdkBuilder.excludePaths(excludePaths.let(IResolvable::unwrap))
    }

    override fun excludePaths(excludePaths: List<Any>) {
      cdkBuilder.excludePaths(excludePaths)
    }

    override fun excludePaths(vararg excludePaths: Any): Unit = excludePaths(excludePaths.toList())

    override fun matchPaths(matchPaths: IResolvable) {
      cdkBuilder.matchPaths(matchPaths.let(IResolvable::unwrap))
    }

    override fun matchPaths(matchPaths: List<Any>) {
      cdkBuilder.matchPaths(matchPaths)
    }

    override fun matchPaths(vararg matchPaths: Any): Unit = matchPaths(matchPaths.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps,
  ) : CdkObject(cdkObject), CfnNetworkInsightsAccessScopeProps {
    override fun excludePaths(): Any? = unwrap(this).getExcludePaths()

    override fun matchPaths(): Any? = unwrap(this).getMatchPaths()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInsightsAccessScopeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps):
        CfnNetworkInsightsAccessScopeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsAccessScopeProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeProps
  }
}
