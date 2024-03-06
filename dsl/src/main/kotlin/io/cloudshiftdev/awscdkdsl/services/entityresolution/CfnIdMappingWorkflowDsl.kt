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

package io.cloudshiftdev.awscdkdsl.services.entityresolution

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow
import software.constructs.Construct

/**
 * Creates an `IdMappingWorkflow` object which stores the configuration of the data processing job
 * to be run.
 *
 * Each `IdMappingWorkflow` must have a unique workflow name. To modify an existing workflow, use
 * the `UpdateIdMappingWorkflow` API.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * CfnIdMappingWorkflow cfnIdMappingWorkflow = CfnIdMappingWorkflow.Builder.create(this,
 * "MyCfnIdMappingWorkflow")
 * .idMappingTechniques(IdMappingTechniquesProperty.builder()
 * .idMappingType("idMappingType")
 * .providerProperties(ProviderPropertiesProperty.builder()
 * .providerServiceArn("providerServiceArn")
 * // the properties below are optional
 * .intermediateSourceConfiguration(IntermediateSourceConfigurationProperty.builder()
 * .intermediateS3Path("intermediateS3Path")
 * .build())
 * .providerConfiguration(Map.of(
 * "providerConfigurationKey", "providerConfiguration"))
 * .build())
 * .build())
 * .inputSourceConfig(List.of(IdMappingWorkflowInputSourceProperty.builder()
 * .inputSourceArn("inputSourceArn")
 * .schemaArn("schemaArn")
 * .build()))
 * .outputSourceConfig(List.of(IdMappingWorkflowOutputSourceProperty.builder()
 * .outputS3Path("outputS3Path")
 * // the properties below are optional
 * .kmsArn("kmsArn")
 * .build()))
 * .roleArn("roleArn")
 * .workflowName("workflowName")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html)
 */
@CdkDslMarker
public class CfnIdMappingWorkflowDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnIdMappingWorkflow.Builder =
        CfnIdMappingWorkflow.Builder.create(scope, id)

    private val _inputSourceConfig: MutableList<Any> = mutableListOf()

    private val _outputSourceConfig: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-description)
     *
     * @param description A description of the workflow.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * An object which defines the `idMappingType` and the `providerProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     *
     * @param idMappingTechniques An object which defines the `idMappingType` and the
     *   `providerProperties` .
     */
    public fun idMappingTechniques(idMappingTechniques: IResolvable) {
        cdkBuilder.idMappingTechniques(idMappingTechniques)
    }

    /**
     * An object which defines the `idMappingType` and the `providerProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     *
     * @param idMappingTechniques An object which defines the `idMappingType` and the
     *   `providerProperties` .
     */
    public fun idMappingTechniques(
        idMappingTechniques: CfnIdMappingWorkflow.IdMappingTechniquesProperty
    ) {
        cdkBuilder.idMappingTechniques(idMappingTechniques)
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
     *
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     *   `InputSourceARN` and `SchemaName` .
     */
    public fun inputSourceConfig(vararg inputSourceConfig: Any) {
        _inputSourceConfig.addAll(listOf(*inputSourceConfig))
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
     *
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     *   `InputSourceARN` and `SchemaName` .
     */
    public fun inputSourceConfig(inputSourceConfig: Collection<Any>) {
        _inputSourceConfig.addAll(inputSourceConfig)
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
     *
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     *   `InputSourceARN` and `SchemaName` .
     */
    public fun inputSourceConfig(inputSourceConfig: IResolvable) {
        cdkBuilder.inputSourceConfig(inputSourceConfig)
    }

    /**
     * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields
     * `OutputS3Path` and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-outputsourceconfig)
     *
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     *   contains fields `OutputS3Path` and `Output` .
     */
    public fun outputSourceConfig(vararg outputSourceConfig: Any) {
        _outputSourceConfig.addAll(listOf(*outputSourceConfig))
    }

    /**
     * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields
     * `OutputS3Path` and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-outputsourceconfig)
     *
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     *   contains fields `OutputS3Path` and `Output` .
     */
    public fun outputSourceConfig(outputSourceConfig: Collection<Any>) {
        _outputSourceConfig.addAll(outputSourceConfig)
    }

    /**
     * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields
     * `OutputS3Path` and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-outputsourceconfig)
     *
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     *   contains fields `OutputS3Path` and `Output` .
     */
    public fun outputSourceConfig(outputSourceConfig: IResolvable) {
        cdkBuilder.outputSourceConfig(outputSourceConfig)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * AWS Entity Resolution assumes this role to create resources on your behalf as part of
     * workflow execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-rolearn)
     *
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-tags)
     *
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The name of the workflow.
     *
     * There can't be multiple `IdMappingWorkflows` with the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-workflowname)
     *
     * @param workflowName The name of the workflow.
     */
    public fun workflowName(workflowName: String) {
        cdkBuilder.workflowName(workflowName)
    }

    public fun build(): CfnIdMappingWorkflow {
        if (_inputSourceConfig.isNotEmpty()) cdkBuilder.inputSourceConfig(_inputSourceConfig)
        if (_outputSourceConfig.isNotEmpty()) cdkBuilder.outputSourceConfig(_outputSourceConfig)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
