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

package io.cloudshiftdev.awscdkdsl.services.workspacesweb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings

/**
 * The IP rules of the IP access settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.workspacesweb.*;
 * IpRuleProperty ipRuleProperty = IpRuleProperty.builder()
 * .ipRange("ipRange")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-workspacesweb-ipaccesssettings-iprule.html)
 */
@CdkDslMarker
public class CfnIpAccessSettingsIpRulePropertyDsl {
    private val cdkBuilder: CfnIpAccessSettings.IpRuleProperty.Builder =
        CfnIpAccessSettings.IpRuleProperty.builder()

    /** @param description The description of the IP rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param ipRange The IP range of the IP rule. This can either be a single IP address or a range
     *   using CIDR notation.
     */
    public fun ipRange(ipRange: String) {
        cdkBuilder.ipRange(ipRange)
    }

    public fun build(): CfnIpAccessSettings.IpRuleProperty = cdkBuilder.build()
}
