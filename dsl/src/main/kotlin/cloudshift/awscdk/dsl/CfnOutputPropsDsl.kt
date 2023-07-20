@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnCondition
import software.amazon.awscdk.CfnOutputProps

@CdkDslMarker
public class CfnOutputPropsDsl {
  private val cdkBuilder: CfnOutputProps.Builder = CfnOutputProps.builder()

  public fun condition(condition: CfnCondition) {
    cdkBuilder.condition(condition)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun exportName(exportName: String) {
    cdkBuilder.exportName(exportName)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnOutputProps = cdkBuilder.build()
}
