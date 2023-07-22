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
import software.amazon.awscdk.services.databrew.CfnProjectProps

@CdkDslMarker
public class CfnProjectPropsDsl {
  private val cdkBuilder: CfnProjectProps.Builder = CfnProjectProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param datasetName The dataset that the project is to act upon. 
   */
  public fun datasetName(datasetName: String) {
    cdkBuilder.datasetName(datasetName)
  }

  /**
   * @param name The unique name of a project. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param recipeName The name of a recipe that will be developed during a project session. 
   */
  public fun recipeName(recipeName: String) {
    cdkBuilder.recipeName(recipeName)
  }

  /**
   * @param roleArn The Amazon Resource Name (ARN) of the role that will be assumed for this
   * project. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * @param sample The sample size and sampling type to apply to the data.
   * If this parameter isn't specified, then the sample consists of the first 500 rows from the
   * dataset.
   */
  public fun sample(sample: IResolvable) {
    cdkBuilder.sample(sample)
  }

  /**
   * @param sample The sample size and sampling type to apply to the data.
   * If this parameter isn't specified, then the sample consists of the first 500 rows from the
   * dataset.
   */
  public fun sample(sample: CfnProject.SampleProperty) {
    cdkBuilder.sample(sample)
  }

  /**
   * @param tags Metadata tags that have been applied to the project.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Metadata tags that have been applied to the project.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnProjectProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
