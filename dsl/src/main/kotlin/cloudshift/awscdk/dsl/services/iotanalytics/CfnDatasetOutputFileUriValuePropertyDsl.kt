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
import software.amazon.awscdk.services.iotanalytics.CfnDataset
import kotlin.String

@CdkDslMarker
public class CfnDatasetOutputFileUriValuePropertyDsl {
    private val cdkBuilder: CfnDataset.OutputFileUriValueProperty.Builder =
        CfnDataset.OutputFileUriValueProperty.builder()

    public fun fileName(fileName: String) {
        cdkBuilder.fileName(fileName)
    }

    public fun build(): CfnDataset.OutputFileUriValueProperty = cdkBuilder.build()
}
