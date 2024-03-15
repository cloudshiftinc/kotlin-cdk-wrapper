@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sam

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnHttpApiProps {
  public fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

  public fun auth(): Any? = unwrap(this).getAuth()

  public fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

  public fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

  public fun definitionBody(): Any? = unwrap(this).getDefinitionBody()

  public fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

  public fun description(): String? = unwrap(this).getDescription()

  public fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

  public fun domain(): Any? = unwrap(this).getDomain()

  public fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

  public fun routeSettings(): Any? = unwrap(this).getRouteSettings()

  public fun stageName(): String? = unwrap(this).getStageName()

  public fun stageVariables(): Any? = unwrap(this).getStageVariables()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun accessLogSetting(accessLogSetting: IResolvable)

    public fun accessLogSetting(accessLogSetting: CfnHttpApi.AccessLogSettingProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09068efdb9c2683f0c465bcd333d9cb540f38d182ef8e6f1fd06d3c0020f9f08")
    public
        fun accessLogSetting(accessLogSetting: CfnHttpApi.AccessLogSettingProperty.Builder.() -> Unit)

    public fun auth(auth: IResolvable)

    public fun auth(auth: CfnHttpApi.HttpApiAuthProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f63580763c1c4f282e993a4d241c9dfdf6ff645322ec977550b70a843ff388b1")
    public fun auth(auth: CfnHttpApi.HttpApiAuthProperty.Builder.() -> Unit)

    public fun corsConfiguration(corsConfiguration: Boolean)

    public fun corsConfiguration(corsConfiguration: IResolvable)

    public fun corsConfiguration(corsConfiguration: CfnHttpApi.CorsConfigurationObjectProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04c7c724eb84c5fdfd2634890a94e5551f9bc279a59f57e0f0e5c233a7154872")
    public
        fun corsConfiguration(corsConfiguration: CfnHttpApi.CorsConfigurationObjectProperty.Builder.() -> Unit)

    public fun defaultRouteSettings(defaultRouteSettings: IResolvable)

    public fun defaultRouteSettings(defaultRouteSettings: CfnHttpApi.RouteSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65f4ec663cd5480f7e8233e73433e961a964e7014b4d040ecea147f0c8b95003")
    public
        fun defaultRouteSettings(defaultRouteSettings: CfnHttpApi.RouteSettingsProperty.Builder.() -> Unit)

    public fun definitionBody(definitionBody: Any)

    public fun definitionUri(definitionUri: String)

    public fun definitionUri(definitionUri: IResolvable)

    public fun definitionUri(definitionUri: CfnHttpApi.S3LocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99c215c313f32e6960f1c476d76c3307143942b6baf77187dfc3b22aafbe959f")
    public fun definitionUri(definitionUri: CfnHttpApi.S3LocationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean)

    public fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable)

    public fun domain(domain: IResolvable)

    public fun domain(domain: CfnHttpApi.HttpApiDomainConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b1d044c1c3abeb9be9a10633c951afe09ea79f29f365a611869222784109060")
    public fun domain(domain: CfnHttpApi.HttpApiDomainConfigurationProperty.Builder.() -> Unit)

    public fun failOnWarnings(failOnWarnings: Boolean)

    public fun failOnWarnings(failOnWarnings: IResolvable)

    public fun routeSettings(routeSettings: IResolvable)

    public fun routeSettings(routeSettings: CfnHttpApi.RouteSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f6ecd638f87106f3f69085fbadbb9a571e27b70bf22fb2996c5968efb64ba40")
    public fun routeSettings(routeSettings: CfnHttpApi.RouteSettingsProperty.Builder.() -> Unit)

    public fun stageName(stageName: String)

    public fun stageVariables(stageVariables: IResolvable)

    public fun stageVariables(stageVariables: Map<String, String>)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sam.CfnHttpApiProps.Builder =
        software.amazon.awscdk.services.sam.CfnHttpApiProps.builder()

    override fun accessLogSetting(accessLogSetting: IResolvable) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(IResolvable::unwrap))
    }

    override fun accessLogSetting(accessLogSetting: CfnHttpApi.AccessLogSettingProperty) {
      cdkBuilder.accessLogSetting(accessLogSetting.let(CfnHttpApi.AccessLogSettingProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09068efdb9c2683f0c465bcd333d9cb540f38d182ef8e6f1fd06d3c0020f9f08")
    override
        fun accessLogSetting(accessLogSetting: CfnHttpApi.AccessLogSettingProperty.Builder.() -> Unit):
        Unit = accessLogSetting(CfnHttpApi.AccessLogSettingProperty(accessLogSetting))

    override fun auth(auth: IResolvable) {
      cdkBuilder.auth(auth.let(IResolvable::unwrap))
    }

    override fun auth(auth: CfnHttpApi.HttpApiAuthProperty) {
      cdkBuilder.auth(auth.let(CfnHttpApi.HttpApiAuthProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f63580763c1c4f282e993a4d241c9dfdf6ff645322ec977550b70a843ff388b1")
    override fun auth(auth: CfnHttpApi.HttpApiAuthProperty.Builder.() -> Unit): Unit =
        auth(CfnHttpApi.HttpApiAuthProperty(auth))

    override fun corsConfiguration(corsConfiguration: Boolean) {
      cdkBuilder.corsConfiguration(corsConfiguration)
    }

    override fun corsConfiguration(corsConfiguration: IResolvable) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(IResolvable::unwrap))
    }

    override fun corsConfiguration(corsConfiguration: CfnHttpApi.CorsConfigurationObjectProperty) {
      cdkBuilder.corsConfiguration(corsConfiguration.let(CfnHttpApi.CorsConfigurationObjectProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("04c7c724eb84c5fdfd2634890a94e5551f9bc279a59f57e0f0e5c233a7154872")
    override
        fun corsConfiguration(corsConfiguration: CfnHttpApi.CorsConfigurationObjectProperty.Builder.() -> Unit):
        Unit = corsConfiguration(CfnHttpApi.CorsConfigurationObjectProperty(corsConfiguration))

    override fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(IResolvable::unwrap))
    }

    override fun defaultRouteSettings(defaultRouteSettings: CfnHttpApi.RouteSettingsProperty) {
      cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(CfnHttpApi.RouteSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65f4ec663cd5480f7e8233e73433e961a964e7014b4d040ecea147f0c8b95003")
    override
        fun defaultRouteSettings(defaultRouteSettings: CfnHttpApi.RouteSettingsProperty.Builder.() -> Unit):
        Unit = defaultRouteSettings(CfnHttpApi.RouteSettingsProperty(defaultRouteSettings))

    override fun definitionBody(definitionBody: Any) {
      cdkBuilder.definitionBody(definitionBody)
    }

    override fun definitionUri(definitionUri: String) {
      cdkBuilder.definitionUri(definitionUri)
    }

    override fun definitionUri(definitionUri: IResolvable) {
      cdkBuilder.definitionUri(definitionUri.let(IResolvable::unwrap))
    }

    override fun definitionUri(definitionUri: CfnHttpApi.S3LocationProperty) {
      cdkBuilder.definitionUri(definitionUri.let(CfnHttpApi.S3LocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("99c215c313f32e6960f1c476d76c3307143942b6baf77187dfc3b22aafbe959f")
    override fun definitionUri(definitionUri: CfnHttpApi.S3LocationProperty.Builder.() -> Unit):
        Unit = definitionUri(CfnHttpApi.S3LocationProperty(definitionUri))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: Boolean) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint)
    }

    override fun disableExecuteApiEndpoint(disableExecuteApiEndpoint: IResolvable) {
      cdkBuilder.disableExecuteApiEndpoint(disableExecuteApiEndpoint.let(IResolvable::unwrap))
    }

    override fun domain(domain: IResolvable) {
      cdkBuilder.domain(domain.let(IResolvable::unwrap))
    }

    override fun domain(domain: CfnHttpApi.HttpApiDomainConfigurationProperty) {
      cdkBuilder.domain(domain.let(CfnHttpApi.HttpApiDomainConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4b1d044c1c3abeb9be9a10633c951afe09ea79f29f365a611869222784109060")
    override fun domain(domain: CfnHttpApi.HttpApiDomainConfigurationProperty.Builder.() -> Unit):
        Unit = domain(CfnHttpApi.HttpApiDomainConfigurationProperty(domain))

    override fun failOnWarnings(failOnWarnings: Boolean) {
      cdkBuilder.failOnWarnings(failOnWarnings)
    }

    override fun failOnWarnings(failOnWarnings: IResolvable) {
      cdkBuilder.failOnWarnings(failOnWarnings.let(IResolvable::unwrap))
    }

    override fun routeSettings(routeSettings: IResolvable) {
      cdkBuilder.routeSettings(routeSettings.let(IResolvable::unwrap))
    }

    override fun routeSettings(routeSettings: CfnHttpApi.RouteSettingsProperty) {
      cdkBuilder.routeSettings(routeSettings.let(CfnHttpApi.RouteSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f6ecd638f87106f3f69085fbadbb9a571e27b70bf22fb2996c5968efb64ba40")
    override fun routeSettings(routeSettings: CfnHttpApi.RouteSettingsProperty.Builder.() -> Unit):
        Unit = routeSettings(CfnHttpApi.RouteSettingsProperty(routeSettings))

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun stageVariables(stageVariables: IResolvable) {
      cdkBuilder.stageVariables(stageVariables.let(IResolvable::unwrap))
    }

    override fun stageVariables(stageVariables: Map<String, String>) {
      cdkBuilder.stageVariables(stageVariables)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.sam.CfnHttpApiProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sam.CfnHttpApiProps,
  ) : CdkObject(cdkObject), CfnHttpApiProps {
    override fun accessLogSetting(): Any? = unwrap(this).getAccessLogSetting()

    override fun auth(): Any? = unwrap(this).getAuth()

    override fun corsConfiguration(): Any? = unwrap(this).getCorsConfiguration()

    override fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

    override fun definitionBody(): Any? = unwrap(this).getDefinitionBody()

    override fun definitionUri(): Any? = unwrap(this).getDefinitionUri()

    override fun description(): String? = unwrap(this).getDescription()

    override fun disableExecuteApiEndpoint(): Any? = unwrap(this).getDisableExecuteApiEndpoint()

    override fun domain(): Any? = unwrap(this).getDomain()

    override fun failOnWarnings(): Any? = unwrap(this).getFailOnWarnings()

    override fun routeSettings(): Any? = unwrap(this).getRouteSettings()

    override fun stageName(): String? = unwrap(this).getStageName()

    override fun stageVariables(): Any? = unwrap(this).getStageVariables()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHttpApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sam.CfnHttpApiProps):
        CfnHttpApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHttpApiProps):
        software.amazon.awscdk.services.sam.CfnHttpApiProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sam.CfnHttpApiProps
  }
}
