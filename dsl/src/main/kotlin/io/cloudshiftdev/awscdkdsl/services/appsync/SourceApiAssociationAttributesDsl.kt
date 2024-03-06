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
import software.amazon.awscdk.services.appsync.SourceApiAssociationAttributes

/**
 * The attributes for imported AppSync Source Api Association.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appsync.*;
 * GraphqlApi graphqlApi;
 * SourceApiAssociationAttributes sourceApiAssociationAttributes =
 * SourceApiAssociationAttributes.builder()
 * .associationArn("associationArn")
 * .mergedApi(graphqlApi)
 * .sourceApi(graphqlApi)
 * .build();
 * ```
 */
@CdkDslMarker
public class SourceApiAssociationAttributesDsl {
    private val cdkBuilder: SourceApiAssociationAttributes.Builder =
        SourceApiAssociationAttributes.builder()

    /** @param associationArn The association arn. */
    public fun associationArn(associationArn: String) {
        cdkBuilder.associationArn(associationArn)
    }

    /** @param mergedApi The merged api in the association. */
    public fun mergedApi(mergedApi: IGraphqlApi) {
        cdkBuilder.mergedApi(mergedApi)
    }

    /** @param sourceApi The source api in the association. */
    public fun sourceApi(sourceApi: IGraphqlApi) {
        cdkBuilder.sourceApi(sourceApi)
    }

    public fun build(): SourceApiAssociationAttributes = cdkBuilder.build()
}
