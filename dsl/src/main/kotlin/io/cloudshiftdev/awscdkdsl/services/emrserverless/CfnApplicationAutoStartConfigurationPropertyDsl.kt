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

package io.cloudshiftdev.awscdkdsl.services.emrserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * Configuration for Auto Start of Application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * AutoStartConfigurationProperty autoStartConfigurationProperty =
 * AutoStartConfigurationProperty.builder()
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-autostartconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationAutoStartConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.AutoStartConfigurationProperty.Builder =
        CfnApplication.AutoStartConfigurationProperty.builder()

    /**
     * @param enabled If set to true, the Application will automatically start. Defaults to true.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled If set to true, the Application will automatically start. Defaults to true.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnApplication.AutoStartConfigurationProperty = cdkBuilder.build()
}
