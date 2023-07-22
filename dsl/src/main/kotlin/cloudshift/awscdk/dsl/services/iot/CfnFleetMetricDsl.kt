@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnFleetMetric
import software.constructs.Construct

@CdkDslMarker
public class CfnFleetMetricDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFleetMetric.Builder = CfnFleetMetric.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The field to aggregate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationfield)
   * @param aggregationField The field to aggregate. 
   */
  public fun aggregationField(aggregationField: String) {
    cdkBuilder.aggregationField(aggregationField)
  }

  /**
   * The type of the aggregation query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationtype)
   * @param aggregationType The type of the aggregation query. 
   */
  public fun aggregationType(aggregationType: IResolvable) {
    cdkBuilder.aggregationType(aggregationType)
  }

  /**
   * The type of the aggregation query.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-aggregationtype)
   * @param aggregationType The type of the aggregation query. 
   */
  public fun aggregationType(aggregationType: CfnFleetMetric.AggregationTypeProperty) {
    cdkBuilder.aggregationType(aggregationType)
  }

  /**
   * The fleet metric description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-description)
   * @param description The fleet metric description. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the index to search.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-indexname)
   * @param indexName The name of the index to search. 
   */
  public fun indexName(indexName: String) {
    cdkBuilder.indexName(indexName)
  }

  /**
   * The name of the fleet metric to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-metricname)
   * @param metricName The name of the fleet metric to create. 
   */
  public fun metricName(metricName: String) {
    cdkBuilder.metricName(metricName)
  }

  /**
   * The time in seconds between fleet metric emissions.
   *
   * Range [60(1 min), 86400(1 day)] and must be multiple of 60.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-period)
   * @param period The time in seconds between fleet metric emissions. 
   */
  public fun period(period: Number) {
    cdkBuilder.period(period)
  }

  /**
   * The search query string.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-querystring)
   * @param queryString The search query string. 
   */
  public fun queryString(queryString: String) {
    cdkBuilder.queryString(queryString)
  }

  /**
   * The query version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-queryversion)
   * @param queryVersion The query version. 
   */
  public fun queryVersion(queryVersion: String) {
    cdkBuilder.queryVersion(queryVersion)
  }

  /**
   * Metadata which can be used to manage the fleet metric.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-tags)
   * @param tags Metadata which can be used to manage the fleet metric. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata which can be used to manage the fleet metric.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-tags)
   * @param tags Metadata which can be used to manage the fleet metric. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * Used to support unit transformation such as milliseconds to seconds.
   *
   * Must be a unit supported by CW metric. Default to null.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-fleetmetric.html#cfn-iot-fleetmetric-unit)
   * @param unit Used to support unit transformation such as milliseconds to seconds. 
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnFleetMetric {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
