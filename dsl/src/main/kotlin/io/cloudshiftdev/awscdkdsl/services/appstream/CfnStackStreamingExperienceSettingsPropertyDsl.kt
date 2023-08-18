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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appstream.CfnStack

/**
 * The streaming protocol that you want your stack to prefer.
 *
 * This can be UDP or TCP. Currently, UDP is only supported in the Windows native client.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * StreamingExperienceSettingsProperty streamingExperienceSettingsProperty =
 * StreamingExperienceSettingsProperty.builder()
 * .preferredProtocol("preferredProtocol")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-stack-streamingexperiencesettings.html)
 */
@CdkDslMarker
public class CfnStackStreamingExperienceSettingsPropertyDsl {
    private val cdkBuilder: CfnStack.StreamingExperienceSettingsProperty.Builder =
        CfnStack.StreamingExperienceSettingsProperty.builder()

    /**
     * @param preferredProtocol The preferred protocol that you want to use while streaming your
     *   application.
     */
    public fun preferredProtocol(preferredProtocol: String) {
        cdkBuilder.preferredProtocol(preferredProtocol)
    }

    public fun build(): CfnStack.StreamingExperienceSettingsProperty = cdkBuilder.build()
}
