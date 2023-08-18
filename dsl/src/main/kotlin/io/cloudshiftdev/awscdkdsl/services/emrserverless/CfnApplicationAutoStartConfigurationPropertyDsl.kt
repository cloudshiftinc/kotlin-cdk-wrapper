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
 * The conﬁguration for an application to automatically start on job submission.
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
     * @param enabled Enables the application to automatically start on job submission. Defaults to
     *   true.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Enables the application to automatically start on job submission. Defaults to
     *   true.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnApplication.AutoStartConfigurationProperty = cdkBuilder.build()
}
