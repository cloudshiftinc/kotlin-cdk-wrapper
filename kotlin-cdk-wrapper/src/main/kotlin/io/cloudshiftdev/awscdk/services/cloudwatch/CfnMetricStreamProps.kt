@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnMetricStreamProps {
  public fun excludeFilters(): Any? = unwrap(this).getExcludeFilters()

  public fun firehoseArn(): String

  public fun includeFilters(): Any? = unwrap(this).getIncludeFilters()

  public fun includeLinkedAccountsMetrics(): Any? = unwrap(this).getIncludeLinkedAccountsMetrics()

  public fun name(): String? = unwrap(this).getName()

  public fun outputFormat(): String

  public fun roleArn(): String

  public fun statisticsConfigurations(): Any? = unwrap(this).getStatisticsConfigurations()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun excludeFilters(excludeFilters: IResolvable)

    public fun excludeFilters(excludeFilters: List<Any>)

    public fun excludeFilters(vararg excludeFilters: Any)

    public fun firehoseArn(firehoseArn: String)

    public fun includeFilters(includeFilters: IResolvable)

    public fun includeFilters(includeFilters: List<Any>)

    public fun includeFilters(vararg includeFilters: Any)

    public fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: Boolean)

    public fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: IResolvable)

    public fun name(name: String)

    public fun outputFormat(outputFormat: String)

    public fun roleArn(roleArn: String)

    public fun statisticsConfigurations(statisticsConfigurations: IResolvable)

    public fun statisticsConfigurations(statisticsConfigurations: List<Any>)

    public fun statisticsConfigurations(vararg statisticsConfigurations: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps.Builder
        = software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps.builder()

    override fun excludeFilters(excludeFilters: IResolvable) {
      cdkBuilder.excludeFilters(excludeFilters.let(IResolvable::unwrap))
    }

    override fun excludeFilters(excludeFilters: List<Any>) {
      cdkBuilder.excludeFilters(excludeFilters)
    }

    override fun excludeFilters(vararg excludeFilters: Any): Unit =
        excludeFilters(excludeFilters.toList())

    override fun firehoseArn(firehoseArn: String) {
      cdkBuilder.firehoseArn(firehoseArn)
    }

    override fun includeFilters(includeFilters: IResolvable) {
      cdkBuilder.includeFilters(includeFilters.let(IResolvable::unwrap))
    }

    override fun includeFilters(includeFilters: List<Any>) {
      cdkBuilder.includeFilters(includeFilters)
    }

    override fun includeFilters(vararg includeFilters: Any): Unit =
        includeFilters(includeFilters.toList())

    override fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: Boolean) {
      cdkBuilder.includeLinkedAccountsMetrics(includeLinkedAccountsMetrics)
    }

    override fun includeLinkedAccountsMetrics(includeLinkedAccountsMetrics: IResolvable) {
      cdkBuilder.includeLinkedAccountsMetrics(includeLinkedAccountsMetrics.let(IResolvable::unwrap))
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outputFormat(outputFormat: String) {
      cdkBuilder.outputFormat(outputFormat)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun statisticsConfigurations(statisticsConfigurations: IResolvable) {
      cdkBuilder.statisticsConfigurations(statisticsConfigurations.let(IResolvable::unwrap))
    }

    override fun statisticsConfigurations(statisticsConfigurations: List<Any>) {
      cdkBuilder.statisticsConfigurations(statisticsConfigurations)
    }

    override fun statisticsConfigurations(vararg statisticsConfigurations: Any): Unit =
        statisticsConfigurations(statisticsConfigurations.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps,
  ) : CdkObject(cdkObject), CfnMetricStreamProps {
    override fun excludeFilters(): Any? = unwrap(this).getExcludeFilters()

    override fun firehoseArn(): String = unwrap(this).getFirehoseArn()

    override fun includeFilters(): Any? = unwrap(this).getIncludeFilters()

    override fun includeLinkedAccountsMetrics(): Any? =
        unwrap(this).getIncludeLinkedAccountsMetrics()

    override fun name(): String? = unwrap(this).getName()

    override fun outputFormat(): String = unwrap(this).getOutputFormat()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun statisticsConfigurations(): Any? = unwrap(this).getStatisticsConfigurations()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMetricStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps):
        CfnMetricStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMetricStreamProps):
        software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps
  }
}
