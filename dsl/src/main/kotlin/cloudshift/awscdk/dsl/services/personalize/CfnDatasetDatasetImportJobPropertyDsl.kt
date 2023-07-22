@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.personalize.CfnDataset

@CdkDslMarker
public class CfnDatasetDatasetImportJobPropertyDsl {
  private val cdkBuilder: CfnDataset.DatasetImportJobProperty.Builder =
      CfnDataset.DatasetImportJobProperty.builder()

  /**
   * @param dataSource The Amazon S3 bucket that contains the training data to import.
   */
  public fun dataSource(dataSource: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(dataSource)
    cdkBuilder.dataSource(builder.map)
  }

  /**
   * @param dataSource The Amazon S3 bucket that contains the training data to import.
   */
  public fun dataSource(dataSource: Any) {
    cdkBuilder.dataSource(dataSource)
  }

  /**
   * @param datasetArn The Amazon Resource Name (ARN) of the dataset that receives the imported
   * data.
   */
  public fun datasetArn(datasetArn: String) {
    cdkBuilder.datasetArn(datasetArn)
  }

  /**
   * @param datasetImportJobArn The ARN of the dataset import job.
   */
  public fun datasetImportJobArn(datasetImportJobArn: String) {
    cdkBuilder.datasetImportJobArn(datasetImportJobArn)
  }

  /**
   * @param jobName The name of the import job.
   */
  public fun jobName(jobName: String) {
    cdkBuilder.jobName(jobName)
  }

  /**
   * @param roleArn The ARN of the IAM role that has permissions to read from the Amazon S3 data
   * source.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnDataset.DatasetImportJobProperty = cdkBuilder.build()
}
