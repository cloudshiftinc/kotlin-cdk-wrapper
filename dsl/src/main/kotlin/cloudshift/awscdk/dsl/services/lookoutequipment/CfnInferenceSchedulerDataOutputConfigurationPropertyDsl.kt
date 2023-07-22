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

  /**
   * @param kmsKeyId The ID number for the AWS KMS key used to encrypt the inference output.
   */
  public fun kmsKeyId(kmsKeyId: String) {
    cdkBuilder.kmsKeyId(kmsKeyId)
  }

  /**
   * @param s3OutputConfiguration Specifies configuration information for the output results from
   * the inference, including output S3 location. 
   */
  public fun s3OutputConfiguration(s3OutputConfiguration: IResolvable) {
    cdkBuilder.s3OutputConfiguration(s3OutputConfiguration)
  }

  /**
   * @param s3OutputConfiguration Specifies configuration information for the output results from
   * the inference, including output S3 location. 
   */
  public
      fun s3OutputConfiguration(s3OutputConfiguration: CfnInferenceScheduler.S3OutputConfigurationProperty) {
    cdkBuilder.s3OutputConfiguration(s3OutputConfiguration)
  }

  public fun build(): CfnInferenceScheduler.DataOutputConfigurationProperty = cdkBuilder.build()
}
