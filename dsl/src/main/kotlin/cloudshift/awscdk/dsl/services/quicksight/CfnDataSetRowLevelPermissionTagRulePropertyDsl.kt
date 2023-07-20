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
import software.amazon.awscdk.services.quicksight.CfnDataSet
import kotlin.String

@CdkDslMarker
public class CfnDataSetRowLevelPermissionTagRulePropertyDsl {
    private val cdkBuilder: CfnDataSet.RowLevelPermissionTagRuleProperty.Builder =
        CfnDataSet.RowLevelPermissionTagRuleProperty.builder()

    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    public fun matchAllValue(matchAllValue: String) {
        cdkBuilder.matchAllValue(matchAllValue)
    }

    public fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
    }

    public fun tagMultiValueDelimiter(tagMultiValueDelimiter: String) {
        cdkBuilder.tagMultiValueDelimiter(tagMultiValueDelimiter)
    }

    public fun build(): CfnDataSet.RowLevelPermissionTagRuleProperty = cdkBuilder.build()
}
