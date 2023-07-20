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

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import kotlin.String

@CdkDslMarker
public class CfnDetectorModelAssetPropertyVariantPropertyDsl {
    private val cdkBuilder: CfnDetectorModel.AssetPropertyVariantProperty.Builder =
        CfnDetectorModel.AssetPropertyVariantProperty.builder()

    public fun booleanValue(booleanValue: String) {
        cdkBuilder.booleanValue(booleanValue)
    }

    public fun doubleValue(doubleValue: String) {
        cdkBuilder.doubleValue(doubleValue)
    }

    public fun integerValue(integerValue: String) {
        cdkBuilder.integerValue(integerValue)
    }

    public fun stringValue(stringValue: String) {
        cdkBuilder.stringValue(stringValue)
    }

    public fun build(): CfnDetectorModel.AssetPropertyVariantProperty = cdkBuilder.build()
}
