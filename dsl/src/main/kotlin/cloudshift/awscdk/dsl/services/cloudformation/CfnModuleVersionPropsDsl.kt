@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnModuleVersionProps

@CdkDslMarker
public class CfnModuleVersionPropsDsl {
  private val cdkBuilder: CfnModuleVersionProps.Builder = CfnModuleVersionProps.builder()

  public fun moduleName(moduleName: String) {
    cdkBuilder.moduleName(moduleName)
  }

  public fun modulePackage(modulePackage: String) {
    cdkBuilder.modulePackage(modulePackage)
  }

  public fun build(): CfnModuleVersionProps = cdkBuilder.build()
}
