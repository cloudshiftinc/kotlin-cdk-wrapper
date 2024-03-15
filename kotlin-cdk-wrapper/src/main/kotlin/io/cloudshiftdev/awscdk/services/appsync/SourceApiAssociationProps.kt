@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface SourceApiAssociationProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

  public fun mergedApi(): IGraphqlApi

  public fun mergedApiExecutionRole(): IRole

  public fun sourceApi(): IGraphqlApi

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun mergeType(mergeType: MergeType)

    public fun mergedApi(mergedApi: IGraphqlApi)

    public fun mergedApiExecutionRole(mergedApiExecutionRole: IRole)

    public fun sourceApi(sourceApi: IGraphqlApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.SourceApiAssociationProps.Builder =
        software.amazon.awscdk.services.appsync.SourceApiAssociationProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun mergeType(mergeType: MergeType) {
      cdkBuilder.mergeType(mergeType.let(MergeType::unwrap))
    }

    override fun mergedApi(mergedApi: IGraphqlApi) {
      cdkBuilder.mergedApi(mergedApi.let(IGraphqlApi::unwrap))
    }

    override fun mergedApiExecutionRole(mergedApiExecutionRole: IRole) {
      cdkBuilder.mergedApiExecutionRole(mergedApiExecutionRole.let(IRole::unwrap))
    }

    override fun sourceApi(sourceApi: IGraphqlApi) {
      cdkBuilder.sourceApi(sourceApi.let(IGraphqlApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.SourceApiAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationProps,
  ) : CdkObject(cdkObject), SourceApiAssociationProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

    override fun mergedApi(): IGraphqlApi = unwrap(this).getMergedApi().let(IGraphqlApi::wrap)

    override fun mergedApiExecutionRole(): IRole =
        unwrap(this).getMergedApiExecutionRole().let(IRole::wrap)

    override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceApiAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationProps):
        SourceApiAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceApiAssociationProps):
        software.amazon.awscdk.services.appsync.SourceApiAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.SourceApiAssociationProps
  }
}
