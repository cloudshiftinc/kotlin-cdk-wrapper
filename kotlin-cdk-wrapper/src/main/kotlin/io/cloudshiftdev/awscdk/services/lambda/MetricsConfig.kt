@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Configuration for collecting metrics from the event source.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.*;
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * Function fn;
 * Table table = Table.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .stream(StreamViewType.NEW_IMAGE)
 * .build();
 * fn.addEventSource(DynamoEventSource.Builder.create(table)
 * .startingPosition(StartingPosition.LATEST)
 * .metricsConfig(MetricsConfig.builder()
 * .metrics(List.of(MetricType.EVENT_COUNT))
 * .build())
 * .build());
 * ```
 */
public interface MetricsConfig {
  /**
   * List of metric types to enable for this event source.
   */
  public fun metrics(): List<MetricType>

  /**
   * A builder for [MetricsConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param metrics List of metric types to enable for this event source. 
     */
    public fun metrics(metrics: List<MetricType>)

    /**
     * @param metrics List of metric types to enable for this event source. 
     */
    public fun metrics(vararg metrics: MetricType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.MetricsConfig.Builder =
        software.amazon.awscdk.services.lambda.MetricsConfig.builder()

    /**
     * @param metrics List of metric types to enable for this event source. 
     */
    override fun metrics(metrics: List<MetricType>) {
      cdkBuilder.metrics(metrics.map(MetricType.Companion::unwrap))
    }

    /**
     * @param metrics List of metric types to enable for this event source. 
     */
    override fun metrics(vararg metrics: MetricType): Unit = metrics(metrics.toList())

    public fun build(): software.amazon.awscdk.services.lambda.MetricsConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.MetricsConfig,
  ) : CdkObject(cdkObject),
      MetricsConfig {
    /**
     * List of metric types to enable for this event source.
     */
    override fun metrics(): List<MetricType> = unwrap(this).getMetrics().map(MetricType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MetricsConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.MetricsConfig):
        MetricsConfig = CdkObjectWrappers.wrap(cdkObject) as? MetricsConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MetricsConfig):
        software.amazon.awscdk.services.lambda.MetricsConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.MetricsConfig
  }
}
