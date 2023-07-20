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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import kotlin.Boolean

@CdkDslMarker
public class CfnGlobalTableContributorInsightsSpecificationPropertyDsl {
    private val cdkBuilder: CfnGlobalTable.ContributorInsightsSpecificationProperty.Builder =
        CfnGlobalTable.ContributorInsightsSpecificationProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnGlobalTable.ContributorInsightsSpecificationProperty = cdkBuilder.build()
}
