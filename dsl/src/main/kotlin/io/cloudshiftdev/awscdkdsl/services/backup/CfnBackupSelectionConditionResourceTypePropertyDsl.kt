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
 * Specifies an object that contains an array of triplets made up of a condition type (such as
 * `STRINGEQUALS` ), a key, and a value.
 *
 * Conditions are used to filter resources in a selection that is assigned to a backup plan.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * ConditionResourceTypeProperty conditionResourceTypeProperty =
 * ConditionResourceTypeProperty.builder()
 * .conditionKey("conditionKey")
 * .conditionType("conditionType")
 * .conditionValue("conditionValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-backupselection-conditionresourcetype.html)
 */
@CdkDslMarker
public class CfnBackupSelectionConditionResourceTypePropertyDsl {
    private val cdkBuilder: CfnBackupSelection.ConditionResourceTypeProperty.Builder =
        CfnBackupSelection.ConditionResourceTypeProperty.builder()

    /**
     * @param conditionKey The key in a key-value pair. For example, in `"Department": "accounting"`
     *   , `"Department"` is the key.
     */
    public fun conditionKey(conditionKey: String) {
        cdkBuilder.conditionKey(conditionKey)
    }

    /**
     * @param conditionType An operation, such as `STRINGEQUALS` , that is applied to a key-value
     *   pair used to filter resources in a selection.
     */
    public fun conditionType(conditionType: String) {
        cdkBuilder.conditionType(conditionType)
    }

    /**
     * @param conditionValue The value in a key-value pair. For example, in `"Department":
     *   "accounting"` , `"accounting"` is the value.
     */
    public fun conditionValue(conditionValue: String) {
        cdkBuilder.conditionValue(conditionValue)
    }

    public fun build(): CfnBackupSelection.ConditionResourceTypeProperty = cdkBuilder.build()
}
