@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for an ADOT instrumentation in Lambda.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.AdotLambdaExecWrapper;
 * import io.cloudshiftdev.awscdk.services.lambda.AdotLayerVersion;
 * import io.cloudshiftdev.awscdk.services.lambda.AdotLambdaLayerJavaScriptSdkVersion;
 * Function fn = Function.Builder.create(this, "MyFunction")
 * .runtime(Runtime.NODEJS_18_X)
 * .handler("index.handler")
 * .code(Code.fromInline("exports.handler = function(event, ctx, cb) { return cb(null, \"hi\"); }"))
 * .adotInstrumentation(AdotInstrumentationConfig.builder()
 * .layerVersion(AdotLayerVersion.fromJavaScriptSdkLayerVersion(AdotLambdaLayerJavaScriptSdkVersion.LATEST))
 * .execWrapper(AdotLambdaExecWrapper.REGULAR_HANDLER)
 * .build())
 * .build();
 * ```
 */
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.AdotInstrumentationConfig,
  ) : CdkObject(cdkObject), AdotInstrumentationConfig {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): AdotInstrumentationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotInstrumentationConfig):
        AdotInstrumentationConfig = CdkObjectWrappers.wrap(cdkObject) as AdotInstrumentationConfig

    internal fun unwrap(wrapped: AdotInstrumentationConfig):
        software.amazon.awscdk.services.lambda.AdotInstrumentationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.AdotInstrumentationConfig
  }
}
