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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * The managed log persistence configuration for a job run.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * ManagedPersistenceMonitoringConfigurationProperty
 * managedPersistenceMonitoringConfigurationProperty =
 * ManagedPersistenceMonitoringConfigurationProperty.builder()
 * .enabled(false)
 * .encryptionKeyArn("encryptionKeyArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-managedpersistencemonitoringconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationManagedPersistenceMonitoringConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnApplication.ManagedPersistenceMonitoringConfigurationProperty.Builder =
        CfnApplication.ManagedPersistenceMonitoringConfigurationProperty.builder()

    /**
     * @param enabled Enables managed logging and defaults to true. If set to false, managed logging
     *   will be turned off.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Enables managed logging and defaults to true. If set to false, managed logging
     *   will be turned off.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param encryptionKeyArn The KMS key ARN to encrypt the logs stored in managed log
     *   persistence.
     */
    public fun encryptionKeyArn(encryptionKeyArn: String) {
        cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    public fun build(): CfnApplication.ManagedPersistenceMonitoringConfigurationProperty =
        cdkBuilder.build()
}
