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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lightsail.CfnStaticIp
import software.constructs.Construct

/**
 * The `AWS::Lightsail::StaticIp` resource specifies a static IP that can be attached to an Amazon
 * Lightsail instance that is in the same AWS Region and Availability Zone.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CfnStaticIp cfnStaticIp = CfnStaticIp.Builder.create(this, "MyCfnStaticIp")
 * .staticIpName("staticIpName")
 * // the properties below are optional
 * .attachedTo("attachedTo")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html)
 */
@CdkDslMarker
public class CfnStaticIpDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStaticIp.Builder = CfnStaticIp.Builder.create(scope, id)

    /**
     * The instance that the static IP is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-attachedto)
     *
     * @param attachedTo The instance that the static IP is attached to.
     */
    public fun attachedTo(attachedTo: String) {
        cdkBuilder.attachedTo(attachedTo)
    }

    /**
     * The name of the static IP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-staticip.html#cfn-lightsail-staticip-staticipname)
     *
     * @param staticIpName The name of the static IP.
     */
    public fun staticIpName(staticIpName: String) {
        cdkBuilder.staticIpName(staticIpName)
    }

    public fun build(): CfnStaticIp = cdkBuilder.build()
}
