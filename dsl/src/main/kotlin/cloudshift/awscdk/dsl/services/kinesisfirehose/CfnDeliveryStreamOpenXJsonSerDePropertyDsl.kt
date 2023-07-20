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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnDeliveryStreamOpenXJsonSerDePropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.OpenXJsonSerDeProperty.Builder =
        CfnDeliveryStream.OpenXJsonSerDeProperty.builder()

    public fun caseInsensitive(caseInsensitive: Boolean) {
        cdkBuilder.caseInsensitive(caseInsensitive)
    }

    public fun caseInsensitive(caseInsensitive: IResolvable) {
        cdkBuilder.caseInsensitive(caseInsensitive)
    }

    public fun columnToJsonKeyMappings(columnToJsonKeyMappings: Map<String, String>) {
        cdkBuilder.columnToJsonKeyMappings(columnToJsonKeyMappings)
    }

    public fun columnToJsonKeyMappings(columnToJsonKeyMappings: IResolvable) {
        cdkBuilder.columnToJsonKeyMappings(columnToJsonKeyMappings)
    }

    public fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: Boolean) {
        cdkBuilder.convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores)
    }

    public fun convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores: IResolvable) {
        cdkBuilder.convertDotsInJsonKeysToUnderscores(convertDotsInJsonKeysToUnderscores)
    }

    public fun build(): CfnDeliveryStream.OpenXJsonSerDeProperty = cdkBuilder.build()
}
