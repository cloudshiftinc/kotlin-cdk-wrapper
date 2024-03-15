@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnNetworkInsightsAccessScopeAnalysisProps {
  public fun networkInsightsAccessScopeId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun networkInsightsAccessScopeId(networkInsightsAccessScopeId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps.builder()

    override fun networkInsightsAccessScopeId(networkInsightsAccessScopeId: String) {
      cdkBuilder.networkInsightsAccessScopeId(networkInsightsAccessScopeId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps,
  ) : CdkObject(cdkObject), CfnNetworkInsightsAccessScopeAnalysisProps {
    override fun networkInsightsAccessScopeId(): String =
        unwrap(this).getNetworkInsightsAccessScopeId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnNetworkInsightsAccessScopeAnalysisProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps):
        CfnNetworkInsightsAccessScopeAnalysisProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsAccessScopeAnalysisProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAccessScopeAnalysisProps
  }
}
