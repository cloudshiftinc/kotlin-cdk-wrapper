@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnBucket

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
