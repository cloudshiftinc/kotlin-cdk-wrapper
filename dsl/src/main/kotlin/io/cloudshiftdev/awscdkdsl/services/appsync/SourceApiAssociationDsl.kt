@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appsync.IGraphqlApi
import software.amazon.awscdk.services.appsync.MergeType
import software.amazon.awscdk.services.appsync.SourceApiAssociation
import software.amazon.awscdk.services.iam.IRole
import software.constructs.Construct

/**
 * AppSync SourceApiAssociation which associates an AppSync source API to an AppSync Merged API.
 *
 * The initial creation of the SourceApiAssociation merges the source API into the Merged API
 * schema.
 *
 * Example:
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
@CdkDslMarker
public class SourceApiAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: SourceApiAssociation.Builder =
        SourceApiAssociation.Builder.create(scope, id)

    /**
     * The description of the source api association.
     *
     * Default: - None
     *
     * @param description The description of the source api association.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The merge type for the source.
     *
     * Default: - AUTO_MERGE
     *
     * @param mergeType The merge type for the source.
     */
    public fun mergeType(mergeType: MergeType) {
        cdkBuilder.mergeType(mergeType)
    }

    /**
     * The merged api to associate.
     *
     * @param mergedApi The merged api to associate.
     */
    public fun mergedApi(mergedApi: IGraphqlApi) {
        cdkBuilder.mergedApi(mergedApi)
    }

    /**
     * The merged api execution role for adding the access policy for the source api.
     *
     * @param mergedApiExecutionRole The merged api execution role for adding the access policy for
     *   the source api.
     */
    public fun mergedApiExecutionRole(mergedApiExecutionRole: IRole) {
        cdkBuilder.mergedApiExecutionRole(mergedApiExecutionRole)
    }

    /**
     * The source api to associate.
     *
     * @param sourceApi The source api to associate.
     */
    public fun sourceApi(sourceApi: IGraphqlApi) {
        cdkBuilder.sourceApi(sourceApi)
    }

    public fun build(): SourceApiAssociation = cdkBuilder.build()
}
