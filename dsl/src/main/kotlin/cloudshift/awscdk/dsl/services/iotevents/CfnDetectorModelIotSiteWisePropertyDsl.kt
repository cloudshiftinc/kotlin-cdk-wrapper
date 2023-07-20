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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotevents.CfnDetectorModel
import kotlin.String

@CdkDslMarker
public class CfnDetectorModelIotSiteWisePropertyDsl {
    private val cdkBuilder: CfnDetectorModel.IotSiteWiseProperty.Builder =
        CfnDetectorModel.IotSiteWiseProperty.builder()

    public fun assetId(assetId: String) {
        cdkBuilder.assetId(assetId)
    }

    public fun entryId(entryId: String) {
        cdkBuilder.entryId(entryId)
    }

    public fun propertyAlias(propertyAlias: String) {
        cdkBuilder.propertyAlias(propertyAlias)
    }

    public fun propertyId(propertyId: String) {
        cdkBuilder.propertyId(propertyId)
    }

    public fun propertyValue(propertyValue: IResolvable) {
        cdkBuilder.propertyValue(propertyValue)
    }

    public fun propertyValue(propertyValue: CfnDetectorModel.AssetPropertyValueProperty) {
        cdkBuilder.propertyValue(propertyValue)
    }

    public fun build(): CfnDetectorModel.IotSiteWiseProperty = cdkBuilder.build()
}
