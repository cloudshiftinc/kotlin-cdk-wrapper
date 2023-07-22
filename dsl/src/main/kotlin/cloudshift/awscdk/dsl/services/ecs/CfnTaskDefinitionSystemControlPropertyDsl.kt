@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionSystemControlPropertyDsl {
  private val cdkBuilder: CfnTaskDefinition.SystemControlProperty.Builder =
      CfnTaskDefinition.SystemControlProperty.builder()

  /**
   * @param namespace The namespaced kernel parameter to set a `value` for.
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param value The value for the namespaced kernel parameter that's specified in `namespace` .
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnTaskDefinition.SystemControlProperty = cdkBuilder.build()
}
