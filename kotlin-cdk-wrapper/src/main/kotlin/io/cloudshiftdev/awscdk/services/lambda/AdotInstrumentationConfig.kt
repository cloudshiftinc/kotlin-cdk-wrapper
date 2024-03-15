@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface AdotInstrumentationConfig {
  public fun execWrapper(): AdotLambdaExecWrapper

  public fun layerVersion(): AdotLayerVersion

  @CdkDslMarker
  public interface Builder {
    public fun execWrapper(execWrapper: AdotLambdaExecWrapper)

    public fun layerVersion(layerVersion: AdotLayerVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.AdotInstrumentationConfig.Builder
        = software.amazon.awscdk.services.lambda.AdotInstrumentationConfig.builder()

    override fun execWrapper(execWrapper: AdotLambdaExecWrapper) {
      cdkBuilder.execWrapper(execWrapper.let(AdotLambdaExecWrapper::unwrap))
    }

    override fun layerVersion(layerVersion: AdotLayerVersion) {
      cdkBuilder.layerVersion(layerVersion.let(AdotLayerVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.AdotInstrumentationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.AdotInstrumentationConfig,
  ) : CdkObject(cdkObject), AdotInstrumentationConfig {
    override fun execWrapper(): AdotLambdaExecWrapper =
        unwrap(this).getExecWrapper().let(AdotLambdaExecWrapper::wrap)

    override fun layerVersion(): AdotLayerVersion =
        unwrap(this).getLayerVersion().let(AdotLayerVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AdotInstrumentationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.AdotInstrumentationConfig):
        AdotInstrumentationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AdotInstrumentationConfig):
        software.amazon.awscdk.services.lambda.AdotInstrumentationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.AdotInstrumentationConfig
  }
}
