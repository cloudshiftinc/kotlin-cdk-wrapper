@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

/**
 * Details about the metrics source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * MetricsSourceProperty metricsSourceProperty = MetricsSourceProperty.builder()
 * .contentType("contentType")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .contentDigest("contentDigest")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelpackage-metricssource.html)
 */
@CdkDslMarker
public class CfnModelPackageMetricsSourcePropertyDsl {
  private val cdkBuilder: CfnModelPackage.MetricsSourceProperty.Builder =
      CfnModelPackage.MetricsSourceProperty.builder()

  /**
   * @param contentDigest The hash key used for the metrics source.
   */
  public fun contentDigest(contentDigest: String) {
    cdkBuilder.contentDigest(contentDigest)
  }

  /**
   * @param contentType The metric source content type. 
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param s3Uri The S3 URI for the metrics source. 
   */
  public fun s3Uri(s3Uri: String) {
    cdkBuilder.s3Uri(s3Uri)
  }

  public fun build(): CfnModelPackage.MetricsSourceProperty = cdkBuilder.build()
}
