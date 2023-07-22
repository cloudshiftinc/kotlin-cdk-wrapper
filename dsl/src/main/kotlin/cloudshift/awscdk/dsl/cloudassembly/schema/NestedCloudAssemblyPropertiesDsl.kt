@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.cloudassembly.schema.NestedCloudAssemblyProperties

@CdkDslMarker
public class NestedCloudAssemblyPropertiesDsl {
  private val cdkBuilder: NestedCloudAssemblyProperties.Builder =
      NestedCloudAssemblyProperties.builder()

  /**
   * @param directoryName Relative path to the nested cloud assembly. 
   */
  public fun directoryName(directoryName: String) {
    cdkBuilder.directoryName(directoryName)
  }

  /**
   * @param displayName Display name for the cloud assembly.
   */
  public fun displayName(displayName: String) {
    cdkBuilder.displayName(displayName)
  }

  public fun build(): NestedCloudAssemblyProperties = cdkBuilder.build()
}
