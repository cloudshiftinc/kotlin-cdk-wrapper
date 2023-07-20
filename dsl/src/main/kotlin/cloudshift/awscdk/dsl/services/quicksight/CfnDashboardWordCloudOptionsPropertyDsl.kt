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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.quicksight.CfnDashboard
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDashboardWordCloudOptionsPropertyDsl {
    private val cdkBuilder: CfnDashboard.WordCloudOptionsProperty.Builder =
        CfnDashboard.WordCloudOptionsProperty.builder()

    public fun cloudLayout(cloudLayout: String) {
        cdkBuilder.cloudLayout(cloudLayout)
    }

    public fun maximumStringLength(maximumStringLength: Number) {
        cdkBuilder.maximumStringLength(maximumStringLength)
    }

    public fun wordCasing(wordCasing: String) {
        cdkBuilder.wordCasing(wordCasing)
    }

    public fun wordOrientation(wordOrientation: String) {
        cdkBuilder.wordOrientation(wordOrientation)
    }

    public fun wordPadding(wordPadding: String) {
        cdkBuilder.wordPadding(wordPadding)
    }

    public fun wordScaling(wordScaling: String) {
        cdkBuilder.wordScaling(wordScaling)
    }

    public fun build(): CfnDashboard.WordCloudOptionsProperty = cdkBuilder.build()
}
