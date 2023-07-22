@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnStorageLens

/**
 * This resource enables Amazon S3 Storage Lens advanced data protection metrics.
 *
 * Advanced data protection metrics provide insights that you can use to perform audits and protect
 * your data, for example replication rule counts within and across Regions.
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
 * AdvancedDataProtectionMetricsProperty advancedDataProtectionMetricsProperty =
 * AdvancedDataProtectionMetricsProperty.builder()
 * .isEnabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-storagelens-advanceddataprotectionmetrics.html)
 */
@CdkDslMarker
public class CfnStorageLensAdvancedDataProtectionMetricsPropertyDsl {
  private val cdkBuilder: CfnStorageLens.AdvancedDataProtectionMetricsProperty.Builder =
      CfnStorageLens.AdvancedDataProtectionMetricsProperty.builder()

  /**
   * @param isEnabled Indicates whether advanced data protection metrics are enabled.
   */
  public fun isEnabled(isEnabled: Boolean) {
    cdkBuilder.isEnabled(isEnabled)
  }

  /**
   * @param isEnabled Indicates whether advanced data protection metrics are enabled.
   */
  public fun isEnabled(isEnabled: IResolvable) {
    cdkBuilder.isEnabled(isEnabled)
  }

  public fun build(): CfnStorageLens.AdvancedDataProtectionMetricsProperty = cdkBuilder.build()
}
