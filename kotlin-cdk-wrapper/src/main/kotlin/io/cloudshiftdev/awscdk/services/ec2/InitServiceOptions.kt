@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

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
public interface InitServiceOptions {
  /**
   * Enable or disable this service.
   *
   * Set to true to ensure that the service will be started automatically upon boot.
   *
   * Set to false to ensure that the service will not be started automatically upon boot.
   *
   * Default: - true if used in `InitService.enable()`, no change to service
   * state if used in `InitService.fromOptions()`.
   */
  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  /**
   * Make sure this service is running or not running after cfn-init finishes.
   *
   * Set to true to ensure that the service is running after cfn-init finishes.
   *
   * Set to false to ensure that the service is not running after cfn-init finishes.
   *
   * Default: - same value as `enabled`.
   */
  public fun ensureRunning(): Boolean? = unwrap(this).getEnsureRunning()

  /**
   * What service manager to use.
   *
   * This needs to match the actual service manager on your Operating System.
   * For example, Amazon Linux 1 uses SysVinit, but Amazon Linux 2 uses Systemd.
   *
   * Default: ServiceManager.SYSVINIT for Linux images, ServiceManager.WINDOWS for Windows images
   */
  public fun serviceManager(): ServiceManager? =
      unwrap(this).getServiceManager()?.let(ServiceManager::wrap)

  /**
   * Restart service when the actions registered into the restartHandle have been performed.
   *
   * Register actions into the restartHandle by passing it to `InitFile`, `InitCommand`,
   * `InitPackage` and `InitSource` objects.
   *
   * Default: - No files trigger restart
   */
  public fun serviceRestartHandle(): InitServiceRestartHandle? =
      unwrap(this).getServiceRestartHandle()?.let(InitServiceRestartHandle::wrap)

  /**
   * A builder for [InitServiceOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param enabled Enable or disable this service.
     * Set to true to ensure that the service will be started automatically upon boot.
     *
     * Set to false to ensure that the service will not be started automatically upon boot.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param ensureRunning Make sure this service is running or not running after cfn-init
     * finishes.
     * Set to true to ensure that the service is running after cfn-init finishes.
     *
     * Set to false to ensure that the service is not running after cfn-init finishes.
     */
    public fun ensureRunning(ensureRunning: Boolean)

    /**
     * @param serviceManager What service manager to use.
     * This needs to match the actual service manager on your Operating System.
     * For example, Amazon Linux 1 uses SysVinit, but Amazon Linux 2 uses Systemd.
     */
    public fun serviceManager(serviceManager: ServiceManager)

    /**
     * @param serviceRestartHandle Restart service when the actions registered into the
     * restartHandle have been performed.
     * Register actions into the restartHandle by passing it to `InitFile`, `InitCommand`,
     * `InitPackage` and `InitSource` objects.
     */
    public fun serviceRestartHandle(serviceRestartHandle: InitServiceRestartHandle)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InitServiceOptions.Builder =
        software.amazon.awscdk.services.ec2.InitServiceOptions.builder()

    /**
     * @param enabled Enable or disable this service.
     * Set to true to ensure that the service will be started automatically upon boot.
     *
     * Set to false to ensure that the service will not be started automatically upon boot.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param ensureRunning Make sure this service is running or not running after cfn-init
     * finishes.
     * Set to true to ensure that the service is running after cfn-init finishes.
     *
     * Set to false to ensure that the service is not running after cfn-init finishes.
     */
    override fun ensureRunning(ensureRunning: Boolean) {
      cdkBuilder.ensureRunning(ensureRunning)
    }

    /**
     * @param serviceManager What service manager to use.
     * This needs to match the actual service manager on your Operating System.
     * For example, Amazon Linux 1 uses SysVinit, but Amazon Linux 2 uses Systemd.
     */
    override fun serviceManager(serviceManager: ServiceManager) {
      cdkBuilder.serviceManager(serviceManager.let(ServiceManager.Companion::unwrap))
    }

    /**
     * @param serviceRestartHandle Restart service when the actions registered into the
     * restartHandle have been performed.
     * Register actions into the restartHandle by passing it to `InitFile`, `InitCommand`,
     * `InitPackage` and `InitSource` objects.
     */
    override fun serviceRestartHandle(serviceRestartHandle: InitServiceRestartHandle) {
      cdkBuilder.serviceRestartHandle(serviceRestartHandle.let(InitServiceRestartHandle.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.InitServiceOptions = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.InitServiceOptions,
  ) : CdkObject(cdkObject),
      InitServiceOptions {
    /**
     * Enable or disable this service.
     *
     * Set to true to ensure that the service will be started automatically upon boot.
     *
     * Set to false to ensure that the service will not be started automatically upon boot.
     *
     * Default: - true if used in `InitService.enable()`, no change to service
     * state if used in `InitService.fromOptions()`.
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * Make sure this service is running or not running after cfn-init finishes.
     *
     * Set to true to ensure that the service is running after cfn-init finishes.
     *
     * Set to false to ensure that the service is not running after cfn-init finishes.
     *
     * Default: - same value as `enabled`.
     */
    override fun ensureRunning(): Boolean? = unwrap(this).getEnsureRunning()

    /**
     * What service manager to use.
     *
     * This needs to match the actual service manager on your Operating System.
     * For example, Amazon Linux 1 uses SysVinit, but Amazon Linux 2 uses Systemd.
     *
     * Default: ServiceManager.SYSVINIT for Linux images, ServiceManager.WINDOWS for Windows images
     */
    override fun serviceManager(): ServiceManager? =
        unwrap(this).getServiceManager()?.let(ServiceManager::wrap)

    /**
     * Restart service when the actions registered into the restartHandle have been performed.
     *
     * Register actions into the restartHandle by passing it to `InitFile`, `InitCommand`,
     * `InitPackage` and `InitSource` objects.
     *
     * Default: - No files trigger restart
     */
    override fun serviceRestartHandle(): InitServiceRestartHandle? =
        unwrap(this).getServiceRestartHandle()?.let(InitServiceRestartHandle::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InitServiceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitServiceOptions):
        InitServiceOptions = CdkObjectWrappers.wrap(cdkObject) as? InitServiceOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitServiceOptions):
        software.amazon.awscdk.services.ec2.InitServiceOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.InitServiceOptions
  }
}
