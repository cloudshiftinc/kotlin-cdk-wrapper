@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource
import software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource

/**
 * S3 location of the input data that the model can consume.
 *
 * Example:
 *
 * ```
 * SageMakerCreateTransformJob.Builder.create(this, "Batch Inference")
 * .transformJobName("MyTransformJob")
 * .modelName("MyModelName")
 * .modelClientOptions(ModelClientOptions.builder()
 * .invocationsMaxRetries(3) // default is 0
 * .invocationsTimeout(Duration.minutes(5))
 * .build())
 * .transformInput(TransformInput.builder()
 * .transformDataSource(TransformDataSource.builder()
 * .s3DataSource(TransformS3DataSource.builder()
 * .s3Uri("s3://inputbucket/train")
 * .s3DataType(S3DataType.S3_PREFIX)
 * .build())
 * .build())
 * .build())
 * .transformOutput(TransformOutput.builder()
 * .s3OutputPath("s3://outputbucket/TransformJobOutputPath")
 * .build())
 * .transformResources(TransformResources.builder()
 * .instanceCount(1)
 * .instanceType(InstanceType.of(InstanceClass.M4, InstanceSize.XLARGE))
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class TransformDataSourceDsl {
  private val cdkBuilder: TransformDataSource.Builder = TransformDataSource.builder()

  /**
   * @param s3DataSource S3 location of the input data. 
   */
  public fun s3DataSource(s3DataSource: TransformS3DataSourceDsl.() -> Unit = {}) {
    val builder = TransformS3DataSourceDsl()
    builder.apply(s3DataSource)
    cdkBuilder.s3DataSource(builder.build())
  }

  /**
   * @param s3DataSource S3 location of the input data. 
   */
  public fun s3DataSource(s3DataSource: TransformS3DataSource) {
    cdkBuilder.s3DataSource(s3DataSource)
  }

  public fun build(): TransformDataSource = cdkBuilder.build()
}
