@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnWorkflowProps

@CdkDslMarker
public class CfnWorkflowPropsDsl {
  private val cdkBuilder: CfnWorkflowProps.Builder = CfnWorkflowProps.builder()

  /**
   * @param defaultRunProperties A collection of properties to be used as part of each execution of
   * the workflow.
   */
  public fun defaultRunProperties(defaultRunProperties: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(defaultRunProperties)
    cdkBuilder.defaultRunProperties(builder.map)
  }

  /**
   * @param defaultRunProperties A collection of properties to be used as part of each execution of
   * the workflow.
   */
  public fun defaultRunProperties(defaultRunProperties: Any) {
    cdkBuilder.defaultRunProperties(defaultRunProperties)
  }

  /**
   * @param description A description of the workflow.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param maxConcurrentRuns You can use this parameter to prevent unwanted multiple updates to
   * data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent
   * runs of any of the component jobs.
   * If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
   */
  public fun maxConcurrentRuns(maxConcurrentRuns: Number) {
    cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
  }

  /**
   * @param name The name of the workflow representing the flow.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags The tags to use with this workflow.
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * @param tags The tags to use with this workflow.
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnWorkflowProps = cdkBuilder.build()
}
