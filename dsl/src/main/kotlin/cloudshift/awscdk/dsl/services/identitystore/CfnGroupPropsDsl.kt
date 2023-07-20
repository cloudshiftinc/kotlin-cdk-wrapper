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
import software.amazon.awscdk.services.identitystore.CfnGroupProps
import kotlin.String

@CdkDslMarker
public class CfnGroupPropsDsl {
    private val cdkBuilder: CfnGroupProps.Builder = CfnGroupProps.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    public fun identityStoreId(identityStoreId: String) {
        cdkBuilder.identityStoreId(identityStoreId)
    }

    public fun build(): CfnGroupProps = cdkBuilder.build()
}
