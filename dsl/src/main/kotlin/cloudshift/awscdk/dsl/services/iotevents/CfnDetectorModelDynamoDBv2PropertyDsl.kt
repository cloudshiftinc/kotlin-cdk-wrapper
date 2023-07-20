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
public class CfnDetectorModelDynamoDBv2PropertyDsl {
    private val cdkBuilder: CfnDetectorModel.DynamoDBv2Property.Builder =
        CfnDetectorModel.DynamoDBv2Property.builder()

    public fun payload(payload: IResolvable) {
        cdkBuilder.payload(payload)
    }

    public fun payload(payload: CfnDetectorModel.PayloadProperty) {
        cdkBuilder.payload(payload)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun build(): CfnDetectorModel.DynamoDBv2Property = cdkBuilder.build()
}
