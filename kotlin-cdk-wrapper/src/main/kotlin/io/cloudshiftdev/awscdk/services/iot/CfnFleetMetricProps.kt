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

/**
 * Properties for defining a `CfnFleetMetric`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iot.*;
 * CfnFleetMetricProps cfnFleetMetricProps = CfnFleetMetricProps.builder()
 * .metricName("metricName")
 * // the properties below are optional
 * .aggregationField("aggregationField")
 * .aggregationType(AggregationTypeProperty.builder()
 * .name("name")
 * .values(List.of("values"))
 * .build())
 * .description("description")
 * .indexName("indexName")
 * .period(123)
 * .queryString("queryString")
 * .queryVersion("queryVersion")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .unit("unit")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html)
 */
public interface CfnFleetMetricProps {
  /**
   * The field to aggregate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationfield)
   */
  public fun aggregationField(): String? = unwrap(this).getAggregationField()

  /**
   * The type of the aggregation query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationtype)
   */
  public fun aggregationType(): Any? = unwrap(this).getAggregationType()

  /**
   * The fleet metric description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the index to search.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-indexname)
   */
  public fun indexName(): String? = unwrap(this).getIndexName()

  /**
   * The name of the fleet metric to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-metricname)
   */
  public fun metricName(): String

  /**
   * The time in seconds between fleet metric emissions.
   *
   * Range [60(1 min), 86400(1 day)] and must be multiple of 60.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-period)
   */
  public fun period(): Number? = unwrap(this).getPeriod()

  /**
   * The search query string.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-querystring)
   */
  public fun queryString(): String? = unwrap(this).getQueryString()

  /**
   * The query version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-queryversion)
   */
  public fun queryVersion(): String? = unwrap(this).getQueryVersion()

  /**
   * Metadata which can be used to manage the fleet metric.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Used to support unit transformation such as milliseconds to seconds.
   *
   * Must be a unit supported by CW metric. Default to null.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-unit)
   */
  public fun unit(): String? = unwrap(this).getUnit()

  /**
   * A builder for [CfnFleetMetricProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aggregationField The field to aggregate.
     */
    public fun aggregationField(aggregationField: String)

    /**
     * @param aggregationType The type of the aggregation query.
     */
    public fun aggregationType(aggregationType: IResolvable)

    /**
     * @param aggregationType The type of the aggregation query.
     */
    public fun aggregationType(aggregationType: CfnFleetMetric.AggregationTypeProperty)

    /**
     * @param aggregationType The type of the aggregation query.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88638c9d91bd45e4d488af5dd61df16fd5446c9e6ecc2a33b13bcf2921f7a0e9")
    public
        fun aggregationType(aggregationType: CfnFleetMetric.AggregationTypeProperty.Builder.() -> Unit)

    /**
     * @param description The fleet metric description.
     */
    public fun description(description: String)

    /**
     * @param indexName The name of the index to search.
     */
    public fun indexName(indexName: String)

    /**
     * @param metricName The name of the fleet metric to create. 
     */
    public fun metricName(metricName: String)

    /**
     * @param period The time in seconds between fleet metric emissions.
     * Range [60(1 min), 86400(1 day)] and must be multiple of 60.
     */
    public fun period(period: Number)

    /**
     * @param queryString The search query string.
     */
    public fun queryString(queryString: String)

    /**
     * @param queryVersion The query version.
     */
    public fun queryVersion(queryVersion: String)

    /**
     * @param tags Metadata which can be used to manage the fleet metric.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata which can be used to manage the fleet metric.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param unit Used to support unit transformation such as milliseconds to seconds.
     * Must be a unit supported by CW metric. Default to null.
     */
    public fun unit(unit: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnFleetMetricProps.Builder =
        software.amazon.awscdk.services.iot.CfnFleetMetricProps.builder()

    /**
     * @param aggregationField The field to aggregate.
     */
    override fun aggregationField(aggregationField: String) {
      cdkBuilder.aggregationField(aggregationField)
    }

    /**
     * @param aggregationType The type of the aggregation query.
     */
    override fun aggregationType(aggregationType: IResolvable) {
      cdkBuilder.aggregationType(aggregationType.let(IResolvable::unwrap))
    }

    /**
     * @param aggregationType The type of the aggregation query.
     */
    override fun aggregationType(aggregationType: CfnFleetMetric.AggregationTypeProperty) {
      cdkBuilder.aggregationType(aggregationType.let(CfnFleetMetric.AggregationTypeProperty::unwrap))
    }

    /**
     * @param aggregationType The type of the aggregation query.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88638c9d91bd45e4d488af5dd61df16fd5446c9e6ecc2a33b13bcf2921f7a0e9")
    override
        fun aggregationType(aggregationType: CfnFleetMetric.AggregationTypeProperty.Builder.() -> Unit):
        Unit = aggregationType(CfnFleetMetric.AggregationTypeProperty(aggregationType))

    /**
     * @param description The fleet metric description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param indexName The name of the index to search.
     */
    override fun indexName(indexName: String) {
      cdkBuilder.indexName(indexName)
    }

    /**
     * @param metricName The name of the fleet metric to create. 
     */
    override fun metricName(metricName: String) {
      cdkBuilder.metricName(metricName)
    }

    /**
     * @param period The time in seconds between fleet metric emissions.
     * Range [60(1 min), 86400(1 day)] and must be multiple of 60.
     */
    override fun period(period: Number) {
      cdkBuilder.period(period)
    }

    /**
     * @param queryString The search query string.
     */
    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    /**
     * @param queryVersion The query version.
     */
    override fun queryVersion(queryVersion: String) {
      cdkBuilder.queryVersion(queryVersion)
    }

    /**
     * @param tags Metadata which can be used to manage the fleet metric.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata which can be used to manage the fleet metric.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param unit Used to support unit transformation such as milliseconds to seconds.
     * Must be a unit supported by CW metric. Default to null.
     */
    override fun unit(unit: String) {
      cdkBuilder.unit(unit)
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnFleetMetricProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iot.CfnFleetMetricProps,
  ) : CdkObject(cdkObject), CfnFleetMetricProps {
    /**
     * The field to aggregate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationfield)
     */
    override fun aggregationField(): String? = unwrap(this).getAggregationField()

    /**
     * The type of the aggregation query.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationtype)
     */
    override fun aggregationType(): Any? = unwrap(this).getAggregationType()

    /**
     * The fleet metric description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the index to search.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-indexname)
     */
    override fun indexName(): String? = unwrap(this).getIndexName()

    /**
     * The name of the fleet metric to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-metricname)
     */
    override fun metricName(): String = unwrap(this).getMetricName()

    /**
     * The time in seconds between fleet metric emissions.
     *
     * Range [60(1 min), 86400(1 day)] and must be multiple of 60.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-period)
     */
    override fun period(): Number? = unwrap(this).getPeriod()

    /**
     * The search query string.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-querystring)
     */
    override fun queryString(): String? = unwrap(this).getQueryString()

    /**
     * The query version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-queryversion)
     */
    override fun queryVersion(): String? = unwrap(this).getQueryVersion()

    /**
     * Metadata which can be used to manage the fleet metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Used to support unit transformation such as milliseconds to seconds.
     *
     * Must be a unit supported by CW metric. Default to null.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-unit)
     */
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
