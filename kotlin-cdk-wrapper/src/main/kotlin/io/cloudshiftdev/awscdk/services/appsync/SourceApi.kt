@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SourceApi {
  public fun description(): String? = unwrap(this).getDescription()

  public fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

  public fun sourceApi(): IGraphqlApi

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.SourceApi,
  ) : CdkObject(cdkObject), SourceApi {
    override fun description(): String? = unwrap(this).getDescription()

    override fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

    override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceApi {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApi): SourceApi =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceApi): software.amazon.awscdk.services.appsync.SourceApi =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.SourceApi
  }
}
