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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachment
import software.constructs.Construct

/**
 * Use the `AWS::IoT::ThingPrincipalAttachment` resource to attach a principal (an X.509 certificate
 * or another credential) to a thing.
 *
 * For more information about working with AWS IoT things and principals, see
 * [Authorization](https://docs.aws.amazon.com/iot/latest/developerguide/authorization.html) in the
 * *AWS IoT Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnThingPrincipalAttachment cfnThingPrincipalAttachment =
 * CfnThingPrincipalAttachment.Builder.create(this, "MyCfnThingPrincipalAttachment")
 * .principal("principal")
 * .thingName("thingName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html)
 */
@CdkDslMarker
public class CfnThingPrincipalAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnThingPrincipalAttachment.Builder =
        CfnThingPrincipalAttachment.Builder.create(scope, id)

    /**
     * The principal, which can be a certificate ARN (as returned from the `CreateCertificate`
     * operation) or an Amazon Cognito ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-principal)
     *
     * @param principal The principal, which can be a certificate ARN (as returned from the
     *   `CreateCertificate` operation) or an Amazon Cognito ID.
     */
    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    /**
     * The name of the AWS IoT thing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-thingprincipalattachment.html#cfn-iot-thingprincipalattachment-thingname)
     *
     * @param thingName The name of the AWS IoT thing.
     */
    public fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
    }

    public fun build(): CfnThingPrincipalAttachment = cdkBuilder.build()
}
