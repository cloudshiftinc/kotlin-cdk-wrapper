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

package io.cloudshiftdev.awscdkdsl.services.iotanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * The configuration of the resource used to execute the `containerAction` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * ResourceConfigurationProperty resourceConfigurationProperty =
 * ResourceConfigurationProperty.builder()
 * .computeType("computeType")
 * .volumeSizeInGb(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html)
 */
@CdkDslMarker
public class CfnDatasetResourceConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataset.ResourceConfigurationProperty.Builder =
        CfnDataset.ResourceConfigurationProperty.builder()

    /**
     * @param computeType The type of the compute resource used to execute the `containerAction` .
     *   Possible values are: `ACU_1` (vCPU=4, memory=16 GiB) or `ACU_2` (vCPU=8, memory=32 GiB).
     */
    public fun computeType(computeType: String) {
        cdkBuilder.computeType(computeType)
    }

    /**
     * @param volumeSizeInGb The size, in GB, of the persistent storage available to the resource
     *   instance used to execute the `containerAction` (min: 1, max: 50).
     */
    public fun volumeSizeInGb(volumeSizeInGb: Number) {
        cdkBuilder.volumeSizeInGb(volumeSizeInGb)
    }

    public fun build(): CfnDataset.ResourceConfigurationProperty = cdkBuilder.build()
}
