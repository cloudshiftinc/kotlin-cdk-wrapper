@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.collections.List

/**
 * Properties for a concrete metric.
 *
 * NOTE: `unit` is no longer on this object since it is only used for `Alarms`, and doesn't mean
 * what one
 * would expect it to mean there anyway. It is most likely to be misused.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
 * Object value;
 * MetricStatConfig metricStatConfig = MetricStatConfig.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .period(Duration.minutes(30))
 * .statistic("statistic")
 * // the properties below are optional
 * .account("account")
 * .dimensions(List.of(Dimension.builder()
 * .name("name")
 * .value(value)
 * .build()))
 * .region("region")
 * .unitFilter(Unit.SECONDS)
 * .build();
 * ```
 */
public interface MetricStatConfig {
  /**
   * Account which this metric comes from.
   *
   * Default: Deployment account.
   */
  public fun account(): String? = unwrap(this).getAccount()

  /**
   * The dimensions to apply to the alarm.
   *
   * Default: []
   */
  public fun dimensions(): List<Dimension> = unwrap(this).getDimensions()?.map(Dimension::wrap) ?:
      emptyList()

  /**
   * Name of the metric.
   */
  public fun metricName(): String

  /**
   * Namespace of the metric.
   */
  public fun namespace(): String

  /**
   * How many seconds to aggregate over.
   */
  public fun period(): Duration

  /**
   * Region which this metric comes from.
   *
   * Default: Deployment region.
   */
  public fun region(): String? = unwrap(this).getRegion()

  /**
   * Aggregation function to use (can be either simple or a percentile).
   */
  public fun statistic(): String

  /**
   * Unit used to filter the metric stream.
   *
   * Only refer to datums emitted to the metric stream with the given unit and
   * ignore all others. Only useful when datums are being emitted to the same
   * metric stream under different units.
   *
   * This field has been renamed from plain `unit` to clearly communicate
   * its purpose.
   *
   * Default: - Refer to all metric datums
   */
  public fun unitFilter(): Unit? = unwrap(this).getUnitFilter()?.let(Unit::wrap)

  /**
   * A builder for [MetricStatConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account Account which this metric comes from.
     */
    public fun account(account: String)

    /**
     * @param dimensions The dimensions to apply to the alarm.
     */
    public fun dimensions(dimensions: List<Dimension>)

    /**
     * @param dimensions The dimensions to apply to the alarm.
     */
    public fun dimensions(vararg dimensions: Dimension)

    /**
     * @param metricName Name of the metric. 
     */
    public fun metricName(metricName: String)

    /**
     * @param namespace Namespace of the metric. 
     */
    public fun namespace(namespace: String)

    /**
     * @param period How many seconds to aggregate over. 
     */
    public fun period(period: Duration)

    /**
     * @param region Region which this metric comes from.
     */
    public fun region(region: String)

    /**
     * @param statistic Aggregation function to use (can be either simple or a percentile). 
     */
    public fun statistic(statistic: String)

    /**
     * @param unitFilter Unit used to filter the metric stream.
     * Only refer to datums emitted to the metric stream with the given unit and
     * ignore all others. Only useful when datums are being emitted to the same
     * metric stream under different units.
     *
     * This field has been renamed from plain `unit` to clearly communicate
     * its purpose.
     */
    public fun unitFilter(unitFilter: Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.MetricStatConfig.Builder =
        software.amazon.awscdk.services.cloudwatch.MetricStatConfig.builder()

    /**
     * @param account Account which this metric comes from.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param dimensions The dimensions to apply to the alarm.
     */
    override fun dimensions(dimensions: List<Dimension>) {
      cdkBuilder.dimensions(dimensions.map(Dimension::unwrap))
    }

    /**
     * @param dimensions The dimensions to apply to the alarm.
     */
    override fun dimensions(vararg dimensions: Dimension): kotlin.Unit =
        dimensions(dimensions.toList())

    /**
     * @param metricName Name of the metric. 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param namespace Namespace of the metric. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param period How many seconds to aggregate over. 
     */
    override fun period(period: Duration) {
      cdkBuilder.period(period.let(Duration::unwrap))
    }

    /**
     * @param region Region which this metric comes from.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param statistic Aggregation function to use (can be either simple or a percentile). 
     */
    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    /**
     * @param unitFilter Unit used to filter the metric stream.
     * Only refer to datums emitted to the metric stream with the given unit and
     * ignore all others. Only useful when datums are being emitted to the same
     * metric stream under different units.
     *
     * This field has been renamed from plain `unit` to clearly communicate
     * its purpose.
     */
    override fun unitFilter(unitFilter: Unit) {
      cdkBuilder.unitFilter(unitFilter.let(Unit::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.MetricStatConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.MetricStatConfig,
  ) : CdkObject(cdkObject), MetricStatConfig {
    /**
     * Account which this metric comes from.
     *
     * Default: Deployment account.
     */
    override fun account(): String? = unwrap(this).getAccount()

    /**
     * The dimensions to apply to the alarm.
     *
     * Default: []
     */
    override fun dimensions(): List<Dimension> = unwrap(this).getDimensions()?.map(Dimension::wrap)
        ?: emptyList()

    /**
     * Name of the metric.
     */
    override fun metricName(): String = unwrap(this).getMetricName()

    /**
     * Namespace of the metric.
     */
    override fun namespace(): String = unwrap(this).getNamespace()

    /**
     * How many seconds to aggregate over.
     */
    override fun period(): Duration = unwrap(this).getPeriod().let(Duration::wrap)

    /**
     * Region which this metric comes from.
     *
     * Default: Deployment region.
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * Aggregation function to use (can be either simple or a percentile).
     */
    override fun statistic(): String = unwrap(this).getStatistic()

    /**
     * Unit used to filter the metric stream.
     *
     * Only refer to datums emitted to the metric stream with the given unit and
     * ignore all others. Only useful when datums are being emitted to the same
     * metric stream under different units.
     *
     * This field has been renamed from plain `unit` to clearly communicate
     * its purpose.
     *
     * Default: - Refer to all metric datums
     */
    override fun unitFilter(): Unit? = unwrap(this).getUnitFilter()?.let(Unit::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> kotlin.Unit = {}): MetricStatConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.MetricStatConfig):
        MetricStatConfig = CdkObjectWrappers.wrap(cdkObject) as? MetricStatConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricStatConfig):
        software.amazon.awscdk.services.cloudwatch.MetricStatConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.MetricStatConfig
  }
}
