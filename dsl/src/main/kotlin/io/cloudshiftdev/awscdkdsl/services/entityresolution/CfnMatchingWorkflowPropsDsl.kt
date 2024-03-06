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
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps

/**
 * Properties for defining a `CfnMatchingWorkflow`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * CfnMatchingWorkflowProps cfnMatchingWorkflowProps = CfnMatchingWorkflowProps.builder()
 * .inputSourceConfig(List.of(InputSourceProperty.builder()
 * .inputSourceArn("inputSourceArn")
 * .schemaArn("schemaArn")
 * // the properties below are optional
 * .applyNormalization(false)
 * .build()))
 * .outputSourceConfig(List.of(OutputSourceProperty.builder()
 * .output(List.of(OutputAttributeProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hashed(false)
 * .build()))
 * .outputS3Path("outputS3Path")
 * // the properties below are optional
 * .applyNormalization(false)
 * .kmsArn("kmsArn")
 * .build()))
 * .resolutionTechniques(ResolutionTechniquesProperty.builder()
 * .providerProperties(ProviderPropertiesProperty.builder()
 * .providerServiceArn("providerServiceArn")
 * // the properties below are optional
 * .intermediateSourceConfiguration(IntermediateSourceConfigurationProperty.builder()
 * .intermediateS3Path("intermediateS3Path")
 * .build())
 * .providerConfiguration(Map.of(
 * "providerConfigurationKey", "providerConfiguration"))
 * .build())
 * .resolutionType("resolutionType")
 * .ruleBasedProperties(RuleBasedPropertiesProperty.builder()
 * .attributeMatchingModel("attributeMatchingModel")
 * .rules(List.of(RuleProperty.builder()
 * .matchingKeys(List.of("matchingKeys"))
 * .ruleName("ruleName")
 * .build()))
 * .build())
 * .build())
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html)
 */
@CdkDslMarker
public class CfnMatchingWorkflowPropsDsl {
    private val cdkBuilder: CfnMatchingWorkflowProps.Builder = CfnMatchingWorkflowProps.builder()

    private val _inputSourceConfig: MutableList<Any> = mutableListOf()

    private val _outputSourceConfig: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description of the workflow. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     *   `InputSourceARN` and `SchemaName` .
     */
    public fun inputSourceConfig(vararg inputSourceConfig: Any) {
        _inputSourceConfig.addAll(listOf(*inputSourceConfig))
    }

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     *   `InputSourceARN` and `SchemaName` .
     */
    public fun inputSourceConfig(inputSourceConfig: Collection<Any>) {
        _inputSourceConfig.addAll(inputSourceConfig)
    }

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     *   `InputSourceARN` and `SchemaName` .
     */
    public fun inputSourceConfig(inputSourceConfig: IResolvable) {
        cdkBuilder.inputSourceConfig(inputSourceConfig)
    }

    /**
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     *   `OutputS3Path` , `ApplyNormalization` , and `Output` .
     */
    public fun outputSourceConfig(vararg outputSourceConfig: Any) {
        _outputSourceConfig.addAll(listOf(*outputSourceConfig))
    }

    /**
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     *   `OutputS3Path` , `ApplyNormalization` , and `Output` .
     */
    public fun outputSourceConfig(outputSourceConfig: Collection<Any>) {
        _outputSourceConfig.addAll(outputSourceConfig)
    }

    /**
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     *   `OutputS3Path` , `ApplyNormalization` , and `Output` .
     */
    public fun outputSourceConfig(outputSourceConfig: IResolvable) {
        cdkBuilder.outputSourceConfig(outputSourceConfig)
    }

    /**
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     *   `ruleBasedProperties` .
     */
    public fun resolutionTechniques(resolutionTechniques: IResolvable) {
        cdkBuilder.resolutionTechniques(resolutionTechniques)
    }

    /**
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     *   `ruleBasedProperties` .
     */
    public fun resolutionTechniques(
        resolutionTechniques: CfnMatchingWorkflow.ResolutionTechniquesProperty
    ) {
        cdkBuilder.resolutionTechniques(resolutionTechniques)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role. AWS Entity Resolution assumes
     *   this role to create resources on your behalf as part of workflow execution.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags used to organize, track, or control access for this resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param workflowName The name of the workflow. There can't be multiple `MatchingWorkflows`
     *   with the same name.
     */
    public fun workflowName(workflowName: String) {
        cdkBuilder.workflowName(workflowName)
    }

    public fun build(): CfnMatchingWorkflowProps {
        if (_inputSourceConfig.isNotEmpty()) cdkBuilder.inputSourceConfig(_inputSourceConfig)
        if (_outputSourceConfig.isNotEmpty()) cdkBuilder.outputSourceConfig(_outputSourceConfig)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
