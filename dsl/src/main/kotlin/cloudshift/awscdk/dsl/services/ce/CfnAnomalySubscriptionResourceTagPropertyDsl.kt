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

package cloudshift.awscdk.dsl.services.ce

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ce.CfnAnomalySubscription
import kotlin.String

@CdkDslMarker
public class CfnAnomalySubscriptionResourceTagPropertyDsl {
    private val cdkBuilder: CfnAnomalySubscription.ResourceTagProperty.Builder =
        CfnAnomalySubscription.ResourceTagProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAnomalySubscription.ResourceTagProperty = cdkBuilder.build()
}
