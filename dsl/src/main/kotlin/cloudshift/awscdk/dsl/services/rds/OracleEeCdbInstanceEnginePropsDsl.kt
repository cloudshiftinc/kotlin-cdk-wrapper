@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.OracleEeCdbInstanceEngineProps
import software.amazon.awscdk.services.rds.OracleEngineVersion

/**
 * Properties for Oracle Enterprise Edition (CDB) instance engines.
 *
 * Used in `DatabaseInstanceEngine.oracleEeCdb`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * OracleEngineVersion oracleEngineVersion;
 * OracleEeCdbInstanceEngineProps oracleEeCdbInstanceEngineProps =
 * OracleEeCdbInstanceEngineProps.builder()
 * .version(oracleEngineVersion)
 * .build();
 * ```
 */
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
