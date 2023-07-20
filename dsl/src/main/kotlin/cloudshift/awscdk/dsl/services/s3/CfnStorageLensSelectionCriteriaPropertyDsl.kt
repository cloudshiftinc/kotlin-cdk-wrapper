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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.s3.CfnStorageLens
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnStorageLensSelectionCriteriaPropertyDsl {
    private val cdkBuilder: CfnStorageLens.SelectionCriteriaProperty.Builder =
        CfnStorageLens.SelectionCriteriaProperty.builder()

    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    public fun maxDepth(maxDepth: Number) {
        cdkBuilder.maxDepth(maxDepth)
    }

    public fun minStorageBytesPercentage(minStorageBytesPercentage: Number) {
        cdkBuilder.minStorageBytesPercentage(minStorageBytesPercentage)
    }

    public fun build(): CfnStorageLens.SelectionCriteriaProperty = cdkBuilder.build()
}
