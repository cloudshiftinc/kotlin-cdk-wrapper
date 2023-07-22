@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.RuntimeConfig

@CdkDslMarker
public class RuntimeConfigDsl {
  private val cdkBuilder: RuntimeConfig.Builder = RuntimeConfig.builder()

  /**
   * @param name The name of the runtime. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param runtimeVersion The version string of the runtime. 
   */
  public fun runtimeVersion(runtimeVersion: String) {
    cdkBuilder.runtimeVersion(runtimeVersion)
  }

  public fun build(): RuntimeConfig = cdkBuilder.build()
}
