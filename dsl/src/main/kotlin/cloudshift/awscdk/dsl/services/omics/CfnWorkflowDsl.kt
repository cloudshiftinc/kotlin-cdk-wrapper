@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.omics.CfnWorkflow
import software.constructs.Construct

@CdkDslMarker
public class CfnWorkflowDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWorkflow.Builder = CfnWorkflow.Builder.create(scope, id)

  /**
   * The URI of a definition for the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-definitionuri)
   * @param definitionUri The URI of a definition for the workflow. 
   */
  public fun definitionUri(definitionUri: String) {
    cdkBuilder.definitionUri(definitionUri)
  }

  /**
   * The parameter's description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-description)
   * @param description The parameter's description. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * An engine for the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-engine)
   * @param engine An engine for the workflow. 
   */
  public fun engine(engine: String) {
    cdkBuilder.engine(engine)
  }

  /**
   * The path of the main definition file for the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-main)
   * @param main The path of the main definition file for the workflow. 
   */
  public fun main(main: String) {
    cdkBuilder.main(main)
  }

  /**
   * The workflow's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-name)
   * @param name The workflow's name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The workflow's parameter template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
   * @param parameterTemplate The workflow's parameter template. 
   */
  public fun parameterTemplate(parameterTemplate: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameterTemplate)
    cdkBuilder.parameterTemplate(builder.map)
  }

  /**
   * The workflow's parameter template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
   * @param parameterTemplate The workflow's parameter template. 
   */
  public fun parameterTemplate(parameterTemplate: Map<String, Any>) {
    cdkBuilder.parameterTemplate(parameterTemplate)
  }

  /**
   * The workflow's parameter template.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-parametertemplate)
   * @param parameterTemplate The workflow's parameter template. 
   */
  public fun parameterTemplate(parameterTemplate: IResolvable) {
    cdkBuilder.parameterTemplate(parameterTemplate)
  }

  /**
   * A storage capacity for the workflow in gigabytes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-storagecapacity)
   * @param storageCapacity A storage capacity for the workflow in gigabytes. 
   */
  public fun storageCapacity(storageCapacity: Number) {
    cdkBuilder.storageCapacity(storageCapacity)
  }

  /**
   * Tags for the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html#cfn-omics-workflow-tags)
   * @param tags Tags for the workflow. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnWorkflow = cdkBuilder.build()
}
