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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnPipeline

/**
 * Represents information about an action declaration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codepipeline.*;
 * Object configuration;
 * ActionDeclarationProperty actionDeclarationProperty = ActionDeclarationProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-actiondeclaration.html)
 */
@CdkDslMarker
public class CfnPipelineActionDeclarationPropertyDsl {
    private val cdkBuilder: CfnPipeline.ActionDeclarationProperty.Builder =
        CfnPipeline.ActionDeclarationProperty.builder()

    private val _inputArtifacts: MutableList<Any> = mutableListOf()

    private val _outputArtifacts: MutableList<Any> = mutableListOf()

    /** @param actionTypeId Specifies the action type and the provider of the action. */
    public fun actionTypeId(actionTypeId: IResolvable) {
        cdkBuilder.actionTypeId(actionTypeId)
    }

    /** @param actionTypeId Specifies the action type and the provider of the action. */
    public fun actionTypeId(actionTypeId: CfnPipeline.ActionTypeIdProperty) {
        cdkBuilder.actionTypeId(actionTypeId)
    }

    /**
     * @param configuration The action's configuration. These are key-value pairs that specify input
     *   values for an action. For more information, see
     *   [Action Structure Requirements in CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements)
     *   . For the list of configuration properties for the AWS CloudFormation action type in
     *   CodePipeline, see
     *   [Configuration Properties Reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-action-reference.html)
     *   in the *AWS CloudFormation User Guide* . For template snippets with examples, see
     *   [Using Parameter Override Functions with CodePipeline Pipelines](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-parameter-override-functions.html)
     *   in the *AWS CloudFormation User Guide* .
     *
     * The values can be represented in either JSON or YAML format. For example, the JSON
     * configuration item format is as follows:
     *
     * *JSON:*
     *
     * `"Configuration" : { Key : Value },`
     */
    public fun configuration(configuration: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(configuration)
        cdkBuilder.configuration(builder.map)
    }

    /**
     * @param configuration The action's configuration. These are key-value pairs that specify input
     *   values for an action. For more information, see
     *   [Action Structure Requirements in CodePipeline](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements)
     *   . For the list of configuration properties for the AWS CloudFormation action type in
     *   CodePipeline, see
     *   [Configuration Properties Reference](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-action-reference.html)
     *   in the *AWS CloudFormation User Guide* . For template snippets with examples, see
     *   [Using Parameter Override Functions with CodePipeline Pipelines](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-parameter-override-functions.html)
     *   in the *AWS CloudFormation User Guide* .
     *
     * The values can be represented in either JSON or YAML format. For example, the JSON
     * configuration item format is as follows:
     *
     * *JSON:*
     *
     * `"Configuration" : { Key : Value },`
     */
    public fun configuration(configuration: Any) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * @param inputArtifacts The name or ID of the artifact consumed by the action, such as a test
     *   or build artifact. While the field is not a required parameter, most actions have an action
     *   configuration that requires a specified quantity of input artifacts. To refer to the action
     *   configuration specification by action provider, see the
     *   [Action structure reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html)
     *   in the *AWS CodePipeline User Guide* .
     *
     * For a CodeBuild action with multiple input artifacts, one of your input sources must be
     * designated the PrimarySource. For more information, see the
     * [CodeBuild action reference page](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeBuild.html)
     * in the *AWS CodePipeline User Guide* .
     */
    public fun inputArtifacts(vararg inputArtifacts: Any) {
        _inputArtifacts.addAll(listOf(*inputArtifacts))
    }

    /**
     * @param inputArtifacts The name or ID of the artifact consumed by the action, such as a test
     *   or build artifact. While the field is not a required parameter, most actions have an action
     *   configuration that requires a specified quantity of input artifacts. To refer to the action
     *   configuration specification by action provider, see the
     *   [Action structure reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html)
     *   in the *AWS CodePipeline User Guide* .
     *
     * For a CodeBuild action with multiple input artifacts, one of your input sources must be
     * designated the PrimarySource. For more information, see the
     * [CodeBuild action reference page](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeBuild.html)
     * in the *AWS CodePipeline User Guide* .
     */
    public fun inputArtifacts(inputArtifacts: Collection<Any>) {
        _inputArtifacts.addAll(inputArtifacts)
    }

    /**
     * @param inputArtifacts The name or ID of the artifact consumed by the action, such as a test
     *   or build artifact. While the field is not a required parameter, most actions have an action
     *   configuration that requires a specified quantity of input artifacts. To refer to the action
     *   configuration specification by action provider, see the
     *   [Action structure reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html)
     *   in the *AWS CodePipeline User Guide* .
     *
     * For a CodeBuild action with multiple input artifacts, one of your input sources must be
     * designated the PrimarySource. For more information, see the
     * [CodeBuild action reference page](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-CodeBuild.html)
     * in the *AWS CodePipeline User Guide* .
     */
    public fun inputArtifacts(inputArtifacts: IResolvable) {
        cdkBuilder.inputArtifacts(inputArtifacts)
    }

    /** @param name The action declaration's name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param namespace The variable namespace associated with the action. All variables produced as
     *   output by this action fall under this namespace.
     */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /**
     * @param outputArtifacts The name or ID of the result of the action declaration, such as a test
     *   or build artifact. While the field is not a required parameter, most actions have an action
     *   configuration that requires a specified quantity of output artifacts. To refer to the
     *   action configuration specification by action provider, see the
     *   [Action structure reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html)
     *   in the *AWS CodePipeline User Guide* .
     */
    public fun outputArtifacts(vararg outputArtifacts: Any) {
        _outputArtifacts.addAll(listOf(*outputArtifacts))
    }

    /**
     * @param outputArtifacts The name or ID of the result of the action declaration, such as a test
     *   or build artifact. While the field is not a required parameter, most actions have an action
     *   configuration that requires a specified quantity of output artifacts. To refer to the
     *   action configuration specification by action provider, see the
     *   [Action structure reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html)
     *   in the *AWS CodePipeline User Guide* .
     */
    public fun outputArtifacts(outputArtifacts: Collection<Any>) {
        _outputArtifacts.addAll(outputArtifacts)
    }

    /**
     * @param outputArtifacts The name or ID of the result of the action declaration, such as a test
     *   or build artifact. While the field is not a required parameter, most actions have an action
     *   configuration that requires a specified quantity of output artifacts. To refer to the
     *   action configuration specification by action provider, see the
     *   [Action structure reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html)
     *   in the *AWS CodePipeline User Guide* .
     */
    public fun outputArtifacts(outputArtifacts: IResolvable) {
        cdkBuilder.outputArtifacts(outputArtifacts)
    }

    /** @param region The action declaration's AWS Region, such as us-east-1. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param roleArn The ARN of the IAM service role that performs the declared action. This is
     *   assumed through the roleArn for the pipeline.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param runOrder The order in which actions are run. */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun build(): CfnPipeline.ActionDeclarationProperty {
        if (_inputArtifacts.isNotEmpty()) cdkBuilder.inputArtifacts(_inputArtifacts)
        if (_outputArtifacts.isNotEmpty()) cdkBuilder.outputArtifacts(_outputArtifacts)
        return cdkBuilder.build()
    }
}
