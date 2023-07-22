@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnBucket

@CdkDslMarker
public class CfnBucketAccelerateConfigurationPropertyDsl {
  private val cdkBuilder: CfnBucket.AccelerateConfigurationProperty.Builder =
      CfnBucket.AccelerateConfigurationProperty.builder()

  /**
   * @param accelerationStatus Specifies the transfer acceleration status of the bucket. 
   */
  public fun accelerationStatus(accelerationStatus: String) {
    cdkBuilder.accelerationStatus(accelerationStatus)
  }

  public fun build(): CfnBucket.AccelerateConfigurationProperty = cdkBuilder.build()
}
