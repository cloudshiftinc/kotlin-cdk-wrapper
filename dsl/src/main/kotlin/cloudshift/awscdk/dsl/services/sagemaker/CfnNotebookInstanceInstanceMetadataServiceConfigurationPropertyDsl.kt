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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance
import kotlin.String

@CdkDslMarker
public class CfnNotebookInstanceInstanceMetadataServiceConfigurationPropertyDsl {
    private val cdkBuilder: CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.Builder =
        CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.builder()

    public fun minimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion: String) {
        cdkBuilder.minimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion)
    }

    public fun build(): CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty =
        cdkBuilder.build()
}
