@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Email settings for the user pool.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * EmailSettings emailSettings = EmailSettings.builder()
 * .from("from")
 * .replyTo("replyTo")
 * .build();
 * ```
 */
public interface EmailSettings {
  /**
   * The 'from' address on the emails received by the user.
   *
   * Default: noreply@verificationemail.com
   */
  public fun from(): String? = unwrap(this).getFrom()

  /**
   * The 'replyTo' address on the emails received by the user as defined by IETF RFC-5322.
   *
   * When set, most email clients recognize to change 'to' line to this address when a reply is
   * drafted.
   *
   * Default: - Not set.
   */
  public fun replyTo(): String? = unwrap(this).getReplyTo()

  /**
   * A builder for [EmailSettings]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param from The 'from' address on the emails received by the user.
     */
    public fun from(from: String)

    /**
     * @param replyTo The 'replyTo' address on the emails received by the user as defined by IETF
     * RFC-5322.
     * When set, most email clients recognize to change 'to' line to this address when a reply is
     * drafted.
     */
    public fun replyTo(replyTo: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.EmailSettings.Builder =
        software.amazon.awscdk.services.cognito.EmailSettings.builder()

    /**
     * @param from The 'from' address on the emails received by the user.
     */
    override fun from(from: String) {
      cdkBuilder.from(from)
    }

    /**
     * @param replyTo The 'replyTo' address on the emails received by the user as defined by IETF
     * RFC-5322.
     * When set, most email clients recognize to change 'to' line to this address when a reply is
     * drafted.
     */
    override fun replyTo(replyTo: String) {
      cdkBuilder.replyTo(replyTo)
    }

    public fun build(): software.amazon.awscdk.services.cognito.EmailSettings = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.EmailSettings,
  ) : CdkObject(cdkObject), EmailSettings {
    /**
     * The 'from' address on the emails received by the user.
     *
     * Default: noreply@verificationemail.com
     */
    override fun from(): String? = unwrap(this).getFrom()

    /**
     * The 'replyTo' address on the emails received by the user as defined by IETF RFC-5322.
     *
     * When set, most email clients recognize to change 'to' line to this address when a reply is
     * drafted.
     *
     * Default: - Not set.
     */
    override fun replyTo(): String? = unwrap(this).getReplyTo()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EmailSettings {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.EmailSettings):
        EmailSettings = CdkObjectWrappers.wrap(cdkObject) as? EmailSettings ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmailSettings):
        software.amazon.awscdk.services.cognito.EmailSettings = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.EmailSettings
  }
}
