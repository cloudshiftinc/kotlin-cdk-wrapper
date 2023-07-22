@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.EngineVersion

@CdkDslMarker
public class EngineVersionDsl {
  private val cdkBuilder: EngineVersion.Builder = EngineVersion.builder()

  /**
   * @param fullVersion The full version string of the engine, for example,
   * "5.6.mysql_aurora.1.22.1". It can be undefined, which means RDS should use whatever version it
   * deems appropriate for the given engine type.
   */
  public fun fullVersion(fullVersion: String) {
    cdkBuilder.fullVersion(fullVersion)
  }

  /**
   * @param majorVersion The major version of the engine, for example, "5.6". Used in specifying the
   * ParameterGroup family and OptionGroup version for this engine. 
   */
  public fun majorVersion(majorVersion: String) {
    cdkBuilder.majorVersion(majorVersion)
  }

  public fun build(): EngineVersion = cdkBuilder.build()
}
