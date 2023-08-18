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

package io.cloudshiftdev.awscdkdsl.services.lightsail

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnStaticIpProps

/**
 * Properties for defining a `CfnStaticIp`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CfnStaticIpProps cfnStaticIpProps = CfnStaticIpProps.builder()
 * .staticIpName("staticIpName")
 * // the properties below are optional
 * .attachedTo("attachedTo")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html)
 */
@CdkDslMarker
public class CfnStaticIpPropsDsl {
    private val cdkBuilder: CfnStaticIpProps.Builder = CfnStaticIpProps.builder()

    /** @param attachedTo The instance that the static IP is attached to. */
    public fun attachedTo(attachedTo: String) {
        cdkBuilder.attachedTo(attachedTo)
    }

    /** @param staticIpName The name of the static IP. */
    public fun staticIpName(staticIpName: String) {
        cdkBuilder.staticIpName(staticIpName)
    }

    public fun build(): CfnStaticIpProps = cdkBuilder.build()
}
