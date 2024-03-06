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

package io.cloudshiftdev.awscdkdsl.services.pcaconnectorad

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pcaconnectorad.CfnTemplate

/**
 * General flags for v4 template schema that defines if the template is for a machine or a user and
 * if the template can be issued using autoenrollment.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pcaconnectorad.*;
 * GeneralFlagsV4Property generalFlagsV4Property = GeneralFlagsV4Property.builder()
 * .autoEnrollment(false)
 * .machineType(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pcaconnectorad-template-generalflagsv4.html)
 */
@CdkDslMarker
public class CfnTemplateGeneralFlagsV4PropertyDsl {
    private val cdkBuilder: CfnTemplate.GeneralFlagsV4Property.Builder =
        CfnTemplate.GeneralFlagsV4Property.builder()

    /**
     * @param autoEnrollment Allows certificate issuance using autoenrollment. Set to TRUE to allow
     *   autoenrollment.
     */
    public fun autoEnrollment(autoEnrollment: Boolean) {
        cdkBuilder.autoEnrollment(autoEnrollment)
    }

    /**
     * @param autoEnrollment Allows certificate issuance using autoenrollment. Set to TRUE to allow
     *   autoenrollment.
     */
    public fun autoEnrollment(autoEnrollment: IResolvable) {
        cdkBuilder.autoEnrollment(autoEnrollment)
    }

    /**
     * @param machineType Defines if the template is for machines or users. Set to TRUE if the
     *   template is for machines. Set to FALSE if the template is for users
     */
    public fun machineType(machineType: Boolean) {
        cdkBuilder.machineType(machineType)
    }

    /**
     * @param machineType Defines if the template is for machines or users. Set to TRUE if the
     *   template is for machines. Set to FALSE if the template is for users
     */
    public fun machineType(machineType: IResolvable) {
        cdkBuilder.machineType(machineType)
    }

    public fun build(): CfnTemplate.GeneralFlagsV4Property = cdkBuilder.build()
}
