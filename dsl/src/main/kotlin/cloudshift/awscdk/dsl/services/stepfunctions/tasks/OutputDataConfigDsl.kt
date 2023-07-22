@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.tasks.OutputDataConfig
import software.amazon.awscdk.services.stepfunctions.tasks.S3Location

@CdkDslMarker
public class OutputDataConfigDsl {
  private val cdkBuilder: OutputDataConfig.Builder = OutputDataConfig.builder()

  /**
   * @param encryptionKey Optional KMS encryption key that Amazon SageMaker uses to encrypt the
   * model artifacts at rest using Amazon S3 server-side encryption.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param s3OutputLocation Identifies the S3 path where you want Amazon SageMaker to store the
   * model artifacts. 
   */
  public fun s3OutputLocation(s3OutputLocation: S3Location) {
    cdkBuilder.s3OutputLocation(s3OutputLocation)
  }

  public fun build(): OutputDataConfig = cdkBuilder.build()
}
