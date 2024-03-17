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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a `MatchingWorkflow` object which stores the configuration of the data processing job to
 * be run.
 *
 * It is important to note that there should not be a pre-existing `MatchingWorkflow` with the same
 * name. To modify an existing workflow, utilize the `UpdateMatchingWorkflow` API.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.entityresolution.*;
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
public open class CfnMatchingWorkflow internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The time of this MatchingWorkflow got created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The time of this MatchingWorkflow got last updated at.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * The default MatchingWorkflow arn.
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
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(): Any = unwrap(this).getInputSourceConfig()

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(`value`: IResolvable) {
    unwrap(this).setInputSourceConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(`value`: List<Any>) {
    unwrap(this).setInputSourceConfig(`value`)
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
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
   * `ApplyNormalization` , and `Output` .
   */
  public open fun outputSourceConfig(): Any = unwrap(this).getOutputSourceConfig()

  /**
   * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
   * `ApplyNormalization` , and `Output` .
   */
  public open fun outputSourceConfig(`value`: IResolvable) {
    unwrap(this).setOutputSourceConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
   * `ApplyNormalization` , and `Output` .
   */
  public open fun outputSourceConfig(`value`: List<Any>) {
    unwrap(this).setOutputSourceConfig(`value`)
  }

  /**
   * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
   * `ApplyNormalization` , and `Output` .
   */
  public open fun outputSourceConfig(vararg `value`: Any): Unit =
      outputSourceConfig(`value`.toList())

  /**
   * An object which defines the `resolutionType` and the `ruleBasedProperties` .
   */
  public open fun resolutionTechniques(): Any = unwrap(this).getResolutionTechniques()

  /**
   * An object which defines the `resolutionType` and the `ruleBasedProperties` .
   */
  public open fun resolutionTechniques(`value`: IResolvable) {
    unwrap(this).setResolutionTechniques(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object which defines the `resolutionType` and the `ruleBasedProperties` .
   */
  public open fun resolutionTechniques(`value`: ResolutionTechniquesProperty) {
    unwrap(this).setResolutionTechniques(`value`.let(ResolutionTechniquesProperty::unwrap))
  }

  /**
   * An object which defines the `resolutionType` and the `ruleBasedProperties` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9959af3e7593f9554485292d9da8539898fa0ff19ddd7eb214ec996c58dfc255")
  public open fun resolutionTechniques(`value`: ResolutionTechniquesProperty.Builder.() -> Unit):
      Unit = resolutionTechniques(ResolutionTechniquesProperty(`value`))

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
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.entityresolution.CfnMatchingWorkflow].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-description)
     * @param description A description of the workflow. 
     */
    public fun description(description: String)

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(inputSourceConfig: IResolvable)

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(inputSourceConfig: List<Any>)

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    public fun inputSourceConfig(vararg inputSourceConfig: Any)

    /**
     * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
     * `ApplyNormalization` , and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    public fun outputSourceConfig(outputSourceConfig: IResolvable)

    /**
     * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
     * `ApplyNormalization` , and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    public fun outputSourceConfig(outputSourceConfig: List<Any>)

    /**
     * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
     * `ApplyNormalization` , and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    public fun outputSourceConfig(vararg outputSourceConfig: Any)

    /**
     * An object which defines the `resolutionType` and the `ruleBasedProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-resolutiontechniques)
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    public fun resolutionTechniques(resolutionTechniques: IResolvable)

    /**
     * An object which defines the `resolutionType` and the `ruleBasedProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-resolutiontechniques)
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    public fun resolutionTechniques(resolutionTechniques: ResolutionTechniquesProperty)

    /**
     * An object which defines the `resolutionType` and the `ruleBasedProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-resolutiontechniques)
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a12242bc1b27d8c9689dda0dfefcf5d7fd966f70e529f3e77333e4b94f1a9f0e")
    public
        fun resolutionTechniques(resolutionTechniques: ResolutionTechniquesProperty.Builder.() -> Unit)

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * AWS Entity Resolution assumes this role to create resources on your behalf as part of
     * workflow execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the workflow.
     *
     * There can't be multiple `MatchingWorkflows` with the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-workflowname)
     * @param workflowName The name of the workflow. 
     */
    public fun workflowName(workflowName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.Builder =
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.Builder.create(scope,
        id)

    /**
     * A description of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-description)
     * @param description A description of the workflow. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(inputSourceConfig: IResolvable) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(inputSourceConfig: List<Any>) {
      cdkBuilder.inputSourceConfig(inputSourceConfig)
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(vararg inputSourceConfig: Any): Unit =
        inputSourceConfig(inputSourceConfig.toList())

    /**
     * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
     * `ApplyNormalization` , and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    override fun outputSourceConfig(outputSourceConfig: IResolvable) {
      cdkBuilder.outputSourceConfig(outputSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
     * `ApplyNormalization` , and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    override fun outputSourceConfig(outputSourceConfig: List<Any>) {
      cdkBuilder.outputSourceConfig(outputSourceConfig)
    }

    /**
     * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
     * `ApplyNormalization` , and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-outputsourceconfig)
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    override fun outputSourceConfig(vararg outputSourceConfig: Any): Unit =
        outputSourceConfig(outputSourceConfig.toList())

    /**
     * An object which defines the `resolutionType` and the `ruleBasedProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-resolutiontechniques)
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    override fun resolutionTechniques(resolutionTechniques: IResolvable) {
      cdkBuilder.resolutionTechniques(resolutionTechniques.let(IResolvable::unwrap))
    }

    /**
     * An object which defines the `resolutionType` and the `ruleBasedProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-resolutiontechniques)
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    override fun resolutionTechniques(resolutionTechniques: ResolutionTechniquesProperty) {
      cdkBuilder.resolutionTechniques(resolutionTechniques.let(ResolutionTechniquesProperty::unwrap))
    }

    /**
     * An object which defines the `resolutionType` and the `ruleBasedProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-resolutiontechniques)
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a12242bc1b27d8c9689dda0dfefcf5d7fd966f70e529f3e77333e4b94f1a9f0e")
    override
        fun resolutionTechniques(resolutionTechniques: ResolutionTechniquesProperty.Builder.() -> Unit):
        Unit = resolutionTechniques(ResolutionTechniquesProperty(resolutionTechniques))

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * AWS Entity Resolution assumes this role to create resources on your behalf as part of
     * workflow execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-tags)
     * @param tags The tags used to organize, track, or control access for this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the workflow.
     *
     * There can't be multiple `MatchingWorkflows` with the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-workflowname)
     * @param workflowName The name of the workflow. 
     */
    override fun workflowName(workflowName: String) {
      cdkBuilder.workflowName(workflowName)
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMatchingWorkflow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMatchingWorkflow(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow):
        CfnMatchingWorkflow = CfnMatchingWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnMatchingWorkflow):
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow = wrapped.cdkObject
  }

  /**
   * An object which defines the list of matching rules to run and has a field `Rules` , which is a
   * list of rule objects.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
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
  public interface RuleBasedPropertiesProperty {
    /**
     * The comparison type.
     *
     * You can either choose `ONE_TO_ONE` or `MANY_TO_MANY` as the AttributeMatchingModel. When
     * choosing `MANY_TO_MANY` , the system can match attributes across the sub-types of an attribute
     * type. For example, if the value of the `Email` field of Profile A and the value of
     * `BusinessEmail` field of Profile B matches, the two profiles are matched on the `Email` type.
     * When choosing `ONE_TO_ONE` ,the system can only match if the sub-types are exact matches. For
     * example, only when the value of the `Email` field of Profile A and the value of the `Email`
     * field of Profile B matches, the two profiles are matched on the `Email` type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rulebasedproperties.html#cfn-entityresolution-matchingworkflow-rulebasedproperties-attributematchingmodel)
     */
    public fun attributeMatchingModel(): String

    /**
     * A list of `Rule` objects, each of which have fields `RuleName` and `MatchingKeys` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rulebasedproperties.html#cfn-entityresolution-matchingworkflow-rulebasedproperties-rules)
     */
    public fun rules(): Any

    /**
     * A builder for [RuleBasedPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeMatchingModel The comparison type. 
       * You can either choose `ONE_TO_ONE` or `MANY_TO_MANY` as the AttributeMatchingModel. When
       * choosing `MANY_TO_MANY` , the system can match attributes across the sub-types of an attribute
       * type. For example, if the value of the `Email` field of Profile A and the value of
       * `BusinessEmail` field of Profile B matches, the two profiles are matched on the `Email` type.
       * When choosing `ONE_TO_ONE` ,the system can only match if the sub-types are exact matches. For
       * example, only when the value of the `Email` field of Profile A and the value of the `Email`
       * field of Profile B matches, the two profiles are matched on the `Email` type.
       */
      public fun attributeMatchingModel(attributeMatchingModel: String)

      /**
       * @param rules A list of `Rule` objects, each of which have fields `RuleName` and
       * `MatchingKeys` . 
       */
      public fun rules(rules: IResolvable)

      /**
       * @param rules A list of `Rule` objects, each of which have fields `RuleName` and
       * `MatchingKeys` . 
       */
      public fun rules(rules: List<Any>)

      /**
       * @param rules A list of `Rule` objects, each of which have fields `RuleName` and
       * `MatchingKeys` . 
       */
      public fun rules(vararg rules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty.builder()

      /**
       * @param attributeMatchingModel The comparison type. 
       * You can either choose `ONE_TO_ONE` or `MANY_TO_MANY` as the AttributeMatchingModel. When
       * choosing `MANY_TO_MANY` , the system can match attributes across the sub-types of an attribute
       * type. For example, if the value of the `Email` field of Profile A and the value of
       * `BusinessEmail` field of Profile B matches, the two profiles are matched on the `Email` type.
       * When choosing `ONE_TO_ONE` ,the system can only match if the sub-types are exact matches. For
       * example, only when the value of the `Email` field of Profile A and the value of the `Email`
       * field of Profile B matches, the two profiles are matched on the `Email` type.
       */
      override fun attributeMatchingModel(attributeMatchingModel: String) {
        cdkBuilder.attributeMatchingModel(attributeMatchingModel)
      }

      /**
       * @param rules A list of `Rule` objects, each of which have fields `RuleName` and
       * `MatchingKeys` . 
       */
      override fun rules(rules: IResolvable) {
        cdkBuilder.rules(rules.let(IResolvable::unwrap))
      }

      /**
       * @param rules A list of `Rule` objects, each of which have fields `RuleName` and
       * `MatchingKeys` . 
       */
      override fun rules(rules: List<Any>) {
        cdkBuilder.rules(rules)
      }

      /**
       * @param rules A list of `Rule` objects, each of which have fields `RuleName` and
       * `MatchingKeys` . 
       */
      override fun rules(vararg rules: Any): Unit = rules(rules.toList())

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty,
    ) : CdkObject(cdkObject), RuleBasedPropertiesProperty {
      /**
       * The comparison type.
       *
       * You can either choose `ONE_TO_ONE` or `MANY_TO_MANY` as the AttributeMatchingModel. When
       * choosing `MANY_TO_MANY` , the system can match attributes across the sub-types of an attribute
       * type. For example, if the value of the `Email` field of Profile A and the value of
       * `BusinessEmail` field of Profile B matches, the two profiles are matched on the `Email` type.
       * When choosing `ONE_TO_ONE` ,the system can only match if the sub-types are exact matches. For
       * example, only when the value of the `Email` field of Profile A and the value of the `Email`
       * field of Profile B matches, the two profiles are matched on the `Email` type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rulebasedproperties.html#cfn-entityresolution-matchingworkflow-rulebasedproperties-attributematchingmodel)
       */
      override fun attributeMatchingModel(): String = unwrap(this).getAttributeMatchingModel()

      /**
       * A list of `Rule` objects, each of which have fields `RuleName` and `MatchingKeys` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rulebasedproperties.html#cfn-entityresolution-matchingworkflow-rulebasedproperties-rules)
       */
      override fun rules(): Any = unwrap(this).getRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleBasedPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty):
          RuleBasedPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RuleBasedPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleBasedPropertiesProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleBasedPropertiesProperty
    }
  }

  /**
   * A list of `OutputAttribute` objects, each of which have the fields `Name` and `Hashed` .
   *
   * Each of these objects selects a column to be included in the output table, and whether the
   * values of the column should be hashed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
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
  public interface OutputSourceProperty {
    /**
     * Normalizes the attributes defined in the schema in the input data.
     *
     * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
     * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in the
     * output to (123)-456-7890.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputsource.html#cfn-entityresolution-matchingworkflow-outputsource-applynormalization)
     */
    public fun applyNormalization(): Any? = unwrap(this).getApplyNormalization()

    /**
     * Customer KMS ARN for encryption at rest.
     *
     * If not provided, system will use an AWS Entity Resolution managed KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputsource.html#cfn-entityresolution-matchingworkflow-outputsource-kmsarn)
     */
    public fun kmsArn(): String? = unwrap(this).getKmsArn()

    /**
     * A list of `OutputAttribute` objects, each of which have the fields `Name` and `Hashed` .
     *
     * Each of these objects selects a column to be included in the output table, and whether the
     * values of the column should be hashed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputsource.html#cfn-entityresolution-matchingworkflow-outputsource-output)
     */
    public fun output(): Any

    /**
     * The S3 path to which AWS Entity Resolution will write the output table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputsource.html#cfn-entityresolution-matchingworkflow-outputsource-outputs3path)
     */
    public fun outputS3Path(): String

    /**
     * A builder for [OutputSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applyNormalization Normalizes the attributes defined in the schema in the input
       * data.
       * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
       * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in
       * the output to (123)-456-7890.
       */
      public fun applyNormalization(applyNormalization: Boolean)

      /**
       * @param applyNormalization Normalizes the attributes defined in the schema in the input
       * data.
       * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
       * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in
       * the output to (123)-456-7890.
       */
      public fun applyNormalization(applyNormalization: IResolvable)

      /**
       * @param kmsArn Customer KMS ARN for encryption at rest.
       * If not provided, system will use an AWS Entity Resolution managed KMS key.
       */
      public fun kmsArn(kmsArn: String)

      /**
       * @param output A list of `OutputAttribute` objects, each of which have the fields `Name` and
       * `Hashed` . 
       * Each of these objects selects a column to be included in the output table, and whether the
       * values of the column should be hashed.
       */
      public fun output(output: IResolvable)

      /**
       * @param output A list of `OutputAttribute` objects, each of which have the fields `Name` and
       * `Hashed` . 
       * Each of these objects selects a column to be included in the output table, and whether the
       * values of the column should be hashed.
       */
      public fun output(output: List<Any>)

      /**
       * @param output A list of `OutputAttribute` objects, each of which have the fields `Name` and
       * `Hashed` . 
       * Each of these objects selects a column to be included in the output table, and whether the
       * values of the column should be hashed.
       */
      public fun output(vararg output: Any)

      /**
       * @param outputS3Path The S3 path to which AWS Entity Resolution will write the output table.
       * 
       */
      public fun outputS3Path(outputS3Path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty.builder()

      /**
       * @param applyNormalization Normalizes the attributes defined in the schema in the input
       * data.
       * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
       * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in
       * the output to (123)-456-7890.
       */
      override fun applyNormalization(applyNormalization: Boolean) {
        cdkBuilder.applyNormalization(applyNormalization)
      }

      /**
       * @param applyNormalization Normalizes the attributes defined in the schema in the input
       * data.
       * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
       * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in
       * the output to (123)-456-7890.
       */
      override fun applyNormalization(applyNormalization: IResolvable) {
        cdkBuilder.applyNormalization(applyNormalization.let(IResolvable::unwrap))
      }

      /**
       * @param kmsArn Customer KMS ARN for encryption at rest.
       * If not provided, system will use an AWS Entity Resolution managed KMS key.
       */
      override fun kmsArn(kmsArn: String) {
        cdkBuilder.kmsArn(kmsArn)
      }

      /**
       * @param output A list of `OutputAttribute` objects, each of which have the fields `Name` and
       * `Hashed` . 
       * Each of these objects selects a column to be included in the output table, and whether the
       * values of the column should be hashed.
       */
      override fun output(output: IResolvable) {
        cdkBuilder.output(output.let(IResolvable::unwrap))
      }

      /**
       * @param output A list of `OutputAttribute` objects, each of which have the fields `Name` and
       * `Hashed` . 
       * Each of these objects selects a column to be included in the output table, and whether the
       * values of the column should be hashed.
       */
      override fun output(output: List<Any>) {
        cdkBuilder.output(output)
      }

      /**
       * @param output A list of `OutputAttribute` objects, each of which have the fields `Name` and
       * `Hashed` . 
       * Each of these objects selects a column to be included in the output table, and whether the
       * values of the column should be hashed.
       */
      override fun output(vararg output: Any): Unit = output(output.toList())

      /**
       * @param outputS3Path The S3 path to which AWS Entity Resolution will write the output table.
       * 
       */
      override fun outputS3Path(outputS3Path: String) {
        cdkBuilder.outputS3Path(outputS3Path)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty,
    ) : CdkObject(cdkObject), OutputSourceProperty {
      /**
       * Normalizes the attributes defined in the schema in the input data.
       *
       * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
       * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in
       * the output to (123)-456-7890.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputsource.html#cfn-entityresolution-matchingworkflow-outputsource-applynormalization)
       */
      override fun applyNormalization(): Any? = unwrap(this).getApplyNormalization()

      /**
       * Customer KMS ARN for encryption at rest.
       *
       * If not provided, system will use an AWS Entity Resolution managed KMS key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputsource.html#cfn-entityresolution-matchingworkflow-outputsource-kmsarn)
       */
      override fun kmsArn(): String? = unwrap(this).getKmsArn()

      /**
       * A list of `OutputAttribute` objects, each of which have the fields `Name` and `Hashed` .
       *
       * Each of these objects selects a column to be included in the output table, and whether the
       * values of the column should be hashed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputsource.html#cfn-entityresolution-matchingworkflow-outputsource-output)
       */
      override fun output(): Any = unwrap(this).getOutput()

      /**
       * The S3 path to which AWS Entity Resolution will write the output table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputsource.html#cfn-entityresolution-matchingworkflow-outputsource-outputs3path)
       */
      override fun outputS3Path(): String = unwrap(this).getOutputS3Path()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty):
          OutputSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? OutputSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputSourceProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputSourceProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-providerproperties.html)
   */
  public interface ProviderPropertiesProperty {
    /**
     * The Amazon S3 location that temporarily stores your data while it processes.
     *
     * Your information won't be saved permanently.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-providerproperties.html#cfn-entityresolution-matchingworkflow-providerproperties-intermediatesourceconfiguration)
     */
    public fun intermediateSourceConfiguration(): Any? =
        unwrap(this).getIntermediateSourceConfiguration()

    /**
     * The required configuration fields to use with the provider service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-providerproperties.html#cfn-entityresolution-matchingworkflow-providerproperties-providerconfiguration)
     */
    public fun providerConfiguration(): Any? = unwrap(this).getProviderConfiguration()

    /**
     * The ARN of the provider service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-providerproperties.html#cfn-entityresolution-matchingworkflow-providerproperties-providerservicearn)
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
      @JvmName("44b6a1a49cdb72077c62dd50da4e7abffc10e54d5ad4313fd78ba4abdc5b1a15")
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
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty.builder()

      /**
       * @param intermediateSourceConfiguration The Amazon S3 location that temporarily stores your
       * data while it processes.
       * Your information won't be saved permanently.
       */
      override fun intermediateSourceConfiguration(intermediateSourceConfiguration: IResolvable) {
        cdkBuilder.intermediateSourceConfiguration(intermediateSourceConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param intermediateSourceConfiguration The Amazon S3 location that temporarily stores your
       * data while it processes.
       * Your information won't be saved permanently.
       */
      override
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty) {
        cdkBuilder.intermediateSourceConfiguration(intermediateSourceConfiguration.let(IntermediateSourceConfigurationProperty::unwrap))
      }

      /**
       * @param intermediateSourceConfiguration The Amazon S3 location that temporarily stores your
       * data while it processes.
       * Your information won't be saved permanently.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("44b6a1a49cdb72077c62dd50da4e7abffc10e54d5ad4313fd78ba4abdc5b1a15")
      override
          fun intermediateSourceConfiguration(intermediateSourceConfiguration: IntermediateSourceConfigurationProperty.Builder.() -> Unit):
          Unit =
          intermediateSourceConfiguration(IntermediateSourceConfigurationProperty(intermediateSourceConfiguration))

      /**
       * @param providerConfiguration The required configuration fields to use with the provider
       * service.
       */
      override fun providerConfiguration(providerConfiguration: IResolvable) {
        cdkBuilder.providerConfiguration(providerConfiguration.let(IResolvable::unwrap))
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
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty,
    ) : CdkObject(cdkObject), ProviderPropertiesProperty {
      /**
       * The Amazon S3 location that temporarily stores your data while it processes.
       *
       * Your information won't be saved permanently.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-providerproperties.html#cfn-entityresolution-matchingworkflow-providerproperties-intermediatesourceconfiguration)
       */
      override fun intermediateSourceConfiguration(): Any? =
          unwrap(this).getIntermediateSourceConfiguration()

      /**
       * The required configuration fields to use with the provider service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-providerproperties.html#cfn-entityresolution-matchingworkflow-providerproperties-providerconfiguration)
       */
      override fun providerConfiguration(): Any? = unwrap(this).getProviderConfiguration()

      /**
       * The ARN of the provider service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-providerproperties.html#cfn-entityresolution-matchingworkflow-providerproperties-providerservicearn)
       */
      override fun providerServiceArn(): String = unwrap(this).getProviderServiceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProviderPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty):
          ProviderPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProviderPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProviderPropertiesProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ProviderPropertiesProperty
    }
  }

  /**
   * An object which defines the `resolutionType` and the `ruleBasedProperties` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
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
  public interface ResolutionTechniquesProperty {
    /**
     * The properties of the provider service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-resolutiontechniques.html#cfn-entityresolution-matchingworkflow-resolutiontechniques-providerproperties)
     */
    public fun providerProperties(): Any? = unwrap(this).getProviderProperties()

    /**
     * The type of matching.
     *
     * There are two types of matching: `RULE_MATCHING` and `ML_MATCHING` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-resolutiontechniques.html#cfn-entityresolution-matchingworkflow-resolutiontechniques-resolutiontype)
     */
    public fun resolutionType(): String? = unwrap(this).getResolutionType()

    /**
     * An object which defines the list of matching rules to run and has a field `Rules` , which is
     * a list of rule objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-resolutiontechniques.html#cfn-entityresolution-matchingworkflow-resolutiontechniques-rulebasedproperties)
     */
    public fun ruleBasedProperties(): Any? = unwrap(this).getRuleBasedProperties()

    /**
     * A builder for [ResolutionTechniquesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param providerProperties The properties of the provider service.
       */
      public fun providerProperties(providerProperties: IResolvable)

      /**
       * @param providerProperties The properties of the provider service.
       */
      public fun providerProperties(providerProperties: ProviderPropertiesProperty)

      /**
       * @param providerProperties The properties of the provider service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e1873bb6790a95692a48ecbe2d02211a68fb7e870f066de197064e5211312d4")
      public
          fun providerProperties(providerProperties: ProviderPropertiesProperty.Builder.() -> Unit)

      /**
       * @param resolutionType The type of matching.
       * There are two types of matching: `RULE_MATCHING` and `ML_MATCHING` .
       */
      public fun resolutionType(resolutionType: String)

      /**
       * @param ruleBasedProperties An object which defines the list of matching rules to run and
       * has a field `Rules` , which is a list of rule objects.
       */
      public fun ruleBasedProperties(ruleBasedProperties: IResolvable)

      /**
       * @param ruleBasedProperties An object which defines the list of matching rules to run and
       * has a field `Rules` , which is a list of rule objects.
       */
      public fun ruleBasedProperties(ruleBasedProperties: RuleBasedPropertiesProperty)

      /**
       * @param ruleBasedProperties An object which defines the list of matching rules to run and
       * has a field `Rules` , which is a list of rule objects.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e25091e8a97032b2c448c5ce58b3d554750bdc070d7440d4c6c2bf477344024")
      public
          fun ruleBasedProperties(ruleBasedProperties: RuleBasedPropertiesProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty.builder()

      /**
       * @param providerProperties The properties of the provider service.
       */
      override fun providerProperties(providerProperties: IResolvable) {
        cdkBuilder.providerProperties(providerProperties.let(IResolvable::unwrap))
      }

      /**
       * @param providerProperties The properties of the provider service.
       */
      override fun providerProperties(providerProperties: ProviderPropertiesProperty) {
        cdkBuilder.providerProperties(providerProperties.let(ProviderPropertiesProperty::unwrap))
      }

      /**
       * @param providerProperties The properties of the provider service.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8e1873bb6790a95692a48ecbe2d02211a68fb7e870f066de197064e5211312d4")
      override
          fun providerProperties(providerProperties: ProviderPropertiesProperty.Builder.() -> Unit):
          Unit = providerProperties(ProviderPropertiesProperty(providerProperties))

      /**
       * @param resolutionType The type of matching.
       * There are two types of matching: `RULE_MATCHING` and `ML_MATCHING` .
       */
      override fun resolutionType(resolutionType: String) {
        cdkBuilder.resolutionType(resolutionType)
      }

      /**
       * @param ruleBasedProperties An object which defines the list of matching rules to run and
       * has a field `Rules` , which is a list of rule objects.
       */
      override fun ruleBasedProperties(ruleBasedProperties: IResolvable) {
        cdkBuilder.ruleBasedProperties(ruleBasedProperties.let(IResolvable::unwrap))
      }

      /**
       * @param ruleBasedProperties An object which defines the list of matching rules to run and
       * has a field `Rules` , which is a list of rule objects.
       */
      override fun ruleBasedProperties(ruleBasedProperties: RuleBasedPropertiesProperty) {
        cdkBuilder.ruleBasedProperties(ruleBasedProperties.let(RuleBasedPropertiesProperty::unwrap))
      }

      /**
       * @param ruleBasedProperties An object which defines the list of matching rules to run and
       * has a field `Rules` , which is a list of rule objects.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1e25091e8a97032b2c448c5ce58b3d554750bdc070d7440d4c6c2bf477344024")
      override
          fun ruleBasedProperties(ruleBasedProperties: RuleBasedPropertiesProperty.Builder.() -> Unit):
          Unit = ruleBasedProperties(RuleBasedPropertiesProperty(ruleBasedProperties))

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty,
    ) : CdkObject(cdkObject), ResolutionTechniquesProperty {
      /**
       * The properties of the provider service.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-resolutiontechniques.html#cfn-entityresolution-matchingworkflow-resolutiontechniques-providerproperties)
       */
      override fun providerProperties(): Any? = unwrap(this).getProviderProperties()

      /**
       * The type of matching.
       *
       * There are two types of matching: `RULE_MATCHING` and `ML_MATCHING` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-resolutiontechniques.html#cfn-entityresolution-matchingworkflow-resolutiontechniques-resolutiontype)
       */
      override fun resolutionType(): String? = unwrap(this).getResolutionType()

      /**
       * An object which defines the list of matching rules to run and has a field `Rules` , which
       * is a list of rule objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-resolutiontechniques.html#cfn-entityresolution-matchingworkflow-resolutiontechniques-rulebasedproperties)
       */
      override fun ruleBasedProperties(): Any? = unwrap(this).getRuleBasedProperties()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResolutionTechniquesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty):
          ResolutionTechniquesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResolutionTechniquesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResolutionTechniquesProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.ResolutionTechniquesProperty
    }
  }

  /**
   * An object containing `InputSourceARN` , `SchemaName` , and `ApplyNormalization` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
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
  public interface InputSourceProperty {
    /**
     * Normalizes the attributes defined in the schema in the input data.
     *
     * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
     * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in the
     * output to (123)-456-7890.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-inputsource.html#cfn-entityresolution-matchingworkflow-inputsource-applynormalization)
     */
    public fun applyNormalization(): Any? = unwrap(this).getApplyNormalization()

    /**
     * An object containing `InputSourceARN` , `SchemaName` , and `ApplyNormalization` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-inputsource.html#cfn-entityresolution-matchingworkflow-inputsource-inputsourcearn)
     */
    public fun inputSourceArn(): String

    /**
     * The name of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-inputsource.html#cfn-entityresolution-matchingworkflow-inputsource-schemaarn)
     */
    public fun schemaArn(): String

    /**
     * A builder for [InputSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param applyNormalization Normalizes the attributes defined in the schema in the input
       * data.
       * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
       * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in
       * the output to (123)-456-7890.
       */
      public fun applyNormalization(applyNormalization: Boolean)

      /**
       * @param applyNormalization Normalizes the attributes defined in the schema in the input
       * data.
       * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
       * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in
       * the output to (123)-456-7890.
       */
      public fun applyNormalization(applyNormalization: IResolvable)

      /**
       * @param inputSourceArn An object containing `InputSourceARN` , `SchemaName` , and
       * `ApplyNormalization` . 
       */
      public fun inputSourceArn(inputSourceArn: String)

      /**
       * @param schemaArn The name of the schema. 
       */
      public fun schemaArn(schemaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty.builder()

      /**
       * @param applyNormalization Normalizes the attributes defined in the schema in the input
       * data.
       * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
       * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in
       * the output to (123)-456-7890.
       */
      override fun applyNormalization(applyNormalization: Boolean) {
        cdkBuilder.applyNormalization(applyNormalization)
      }

      /**
       * @param applyNormalization Normalizes the attributes defined in the schema in the input
       * data.
       * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
       * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in
       * the output to (123)-456-7890.
       */
      override fun applyNormalization(applyNormalization: IResolvable) {
        cdkBuilder.applyNormalization(applyNormalization.let(IResolvable::unwrap))
      }

      /**
       * @param inputSourceArn An object containing `InputSourceARN` , `SchemaName` , and
       * `ApplyNormalization` . 
       */
      override fun inputSourceArn(inputSourceArn: String) {
        cdkBuilder.inputSourceArn(inputSourceArn)
      }

      /**
       * @param schemaArn The name of the schema. 
       */
      override fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty,
    ) : CdkObject(cdkObject), InputSourceProperty {
      /**
       * Normalizes the attributes defined in the schema in the input data.
       *
       * For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
       * input table is in a format of 1234567890, AWS Entity Resolution will normalize this field in
       * the output to (123)-456-7890.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-inputsource.html#cfn-entityresolution-matchingworkflow-inputsource-applynormalization)
       */
      override fun applyNormalization(): Any? = unwrap(this).getApplyNormalization()

      /**
       * An object containing `InputSourceARN` , `SchemaName` , and `ApplyNormalization` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-inputsource.html#cfn-entityresolution-matchingworkflow-inputsource-inputsourcearn)
       */
      override fun inputSourceArn(): String = unwrap(this).getInputSourceArn()

      /**
       * The name of the schema.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-inputsource.html#cfn-entityresolution-matchingworkflow-inputsource-schemaarn)
       */
      override fun schemaArn(): String = unwrap(this).getSchemaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty):
          InputSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? InputSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSourceProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.InputSourceProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-intermediatesourceconfiguration.html)
   */
  public interface IntermediateSourceConfigurationProperty {
    /**
     * The Amazon S3 location (bucket and prefix).
     *
     * For example: `s3://provider_bucket/DOC-EXAMPLE-BUCKET`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-intermediatesourceconfiguration.html#cfn-entityresolution-matchingworkflow-intermediatesourceconfiguration-intermediates3path)
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
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty.builder()

      /**
       * @param intermediateS3Path The Amazon S3 location (bucket and prefix). 
       * For example: `s3://provider_bucket/DOC-EXAMPLE-BUCKET`
       */
      override fun intermediateS3Path(intermediateS3Path: String) {
        cdkBuilder.intermediateS3Path(intermediateS3Path)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty,
    ) : CdkObject(cdkObject), IntermediateSourceConfigurationProperty {
      /**
       * The Amazon S3 location (bucket and prefix).
       *
       * For example: `s3://provider_bucket/DOC-EXAMPLE-BUCKET`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-intermediatesourceconfiguration.html#cfn-entityresolution-matchingworkflow-intermediatesourceconfiguration-intermediates3path)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty):
          IntermediateSourceConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IntermediateSourceConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntermediateSourceConfigurationProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.IntermediateSourceConfigurationProperty
    }
  }

  /**
   * A list of `OutputAttribute` objects, each of which have the fields `Name` and `Hashed` .
   *
   * Each of these objects selects a column to be included in the output table, and whether the
   * values of the column should be hashed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.entityresolution.*;
   * OutputAttributeProperty outputAttributeProperty = OutputAttributeProperty.builder()
   * .name("name")
   * // the properties below are optional
   * .hashed(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputattribute.html)
   */
  public interface OutputAttributeProperty {
    /**
     * Enables the ability to hash the column values in the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputattribute.html#cfn-entityresolution-matchingworkflow-outputattribute-hashed)
     */
    public fun hashed(): Any? = unwrap(this).getHashed()

    /**
     * A name of a column to be written to the output.
     *
     * This must be an `InputField` name in the schema mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputattribute.html#cfn-entityresolution-matchingworkflow-outputattribute-name)
     */
    public fun name(): String

    /**
     * A builder for [OutputAttributeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param hashed Enables the ability to hash the column values in the output.
       */
      public fun hashed(hashed: Boolean)

      /**
       * @param hashed Enables the ability to hash the column values in the output.
       */
      public fun hashed(hashed: IResolvable)

      /**
       * @param name A name of a column to be written to the output. 
       * This must be an `InputField` name in the schema mapping.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty.builder()

      /**
       * @param hashed Enables the ability to hash the column values in the output.
       */
      override fun hashed(hashed: Boolean) {
        cdkBuilder.hashed(hashed)
      }

      /**
       * @param hashed Enables the ability to hash the column values in the output.
       */
      override fun hashed(hashed: IResolvable) {
        cdkBuilder.hashed(hashed.let(IResolvable::unwrap))
      }

      /**
       * @param name A name of a column to be written to the output. 
       * This must be an `InputField` name in the schema mapping.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty,
    ) : CdkObject(cdkObject), OutputAttributeProperty {
      /**
       * Enables the ability to hash the column values in the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputattribute.html#cfn-entityresolution-matchingworkflow-outputattribute-hashed)
       */
      override fun hashed(): Any? = unwrap(this).getHashed()

      /**
       * A name of a column to be written to the output.
       *
       * This must be an `InputField` name in the schema mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputattribute.html#cfn-entityresolution-matchingworkflow-outputattribute-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputAttributeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty):
          OutputAttributeProperty = CdkObjectWrappers.wrap(cdkObject) as? OutputAttributeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputAttributeProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.OutputAttributeProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rule.html)
   */
  public interface RuleProperty {
    /**
     * A list of `MatchingKeys` .
     *
     * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are considered
     * to match according to this rule if all of the `MatchingKeys` match.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rule.html#cfn-entityresolution-matchingworkflow-rule-matchingkeys)
     */
    public fun matchingKeys(): List<String>

    /**
     * A name for the matching rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rule.html#cfn-entityresolution-matchingworkflow-rule-rulename)
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
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty.builder()

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
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      /**
       * A list of `MatchingKeys` .
       *
       * The `MatchingKeys` must have been defined in the `SchemaMapping` . Two records are
       * considered to match according to this rule if all of the `MatchingKeys` match.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rule.html#cfn-entityresolution-matchingworkflow-rule-matchingkeys)
       */
      override fun matchingKeys(): List<String> = unwrap(this).getMatchingKeys()

      /**
       * A name for the matching rule.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-rule.html#cfn-entityresolution-matchingworkflow-rule-rulename)
       */
      override fun ruleName(): String = unwrap(this).getRuleName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty):
          RuleProperty = CdkObjectWrappers.wrap(cdkObject) as? RuleProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow.RuleProperty
    }
  }
}
