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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.databrew.CfnDataset
import kotlin.String

@CdkDslMarker
public class CfnDatasetDatetimeOptionsPropertyDsl {
    private val cdkBuilder: CfnDataset.DatetimeOptionsProperty.Builder =
        CfnDataset.DatetimeOptionsProperty.builder()

    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun localeCode(localeCode: String) {
        cdkBuilder.localeCode(localeCode)
    }

    public fun timezoneOffset(timezoneOffset: String) {
        cdkBuilder.timezoneOffset(timezoneOffset)
    }

    public fun build(): CfnDataset.DatetimeOptionsProperty = cdkBuilder.build()
}
