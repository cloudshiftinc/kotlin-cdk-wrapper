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

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

@CdkDslMarker
public class CfnStudioComponentStudioComponentConfigurationPropertyDsl {
    private val cdkBuilder: CfnStudioComponent.StudioComponentConfigurationProperty.Builder =
        CfnStudioComponent.StudioComponentConfigurationProperty.builder()

    public fun activeDirectoryConfiguration(activeDirectoryConfiguration: IResolvable) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration)
    }

    public fun activeDirectoryConfiguration(activeDirectoryConfiguration: CfnStudioComponent.ActiveDirectoryConfigurationProperty) {
        cdkBuilder.activeDirectoryConfiguration(activeDirectoryConfiguration)
    }

    public fun computeFarmConfiguration(computeFarmConfiguration: IResolvable) {
        cdkBuilder.computeFarmConfiguration(computeFarmConfiguration)
    }

    public fun computeFarmConfiguration(computeFarmConfiguration: CfnStudioComponent.ComputeFarmConfigurationProperty) {
        cdkBuilder.computeFarmConfiguration(computeFarmConfiguration)
    }

    public fun licenseServiceConfiguration(licenseServiceConfiguration: IResolvable) {
        cdkBuilder.licenseServiceConfiguration(licenseServiceConfiguration)
    }

    public fun licenseServiceConfiguration(licenseServiceConfiguration: CfnStudioComponent.LicenseServiceConfigurationProperty) {
        cdkBuilder.licenseServiceConfiguration(licenseServiceConfiguration)
    }

    public fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: IResolvable) {
        cdkBuilder.sharedFileSystemConfiguration(sharedFileSystemConfiguration)
    }

    public fun sharedFileSystemConfiguration(sharedFileSystemConfiguration: CfnStudioComponent.SharedFileSystemConfigurationProperty) {
        cdkBuilder.sharedFileSystemConfiguration(sharedFileSystemConfiguration)
    }

    public fun build(): CfnStudioComponent.StudioComponentConfigurationProperty = cdkBuilder.build()
}
