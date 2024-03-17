@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Specifies a redirect behavior of all requests to a website endpoint of a bucket.
 *
 * Example:
 *
 * ```
 * Bucket bucket = Bucket.Builder.create(this, "MyRedirectedBucket")
 * .websiteRedirect(RedirectTarget.builder().hostName("www.example.com").build())
 * .build();
 * ```
 */
public interface RedirectTarget {
  /**
   * Name of the host where requests are redirected.
   */
  public fun hostName(): String

  /**
   * Protocol to use when redirecting requests.
   *
   * Default: - The protocol used in the original request.
   */
  public fun protocol(): RedirectProtocol? = unwrap(this).getProtocol()?.let(RedirectProtocol::wrap)

  /**
   * A builder for [RedirectTarget]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param hostName Name of the host where requests are redirected. 
     */
    public fun hostName(hostName: String)

    /**
     * @param protocol Protocol to use when redirecting requests.
     */
    public fun protocol(protocol: RedirectProtocol)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.RedirectTarget.Builder =
        software.amazon.awscdk.services.s3.RedirectTarget.builder()

    /**
     * @param hostName Name of the host where requests are redirected. 
     */
    override fun hostName(hostName: String) {
      cdkBuilder.hostName(hostName)
    }

    /**
     * @param protocol Protocol to use when redirecting requests.
     */
    override fun protocol(protocol: RedirectProtocol) {
      cdkBuilder.protocol(protocol.let(RedirectProtocol::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.s3.RedirectTarget = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.RedirectTarget,
  ) : CdkObject(cdkObject), RedirectTarget {
    /**
     * Name of the host where requests are redirected.
     */
    override fun hostName(): String = unwrap(this).getHostName()

    /**
     * Protocol to use when redirecting requests.
     *
     * Default: - The protocol used in the original request.
     */
    override fun protocol(): RedirectProtocol? =
        unwrap(this).getProtocol()?.let(RedirectProtocol::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RedirectTarget {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.RedirectTarget): RedirectTarget
        = CdkObjectWrappers.wrap(cdkObject) as? RedirectTarget ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: RedirectTarget): software.amazon.awscdk.services.s3.RedirectTarget
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.s3.RedirectTarget
  }
}
