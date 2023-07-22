@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudtrail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudtrail.S3EventSelector
import software.amazon.awscdk.services.s3.IBucket

/**
 * Selecting an S3 bucket and an optional prefix to be logged for data events.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudtrail.*;
 * import software.amazon.awscdk.services.s3.*;
 * Bucket bucket;
 * S3EventSelector s3EventSelector = S3EventSelector.builder()
 * .bucket(bucket)
 * // the properties below are optional
 * .objectPrefix("objectPrefix")
 * .build();
 * ```
 */
@CdkDslMarker
public class S3EventSelectorDsl {
  private val cdkBuilder: S3EventSelector.Builder = S3EventSelector.builder()

  /**
   * @param bucket S3 bucket. 
   */
  public fun bucket(bucket: IBucket) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param objectPrefix Data events for objects whose key matches this prefix will be logged.
   */
  public fun objectPrefix(objectPrefix: String) {
    cdkBuilder.objectPrefix(objectPrefix)
  }

  public fun build(): S3EventSelector = cdkBuilder.build()
}
