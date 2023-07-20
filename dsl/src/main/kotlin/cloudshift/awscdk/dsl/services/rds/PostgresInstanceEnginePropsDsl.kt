@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.PostgresEngineVersion
import software.amazon.awscdk.services.rds.PostgresInstanceEngineProps

@CdkDslMarker
public class PostgresInstanceEnginePropsDsl {
  private val cdkBuilder: PostgresInstanceEngineProps.Builder =
      PostgresInstanceEngineProps.builder()

  public fun version(version: PostgresEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): PostgresInstanceEngineProps = cdkBuilder.build()
}
