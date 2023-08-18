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
import software.constructs.Construct

/**
 * Specifies an experiment template.
 *
 * An experiment template includes the following components:
 * * *Targets* : A target can be a specific resource in your AWS environment, or one or more
 *   resources that match criteria that you specify, for example, resources that have specific tags.
 * * *Actions* : The actions to carry out on the target. You can specify multiple actions, the
 *   duration of each action, and when to start each action during an experiment.
 * * *Stop conditions* : If a stop condition is triggered while an experiment is running, the
 *   experiment is automatically stopped. You can define a stop condition as a CloudWatch alarm.
 *
 * For more information, see
 * [Experiment templates](https://docs.aws.amazon.com/fis/latest/userguide/experiment-templates.html)
 * in the *AWS Fault Injection Simulator User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.fis.*;
 * Object cloudWatchLogsConfiguration;
 * Object s3Configuration;
 * CfnExperimentTemplate cfnExperimentTemplate = CfnExperimentTemplate.Builder.create(this,
 * "MyCfnExperimentTemplate")
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
public class CfnExperimentTemplateDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnExperimentTemplate.Builder =
        CfnExperimentTemplate.Builder.create(scope, id)

    private val _stopConditions: MutableList<Any> = mutableListOf()

    /**
     * The actions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
     *
     * @param actions The actions for the experiment.
     */
    public fun actions(actions: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(actions)
        cdkBuilder.actions(builder.map)
    }

    /**
     * The actions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
     *
     * @param actions The actions for the experiment.
     */
    public fun actions(actions: Map<String, Any>) {
        cdkBuilder.actions(actions)
    }

    /**
     * The actions for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-actions)
     *
     * @param actions The actions for the experiment.
     */
    public fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions)
    }

    /**
     * A description for the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-description)
     *
     * @param description A description for the experiment template.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The configuration for experiment logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
     *
     * @param logConfiguration The configuration for experiment logging.
     */
    public fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /**
     * The configuration for experiment logging.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-logconfiguration)
     *
     * @param logConfiguration The configuration for experiment logging.
     */
    public fun logConfiguration(
        logConfiguration: CfnExperimentTemplate.ExperimentTemplateLogConfigurationProperty
    ) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /**
     * The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service permission to
     * perform service actions on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of an IAM role that grants the AWS FIS service
     *   permission to perform service actions on your behalf.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * The stop conditions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
     *
     * @param stopConditions The stop conditions.
     */
    public fun stopConditions(vararg stopConditions: Any) {
        _stopConditions.addAll(listOf(*stopConditions))
    }

    /**
     * The stop conditions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
     *
     * @param stopConditions The stop conditions.
     */
    public fun stopConditions(stopConditions: Collection<Any>) {
        _stopConditions.addAll(stopConditions)
    }

    /**
     * The stop conditions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-stopconditions)
     *
     * @param stopConditions The stop conditions.
     */
    public fun stopConditions(stopConditions: IResolvable) {
        cdkBuilder.stopConditions(stopConditions)
    }

    /**
     * The tags to apply to the experiment template.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-tags)
     *
     * @param tags The tags to apply to the experiment template.
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * The targets for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
     *
     * @param targets The targets for the experiment.
     */
    public fun targets(targets: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(targets)
        cdkBuilder.targets(builder.map)
    }

    /**
     * The targets for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
     *
     * @param targets The targets for the experiment.
     */
    public fun targets(targets: Map<String, Any>) {
        cdkBuilder.targets(targets)
    }

    /**
     * The targets for the experiment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fis-experimenttemplate.html#cfn-fis-experimenttemplate-targets)
     *
     * @param targets The targets for the experiment.
     */
    public fun targets(targets: IResolvable) {
        cdkBuilder.targets(targets)
    }

    public fun build(): CfnExperimentTemplate {
        if (_stopConditions.isNotEmpty()) cdkBuilder.stopConditions(_stopConditions)
        return cdkBuilder.build()
    }
}
