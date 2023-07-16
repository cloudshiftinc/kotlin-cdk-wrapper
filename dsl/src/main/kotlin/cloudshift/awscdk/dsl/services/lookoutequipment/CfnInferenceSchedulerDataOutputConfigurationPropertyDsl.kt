@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lookoutequipment

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutequipment.CfnInferenceScheduler

@CdkDslMarker
public class CfnInferenceSchedulerDataOutputConfigurationPropertyDsl {
  private val cdkBuilder: CfnInferenceScheduler.DataOutputConfigurationProperty.Builder =
      CfnInferenceScheduler.DataOutputConfigurationProperty.builder()

  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  public fun s3OutputConfiguration(s3OutputConfiguration: IResolvable) {
    cdkBuilder.s3OutputConfiguration(s3OutputConfiguration)
  }

  public
      fun s3OutputConfiguration(s3OutputConfiguration: CfnInferenceScheduler.S3OutputConfigurationProperty) {
    cdkBuilder.s3OutputConfiguration(s3OutputConfiguration)
  }

  public fun build(): CfnInferenceScheduler.DataOutputConfigurationProperty = cdkBuilder.build()
}
