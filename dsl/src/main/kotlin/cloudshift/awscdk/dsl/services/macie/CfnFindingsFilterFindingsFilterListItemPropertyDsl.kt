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

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.macie.CfnFindingsFilter
import kotlin.String

@CdkDslMarker
public class CfnFindingsFilterFindingsFilterListItemPropertyDsl {
    private val cdkBuilder: CfnFindingsFilter.FindingsFilterListItemProperty.Builder =
        CfnFindingsFilter.FindingsFilterListItemProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnFindingsFilter.FindingsFilterListItemProperty = cdkBuilder.build()
}
