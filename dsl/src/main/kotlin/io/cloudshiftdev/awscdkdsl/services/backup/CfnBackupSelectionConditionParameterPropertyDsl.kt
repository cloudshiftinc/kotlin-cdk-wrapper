@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.backup

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.backup.CfnBackupSelection

/**
 * Includes information about tags you define to assign tagged resources to a backup plan.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * ConditionParameterProperty conditionParameterProperty = ConditionParameterProperty.builder()
 * .conditionKey("conditionKey")
 * .conditionValue("conditionValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionparameter.html)
 */
@CdkDslMarker
public class CfnBackupSelectionConditionParameterPropertyDsl {
    private val cdkBuilder: CfnBackupSelection.ConditionParameterProperty.Builder =
        CfnBackupSelection.ConditionParameterProperty.builder()

    /**
     * @param conditionKey The key in a key-value pair. For example, in the tag `Department:
     *   Accounting` , `Department` is the key.
     */
    public fun conditionKey(conditionKey: String) {
        cdkBuilder.conditionKey(conditionKey)
    }

    /**
     * @param conditionValue The value in a key-value pair. For example, in the tag `Department:
     *   Accounting` , `Accounting` is the value.
     */
    public fun conditionValue(conditionValue: String) {
        cdkBuilder.conditionValue(conditionValue)
    }

    public fun build(): CfnBackupSelection.ConditionParameterProperty = cdkBuilder.build()
}
