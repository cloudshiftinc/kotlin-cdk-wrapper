@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * The information required to deploy a Kinesis Data Analytics Studio notebook as an application
 * with durable state.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * DeployAsApplicationConfigurationProperty deployAsApplicationConfigurationProperty =
 * DeployAsApplicationConfigurationProperty.builder()
 * .s3ContentLocation(S3ContentBaseLocationProperty.builder()
 * .bucketArn("bucketArn")
 * // the properties below are optional
 * .basePath("basePath")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-deployasapplicationconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationDeployAsApplicationConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.DeployAsApplicationConfigurationProperty.Builder =
      CfnApplication.DeployAsApplicationConfigurationProperty.builder()

  /**
   * @param s3ContentLocation The description of an Amazon S3 object that contains the Amazon Data
   * Analytics application, including the Amazon Resource Name (ARN) of the S3 bucket, the name of the
   * Amazon S3 object that contains the data, and the version number of the Amazon S3 object that
   * contains the data. 
   */
  public fun s3ContentLocation(s3ContentLocation: IResolvable) {
    cdkBuilder.s3ContentLocation(s3ContentLocation)
  }

  /**
   * @param s3ContentLocation The description of an Amazon S3 object that contains the Amazon Data
   * Analytics application, including the Amazon Resource Name (ARN) of the S3 bucket, the name of the
   * Amazon S3 object that contains the data, and the version number of the Amazon S3 object that
   * contains the data. 
   */
  public fun s3ContentLocation(s3ContentLocation: CfnApplication.S3ContentBaseLocationProperty) {
    cdkBuilder.s3ContentLocation(s3ContentLocation)
  }

  public fun build(): CfnApplication.DeployAsApplicationConfigurationProperty = cdkBuilder.build()
}
