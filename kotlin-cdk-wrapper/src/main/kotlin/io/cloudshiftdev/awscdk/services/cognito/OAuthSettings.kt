@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface OAuthSettings {
  public fun callbackUrls(): List<String> = unwrap(this).getCallbackUrls() ?: emptyList()

  public fun flows(): OAuthFlows? = unwrap(this).getFlows()?.let(OAuthFlows::wrap)

  public fun logoutUrls(): List<String> = unwrap(this).getLogoutUrls() ?: emptyList()

  public fun scopes(): List<OAuthScope> = unwrap(this).getScopes()?.map(OAuthScope::wrap) ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun callbackUrls(callbackUrls: List<String>)

    public fun callbackUrls(vararg callbackUrls: String)

    public fun flows(flows: OAuthFlows)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb93ec242576c1797aed90a7fd0d4beb2c24332026aa722bda799a62aa9f77fd")
    public fun flows(flows: OAuthFlows.Builder.() -> Unit)

    public fun logoutUrls(logoutUrls: List<String>)

    public fun logoutUrls(vararg logoutUrls: String)

    public fun scopes(scopes: List<OAuthScope>)

    public fun scopes(vararg scopes: OAuthScope)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.OAuthSettings.Builder =
        software.amazon.awscdk.services.cognito.OAuthSettings.builder()

    override fun callbackUrls(callbackUrls: List<String>) {
      cdkBuilder.callbackUrls(callbackUrls)
    }

    override fun callbackUrls(vararg callbackUrls: String): Unit =
        callbackUrls(callbackUrls.toList())

    override fun flows(flows: OAuthFlows) {
      cdkBuilder.flows(flows.let(OAuthFlows::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb93ec242576c1797aed90a7fd0d4beb2c24332026aa722bda799a62aa9f77fd")
    override fun flows(flows: OAuthFlows.Builder.() -> Unit): Unit = flows(OAuthFlows(flows))

    override fun logoutUrls(logoutUrls: List<String>) {
      cdkBuilder.logoutUrls(logoutUrls)
    }

    override fun logoutUrls(vararg logoutUrls: String): Unit = logoutUrls(logoutUrls.toList())

    override fun scopes(scopes: List<OAuthScope>) {
      cdkBuilder.scopes(scopes.map(OAuthScope::unwrap))
    }

    override fun scopes(vararg scopes: OAuthScope): Unit = scopes(scopes.toList())

    public fun build(): software.amazon.awscdk.services.cognito.OAuthSettings = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.OAuthSettings,
  ) : CdkObject(cdkObject), OAuthSettings {
    override fun callbackUrls(): List<String> = unwrap(this).getCallbackUrls() ?: emptyList()

    override fun flows(): OAuthFlows? = unwrap(this).getFlows()?.let(OAuthFlows::wrap)

    override fun logoutUrls(): List<String> = unwrap(this).getLogoutUrls() ?: emptyList()

    override fun scopes(): List<OAuthScope> = unwrap(this).getScopes()?.map(OAuthScope::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OAuthSettings {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.OAuthSettings):
        OAuthSettings = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OAuthSettings):
        software.amazon.awscdk.services.cognito.OAuthSettings = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.OAuthSettings
  }
}
