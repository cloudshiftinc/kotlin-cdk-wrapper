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

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.backup.CfnBackupSelection
import kotlin.String

@CdkDslMarker
public class CfnBackupSelectionConditionParameterPropertyDsl {
    private val cdkBuilder: CfnBackupSelection.ConditionParameterProperty.Builder =
        CfnBackupSelection.ConditionParameterProperty.builder()

    public fun conditionKey(conditionKey: String) {
        cdkBuilder.conditionKey(conditionKey)
    }

    public fun conditionValue(conditionValue: String) {
        cdkBuilder.conditionValue(conditionValue)
    }

    public fun build(): CfnBackupSelection.ConditionParameterProperty = cdkBuilder.build()
}
