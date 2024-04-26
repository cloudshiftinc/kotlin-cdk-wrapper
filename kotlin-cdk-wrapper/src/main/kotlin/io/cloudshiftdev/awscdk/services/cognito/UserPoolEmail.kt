@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Configure how Cognito sends emails.
 *
 * Example:
 *
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * .email(UserPoolEmail.withSES(UserPoolSESOptions.builder()
 * .fromEmail("noreply&#64;myawesomeapp.com")
 * .fromName("Awesome App")
 * .replyTo("support&#64;myawesomeapp.com")
 * .build()))
 * .build();
 * ```
 */
public abstract class UserPoolEmail(
  cdkObject: software.amazon.awscdk.services.cognito.UserPoolEmail,
) : CdkObject(cdkObject) {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.UserPoolEmail,
  ) : UserPoolEmail(cdkObject)

  public companion object {
    public fun withCognito(): UserPoolEmail =
        software.amazon.awscdk.services.cognito.UserPoolEmail.withCognito().let(UserPoolEmail::wrap)

    public fun withCognito(replyTo: String): UserPoolEmail =
        software.amazon.awscdk.services.cognito.UserPoolEmail.withCognito(replyTo).let(UserPoolEmail::wrap)

    public fun withSES(options: UserPoolSESOptions): UserPoolEmail =
        software.amazon.awscdk.services.cognito.UserPoolEmail.withSES(options.let(UserPoolSESOptions::unwrap)).let(UserPoolEmail::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9e7aea2e201aad045c9833224b0201605c7bf4c957cb5e589fe1dc1de7dbbb79")
    public fun withSES(options: UserPoolSESOptions.Builder.() -> Unit): UserPoolEmail =
        withSES(UserPoolSESOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolEmail):
        UserPoolEmail = CdkObjectWrappers.wrap(cdkObject) as? UserPoolEmail ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolEmail):
        software.amazon.awscdk.services.cognito.UserPoolEmail = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolEmail
  }
}
