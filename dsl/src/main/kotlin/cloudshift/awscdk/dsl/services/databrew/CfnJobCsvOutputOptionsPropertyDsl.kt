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
import software.amazon.awscdk.services.databrew.CfnJob
import kotlin.String

@CdkDslMarker
public class CfnJobCsvOutputOptionsPropertyDsl {
    private val cdkBuilder: CfnJob.CsvOutputOptionsProperty.Builder =
        CfnJob.CsvOutputOptionsProperty.builder()

    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    public fun build(): CfnJob.CsvOutputOptionsProperty = cdkBuilder.build()
}
