@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.CfnFunctionConfiguration

@CdkDslMarker
public class CfnFunctionConfigurationAppSyncRuntimePropertyDsl {
  private val cdkBuilder: CfnFunctionConfiguration.AppSyncRuntimeProperty.Builder =
      CfnFunctionConfiguration.AppSyncRuntimeProperty.builder()

  /**
   * @param name The `name` of the runtime to use. 
   * Currently, the only allowed value is `APPSYNC_JS` .
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param runtimeVersion The `version` of the runtime to use. 
   * Currently, the only allowed version is `1.0.0` .
   */
  public fun runtimeVersion(runtimeVersion: String) {
    cdkBuilder.runtimeVersion(runtimeVersion)
  }

  public fun build(): CfnFunctionConfiguration.AppSyncRuntimeProperty = cdkBuilder.build()
}
