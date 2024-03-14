package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface OAuthSettings {
  public fun callbackUrls(): List<String> = unwrap(this).getCallbackUrls() ?: emptyList()

  public fun flows(): OAuthFlows? = unwrap(this).getFlows()?.let(OAuthFlows::wrap)

  public fun logoutUrls(): List<String> = unwrap(this).getLogoutUrls() ?: emptyList()

  public fun scopes(): List<OAuthScope> = unwrap(this).getScopes()?.map(OAuthScope::wrap) ?:
      emptyList()

  public interface Builder {
    public fun callbackUrls(callbackUrls: List<String>)

    public fun flows(flows: OAuthFlows)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb93ec242576c1797aed90a7fd0d4beb2c24332026aa722bda799a62aa9f77fd")
    public fun flows(flows: OAuthFlows.Builder.() -> Unit)

    public fun logoutUrls(logoutUrls: List<String>)

    public fun scopes(scopes: List<OAuthScope>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.OAuthSettings.Builder =
        software.amazon.awscdk.services.cognito.OAuthSettings.builder()

    override fun callbackUrls(callbackUrls: List<String>) {
      cdkBuilder.callbackUrls(callbackUrls)
    }

    override fun flows(flows: OAuthFlows) {
      cdkBuilder.flows(flows.let(OAuthFlows::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb93ec242576c1797aed90a7fd0d4beb2c24332026aa722bda799a62aa9f77fd")
    override fun flows(flows: OAuthFlows.Builder.() -> Unit): Unit = flows(OAuthFlows(flows))

    override fun logoutUrls(logoutUrls: List<String>) {
      cdkBuilder.logoutUrls(logoutUrls)
    }

    override fun scopes(scopes: List<OAuthScope>) {
      cdkBuilder.scopes(scopes.map(OAuthScope::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.OAuthSettings = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.OAuthSettings,
  ) : OAuthSettings {
    override fun callbackUrls(): List<String> = unwrap(this).getCallbackUrls() ?: emptyList()

    override fun flows(): OAuthFlows? = unwrap(this).getFlows()?.let(OAuthFlows::wrap)

    override fun logoutUrls(): List<String> = unwrap(this).getLogoutUrls() ?: emptyList()

    override fun scopes(): List<OAuthScope> = unwrap(this).getScopes()?.map(OAuthScope::wrap) ?:
        emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): OAuthSettings {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.OAuthSettings):
        OAuthSettings = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OAuthSettings):
        software.amazon.awscdk.services.cognito.OAuthSettings = (wrapped as Wrapper).cdkObject
  }
}
