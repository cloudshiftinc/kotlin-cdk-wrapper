@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3outposts.CfnBucket

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3outposts.*;
 * FilterTagProperty filterTagProperty = FilterTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-bucket-filtertag.html)
 */
@CdkDslMarker
public class CfnBucketFilterTagPropertyDsl {
  private val cdkBuilder: CfnBucket.FilterTagProperty.Builder =
      CfnBucket.FilterTagProperty.builder()

  /**
   * @param key the value to be set. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value the value to be set. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnBucket.FilterTagProperty = cdkBuilder.build()
}
