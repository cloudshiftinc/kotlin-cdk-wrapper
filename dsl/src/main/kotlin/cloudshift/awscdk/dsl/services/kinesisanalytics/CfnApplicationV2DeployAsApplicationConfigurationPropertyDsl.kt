@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2DeployAsApplicationConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.DeployAsApplicationConfigurationProperty.Builder =
      CfnApplicationV2.DeployAsApplicationConfigurationProperty.builder()

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
  public fun s3ContentLocation(s3ContentLocation: CfnApplicationV2.S3ContentBaseLocationProperty) {
    cdkBuilder.s3ContentLocation(s3ContentLocation)
  }

  public fun build(): CfnApplicationV2.DeployAsApplicationConfigurationProperty = cdkBuilder.build()
}
