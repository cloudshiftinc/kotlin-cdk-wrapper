@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.events.targets.TaskEnvironmentVariable

@CdkDslMarker
public class TaskEnvironmentVariableDsl {
  private val cdkBuilder: TaskEnvironmentVariable.Builder = TaskEnvironmentVariable.builder()

  /**
   * @param name Name for the environment variable. 
   * Exactly one of `name` and `namePath` must be specified.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value Value of the environment variable. 
   * Exactly one of `value` and `valuePath` must be specified.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): TaskEnvironmentVariable = cdkBuilder.build()
}
