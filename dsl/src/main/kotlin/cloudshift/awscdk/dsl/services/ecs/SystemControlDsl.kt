@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.SystemControl

@CdkDslMarker
public class SystemControlDsl {
  private val cdkBuilder: SystemControl.Builder = SystemControl.builder()

  /**
   * @param namespace The namespaced kernel parameter for which to set a value. 
   */
  public fun namespace(namespace: String) {
    cdkBuilder.namespace(namespace)
  }

  /**
   * @param value The value for the namespaced kernel parameter specified in namespace. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): SystemControl = cdkBuilder.build()
}
