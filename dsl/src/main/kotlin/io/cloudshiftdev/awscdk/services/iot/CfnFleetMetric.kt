package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFleetMetric internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnFleetMetric,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun aggregationField(): String? = unwrap(this).getAggregationField()

  public open fun aggregationField(`value`: String) {
    unwrap(this).setAggregationField(`value`)
  }

  public open fun aggregationType(): Any? = unwrap(this).getAggregationType()

  public open fun aggregationType(`value`: IResolvable) {
    unwrap(this).setAggregationType(`value`.let(IResolvable::unwrap))
  }

  public open fun aggregationType(`value`: AggregationTypeProperty) {
    unwrap(this).setAggregationType(`value`.let(AggregationTypeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6153f3fbaea4aaaae1db7b7a7481cd0f6d5400f9d1bbd4a9654f4f4fa5b3b8e4")
  public open fun aggregationType(`value`: AggregationTypeProperty.Builder.() -> Unit): Unit =
      aggregationType(AggregationTypeProperty(`value`))

  public open fun attrCreationDate(): IResolvable =
      unwrap(this).getAttrCreationDate().let(IResolvable::wrap)

  public open fun attrLastModifiedDate(): IResolvable =
      unwrap(this).getAttrLastModifiedDate().let(IResolvable::wrap)

  public open fun attrMetricArn(): String = unwrap(this).getAttrMetricArn()

  public open fun attrVersion(): IResolvable = unwrap(this).getAttrVersion().let(IResolvable::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun indexName(): String? = unwrap(this).getIndexName()

  public open fun indexName(`value`: String) {
    unwrap(this).setIndexName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun metricName(): String = unwrap(this).getMetricName()

  public open fun metricName(`value`: String) {
    unwrap(this).setMetricName(`value`)
  }

  public open fun period(): Number? = unwrap(this).getPeriod()

  public open fun period(`value`: Number) {
    unwrap(this).setPeriod(`value`)
  }

  public open fun queryString(): String? = unwrap(this).getQueryString()

  public open fun queryString(`value`: String) {
    unwrap(this).setQueryString(`value`)
  }

  public open fun queryVersion(): String? = unwrap(this).getQueryVersion()

  public open fun queryVersion(`value`: String) {
    unwrap(this).setQueryVersion(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun unit(): String? = unwrap(this).getUnit()

  public open fun unit(`value`: String) {
    unwrap(this).setUnit(`value`)
  }

  public interface Builder {
    public fun aggregationField(aggregationField: String) {
    }

    public fun aggregationType(aggregationType: IResolvable) {
    }

    public fun aggregationType(aggregationType: AggregationTypeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f51ec62b9adb29ec5d37216a170c5a16418a243c8980b64bc4f237fdf705d3b")
    public fun aggregationType(aggregationType: AggregationTypeProperty.Builder.() -> Unit) {
    }

    public fun description(description: String) {
    }

    public fun indexName(indexName: String) {
    }

    public fun metricName(metricName: String) {
    }

    public fun period(period: Number) {
    }

    public fun queryString(queryString: String) {
    }

    public fun queryVersion(queryVersion: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun unit(unit: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnFleetMetric.Builder =
        software.amazon.awscdk.services.iot.CfnFleetMetric.Builder.create(scope, id)

    public override fun aggregationField(aggregationField: String) {
      cdkBuilder.aggregationField(aggregationField)
    }

    public override fun aggregationType(aggregationType: IResolvable) {
      cdkBuilder.aggregationType(aggregationType.let(IResolvable::unwrap))
    }

    public override fun aggregationType(aggregationType: AggregationTypeProperty) {
      cdkBuilder.aggregationType(aggregationType.let(AggregationTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f51ec62b9adb29ec5d37216a170c5a16418a243c8980b64bc4f237fdf705d3b")
    public override
        fun aggregationType(aggregationType: AggregationTypeProperty.Builder.() -> Unit): Unit =
        aggregationType(AggregationTypeProperty(aggregationType))

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    public override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    public override fun period(period: Number) {
      cdkBuilder.period(period)
    }

    public override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    public override fun queryVersion(queryVersion: String) {
      cdkBuilder.queryVersion(queryVersion)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun unit(unit: String) {
      cdkBuilder.unit(unit)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnFleetMetric = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFleetMetric {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFleetMetric(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnFleetMetric): CfnFleetMetric
        = CfnFleetMetric(cdkObject)

    internal fun unwrap(wrapped: CfnFleetMetric): software.amazon.awscdk.services.iot.CfnFleetMetric
        = wrapped.cdkObject
  }

  public interface AggregationTypeProperty {
    public fun name(): String

    public fun values(): List<String>

    public interface Builder {
      public fun name(name: String) {
      }

      public fun values(values: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty.Builder =
          software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      public fun build(): software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty,
    ) : AggregationTypeProperty {
      public override fun name(): String = unwrap(this).getName()

      public override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AggregationTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty):
          AggregationTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AggregationTypeProperty):
          software.amazon.awscdk.services.iot.CfnFleetMetric.AggregationTypeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
