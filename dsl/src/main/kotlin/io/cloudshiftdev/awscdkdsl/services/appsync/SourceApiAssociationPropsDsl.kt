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
import software.amazon.awscdk.services.appsync.SourceApiAssociationProps
import software.amazon.awscdk.services.iam.IRole

/**
 * Properties for SourceApiAssociation which associates an AppSync Source API with an AppSync Merged
 * API.
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
public class SourceApiAssociationPropsDsl {
    private val cdkBuilder: SourceApiAssociationProps.Builder = SourceApiAssociationProps.builder()

    /** @param description The description of the source api association. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param mergeType The merge type for the source. */
    public fun mergeType(mergeType: MergeType) {
        cdkBuilder.mergeType(mergeType)
    }

    /** @param mergedApi The merged api to associate. */
    public fun mergedApi(mergedApi: IGraphqlApi) {
        cdkBuilder.mergedApi(mergedApi)
    }

    /**
     * @param mergedApiExecutionRole The merged api execution role for adding the access policy for
     *   the source api.
     */
    public fun mergedApiExecutionRole(mergedApiExecutionRole: IRole) {
        cdkBuilder.mergedApiExecutionRole(mergedApiExecutionRole)
    }

    /** @param sourceApi The source api to associate. */
    public fun sourceApi(sourceApi: IGraphqlApi) {
        cdkBuilder.sourceApi(sourceApi)
    }

    public fun build(): SourceApiAssociationProps = cdkBuilder.build()
}
