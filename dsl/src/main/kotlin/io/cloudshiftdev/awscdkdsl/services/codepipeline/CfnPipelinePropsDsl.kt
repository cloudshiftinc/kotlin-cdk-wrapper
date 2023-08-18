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

package io.cloudshiftdev.awscdkdsl.services.codepipeline

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline
import software.amazon.awscdk.services.codepipeline.CfnPipelineProps

/**
 * Properties for defining a `CfnPipeline`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * Object configuration;
 * CfnPipelineProps cfnPipelineProps = CfnPipelineProps.builder()
 * .roleArn("roleArn")
 * .stages(List.of(StageDeclarationProperty.builder()
 * .actions(List.of(ActionDeclarationProperty.builder()
 * .actionTypeId(ActionTypeIdProperty.builder()
 * .category("category")
 * .owner("owner")
 * .provider("provider")
 * .version("version")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .configuration(configuration)
 * .inputArtifacts(List.of(InputArtifactProperty.builder()
 * .name("name")
 * .build()))
 * .namespace("namespace")
 * .outputArtifacts(List.of(OutputArtifactProperty.builder()
 * .name("name")
 * .build()))
 * .region("region")
 * .roleArn("roleArn")
 * .runOrder(123)
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .blockers(List.of(BlockerDeclarationProperty.builder()
 * .name("name")
 * .type("type")
 * .build()))
 * .build()))
 * // the properties below are optional
 * .artifactStore(ArtifactStoreProperty.builder()
 * .location("location")
 * .type("type")
 * // the properties below are optional
 * .encryptionKey(EncryptionKeyProperty.builder()
 * .id("id")
 * .type("type")
 * .build())
 * .build())
 * .artifactStores(List.of(ArtifactStoreMapProperty.builder()
 * .artifactStore(ArtifactStoreProperty.builder()
 * .location("location")
 * .type("type")
 * // the properties below are optional
 * .encryptionKey(EncryptionKeyProperty.builder()
 * .id("id")
 * .type("type")
 * .build())
 * .build())
 * .region("region")
 * .build()))
 * .disableInboundStageTransitions(List.of(StageTransitionProperty.builder()
 * .reason("reason")
 * .stageName("stageName")
 * .build()))
 * .name("name")
 * .restartExecutionOnUpdate(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-pipeline.html)
 */
@CdkDslMarker
public class CfnPipelinePropsDsl {
    private val cdkBuilder: CfnPipelineProps.Builder = CfnPipelineProps.builder()

    private val _artifactStores: MutableList<Any> = mutableListOf()

    private val _disableInboundStageTransitions: MutableList<Any> = mutableListOf()

    private val _stages: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     */
    public fun artifactStore(artifactStore: IResolvable) {
        cdkBuilder.artifactStore(artifactStore)
    }

    /**
     * @param artifactStore The S3 bucket where artifacts for the pipeline are stored.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     */
    public fun artifactStore(artifactStore: CfnPipeline.ArtifactStoreProperty) {
        cdkBuilder.artifactStore(artifactStore)
    }

    /**
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     *   Regions. There must be an artifact store for the pipeline Region and for each cross-region
     *   action in the pipeline.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     */
    public fun artifactStores(vararg artifactStores: Any) {
        _artifactStores.addAll(listOf(*artifactStores))
    }

    /**
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     *   Regions. There must be an artifact store for the pipeline Region and for each cross-region
     *   action in the pipeline.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     */
    public fun artifactStores(artifactStores: Collection<Any>) {
        _artifactStores.addAll(artifactStores)
    }

    /**
     * @param artifactStores A mapping of `artifactStore` objects and their corresponding AWS
     *   Regions. There must be an artifact store for the pipeline Region and for each cross-region
     *   action in the pipeline.
     *
     * You must include either `artifactStore` or `artifactStores` in your pipeline, but you cannot
     * use both. If you create a cross-region action in your pipeline, you must use `artifactStores`
     * .
     */
    public fun artifactStores(artifactStores: IResolvable) {
        cdkBuilder.artifactStores(artifactStores)
    }

    /**
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     *   action.
     */
    public fun disableInboundStageTransitions(vararg disableInboundStageTransitions: Any) {
        _disableInboundStageTransitions.addAll(listOf(*disableInboundStageTransitions))
    }

    /**
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     *   action.
     */
    public fun disableInboundStageTransitions(disableInboundStageTransitions: Collection<Any>) {
        _disableInboundStageTransitions.addAll(disableInboundStageTransitions)
    }

    /**
     * @param disableInboundStageTransitions Represents the input of a `DisableStageTransition`
     *   action.
     */
    public fun disableInboundStageTransitions(disableInboundStageTransitions: IResolvable) {
        cdkBuilder.disableInboundStageTransitions(disableInboundStageTransitions)
    }

    /** @param name The name of the pipeline. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     *   you update it.
     */
    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
        cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    /**
     * @param restartExecutionOnUpdate Indicates whether to rerun the CodePipeline pipeline after
     *   you update it.
     */
    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: IResolvable) {
        cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) for CodePipeline to use to either perform
     *   actions with no `actionRoleArn` , or to use to assume roles for actions with an
     *   `actionRoleArn` .
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param stages Represents information about a stage and its definition. */
    public fun stages(vararg stages: Any) {
        _stages.addAll(listOf(*stages))
    }

    /** @param stages Represents information about a stage and its definition. */
    public fun stages(stages: Collection<Any>) {
        _stages.addAll(stages)
    }

    /** @param stages Represents information about a stage and its definition. */
    public fun stages(stages: IResolvable) {
        cdkBuilder.stages(stages)
    }

    /** @param tags Specifies the tags applied to the pipeline. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Specifies the tags applied to the pipeline. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPipelineProps {
        if (_artifactStores.isNotEmpty()) cdkBuilder.artifactStores(_artifactStores)
        if (_disableInboundStageTransitions.isNotEmpty())
            cdkBuilder.disableInboundStageTransitions(_disableInboundStageTransitions)
        if (_stages.isNotEmpty()) cdkBuilder.stages(_stages)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
