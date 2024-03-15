@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpStageProps : HttpStageOptions {
  public fun httpApi(): IHttpApi

  @CdkDslMarker
  public interface Builder {
    public fun autoDeploy(autoDeploy: Boolean)

    public fun domainMapping(domainMapping: DomainMappingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("385ec8b0bea636f706c599561ccaee3a7e0211ebd0de5a8ff7471c2c17f3c7f3")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit)

    public fun httpApi(httpApi: IHttpApi)

    public fun stageName(stageName: String)

    public fun throttle(throttle: ThrottleSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3921d028019cc7a6ee859064f6924e15d6b6779dd77bf6f9f79ced4aa069b19")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpStageProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpStageProps.builder()

    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    override fun domainMapping(domainMapping: DomainMappingOptions) {
      cdkBuilder.domainMapping(domainMapping.let(DomainMappingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("385ec8b0bea636f706c599561ccaee3a7e0211ebd0de5a8ff7471c2c17f3c7f3")
    override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit =
        domainMapping(DomainMappingOptions(domainMapping))

    override fun httpApi(httpApi: IHttpApi) {
      cdkBuilder.httpApi(httpApi.let(IHttpApi::unwrap))
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3921d028019cc7a6ee859064f6924e15d6b6779dd77bf6f9f79ced4aa069b19")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpStageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageProps,
  ) : CdkObject(cdkObject), HttpStageProps {
    override fun autoDeploy(): Boolean? = unwrap(this).getAutoDeploy()

    override fun domainMapping(): DomainMappingOptions? =
        unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

    override fun httpApi(): IHttpApi = unwrap(this).getHttpApi().let(IHttpApi::wrap)

    override fun stageName(): String? = unwrap(this).getStageName()

    override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpStageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageProps):
        HttpStageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpStageProps):
        software.amazon.awscdk.services.apigatewayv2.HttpStageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpStageProps
  }
}
