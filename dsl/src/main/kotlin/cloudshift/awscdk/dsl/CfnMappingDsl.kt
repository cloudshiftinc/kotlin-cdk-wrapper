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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.CfnMapping
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnMappingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnMapping.Builder = CfnMapping.Builder.create(scope, id)

    public fun lazy(lazy: Boolean) {
        cdkBuilder.lazy(lazy)
    }

    public fun mapping(mapping: Map<String, Map<String, Any>>) {
        cdkBuilder.mapping(mapping)
    }

    public fun build(): CfnMapping = cdkBuilder.build()
}
