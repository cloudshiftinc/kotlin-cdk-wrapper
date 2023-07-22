@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration

@CdkDslMarker
public class CfnLoggingConfigurationS3DestinationConfigurationPropertyDsl {
  private val cdkBuilder: CfnLoggingConfiguration.S3DestinationConfigurationProperty.Builder =
      CfnLoggingConfiguration.S3DestinationConfigurationProperty.builder()

  /**
   * @param bucketName Name of the Amazon S3 bucket where chat activity will be logged. 
   */
  public fun bucketName(bucketName: String) {
    cdkBuilder.bucketName(bucketName)
  }

  public fun build(): CfnLoggingConfiguration.S3DestinationConfigurationProperty =
      cdkBuilder.build()
}
