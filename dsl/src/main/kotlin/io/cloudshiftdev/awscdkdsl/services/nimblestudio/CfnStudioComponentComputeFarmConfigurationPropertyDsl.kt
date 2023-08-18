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

package io.cloudshiftdev.awscdkdsl.services.nimblestudio

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

/**
 * The configuration for a render farm that is associated with a studio resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * ComputeFarmConfigurationProperty computeFarmConfigurationProperty =
 * ComputeFarmConfigurationProperty.builder()
 * .activeDirectoryUser("activeDirectoryUser")
 * .endpoint("endpoint")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-studiocomponent-computefarmconfiguration.html)
 */
@CdkDslMarker
public class CfnStudioComponentComputeFarmConfigurationPropertyDsl {
    private val cdkBuilder: CfnStudioComponent.ComputeFarmConfigurationProperty.Builder =
        CfnStudioComponent.ComputeFarmConfigurationProperty.builder()

    /**
     * @param activeDirectoryUser The name of an Active Directory user that is used on ComputeFarm
     *   worker instances.
     */
    public fun activeDirectoryUser(activeDirectoryUser: String) {
        cdkBuilder.activeDirectoryUser(activeDirectoryUser)
    }

    /**
     * @param endpoint The endpoint of the ComputeFarm that is accessed by the studio component
     *   resource.
     */
    public fun endpoint(endpoint: String) {
        cdkBuilder.endpoint(endpoint)
    }

    public fun build(): CfnStudioComponent.ComputeFarmConfigurationProperty = cdkBuilder.build()
}
