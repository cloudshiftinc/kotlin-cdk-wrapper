@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.OracleEngineVersion
import software.amazon.awscdk.services.rds.OracleSe2CdbInstanceEngineProps

@CdkDslMarker
public class OracleSe2CdbInstanceEnginePropsDsl {
  private val cdkBuilder: OracleSe2CdbInstanceEngineProps.Builder =
      OracleSe2CdbInstanceEngineProps.builder()

  /**
   * @param version The exact version of the engine to use. 
   */
  public fun version(version: OracleEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): OracleSe2CdbInstanceEngineProps = cdkBuilder.build()
}
