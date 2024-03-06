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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnStateMachine
import software.constructs.Construct

/**
 * https://docs.aws.amazon.com/serverless-application-model/latest/developerguide/sam-resource-statemachine.html.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Object definition;
 * CfnStateMachine cfnStateMachine = CfnStateMachine.Builder.create(this, "MyCfnStateMachine")
 * .definition(definition)
 * .definitionSubstitutions(Map.of(
 * "definitionSubstitutionsKey", "definitionSubstitutions"))
 * .definitionUri("definitionUri")
 * .events(Map.of(
 * "eventsKey", EventSourceProperty.builder()
 * .properties(ApiEventProperty.builder()
 * .method("method")
 * .path("path")
 * // the properties below are optional
 * .restApiId("restApiId")
 * .build())
 * .type("type")
 * .build()))
 * .logging(LoggingConfigurationProperty.builder()
 * .destinations(List.of(LogDestinationProperty.builder()
 * .cloudWatchLogsLogGroup(CloudWatchLogsLogGroupProperty.builder()
 * .logGroupArn("logGroupArn")
 * .build())
 * .build()))
 * .includeExecutionData(false)
 * .level("level")
 * .build())
 * .name("name")
 * .permissionsBoundaries("permissionsBoundaries")
 * .policies("policies")
 * .role("role")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .tracing(TracingConfigurationProperty.builder()
 * .enabled(false)
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html)
 */
@CdkDslMarker
public class CfnStateMachineDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStateMachine.Builder = CfnStateMachine.Builder.create(scope, id)

    private val _policies: MutableList<Any> = mutableListOf()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definition)
     *
     * @param definition
     */
    public fun definition(definition: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(definition)
        cdkBuilder.definition(builder.map)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definition)
     *
     * @param definition
     */
    public fun definition(definition: Any) {
        cdkBuilder.definition(definition)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionsubstitutions)
     *
     * @param definitionSubstitutions
     */
    public fun definitionSubstitutions(definitionSubstitutions: Map<String, String>) {
        cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionsubstitutions)
     *
     * @param definitionSubstitutions
     */
    public fun definitionSubstitutions(definitionSubstitutions: IResolvable) {
        cdkBuilder.definitionSubstitutions(definitionSubstitutions)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     *
     * @param definitionUri
     */
    public fun definitionUri(definitionUri: String) {
        cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     *
     * @param definitionUri
     */
    public fun definitionUri(definitionUri: IResolvable) {
        cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-definitionuri)
     *
     * @param definitionUri
     */
    public fun definitionUri(definitionUri: CfnStateMachine.S3LocationProperty) {
        cdkBuilder.definitionUri(definitionUri)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-events)
     *
     * @param events
     */
    public fun events(events: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(events)
        cdkBuilder.events(builder.map)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-events)
     *
     * @param events
     */
    public fun events(events: Map<String, Any>) {
        cdkBuilder.events(events)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-events)
     *
     * @param events
     */
    public fun events(events: IResolvable) {
        cdkBuilder.events(events)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-logging)
     *
     * @param logging
     */
    public fun logging(logging: IResolvable) {
        cdkBuilder.logging(logging)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-logging)
     *
     * @param logging
     */
    public fun logging(logging: CfnStateMachine.LoggingConfigurationProperty) {
        cdkBuilder.logging(logging)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-name)
     *
     * @param name
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-permissionsboundaries)
     *
     * @param permissionsBoundaries
     */
    public fun permissionsBoundaries(permissionsBoundaries: String) {
        cdkBuilder.permissionsBoundaries(permissionsBoundaries)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     *
     * @param policies
     */
    public fun policies(policies: String) {
        cdkBuilder.policies(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     *
     * @param policies
     */
    public fun policies(vararg policies: Any) {
        _policies.addAll(listOf(*policies))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     *
     * @param policies
     */
    public fun policies(policies: Collection<Any>) {
        _policies.addAll(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     *
     * @param policies
     */
    public fun policies(policies: IResolvable) {
        cdkBuilder.policies(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-policies)
     *
     * @param policies
     */
    public fun policies(policies: CfnStateMachine.IAMPolicyDocumentProperty) {
        cdkBuilder.policies(policies)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-role)
     *
     * @param role
     */
    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tags)
     *
     * @param tags
     */
    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tracing)
     *
     * @param tracing
     */
    public fun tracing(tracing: IResolvable) {
        cdkBuilder.tracing(tracing)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-tracing)
     *
     * @param tracing
     */
    public fun tracing(tracing: CfnStateMachine.TracingConfigurationProperty) {
        cdkBuilder.tracing(tracing)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-serverless-statemachine.html#cfn-serverless-statemachine-type)
     *
     * @param type
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnStateMachine {
        if (_policies.isNotEmpty()) cdkBuilder.policies(_policies)
        return cdkBuilder.build()
    }
}
