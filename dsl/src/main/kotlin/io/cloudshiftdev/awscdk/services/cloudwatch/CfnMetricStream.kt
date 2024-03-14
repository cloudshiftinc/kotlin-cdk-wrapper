package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMetricStream internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  public open fun attrLastUpdateDate(): String = unwrap(this).getAttrLastUpdateDate()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun excludeFilters(): Any? = unwrap(this).getExcludeFilters()

  public open fun excludeFilters(`value`: IResolvable) {
    unwrap(this).setExcludeFilters(`value`.let(IResolvable::unwrap))
  }

  public open fun excludeFilters(__idx_ac66f0: List<Any>) {
    unwrap(this).setExcludeFilters(__idx_ac66f0)
  }

  public open fun excludeFilters(vararg __idx_ac66f0: Any): Unit =
      excludeFilters(__idx_ac66f0.toList())

  public open fun firehoseArn(): String = unwrap(this).getFirehoseArn()

  public open fun firehoseArn(`value`: String) {
    unwrap(this).setFirehoseArn(`value`)
  }

  public open fun includeFilters(): Any? = unwrap(this).getIncludeFilters()

  public open fun includeFilters(`value`: IResolvable) {
    unwrap(this).setIncludeFilters(`value`.let(IResolvable::unwrap))
  }

  public open fun includeFilters(__idx_ac66f0: List<Any>) {
    unwrap(this).setIncludeFilters(__idx_ac66f0)
  }

  public open fun includeFilters(vararg __idx_ac66f0: Any): Unit =
      includeFilters(__idx_ac66f0.toList())

  public open fun includeLinkedAccountsMetrics(): Any? =
      unwrap(this).getIncludeLinkedAccountsMetrics()

  public open fun includeLinkedAccountsMetrics(`value`: Boolean) {
    unwrap(this).setIncludeLinkedAccountsMetrics(`value`)
  }

  public open fun includeLinkedAccountsMetrics(`value`: IResolvable) {
    unwrap(this).setIncludeLinkedAccountsMetrics(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun outputFormat(): String = unwrap(this).getOutputFormat()

  public open fun outputFormat(`value`: String) {
    unwrap(this).setOutputFormat(`value`)
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun statisticsConfigurations(): Any? = unwrap(this).getStatisticsConfigurations()

  public open fun statisticsConfigurations(`value`: IResolvable) {
    unwrap(this).setStatisticsConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun statisticsConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setStatisticsConfigurations(__idx_ac66f0)
  }

  public open fun statisticsConfigurations(vararg __idx_ac66f0: Any): Unit =
      statisticsConfigurations(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.CfnMetricStream.Builder =
        software.amazon.awscdk.services.cloudwatch.CfnMetricStream.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.cloudwatch.CfnMetricStream =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMetricStream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMetricStream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream):
        CfnMetricStream = CfnMetricStream(cdkObject)

    internal fun unwrap(wrapped: CfnMetricStream):
        software.amazon.awscdk.services.cloudwatch.CfnMetricStream = wrapped.cdkObject
  }

  public interface MetricStreamStatisticsConfigurationProperty {
    public fun additionalStatistics(): List<String>

    public fun includeMetrics(): Any

    public interface Builder {
      public fun additionalStatistics(additionalStatistics: List<String>)

      public fun additionalStatistics(vararg additionalStatistics: String)

      public fun includeMetrics(includeMetrics: IResolvable)

      public fun includeMetrics(includeMetrics: List<Any>)

      public fun includeMetrics(vararg includeMetrics: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty.builder()

      override fun additionalStatistics(additionalStatistics: List<String>) {
        cdkBuilder.additionalStatistics(additionalStatistics)
      }

      override fun additionalStatistics(vararg additionalStatistics: String): Unit =
          additionalStatistics(additionalStatistics.toList())

      override fun includeMetrics(includeMetrics: IResolvable) {
        cdkBuilder.includeMetrics(includeMetrics.let(IResolvable::unwrap))
      }

      override fun includeMetrics(includeMetrics: List<Any>) {
        cdkBuilder.includeMetrics(includeMetrics)
      }

      override fun includeMetrics(vararg includeMetrics: Any): Unit =
          includeMetrics(includeMetrics.toList())

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty,
    ) : MetricStreamStatisticsConfigurationProperty {
      override fun additionalStatistics(): List<String> = unwrap(this).getAdditionalStatistics()

      override fun includeMetrics(): Any = unwrap(this).getIncludeMetrics()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MetricStreamStatisticsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty):
          MetricStreamStatisticsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStreamStatisticsConfigurationProperty):
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricStreamStatisticsMetricProperty {
    public fun metricName(): String

    public fun namespace(): String

    public interface Builder {
      public fun metricName(metricName: String)

      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty.Builder
          =
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty.builder()

      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty,
    ) : MetricStreamStatisticsMetricProperty {
      override fun metricName(): String = unwrap(this).getMetricName()

      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          MetricStreamStatisticsMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty):
          MetricStreamStatisticsMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStreamStatisticsMetricProperty):
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamStatisticsMetricProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface MetricStreamFilterProperty {
    public fun metricNames(): List<String> = unwrap(this).getMetricNames() ?: emptyList()

    public fun namespace(): String

    public interface Builder {
      public fun metricNames(metricNames: List<String>)

      public fun metricNames(vararg metricNames: String)

      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty.Builder
          =
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty.builder()

      override fun metricNames(metricNames: List<String>) {
        cdkBuilder.metricNames(metricNames)
      }

      override fun metricNames(vararg metricNames: String): Unit = metricNames(metricNames.toList())

      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty,
    ) : MetricStreamFilterProperty {
      override fun metricNames(): List<String> = unwrap(this).getMetricNames() ?: emptyList()

      override fun namespace(): String = unwrap(this).getNamespace()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MetricStreamFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty):
          MetricStreamFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricStreamFilterProperty):
          software.amazon.awscdk.services.cloudwatch.CfnMetricStream.MetricStreamFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
