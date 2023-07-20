@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupEngineVersionPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.EngineVersionProperty.Builder =
      CfnWorkGroup.EngineVersionProperty.builder()

  public fun effectiveEngineVersion(effectiveEngineVersion: String) {
    cdkBuilder.effectiveEngineVersion(effectiveEngineVersion)
  }

  public fun selectedEngineVersion(selectedEngineVersion: String) {
    cdkBuilder.selectedEngineVersion(selectedEngineVersion)
  }

  public fun build(): CfnWorkGroup.EngineVersionProperty = cdkBuilder.build()
}
