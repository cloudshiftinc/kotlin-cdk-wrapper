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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * Object labels;
 * MetadataProperty metadataProperty = MetadataProperty.builder()
 * .labels(labels)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-metadata.html)
 */
@CdkDslMarker
public class CfnJobDefinitionMetadataPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.MetadataProperty.Builder =
        CfnJobDefinition.MetadataProperty.builder()

    /** @param labels the value to be set. */
    public fun labels(labels: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(labels)
        cdkBuilder.labels(builder.map)
    }

    /** @param labels the value to be set. */
    public fun labels(labels: Any) {
        cdkBuilder.labels(labels)
    }

    public fun build(): CfnJobDefinition.MetadataProperty = cdkBuilder.build()
}
