@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for InitPackage.rpm/InitPackage.msi.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * InitServiceRestartHandle initServiceRestartHandle;
 * LocationPackageOptions locationPackageOptions = LocationPackageOptions.builder()
 * .key("key")
 * .serviceRestartHandles(List.of(initServiceRestartHandle))
 * .build();
 * ```
 */
public interface LocationPackageOptions {
  /**
   * Identifier key for this package.
   *
   * You can use this to order package installs.
   *
   * Default: - Automatically generated
   */
  public fun key(): String? = unwrap(this).getKey()

  /**
   * Restart the given service after this command has run.
   *
   * Default: - Do not restart any service
   */
  public fun serviceRestartHandles(): List<InitServiceRestartHandle> =
      unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

  /**
   * A builder for [LocationPackageOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param key Identifier key for this package.
     * You can use this to order package installs.
     */
    public fun key(key: String)

    /**
     * @param serviceRestartHandles Restart the given service after this command has run.
     */
    public fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>)

    /**
     * @param serviceRestartHandles Restart the given service after this command has run.
     */
    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LocationPackageOptions.Builder =
        software.amazon.awscdk.services.ec2.LocationPackageOptions.builder()

    /**
     * @param key Identifier key for this package.
     * You can use this to order package installs.
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param serviceRestartHandles Restart the given service after this command has run.
     */
    override fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>) {
      cdkBuilder.serviceRestartHandles(serviceRestartHandles.map(InitServiceRestartHandle::unwrap))
    }

    /**
     * @param serviceRestartHandles Restart the given service after this command has run.
     */
    override fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle): Unit
        = serviceRestartHandles(serviceRestartHandles.toList())

    public fun build(): software.amazon.awscdk.services.ec2.LocationPackageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.LocationPackageOptions,
  ) : CdkObject(cdkObject), LocationPackageOptions {
    /**
     * Identifier key for this package.
     *
     * You can use this to order package installs.
     *
     * Default: - Automatically generated
     */
    override fun key(): String? = unwrap(this).getKey()

    /**
     * Restart the given service after this command has run.
     *
     * Default: - Do not restart any service
     */
    override fun serviceRestartHandles(): List<InitServiceRestartHandle> =
        unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LocationPackageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LocationPackageOptions):
        LocationPackageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LocationPackageOptions):
        software.amazon.awscdk.services.ec2.LocationPackageOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.LocationPackageOptions
  }
}
