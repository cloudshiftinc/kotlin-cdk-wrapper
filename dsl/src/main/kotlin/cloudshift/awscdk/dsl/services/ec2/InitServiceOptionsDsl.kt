@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.InitServiceOptions
import software.amazon.awscdk.services.ec2.InitServiceRestartHandle
import software.amazon.awscdk.services.ec2.ServiceManager

@CdkDslMarker
public class InitServiceOptionsDsl {
  private val cdkBuilder: InitServiceOptions.Builder = InitServiceOptions.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun ensureRunning(ensureRunning: Boolean) {
    cdkBuilder.ensureRunning(ensureRunning)
  }

  public fun serviceManager(serviceManager: ServiceManager) {
    cdkBuilder.serviceManager(serviceManager)
  }

  public fun serviceRestartHandle(serviceRestartHandle: InitServiceRestartHandle) {
    cdkBuilder.serviceRestartHandle(serviceRestartHandle)
  }

  public fun build(): InitServiceOptions = cdkBuilder.build()
}
