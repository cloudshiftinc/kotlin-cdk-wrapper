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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.sagemaker.CfnPipelineProps

/**
 * Properties for defining a `CfnPipeline`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object parallelismConfiguration;
 * Object pipelineDefinition;
 * CfnPipelineProps cfnPipelineProps = CfnPipelineProps.builder()
 * .pipelineDefinition(pipelineDefinition)
 * .pipelineName("pipelineName")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .parallelismConfiguration(parallelismConfiguration)
 * .pipelineDescription("pipelineDescription")
 * .pipelineDisplayName("pipelineDisplayName")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-pipeline.html)
 */
@CdkDslMarker
public class CfnPipelinePropsDsl {
    private val cdkBuilder: CfnPipelineProps.Builder = CfnPipelineProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param parallelismConfiguration The parallelism configuration applied to the pipeline. */
    public fun parallelismConfiguration(parallelismConfiguration: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(parallelismConfiguration)
        cdkBuilder.parallelismConfiguration(builder.map)
    }

    /** @param parallelismConfiguration The parallelism configuration applied to the pipeline. */
    public fun parallelismConfiguration(parallelismConfiguration: Any) {
        cdkBuilder.parallelismConfiguration(parallelismConfiguration)
    }

    /**
     * @param pipelineDefinition The definition of the pipeline. This can be either a JSON string or
     *   an Amazon S3 location.
     */
    public fun pipelineDefinition(pipelineDefinition: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(pipelineDefinition)
        cdkBuilder.pipelineDefinition(builder.map)
    }

    /**
     * @param pipelineDefinition The definition of the pipeline. This can be either a JSON string or
     *   an Amazon S3 location.
     */
    public fun pipelineDefinition(pipelineDefinition: Any) {
        cdkBuilder.pipelineDefinition(pipelineDefinition)
    }

    /** @param pipelineDescription The description of the pipeline. */
    public fun pipelineDescription(pipelineDescription: String) {
        cdkBuilder.pipelineDescription(pipelineDescription)
    }

    /** @param pipelineDisplayName The display name of the pipeline. */
    public fun pipelineDisplayName(pipelineDisplayName: String) {
        cdkBuilder.pipelineDisplayName(pipelineDisplayName)
    }

    /** @param pipelineName The name of the pipeline. */
    public fun pipelineName(pipelineName: String) {
        cdkBuilder.pipelineName(pipelineName)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role used to execute the pipeline.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param tags The tags of the pipeline. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags of the pipeline. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPipelineProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
