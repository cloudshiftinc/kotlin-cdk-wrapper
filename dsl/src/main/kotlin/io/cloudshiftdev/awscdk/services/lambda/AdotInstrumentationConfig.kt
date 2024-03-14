package io.cloudshiftdev.awscdk.services.lambda

import kotlin.Unit

public interface AdotInstrumentationConfig {
  public fun execWrapper(): AdotLambdaExecWrapper

  public fun layerVersion(): AdotLayerVersion

  public interface Builder {
    public fun execWrapper(execWrapper: AdotLambdaExecWrapper) {
    }

    public fun layerVersion(layerVersion: AdotLayerVersion) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AdotInstrumentationConfig.Builder
        = software.amazon.awscdk.services.lambda.AdotInstrumentationConfig.builder()

    public override fun execWrapper(execWrapper: AdotLambdaExecWrapper) {
      cdkBuilder.execWrapper(execWrapper.let(AdotLambdaExecWrapper::unwrap))
    }

    public override fun layerVersion(layerVersion: AdotLayerVersion) {
      cdkBuilder.layerVersion(layerVersion.let(AdotLayerVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.AdotInstrumentationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.AdotInstrumentationConfig,
  ) : AdotInstrumentationConfig {
    public override fun execWrapper(): AdotLambdaExecWrapper =
        unwrap(this).getExecWrapper().let(AdotLambdaExecWrapper::wrap)

    public override fun layerVersion(): AdotLayerVersion =
        unwrap(this).getLayerVersion().let(AdotLayerVersion::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AdotInstrumentationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotInstrumentationConfig):
        AdotInstrumentationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AdotInstrumentationConfig):
        software.amazon.awscdk.services.lambda.AdotInstrumentationConfig = (wrapped as
        Wrapper).cdkObject
  }
}
