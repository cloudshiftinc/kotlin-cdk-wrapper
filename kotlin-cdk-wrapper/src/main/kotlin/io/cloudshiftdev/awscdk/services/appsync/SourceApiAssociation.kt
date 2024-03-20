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

/**
 * AppSync SourceApiAssociation which associates an AppSync source API to an AppSync Merged API.
 *
 * The initial creation of the SourceApiAssociation merges the source API into the Merged API
 * schema.
 *
 * Example:
 *
 * ```
 * GraphqlApi sourceApi = GraphqlApi.Builder.create(this, "FirstSourceAPI")
 * .name("FirstSourceAPI")
 * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-1.graphql")))
 * .build();
 * IGraphqlApi importedMergedApi = GraphqlApi.fromGraphqlApiAttributes(this, "ImportedMergedApi",
 * GraphqlApiAttributes.builder()
 * .graphqlApiId("MyApiId")
 * .graphqlApiArn("MyApiArn")
 * .build());
 * IRole importedExecutionRole = Role.fromRoleArn(this, "ExecutionRole",
 * "arn:aws:iam::ACCOUNT:role/MyExistingRole");
 * SourceApiAssociation.Builder.create(this, "SourceApiAssociation2")
 * .sourceApi(sourceApi)
 * .mergedApi(importedMergedApi)
 * .mergeType(MergeType.MANUAL_MERGE)
 * .mergedApiExecutionRole(importedExecutionRole)
 * .build();
 * ```
 */
public open class SourceApiAssociation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociation,
) : Resource(cdkObject), ISourceApiAssociation {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SourceApiAssociationProps,
  ) :
      this(software.amazon.awscdk.services.appsync.SourceApiAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(SourceApiAssociationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: SourceApiAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, SourceApiAssociationProps(props)
  )

  /**
   * The underlying CFN source api association resource.
   */
  public open fun association(): CfnSourceApiAssociation =
      unwrap(this).getAssociation().let(CfnSourceApiAssociation::wrap)

  /**
   * The association arn.
   */
  public override fun associationArn(): String = unwrap(this).getAssociationArn()

  /**
   * The association id.
   */
  public override fun associationId(): String = unwrap(this).getAssociationId()

  /**
   * The merge type for the source api association.
   */
  public open fun mergeType(): MergeType = unwrap(this).getMergeType().let(MergeType::wrap)

  /**
   * The merged api in the association.
   */
  public override fun mergedApi(): IGraphqlApi = unwrap(this).getMergedApi().let(IGraphqlApi::wrap)

  /**
   * The source api in the association.
   */
  public override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appsync.SourceApiAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the source api association.
     *
     * Default: - None
     *
     * @param description The description of the source api association. 
     */
    public fun description(description: String)

    /**
     * The merge type for the source.
     *
     * Default: - AUTO_MERGE
     *
     * @param mergeType The merge type for the source. 
     */
    public fun mergeType(mergeType: MergeType)

    /**
     * The merged api to associate.
     *
     * @param mergedApi The merged api to associate. 
     */
    public fun mergedApi(mergedApi: IGraphqlApi)

    /**
     * The merged api execution role for adding the access policy for the source api.
     *
     * @param mergedApiExecutionRole The merged api execution role for adding the access policy for
     * the source api. 
     */
    public fun mergedApiExecutionRole(mergedApiExecutionRole: IRole)

    /**
     * The source api to associate.
     *
     * @param sourceApi The source api to associate. 
     */
    public fun sourceApi(sourceApi: IGraphqlApi)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SourceApiAssociation.Builder =
        software.amazon.awscdk.services.appsync.SourceApiAssociation.Builder.create(scope, id)

    /**
     * The description of the source api association.
     *
     * Default: - None
     *
     * @param description The description of the source api association. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The merge type for the source.
     *
     * Default: - AUTO_MERGE
     *
     * @param mergeType The merge type for the source. 
     */
    override fun mergeType(mergeType: MergeType) {
      cdkBuilder.mergeType(mergeType.let(MergeType::unwrap))
    }

    /**
     * The merged api to associate.
     *
     * @param mergedApi The merged api to associate. 
     */
    override fun mergedApi(mergedApi: IGraphqlApi) {
      cdkBuilder.mergedApi(mergedApi.let(IGraphqlApi::unwrap))
    }

    /**
     * The merged api execution role for adding the access policy for the source api.
     *
     * @param mergedApiExecutionRole The merged api execution role for adding the access policy for
     * the source api. 
     */
    override fun mergedApiExecutionRole(mergedApiExecutionRole: IRole) {
      cdkBuilder.mergedApiExecutionRole(mergedApiExecutionRole.let(IRole::unwrap))
    }

    /**
     * The source api to associate.
     *
     * @param sourceApi The source api to associate. 
     */
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
