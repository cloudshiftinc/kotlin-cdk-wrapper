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

package cloudshift.awscdk.dsl.services.identitystore

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.identitystore.CfnGroup
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnGroup.Builder = CfnGroup.Builder.create(scope, id)

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun identityStoreId(identityStoreId: String) {
        cdkBuilder.identityStoreId(identityStoreId)
    }

    public fun build(): CfnGroup = cdkBuilder.build()
}
