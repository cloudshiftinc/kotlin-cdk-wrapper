@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.SqlServerEngineVersion
import software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps

@CdkDslMarker
public class SqlServerExInstanceEnginePropsDsl {
  private val cdkBuilder: SqlServerExInstanceEngineProps.Builder =
      SqlServerExInstanceEngineProps.builder()

  public fun version(version: SqlServerEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): SqlServerExInstanceEngineProps = cdkBuilder.build()
}
