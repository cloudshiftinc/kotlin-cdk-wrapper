@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.stepfunctions.tasks.AssembleWith
import software.amazon.awscdk.services.stepfunctions.tasks.TransformOutput

@CdkDslMarker
public class TransformOutputDsl {
  private val cdkBuilder: TransformOutput.Builder = TransformOutput.builder()

  /**
   * @param accept MIME type used to specify the output data.
   */
  public fun accept(accept: String) {
    cdkBuilder.accept(accept)
  }

  /**
   * @param assembleWith Defines how to assemble the results of the transform job as a single S3
   * object.
   */
  public fun assembleWith(assembleWith: AssembleWith) {
    cdkBuilder.assembleWith(assembleWith)
  }

  /**
   * @param encryptionKey AWS KMS key that Amazon SageMaker uses to encrypt the model artifacts at
   * rest using Amazon S3 server-side encryption.
   */
  public fun encryptionKey(encryptionKey: IKey) {
    cdkBuilder.encryptionKey(encryptionKey)
  }

  /**
   * @param s3OutputPath S3 path where you want Amazon SageMaker to store the results of the
   * transform job. 
   */
  public fun s3OutputPath(s3OutputPath: String) {
    cdkBuilder.s3OutputPath(s3OutputPath)
  }

  public fun build(): TransformOutput = cdkBuilder.build()
}
