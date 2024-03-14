package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.Duration
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.cloudwatch.Unit as CloudwatchUnit
import kotlin.Unit as KotlinUnit

public interface OperationsMetricOptions : SystemErrorsForOperationsMetricOptions {
  public interface Builder {
    public fun account(account: String) {
    }

    public fun color(color: String) {
    }

    public fun dimensionsMap(dimensionsMap: Map<String, String>) {
    }

    public fun label(label: String) {
    }

    public fun operations(operations: List<Operation>) {
    }

    public fun period(period: Duration) {
    }

    public fun region(region: String) {
    }

    public fun statistic(statistic: String) {
    }

    public fun unit(unit: CloudwatchUnit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dynamodb.OperationsMetricOptions.Builder
        = software.amazon.awscdk.services.dynamodb.OperationsMetricOptions.builder()

    public override fun account(account: String) {
      cdkBuilder.account(account)
    }

    public override fun color(color: String) {
      cdkBuilder.color(color)
    }

    public override fun dimensionsMap(dimensionsMap: Map<String, String>) {
      cdkBuilder.dimensionsMap(dimensionsMap)
    }

    public override fun label(label: String) {
      cdkBuilder.label(label)
    }

    public override fun operations(operations: List<Operation>) {
      cdkBuilder.operations(operations.map(Operation::unwrap))
    }

    public override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    public override fun unit(unit: CloudwatchUnit) {
      cdkBuilder.unit(unit.let(CloudwatchUnit::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dynamodb.OperationsMetricOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.OperationsMetricOptions,
  ) : OperationsMetricOptions {
    public override fun account(): String? = unwrap(this).getAccount()

    public override fun color(): String? = unwrap(this).getColor()

    public override fun dimensionsMap(): Map<String, String> = unwrap(this).getDimensionsMap() ?:
        emptyMap()

    public override fun label(): String? = unwrap(this).getLabel()

    public override fun operations(): List<Operation> =
        unwrap(this).getOperations()?.map(Operation::wrap) ?: emptyList()

    public override fun period(): Duration? = unwrap(this).getPeriod()?.let(Duration::wrap)

    public override fun region(): String? = unwrap(this).getRegion()

    public override fun statistic(): String? = unwrap(this).getStatistic()

    public override fun unit(): CloudwatchUnit? = unwrap(this).getUnit()?.let(CloudwatchUnit::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> KotlinUnit = {}): OperationsMetricOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.OperationsMetricOptions):
        OperationsMetricOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OperationsMetricOptions):
        software.amazon.awscdk.services.dynamodb.OperationsMetricOptions = (wrapped as
        Wrapper).cdkObject
  }
}
