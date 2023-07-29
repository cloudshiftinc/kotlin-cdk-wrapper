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

package cloudshift.awscdk.dsl.services.macie

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.macie.CfnFindingsFilter

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.macie.*;
 * FindingsFilterListItemProperty findingsFilterListItemProperty =
 * FindingsFilterListItemProperty.builder()
 * .id("id")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingsfilterlistitem.html)
 */
@CdkDslMarker
public class CfnFindingsFilterFindingsFilterListItemPropertyDsl {
    private val cdkBuilder: CfnFindingsFilter.FindingsFilterListItemProperty.Builder =
        CfnFindingsFilter.FindingsFilterListItemProperty.builder()

    /** @param id the value to be set. */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /** @param name the value to be set. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnFindingsFilter.FindingsFilterListItemProperty = cdkBuilder.build()
}
