@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

@CdkDslMarker
public class CfnJobDefinitionHostPathPropertyDsl {
  private val cdkBuilder: CfnJobDefinition.HostPathProperty.Builder =
      CfnJobDefinition.HostPathProperty.builder()

  /**
   * @param path the value to be set.
   */
  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun build(): CfnJobDefinition.HostPathProperty = cdkBuilder.build()
}
