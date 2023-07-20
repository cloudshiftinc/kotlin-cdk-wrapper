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

package cloudshift.awscdk.dsl.services.comprehend

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.comprehend.CfnFlywheel
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnFlywheelDocumentClassificationConfigPropertyDsl {
    private val cdkBuilder: CfnFlywheel.DocumentClassificationConfigProperty.Builder =
        CfnFlywheel.DocumentClassificationConfigProperty.builder()

    private val _labels: MutableList<String> = mutableListOf()

    public fun labels(vararg labels: String) {
        _labels.addAll(listOf(*labels))
    }

    public fun labels(labels: Collection<String>) {
        _labels.addAll(labels)
    }

    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnFlywheel.DocumentClassificationConfigProperty {
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        return cdkBuilder.build()
    }
}
