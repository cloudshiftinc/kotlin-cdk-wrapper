package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIdMappingWorkflow internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
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
   * An object which defines the `idMappingType` and the `providerProperties` .
   */
  public open fun idMappingTechniques(): Any = unwrap(this).getIdMappingTechniques()

  /**
   * An object which defines the `idMappingType` and the `providerProperties` .
   */
  public open fun idMappingTechniques(`value`: IResolvable) {
    unwrap(this).setIdMappingTechniques(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object which defines the `idMappingType` and the `providerProperties` .
   */
  public open fun idMappingTechniques(`value`: IdMappingTechniquesProperty) {
    unwrap(this).setIdMappingTechniques(`value`.let(IdMappingTechniquesProperty::unwrap))
  }

  /**
   * An object which defines the `idMappingType` and the `providerProperties` .
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).setInputSourceConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(__idx_ac66f0: List<Any>) {
    unwrap(this).setInputSourceConfig(__idx_ac66f0)
  }

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   */
  public open fun inputSourceConfig(vararg __idx_ac66f0: Any): Unit =
      inputSourceConfig(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields `OutputS3Path`
   * and `Output` .
   */
  public open fun outputSourceConfig(): Any = unwrap(this).getOutputSourceConfig()

  /**
   * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields `OutputS3Path`
   * and `Output` .
   */
  public open fun outputSourceConfig(`value`: IResolvable) {
    unwrap(this).setOutputSourceConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields `OutputS3Path`
   * and `Output` .
   */
  public open fun outputSourceConfig(__idx_ac66f0: List<Any>) {
    unwrap(this).setOutputSourceConfig(__idx_ac66f0)
  }

  /**
   * A list of `IdMappingWorkflowOutputSource` objects, each of which contains fields `OutputS3Path`
   * and `Output` .
   */
  public open fun outputSourceConfig(vararg __idx_ac66f0: Any): Unit =
      outputSourceConfig(__idx_ac66f0.toList())

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
     * An object which defines the `idMappingType` and the `providerProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the `idMappingType` and the
     * `providerProperties` . 
     */
    public fun idMappingTechniques(idMappingTechniques: IResolvable)

    /**
     * An object which defines the `idMappingType` and the `providerProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the `idMappingType` and the
     * `providerProperties` . 
     */
    public fun idMappingTechniques(idMappingTechniques: IdMappingTechniquesProperty)

    /**
     * An object which defines the `idMappingType` and the `providerProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the `idMappingType` and the
     * `providerProperties` . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
     * An object which defines the `idMappingType` and the `providerProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the `idMappingType` and the
     * `providerProperties` . 
     */
    override fun idMappingTechniques(idMappingTechniques: IResolvable) {
      cdkBuilder.idMappingTechniques(idMappingTechniques.let(IResolvable::unwrap))
    }

    /**
     * An object which defines the `idMappingType` and the `providerProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the `idMappingType` and the
     * `providerProperties` . 
     */
    override fun idMappingTechniques(idMappingTechniques: IdMappingTechniquesProperty) {
      cdkBuilder.idMappingTechniques(idMappingTechniques.let(IdMappingTechniquesProperty::unwrap))
    }

    /**
     * An object which defines the `idMappingType` and the `providerProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-idmappingtechniques)
     * @param idMappingTechniques An object which defines the `idMappingType` and the
     * `providerProperties` . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.inputSourceConfig(inputSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-idmappingworkflow.html#cfn-entityresolution-idmappingworkflow-inputsourceconfig)
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(inputSourceConfig: List<Any>) {
      cdkBuilder.inputSourceConfig(inputSourceConfig)
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
      cdkBuilder.outputSourceConfig(outputSourceConfig.let(IResolvable::unwrap))
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
      cdkBuilder.outputSourceConfig(outputSourceConfig)
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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
        software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow = wrapped.cdkObject
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty,
    ) : CdkObject(cdkObject), IdMappingWorkflowOutputSourceProperty {
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
          IdMappingWorkflowOutputSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingWorkflowOutputSourceProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowOutputSourceProperty
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99e7e4a7a6322b76ecdd8c18747c700ce11a2af0f1fbf4624e4560278e5486a8")
      public
          fun providerProperties(providerProperties: ProviderPropertiesProperty.Builder.() -> Unit)
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
        cdkBuilder.providerProperties(providerProperties.let(IResolvable::unwrap))
      }

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      override fun providerProperties(providerProperties: ProviderPropertiesProperty) {
        cdkBuilder.providerProperties(providerProperties.let(ProviderPropertiesProperty::unwrap))
      }

      /**
       * @param providerProperties An object which defines any additional configurations required by
       * the provider service.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("99e7e4a7a6322b76ecdd8c18747c700ce11a2af0f1fbf4624e4560278e5486a8")
      override
          fun providerProperties(providerProperties: ProviderPropertiesProperty.Builder.() -> Unit):
          Unit = providerProperties(ProviderPropertiesProperty(providerProperties))

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty,
    ) : CdkObject(cdkObject), IdMappingTechniquesProperty {
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
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IdMappingTechniquesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty):
          IdMappingTechniquesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingTechniquesProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingTechniquesProperty
    }
  }

  public interface IdMappingWorkflowInputSourceProperty {
    /**
     * An AWS Glue table ARN for the input source table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowinputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowinputsource-inputsourcearn)
     */
    public fun inputSourceArn(): String

    /**
     * The ARN (Amazon Resource Name) that AWS Entity Resolution generated for the `SchemaMapping` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-idmappingworkflow-idmappingworkflowinputsource.html#cfn-entityresolution-idmappingworkflow-idmappingworkflowinputsource-schemaarn)
     */
    public fun schemaArn(): String

    /**
     * A builder for [IdMappingWorkflowInputSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputSourceArn An AWS Glue table ARN for the input source table. 
       */
      public fun inputSourceArn(inputSourceArn: String)

      /**
       * @param schemaArn The ARN (Amazon Resource Name) that AWS Entity Resolution generated for
       * the `SchemaMapping` . 
       */
      public fun schemaArn(schemaArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty.Builder
          =
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty.builder()

      /**
       * @param inputSourceArn An AWS Glue table ARN for the input source table. 
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

      public fun build():
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty,
    ) : CdkObject(cdkObject), IdMappingWorkflowInputSourceProperty {
      /**
       * An AWS Glue table ARN for the input source table.
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
      override fun schemaArn(): String = unwrap(this).getSchemaArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IdMappingWorkflowInputSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty):
          IdMappingWorkflowInputSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdMappingWorkflowInputSourceProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IdMappingWorkflowInputSourceProperty
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty,
    ) : CdkObject(cdkObject), ProviderPropertiesProperty {
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
          ProviderPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProviderPropertiesProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.ProviderPropertiesProperty
    }
  }

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
      override val cdkObject:
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty,
    ) : CdkObject(cdkObject), IntermediateSourceConfigurationProperty {
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
          IntermediateSourceConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntermediateSourceConfigurationProperty):
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.entityresolution.CfnIdMappingWorkflow.IntermediateSourceConfigurationProperty
    }
  }
}
