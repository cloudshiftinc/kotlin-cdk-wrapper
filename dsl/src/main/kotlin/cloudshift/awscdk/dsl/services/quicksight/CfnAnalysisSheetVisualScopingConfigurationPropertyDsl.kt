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
import software.amazon.awscdk.services.quicksight.CfnAnalysis
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnalysisSheetVisualScopingConfigurationPropertyDsl {
    private val cdkBuilder: CfnAnalysis.SheetVisualScopingConfigurationProperty.Builder =
        CfnAnalysis.SheetVisualScopingConfigurationProperty.builder()

    private val _visualIds: MutableList<String> = mutableListOf()

    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun sheetId(sheetId: String) {
        cdkBuilder.sheetId(sheetId)
    }

    public fun visualIds(vararg visualIds: String) {
        _visualIds.addAll(listOf(*visualIds))
    }

    public fun visualIds(visualIds: Collection<String>) {
        _visualIds.addAll(visualIds)
    }

    public fun build(): CfnAnalysis.SheetVisualScopingConfigurationProperty {
        if (_visualIds.isNotEmpty()) cdkBuilder.visualIds(_visualIds)
        return cdkBuilder.build()
    }
}
