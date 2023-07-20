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

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnDataSetUploadSettingsPropertyDsl {
    private val cdkBuilder: CfnDataSet.UploadSettingsProperty.Builder =
        CfnDataSet.UploadSettingsProperty.builder()

    public fun containsHeader(containsHeader: Boolean) {
        cdkBuilder.containsHeader(containsHeader)
    }

    public fun containsHeader(containsHeader: IResolvable) {
        cdkBuilder.containsHeader(containsHeader)
    }

    public fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
    }

    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    public fun startFromRow(startFromRow: Number) {
        cdkBuilder.startFromRow(startFromRow)
    }

    public fun textQualifier(textQualifier: String) {
        cdkBuilder.textQualifier(textQualifier)
    }

    public fun build(): CfnDataSet.UploadSettingsProperty = cdkBuilder.build()
}
