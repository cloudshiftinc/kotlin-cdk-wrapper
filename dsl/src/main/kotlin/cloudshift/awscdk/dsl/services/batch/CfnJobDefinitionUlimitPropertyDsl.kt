@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionUlimitPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.UlimitProperty.Builder =
      CfnJobDefinition.UlimitProperty.builder()

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

  public fun build(): CfnJobDefinition.UlimitProperty = cdkBuilder.build()
}
