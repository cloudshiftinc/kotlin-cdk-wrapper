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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.batch.CfnSchedulingPolicy
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnSchedulingPolicyShareAttributesPropertyDsl {
    private val cdkBuilder: CfnSchedulingPolicy.ShareAttributesProperty.Builder =
        CfnSchedulingPolicy.ShareAttributesProperty.builder()

    public fun shareIdentifier(shareIdentifier: String) {
        cdkBuilder.shareIdentifier(shareIdentifier)
    }

    public fun weightFactor(weightFactor: Number) {
        cdkBuilder.weightFactor(weightFactor)
    }

    public fun build(): CfnSchedulingPolicy.ShareAttributesProperty = cdkBuilder.build()
}
