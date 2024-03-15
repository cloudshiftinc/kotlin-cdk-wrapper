@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class Authorization internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.events.Authorization,
) : CdkObject(cdkObject) {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.Authorization,
  ) : Authorization(cdkObject)

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
        Authorization = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Authorization):
        software.amazon.awscdk.services.events.Authorization = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.events.Authorization
  }
}
