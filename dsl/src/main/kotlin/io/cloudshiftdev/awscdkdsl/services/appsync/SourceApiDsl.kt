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
import software.amazon.awscdk.services.appsync.SourceApi

/**
 * Configuration of source API.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * GraphqlApi graphqlApi;
 * SourceApi sourceApi = SourceApi.builder()
 * .sourceApi(graphqlApi)
 * // the properties below are optional
 * .description("description")
 * .mergeType(MergeType.MANUAL_MERGE)
 * .build();
 * ```
 */
@CdkDslMarker
public class SourceApiDsl {
    private val cdkBuilder: SourceApi.Builder = SourceApi.builder()

    /** @param description Description of the Source API asssociation. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param mergeType Merging option used to associate the source API to the Merged API. */
    public fun mergeType(mergeType: MergeType) {
        cdkBuilder.mergeType(mergeType)
    }

    /** @param sourceApi Source API that is associated with the merged API. */
    public fun sourceApi(sourceApi: IGraphqlApi) {
        cdkBuilder.sourceApi(sourceApi)
    }

    public fun build(): SourceApi = cdkBuilder.build()
}
