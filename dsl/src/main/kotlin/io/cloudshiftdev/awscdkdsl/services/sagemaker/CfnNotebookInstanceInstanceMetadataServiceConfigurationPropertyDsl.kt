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
import software.amazon.awscdk.services.sagemaker.CfnNotebookInstance

/**
 * Information on the IMDS configuration of the notebook instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * InstanceMetadataServiceConfigurationProperty instanceMetadataServiceConfigurationProperty =
 * InstanceMetadataServiceConfigurationProperty.builder()
 * .minimumInstanceMetadataServiceVersion("minimumInstanceMetadataServiceVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-notebookinstance-instancemetadataserviceconfiguration.html)
 */
@CdkDslMarker
public class CfnNotebookInstanceInstanceMetadataServiceConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.Builder =
        CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty.builder()

    /**
     * @param minimumInstanceMetadataServiceVersion Indicates the minimum IMDS version that the
     *   notebook instance supports. When passed as part of `CreateNotebookInstance` , if no value
     *   is selected, then it defaults to IMDSv1. This means that both IMDSv1 and IMDSv2 are
     *   supported. If passed as part of `UpdateNotebookInstance` , there is no default.
     */
    public fun minimumInstanceMetadataServiceVersion(
        minimumInstanceMetadataServiceVersion: String
    ) {
        cdkBuilder.minimumInstanceMetadataServiceVersion(minimumInstanceMetadataServiceVersion)
    }

    public fun build(): CfnNotebookInstance.InstanceMetadataServiceConfigurationProperty =
        cdkBuilder.build()
}
