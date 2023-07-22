@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.sagemaker.CfnPipeline
import software.constructs.Construct

@CdkDslMarker
public class CfnPipelineDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPipeline.Builder = CfnPipeline.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-parallelismconfiguration)
   * @param parallelismConfiguration 
   */
  public fun parallelismConfiguration(parallelismConfiguration: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parallelismConfiguration)
    cdkBuilder.parallelismConfiguration(builder.map)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-parallelismconfiguration)
   * @param parallelismConfiguration 
   */
  public fun parallelismConfiguration(parallelismConfiguration: Any) {
    cdkBuilder.parallelismConfiguration(parallelismConfiguration)
  }

  /**
   * The definition of the pipeline.
   *
   * This can be either a JSON string or an Amazon S3 location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedefinition)
   * @param pipelineDefinition The definition of the pipeline. 
   */
  public fun pipelineDefinition(pipelineDefinition: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(pipelineDefinition)
    cdkBuilder.pipelineDefinition(builder.map)
  }

  /**
   * The definition of the pipeline.
   *
   * This can be either a JSON string or an Amazon S3 location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedefinition)
   * @param pipelineDefinition The definition of the pipeline. 
   */
  public fun pipelineDefinition(pipelineDefinition: Any) {
    cdkBuilder.pipelineDefinition(pipelineDefinition)
  }

  /**
   * The description of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedescription)
   * @param pipelineDescription The description of the pipeline. 
   */
  public fun pipelineDescription(pipelineDescription: String) {
    cdkBuilder.pipelineDescription(pipelineDescription)
  }

  /**
   * The display name of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinedisplayname)
   * @param pipelineDisplayName The display name of the pipeline. 
   */
  public fun pipelineDisplayName(pipelineDisplayName: String) {
    cdkBuilder.pipelineDisplayName(pipelineDisplayName)
  }

  /**
   * The name of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-pipelinename)
   * @param pipelineName The name of the pipeline. 
   */
  public fun pipelineName(pipelineName: String) {
    cdkBuilder.pipelineName(pipelineName)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-rolearn)
   * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  /**
   * The tags of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-tags)
   * @param tags The tags of the pipeline. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html#cfn-sagemaker-pipeline-tags)
   * @param tags The tags of the pipeline. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPipeline {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
