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

package io.cloudshiftdev.awscdkdsl.services.fis

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import software.amazon.awscdk.services.fis.CfnExperimentTemplateProps

/**
 * Properties for defining a `CfnExperimentTemplate`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fis.*;
 * Object cloudWatchLogsConfiguration;
 * Object s3Configuration;
 * CfnExperimentTemplateProps cfnExperimentTemplateProps = CfnExperimentTemplateProps.builder()
 * .description("description")
 * .roleArn("roleArn")
 * .stopConditions(List.of(ExperimentTemplateStopConditionProperty.builder()
 * .source("source")
 * // the properties below are optional
 * .value("value")
 * .build()))
 * .targets(Map.of(
 * "targetsKey", ExperimentTemplateTargetProperty.builder()
 * .resourceType("resourceType")
 * .selectionMode("selectionMode")
 * // the properties below are optional
 * .filters(List.of(ExperimentTemplateTargetFilterProperty.builder()
 * .path("path")
 * .values(List.of("values"))
 * .build()))
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .resourceArns(List.of("resourceArns"))
 * .resourceTags(Map.of(
 * "resourceTagsKey", "resourceTags"))
 * .build()))
 * // the properties below are optional
 * .actions(Map.of(
 * "actionsKey", ExperimentTemplateActionProperty.builder()
 * .actionId("actionId")
 * // the properties below are optional
 * .description("description")
 * .parameters(Map.of(
 * "parametersKey", "parameters"))
 * .startAfter(List.of("startAfter"))
 * .targets(Map.of(
 * "targetsKey", "targets"))
 * .build()))
 * .experimentOptions(ExperimentTemplateExperimentOptionsProperty.builder()
 * .accountTargeting("accountTargeting")
 * .emptyTargetResolutionMode("emptyTargetResolutionMode")
 * .build())
 * .logConfiguration(ExperimentTemplateLogConfigurationProperty.builder()
 * .logSchemaVersion(123)
 * // the properties below are optional
 * .cloudWatchLogsConfiguration(cloudWatchLogsConfiguration)
 * .s3Configuration(s3Configuration)
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html)
 */
@CdkDslMarker
public class CfnExperimentTemplatePropsDsl {
    private val cdkBuilder: CfnExperimentTemplateProps.Builder =
        CfnExperimentTemplateProps.builder()

    private val _stopConditions: MutableList<Any> = mutableListOf()

    /** @param actions The actions for the experiment. */
    public fun actions(actions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(actions)
        cdkBuilder.actions(builder.map)
    }

    /** @param actions The actions for the experiment. */
    public fun actions(actions: Map<String, Any>) {
        cdkBuilder.actions(actions)
    }

    /** @param actions The actions for the experiment. */
    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    /** @param description The description for the experiment template. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param experimentOptions The experiment options for an experiment template. */
    public fun experimentOptions(experimentOptions: IResolvable) {
        cdkBuilder.experimentOptions(experimentOptions)
    }

    /** @param experimentOptions The experiment options for an experiment template. */
    public fun experimentOptions(
        experimentOptions: CfnExperimentTemplate.ExperimentTemplateExperimentOptionsProperty
    ) {
        cdkBuilder.experimentOptions(experimentOptions)
    }

    /** @param logConfiguration The configuration for experiment logging. */
    public fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /** @param logConfiguration The configuration for experiment logging. */
    public fun logConfiguration(
        logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty
    ) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /** @param roleArn The Amazon Resource Name (ARN) of an IAM role. */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param stopConditions The stop conditions for the experiment. */
    public fun stopConditions(vararg stopConditions: Any) {
        _stopConditions.addAll(listOf(*stopConditions))
    }

    /** @param stopConditions The stop conditions for the experiment. */
    public fun stopConditions(stopConditions: Collection<Any>) {
        _stopConditions.addAll(stopConditions)
    }

    /** @param stopConditions The stop conditions for the experiment. */
    public fun stopConditions(stopConditions: IResolvable) {
        cdkBuilder.stopConditions(stopConditions)
    }

    /** @param tags The tags for the experiment template. */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /** @param targets The targets for the experiment. */
    public fun targets(targets: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(targets)
        cdkBuilder.targets(builder.map)
    }

    /** @param targets The targets for the experiment. */
    public fun targets(targets: Map<String, Any>) {
        cdkBuilder.targets(targets)
    }

    /** @param targets The targets for the experiment. */
    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    public fun build(): CfnExperimentTemplateProps {
        if (_stopConditions.isNotEmpty()) cdkBuilder.stopConditions(_stopConditions)
        return cdkBuilder.build()
    }
}
