@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutequipment

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

@CdkDslMarker
public class CfnInferenceSchedulerDataInputConfigurationPropertyDsl {
  private val cdkBuilder: CfnInferenceScheduler.DataInputConfigurationProperty.Builder =
      CfnInferenceScheduler.DataInputConfigurationProperty.builder()

  public fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: IResolvable) {
    cdkBuilder.inferenceInputNameConfiguration(inferenceInputNameConfiguration)
  }

  public
      fun inferenceInputNameConfiguration(inferenceInputNameConfiguration: CfnInferenceScheduler.InputNameConfigurationProperty) {
    cdkBuilder.inferenceInputNameConfiguration(inferenceInputNameConfiguration)
  }

  public fun inputTimeZoneOffset(inputTimeZoneOffset: String) {
    cdkBuilder.inputTimeZoneOffset(inputTimeZoneOffset)
  }

  public fun s3InputConfiguration(s3InputConfiguration: IResolvable) {
    cdkBuilder.s3InputConfiguration(s3InputConfiguration)
  }

  public
      fun s3InputConfiguration(s3InputConfiguration: CfnInferenceScheduler.S3InputConfigurationProperty) {
    cdkBuilder.s3InputConfiguration(s3InputConfiguration)
  }

  public fun build(): CfnInferenceScheduler.DataInputConfigurationProperty = cdkBuilder.build()
}
