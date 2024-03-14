package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface AdotInstrumentationConfig {
  /**
   * The startup script to run, see ADOT documentation to pick the right script for your use case:
   * https://aws-otel.github.io/docs/getting-started/lambda.
   */
  public fun execWrapper(): AdotLambdaExecWrapper

  /**
   * The ADOT Lambda layer.
   */
  public fun layerVersion(): AdotLayerVersion

  /**
   * A builder for [AdotInstrumentationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param execWrapper The startup script to run, see ADOT documentation to pick the right script
     * for your use case: https://aws-otel.github.io/docs/getting-started/lambda. 
     */
    public fun execWrapper(execWrapper: AdotLambdaExecWrapper)

    /**
     * @param layerVersion The ADOT Lambda layer. 
     */
    public fun layerVersion(layerVersion: AdotLayerVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AdotInstrumentationConfig.Builder
        = software.amazon.awscdk.services.lambda.AdotInstrumentationConfig.builder()

    /**
     * @param execWrapper The startup script to run, see ADOT documentation to pick the right script
     * for your use case: https://aws-otel.github.io/docs/getting-started/lambda. 
     */
    override fun execWrapper(execWrapper: AdotLambdaExecWrapper) {
      cdkBuilder.execWrapper(execWrapper.let(AdotLambdaExecWrapper::unwrap))
    }

    /**
     * @param layerVersion The ADOT Lambda layer. 
     */
    override fun layerVersion(layerVersion: AdotLayerVersion) {
      cdkBuilder.layerVersion(layerVersion.let(AdotLayerVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.AdotInstrumentationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.lambda.AdotInstrumentationConfig,
  ) : AdotInstrumentationConfig {
    /**
     * The startup script to run, see ADOT documentation to pick the right script for your use case:
     * https://aws-otel.github.io/docs/getting-started/lambda.
     */
    override fun execWrapper(): AdotLambdaExecWrapper =
        unwrap(this).getExecWrapper().let(AdotLambdaExecWrapper::wrap)

    /**
     * The ADOT Lambda layer.
     */
    override fun layerVersion(): AdotLayerVersion =
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
