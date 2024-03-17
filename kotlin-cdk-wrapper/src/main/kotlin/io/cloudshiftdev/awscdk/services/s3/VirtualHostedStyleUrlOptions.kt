@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

/**
 * Options for creating Virtual-Hosted style URL.
 *
 * Example:
 *
 * ```
 * Bucket bucket = new Bucket(this, "MyBucket");
 * bucket.urlForObject("objectname"); // Path-Style URL
 * bucket.virtualHostedUrlForObject("objectname"); // Virtual Hosted-Style URL
 * bucket.virtualHostedUrlForObject("objectname",
 * VirtualHostedStyleUrlOptions.builder().regional(false).build());
 * ```
 */
public interface VirtualHostedStyleUrlOptions {
  /**
   * Specifies the URL includes the region.
   *
   * Default: - true
   */
  public fun regional(): Boolean? = unwrap(this).getRegional()

  /**
   * A builder for [VirtualHostedStyleUrlOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param regional Specifies the URL includes the region.
     */
    public fun regional(regional: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions.Builder
        = software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions.builder()

    /**
     * @param regional Specifies the URL includes the region.
     */
    override fun regional(regional: Boolean) {
      cdkBuilder.regional(regional)
    }

    public fun build(): software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions,
  ) : CdkObject(cdkObject), VirtualHostedStyleUrlOptions {
    /**
     * Specifies the URL includes the region.
     *
     * Default: - true
     */
    override fun regional(): Boolean? = unwrap(this).getRegional()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualHostedStyleUrlOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions):
        VirtualHostedStyleUrlOptions = CdkObjectWrappers.wrap(cdkObject) as?
        VirtualHostedStyleUrlOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualHostedStyleUrlOptions):
        software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.VirtualHostedStyleUrlOptions
  }
}
