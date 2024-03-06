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

package io.cloudshiftdev.awscdkdsl.services.transfer

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
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
 * // the properties below are optional
 * .type("type")
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

    /** @param target Represents the map target that is used in a `HomeDirectoryMapEntry` . */
    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    /**
     * @param type Specifies the type of mapping. Set the type to `FILE` if you want the mapping to
     *   point to a file, or `DIRECTORY` for the directory to point to a directory.
     *
     * By default, home directory mappings have a `Type` of `DIRECTORY` when you create a Transfer
     * Family server. You would need to explicitly set `Type` to `FILE` if you want a mapping to
     * have a file target.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnUser.HomeDirectoryMapEntryProperty = cdkBuilder.build()
}
