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
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * Configuration for Auto Stop of Application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * AutoStopConfigurationProperty autoStopConfigurationProperty =
 * AutoStopConfigurationProperty.builder()
 * .enabled(false)
 * .idleTimeoutMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-autostopconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationAutoStopConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.AutoStopConfigurationProperty.Builder =
        CfnApplication.AutoStopConfigurationProperty.builder()

    /**
     * @param enabled If set to true, the Application will automatically stop after being idle.
     *   Defaults to true.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled If set to true, the Application will automatically stop after being idle.
     *   Defaults to true.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param idleTimeoutMinutes The amount of time [in minutes] to wait before auto stopping the
     *   Application when idle. Defaults to 15 minutes.
     */
    public fun idleTimeoutMinutes(idleTimeoutMinutes: Number) {
        cdkBuilder.idleTimeoutMinutes(idleTimeoutMinutes)
    }

    public fun build(): CfnApplication.AutoStopConfigurationProperty = cdkBuilder.build()
}
