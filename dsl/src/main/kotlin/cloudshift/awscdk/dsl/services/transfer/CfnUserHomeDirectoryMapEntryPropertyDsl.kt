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

package cloudshift.awscdk.dsl.services.transfer

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.transfer.CfnUser

/**
 * Represents an object that contains entries and targets for `HomeDirectoryMappings` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * HomeDirectoryMapEntryProperty homeDirectoryMapEntryProperty =
 * HomeDirectoryMapEntryProperty.builder()
 * .entry("entry")
 * .target("target")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-user-homedirectorymapentry.html)
 */
@CdkDslMarker
public class CfnUserHomeDirectoryMapEntryPropertyDsl {
    private val cdkBuilder: CfnUser.HomeDirectoryMapEntryProperty.Builder =
        CfnUser.HomeDirectoryMapEntryProperty.builder()

    /** @param entry Represents an entry for `HomeDirectoryMappings` . */
    public fun entry(entry: String) {
        cdkBuilder.entry(entry)
    }

    /** @param target Represents the map target that is used in a `HomeDirectorymapEntry` . */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun build(): CfnUser.HomeDirectoryMapEntryProperty = cdkBuilder.build()
}
