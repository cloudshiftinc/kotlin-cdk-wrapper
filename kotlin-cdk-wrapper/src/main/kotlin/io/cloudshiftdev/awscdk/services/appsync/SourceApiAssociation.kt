@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SourceApiAssociation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociation,
) : Resource(cdkObject), ISourceApiAssociation {
  public open fun association(): CfnSourceApiAssociation =
      unwrap(this).getAssociation().let(CfnSourceApiAssociation::wrap)

  public override fun associationArn(): String = unwrap(this).getAssociationArn()

  public override fun associationId(): String = unwrap(this).getAssociationId()

  public open fun mergeType(): MergeType = unwrap(this).getMergeType().let(MergeType::wrap)

  public override fun mergedApi(): IGraphqlApi = unwrap(this).getMergedApi().let(IGraphqlApi::wrap)

  public override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun mergeType(mergeType: MergeType)

    public fun mergedApi(mergedApi: IGraphqlApi)

    public fun mergedApiExecutionRole(mergedApiExecutionRole: IRole)

    public fun sourceApi(sourceApi: IGraphqlApi)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SourceApiAssociation.Builder =
        software.amazon.awscdk.services.appsync.SourceApiAssociation.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.appsync.SourceApiAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromSourceApiAssociationAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SourceApiAssociationAttributes,
    ): ISourceApiAssociation =
        software.amazon.awscdk.services.appsync.SourceApiAssociation.fromSourceApiAssociationAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(SourceApiAssociationAttributes::unwrap)).let(ISourceApiAssociation::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5464ee7cc08fc1fa25912b5e23ef40dbd44184829a79ee6236182e9f0a6ee3a4")
    public fun fromSourceApiAssociationAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: SourceApiAssociationAttributes.Builder.() -> Unit,
    ): ISourceApiAssociation = fromSourceApiAssociationAttributes(scope, id,
        SourceApiAssociationAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SourceApiAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SourceApiAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociation):
        SourceApiAssociation = SourceApiAssociation(cdkObject)

    internal fun unwrap(wrapped: SourceApiAssociation):
        software.amazon.awscdk.services.appsync.SourceApiAssociation = wrapped.cdkObject
  }
}
