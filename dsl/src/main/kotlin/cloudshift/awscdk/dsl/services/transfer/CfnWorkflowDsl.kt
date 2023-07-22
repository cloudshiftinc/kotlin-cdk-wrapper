@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.transfer.CfnWorkflow
import software.constructs.Construct

@CdkDslMarker
public class CfnWorkflowDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWorkflow.Builder = CfnWorkflow.Builder.create(scope, id)

  private val _onExceptionSteps: MutableList<Any> = mutableListOf()

  private val _steps: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Specifies the text description for the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-description)
   * @param description Specifies the text description for the workflow. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Specifies the steps (actions) to take if errors are encountered during execution of the
   * workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-onexceptionsteps)
   * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered during
   * execution of the workflow. 
   */
  public fun onExceptionSteps(vararg onExceptionSteps: Any) {
    _onExceptionSteps.addAll(listOf(*onExceptionSteps))
  }

  /**
   * Specifies the steps (actions) to take if errors are encountered during execution of the
   * workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-onexceptionsteps)
   * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered during
   * execution of the workflow. 
   */
  public fun onExceptionSteps(onExceptionSteps: Collection<Any>) {
    _onExceptionSteps.addAll(onExceptionSteps)
  }

  /**
   * Specifies the steps (actions) to take if errors are encountered during execution of the
   * workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-onexceptionsteps)
   * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered during
   * execution of the workflow. 
   */
  public fun onExceptionSteps(onExceptionSteps: IResolvable) {
    cdkBuilder.onExceptionSteps(onExceptionSteps)
  }

  /**
   * Specifies the details for the steps that are in the specified workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-steps)
   * @param steps Specifies the details for the steps that are in the specified workflow. 
   */
  public fun steps(vararg steps: Any) {
    _steps.addAll(listOf(*steps))
  }

  /**
   * Specifies the details for the steps that are in the specified workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-steps)
   * @param steps Specifies the details for the steps that are in the specified workflow. 
   */
  public fun steps(steps: Collection<Any>) {
    _steps.addAll(steps)
  }

  /**
   * Specifies the details for the steps that are in the specified workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-steps)
   * @param steps Specifies the details for the steps that are in the specified workflow. 
   */
  public fun steps(steps: IResolvable) {
    cdkBuilder.steps(steps)
  }

  /**
   * Key-value pairs that can be used to group and search for workflows.
   *
   * Tags are metadata attached to workflows for any purpose.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-tags)
   * @param tags Key-value pairs that can be used to group and search for workflows. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Key-value pairs that can be used to group and search for workflows.
   *
   * Tags are metadata attached to workflows for any purpose.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-tags)
   * @param tags Key-value pairs that can be used to group and search for workflows. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnWorkflow {
    if(_onExceptionSteps.isNotEmpty()) cdkBuilder.onExceptionSteps(_onExceptionSteps)
    if(_steps.isNotEmpty()) cdkBuilder.steps(_steps)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
