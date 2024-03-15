@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.cloudwatch.Unit as CloudwatchUnit
import kotlin.Unit as KotlinUnit

public interface SystemErrorsForOperationsMetricOptions : MetricOptions {
  public fun operations(): List<Operation> = unwrap(this).getOperations()?.map(Operation::wrap) ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun color(color: String)

    public fun dimensionsMap(dimensionsMap: Map<String, String>)

    public fun label(label: String)

    public fun operations(operations: List<Operation>)

    public fun operations(vararg operations: Operation)

    public fun period(period: Duration)

    public fun region(region: String)

    public fun statistic(statistic: String)

    public fun unit(unit: CloudwatchUnit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions.Builder =
        software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun color(color: String) {
      cdkBuilder.color(color)
    }

    override fun dimensionsMap(dimensionsMap: Map<String, String>) {
      cdkBuilder.dimensionsMap(dimensionsMap)
    }

    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    override fun operations(operations: List<Operation>) {
      cdkBuilder.operations(operations.map(Operation::unwrap))
    }

    override fun operations(vararg operations: Operation): KotlinUnit =
        operations(operations.toList())

    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    override fun unit(unit: CloudwatchUnit) {
      cdkBuilder.unit(unit.let(CloudwatchUnit::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions,
  ) : CdkObject(cdkObject), SystemErrorsForOperationsMetricOptions {
    override fun account(): String? = unwrap(this).getAccount()

    override fun color(): String? = unwrap(this).getColor()

    override fun dimensionsMap(): Map<String, String> = unwrap(this).getDimensionsMap() ?:
        emptyMap()

    override fun label(): String? = unwrap(this).getLabel()

    override fun operations(): List<Operation> = unwrap(this).getOperations()?.map(Operation::wrap)
        ?: emptyList()

    override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    override fun region(): String? = unwrap(this).getRegion()

    override fun statistic(): String? = unwrap(this).getStatistic()

    override fun unit(): CloudwatchUnit? = unwrap(this).getUnit()?.let(CloudwatchUnit::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> KotlinUnit = {}):
        SystemErrorsForOperationsMetricOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions):
        SystemErrorsForOperationsMetricOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SystemErrorsForOperationsMetricOptions):
        software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.dynamodb.SystemErrorsForOperationsMetricOptions
  }
}
