@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.collections.List

/**
 * Additional options for an InitSource.
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
public interface InitSourceOptions {
  /**
   * Restart the given services after this archive has been extracted.
   *
   * Default: - Do not restart any service
   */
  public fun serviceRestartHandles(): List<InitServiceRestartHandle> =
      unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()

  /**
   * A builder for [InitSourceOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param serviceRestartHandles Restart the given services after this archive has been
     * extracted.
     */
    public fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>)

    /**
     * @param serviceRestartHandles Restart the given services after this archive has been
     * extracted.
     */
    public fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.InitSourceOptions.Builder =
        software.amazon.awscdk.services.ec2.InitSourceOptions.builder()

    /**
     * @param serviceRestartHandles Restart the given services after this archive has been
     * extracted.
     */
    override fun serviceRestartHandles(serviceRestartHandles: List<InitServiceRestartHandle>) {
      cdkBuilder.serviceRestartHandles(serviceRestartHandles.map(InitServiceRestartHandle::unwrap))
    }

    /**
     * @param serviceRestartHandles Restart the given services after this archive has been
     * extracted.
     */
    override fun serviceRestartHandles(vararg serviceRestartHandles: InitServiceRestartHandle): Unit
        = serviceRestartHandles(serviceRestartHandles.toList())

    public fun build(): software.amazon.awscdk.services.ec2.InitSourceOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.InitSourceOptions,
  ) : CdkObject(cdkObject), InitSourceOptions {
    /**
     * Restart the given services after this archive has been extracted.
     *
     * Default: - Do not restart any service
     */
    override fun serviceRestartHandles(): List<InitServiceRestartHandle> =
        unwrap(this).getServiceRestartHandles()?.map(InitServiceRestartHandle::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InitSourceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.InitSourceOptions):
        InitSourceOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InitSourceOptions):
        software.amazon.awscdk.services.ec2.InitSourceOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.InitSourceOptions
  }
}
