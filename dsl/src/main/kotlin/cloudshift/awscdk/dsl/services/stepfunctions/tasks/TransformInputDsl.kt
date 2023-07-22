@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.CompressionType
import software.amazon.awscdk.services.stepfunctions.tasks.SplitType
import software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource
import software.amazon.awscdk.services.stepfunctions.tasks.TransformInput

/**
 * Dataset to be transformed and the Amazon S3 location where it is stored.
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
public class TransformInputDsl {
  private val cdkBuilder: TransformInput.Builder = TransformInput.builder()

  /**
   * @param compressionType The compression type of the transform data.
   */
  public fun compressionType(compressionType: CompressionType) {
    cdkBuilder.compressionType(compressionType)
  }

  /**
   * @param contentType Multipurpose internet mail extension (MIME) type of the data.
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param splitType Method to use to split the transform job's data files into smaller batches.
   */
  public fun splitType(splitType: SplitType) {
    cdkBuilder.splitType(splitType)
  }

  /**
   * @param transformDataSource S3 location of the channel data. 
   */
  public fun transformDataSource(transformDataSource: TransformDataSourceDsl.() -> Unit = {}) {
    val builder = TransformDataSourceDsl()
    builder.apply(transformDataSource)
    cdkBuilder.transformDataSource(builder.build())
  }

  /**
   * @param transformDataSource S3 location of the channel data. 
   */
  public fun transformDataSource(transformDataSource: TransformDataSource) {
    cdkBuilder.transformDataSource(transformDataSource)
  }

  public fun build(): TransformInput = cdkBuilder.build()
}
