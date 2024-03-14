package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class UserPoolEmail internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cognito.UserPoolEmail,
) {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.UserPoolEmail,
  ) : UserPoolEmail(cdkObject)

  public companion object {
    public fun withCognito(): UserPoolEmail =
        software.amazon.awscdk.services.cognito.UserPoolEmail.withCognito().let(UserPoolEmail::wrap)

    public fun withCognito(replyTo: String): UserPoolEmail =
        software.amazon.awscdk.services.cognito.UserPoolEmail.withCognito(replyTo).let(UserPoolEmail::wrap)

    public fun withSes(options: UserPoolSESOptions): UserPoolEmail =
        software.amazon.awscdk.services.cognito.UserPoolEmail.withSES(options.let(UserPoolSESOptions::unwrap)).let(UserPoolEmail::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("936601e098b55fdc321a4be6ec6742fa825f535416e14399c65ae36e1d5754de")
    public fun withSes(options: UserPoolSESOptions.Builder.() -> Unit): UserPoolEmail =
        withSes(UserPoolSESOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolEmail):
        UserPoolEmail = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolEmail):
        software.amazon.awscdk.services.cognito.UserPoolEmail = (wrapped as Wrapper).cdkObject
  }
}
