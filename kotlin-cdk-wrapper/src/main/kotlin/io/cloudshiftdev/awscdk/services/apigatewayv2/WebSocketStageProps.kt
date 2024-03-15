@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface WebSocketStageProps : StageOptions {
  public fun stageName(): String

  public fun webSocketApi(): IWebSocketApi

  @CdkDslMarker
  public interface Builder {
    public fun autoDeploy(autoDeploy: Boolean)

    public fun domainMapping(domainMapping: DomainMappingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("406bdcf21400ec10838fdc26218f08a05a79d3b379e8874ebec4be40128050e8")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit)

    public fun stageName(stageName: String)

    public fun throttle(throttle: ThrottleSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5309ced1e42a8d8106537ceb0de621a95e9ec10e7f984cbc78b156a71d5d7b3")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)

    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps.Builder
        = software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps.builder()

    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    override fun domainMapping(domainMapping: DomainMappingOptions) {
      cdkBuilder.domainMapping(domainMapping.let(DomainMappingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("406bdcf21400ec10838fdc26218f08a05a79d3b379e8874ebec4be40128050e8")
    override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit =
        domainMapping(DomainMappingOptions(domainMapping))

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b5309ced1e42a8d8106537ceb0de621a95e9ec10e7f984cbc78b156a71d5d7b3")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps,
  ) : CdkObject(cdkObject), WebSocketStageProps {
    override fun autoDeploy(): Boolean? = unwrap(this).getAutoDeploy()

    override fun domainMapping(): DomainMappingOptions? =
        unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

    override fun stageName(): String = unwrap(this).getStageName()

    override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)

    override fun webSocketApi(): IWebSocketApi =
        unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketStageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps):
        WebSocketStageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketStageProps):
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.WebSocketStageProps
  }
}
