@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps
import software.amazon.awscdk.services.rds.SqlServerEngineVersion

@CdkDslMarker
public class SqlServerEeInstanceEnginePropsDsl {
  private val cdkBuilder: SqlServerEeInstanceEngineProps.Builder =
      SqlServerEeInstanceEngineProps.builder()

  public fun version(version: SqlServerEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): SqlServerEeInstanceEngineProps = cdkBuilder.build()
}
