@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.OracleEeCdbInstanceEngineProps
import software.amazon.awscdk.services.rds.OracleEngineVersion

@CdkDslMarker
public class OracleEeCdbInstanceEnginePropsDsl {
  private val cdkBuilder: OracleEeCdbInstanceEngineProps.Builder =
      OracleEeCdbInstanceEngineProps.builder()

  /**
   * @param version The exact version of the engine to use. 
   */
  public fun version(version: OracleEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): OracleEeCdbInstanceEngineProps = cdkBuilder.build()
}
