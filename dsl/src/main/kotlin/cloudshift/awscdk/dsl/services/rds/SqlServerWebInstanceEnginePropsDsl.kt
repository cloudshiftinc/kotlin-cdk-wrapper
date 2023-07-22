@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.SqlServerEngineVersion
import software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps

/**
 * Properties for SQL Server Web Edition instance engines.
 *
 * Used in `DatabaseInstanceEngine.sqlServerWeb`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * SqlServerEngineVersion sqlServerEngineVersion;
 * SqlServerWebInstanceEngineProps sqlServerWebInstanceEngineProps =
 * SqlServerWebInstanceEngineProps.builder()
 * .version(sqlServerEngineVersion)
 * .build();
 * ```
 */
@CdkDslMarker
public class SqlServerWebInstanceEnginePropsDsl {
  private val cdkBuilder: SqlServerWebInstanceEngineProps.Builder =
      SqlServerWebInstanceEngineProps.builder()

  /**
   * @param version The exact version of the engine to use. 
   */
  public fun version(version: SqlServerEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): SqlServerWebInstanceEngineProps = cdkBuilder.build()
}
