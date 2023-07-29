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

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput
import software.constructs.Construct

/**
 * Adds outputs to an existing bridge.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediaconnect.*;
 * CfnBridgeOutput cfnBridgeOutput = CfnBridgeOutput.Builder.create(this, "MyCfnBridgeOutput")
 * .bridgeArn("bridgeArn")
 * .name("name")
 * .networkOutput(BridgeNetworkOutputProperty.builder()
 * .ipAddress("ipAddress")
 * .networkName("networkName")
 * .port(123)
 * .protocol("protocol")
 * .ttl(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html)
 */
@CdkDslMarker
public class CfnBridgeOutputDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBridgeOutput.Builder = CfnBridgeOutput.Builder.create(scope, id)

    /**
     * The ARN of the bridge that you want to describe.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-bridgearn)
     *
     * @param bridgeArn The ARN of the bridge that you want to describe.
     */
    public fun bridgeArn(bridgeArn: String) {
        cdkBuilder.bridgeArn(bridgeArn)
    }

    /**
     * The network output name.
     *
     * This name is used to reference the output and must be unique among outputs in this bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-name)
     *
     * @param name The network output name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Add a network output to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-networkoutput)
     *
     * @param networkOutput Add a network output to an existing bridge.
     */
    public fun networkOutput(networkOutput: IResolvable) {
        cdkBuilder.networkOutput(networkOutput)
    }

    /**
     * Add a network output to an existing bridge.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-bridgeoutput.html#cfn-mediaconnect-bridgeoutput-networkoutput)
     *
     * @param networkOutput Add a network output to an existing bridge.
     */
    public fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty) {
        cdkBuilder.networkOutput(networkOutput)
    }

    public fun build(): CfnBridgeOutput = cdkBuilder.build()
}
