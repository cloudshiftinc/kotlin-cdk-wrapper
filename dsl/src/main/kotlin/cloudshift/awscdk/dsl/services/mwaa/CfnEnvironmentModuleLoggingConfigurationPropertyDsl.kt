@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mwaa

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mwaa.CfnEnvironment

@CdkDslMarker
public class CfnEnvironmentModuleLoggingConfigurationPropertyDsl {
  private val cdkBuilder: CfnEnvironment.ModuleLoggingConfigurationProperty.Builder =
      CfnEnvironment.ModuleLoggingConfigurationProperty.builder()

  public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
    cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun logLevel(logLevel: String) {
    cdkBuilder.logLevel(logLevel)
  }

  public fun build(): CfnEnvironment.ModuleLoggingConfigurationProperty = cdkBuilder.build()
}
