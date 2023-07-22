@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

/**
 * Specifies a metrics configuration for the CloudWatch request metrics (specified by the metrics
 * configuration ID) from an Amazon S3 bucket.
 *
 * If you're updating an existing metrics configuration, note that this is a full replacement of the
 * existing metrics configuration. If you don't include the elements you want to keep, they are erased.
 * For examples, see
 * [AWS::S3::Bucket](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket.html#aws-properties-s3-bucket--examples)
 * . For more information, see [PUT Bucket
 * metrics](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTMetricConfiguration.html) in
 * the *Amazon S3 API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * MetricsConfigurationProperty metricsConfigurationProperty =
 * MetricsConfigurationProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .accessPointArn("accessPointArn")
 * .prefix("prefix")
 * .tagFilters(List.of(TagFilterProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metricsconfiguration.html)
 */
@CdkDslMarker
public class CfnBucketMetricsConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.MetricsConfigurationProperty.Builder =
      CfnBucket.MetricsConfigurationProperty.builder()

  private val _tagFilters: MutableList<Any> = mutableListOf()

  /**
   * @param accessPointArn The access point that was used while performing operations on the object.
   * The metrics configuration only includes objects that meet the filter's criteria.
   */
  public fun accessPointArn(accessPointArn: String) {
    cdkBuilder.accessPointArn(accessPointArn)
  }

  /**
   * @param id The ID used to identify the metrics configuration. 
   * This can be any value you choose that helps you identify your metrics configuration.
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param prefix The prefix that an object must have to be included in the metrics results.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
   * The metrics configuration includes only objects that meet the filter's criteria.
   */
  public fun tagFilters(vararg tagFilters: Any) {
    _tagFilters.addAll(listOf(*tagFilters))
  }

  /**
   * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
   * The metrics configuration includes only objects that meet the filter's criteria.
   */
  public fun tagFilters(tagFilters: Collection<Any>) {
    _tagFilters.addAll(tagFilters)
  }

  /**
   * @param tagFilters Specifies a list of tag filters to use as a metrics configuration filter.
   * The metrics configuration includes only objects that meet the filter's criteria.
   */
  public fun tagFilters(tagFilters: IResolvable) {
    cdkBuilder.tagFilters(tagFilters)
  }

  public fun build(): CfnBucket.MetricsConfigurationProperty {
    if(_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
    return cdkBuilder.build()
  }
}
