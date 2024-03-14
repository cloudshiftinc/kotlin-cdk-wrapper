package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.Boolean
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface StageOptions {
  public fun autoDeploy(): Boolean? = unwrap(this).getAutoDeploy()

  public fun domainMapping(): DomainMappingOptions? =
      unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

  public fun throttle(): ThrottleSettings? = unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)

  public interface Builder {
    public fun autoDeploy(autoDeploy: Boolean)

    public fun domainMapping(domainMapping: DomainMappingOptions)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca35995823fd1e7d71d17e3e276cc2db56d83031c23094c4aa49cde7fa0393e0")
    public fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit)

    public fun throttle(throttle: ThrottleSettings)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63d19c4f6551050fa730584bd611f48cb522017c021f96731a8b9835a163092a")
    public fun throttle(throttle: ThrottleSettings.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.StageOptions.Builder =
        software.amazon.awscdk.services.apigatewayv2.StageOptions.builder()

    override fun autoDeploy(autoDeploy: Boolean) {
      cdkBuilder.autoDeploy(autoDeploy)
    }

    override fun domainMapping(domainMapping: DomainMappingOptions) {
      cdkBuilder.domainMapping(domainMapping.let(DomainMappingOptions::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ca35995823fd1e7d71d17e3e276cc2db56d83031c23094c4aa49cde7fa0393e0")
    override fun domainMapping(domainMapping: DomainMappingOptions.Builder.() -> Unit): Unit =
        domainMapping(DomainMappingOptions(domainMapping))

    override fun throttle(throttle: ThrottleSettings) {
      cdkBuilder.throttle(throttle.let(ThrottleSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63d19c4f6551050fa730584bd611f48cb522017c021f96731a8b9835a163092a")
    override fun throttle(throttle: ThrottleSettings.Builder.() -> Unit): Unit =
        throttle(ThrottleSettings(throttle))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.StageOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.StageOptions,
  ) : StageOptions {
    override fun autoDeploy(): Boolean? = unwrap(this).getAutoDeploy()

    override fun domainMapping(): DomainMappingOptions? =
        unwrap(this).getDomainMapping()?.let(DomainMappingOptions::wrap)

    override fun throttle(): ThrottleSettings? =
        unwrap(this).getThrottle()?.let(ThrottleSettings::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StageOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.StageOptions):
        StageOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageOptions):
        software.amazon.awscdk.services.apigatewayv2.StageOptions = (wrapped as Wrapper).cdkObject
  }
}
