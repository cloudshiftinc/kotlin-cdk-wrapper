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

  /**
   * @param serviceRole The ARN of an IAM service role that Elastic Beanstalk has permission to
   * assume.
   * The `ServiceRole` property is required the first time that you provide a
   * `ResourceLifecycleConfig` for the application. After you provide it once, Elastic Beanstalk
   * persists the Service Role with the application, and you don't need to specify it again. You can,
   * however, specify it in subsequent updates to change the Service Role to another value.
   */
  public fun serviceRole(serviceRole: String) {
    cdkBuilder.serviceRole(serviceRole)
  }

  /**
   * @param versionLifecycleConfig Defines lifecycle settings for application versions.
   */
  public fun versionLifecycleConfig(versionLifecycleConfig: IResolvable) {
    cdkBuilder.versionLifecycleConfig(versionLifecycleConfig)
  }

  /**
   * @param versionLifecycleConfig Defines lifecycle settings for application versions.
   */
  public
      fun versionLifecycleConfig(versionLifecycleConfig: CfnApplication.ApplicationVersionLifecycleConfigProperty) {
    cdkBuilder.versionLifecycleConfig(versionLifecycleConfig)
  }

  public fun build(): CfnApplication.ApplicationResourceLifecycleConfigProperty = cdkBuilder.build()
}
