@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionScheduleEventPropertyDsl {
  private val cdkBuilder: CfnFunction.ScheduleEventProperty.Builder =
      CfnFunction.ScheduleEventProperty.builder()

  /**
   * @param description the value to be set.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param enabled the value to be set.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled the value to be set.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param input the value to be set.
   */
  public fun input(input: String) {
    cdkBuilder.input(input)
  }

  /**
   * @param name the value to be set.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param schedule the value to be set. 
   */
  public fun schedule(schedule: String) {
    cdkBuilder.schedule(schedule)
  }

  public fun build(): CfnFunction.ScheduleEventProperty = cdkBuilder.build()
}
