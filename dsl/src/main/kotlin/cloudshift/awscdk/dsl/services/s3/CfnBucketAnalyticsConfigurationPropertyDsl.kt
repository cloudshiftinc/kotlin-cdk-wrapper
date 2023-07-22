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
public class CfnBucketAnalyticsConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.AnalyticsConfigurationProperty.Builder =
      CfnBucket.AnalyticsConfigurationProperty.builder()

  private val _tagFilters: MutableList<Any> = mutableListOf()

  /**
   * @param id The ID that identifies the analytics configuration. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param prefix The prefix that an object must have to be included in the analytics results.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param storageClassAnalysis Contains data related to access patterns to be collected and made
   * available to analyze the tradeoffs between different storage classes. 
   */
  public fun storageClassAnalysis(storageClassAnalysis: IResolvable) {
    cdkBuilder.storageClassAnalysis(storageClassAnalysis)
  }

  /**
   * @param storageClassAnalysis Contains data related to access patterns to be collected and made
   * available to analyze the tradeoffs between different storage classes. 
   */
  public fun storageClassAnalysis(storageClassAnalysis: CfnBucket.StorageClassAnalysisProperty) {
    cdkBuilder.storageClassAnalysis(storageClassAnalysis)
  }

  /**
   * @param tagFilters The tags to use when evaluating an analytics filter.
   * The analytics only includes objects that meet the filter's criteria. If no filter is specified,
   * all of the contents of the bucket are included in the analysis.
   */
  public fun tagFilters(vararg tagFilters: Any) {
    _tagFilters.addAll(listOf(*tagFilters))
  }

  /**
   * @param tagFilters The tags to use when evaluating an analytics filter.
   * The analytics only includes objects that meet the filter's criteria. If no filter is specified,
   * all of the contents of the bucket are included in the analysis.
   */
  public fun tagFilters(tagFilters: Collection<Any>) {
    _tagFilters.addAll(tagFilters)
  }

  /**
   * @param tagFilters The tags to use when evaluating an analytics filter.
   * The analytics only includes objects that meet the filter's criteria. If no filter is specified,
   * all of the contents of the bucket are included in the analysis.
   */
  public fun tagFilters(tagFilters: IResolvable) {
    cdkBuilder.tagFilters(tagFilters)
  }

  public fun build(): CfnBucket.AnalyticsConfigurationProperty {
    if(_tagFilters.isNotEmpty()) cdkBuilder.tagFilters(_tagFilters)
    return cdkBuilder.build()
  }
}
