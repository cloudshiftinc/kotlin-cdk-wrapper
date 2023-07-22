@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnDataset
import software.constructs.Construct

@CdkDslMarker
public class CfnDatasetDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDataset.Builder = CfnDataset.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The file format of a dataset that is created from an Amazon S3 file or folder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-format)
   * @param format The file format of a dataset that is created from an Amazon S3 file or folder. 
   */
  public fun format(format: String) {
    cdkBuilder.format(format)
  }

  /**
   * A set of options that define how DataBrew interprets the data in the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
   * @param formatOptions A set of options that define how DataBrew interprets the data in the
   * dataset. 
   */
  public fun formatOptions(formatOptions: IResolvable) {
    cdkBuilder.formatOptions(formatOptions)
  }

  /**
   * A set of options that define how DataBrew interprets the data in the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
   * @param formatOptions A set of options that define how DataBrew interprets the data in the
   * dataset. 
   */
  public fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty) {
    cdkBuilder.formatOptions(formatOptions)
  }

  /**
   * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or Amazon
   * S3 .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
   * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
   * Catalog or Amazon S3 . 
   */
  public fun input(input: IResolvable) {
    cdkBuilder.input(input)
  }

  /**
   * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or Amazon
   * S3 .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
   * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
   * Catalog or Amazon S3 . 
   */
  public fun input(input: CfnDataset.InputProperty) {
    cdkBuilder.input(input)
  }

  /**
   * The unique name of the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-name)
   * @param name The unique name of the dataset. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
   * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
   * the dataset. 
   */
  public fun pathOptions(pathOptions: IResolvable) {
    cdkBuilder.pathOptions(pathOptions)
  }

  /**
   * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
   * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
   * the dataset. 
   */
  public fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty) {
    cdkBuilder.pathOptions(pathOptions)
  }

  /**
   * Metadata tags that have been applied to the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-tags)
   * @param tags Metadata tags that have been applied to the dataset. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata tags that have been applied to the dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-tags)
   * @param tags Metadata tags that have been applied to the dataset. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDataset {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
