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
import kotlin.Boolean
import software.amazon.awscdk.services.ec2.LaunchTemplateRequireImdsv2AspectProps

/**
 * Properties for `LaunchTemplateRequireImdsv2Aspect`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * LaunchTemplateRequireImdsv2AspectProps launchTemplateRequireImdsv2AspectProps =
 * LaunchTemplateRequireImdsv2AspectProps.builder()
 * .suppressWarnings(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class LaunchTemplateRequireImdsv2AspectPropsDsl {
    private val cdkBuilder: LaunchTemplateRequireImdsv2AspectProps.Builder =
        LaunchTemplateRequireImdsv2AspectProps.builder()

    /**
     * @param suppressWarnings Whether warning annotations from this Aspect should be suppressed or
     *   not.
     */
    public fun suppressWarnings(suppressWarnings: Boolean) {
        cdkBuilder.suppressWarnings(suppressWarnings)
    }

    public fun build(): LaunchTemplateRequireImdsv2AspectProps = cdkBuilder.build()
}
