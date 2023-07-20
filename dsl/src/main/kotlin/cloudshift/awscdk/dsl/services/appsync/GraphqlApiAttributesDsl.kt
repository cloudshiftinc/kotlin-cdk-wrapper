@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appsync.GraphqlApiAttributes
import kotlin.String

@CdkDslMarker
public class GraphqlApiAttributesDsl {
    private val cdkBuilder: GraphqlApiAttributes.Builder = GraphqlApiAttributes.builder()

    public fun graphqlApiArn(graphqlApiArn: String) {
        cdkBuilder.graphqlApiArn(graphqlApiArn)
    }

    public fun graphqlApiId(graphqlApiId: String) {
        cdkBuilder.graphqlApiId(graphqlApiId)
    }

    public fun build(): GraphqlApiAttributes = cdkBuilder.build()
}
