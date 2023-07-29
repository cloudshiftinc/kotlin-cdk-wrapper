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

package cloudshift.awscdk.dsl.services.datasync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datasync.CfnTask

/**
 * Specifies which files, folders, and objects to include or exclude when transferring files from
 * source to destination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datasync.*;
 * FilterRuleProperty filterRuleProperty = FilterRuleProperty.builder()
 * .filterType("filterType")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-task-filterrule.html)
 */
@CdkDslMarker
public class CfnTaskFilterRulePropertyDsl {
    private val cdkBuilder: CfnTask.FilterRuleProperty.Builder =
        CfnTask.FilterRuleProperty.builder()

    /**
     * @param filterType The type of filter rule to apply. AWS DataSync only supports the
     *   SIMPLE_PATTERN rule type.
     */
    public fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
    }

    /**
     * @param value A single filter string that consists of the patterns to include or exclude. The
     *   patterns are delimited by "|" (that is, a pipe), for example: `/folder1|/folder2`
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTask.FilterRuleProperty = cdkBuilder.build()
}
