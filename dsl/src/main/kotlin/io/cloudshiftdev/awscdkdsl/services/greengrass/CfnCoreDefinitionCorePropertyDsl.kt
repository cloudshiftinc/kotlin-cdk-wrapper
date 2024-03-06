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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnCoreDefinition

/**
 * A core is an AWS IoT device that runs the AWS IoT Greengrass core software and manages local
 * processes for a Greengrass group.
 *
 * For more information, see
 * [What Is AWS IoT Greengrass ?](https://docs.aws.amazon.com/greengrass/v1/developerguide/what-is-gg.html)
 * in the *Developer Guide* .
 *
 * In an AWS CloudFormation template, the `Cores` property of the
 * [`CoreDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-coredefinitionversion.html)
 * property type contains a list of `Core` property types. Currently, the list can contain only one
 * core.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * CoreProperty coreProperty = CoreProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-coredefinition-core.html)
 */
@CdkDslMarker
public class CfnCoreDefinitionCorePropertyDsl {
    private val cdkBuilder: CfnCoreDefinition.CoreProperty.Builder =
        CfnCoreDefinition.CoreProperty.builder()

    /**
     * @param certificateArn The Amazon Resource Name (ARN) of the device certificate for the core.
     *   This X.509 certificate is used to authenticate the core with AWS IoT and AWS IoT Greengrass
     *   services.
     */
    public fun certificateArn(certificateArn: String) {
        cdkBuilder.certificateArn(certificateArn)
    }

    /**
     * @param id A descriptive or arbitrary ID for the core. This value must be unique within the
     *   core definition version. Maximum length is 128 characters with pattern `[a-zA-Z0-9:_-]+` .
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param syncShadow Indicates whether the core's local shadow is synced with the cloud
     *   automatically. The default is false.
     */
    public fun syncShadow(syncShadow: Boolean) {
        cdkBuilder.syncShadow(syncShadow)
    }

    /**
     * @param syncShadow Indicates whether the core's local shadow is synced with the cloud
     *   automatically. The default is false.
     */
    public fun syncShadow(syncShadow: IResolvable) {
        cdkBuilder.syncShadow(syncShadow)
    }

    /** @param thingArn The ARN of the core, which is an AWS IoT device (thing). */
    public fun thingArn(thingArn: String) {
        cdkBuilder.thingArn(thingArn)
    }

    public fun build(): CfnCoreDefinition.CoreProperty = cdkBuilder.build()
}
