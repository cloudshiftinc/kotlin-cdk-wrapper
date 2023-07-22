@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutequipment

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

@CdkDslMarker
public class CfnInferenceSchedulerS3InputConfigurationPropertyDsl {
  private val cdkBuilder: CfnInferenceScheduler.S3InputConfigurationProperty.Builder =
      CfnInferenceScheduler.S3InputConfigurationProperty.builder()

  /**
   * @param bucket the value to be set. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * @param prefix the value to be set.
   */
  public fun prefix(prefix: String) {
    cdkBuilder.prefix(prefix)
  }

  public fun build(): CfnInferenceScheduler.S3InputConfigurationProperty = cdkBuilder.build()
}
