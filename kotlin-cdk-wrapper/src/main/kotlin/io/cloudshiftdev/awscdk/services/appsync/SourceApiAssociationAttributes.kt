@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SourceApiAssociationAttributes {
  public fun associationArn(): String

  public fun mergedApi(): IGraphqlApi

  public fun sourceApi(): IGraphqlApi

  @CdkDslMarker
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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes,
  ) : CdkObject(cdkObject), SourceApiAssociationAttributes {
    override fun associationArn(): String = unwrap(this).getAssociationArn()

    override fun mergedApi(): IGraphqlApi = unwrap(this).getMergedApi().let(IGraphqlApi::wrap)

    override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceApiAssociationAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes):
        SourceApiAssociationAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceApiAssociationAttributes):
        software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes
  }
}
