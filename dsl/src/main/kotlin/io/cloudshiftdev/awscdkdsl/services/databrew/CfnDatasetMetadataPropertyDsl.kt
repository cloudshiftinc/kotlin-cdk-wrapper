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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnDataset

/**
 * Contains additional resource information needed for specific datasets.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * MetadataProperty metadataProperty = MetadataProperty.builder()
 * .sourceArn("sourceArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-metadata.html)
 */
@CdkDslMarker
public class CfnDatasetMetadataPropertyDsl {
    private val cdkBuilder: CfnDataset.MetadataProperty.Builder =
        CfnDataset.MetadataProperty.builder()

    /**
     * @param sourceArn The Amazon Resource Name (ARN) associated with the dataset. Currently,
     *   DataBrew only supports ARNs from Amazon AppFlow.
     */
    public fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
    }

    public fun build(): CfnDataset.MetadataProperty = cdkBuilder.build()
}
