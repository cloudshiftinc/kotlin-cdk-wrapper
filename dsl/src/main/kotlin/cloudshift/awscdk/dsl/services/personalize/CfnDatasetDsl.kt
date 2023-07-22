@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnDataset
import software.constructs.Construct

/**
 * Creates an empty dataset and adds it to the specified dataset group.
 *
 * Use
 * [CreateDatasetImportJob](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetImportJob.html)
 * to import your training data to a dataset.
 *
 * There are three types of datasets:
 *
 * * Interactions
 * * Items
 * * Users
 *
 * Each dataset type has an associated schema with required field types. Only the `Interactions`
 * dataset is required in order to train a model (also referred to as creating a solution).
 *
 * A dataset can be in one of the following states:
 *
 * * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
 * * DELETE PENDING &gt; DELETE IN_PROGRESS
 *
 * To get the status of the dataset, call
 * [DescribeDataset](https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDataset.html) .
 *
 * **Related APIs** -
 * [CreateDatasetGroup](https://docs.aws.amazon.com/personalize/latest/dg/API_CreateDatasetGroup.html)
 *
 * * [ListDatasets](https://docs.aws.amazon.com/personalize/latest/dg/API_ListDatasets.html)
 * * [DescribeDataset](https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeDataset.html)
 * * [DeleteDataset](https://docs.aws.amazon.com/personalize/latest/dg/API_DeleteDataset.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.personalize.*;
 * Object dataSource;
 * CfnDataset cfnDataset = CfnDataset.Builder.create(this, "MyCfnDataset")
 * .datasetGroupArn("datasetGroupArn")
 * .datasetType("datasetType")
 * .name("name")
 * .schemaArn("schemaArn")
 * // the properties below are optional
 * .datasetImportJob(DatasetImportJobProperty.builder()
 * .datasetArn("datasetArn")
 * .datasetImportJobArn("datasetImportJobArn")
 * .dataSource(dataSource)
 * .jobName("jobName")
 * .roleArn("roleArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html)
 */
@CdkDslMarker
public class CfnDatasetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataset.Builder = CfnDataset.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the dataset group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetgrouparn)
   * @param datasetGroupArn The Amazon Resource Name (ARN) of the dataset group. 
   */
  public fun datasetGroupArn(datasetGroupArn: String) {
    cdkBuilder.datasetGroupArn(datasetGroupArn)
  }

  /**
   * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
   * Personalize dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetimportjob)
   * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
   * S3 bucket) to an Amazon Personalize dataset. 
   */
  public fun datasetImportJob(datasetImportJob: IResolvable) {
    cdkBuilder.datasetImportJob(datasetImportJob)
  }

  /**
   * Describes a job that imports training data from a data source (Amazon S3 bucket) to an Amazon
   * Personalize dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasetimportjob)
   * @param datasetImportJob Describes a job that imports training data from a data source (Amazon
   * S3 bucket) to an Amazon Personalize dataset. 
   */
  public fun datasetImportJob(datasetImportJob: CfnDataset.DatasetImportJobProperty) {
    cdkBuilder.datasetImportJob(datasetImportJob)
  }

  /**
   * One of the following values:.
   *
   * * Interactions
   * * Items
   * * Users
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-datasettype)
   * @param datasetType One of the following values:. 
   */
  public fun datasetType(datasetType: String) {
    cdkBuilder.datasetType(datasetType)
  }

  /**
   * The name of the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-name)
   * @param name The name of the dataset. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The ARN of the associated schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-dataset.html#cfn-personalize-dataset-schemaarn)
   * @param schemaArn The ARN of the associated schema. 
   */
  public fun schemaArn(schemaArn: String) {
    cdkBuilder.schemaArn(schemaArn)
  }

  public fun build(): CfnDataset = cdkBuilder.build()
}
