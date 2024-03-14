package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface BasePathMappingOptions {
  public fun attachToStage(): Boolean? = unwrap(this).getAttachToStage()

  public fun basePath(): String? = unwrap(this).getBasePath()

  public fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)

  public interface Builder {
    public fun attachToStage(attachToStage: Boolean) {
    }

    public fun basePath(basePath: String) {
    }

    public fun stage(stage: Stage) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.BasePathMappingOptions.Builder =
        software.amazon.awscdk.services.apigateway.BasePathMappingOptions.builder()

    public override fun attachToStage(attachToStage: Boolean) {
      cdkBuilder.attachToStage(attachToStage)
    }

    public override fun basePath(basePath: String) {
      cdkBuilder.basePath(basePath)
    }

    public override fun stage(stage: Stage) {
      cdkBuilder.stage(stage.let(Stage::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.BasePathMappingOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.BasePathMappingOptions,
  ) : BasePathMappingOptions {
    public override fun attachToStage(): Boolean? = unwrap(this).getAttachToStage()

    public override fun basePath(): String? = unwrap(this).getBasePath()

    public override fun stage(): Stage? = unwrap(this).getStage()?.let(Stage::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BasePathMappingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.BasePathMappingOptions):
        BasePathMappingOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasePathMappingOptions):
        software.amazon.awscdk.services.apigateway.BasePathMappingOptions = (wrapped as
        Wrapper).cdkObject
  }
}
