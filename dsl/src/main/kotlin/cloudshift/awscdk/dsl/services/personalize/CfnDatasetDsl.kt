@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.personalize

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.personalize.CfnDataset
import software.constructs.Construct

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
