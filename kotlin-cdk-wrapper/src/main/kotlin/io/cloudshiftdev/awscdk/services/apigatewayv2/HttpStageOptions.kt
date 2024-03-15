@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpStageOptions : StageOptions {
  public fun stageName(): String? = unwrap(this).getStageName()

  @CdkDslMarker
  public interface Builder {
    public fun autoDeploy(autoDeploy: Boolean)

    public fun domainMapping(domainMapping: DomainMappingOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e049956e85c6fd40c9350d27ab422c47bb1920fc6b62cb61a50c1cb3917f973")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit)

    public fun stageName(stageName: String)

    public fun throttle(throttle: ThrottleSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15c7212dfd2d64ea3217da10398f302c9d464d62b0b898c6bc3fa60e57e8a958")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpStageOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpStageOptions.builder()

    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    override fun domainMapping(domainMapping: DomainMappingOptions) {
      cdkBuilder.domainMapping(domainMapping.let(DomainMappingOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e049956e85c6fd40c9350d27ab422c47bb1920fc6b62cb61a50c1cb3917f973")
    override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit =
        domainMapping(DomainMappingOptions(domainMapping))

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15c7212dfd2d64ea3217da10398f302c9d464d62b0b898c6bc3fa60e57e8a958")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpStageOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageOptions,
  ) : CdkObject(cdkObject), HttpStageOptions {
    override fun autoDeploy(): Boolean? = unwrap(this).getAutoDeploy()

    override fun domainMapping(): DomainMappingOptions? =
        unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

    override fun stageName(): String? = unwrap(this).getStageName()

    override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpStageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageOptions):
        HttpStageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpStageOptions):
        software.amazon.awscdk.services.apigatewayv2.HttpStageOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpStageOptions
  }
}
