@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an `IdMappingWorkflow` object which stores the configuration of the data processing job
 * to be run.
 *
 * Each `IdMappingWorkflow` must have a unique workflow name. To modify an existing workflow, use
 * the `UpdateIdMappingWorkflow` API.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.entityresolution.*;
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
public open class CfnIdMappingWorkflow(
  cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdMappingWorkflowProps,
  ) :
      this(software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIdMappingWorkflowProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIdMappingWorkflowProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIdMappingWorkflowProps(props)
  )

  /**
   * The time of this IdMappingWorkflow got created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The time of this IdMappingWorkflow got last updated at.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The default IdMappingWorkflow arn.
   */
  public open fun attrWorkflowArn(): String = unwrap(this).getAttrWorkflowArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description of the workflow.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the workflow.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * An object which defines the ID mapping technique and any additional configurations.
   */
  public open fun idMappingTechniques(): Any = unwrap(this).getIdMappingTechniques()

  /**
   * An object which defines the ID mapping technique and any additional configurations.
   */
  public open fun idMappingTechniques(`value`: IResolvable) {
    unwrap(this).setIdMappingTechniques(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object which defines the ID mapping technique and any additional configurations.
   */
  public open fun idMappingTechniques(`value`: IdMappingTechniquesProperty) {
    unwrap(this).setIdMappingTechniques(`value`.let(IdMappingTechniquesProperty.Companion::unwrap))
  }

  /**
   * An object which defines the ID mapping technique and any additional configurations.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0dcdc7b99155a327aacc2b9686f29ba8ddb2d40d91243b25a35673b625517f95")
  public open fun idMappingTechniques(`value`: IdMappingTechniquesProperty.Builder.() -> Unit): Unit
      = idMappingTechniques(IdMappingTechniquesProperty(`value`))

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(): Any = unwrap(this).getInputSourceConfig()

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(`value`: IResolvable) {
    unwrap(this).setInputSourceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(`value`: List<Any>) {
    unwrap(this).setInputSourceConfig(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(vararg `value`: Any): Unit = inputSourceConfig(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields `OutputS3Path`
   * and `Output` .
   */
  public open fun outputSourceConfig(): Any? = unwrap(this).getOutputSourceConfig()

  /**
   * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields `OutputS3Path`
   * and `Output` .
   */
  public open fun outputSourceConfig(`value`: IResolvable) {
    unwrap(this).setOutputSourceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields `OutputS3Path`
   * and `Output` .
   */
  public open fun outputSourceConfig(`value`: List<Any>) {
    unwrap(this).setOutputSourceConfig(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields `OutputS3Path`
   * and `Output` .
   */
  public open fun outputSourceConfig(vararg `value`: Any): Unit =
      outputSourceConfig(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the IAM role.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The name of the workflow.
   */
  public open fun workflowName(): String = unwrap(this).getWorkflowName()

  /**
   * The name of the workflow.
   */
  public open fun workflowName(`value`: String) {
    unwrap(this).setWorkflowName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.entityresolution.CfnIdMappingWorkflow].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-description)
     * @param description A description of the workflow. 
     */
    public fun description(description: String)

    /**
     * An object which defines the ID mapping technique and any additional configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    public fun idMappingTechniques(idMappingTechniques: IResolvable)

    /**
     * An object which defines the ID mapping technique and any additional configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    public fun idMappingTechniques(idMappingTechniques: IdMappingTechniquesProperty)

    /**
     * An object which defines the ID mapping technique and any additional configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adf133ccc4d3eb2dd97e1dc0865da29cc2840795e113f053f00da756e475a701")
    public
        fun idMappingTechniques(idMappingTechniques: IdMappingTechniquesProperty.Builder.() -> Unit)

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(inputSourceConfig: IResolvable)

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(inputSourceConfig: List<Any>)

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(vararg inputSourceConfig: Any)

    /**
     * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields
     * `OutputS3Path` and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` . 
     */
    public fun outputSourceConfig(outputSourceConfig: IResolvable)

    /**
     * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields
     * `OutputS3Path` and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` . 
     */
    public fun outputSourceConfig(outputSourceConfig: List<Any>)

    /**
     * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields
     * `OutputS3Path` and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` . 
     */
    public fun outputSourceConfig(vararg outputSourceConfig: Any)

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * AWS Entity Resolution assumes this role to create resources on your behalf as part of
     * workflow execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the workflow.
     *
     * There can't be multiple `IdMappingWorkflows` with the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-workflowname)
     * @param workflowName The name of the workflow. 
     */
    public fun workflowName(workflowName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.Builder =
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.Builder.create(scope,
        id)

    /**
     * A description of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-description)
     * @param description A description of the workflow. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * An object which defines the ID mapping technique and any additional configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    override fun idMappingTechniques(idMappingTechniques: IResolvable) {
      cdkBuilder.idMappingTechniques(idMappingTechniques.let(IResolvable.Companion::unwrap))
    }

    /**
     * An object which defines the ID mapping technique and any additional configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    override fun idMappingTechniques(idMappingTechniques: IdMappingTechniquesProperty) {
      cdkBuilder.idMappingTechniques(idMappingTechniques.let(IdMappingTechniquesProperty.Companion::unwrap))
    }

    /**
     * An object which defines the ID mapping technique and any additional configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the ID mapping technique and any
     * additional configurations. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("adf133ccc4d3eb2dd97e1dc0865da29cc2840795e113f053f00da756e475a701")
    override
        fun idMappingTechniques(idMappingTechniques: IdMappingTechniquesProperty.Builder.() -> Unit):
        Unit = idMappingTechniques(IdMappingTechniquesProperty(idMappingTechniques))

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(inputSourceConfig: IResolvable) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(inputSourceConfig: List<Any>) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(vararg inputSourceConfig: Any): Unit =
        inputSourceConfig(inputSourceConfig.toList())

    /**
     * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields
     * `OutputS3Path` and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` . 
     */
    override fun outputSourceConfig(outputSourceConfig: IResolvable) {
      cdkBuilder.outputSourceConfig(outputSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields
     * `OutputS3Path` and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` . 
     */
    override fun outputSourceConfig(outputSourceConfig: List<Any>) {
      cdkBuilder.outputSourceConfig(outputSourceConfig.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields
     * `OutputS3Path` and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `IdMappingWorkflowOutputSource` objects, each of which
     * contains fields `OutputS3Path` and `Output` . 
     */
    override fun outputSourceConfig(vararg outputSourceConfig: Any): Unit =
        outputSourceConfig(outputSourceConfig.toList())

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * AWS Entity Resolution assumes this role to create resources on your behalf as part of
     * workflow execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the workflow.
     *
     * There can't be multiple `IdMappingWorkflows` with the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-workflowname)
     * @param workflowName The name of the workflow. 
     */
    override fun workflowName(workflowName: String) {
      cdkBuilder.workflowName(workflowName)
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIdMappingWorkflow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIdMappingWorkflow(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow):
        CfnIdMappingWorkflow = CfnIdMappingWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnIdMappingWorkflow):
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow = wrapped.cdkObject as
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow
  }

  /**
   * An object that defines the list of matching rules to run in an ID mapping workflow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
   * IdMappingRuleBasedPropertiesProperty idMappingRuleBasedPropertiesProperty =
   * IdMappingRuleBasedPropertiesProperty.builder()
   * .attributeMatchingModel("attributeMatchingModel")
   * .recordMatchingModel("recordMatchingModel")
   * // the properties below are optional
   * .ruleDefinitionType("ruleDefinitionType")
   * .rules(List.of(RuleProperty.builder()
   * .matchingKeys(List.of("matchingKeys"))
   * .ruleName("ruleName")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingrulebasedproperties.html)
   */
  public interface IdMappingRuleBasedPropertiesProperty {
    /**
     * The comparison type. You can either choose `ONE_TO_ONE` or `MANY_TO_MANY` as the
     * `attributeMatchingModel` .
     *
     * If you choose `MANY_TO_MANY` , the system can match attributes across the sub-types of an
     * attribute type. For example, if the value of the `Email` field of Profile A matches the value of
     * the `BusinessEmail` field of Profile B, the two profiles are matched on the `Email` attribute
     * type.
     *
     * If you choose `ONE_TO_ONE` , the system can only match attributes if the sub-types are an
     * exact match. For example, for the `Email` attribute type, the system will only consider it a
     * match if the value of the `Email` field of Profile A matches the value of the `Email` field of
     * Profile B.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingrulebasedproperties.html#cfn-entityresolution-idmappingworkflow-idmappingrulebasedproperties-attributematchingmodel)
     */
    public fun attributeMatchingModel(): String

    /**
     * The type of matching record that is allowed to be used in an ID mapping workflow.
     *
     * If the value is set to `ONE_SOURCE_TO_ONE_TARGET` , only one record in the source can be
     * matched to the same record in the target.
     *
     * If the value is set to `MANY_SOURCE_TO_ONE_TARGET` , multiple records in the source can be
     * matched to one record in the target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingrulebasedproperties.html#cfn-entityresolution-idmappingworkflow-idmappingrulebasedproperties-recordmatchingmodel)
     */
    public fun recordMatchingModel(): String

    /**
     * The set of rules you can use in an ID mapping workflow.
     *
     * The limitations specified for the source or target to define the match rules must be
     * compatible.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingrulebasedproperties.html#cfn-entityresolution-idmappingworkflow-idmappingrulebasedproperties-ruledefinitiontype)
     */
    public fun ruleDefinitionType(): String? = unwrap(this).getRuleDefinitionType()

    /**
     * The rules that can be used for ID mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingrulebasedproperties.html#cfn-entityresolution-idmappingworkflow-idmappingrulebasedproperties-rules)
     */
    public fun rules(): Any? = unwrap(this).getRules()

    /**
     * A builder for [IdMappingRuleBasedPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeMatchingModel The comparison type. You can either choose `ONE_TO_ONE` or
       * `MANY_TO_MANY` as the `attributeMatchingModel` . 
       * If you choose `MANY_TO_MANY` , the system can match attributes across the sub-types of an
       * attribute type. For example, if the value of the `Email` field of Profile A matches the value
       * of the `BusinessEmail` field of Profile B, the two profiles are matched on the `Email`
       * attribute type.
       *
       * If you choose `ONE_TO_ONE` , the system can only match attributes if the sub-types are an
       * exact match. For example, for the `Email` attribute type, the system will only consider it a
       * match if the value of the `Email` field of Profile A matches the value of the `Email` field of
       * Profile B.
       */
      public fun attributeMatchingModel(attributeMatchingModel: String)

      /**
       * @param recordMatchingModel The type of matching record that is allowed to be used in an ID
       * mapping workflow. 
       * If the value is set to `ONE_SOURCE_TO_ONE_TARGET` , only one record in the source can be
       * matched to the same record in the target.
       *
       * If the value is set to `MANY_SOURCE_TO_ONE_TARGET` , multiple records in the source can be
       * matched to one record in the target.
       */
      public fun recordMatchingModel(recordMatchingModel: String)

      /**
       * @param ruleDefinitionType The set of rules you can use in an ID mapping workflow.
       * The limitations specified for the source or target to define the match rules must be
       * compatible.
       */
      public fun ruleDefinitionType(ruleDefinitionType: String)

      /**
       * @param rules The rules that can be used for ID mapping.
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules The rules that can be used for ID mapping.
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules The rules that can be used for ID mapping.
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingRuleBasedPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingRuleBasedPropertiesProperty.builder()

      /**
       * @param attributeMatchingModel The comparison type. You can either choose `ONE_TO_ONE` or
       * `MANY_TO_MANY` as the `attributeMatchingModel` . 
       * If you choose `MANY_TO_MANY` , the system can match attributes across the sub-types of an
       * attribute type. For example, if the value of the `Email` field of Profile A matches the value
       * of the `BusinessEmail` field of Profile B, the two profiles are matched on the `Email`
       * attribute type.
       *
       * If you choose `ONE_TO_ONE` , the system can only match attributes if the sub-types are an
       * exact match. For example, for the `Email` attribute type, the system will only consider it a
       * match if the value of the `Email` field of Profile A matches the value of the `Email` field of
       * Profile B.
       */
      override fun attributeMatchingModel(attributeMatchingModel: String) {
        cdkBuilder.attributeMatchingModel(attributeMatchingModel)
      }

      /**
       * @param recordMatchingModel The type of matching record that is allowed to be used in an ID
       * mapping workflow. 
       * If the value is set to `ONE_SOURCE_TO_ONE_TARGET` , only one record in the source can be
       * matched to the same record in the target.
       *
       * If the value is set to `MANY_SOURCE_TO_ONE_TARGET` , multiple records in the source can be
       * matched to one record in the target.
       */
      override fun recordMatchingModel(recordMatchingModel: String) {
        cdkBuilder.recordMatchingModel(recordMatchingModel)
      }

      /**
       * @param ruleDefinitionType The set of rules you can use in an ID mapping workflow.
       * The limitations specified for the source or target to define the match rules must be
       * compatible.
       */
      override fun ruleDefinitionType(ruleDefinitionType: String) {
        cdkBuilder.ruleDefinitionType(ruleDefinitionType)
      }

      /**
       * @param rules The rules that can be used for ID mapping.
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rules The rules that can be used for ID mapping.
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param rules The rules that can be used for ID mapping.
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingRuleBasedPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingRuleBasedPropertiesProperty,
    ) : CdkObject(cdkObject),
        IdMappingRuleBasedPropertiesProperty {
      /**
       * The comparison type. You can either choose `ONE_TO_ONE` or `MANY_TO_MANY` as the
       * `attributeMatchingModel` .
       *
       * If you choose `MANY_TO_MANY` , the system can match attributes across the sub-types of an
       * attribute type. For example, if the value of the `Email` field of Profile A matches the value
       * of the `BusinessEmail` field of Profile B, the two profiles are matched on the `Email`
       * attribute type.
       *
       * If you choose `ONE_TO_ONE` , the system can only match attributes if the sub-types are an
       * exact match. For example, for the `Email` attribute type, the system will only consider it a
       * match if the value of the `Email` field of Profile A matches the value of the `Email` field of
       * Profile B.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingrulebasedproperties.html#cfn-entityresolution-idmappingworkflow-idmappingrulebasedproperties-attributematchingmodel)
       */
      override fun attributeMatchingModel(): String = unwrap(this).getAttributeMatchingModel()

      /**
       * The type of matching record that is allowed to be used in an ID mapping workflow.
       *
       * If the value is set to `ONE_SOURCE_TO_ONE_TARGET` , only one record in the source can be
       * matched to the same record in the target.
       *
       * If the value is set to `MANY_SOURCE_TO_ONE_TARGET` , multiple records in the source can be
       * matched to one record in the target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingrulebasedproperties.html#cfn-entityresolution-idmappingworkflow-idmappingrulebasedproperties-recordmatchingmodel)
       */
      override fun recordMatchingModel(): String = unwrap(this).getRecordMatchingModel()

      /**
       * The set of rules you can use in an ID mapping workflow.
       *
       * The limitations specified for the source or target to define the match rules must be
       * compatible.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingrulebasedproperties.html#cfn-entityresolution-idmappingworkflow-idmappingrulebasedproperties-ruledefinitiontype)
       */
      override fun ruleDefinitionType(): String? = unwrap(this).getRuleDefinitionType()

      /**
       * The rules that can be used for ID mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingrulebasedproperties.html#cfn-entityresolution-idmappingworkflow-idmappingrulebasedproperties-rules)
       */
      override fun rules(): Any? = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdMappingRuleBasedPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingRuleBasedPropertiesProperty):
          IdMappingRuleBasedPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdMappingRuleBasedPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingRuleBasedPropertiesProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingRuleBasedPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingRuleBasedPropertiesProperty
    }
  }

  /**
   * An object which defines the ID mapping technique and any additional configurations.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingtechniques.html)
   */
  public interface IdMappingTechniquesProperty {
    /**
     * The type of ID mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingtechniques.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques-idmappingtype)
     */
    public fun idMappingType(): String? = unwrap(this).getIdMappingType()

    /**
     * An object which defines any additional configurations required by the provider service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingtechniques.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques-providerproperties)
     */
    public fun providerProperties(): Any? = unwrap(this).getProviderProperties()

    /**
     * An object which defines any additional configurations required by rule-based matching.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingtechniques.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques-rulebasedproperties)
     */
    public fun ruleBasedProperties(): Any? = unwrap(this).getRuleBasedProperties()

    /**
     * A builder for [IdMappingTechniquesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idMappingType The type of ID mapping.
       */
      public fun idMappingType(idMappingType: String)

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      public fun providerProperties(providerProperties: IResolvable)

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      public fun providerProperties(providerProperties: ProviderPropertiesProperty)

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99e7e4a7a6322b76ecdd8c18747c700ce11a2af0f1fbf4624e4560278e5486a8")
      public
          fun providerProperties(providerProperties: ProviderPropertiesProperty.Builder.() -> Unit)

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      public fun ruleBasedProperties(ruleBasedProperties: IResolvable)

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      public fun ruleBasedProperties(ruleBasedProperties: IdMappingRuleBasedPropertiesProperty)

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("820d6249557e752e1e01f9dd2767f40fe0c2d5dcda220ad3833b74a6b9cb182f")
      public
          fun ruleBasedProperties(ruleBasedProperties: IdMappingRuleBasedPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty.builder()

      /**
       * @param idMappingType The type of ID mapping.
       */
      override fun idMappingType(idMappingType: String) {
        cdkBuilder.idMappingType(idMappingType)
      }

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      override fun providerProperties(providerProperties: IResolvable) {
        cdkBuilder.providerProperties(providerProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      override fun providerProperties(providerProperties: ProviderPropertiesProperty) {
        cdkBuilder.providerProperties(providerProperties.let(ProviderPropertiesProperty.Companion::unwrap))
      }

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99e7e4a7a6322b76ecdd8c18747c700ce11a2af0f1fbf4624e4560278e5486a8")
      override
          fun providerProperties(providerProperties: ProviderPropertiesProperty.Builder.() -> Unit):
          Unit = providerProperties(ProviderPropertiesProperty(providerProperties))

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      override fun ruleBasedProperties(ruleBasedProperties: IResolvable) {
        cdkBuilder.ruleBasedProperties(ruleBasedProperties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      override fun ruleBasedProperties(ruleBasedProperties: IdMappingRuleBasedPropertiesProperty) {
        cdkBuilder.ruleBasedProperties(ruleBasedProperties.let(IdMappingRuleBasedPropertiesProperty.Companion::unwrap))
      }

      /**
       * @param ruleBasedProperties An object which defines any additional configurations required
       * by rule-based matching.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("820d6249557e752e1e01f9dd2767f40fe0c2d5dcda220ad3833b74a6b9cb182f")
      override
          fun ruleBasedProperties(ruleBasedProperties: IdMappingRuleBasedPropertiesProperty.Builder.() -> Unit):
          Unit = ruleBasedProperties(IdMappingRuleBasedPropertiesProperty(ruleBasedProperties))

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty,
    ) : CdkObject(cdkObject),
        IdMappingTechniquesProperty {
      /**
       * The type of ID mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingtechniques.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques-idmappingtype)
       */
      override fun idMappingType(): String? = unwrap(this).getIdMappingType()

      /**
       * An object which defines any additional configurations required by the provider service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingtechniques.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques-providerproperties)
       */
      override fun providerProperties(): Any? = unwrap(this).getProviderProperties()

      /**
       * An object which defines any additional configurations required by rule-based matching.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingtechniques.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques-rulebasedproperties)
       */
      override fun ruleBasedProperties(): Any? = unwrap(this).getRuleBasedProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdMappingTechniquesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty):
          IdMappingTechniquesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdMappingTechniquesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingTechniquesProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty
    }
  }

  /**
   * An object containing `InputSourceARN` , `SchemaName` , and `Type` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
   * IdMappingWorkflowInputSourceProperty idMappingWorkflowInputSourceProperty =
   * IdMappingWorkflowInputSourceProperty.builder()
   * .inputSourceArn("inputSourceArn")
   * // the properties below are optional
   * .schemaArn("schemaArn")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowinputsource.html)
   */
  public interface IdMappingWorkflowInputSourceProperty {
    /**
     * An AWS Glue table Amazon Resource Name (ARN) or a matching workflow ARN for the input source
     * table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowinputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowinputsource-inputsourcearn)
     */
    public fun inputSourceArn(): String

    /**
     * The ARN (Amazon Resource Name) that AWS Entity Resolution generated for the `SchemaMapping` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowinputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowinputsource-schemaarn)
     */
    public fun schemaArn(): String? = unwrap(this).getSchemaArn()

    /**
     * The type of ID namespace. There are two types: `SOURCE` and `TARGET` .
     *
     * The `SOURCE` contains configurations for `sourceId` data that will be processed in an ID
     * mapping workflow.
     *
     * The `TARGET` contains a configuration of `targetId` which all `sourceIds` will resolve to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowinputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowinputsource-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [IdMappingWorkflowInputSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputSourceArn An AWS Glue table Amazon Resource Name (ARN) or a matching workflow
       * ARN for the input source table. 
       */
      public fun inputSourceArn(inputSourceArn: String)

      /**
       * @param schemaArn The ARN (Amazon Resource Name) that AWS Entity Resolution generated for
       * the `SchemaMapping` .
       */
      public fun schemaArn(schemaArn: String)

      /**
       * @param type The type of ID namespace. There are two types: `SOURCE` and `TARGET` .
       * The `SOURCE` contains configurations for `sourceId` data that will be processed in an ID
       * mapping workflow.
       *
       * The `TARGET` contains a configuration of `targetId` which all `sourceIds` will resolve to.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty.builder()

      /**
       * @param inputSourceArn An AWS Glue table Amazon Resource Name (ARN) or a matching workflow
       * ARN for the input source table. 
       */
      override fun inputSourceArn(inputSourceArn: String) {
        cdkBuilder.inputSourceArn(inputSourceArn)
      }

      /**
       * @param schemaArn The ARN (Amazon Resource Name) that AWS Entity Resolution generated for
       * the `SchemaMapping` .
       */
      override fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
      }

      /**
       * @param type The type of ID namespace. There are two types: `SOURCE` and `TARGET` .
       * The `SOURCE` contains configurations for `sourceId` data that will be processed in an ID
       * mapping workflow.
       *
       * The `TARGET` contains a configuration of `targetId` which all `sourceIds` will resolve to.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty,
    ) : CdkObject(cdkObject),
        IdMappingWorkflowInputSourceProperty {
      /**
       * An AWS Glue table Amazon Resource Name (ARN) or a matching workflow ARN for the input
       * source table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowinputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowinputsource-inputsourcearn)
       */
      override fun inputSourceArn(): String = unwrap(this).getInputSourceArn()

      /**
       * The ARN (Amazon Resource Name) that AWS Entity Resolution generated for the `SchemaMapping`
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowinputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowinputsource-schemaarn)
       */
      override fun schemaArn(): String? = unwrap(this).getSchemaArn()

      /**
       * The type of ID namespace. There are two types: `SOURCE` and `TARGET` .
       *
       * The `SOURCE` contains configurations for `sourceId` data that will be processed in an ID
       * mapping workflow.
       *
       * The `TARGET` contains a configuration of `targetId` which all `sourceIds` will resolve to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowinputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowinputsource-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdMappingWorkflowInputSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty):
          IdMappingWorkflowInputSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdMappingWorkflowInputSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingWorkflowInputSourceProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty
    }
  }

  /**
   * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields `OutputS3Path`
   * and `Output` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
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
  public interface IdMappingWorkflowOutputSourceProperty {
    /**
     * Customer AWS KMS ARN for encryption at rest.
     *
     * If not provided, system will use an AWS Entity Resolution managed KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowoutputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowoutputsource-kmsarn)
     */
    public fun kmsArn(): String? = unwrap(this).getKmsArn()

    /**
     * The S3 path to which AWS Entity Resolution will write the output table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowoutputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowoutputsource-outputs3path)
     */
    public fun outputS3Path(): String

    /**
     * A builder for [IdMappingWorkflowOutputSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsArn Customer AWS KMS ARN for encryption at rest.
       * If not provided, system will use an AWS Entity Resolution managed KMS key.
       */
      public fun kmsArn(kmsArn: String)

      /**
       * @param outputS3Path The S3 path to which AWS Entity Resolution will write the output table.
       * 
       */
      public fun outputS3Path(outputS3Path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty.builder()

      /**
       * @param kmsArn Customer AWS KMS ARN for encryption at rest.
       * If not provided, system will use an AWS Entity Resolution managed KMS key.
       */
      override fun kmsArn(kmsArn: String) {
        cdkBuilder.kmsArn(kmsArn)
      }

      /**
       * @param outputS3Path The S3 path to which AWS Entity Resolution will write the output table.
       * 
       */
      override fun outputS3Path(outputS3Path: String) {
        cdkBuilder.outputS3Path(outputS3Path)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty,
    ) : CdkObject(cdkObject),
        IdMappingWorkflowOutputSourceProperty {
      /**
       * Customer AWS KMS ARN for encryption at rest.
       *
       * If not provided, system will use an AWS Entity Resolution managed KMS key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowoutputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowoutputsource-kmsarn)
       */
      override fun kmsArn(): String? = unwrap(this).getKmsArn()

      /**
       * The S3 path to which AWS Entity Resolution will write the output table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowoutputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowoutputsource-outputs3path)
       */
      override fun outputS3Path(): String = unwrap(this).getOutputS3Path()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdMappingWorkflowOutputSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty):
          IdMappingWorkflowOutputSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IdMappingWorkflowOutputSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingWorkflowOutputSourceProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty
    }
  }

  /**
   * The Amazon S3 location that temporarily stores your data while it processes.
   *
   * Your information won't be saved permanently.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
   * IntermediateSourceConfigurationProperty intermediateSourceConfigurationProperty =
   * IntermediateSourceConfigurationProperty.builder()
   * .intermediateS3Path("intermediateS3Path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-intermediatesourceconfiguration.html)
   */
  public interface IntermediateSourceConfigurationProperty {
    /**
     * The Amazon S3 location (bucket and prefix).
     *
     * For example: `s3://provider_bucket/DOC-EXAMPLE-BUCKET`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-intermediatesourceconfiguration.html#cfn-entityresolution-idmappingworkflow-intermediatesourceconfiguration-intermediates3path)
     */
    public fun intermediateS3Path(): String

    /**
     * A builder for [IntermediateSourceConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param intermediateS3Path The Amazon S3 location (bucket and prefix). 
       * For example: `s3://provider_bucket/DOC-EXAMPLE-BUCKET`
       */
      public fun intermediateS3Path(intermediateS3Path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty.builder()

      /**
       * @param intermediateS3Path The Amazon S3 location (bucket and prefix). 
       * For example: `s3://provider_bucket/DOC-EXAMPLE-BUCKET`
       */
      override fun intermediateS3Path(intermediateS3Path: String) {
        cdkBuilder.intermediateS3Path(intermediateS3Path)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty,
    ) : CdkObject(cdkObject),
        IntermediateSourceConfigurationProperty {
      /**
       * The Amazon S3 location (bucket and prefix).
       *
       * For example: `s3://provider_bucket/DOC-EXAMPLE-BUCKET`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-intermediatesourceconfiguration.html#cfn-entityresolution-idmappingworkflow-intermediatesourceconfiguration-intermediates3path)
       */
      override fun intermediateS3Path(): String = unwrap(this).getIntermediateS3Path()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IntermediateSourceConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty):
          IntermediateSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IntermediateSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntermediateSourceConfigurationProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty
    }
  }

  /**
   * An object containing the `providerServiceARN` , `intermediateSourceConfiguration` , and
   * `providerConfiguration` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
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
  public interface ProviderPropertiesProperty {
    /**
     * The Amazon S3 location that temporarily stores your data while it processes.
     *
     * Your information won't be saved permanently.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-providerproperties.html#cfn-entityresolution-idmappingworkflow-providerproperties-intermediatesourceconfiguration)
     */
    public fun intermediateSourceConfiguration(): Any? =
        unwrap(this).getIntermediateSourceConfiguration()

    /**
     * The required configuration fields to use with the provider service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-providerproperties.html#cfn-entityresolution-idmappingworkflow-providerproperties-providerconfiguration)
     */
    public fun providerConfiguration(): Any? = unwrap(this).getProviderConfiguration()

    /**
     * The ARN of the provider service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-providerproperties.html#cfn-entityresolution-idmappingworkflow-providerproperties-providerservicearn)
     */
    public fun providerServiceArn(): String

    /**
     * A builder for [ProviderPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param intermediateSourceConfiguration The Amazon S3 location that temporarily stores your
       * data while it processes.
       * Your information won't be saved permanently.
       */
      public fun intermediateSourceConfiguration(intermediateSourceConfiguration: IResolvable)

      /**
       * @param intermediateSourceConfiguration The Amazon S3 location that temporarily stores your
       * data while it processes.
       * Your information won't be saved permanently.
       */
      public
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty)

      /**
       * @param intermediateSourceConfiguration The Amazon S3 location that temporarily stores your
       * data while it processes.
       * Your information won't be saved permanently.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feeb44c32e5e169bbc20b86683c24e01fa5232b3c89a44934e6a49038df773fd")
      public
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty.Builder.() -> Unit)

      /**
       * @param providerConfiguration The required configuration fields to use with the provider
       * service.
       */
      public fun providerConfiguration(providerConfiguration: IResolvable)

      /**
       * @param providerConfiguration The required configuration fields to use with the provider
       * service.
       */
      public fun providerConfiguration(providerConfiguration: Map<String, String>)

      /**
       * @param providerServiceArn The ARN of the provider service. 
       */
      public fun providerServiceArn(providerServiceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty.builder()

      /**
       * @param intermediateSourceConfiguration The Amazon S3 location that temporarily stores your
       * data while it processes.
       * Your information won't be saved permanently.
       */
      override fun intermediateSourceConfiguration(intermediateSourceConfiguration: IResolvable) {
        cdkBuilder.intermediateSourceConfiguration(intermediateSourceConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param intermediateSourceConfiguration The Amazon S3 location that temporarily stores your
       * data while it processes.
       * Your information won't be saved permanently.
       */
      override
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty) {
        cdkBuilder.intermediateSourceConfiguration(intermediateSourceConfiguration.let(IntermediateSourceConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param intermediateSourceConfiguration The Amazon S3 location that temporarily stores your
       * data while it processes.
       * Your information won't be saved permanently.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feeb44c32e5e169bbc20b86683c24e01fa5232b3c89a44934e6a49038df773fd")
      override
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty.Builder.() -> Unit):
          Unit =
          intermediateSourceConfiguration(IntermediateSourceConfigurationProperty(intermediateSourceConfiguration))

      /**
       * @param providerConfiguration The required configuration fields to use with the provider
       * service.
       */
      override fun providerConfiguration(providerConfiguration: IResolvable) {
        cdkBuilder.providerConfiguration(providerConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param providerConfiguration The required configuration fields to use with the provider
       * service.
       */
      override fun providerConfiguration(providerConfiguration: Map<String, String>) {
        cdkBuilder.providerConfiguration(providerConfiguration)
      }

      /**
       * @param providerServiceArn The ARN of the provider service. 
       */
      override fun providerServiceArn(providerServiceArn: String) {
        cdkBuilder.providerServiceArn(providerServiceArn)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty,
    ) : CdkObject(cdkObject),
        ProviderPropertiesProperty {
      /**
       * The Amazon S3 location that temporarily stores your data while it processes.
       *
       * Your information won't be saved permanently.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-providerproperties.html#cfn-entityresolution-idmappingworkflow-providerproperties-intermediatesourceconfiguration)
       */
      override fun intermediateSourceConfiguration(): Any? =
          unwrap(this).getIntermediateSourceConfiguration()

      /**
       * The required configuration fields to use with the provider service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-providerproperties.html#cfn-entityresolution-idmappingworkflow-providerproperties-providerconfiguration)
       */
      override fun providerConfiguration(): Any? = unwrap(this).getProviderConfiguration()

      /**
       * The ARN of the provider service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-providerproperties.html#cfn-entityresolution-idmappingworkflow-providerproperties-providerservicearn)
       */
      override fun providerServiceArn(): String = unwrap(this).getProviderServiceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProviderPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty):
          ProviderPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProviderPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProviderPropertiesProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty
    }
  }

  /**
   * An object containing `RuleName` , and `MatchingKeys` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
   * RuleProperty ruleProperty = RuleProperty.builder()
   * .matchingKeys(List.of("matchingKeys"))
   * .ruleName("ruleName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-rule.html)
   */
  public interface RuleProperty {
    /**
     * A list of `MatchingKeys` .
     *
     * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are considered
     * to match according to this rule if all of the `MatchingKeys` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-rule.html#cfn-entityresolution-idmappingworkflow-rule-matchingkeys)
     */
    public fun matchingKeys(): List<String>

    /**
     * A name for the matching rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-rule.html#cfn-entityresolution-idmappingworkflow-rule-rulename)
     */
    public fun ruleName(): String

    /**
     * A builder for [RuleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param matchingKeys A list of `MatchingKeys` . 
       * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are
       * considered to match according to this rule if all of the `MatchingKeys` match.
       */
      public fun matchingKeys(matchingKeys: List<String>)

      /**
       * @param matchingKeys A list of `MatchingKeys` . 
       * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are
       * considered to match according to this rule if all of the `MatchingKeys` match.
       */
      public fun matchingKeys(vararg matchingKeys: String)

      /**
       * @param ruleName A name for the matching rule. 
       */
      public fun ruleName(ruleName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.RuleProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.RuleProperty.builder()

      /**
       * @param matchingKeys A list of `MatchingKeys` . 
       * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are
       * considered to match according to this rule if all of the `MatchingKeys` match.
       */
      override fun matchingKeys(matchingKeys: List<String>) {
        cdkBuilder.matchingKeys(matchingKeys)
      }

      /**
       * @param matchingKeys A list of `MatchingKeys` . 
       * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are
       * considered to match according to this rule if all of the `MatchingKeys` match.
       */
      override fun matchingKeys(vararg matchingKeys: String): Unit =
          matchingKeys(matchingKeys.toList())

      /**
       * @param ruleName A name for the matching rule. 
       */
      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.RuleProperty,
    ) : CdkObject(cdkObject),
        RuleProperty {
      /**
       * A list of `MatchingKeys` .
       *
       * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are
       * considered to match according to this rule if all of the `MatchingKeys` match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-rule.html#cfn-entityresolution-idmappingworkflow-rule-matchingkeys)
       */
      override fun matchingKeys(): List<String> = unwrap(this).getMatchingKeys()

      /**
       * A name for the matching rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-rule.html#cfn-entityresolution-idmappingworkflow-rule-rulename)
       */
      override fun ruleName(): String = unwrap(this).getRuleName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.RuleProperty):
          RuleProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.RuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.RuleProperty
    }
  }
}
