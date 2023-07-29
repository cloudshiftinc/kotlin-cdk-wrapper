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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnPrefixList

/**
 * An entry for a prefix list.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * EntryProperty entryProperty = EntryProperty.builder()
 * .cidr("cidr")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-prefixlist-entry.html)
 */
@CdkDslMarker
public class CfnPrefixListEntryPropertyDsl {
    private val cdkBuilder: CfnPrefixList.EntryProperty.Builder =
        CfnPrefixList.EntryProperty.builder()

    /** @param cidr The CIDR block. */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /**
     * @param description A description for the entry. Constraints: Up to 255 characters in length.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun build(): CfnPrefixList.EntryProperty = cdkBuilder.build()
}
