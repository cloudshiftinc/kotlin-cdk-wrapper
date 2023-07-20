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

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iotanalytics.CfnDatastore
import kotlin.String

@CdkDslMarker
public class CfnDatastoreTimestampPartitionPropertyDsl {
    private val cdkBuilder: CfnDatastore.TimestampPartitionProperty.Builder =
        CfnDatastore.TimestampPartitionProperty.builder()

    public fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
    }

    public fun timestampFormat(timestampFormat: String) {
        cdkBuilder.timestampFormat(timestampFormat)
    }

    public fun build(): CfnDatastore.TimestampPartitionProperty = cdkBuilder.build()
}
