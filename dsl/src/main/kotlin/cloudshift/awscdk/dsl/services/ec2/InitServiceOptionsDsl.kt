@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.InitServiceOptions
import software.amazon.awscdk.services.ec2.InitServiceRestartHandle
import software.amazon.awscdk.services.ec2.ServiceManager

/**
 * Options for an InitService.
 *
 * Example:
 *
 * ```
 * Bucket myBucket;
 * InitServiceRestartHandle handle = new InitServiceRestartHandle();
 * CloudFormationInit.fromElements(InitFile.fromString("/etc/nginx/nginx.conf", "...",
 * InitFileOptions.builder().serviceRestartHandles(List.of(handle)).build()),
 * InitSource.fromS3Object("/var/www/html", myBucket, "html.zip",
 * InitSourceOptions.builder().serviceRestartHandles(List.of(handle)).build()),
 * InitService.enable("nginx", InitServiceOptions.builder()
 * .serviceRestartHandle(handle)
 * .build()));
 * ```
 */
@CdkDslMarker
public class InitServiceOptionsDsl {
  private val cdkBuilder: InitServiceOptions.Builder = InitServiceOptions.builder()

  /**
   * @param enabled Enable or disable this service.
   * Set to true to ensure that the service will be started automatically upon boot.
   *
   * Set to false to ensure that the service will not be started automatically upon boot.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param ensureRunning Make sure this service is running or not running after cfn-init finishes.
   * Set to true to ensure that the service is running after cfn-init finishes.
   *
   * Set to false to ensure that the service is not running after cfn-init finishes.
   */
  public fun ensureRunning(ensureRunning: Boolean) {
    cdkBuilder.ensureRunning(ensureRunning)
  }

  /**
   * @param serviceManager What service manager to use.
   * This needs to match the actual service manager on your Operating System.
   * For example, Amazon Linux 1 uses SysVinit, but Amazon Linux 2 uses Systemd.
   */
  public fun serviceManager(serviceManager: ServiceManager) {
    cdkBuilder.serviceManager(serviceManager)
  }

  /**
   * @param serviceRestartHandle Restart service when the actions registered into the restartHandle
   * have been performed.
   * Register actions into the restartHandle by passing it to `InitFile`, `InitCommand`,
   * `InitPackage` and `InitSource` objects.
   */
  public fun serviceRestartHandle(serviceRestartHandle: InitServiceRestartHandle) {
    cdkBuilder.serviceRestartHandle(serviceRestartHandle)
  }

  public fun build(): InitServiceOptions = cdkBuilder.build()
}
