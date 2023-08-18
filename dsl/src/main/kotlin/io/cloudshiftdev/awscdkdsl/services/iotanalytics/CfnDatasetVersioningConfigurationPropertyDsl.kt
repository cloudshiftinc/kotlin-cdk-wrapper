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
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotanalytics.CfnDataset

/**
 * Information about the versioning of dataset contents.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * VersioningConfigurationProperty versioningConfigurationProperty =
 * VersioningConfigurationProperty.builder()
 * .maxVersions(123)
 * .unlimited(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html)
 */
@CdkDslMarker
public class CfnDatasetVersioningConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataset.VersioningConfigurationProperty.Builder =
        CfnDataset.VersioningConfigurationProperty.builder()

    /**
     * @param maxVersions How many versions of dataset contents are kept. The `unlimited` parameter
     *   must be `false` .
     */
    public fun maxVersions(maxVersions: Number) {
        cdkBuilder.maxVersions(maxVersions)
    }

    /** @param unlimited If true, unlimited versions of dataset contents are kept. */
    public fun unlimited(unlimited: Boolean) {
        cdkBuilder.unlimited(unlimited)
    }

    /** @param unlimited If true, unlimited versions of dataset contents are kept. */
    public fun unlimited(unlimited: IResolvable) {
        cdkBuilder.unlimited(unlimited)
    }

    public fun build(): CfnDataset.VersioningConfigurationProperty = cdkBuilder.build()
}
