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
import software.amazon.awscdk.services.appsync.GraphqlApiAttributes

/**
 * Attributes for GraphQL imports.
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
public class GraphqlApiAttributesDsl {
    private val cdkBuilder: GraphqlApiAttributes.Builder = GraphqlApiAttributes.builder()

    /** @param graphqlApiArn the arn for the GraphQL Api. */
    public fun graphqlApiArn(graphqlApiArn: String) {
        cdkBuilder.graphqlApiArn(graphqlApiArn)
    }

    /**
     * @param graphqlApiId an unique AWS AppSync GraphQL API identifier i.e.
     *   'lxz775lwdrgcndgz3nurvac7oa'.
     */
    public fun graphqlApiId(graphqlApiId: String) {
        cdkBuilder.graphqlApiId(graphqlApiId)
    }

    public fun build(): GraphqlApiAttributes = cdkBuilder.build()
}
