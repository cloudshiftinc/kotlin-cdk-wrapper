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

package cloudshift.awscdk.dsl.services.robomaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.robomaker.CfnFleetProps

/**
 * Properties for defining a `CfnFleet`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.robomaker.*;
 * CfnFleetProps cfnFleetProps = CfnFleetProps.builder()
 * .name("name")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-robomaker-fleet.html)
 */
@CdkDslMarker
public class CfnFleetPropsDsl {
    private val cdkBuilder: CfnFleetProps.Builder = CfnFleetProps.builder()

    /** @param name The name of the fleet. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags The list of all tags added to the fleet. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnFleetProps = cdkBuilder.build()
}
