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

package cloudshift.awscdk.dsl.services.frauddetector

import software.amazon.awscdk.services.frauddetector.CfnDetector
import kotlin.Unit

public inline fun CfnDetector.setEventType(block: CfnDetectorEventTypePropertyDsl.() -> Unit = {}) {
    val builder = CfnDetectorEventTypePropertyDsl()
    builder.apply(block)
    return setEventType(builder.build())
}
