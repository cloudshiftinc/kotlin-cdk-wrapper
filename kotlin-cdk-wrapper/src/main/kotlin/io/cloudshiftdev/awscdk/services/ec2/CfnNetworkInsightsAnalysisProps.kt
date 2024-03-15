@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnNetworkInsightsAnalysisProps {
  public fun additionalAccounts(): List<String> = unwrap(this).getAdditionalAccounts() ?:
      emptyList()

  public fun filterInArns(): List<String> = unwrap(this).getFilterInArns() ?: emptyList()

  public fun networkInsightsPathId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun additionalAccounts(additionalAccounts: List<String>)

    public fun additionalAccounts(vararg additionalAccounts: String)

    public fun filterInArns(filterInArns: List<String>)

    public fun filterInArns(vararg filterInArns: String)

    public fun networkInsightsPathId(networkInsightsPathId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps.Builder =
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps.builder()

    override fun additionalAccounts(additionalAccounts: List<String>) {
      cdkBuilder.additionalAccounts(additionalAccounts)
    }

    override fun additionalAccounts(vararg additionalAccounts: String): Unit =
        additionalAccounts(additionalAccounts.toList())

    override fun filterInArns(filterInArns: List<String>) {
      cdkBuilder.filterInArns(filterInArns)
    }

    override fun filterInArns(vararg filterInArns: String): Unit =
        filterInArns(filterInArns.toList())

    override fun networkInsightsPathId(networkInsightsPathId: String) {
      cdkBuilder.networkInsightsPathId(networkInsightsPathId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps,
  ) : CdkObject(cdkObject), CfnNetworkInsightsAnalysisProps {
    override fun additionalAccounts(): List<String> = unwrap(this).getAdditionalAccounts() ?:
        emptyList()

    override fun filterInArns(): List<String> = unwrap(this).getFilterInArns() ?: emptyList()

    override fun networkInsightsPathId(): String = unwrap(this).getNetworkInsightsPathId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkInsightsAnalysisProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps):
        CfnNetworkInsightsAnalysisProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkInsightsAnalysisProps):
        software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnNetworkInsightsAnalysisProps
  }
}
