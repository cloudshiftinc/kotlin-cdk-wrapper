@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnWebhookProps {
  public fun authentication(): String

  public fun authenticationConfiguration(): Any

  public fun filters(): Any

  public fun name(): String? = unwrap(this).getName()

  public fun registerWithThirdParty(): Any? = unwrap(this).getRegisterWithThirdParty()

  public fun targetAction(): String

  public fun targetPipeline(): String

  public fun targetPipelineVersion(): Number

  @CdkDslMarker
  public interface Builder {
    public fun authentication(authentication: String)

    public fun authenticationConfiguration(authenticationConfiguration: IResolvable)

    public
        fun authenticationConfiguration(authenticationConfiguration: CfnWebhook.WebhookAuthConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72cc769a72a7c03ae5fb86b5d6df924f56c7dc693080b010e3e61daf78ef0e60")
    public
        fun authenticationConfiguration(authenticationConfiguration: CfnWebhook.WebhookAuthConfigurationProperty.Builder.() -> Unit)

    public fun filters(filters: IResolvable)

    public fun filters(filters: List<Any>)

    public fun filters(vararg filters: Any)

    public fun name(name: String)

    public fun registerWithThirdParty(registerWithThirdParty: Boolean)

    public fun registerWithThirdParty(registerWithThirdParty: IResolvable)

    public fun targetAction(targetAction: String)

    public fun targetPipeline(targetPipeline: String)

    public fun targetPipelineVersion(targetPipelineVersion: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.CfnWebhookProps.Builder =
        software.amazon.awscdk.services.codepipeline.CfnWebhookProps.builder()

    override fun authentication(authentication: String) {
      cdkBuilder.authentication(authentication)
    }

    override fun authenticationConfiguration(authenticationConfiguration: IResolvable) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(IResolvable::unwrap))
    }

    override
        fun authenticationConfiguration(authenticationConfiguration: CfnWebhook.WebhookAuthConfigurationProperty) {
      cdkBuilder.authenticationConfiguration(authenticationConfiguration.let(CfnWebhook.WebhookAuthConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72cc769a72a7c03ae5fb86b5d6df924f56c7dc693080b010e3e61daf78ef0e60")
    override
        fun authenticationConfiguration(authenticationConfiguration: CfnWebhook.WebhookAuthConfigurationProperty.Builder.() -> Unit):
        Unit =
        authenticationConfiguration(CfnWebhook.WebhookAuthConfigurationProperty(authenticationConfiguration))

    override fun filters(filters: IResolvable) {
      cdkBuilder.filters(filters.let(IResolvable::unwrap))
    }

    override fun filters(filters: List<Any>) {
      cdkBuilder.filters(filters)
    }

    override fun filters(vararg filters: Any): Unit = filters(filters.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun registerWithThirdParty(registerWithThirdParty: Boolean) {
      cdkBuilder.registerWithThirdParty(registerWithThirdParty)
    }

    override fun registerWithThirdParty(registerWithThirdParty: IResolvable) {
      cdkBuilder.registerWithThirdParty(registerWithThirdParty.let(IResolvable::unwrap))
    }

    override fun targetAction(targetAction: String) {
      cdkBuilder.targetAction(targetAction)
    }

    override fun targetPipeline(targetPipeline: String) {
      cdkBuilder.targetPipeline(targetPipeline)
    }

    override fun targetPipelineVersion(targetPipelineVersion: Number) {
      cdkBuilder.targetPipelineVersion(targetPipelineVersion)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CfnWebhookProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.CfnWebhookProps,
  ) : CdkObject(cdkObject), CfnWebhookProps {
    override fun authentication(): String = unwrap(this).getAuthentication()

    override fun authenticationConfiguration(): Any = unwrap(this).getAuthenticationConfiguration()

    override fun filters(): Any = unwrap(this).getFilters()

    override fun name(): String? = unwrap(this).getName()

    override fun registerWithThirdParty(): Any? = unwrap(this).getRegisterWithThirdParty()

    override fun targetAction(): String = unwrap(this).getTargetAction()

    override fun targetPipeline(): String = unwrap(this).getTargetPipeline()

    override fun targetPipelineVersion(): Number = unwrap(this).getTargetPipelineVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWebhookProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CfnWebhookProps):
        CfnWebhookProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWebhookProps):
        software.amazon.awscdk.services.codepipeline.CfnWebhookProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.CfnWebhookProps
  }
}
