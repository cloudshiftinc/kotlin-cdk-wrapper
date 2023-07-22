@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.logs.CfnMetricFilter
import software.constructs.Construct

@CdkDslMarker
public class CfnMetricFilterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMetricFilter.Builder = CfnMetricFilter.Builder.create(scope, id)

  private val _metricTransformations: MutableList<Any> = mutableListOf()

  /**
   * The name of the metric filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-filtername)
   * @param filterName The name of the metric filter. 
   */
  public fun filterName(filterName: String) {
    cdkBuilder.filterName(filterName)
  }

  /**
   * A filter pattern for extracting metric data out of ingested log events.
   *
   * For more information, see [Filter and Pattern
   * Syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/FilterAndPatternSyntax.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-filterpattern)
   * @param filterPattern A filter pattern for extracting metric data out of ingested log events. 
   */
  public fun filterPattern(filterPattern: String) {
    cdkBuilder.filterPattern(filterPattern)
  }

  /**
   * The name of an existing log group that you want to associate with this metric filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-loggroupname)
   * @param logGroupName The name of an existing log group that you want to associate with this
   * metric filter. 
   */
  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  /**
   * The metric transformations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-metrictransformations)
   * @param metricTransformations The metric transformations. 
   */
  public fun metricTransformations(vararg metricTransformations: Any) {
    _metricTransformations.addAll(listOf(*metricTransformations))
  }

  /**
   * The metric transformations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-metrictransformations)
   * @param metricTransformations The metric transformations. 
   */
  public fun metricTransformations(metricTransformations: Collection<Any>) {
    _metricTransformations.addAll(metricTransformations)
  }

  /**
   * The metric transformations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-metricfilter.html#cfn-logs-metricfilter-metrictransformations)
   * @param metricTransformations The metric transformations. 
   */
  public fun metricTransformations(metricTransformations: IResolvable) {
    cdkBuilder.metricTransformations(metricTransformations)
  }

  public fun build(): CfnMetricFilter {
    if(_metricTransformations.isNotEmpty()) cdkBuilder.metricTransformations(_metricTransformations)
    return cdkBuilder.build()
  }
}
