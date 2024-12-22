@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Result of binding email settings with a user pool.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * UserPoolEmailConfig userPoolEmailConfig = UserPoolEmailConfig.builder()
 * .configurationSet("configurationSet")
 * .emailSendingAccount("emailSendingAccount")
 * .from("from")
 * .replyToEmailAddress("replyToEmailAddress")
 * .sourceArn("sourceArn")
 * .build();
 * ```
 */
public interface UserPoolEmailConfig {
  /**
   * The name of the configuration set in SES.
   *
   * Default: - none
   */
  public fun configurationSet(): String? = unwrap(this).getConfigurationSet()

  /**
   * Specifies whether to use Cognito's built in email functionality or SES.
   *
   * Default: - Cognito built in email functionality
   */
  public fun emailSendingAccount(): String? = unwrap(this).getEmailSendingAccount()

  /**
   * Identifies either the sender's email address or the sender's name with their email address.
   *
   * If emailSendingAccount is DEVELOPER then this cannot be specified.
   *
   * Default: 'no-reply@verificationemail.com'
   */
  public fun from(): String? = unwrap(this).getFrom()

  /**
   * The destination to which the receiver of the email should reply to.
   *
   * Default: - same as `from`
   */
  public fun replyToEmailAddress(): String? = unwrap(this).getReplyToEmailAddress()

  /**
   * The ARN of a verified email address in Amazon SES.
   *
   * required if emailSendingAccount is DEVELOPER or if
   * 'from' is provided.
   *
   * Default: - none
   */
  public fun sourceArn(): String? = unwrap(this).getSourceArn()

  /**
   * A builder for [UserPoolEmailConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationSet The name of the configuration set in SES.
     */
    public fun configurationSet(configurationSet: String)

    /**
     * @param emailSendingAccount Specifies whether to use Cognito's built in email functionality or
     * SES.
     */
    public fun emailSendingAccount(emailSendingAccount: String)

    /**
     * @param from Identifies either the sender's email address or the sender's name with their
     * email address.
     * If emailSendingAccount is DEVELOPER then this cannot be specified.
     */
    public fun from(from: String)

    /**
     * @param replyToEmailAddress The destination to which the receiver of the email should reply
     * to.
     */
    public fun replyToEmailAddress(replyToEmailAddress: String)

    /**
     * @param sourceArn The ARN of a verified email address in Amazon SES.
     * required if emailSendingAccount is DEVELOPER or if
     * 'from' is provided.
     */
    public fun sourceArn(sourceArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolEmailConfig.Builder =
        software.amazon.awscdk.services.cognito.UserPoolEmailConfig.builder()

    /**
     * @param configurationSet The name of the configuration set in SES.
     */
    override fun configurationSet(configurationSet: String) {
      cdkBuilder.configurationSet(configurationSet)
    }

    /**
     * @param emailSendingAccount Specifies whether to use Cognito's built in email functionality or
     * SES.
     */
    override fun emailSendingAccount(emailSendingAccount: String) {
      cdkBuilder.emailSendingAccount(emailSendingAccount)
    }

    /**
     * @param from Identifies either the sender's email address or the sender's name with their
     * email address.
     * If emailSendingAccount is DEVELOPER then this cannot be specified.
     */
    override fun from(from: String) {
      cdkBuilder.from(from)
    }

    /**
     * @param replyToEmailAddress The destination to which the receiver of the email should reply
     * to.
     */
    override fun replyToEmailAddress(replyToEmailAddress: String) {
      cdkBuilder.replyToEmailAddress(replyToEmailAddress)
    }

    /**
     * @param sourceArn The ARN of a verified email address in Amazon SES.
     * required if emailSendingAccount is DEVELOPER or if
     * 'from' is provided.
     */
    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolEmailConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.UserPoolEmailConfig,
  ) : CdkObject(cdkObject),
      UserPoolEmailConfig {
    /**
     * The name of the configuration set in SES.
     *
     * Default: - none
     */
    override fun configurationSet(): String? = unwrap(this).getConfigurationSet()

    /**
     * Specifies whether to use Cognito's built in email functionality or SES.
     *
     * Default: - Cognito built in email functionality
     */
    override fun emailSendingAccount(): String? = unwrap(this).getEmailSendingAccount()

    /**
     * Identifies either the sender's email address or the sender's name with their email address.
     *
     * If emailSendingAccount is DEVELOPER then this cannot be specified.
     *
     * Default: 'no-reply@verificationemail.com'
     */
    override fun from(): String? = unwrap(this).getFrom()

    /**
     * The destination to which the receiver of the email should reply to.
     *
     * Default: - same as `from`
     */
    override fun replyToEmailAddress(): String? = unwrap(this).getReplyToEmailAddress()

    /**
     * The ARN of a verified email address in Amazon SES.
     *
     * required if emailSendingAccount is DEVELOPER or if
     * 'from' is provided.
     *
     * Default: - none
     */
    override fun sourceArn(): String? = unwrap(this).getSourceArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolEmailConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolEmailConfig):
        UserPoolEmailConfig = CdkObjectWrappers.wrap(cdkObject) as? UserPoolEmailConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolEmailConfig):
        software.amazon.awscdk.services.cognito.UserPoolEmailConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolEmailConfig
  }
}
