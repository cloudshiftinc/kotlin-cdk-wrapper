@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.MariaDbEngineVersion
import software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps

@CdkDslMarker
public class MariaDbInstanceEnginePropsDsl {
  private val cdkBuilder: MariaDbInstanceEngineProps.Builder = MariaDbInstanceEngineProps.builder()

  public fun version(version: MariaDbEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): MariaDbInstanceEngineProps = cdkBuilder.build()
}
