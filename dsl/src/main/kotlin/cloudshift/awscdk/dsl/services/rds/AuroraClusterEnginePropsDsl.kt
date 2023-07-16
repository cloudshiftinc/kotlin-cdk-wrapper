@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.AuroraClusterEngineProps
import software.amazon.awscdk.services.rds.AuroraEngineVersion

@CdkDslMarker
public class AuroraClusterEnginePropsDsl {
  private val cdkBuilder: AuroraClusterEngineProps.Builder = AuroraClusterEngineProps.builder()

  public fun version(version: AuroraEngineVersion) {
    cdkBuilder.version(version)
  }

  public fun build(): AuroraClusterEngineProps = cdkBuilder.build()
}
