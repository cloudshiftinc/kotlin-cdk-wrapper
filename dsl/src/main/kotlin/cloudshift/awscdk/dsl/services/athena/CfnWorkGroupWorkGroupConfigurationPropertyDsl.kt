@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnWorkGroupWorkGroupConfigurationPropertyDsl {
    private val cdkBuilder: CfnWorkGroup.WorkGroupConfigurationProperty.Builder =
        CfnWorkGroup.WorkGroupConfigurationProperty.builder()

    public fun additionalConfiguration(additionalConfiguration: String) {
        cdkBuilder.additionalConfiguration(additionalConfiguration)
    }

    public fun bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery: Number) {
        cdkBuilder.bytesScannedCutoffPerQuery(bytesScannedCutoffPerQuery)
    }

    public fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: IResolvable) {
        cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration)
    }

    public fun customerContentEncryptionConfiguration(customerContentEncryptionConfiguration: CfnWorkGroup.CustomerContentEncryptionConfigurationProperty) {
        cdkBuilder.customerContentEncryptionConfiguration(customerContentEncryptionConfiguration)
    }

    public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: Boolean) {
        cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
    }

    public fun enforceWorkGroupConfiguration(enforceWorkGroupConfiguration: IResolvable) {
        cdkBuilder.enforceWorkGroupConfiguration(enforceWorkGroupConfiguration)
    }

    public fun engineVersion(engineVersion: IResolvable) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun engineVersion(engineVersion: CfnWorkGroup.EngineVersionProperty) {
        cdkBuilder.engineVersion(engineVersion)
    }

    public fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
    }

    public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled)
    }

    public fun publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.publishCloudWatchMetricsEnabled(publishCloudWatchMetricsEnabled)
    }

    public fun requesterPaysEnabled(requesterPaysEnabled: Boolean) {
        cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
    }

    public fun requesterPaysEnabled(requesterPaysEnabled: IResolvable) {
        cdkBuilder.requesterPaysEnabled(requesterPaysEnabled)
    }

    public fun resultConfiguration(resultConfiguration: IResolvable) {
        cdkBuilder.resultConfiguration(resultConfiguration)
    }

    public fun resultConfiguration(resultConfiguration: CfnWorkGroup.ResultConfigurationProperty) {
        cdkBuilder.resultConfiguration(resultConfiguration)
    }

    public fun build(): CfnWorkGroup.WorkGroupConfigurationProperty = cdkBuilder.build()
}
