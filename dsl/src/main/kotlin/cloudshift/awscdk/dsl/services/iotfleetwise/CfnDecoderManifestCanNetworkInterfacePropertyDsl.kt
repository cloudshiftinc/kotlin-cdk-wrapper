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

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
 * CanNetworkInterfaceProperty canNetworkInterfaceProperty = CanNetworkInterfaceProperty.builder()
 * .canInterface(CanInterfaceProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .protocolName("protocolName")
 * .protocolVersion("protocolVersion")
 * .build())
 * .interfaceId("interfaceId")
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotfleetwise-decodermanifest-cannetworkinterface.html)
 */
@CdkDslMarker
public class CfnDecoderManifestCanNetworkInterfacePropertyDsl {
    private val cdkBuilder: CfnDecoderManifest.CanNetworkInterfaceProperty.Builder =
        CfnDecoderManifest.CanNetworkInterfaceProperty.builder()

    /** @param canInterface the value to be set. */
    public fun canInterface(canInterface: IResolvable) {
        cdkBuilder.canInterface(canInterface)
    }

    /** @param canInterface the value to be set. */
    public fun canInterface(canInterface: CfnDecoderManifest.CanInterfaceProperty) {
        cdkBuilder.canInterface(canInterface)
    }

    /** @param interfaceId the value to be set. */
    public fun interfaceId(interfaceId: String) {
        cdkBuilder.interfaceId(interfaceId)
    }

    /** @param type the value to be set. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDecoderManifest.CanNetworkInterfaceProperty = cdkBuilder.build()
}
