@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.s3outposts.CfnBucket

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3outposts.*;
 * FilterAndOperatorProperty filterAndOperatorProperty = FilterAndOperatorProperty.builder()
 * .tags(List.of(FilterTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * // the properties below are optional
 * .prefix("prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filterandoperator.html)
 */
@CdkDslMarker
public class CfnBucketFilterAndOperatorPropertyDsl {
  private val cdkBuilder: CfnBucket.FilterAndOperatorProperty.Builder =
      CfnBucket.FilterAndOperatorProperty.builder()

  private val _tags: MutableList<CfnBucket.FilterTagProperty> = mutableListOf()

  /**
   * @param prefix the value to be set.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  /**
   * @param tags the value to be set. 
   */
  public fun tags(tags: CfnBucketFilterTagPropertyDsl.() -> Unit) {
    _tags.add(CfnBucketFilterTagPropertyDsl().apply(tags).build())
  }

  /**
   * @param tags the value to be set. 
   */
  public fun tags(tags: Collection<CfnBucket.FilterTagProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnBucket.FilterAndOperatorProperty {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
