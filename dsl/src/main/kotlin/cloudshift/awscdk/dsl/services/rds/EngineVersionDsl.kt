@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.EngineVersion

@CdkDslMarker
public class EngineVersionDsl {
  private val cdkBuilder: EngineVersion.Builder = EngineVersion.builder()

  public fun fullVersion(fullVersion: String) {
    cdkBuilder.fullVersion(fullVersion)
  }

  public fun majorVersion(majorVersion: String) {
    cdkBuilder.majorVersion(majorVersion)
  }

  public fun build(): EngineVersion = cdkBuilder.build()
}
