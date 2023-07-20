@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersion

@CdkDslMarker
public class CfnFunctionDefinitionVersionRunAsPropertyDsl {
  private val cdkBuilder: CfnFunctionDefinitionVersion.RunAsProperty.Builder =
      CfnFunctionDefinitionVersion.RunAsProperty.builder()

  public fun gid(gid: Number) {
    cdkBuilder.gid(gid)
  }

  public fun uid(uid: Number) {
    cdkBuilder.uid(uid)
  }

  public fun build(): CfnFunctionDefinitionVersion.RunAsProperty = cdkBuilder.build()
}
