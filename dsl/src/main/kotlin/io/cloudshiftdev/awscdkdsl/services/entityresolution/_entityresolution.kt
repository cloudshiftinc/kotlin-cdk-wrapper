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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow
import software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps
import software.amazon.awscdk.services.entityresolution.CfnSchemaMapping
import software.amazon.awscdk.services.entityresolution.CfnSchemaMappingProps
import software.constructs.Construct

public object entityresolution {
    /**
     * Creates an `IdMappingWorkflow` object which stores the configuration of the data processing
     * job to be run.
     *
     * Each `IdMappingWorkflow` must have a unique workflow name. To modify an existing workflow,
     * use the `UpdateIdMappingWorkflow` API.
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
    public inline fun cfnIdMappingWorkflow(
        scope: Construct,
        id: String,
        block: CfnIdMappingWorkflowDsl.() -> Unit = {},
    ): CfnIdMappingWorkflow {
        val builder = CfnIdMappingWorkflowDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object which defines the ID mapping techniques and provider configurations.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * IdMappingTechniquesProperty idMappingTechniquesProperty = IdMappingTechniquesProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingtechniques.html)
     */
    public inline fun cfnIdMappingWorkflowIdMappingTechniquesProperty(
        block: CfnIdMappingWorkflowIdMappingTechniquesPropertyDsl.() -> Unit = {}
    ): CfnIdMappingWorkflow.IdMappingTechniquesProperty {
        val builder = CfnIdMappingWorkflowIdMappingTechniquesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object containing `InputSourceARN` and `SchemaName` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * IdMappingWorkflowInputSourceProperty idMappingWorkflowInputSourceProperty =
     * IdMappingWorkflowInputSourceProperty.builder()
     * .inputSourceArn("inputSourceArn")
     * .schemaArn("schemaArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowinputsource.html)
     */
    public inline fun cfnIdMappingWorkflowIdMappingWorkflowInputSourceProperty(
        block: CfnIdMappingWorkflowIdMappingWorkflowInputSourcePropertyDsl.() -> Unit = {}
    ): CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty {
        val builder = CfnIdMappingWorkflowIdMappingWorkflowInputSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields
     * `OutputS3Path` and `Output` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * IdMappingWorkflowOutputSourceProperty idMappingWorkflowOutputSourceProperty =
     * IdMappingWorkflowOutputSourceProperty.builder()
     * .outputS3Path("outputS3Path")
     * // the properties below are optional
     * .kmsArn("kmsArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowoutputsource.html)
     */
    public inline fun cfnIdMappingWorkflowIdMappingWorkflowOutputSourceProperty(
        block: CfnIdMappingWorkflowIdMappingWorkflowOutputSourcePropertyDsl.() -> Unit = {}
    ): CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty {
        val builder = CfnIdMappingWorkflowIdMappingWorkflowOutputSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 location that temporarily stores your data while it processes.
     *
     * Your information won't be saved permanently.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * IntermediateSourceConfigurationProperty intermediateSourceConfigurationProperty =
     * IntermediateSourceConfigurationProperty.builder()
     * .intermediateS3Path("intermediateS3Path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-intermediatesourceconfiguration.html)
     */
    public inline fun cfnIdMappingWorkflowIntermediateSourceConfigurationProperty(
        block: CfnIdMappingWorkflowIntermediateSourceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty {
        val builder = CfnIdMappingWorkflowIntermediateSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnIdMappingWorkflow`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * CfnIdMappingWorkflowProps cfnIdMappingWorkflowProps = CfnIdMappingWorkflowProps.builder()
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
    public inline fun cfnIdMappingWorkflowProps(
        block: CfnIdMappingWorkflowPropsDsl.() -> Unit = {}
    ): CfnIdMappingWorkflowProps {
        val builder = CfnIdMappingWorkflowPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object containing the `providerServiceARN` , `intermediateSourceConfiguration` , and
     * `providerConfiguration` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * ProviderPropertiesProperty providerPropertiesProperty = ProviderPropertiesProperty.builder()
     * .providerServiceArn("providerServiceArn")
     * // the properties below are optional
     * .intermediateSourceConfiguration(IntermediateSourceConfigurationProperty.builder()
     * .intermediateS3Path("intermediateS3Path")
     * .build())
     * .providerConfiguration(Map.of(
     * "providerConfigurationKey", "providerConfiguration"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-providerproperties.html)
     */
    public inline fun cfnIdMappingWorkflowProviderPropertiesProperty(
        block: CfnIdMappingWorkflowProviderPropertiesPropertyDsl.() -> Unit = {}
    ): CfnIdMappingWorkflow.ProviderPropertiesProperty {
        val builder = CfnIdMappingWorkflowProviderPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a `MatchingWorkflow` object which stores the configuration of the data processing job
     * to be run.
     *
     * It is important to note that there should not be a pre-existing `MatchingWorkflow` with the
     * same name. To modify an existing workflow, utilize the `UpdateMatchingWorkflow` API.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * CfnMatchingWorkflow cfnMatchingWorkflow = CfnMatchingWorkflow.Builder.create(this,
     * "MyCfnMatchingWorkflow")
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
    public inline fun cfnMatchingWorkflow(
        scope: Construct,
        id: String,
        block: CfnMatchingWorkflowDsl.() -> Unit = {},
    ): CfnMatchingWorkflow {
        val builder = CfnMatchingWorkflowDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object containing `InputSourceARN` , `SchemaName` , and `ApplyNormalization` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * InputSourceProperty inputSourceProperty = InputSourceProperty.builder()
     * .inputSourceArn("inputSourceArn")
     * .schemaArn("schemaArn")
     * // the properties below are optional
     * .applyNormalization(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-inputsource.html)
     */
    public inline fun cfnMatchingWorkflowInputSourceProperty(
        block: CfnMatchingWorkflowInputSourcePropertyDsl.() -> Unit = {}
    ): CfnMatchingWorkflow.InputSourceProperty {
        val builder = CfnMatchingWorkflowInputSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Amazon S3 location that temporarily stores your data while it processes.
     *
     * Your information won't be saved permanently.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * IntermediateSourceConfigurationProperty intermediateSourceConfigurationProperty =
     * IntermediateSourceConfigurationProperty.builder()
     * .intermediateS3Path("intermediateS3Path")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-intermediatesourceconfiguration.html)
     */
    public inline fun cfnMatchingWorkflowIntermediateSourceConfigurationProperty(
        block: CfnMatchingWorkflowIntermediateSourceConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMatchingWorkflow.IntermediateSourceConfigurationProperty {
        val builder = CfnMatchingWorkflowIntermediateSourceConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of `OutputAttribute` objects, each of which have the fields `Name` and `Hashed` .
     *
     * Each of these objects selects a column to be included in the output table, and whether the
     * values of the column should be hashed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * OutputAttributeProperty outputAttributeProperty = OutputAttributeProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .hashed(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputattribute.html)
     */
    public inline fun cfnMatchingWorkflowOutputAttributeProperty(
        block: CfnMatchingWorkflowOutputAttributePropertyDsl.() -> Unit = {}
    ): CfnMatchingWorkflow.OutputAttributeProperty {
        val builder = CfnMatchingWorkflowOutputAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A list of `OutputAttribute` objects, each of which have the fields `Name` and `Hashed` .
     *
     * Each of these objects selects a column to be included in the output table, and whether the
     * values of the column should be hashed.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * OutputSourceProperty outputSourceProperty = OutputSourceProperty.builder()
     * .output(List.of(OutputAttributeProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .hashed(false)
     * .build()))
     * .outputS3Path("outputS3Path")
     * // the properties below are optional
     * .applyNormalization(false)
     * .kmsArn("kmsArn")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputsource.html)
     */
    public inline fun cfnMatchingWorkflowOutputSourceProperty(
        block: CfnMatchingWorkflowOutputSourcePropertyDsl.() -> Unit = {}
    ): CfnMatchingWorkflow.OutputSourceProperty {
        val builder = CfnMatchingWorkflowOutputSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnMatchingWorkflowProps(
        block: CfnMatchingWorkflowPropsDsl.() -> Unit = {}
    ): CfnMatchingWorkflowProps {
        val builder = CfnMatchingWorkflowPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object containing the `providerServiceARN` , `intermediateSourceConfiguration` , and
     * `providerConfiguration` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * ProviderPropertiesProperty providerPropertiesProperty = ProviderPropertiesProperty.builder()
     * .providerServiceArn("providerServiceArn")
     * // the properties below are optional
     * .intermediateSourceConfiguration(IntermediateSourceConfigurationProperty.builder()
     * .intermediateS3Path("intermediateS3Path")
     * .build())
     * .providerConfiguration(Map.of(
     * "providerConfigurationKey", "providerConfiguration"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-providerproperties.html)
     */
    public inline fun cfnMatchingWorkflowProviderPropertiesProperty(
        block: CfnMatchingWorkflowProviderPropertiesPropertyDsl.() -> Unit = {}
    ): CfnMatchingWorkflow.ProviderPropertiesProperty {
        val builder = CfnMatchingWorkflowProviderPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object which defines the `resolutionType` and the `ruleBasedProperties` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * ResolutionTechniquesProperty resolutionTechniquesProperty =
     * ResolutionTechniquesProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-resolutiontechniques.html)
     */
    public inline fun cfnMatchingWorkflowResolutionTechniquesProperty(
        block: CfnMatchingWorkflowResolutionTechniquesPropertyDsl.() -> Unit = {}
    ): CfnMatchingWorkflow.ResolutionTechniquesProperty {
        val builder = CfnMatchingWorkflowResolutionTechniquesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object which defines the list of matching rules to run and has a field `Rules` , which is
     * a list of rule objects.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * RuleBasedPropertiesProperty ruleBasedPropertiesProperty = RuleBasedPropertiesProperty.builder()
     * .attributeMatchingModel("attributeMatchingModel")
     * .rules(List.of(RuleProperty.builder()
     * .matchingKeys(List.of("matchingKeys"))
     * .ruleName("ruleName")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rulebasedproperties.html)
     */
    public inline fun cfnMatchingWorkflowRuleBasedPropertiesProperty(
        block: CfnMatchingWorkflowRuleBasedPropertiesPropertyDsl.() -> Unit = {}
    ): CfnMatchingWorkflow.RuleBasedPropertiesProperty {
        val builder = CfnMatchingWorkflowRuleBasedPropertiesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object containing `RuleName` , and `MatchingKeys` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * RuleProperty ruleProperty = RuleProperty.builder()
     * .matchingKeys(List.of("matchingKeys"))
     * .ruleName("ruleName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rule.html)
     */
    public inline fun cfnMatchingWorkflowRuleProperty(
        block: CfnMatchingWorkflowRulePropertyDsl.() -> Unit = {}
    ): CfnMatchingWorkflow.RuleProperty {
        val builder = CfnMatchingWorkflowRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates a schema mapping, which defines the schema of the input customer records table.
     *
     * The `SchemaMapping` also provides AWS Entity Resolution with some metadata about the table,
     * such as the attribute types of the columns and which columns to match on.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * CfnSchemaMapping cfnSchemaMapping = CfnSchemaMapping.Builder.create(this, "MyCfnSchemaMapping")
     * .mappedInputFields(List.of(SchemaInputAttributeProperty.builder()
     * .fieldName("fieldName")
     * .type("type")
     * // the properties below are optional
     * .groupName("groupName")
     * .matchKey("matchKey")
     * .subType("subType")
     * .build()))
     * .schemaName("schemaName")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html)
     */
    public inline fun cfnSchemaMapping(
        scope: Construct,
        id: String,
        block: CfnSchemaMappingDsl.() -> Unit = {},
    ): CfnSchemaMapping {
        val builder = CfnSchemaMappingDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSchemaMapping`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * CfnSchemaMappingProps cfnSchemaMappingProps = CfnSchemaMappingProps.builder()
     * .mappedInputFields(List.of(SchemaInputAttributeProperty.builder()
     * .fieldName("fieldName")
     * .type("type")
     * // the properties below are optional
     * .groupName("groupName")
     * .matchKey("matchKey")
     * .subType("subType")
     * .build()))
     * .schemaName("schemaName")
     * // the properties below are optional
     * .description("description")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-schemamapping.html)
     */
    public inline fun cfnSchemaMappingProps(
        block: CfnSchemaMappingPropsDsl.() -> Unit = {}
    ): CfnSchemaMappingProps {
        val builder = CfnSchemaMappingPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * An object containing `FieldName` , `Type` , `GroupName` , and `MatchKey` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.entityresolution.*;
     * SchemaInputAttributeProperty schemaInputAttributeProperty =
     * SchemaInputAttributeProperty.builder()
     * .fieldName("fieldName")
     * .type("type")
     * // the properties below are optional
     * .groupName("groupName")
     * .matchKey("matchKey")
     * .subType("subType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-schemamapping-schemainputattribute.html)
     */
    public inline fun cfnSchemaMappingSchemaInputAttributeProperty(
        block: CfnSchemaMappingSchemaInputAttributePropertyDsl.() -> Unit = {}
    ): CfnSchemaMapping.SchemaInputAttributeProperty {
        val builder = CfnSchemaMappingSchemaInputAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
