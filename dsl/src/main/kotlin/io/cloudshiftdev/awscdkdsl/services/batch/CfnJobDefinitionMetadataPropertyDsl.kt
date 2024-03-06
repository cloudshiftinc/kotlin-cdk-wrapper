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
 * Metadata about the Kubernetes pod.
 *
 * For more information, see
 * [Understanding Kubernetes Objects](https://docs.aws.amazon.com/https://kubernetes.io/docs/concepts/overview/working-with-objects/kubernetes-objects/)
 * in the *Kubernetes documentation* .
 *
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

    /**
     * @param labels Key-value pairs used to identify, sort, and organize cube resources. Can
     *   contain up to 63 uppercase letters, lowercase letters, numbers, hyphens (-), and
     *   underscores (_). Labels can be added or modified at any time. Each resource can have
     *   multiple labels, but each key must be unique for a given object.
     */
    public fun labels(labels: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(labels)
        cdkBuilder.labels(builder.map)
    }

    /**
     * @param labels Key-value pairs used to identify, sort, and organize cube resources. Can
     *   contain up to 63 uppercase letters, lowercase letters, numbers, hyphens (-), and
     *   underscores (_). Labels can be added or modified at any time. Each resource can have
     *   multiple labels, but each key must be unique for a given object.
     */
    public fun labels(labels: Any) {
        cdkBuilder.labels(labels)
    }

    public fun build(): CfnJobDefinition.MetadataProperty = cdkBuilder.build()
}
