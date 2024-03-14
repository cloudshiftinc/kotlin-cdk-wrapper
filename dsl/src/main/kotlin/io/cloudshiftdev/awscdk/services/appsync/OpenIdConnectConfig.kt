package io.cloudshiftdev.awscdk.services.appsync

import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface OpenIdConnectConfig {
  public fun clientId(): String? = unwrap(this).getClientId()

  public fun oidcProvider(): String

  public fun tokenExpiryFromAuth(): Number? = unwrap(this).getTokenExpiryFromAuth()

  public fun tokenExpiryFromIssue(): Number? = unwrap(this).getTokenExpiryFromIssue()

  public interface Builder {
    public fun clientId(clientId: String) {
    }

    public fun oidcProvider(oidcProvider: String) {
    }

    public fun tokenExpiryFromAuth(tokenExpiryFromAuth: Number) {
    }

    public fun tokenExpiryFromIssue(tokenExpiryFromIssue: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.OpenIdConnectConfig.Builder =
        software.amazon.awscdk.services.appsync.OpenIdConnectConfig.builder()

    public override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    public override fun oidcProvider(oidcProvider: String) {
      cdkBuilder.oidcProvider(oidcProvider)
    }

    public override fun tokenExpiryFromAuth(tokenExpiryFromAuth: Number) {
      cdkBuilder.tokenExpiryFromAuth(tokenExpiryFromAuth)
    }

    public override fun tokenExpiryFromIssue(tokenExpiryFromIssue: Number) {
      cdkBuilder.tokenExpiryFromIssue(tokenExpiryFromIssue)
    }

    public fun build(): software.amazon.awscdk.services.appsync.OpenIdConnectConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.OpenIdConnectConfig,
  ) : OpenIdConnectConfig {
    public override fun clientId(): String? = unwrap(this).getClientId()

    public override fun oidcProvider(): String = unwrap(this).getOidcProvider()

    public override fun tokenExpiryFromAuth(): Number? = unwrap(this).getTokenExpiryFromAuth()

    public override fun tokenExpiryFromIssue(): Number? = unwrap(this).getTokenExpiryFromIssue()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OpenIdConnectConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.OpenIdConnectConfig):
        OpenIdConnectConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectConfig):
        software.amazon.awscdk.services.appsync.OpenIdConnectConfig = (wrapped as Wrapper).cdkObject
  }
}
