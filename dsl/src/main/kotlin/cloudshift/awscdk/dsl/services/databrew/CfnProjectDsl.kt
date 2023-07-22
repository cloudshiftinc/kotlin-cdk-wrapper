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
import software.amazon.awscdk.services.databrew.CfnProject
import software.constructs.Construct

@CdkDslMarker
public class CfnProjectDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The dataset that the project is to act upon.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-datasetname)
   * @param datasetName The dataset that the project is to act upon. 
   */
  public fun datasetName(datasetName: String) {
    cdkBuilder.datasetName(datasetName)
  }

  /**
   * The unique name of a project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-name)
   * @param name The unique name of a project. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The name of a recipe that will be developed during a project session.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-recipename)
   * @param recipeName The name of a recipe that will be developed during a project session. 
   */
  public fun recipeName(recipeName: String) {
    cdkBuilder.recipeName(recipeName)
  }

  /**
   * The Amazon Resource Name (ARN) of the role that will be assumed for this project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-rolearn)
   * @param roleArn The Amazon Resource Name (ARN) of the role that will be assumed for this
   * project. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * The sample size and sampling type to apply to the data.
   *
   * If this parameter isn't specified, then the sample consists of the first 500 rows from the
   * dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-sample)
   * @param sample The sample size and sampling type to apply to the data. 
   */
  public fun sample(sample: IResolvable) {
    cdkBuilder.sample(sample)
  }

  /**
   * The sample size and sampling type to apply to the data.
   *
   * If this parameter isn't specified, then the sample consists of the first 500 rows from the
   * dataset.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-sample)
   * @param sample The sample size and sampling type to apply to the data. 
   */
  public fun sample(sample: CfnProject.SampleProperty) {
    cdkBuilder.sample(sample)
  }

  /**
   * Metadata tags that have been applied to the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-tags)
   * @param tags Metadata tags that have been applied to the project. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Metadata tags that have been applied to the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-project.html#cfn-databrew-project-tags)
   * @param tags Metadata tags that have been applied to the project. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnProject {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
