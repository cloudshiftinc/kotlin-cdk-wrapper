package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.SecretValue
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Authorization internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.Authorization,
) {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.events.Authorization,
  ) : Authorization(cdkObject)

  public companion object {
    public open fun apiKey(apiKeyName: String, apiKeyValue: SecretValue): Authorization =
        software.amazon.awscdk.services.events.Authorization.apiKey(apiKeyName,
        apiKeyValue.let(SecretValue::unwrap)).let(Authorization::wrap)

    public open fun basic(username: String, password: SecretValue): Authorization =
        software.amazon.awscdk.services.events.Authorization.basic(username,
        password.let(SecretValue::unwrap)).let(Authorization::wrap)

    public open fun oauth(props: OAuthAuthorizationProps): Authorization =
        software.amazon.awscdk.services.events.Authorization.oauth(props.let(OAuthAuthorizationProps::unwrap)).let(Authorization::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44cf2a39827872cbac58a8e44ba686c1673ce7401835019919d576c9e95ec701")
    public open fun oauth(props: OAuthAuthorizationProps.Builder.() -> Unit): Authorization =
        oauth(OAuthAuthorizationProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.Authorization):
        Authorization = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Authorization):
        software.amazon.awscdk.services.events.Authorization = (wrapped as Wrapper).cdkObject
  }
}
