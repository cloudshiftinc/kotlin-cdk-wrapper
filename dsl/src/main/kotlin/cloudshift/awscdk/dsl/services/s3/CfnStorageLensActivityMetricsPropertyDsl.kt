@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource enables Amazon S3 Storage Lens activity metrics.
 *
 * Activity metrics show details about how your storage is requested, such as requests (for example,
 * All requests, Get requests, Put requests), bytes uploaded or downloaded, and errors.
 *
 * For more information, see [Assessing your storage activity and usage with S3 Storage
 * Lens](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens.html) in the *Amazon S3
 * User Guide* . For a complete list of metrics, see [S3 Storage Lens metrics
 * glossary](https://docs.aws.amazon.com/AmazonS3/latest/userguide/storage_lens_metrics_glossary.html)
 * in the *Amazon S3 User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * ActivityMetricsProperty activityMetricsProperty = ActivityMetricsProperty.builder()
 * .isEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-activitymetrics.html)
 */
@CdkDslMarker
public class CfnStorageLensActivityMetricsPropertyDsl {
  private val cdkBuilder: CfnStorageLens.ActivityMetricsProperty.Builder =
      CfnStorageLens.ActivityMetricsProperty.builder()

  /**
   * @param isEnabled A property that indicates whether the activity metrics is enabled.
   */
  public fun isEnabled(isEnabled: Boolean) {
    cdkBuilder.isEnabled(isEnabled)
  }

  /**
   * @param isEnabled A property that indicates whether the activity metrics is enabled.
   */
  public fun isEnabled(isEnabled: IResolvable) {
    cdkBuilder.isEnabled(isEnabled)
  }

  public fun build(): CfnStorageLens.ActivityMetricsProperty = cdkBuilder.build()
}
