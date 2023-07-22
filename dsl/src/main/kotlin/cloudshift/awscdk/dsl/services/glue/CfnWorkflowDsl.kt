@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnWorkflow
import software.constructs.Construct

/**
 * The `AWS::Glue::Workflow` is an AWS Glue resource type that manages AWS Glue workflows.
 *
 * A workflow is a container for a set of related jobs, crawlers, and triggers in AWS Glue . Using a
 * workflow, you can design a complex multi-job extract, transform, and load (ETL) activity that AWS
 * Glue can execute and track as single entity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object defaultRunProperties;
 * Object tags;
 * CfnWorkflow cfnWorkflow = CfnWorkflow.Builder.create(this, "MyCfnWorkflow")
 * .defaultRunProperties(defaultRunProperties)
 * .description("description")
 * .maxConcurrentRuns(123)
 * .name("name")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html)
 */
@CdkDslMarker
public class CfnWorkflowDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWorkflow.Builder = CfnWorkflow.Builder.create(scope, id)

  /**
   * A collection of properties to be used as part of each execution of the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-defaultrunproperties)
   * @param defaultRunProperties A collection of properties to be used as part of each execution of
   * the workflow. 
   */
  public fun defaultRunProperties(defaultRunProperties: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(defaultRunProperties)
    cdkBuilder.defaultRunProperties(builder.map)
  }

  /**
   * A collection of properties to be used as part of each execution of the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-defaultrunproperties)
   * @param defaultRunProperties A collection of properties to be used as part of each execution of
   * the workflow. 
   */
  public fun defaultRunProperties(defaultRunProperties: Any) {
    cdkBuilder.defaultRunProperties(defaultRunProperties)
  }

  /**
   * A description of the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-description)
   * @param description A description of the workflow. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or
   * in some cases, to prevent exceeding the maximum number of concurrent runs of any of the component
   * jobs.
   *
   * If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-maxconcurrentruns)
   * @param maxConcurrentRuns You can use this parameter to prevent unwanted multiple updates to
   * data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent
   * runs of any of the component jobs. 
   */
  public fun maxConcurrentRuns(maxConcurrentRuns: Number) {
    cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
  }

  /**
   * The name of the workflow representing the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-name)
   * @param name The name of the workflow representing the flow. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The tags to use with this workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-tags)
   * @param tags The tags to use with this workflow. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * The tags to use with this workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-tags)
   * @param tags The tags to use with this workflow. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnWorkflow = cdkBuilder.build()
}
