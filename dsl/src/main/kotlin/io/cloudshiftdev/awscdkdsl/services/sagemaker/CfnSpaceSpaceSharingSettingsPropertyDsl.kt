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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnSpace

/**
 * A collection of space sharing settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * SpaceSharingSettingsProperty spaceSharingSettingsProperty =
 * SpaceSharingSettingsProperty.builder()
 * .sharingType("sharingType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-spacesharingsettings.html)
 */
@CdkDslMarker
public class CfnSpaceSpaceSharingSettingsPropertyDsl {
    private val cdkBuilder: CfnSpace.SpaceSharingSettingsProperty.Builder =
        CfnSpace.SpaceSharingSettingsProperty.builder()

    /** @param sharingType Specifies the sharing type of the space. */
    public fun sharingType(sharingType: String) {
        cdkBuilder.sharingType(sharingType)
    }

    public fun build(): CfnSpace.SpaceSharingSettingsProperty = cdkBuilder.build()
}
