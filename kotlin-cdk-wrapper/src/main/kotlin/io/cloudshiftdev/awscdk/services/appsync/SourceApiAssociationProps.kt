@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

/**
 * Properties for SourceApiAssociation which associates an AppSync Source API with an AppSync Merged
 * API.
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
public interface SourceApiAssociationProps {
  /**
   * The description of the source api association.
   *
   * Default: - None
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The merge type for the source.
   *
   * Default: - AUTO_MERGE
   */
  public fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

  /**
   * The merged api to associate.
   */
  public fun mergedApi(): IGraphqlApi

  /**
   * The merged api execution role for adding the access policy for the source api.
   */
  public fun mergedApiExecutionRole(): IRole

  /**
   * The source api to associate.
   */
  public fun sourceApi(): IGraphqlApi

  /**
   * A builder for [SourceApiAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the source api association.
     */
    public fun description(description: String)

    /**
     * @param mergeType The merge type for the source.
     */
    public fun mergeType(mergeType: MergeType)

    /**
     * @param mergedApi The merged api to associate. 
     */
    public fun mergedApi(mergedApi: IGraphqlApi)

    /**
     * @param mergedApiExecutionRole The merged api execution role for adding the access policy for
     * the source api. 
     */
    public fun mergedApiExecutionRole(mergedApiExecutionRole: IRole)

    /**
     * @param sourceApi The source api to associate. 
     */
    public fun sourceApi(sourceApi: IGraphqlApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appsync.SourceApiAssociationProps.Builder =
        software.amazon.awscdk.services.appsync.SourceApiAssociationProps.builder()

    /**
     * @param description The description of the source api association.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param mergeType The merge type for the source.
     */
    override fun mergeType(mergeType: MergeType) {
      cdkBuilder.mergeType(mergeType.let(MergeType.Companion::unwrap))
    }

    /**
     * @param mergedApi The merged api to associate. 
     */
    override fun mergedApi(mergedApi: IGraphqlApi) {
      cdkBuilder.mergedApi(mergedApi.let(IGraphqlApi.Companion::unwrap))
    }

    /**
     * @param mergedApiExecutionRole The merged api execution role for adding the access policy for
     * the source api. 
     */
    override fun mergedApiExecutionRole(mergedApiExecutionRole: IRole) {
      cdkBuilder.mergedApiExecutionRole(mergedApiExecutionRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param sourceApi The source api to associate. 
     */
    override fun sourceApi(sourceApi: IGraphqlApi) {
      cdkBuilder.sourceApi(sourceApi.let(IGraphqlApi.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.SourceApiAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationProps,
  ) : CdkObject(cdkObject), SourceApiAssociationProps {
    /**
     * The description of the source api association.
     *
     * Default: - None
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The merge type for the source.
     *
     * Default: - AUTO_MERGE
     */
    override fun mergeType(): MergeType? = unwrap(this).getMergeType()?.let(MergeType::wrap)

    /**
     * The merged api to associate.
     */
    override fun mergedApi(): IGraphqlApi = unwrap(this).getMergedApi().let(IGraphqlApi::wrap)

    /**
     * The merged api execution role for adding the access policy for the source api.
     */
    override fun mergedApiExecutionRole(): IRole =
        unwrap(this).getMergedApiExecutionRole().let(IRole::wrap)

    /**
     * The source api to associate.
     */
    override fun sourceApi(): IGraphqlApi = unwrap(this).getSourceApi().let(IGraphqlApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceApiAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApiAssociationProps):
        SourceApiAssociationProps = CdkObjectWrappers.wrap(cdkObject) as? SourceApiAssociationProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceApiAssociationProps):
        software.amazon.awscdk.services.appsync.SourceApiAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.SourceApiAssociationProps
  }
}
