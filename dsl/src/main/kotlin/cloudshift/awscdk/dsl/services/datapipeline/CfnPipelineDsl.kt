@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.datapipeline.CfnPipeline
import software.constructs.Construct

@CdkDslMarker
public class CfnPipelineDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnPipeline.Builder = CfnPipeline.Builder.create(scope, id)

  private val _parameterObjects: MutableList<Any> = mutableListOf()

  private val _parameterValues: MutableList<Any> = mutableListOf()

  private val _pipelineObjects: MutableList<Any> = mutableListOf()

  private val _pipelineTags: MutableList<Any> = mutableListOf()

  /**
   * Indicates whether to validate and start the pipeline or stop an active pipeline.
   *
   * By default, the value is set to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate)
   * @param activate Indicates whether to validate and start the pipeline or stop an active
   * pipeline. 
   */
  public fun activate(activate: Boolean) {
    cdkBuilder.activate(activate)
  }

  /**
   * Indicates whether to validate and start the pipeline or stop an active pipeline.
   *
   * By default, the value is set to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-activate)
   * @param activate Indicates whether to validate and start the pipeline or stop an active
   * pipeline. 
   */
  public fun activate(activate: IResolvable) {
    cdkBuilder.activate(activate)
  }

  /**
   * A description of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-description)
   * @param description A description of the pipeline. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-name)
   * @param name The name of the pipeline. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The parameter objects used with the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
   * @param parameterObjects The parameter objects used with the pipeline. 
   */
  public fun parameterObjects(vararg parameterObjects: Any) {
    _parameterObjects.addAll(listOf(*parameterObjects))
  }

  /**
   * The parameter objects used with the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
   * @param parameterObjects The parameter objects used with the pipeline. 
   */
  public fun parameterObjects(parameterObjects: Collection<Any>) {
    _parameterObjects.addAll(parameterObjects)
  }

  /**
   * The parameter objects used with the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parameterobjects)
   * @param parameterObjects The parameter objects used with the pipeline. 
   */
  public fun parameterObjects(parameterObjects: IResolvable) {
    cdkBuilder.parameterObjects(parameterObjects)
  }

  /**
   * The parameter values used with the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
   * @param parameterValues The parameter values used with the pipeline. 
   */
  public fun parameterValues(vararg parameterValues: Any) {
    _parameterValues.addAll(listOf(*parameterValues))
  }

  /**
   * The parameter values used with the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
   * @param parameterValues The parameter values used with the pipeline. 
   */
  public fun parameterValues(parameterValues: Collection<Any>) {
    _parameterValues.addAll(parameterValues)
  }

  /**
   * The parameter values used with the pipeline.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-parametervalues)
   * @param parameterValues The parameter values used with the pipeline. 
   */
  public fun parameterValues(parameterValues: IResolvable) {
    cdkBuilder.parameterValues(parameterValues)
  }

  /**
   * The objects that define the pipeline.
   *
   * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
   * can be updated. For information about restrictions, see [Editing Your
   * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
   * in the *AWS Data Pipeline Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
   * @param pipelineObjects The objects that define the pipeline. 
   */
  public fun pipelineObjects(vararg pipelineObjects: Any) {
    _pipelineObjects.addAll(listOf(*pipelineObjects))
  }

  /**
   * The objects that define the pipeline.
   *
   * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
   * can be updated. For information about restrictions, see [Editing Your
   * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
   * in the *AWS Data Pipeline Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
   * @param pipelineObjects The objects that define the pipeline. 
   */
  public fun pipelineObjects(pipelineObjects: Collection<Any>) {
    _pipelineObjects.addAll(pipelineObjects)
  }

  /**
   * The objects that define the pipeline.
   *
   * These objects overwrite the existing pipeline definition. Not all objects, fields, and values
   * can be updated. For information about restrictions, see [Editing Your
   * Pipeline](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-manage-pipeline-modify-console.html)
   * in the *AWS Data Pipeline Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelineobjects)
   * @param pipelineObjects The objects that define the pipeline. 
   */
  public fun pipelineObjects(pipelineObjects: IResolvable) {
    cdkBuilder.pipelineObjects(pipelineObjects)
  }

  /**
   * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use to
   * control permissions.
   *
   * For more information, see [Controlling Access to Pipelines and
   * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
   * in the *AWS Data Pipeline Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
   * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the pipeline,
   * which you can use to control permissions. 
   */
  public fun pipelineTags(vararg pipelineTags: Any) {
    _pipelineTags.addAll(listOf(*pipelineTags))
  }

  /**
   * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use to
   * control permissions.
   *
   * For more information, see [Controlling Access to Pipelines and
   * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
   * in the *AWS Data Pipeline Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
   * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the pipeline,
   * which you can use to control permissions. 
   */
  public fun pipelineTags(pipelineTags: Collection<Any>) {
    _pipelineTags.addAll(pipelineTags)
  }

  /**
   * A list of arbitrary tags (key-value pairs) to associate with the pipeline, which you can use to
   * control permissions.
   *
   * For more information, see [Controlling Access to Pipelines and
   * Resources](https://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-control-access.html)
   * in the *AWS Data Pipeline Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datapipeline-pipeline.html#cfn-datapipeline-pipeline-pipelinetags)
   * @param pipelineTags A list of arbitrary tags (key-value pairs) to associate with the pipeline,
   * which you can use to control permissions. 
   */
  public fun pipelineTags(pipelineTags: IResolvable) {
    cdkBuilder.pipelineTags(pipelineTags)
  }

  public fun build(): CfnPipeline {
    if(_parameterObjects.isNotEmpty()) cdkBuilder.parameterObjects(_parameterObjects)
    if(_parameterValues.isNotEmpty()) cdkBuilder.parameterValues(_parameterValues)
    if(_pipelineObjects.isNotEmpty()) cdkBuilder.pipelineObjects(_pipelineObjects)
    if(_pipelineTags.isNotEmpty()) cdkBuilder.pipelineTags(_pipelineTags)
    return cdkBuilder.build()
  }
}
