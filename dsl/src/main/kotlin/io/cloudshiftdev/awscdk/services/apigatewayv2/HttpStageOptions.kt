package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface HttpStageOptions : StageOptions {
  public fun stageName(): String? = unwrap(this).getStageName()

  public interface Builder {
    public fun autoDeploy(autoDeploy: Boolean) {
    }

    public fun domainMapping(domainMapping: DomainMappingOptions) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e049956e85c6fd40c9350d27ab422c47bb1920fc6b62cb61a50c1cb3917f973")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit) {
    }

    public fun stageName(stageName: String) {
    }

    public fun throttle(throttle: ThrottleSettings) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15c7212dfd2d64ea3217da10398f302c9d464d62b0b898c6bc3fa60e57e8a958")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpStageOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpStageOptions.builder()

    public override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    public override fun domainMapping(domainMapping: DomainMappingOptions) {
      cdkBuilder.domainMapping(domainMapping.let(DomainMappingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3e049956e85c6fd40c9350d27ab422c47bb1920fc6b62cb61a50c1cb3917f973")
    public override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit
        = domainMapping(DomainMappingOptions(domainMapping))

    public override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("15c7212dfd2d64ea3217da10398f302c9d464d62b0b898c6bc3fa60e57e8a958")
    public override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpStageOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageOptions,
  ) : HttpStageOptions {
    public override fun autoDeploy(): Boolean? = unwrap(this).getAutoDeploy()

    public override fun domainMapping(): DomainMappingOptions? =
        unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

    public override fun stageName(): String? = unwrap(this).getStageName()

    public override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): HttpStageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageOptions):
        HttpStageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpStageOptions):
        software.amazon.awscdk.services.apigatewayv2.HttpStageOptions = (wrapped as
        Wrapper).cdkObject
  }
}
