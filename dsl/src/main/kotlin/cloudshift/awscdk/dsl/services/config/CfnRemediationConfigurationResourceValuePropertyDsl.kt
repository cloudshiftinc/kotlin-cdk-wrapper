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

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.config.CfnRemediationConfiguration

/**
 * The dynamic value of the resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * ResourceValueProperty resourceValueProperty = ResourceValueProperty.builder()
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-resourcevalue.html)
 */
@CdkDslMarker
public class CfnRemediationConfigurationResourceValuePropertyDsl {
    private val cdkBuilder: CfnRemediationConfiguration.ResourceValueProperty.Builder =
        CfnRemediationConfiguration.ResourceValueProperty.builder()

    /** @param value The value is a resource ID. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnRemediationConfiguration.ResourceValueProperty = cdkBuilder.build()
}
