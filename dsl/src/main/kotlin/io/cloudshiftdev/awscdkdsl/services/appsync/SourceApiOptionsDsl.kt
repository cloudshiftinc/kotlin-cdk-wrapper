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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appsync.SourceApi
import software.amazon.awscdk.services.appsync.SourceApiOptions
import software.amazon.awscdk.services.iam.Role

/**
 * Additional API configuration for creating a AppSync Merged API.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * // first source API
 * GraphqlApi firstApi = GraphqlApi.Builder.create(this, "FirstSourceAPI")
 * .name("FirstSourceAPI")
 * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-1.graphql")))
 * .build();
 * // second source API
 * GraphqlApi secondApi = GraphqlApi.Builder.create(this, "SecondSourceAPI")
 * .name("SecondSourceAPI")
 * .definition(Definition.fromFile(join(__dirname, "appsync.merged-api-2.graphql")))
 * .build();
 * // Merged API
 * GraphqlApi mergedApi = GraphqlApi.Builder.create(this, "MergedAPI")
 * .name("MergedAPI")
 * .definition(Definition.fromSourceApis(SourceApiOptions.builder()
 * .sourceApis(List.of(SourceApi.builder()
 * .sourceApi(firstApi)
 * .mergeType(MergeType.MANUAL_MERGE)
 * .build(), SourceApi.builder()
 * .sourceApi(secondApi)
 * .mergeType(MergeType.AUTO_MERGE)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class SourceApiOptionsDsl {
    private val cdkBuilder: SourceApiOptions.Builder = SourceApiOptions.builder()

    private val _sourceApis: MutableList<SourceApi> = mutableListOf()

    /**
     * @param mergedApiExecutionRole IAM Role used to validate access to source APIs at runtime and
     *   to update the merged API endpoint with the source API changes.
     */
    public fun mergedApiExecutionRole(mergedApiExecutionRole: Role) {
        cdkBuilder.mergedApiExecutionRole(mergedApiExecutionRole)
    }

    /** @param sourceApis Definition of source APIs associated with this Merged API. */
    public fun sourceApis(sourceApis: SourceApiDsl.() -> Unit) {
        _sourceApis.add(SourceApiDsl().apply(sourceApis).build())
    }

    /** @param sourceApis Definition of source APIs associated with this Merged API. */
    public fun sourceApis(sourceApis: Collection<SourceApi>) {
        _sourceApis.addAll(sourceApis)
    }

    public fun build(): SourceApiOptions {
        if (_sourceApis.isNotEmpty()) cdkBuilder.sourceApis(_sourceApis)
        return cdkBuilder.build()
    }
}
