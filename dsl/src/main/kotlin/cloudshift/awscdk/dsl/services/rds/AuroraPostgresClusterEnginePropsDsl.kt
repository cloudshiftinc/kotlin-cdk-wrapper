@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps
import software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion

@CdkDslMarker
public class AuroraPostgresClusterEnginePropsDsl {
  private val cdkBuilder: AuroraPostgresClusterEngineProps.Builder =
      AuroraPostgresClusterEngineProps.builder()

  /**
   * @param version The version of the Aurora PostgreSQL cluster engine. 
   */
  public fun version(version: AuroraPostgresEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): AuroraPostgresClusterEngineProps = cdkBuilder.build()
}
