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
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnPipeline

/**
 * The datastore activity that specifies where to store the processed data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotanalytics.*;
 * DatastoreProperty datastoreProperty = DatastoreProperty.builder()
 * .datastoreName("datastoreName")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-pipeline-datastore.html)
 */
@CdkDslMarker
public class CfnPipelineDatastorePropertyDsl {
    private val cdkBuilder: CfnPipeline.DatastoreProperty.Builder =
        CfnPipeline.DatastoreProperty.builder()

    /** @param datastoreName The name of the data store where processed messages are stored. */
    public fun datastoreName(datastoreName: String) {
        cdkBuilder.datastoreName(datastoreName)
    }

    /** @param name The name of the datastore activity. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnPipeline.DatastoreProperty = cdkBuilder.build()
}
