@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticbeanstalk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplication

@CdkDslMarker
public class CfnApplicationApplicationResourceLifecycleConfigPropertyDsl {
  private val cdkBuilder: CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder =
      CfnApplication.ApplicationResourceLifecycleConfigProperty.builder()

  public fun serviceRole(serviceRole: String) {
    cdkBuilder.serviceRole(serviceRole)
  }

  public fun versionLifecycleConfig(versionLifecycleConfig: IResolvable) {
    cdkBuilder.versionLifecycleConfig(versionLifecycleConfig)
  }

  public
      fun versionLifecycleConfig(versionLifecycleConfig: CfnApplication.ApplicationVersionLifecycleConfigProperty) {
    cdkBuilder.versionLifecycleConfig(versionLifecycleConfig)
  }

  public fun build(): CfnApplication.ApplicationResourceLifecycleConfigProperty = cdkBuilder.build()
}
