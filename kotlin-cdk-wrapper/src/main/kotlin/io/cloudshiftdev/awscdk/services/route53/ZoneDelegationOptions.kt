@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options available when creating a delegation relationship from one PublicHostedZone to another.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * ZoneDelegationOptions zoneDelegationOptions = ZoneDelegationOptions.builder()
 * .comment("comment")
 * .ttl(Duration.minutes(30))
 * .build();
 * ```
 */
public interface ZoneDelegationOptions {
  /**
   * A comment to add on the DNS record created to incorporate the delegation.
   *
   * Default: none
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * The TTL (Time To Live) of the DNS delegation record in DNS caches.
   *
   * Default: 172800
   */
  public fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)

  /**
   * A builder for [ZoneDelegationOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment A comment to add on the DNS record created to incorporate the delegation.
     */
    public fun comment(comment: String)

    /**
     * @param ttl The TTL (Time To Live) of the DNS delegation record in DNS caches.
     */
    public fun ttl(ttl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.ZoneDelegationOptions.Builder =
        software.amazon.awscdk.services.route53.ZoneDelegationOptions.builder()

    /**
     * @param comment A comment to add on the DNS record created to incorporate the delegation.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param ttl The TTL (Time To Live) of the DNS delegation record in DNS caches.
     */
    override fun ttl(ttl: Duration) {
      cdkBuilder.ttl(ttl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.route53.ZoneDelegationOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.ZoneDelegationOptions,
  ) : CdkObject(cdkObject), ZoneDelegationOptions {
    /**
     * A comment to add on the DNS record created to incorporate the delegation.
     *
     * Default: none
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The TTL (Time To Live) of the DNS delegation record in DNS caches.
     *
     * Default: 172800
     */
    override fun ttl(): Duration? = unwrap(this).getTtl()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ZoneDelegationOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.ZoneDelegationOptions):
        ZoneDelegationOptions = CdkObjectWrappers.wrap(cdkObject) as ZoneDelegationOptions

    internal fun unwrap(wrapped: ZoneDelegationOptions):
        software.amazon.awscdk.services.route53.ZoneDelegationOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.ZoneDelegationOptions
  }
}
