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

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun input(input: String) {
    cdkBuilder.input(input)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun schedule(schedule: String) {
    cdkBuilder.schedule(schedule)
  }

  public fun build(): CfnFunction.ScheduleEventProperty = cdkBuilder.build()
}
