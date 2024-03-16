@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Authorization type for an API Destination Connection.
 *
 * Example:
 *
 * ```
 * Connection connection = Connection.Builder.create(this, "Connection")
 * .authorization(Authorization.apiKey("x-api-key", SecretValue.secretsManager("ApiSecretName")))
 * .description("Connection with API Key x-api-key")
 * .build();
 * ApiDestination destination = ApiDestination.Builder.create(this, "Destination")
 * .connection(connection)
 * .endpoint("https://example.com")
 * .description("Calling example.com with API key x-api-key")
 * .build();
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.minutes(1)))
 * .targets(List.of(new ApiDestination(destination)))
 * .build();
 * ```
 */
public abstract class Authorization internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.Authorization,
) : CdkObject(cdkObject) {
  public companion object {
    public fun apiKey(apiKeyName: String, apiKeyValue: SecretValue): Authorization =
        software.amazon.awscdk.services.events.Authorization.apiKey(apiKeyName,
        apiKeyValue.let(SecretValue::unwrap)).let(Authorization::wrap)

    public fun basic(username: String, password: SecretValue): Authorization =
        software.amazon.awscdk.services.events.Authorization.basic(username,
        password.let(SecretValue::unwrap)).let(Authorization::wrap)

    public fun oauth(props: OAuthAuthorizationProps): Authorization =
        software.amazon.awscdk.services.events.Authorization.oauth(props.let(OAuthAuthorizationProps::unwrap)).let(Authorization::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("44cf2a39827872cbac58a8e44ba686c1673ce7401835019919d576c9e95ec701")
    public fun oauth(props: OAuthAuthorizationProps.Builder.() -> Unit): Authorization =
        oauth(OAuthAuthorizationProps(props))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.Authorization):
        Authorization = CdkObjectWrappers.wrap(cdkObject) as Authorization

    internal fun unwrap(wrapped: Authorization):
        software.amazon.awscdk.services.events.Authorization = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.Authorization
  }
}
