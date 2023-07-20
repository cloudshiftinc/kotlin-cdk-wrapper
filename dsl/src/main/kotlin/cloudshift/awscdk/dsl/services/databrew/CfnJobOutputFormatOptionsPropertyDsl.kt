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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.databrew.CfnJob

@CdkDslMarker
public class CfnJobOutputFormatOptionsPropertyDsl {
    private val cdkBuilder: CfnJob.OutputFormatOptionsProperty.Builder =
        CfnJob.OutputFormatOptionsProperty.builder()

    public fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv)
    }

    public fun csv(csv: CfnJob.CsvOutputOptionsProperty) {
        cdkBuilder.csv(csv)
    }

    public fun build(): CfnJob.OutputFormatOptionsProperty = cdkBuilder.build()
}
