@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.controltower

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.controltower.CfnEnabledControlProps

@CdkDslMarker
public class CfnEnabledControlPropsDsl {
  private val cdkBuilder: CfnEnabledControlProps.Builder = CfnEnabledControlProps.builder()

  public fun controlIdentifier(controlIdentifier: String) {
    cdkBuilder.controlIdentifier(controlIdentifier)
  }

  public fun targetIdentifier(targetIdentifier: String) {
    cdkBuilder.targetIdentifier(targetIdentifier)
  }

  public fun build(): CfnEnabledControlProps = cdkBuilder.build()
}
