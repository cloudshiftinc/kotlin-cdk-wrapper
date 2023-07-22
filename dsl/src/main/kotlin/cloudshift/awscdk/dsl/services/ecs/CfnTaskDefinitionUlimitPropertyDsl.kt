@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionUlimitPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.UlimitProperty.Builder =
      CfnTaskDefinition.UlimitProperty.builder()

  /**
   * @param hardLimit The hard limit for the `ulimit` type. 
   */
  public fun hardLimit(hardLimit: Number) {
    cdkBuilder.hardLimit(hardLimit)
  }

  /**
   * @param name The `type` of the `ulimit` . 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param softLimit The soft limit for the `ulimit` type. 
   */
  public fun softLimit(softLimit: Number) {
    cdkBuilder.softLimit(softLimit)
  }

  public fun build(): CfnTaskDefinition.UlimitProperty = cdkBuilder.build()
}
