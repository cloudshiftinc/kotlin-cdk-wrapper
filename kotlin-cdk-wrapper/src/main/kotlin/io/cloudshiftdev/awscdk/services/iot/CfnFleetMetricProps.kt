@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFleetMetricProps {
  public fun aggregationField(): String? = unwrap(this).getAggregationField()

  public fun aggregationType(): Any? = unwrap(this).getAggregationType()

  public fun description(): String? = unwrap(this).getDescription()

  public fun indexName(): String? = unwrap(this).getIndexName()

  public fun metricName(): String

  public fun period(): Number? = unwrap(this).getPeriod()

  public fun queryString(): String? = unwrap(this).getQueryString()

  public fun queryVersion(): String? = unwrap(this).getQueryVersion()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun unit(): String? = unwrap(this).getUnit()

  @CdkDslMarker
  public interface Builder {
    public fun aggregationField(aggregationField: String)

    public fun aggregationType(aggregationType: IResolvable)

    public fun aggregationType(aggregationType: CfnFleetMetric.AggregationTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88638c9d91bd45e4d488af5dd61df16fd5446c9e6ecc2a33b13bcf2921f7a0e9")
    public
        fun aggregationType(aggregationType: CfnFleetMetric.AggregationTypeProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun indexName(indexName: String)

    public fun metricName(metricName: String)

    public fun period(period: Number)

    public fun queryString(queryString: String)

    public fun queryVersion(queryVersion: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun unit(unit: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnFleetMetricProps.Builder =
        software.amazon.awscdk.services.iot.CfnFleetMetricProps.builder()

    override fun aggregationField(aggregationField: String) {
      cdkBuilder.aggregationField(aggregationField)
    }

    override fun aggregationType(aggregationType: IResolvable) {
      cdkBuilder.aggregationType(aggregationType.let(IResolvable::unwrap))
    }

    override fun aggregationType(aggregationType: CfnFleetMetric.AggregationTypeProperty) {
      cdkBuilder.aggregationType(aggregationType.let(CfnFleetMetric.AggregationTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88638c9d91bd45e4d488af5dd61df16fd5446c9e6ecc2a33b13bcf2921f7a0e9")
    override
        fun aggregationType(aggregationType: CfnFleetMetric.AggregationTypeProperty.Builder.() -> Unit):
        Unit = aggregationType(CfnFleetMetric.AggregationTypeProperty(aggregationType))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    override fun period(period: Number) {
      cdkBuilder.period(period)
    }

    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    override fun queryVersion(queryVersion: String) {
      cdkBuilder.queryVersion(queryVersion)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun unit(unit: String) {
      cdkBuilder.unit(unit)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnFleetMetricProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnFleetMetricProps,
  ) : CdkObject(cdkObject), CfnFleetMetricProps {
    override fun aggregationField(): String? = unwrap(this).getAggregationField()

    override fun aggregationType(): Any? = unwrap(this).getAggregationType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun indexName(): String? = unwrap(this).getIndexName()

    override fun metricName(): String = unwrap(this).getMetricName()

    override fun period(): Number? = unwrap(this).getPeriod()

    override fun queryString(): String? = unwrap(this).getQueryString()

    override fun queryVersion(): String? = unwrap(this).getQueryVersion()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun unit(): String? = unwrap(this).getUnit()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFleetMetricProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnFleetMetricProps):
        CfnFleetMetricProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFleetMetricProps):
        software.amazon.awscdk.services.iot.CfnFleetMetricProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iot.CfnFleetMetricProps
  }
}
