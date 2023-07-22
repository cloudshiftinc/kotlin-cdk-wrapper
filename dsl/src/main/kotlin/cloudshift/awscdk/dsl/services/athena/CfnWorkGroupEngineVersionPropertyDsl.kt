@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.athena.CfnWorkGroup

@CdkDslMarker
public class CfnWorkGroupEngineVersionPropertyDsl {
  private val cdkBuilder: CfnWorkGroup.EngineVersionProperty.Builder =
      CfnWorkGroup.EngineVersionProperty.builder()

  /**
   * @param effectiveEngineVersion Read only.
   * The engine version on which the query runs. If the user requests a valid engine version other
   * than Auto, the effective engine version is the same as the engine version that the user requested.
   * If the user requests Auto, the effective engine version is chosen by Athena. When a request to
   * update the engine version is made by a `CreateWorkGroup` or `UpdateWorkGroup` operation, the
   * `EffectiveEngineVersion` field is ignored.
   */
  public fun effectiveEngineVersion(effectiveEngineVersion: String) {
    cdkBuilder.effectiveEngineVersion(effectiveEngineVersion)
  }

  /**
   * @param selectedEngineVersion The engine version requested by the user.
   * Possible values are determined by the output of `ListEngineVersions` , including AUTO. The
   * default is AUTO.
   */
  public fun selectedEngineVersion(selectedEngineVersion: String) {
    cdkBuilder.selectedEngineVersion(selectedEngineVersion)
  }

  public fun build(): CfnWorkGroup.EngineVersionProperty = cdkBuilder.build()
}
