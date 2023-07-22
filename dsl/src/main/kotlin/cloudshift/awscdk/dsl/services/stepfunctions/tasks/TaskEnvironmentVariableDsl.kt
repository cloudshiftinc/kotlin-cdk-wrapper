@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.TaskEnvironmentVariable

@CdkDslMarker
public class TaskEnvironmentVariableDsl {
  private val cdkBuilder: TaskEnvironmentVariable.Builder = TaskEnvironmentVariable.builder()

  /**
   * @param name Name for the environment variable. 
   * Use `JsonPath` class's static methods to specify name from a JSON path.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param value Value of the environment variable. 
   * Use `JsonPath` class's static methods to specify value from a JSON path.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): TaskEnvironmentVariable = cdkBuilder.build()
}
