package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Unit

public interface SourceApiAssociationAttributes {
  public fun associationArn(): String

  public fun mergedApi(): IGraphqlApi

  public fun sourceApi(): IGraphqlApi

  public interface Builder {
    public fun associationArn(associationArn: String)

    public fun mergedApi(mergedApi: IGraphqlApi)

    public fun sourceApi(sourceApi: IGraphqlApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes.Builder =
        software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes.builder()

    override fun associationArn(associationArn: String) {
      cdkBuilder.associationArn(associationArn)
    }

    override fun mergedApi(mergedApi: IGraphqlApi) {
      cdkBuilder.mergedApi(mergedApi.let(IGraphqlApi::unwrap))
    }

    override fun sourceApi(sourceApi: IGraphqlApi) {
      cdkBuilder.sourceApi(sourceApi.let(IGraphqlApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes,
  ) : SourceApiAssociationAttributes {
    override fun associationArn(): String = unwrap(this).getAssociationArn()

    override fun mergedApi(): IGraphqlApi = unwrap(this).getMergedApi().let(IGraphqlApi::wrap)

    override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SourceApiAssociationAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes):
        SourceApiAssociationAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceApiAssociationAttributes):
        software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
