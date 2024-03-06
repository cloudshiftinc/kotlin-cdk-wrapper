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
import software.amazon.awscdk.services.backup.CfnRestoreTestingSelection

/**
 * Pair of two related strings.
 *
 * Allowed characters are letters, white space, and numbers that can be represented in UTF-8 and the
 * following characters: `+ - = . _ : /`
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.backup.*;
 * KeyValueProperty keyValueProperty = KeyValueProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-backup-restoretestingselection-keyvalue.html)
 */
@CdkDslMarker
public class CfnRestoreTestingSelectionKeyValuePropertyDsl {
    private val cdkBuilder: CfnRestoreTestingSelection.KeyValueProperty.Builder =
        CfnRestoreTestingSelection.KeyValueProperty.builder()

    /**
     * @param key The tag key (String). The key can't start with `aws:` . Length Constraints:
     *   Minimum length of 1. Maximum length of 128.
     *
     * Pattern: `^(?![aA]{1}[wW]{1}[sS]{1}:)([\p{L}\p{Z}\p{N}_.:/=+\-&#64;]+)$`
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /**
     * @param value The value of the key. Length Constraints: Maximum length of 256.
     *
     * Pattern: `^([\p{L}\p{Z}\p{N}_.:/=+\-&#64;]*)$`
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnRestoreTestingSelection.KeyValueProperty = cdkBuilder.build()
}
