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

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog
import kotlin.String

@CdkDslMarker
public class CfnSignalCatalogBranchPropertyDsl {
    private val cdkBuilder: CfnSignalCatalog.BranchProperty.Builder =
        CfnSignalCatalog.BranchProperty.builder()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun fullyQualifiedName(fullyQualifiedName: String) {
        cdkBuilder.fullyQualifiedName(fullyQualifiedName)
    }

    public fun build(): CfnSignalCatalog.BranchProperty = cdkBuilder.build()
}
