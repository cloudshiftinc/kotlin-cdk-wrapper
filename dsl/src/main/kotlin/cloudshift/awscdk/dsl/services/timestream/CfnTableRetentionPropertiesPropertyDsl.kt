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

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.timestream.CfnTable
import kotlin.String

@CdkDslMarker
public class CfnTableRetentionPropertiesPropertyDsl {
    private val cdkBuilder: CfnTable.RetentionPropertiesProperty.Builder =
        CfnTable.RetentionPropertiesProperty.builder()

    public fun magneticStoreRetentionPeriodInDays(magneticStoreRetentionPeriodInDays: String) {
        cdkBuilder.magneticStoreRetentionPeriodInDays(magneticStoreRetentionPeriodInDays)
    }

    public fun memoryStoreRetentionPeriodInHours(memoryStoreRetentionPeriodInHours: String) {
        cdkBuilder.memoryStoreRetentionPeriodInHours(memoryStoreRetentionPeriodInHours)
    }

    public fun build(): CfnTable.RetentionPropertiesProperty = cdkBuilder.build()
}
