@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.MySqlInstanceEngineProps
import software.amazon.awscdk.services.rds.MysqlEngineVersion

@CdkDslMarker
public class MySqlInstanceEnginePropsDsl {
  private val cdkBuilder: MySqlInstanceEngineProps.Builder = MySqlInstanceEngineProps.builder()

  /**
   * @param version The exact version of the engine to use. 
   */
  public fun version(version: MysqlEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): MySqlInstanceEngineProps = cdkBuilder.build()
}
