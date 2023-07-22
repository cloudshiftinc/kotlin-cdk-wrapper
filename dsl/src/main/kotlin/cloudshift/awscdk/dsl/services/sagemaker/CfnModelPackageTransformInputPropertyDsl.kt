@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageTransformInputPropertyDsl {
  private val cdkBuilder: CfnModelPackage.TransformInputProperty.Builder =
      CfnModelPackage.TransformInputProperty.builder()

  /**
   * @param compressionType If your transform data is compressed, specify the compression type.
   * Amazon SageMaker automatically decompresses the data for the transform job accordingly. The
   * default value is `None` .
   */
  public fun compressionType(compressionType: String) {
    cdkBuilder.compressionType(compressionType)
  }

  /**
   * @param contentType The multipurpose internet mail extension (MIME) type of the data.
   * Amazon SageMaker uses the MIME type with each http call to transfer data to the transform job.
   */
  public fun contentType(contentType: String) {
    cdkBuilder.contentType(contentType)
  }

  /**
   * @param dataSource Describes the location of the channel data, which is, the S3 location of the
   * input data that the model can consume. 
   */
  public fun dataSource(dataSource: IResolvable) {
    cdkBuilder.dataSource(dataSource)
  }

  /**
   * @param dataSource Describes the location of the channel data, which is, the S3 location of the
   * input data that the model can consume. 
   */
  public fun dataSource(dataSource: CfnModelPackage.DataSourceProperty) {
    cdkBuilder.dataSource(dataSource)
  }

  /**
   * @param splitType The method to use to split the transform job's data files into smaller
   * batches.
   * Splitting is necessary when the total size of each object is too large to fit in a single
   * request. You can also use data splitting to improve performance by processing multiple concurrent
   * mini-batches. The default value for `SplitType` is `None` , which indicates that input data files
   * are not split, and request payloads contain the entire contents of an input object. Set the value
   * of this parameter to `Line` to split records on a newline character boundary. `SplitType` also
   * supports a number of record-oriented binary data formats. Currently, the supported record formats
   * are:
   *
   * * RecordIO
   * * TFRecord
   *
   * When splitting is enabled, the size of a mini-batch depends on the values of the
   * `BatchStrategy` and `MaxPayloadInMB` parameters. When the value of `BatchStrategy` is
   * `MultiRecord` , Amazon SageMaker sends the maximum number of records in each request, up to the
   * `MaxPayloadInMB` limit. If the value of `BatchStrategy` is `SingleRecord` , Amazon SageMaker sends
   * individual records in each request.
   *
   *
   * Some data formats represent a record as a binary payload wrapped with extra padding bytes. When
   * splitting is applied to a binary data format, padding is removed if the value of `BatchStrategy`
   * is set to `SingleRecord` . Padding is not removed if the value of `BatchStrategy` is set to
   * `MultiRecord` .
   *
   * For more information about `RecordIO` , see [Create a Dataset Using
   * RecordIO](https://docs.aws.amazon.com/https://mxnet.apache.org/api/faq/recordio) in the MXNet
   * documentation. For more information about `TFRecord` , see [Consuming TFRecord
   * data](https://docs.aws.amazon.com/https://www.tensorflow.org/guide/data#consuming_tfrecord_data)
   * in the TensorFlow documentation.
   */
  public fun splitType(splitType: String) {
    cdkBuilder.splitType(splitType)
  }

  public fun build(): CfnModelPackage.TransformInputProperty = cdkBuilder.build()
}
