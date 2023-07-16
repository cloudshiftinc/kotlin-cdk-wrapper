@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnModuleDefaultVersionProps

@CdkDslMarker
public class CfnModuleDefaultVersionPropsDsl {
  private val cdkBuilder: CfnModuleDefaultVersionProps.Builder =
      CfnModuleDefaultVersionProps.builder()

  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  public fun moduleName(moduleName: String) {
    cdkBuilder.moduleName(moduleName)
  }

  public fun versionId(versionId: String) {
    cdkBuilder.versionId(versionId)
  }

  public fun build(): CfnModuleDefaultVersionProps = cdkBuilder.build()
}
