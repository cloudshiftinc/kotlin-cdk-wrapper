@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.SqlServerEngineVersion
import software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps

@CdkDslMarker
public class SqlServerWebInstanceEnginePropsDsl {
  private val cdkBuilder: SqlServerWebInstanceEngineProps.Builder =
      SqlServerWebInstanceEngineProps.builder()

  public fun version(version: SqlServerEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): SqlServerWebInstanceEngineProps = cdkBuilder.build()
}
