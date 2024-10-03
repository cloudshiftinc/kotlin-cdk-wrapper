@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnIdMappingWorkflow`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.entityresolution.*;
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
 * .ruleBasedProperties(IdMappingRuleBasedPropertiesProperty.builder()
 * .attributeMatchingModel("attributeMatchingModel")
 * .recordMatchingModel("recordMatchingModel")
 * // the properties below are optional
 * .ruleDefinitionType("ruleDefinitionType")
 * .rules(List.of(RuleProperty.builder()
 * .matchingKeys(List.of("matchingKeys"))
 * .ruleName("ruleName")
 * .build()))
 * .build())
 * .build())
 * .inputSourceConfig(List.of(IdMappingWorkflowInputSourceProperty.builder()
 * .inputSourceArn("inputSourceArn")
 * // the properties below are optional
 * .schemaArn("schemaArn")
 * .type("type")
 * .build()))
 * .roleArn("roleArn")
 * .workflowName("workflowName")
 * // the properties below are optional
 * .description("description")
 * .outputSourceConfig(List.of(IdMappingWorkflowOutputSourceProperty.builder()
 * .outputS3Path("outputS3Path")
 * // the properties below are optional
 * .kmsArn("kmsArn")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html)
 */
public interface CfnIdMappingWorkflowProps {
  /**
   * A description of the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An object which defines the ID mapping technique and any additional configurations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
   */
  public fun idMappingTechniques(): Any

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
   */
  public fun inputSourceConfig(): Any

  /**
   * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields `OutputS3Path`
   * and `Output` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-outputsourceconfig)
   */
  public fun outputSourceConfig(): Any? = unwrap(this).getOutputSourceConfig()

  /**
   * The Amazon Resource Name (ARN) of the IAM role.
   *
   * AWS Entity Resolution assumes this role to create resources on your behalf as part of workflow
   * execution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-rolearn)
   */
  public fun roleArn(): String

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the workflow.
   *
   * There can't be multiple `IdMappingWorkflows` with the same name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-workflowname)
   */
  public fun workflowName(): String

  /**
   * A builder for [CfnIdMappingWorkflowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the workflow.
     */
    public fun description(description: String)

    /**
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    public fun idMappingTechniques(idMappingTechniques: IResolvable)

    /**
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    public
        fun idMappingTechniques(idMappingTechniques: CfnIdMappingWorkflow.IdMappingTechniquesProperty)

    /**
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9593406f44ebd4be37ba4b85dee9531e9059ac32c4256bb3cfad2cba55d5fb48")
    public
        fun idMappingTechniques(idMappingTechniques: CfnIdMappingWorkflow.IdMappingTechniquesProperty.Builder.() -> Unit)

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(inputSourceConfig: IResolvable)

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(inputSourceConfig: List<Any>)

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(vararg inputSourceConfig: Any)

    /**
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` .
     */
    public fun outputSourceConfig(outputSourceConfig: IResolvable)

    /**
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` .
     */
    public fun outputSourceConfig(outputSourceConfig: List<Any>)

    /**
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` .
     */
    public fun outputSourceConfig(vararg outputSourceConfig: Any)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role. 
     * AWS Entity Resolution assumes this role to create resources on your behalf as part of
     * workflow execution.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param workflowName The name of the workflow. 
     * There can't be multiple `IdMappingWorkflows` with the same name.
     */
    public fun workflowName(workflowName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps.Builder =
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps.builder()

    /**
     * @param description A description of the workflow.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    override fun idMappingTechniques(idMappingTechniques: IResolvable) {
      cdkBuilder.idMappingTechniques(idMappingTechniques.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    override
        fun idMappingTechniques(idMappingTechniques: CfnIdMappingWorkflow.IdMappingTechniquesProperty) {
      cdkBuilder.idMappingTechniques(idMappingTechniques.let(CfnIdMappingWorkflow.IdMappingTechniquesProperty.Companion::unwrap))
    }

    /**
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9593406f44ebd4be37ba4b85dee9531e9059ac32c4256bb3cfad2cba55d5fb48")
    override
        fun idMappingTechniques(idMappingTechniques: CfnIdMappingWorkflow.IdMappingTechniquesProperty.Builder.() -> Unit):
        Unit =
        idMappingTechniques(CfnIdMappingWorkflow.IdMappingTechniquesProperty(idMappingTechniques))

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(inputSourceConfig: IResolvable) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(inputSourceConfig: List<Any>) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(vararg inputSourceConfig: Any): Unit =
        inputSourceConfig(inputSourceConfig.toList())

    /**
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` .
     */
    override fun outputSourceConfig(outputSourceConfig: IResolvable) {
      cdkBuilder.outputSourceConfig(outputSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` .
     */
    override fun outputSourceConfig(outputSourceConfig: List<Any>) {
      cdkBuilder.outputSourceConfig(outputSourceConfig.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` .
     */
    override fun outputSourceConfig(vararg outputSourceConfig: Any): Unit =
        outputSourceConfig(outputSourceConfig.toList())

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role. 
     * AWS Entity Resolution assumes this role to create resources on your behalf as part of
     * workflow execution.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param workflowName The name of the workflow. 
     * There can't be multiple `IdMappingWorkflows` with the same name.
     */
    override fun workflowName(workflowName: String) {
      cdkBuilder.workflowName(workflowName)
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps,
  ) : CdkObject(cdkObject),
      CfnIdMappingWorkflowProps {
    /**
     * A description of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An object which defines the ID mapping technique and any additional configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     */
    override fun idMappingTechniques(): Any = unwrap(this).getIdMappingTechniques()

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
     */
    override fun inputSourceConfig(): Any = unwrap(this).getInputSourceConfig()

    /**
     * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields
     * `OutputS3Path` and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-outputsourceconfig)
     */
    override fun outputSourceConfig(): Any? = unwrap(this).getOutputSourceConfig()

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * AWS Entity Resolution assumes this role to create resources on your behalf as part of
     * workflow execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the workflow.
     *
     * There can't be multiple `IdMappingWorkflows` with the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-workflowname)
     */
    override fun workflowName(): String = unwrap(this).getWorkflowName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIdMappingWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps):
        CfnIdMappingWorkflowProps = CdkObjectWrappers.wrap(cdkObject) as? CfnIdMappingWorkflowProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIdMappingWorkflowProps):
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflowProps
  }
}
