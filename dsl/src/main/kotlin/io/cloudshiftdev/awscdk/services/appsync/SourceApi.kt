package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Unit

public interface SourceApi {
  public fun description(): String? = unwrap(this).getDescription()

  public fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

  public fun sourceApi(): IGraphqlApi

  public interface Builder {
    public fun description(description: String)

    public fun mergeType(mergeType: MergeType)

    public fun sourceApi(sourceApi: IGraphqlApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SourceApi.Builder =
        software.amazon.awscdk.services.appsync.SourceApi.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun mergeType(mergeType: MergeType) {
      cdkBuilder.mergeType(mergeType.let(MergeType::unwrap))
    }

    override fun sourceApi(sourceApi: IGraphqlApi) {
      cdkBuilder.sourceApi(sourceApi.let(IGraphqlApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.SourceApi = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.SourceApi,
  ) : SourceApi {
    override fun description(): String? = unwrap(this).getDescription()

    override fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

    override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SourceApi {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApi): SourceApi =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceApi): software.amazon.awscdk.services.appsync.SourceApi =
        (wrapped as Wrapper).cdkObject
  }
}
