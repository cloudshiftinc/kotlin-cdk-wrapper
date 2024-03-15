@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnIdentityPoolProps {
  public fun allowClassicFlow(): Any? = unwrap(this).getAllowClassicFlow()

  public fun allowUnauthenticatedIdentities(): Any

  public fun cognitoEvents(): Any? = unwrap(this).getCognitoEvents()

  public fun cognitoIdentityProviders(): Any? = unwrap(this).getCognitoIdentityProviders()

  public fun cognitoStreams(): Any? = unwrap(this).getCognitoStreams()

  public fun developerProviderName(): String? = unwrap(this).getDeveloperProviderName()

  public fun identityPoolName(): String? = unwrap(this).getIdentityPoolName()

  public fun openIdConnectProviderArns(): List<String> = unwrap(this).getOpenIdConnectProviderArns()
      ?: emptyList()

  public fun pushSync(): Any? = unwrap(this).getPushSync()

  public fun samlProviderArns(): List<String> = unwrap(this).getSamlProviderArns() ?: emptyList()

  public fun supportedLoginProviders(): Any? = unwrap(this).getSupportedLoginProviders()

  @CdkDslMarker
  public interface Builder {
    public fun allowClassicFlow(allowClassicFlow: Boolean)

    public fun allowClassicFlow(allowClassicFlow: IResolvable)

    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean)

    public fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: IResolvable)

    public fun cognitoEvents(cognitoEvents: Any)

    public fun cognitoIdentityProviders(cognitoIdentityProviders: IResolvable)

    public fun cognitoIdentityProviders(cognitoIdentityProviders: List<Any>)

    public fun cognitoIdentityProviders(vararg cognitoIdentityProviders: Any)

    public fun cognitoStreams(cognitoStreams: IResolvable)

    public fun cognitoStreams(cognitoStreams: CfnIdentityPool.CognitoStreamsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b59e4a67df699881b03636f25fa112dd34b2c47382df6514c91e2793572f65b7")
    public
        fun cognitoStreams(cognitoStreams: CfnIdentityPool.CognitoStreamsProperty.Builder.() -> Unit)

    public fun developerProviderName(developerProviderName: String)

    public fun identityPoolName(identityPoolName: String)

    public fun openIdConnectProviderArns(openIdConnectProviderArns: List<String>)

    public fun openIdConnectProviderArns(vararg openIdConnectProviderArns: String)

    public fun pushSync(pushSync: IResolvable)

    public fun pushSync(pushSync: CfnIdentityPool.PushSyncProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18595faa47ae849212f83cf0b41293977e259ae07f849891bf7fad9121bf583d")
    public fun pushSync(pushSync: CfnIdentityPool.PushSyncProperty.Builder.() -> Unit)

    public fun samlProviderArns(samlProviderArns: List<String>)

    public fun samlProviderArns(vararg samlProviderArns: String)

    public fun supportedLoginProviders(supportedLoginProviders: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.Builder =
        software.amazon.awscdk.services.cognito.CfnIdentityPoolProps.builder()

    override fun allowClassicFlow(allowClassicFlow: Boolean) {
      cdkBuilder.allowClassicFlow(allowClassicFlow)
    }

    override fun allowClassicFlow(allowClassicFlow: IResolvable) {
      cdkBuilder.allowClassicFlow(allowClassicFlow.let(IResolvable::unwrap))
    }

    override fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: Boolean) {
      cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities)
    }

    override fun allowUnauthenticatedIdentities(allowUnauthenticatedIdentities: IResolvable) {
      cdkBuilder.allowUnauthenticatedIdentities(allowUnauthenticatedIdentities.let(IResolvable::unwrap))
    }

    override fun cognitoEvents(cognitoEvents: Any) {
      cdkBuilder.cognitoEvents(cognitoEvents)
    }

    override fun cognitoIdentityProviders(cognitoIdentityProviders: IResolvable) {
      cdkBuilder.cognitoIdentityProviders(cognitoIdentityProviders.let(IResolvable::unwrap))
    }

    override fun cognitoIdentityProviders(cognitoIdentityProviders: List<Any>) {
      cdkBuilder.cognitoIdentityProviders(cognitoIdentityProviders)
    }

    override fun cognitoIdentityProviders(vararg cognitoIdentityProviders: Any): Unit =
        cognitoIdentityProviders(cognitoIdentityProviders.toList())

    override fun cognitoStreams(cognitoStreams: IResolvable) {
      cdkBuilder.cognitoStreams(cognitoStreams.let(IResolvable::unwrap))
    }

    override fun cognitoStreams(cognitoStreams: CfnIdentityPool.CognitoStreamsProperty) {
      cdkBuilder.cognitoStreams(cognitoStreams.let(CfnIdentityPool.CognitoStreamsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b59e4a67df699881b03636f25fa112dd34b2c47382df6514c91e2793572f65b7")
    override
        fun cognitoStreams(cognitoStreams: CfnIdentityPool.CognitoStreamsProperty.Builder.() -> Unit):
        Unit = cognitoStreams(CfnIdentityPool.CognitoStreamsProperty(cognitoStreams))

    override fun developerProviderName(developerProviderName: String) {
      cdkBuilder.developerProviderName(developerProviderName)
    }

    override fun identityPoolName(identityPoolName: String) {
      cdkBuilder.identityPoolName(identityPoolName)
    }

    override fun openIdConnectProviderArns(openIdConnectProviderArns: List<String>) {
      cdkBuilder.openIdConnectProviderArns(openIdConnectProviderArns)
    }

    override fun openIdConnectProviderArns(vararg openIdConnectProviderArns: String): Unit =
        openIdConnectProviderArns(openIdConnectProviderArns.toList())

    override fun pushSync(pushSync: IResolvable) {
      cdkBuilder.pushSync(pushSync.let(IResolvable::unwrap))
    }

    override fun pushSync(pushSync: CfnIdentityPool.PushSyncProperty) {
      cdkBuilder.pushSync(pushSync.let(CfnIdentityPool.PushSyncProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18595faa47ae849212f83cf0b41293977e259ae07f849891bf7fad9121bf583d")
    override fun pushSync(pushSync: CfnIdentityPool.PushSyncProperty.Builder.() -> Unit): Unit =
        pushSync(CfnIdentityPool.PushSyncProperty(pushSync))

    override fun samlProviderArns(samlProviderArns: List<String>) {
      cdkBuilder.samlProviderArns(samlProviderArns)
    }

    override fun samlProviderArns(vararg samlProviderArns: String): Unit =
        samlProviderArns(samlProviderArns.toList())

    override fun supportedLoginProviders(supportedLoginProviders: Any) {
      cdkBuilder.supportedLoginProviders(supportedLoginProviders)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnIdentityPoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolProps,
  ) : CdkObject(cdkObject), CfnIdentityPoolProps {
    override fun allowClassicFlow(): Any? = unwrap(this).getAllowClassicFlow()

    override fun allowUnauthenticatedIdentities(): Any =
        unwrap(this).getAllowUnauthenticatedIdentities()

    override fun cognitoEvents(): Any? = unwrap(this).getCognitoEvents()

    override fun cognitoIdentityProviders(): Any? = unwrap(this).getCognitoIdentityProviders()

    override fun cognitoStreams(): Any? = unwrap(this).getCognitoStreams()

    override fun developerProviderName(): String? = unwrap(this).getDeveloperProviderName()

    override fun identityPoolName(): String? = unwrap(this).getIdentityPoolName()

    override fun openIdConnectProviderArns(): List<String> =
        unwrap(this).getOpenIdConnectProviderArns() ?: emptyList()

    override fun pushSync(): Any? = unwrap(this).getPushSync()

    override fun samlProviderArns(): List<String> = unwrap(this).getSamlProviderArns() ?:
        emptyList()

    override fun supportedLoginProviders(): Any? = unwrap(this).getSupportedLoginProviders()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdentityPoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnIdentityPoolProps):
        CfnIdentityPoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdentityPoolProps):
        software.amazon.awscdk.services.cognito.CfnIdentityPoolProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CfnIdentityPoolProps
  }
}
