@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface OpenIdConnectConfig {
  public fun clientId(): String? = unwrap(this).getClientId()

  public fun oidcProvider(): String

  public fun tokenExpiryFromAuth(): Number? = unwrap(this).getTokenExpiryFromAuth()

  public fun tokenExpiryFromIssue(): Number? = unwrap(this).getTokenExpiryFromIssue()

  @CdkDslMarker
  public interface Builder {
    public fun clientId(clientId: String)

    public fun oidcProvider(oidcProvider: String)

    public fun tokenExpiryFromAuth(tokenExpiryFromAuth: Number)

    public fun tokenExpiryFromIssue(tokenExpiryFromIssue: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.OpenIdConnectConfig.Builder =
        software.amazon.awscdk.services.appsync.OpenIdConnectConfig.builder()

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override fun oidcProvider(oidcProvider: String) {
      cdkBuilder.oidcProvider(oidcProvider)
    }

    override fun tokenExpiryFromAuth(tokenExpiryFromAuth: Number) {
      cdkBuilder.tokenExpiryFromAuth(tokenExpiryFromAuth)
    }

    override fun tokenExpiryFromIssue(tokenExpiryFromIssue: Number) {
      cdkBuilder.tokenExpiryFromIssue(tokenExpiryFromIssue)
    }

    public fun build(): software.amazon.awscdk.services.appsync.OpenIdConnectConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.OpenIdConnectConfig,
  ) : CdkObject(cdkObject), OpenIdConnectConfig {
    override fun clientId(): String? = unwrap(this).getClientId()

    override fun oidcProvider(): String = unwrap(this).getOidcProvider()

    override fun tokenExpiryFromAuth(): Number? = unwrap(this).getTokenExpiryFromAuth()

    override fun tokenExpiryFromIssue(): Number? = unwrap(this).getTokenExpiryFromIssue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OpenIdConnectConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.OpenIdConnectConfig):
        OpenIdConnectConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectConfig):
        software.amazon.awscdk.services.appsync.OpenIdConnectConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.OpenIdConnectConfig
  }
}
