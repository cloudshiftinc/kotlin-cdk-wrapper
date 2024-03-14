package io.cloudshiftdev.awscdk.services.entityresolution

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnMatchingWorkflowProps {
  /**
   * A description of the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-inputsourceconfig)
   */
  public fun inputSourceConfig(): Any

  /**
   * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
   * `ApplyNormalization` , and `Output` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-outputsourceconfig)
   */
  public fun outputSourceConfig(): Any

  /**
   * An object which defines the `resolutionType` and the `ruleBasedProperties` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-resolutiontechniques)
   */
  public fun resolutionTechniques(): Any

  /**
   * The Amazon Resource Name (ARN) of the IAM role.
   *
   * AWS Entity Resolution assumes this role to create resources on your behalf as part of workflow
   * execution.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-rolearn)
   */
  public fun roleArn(): String

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the workflow.
   *
   * There can't be multiple `MatchingWorkflows` with the same name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-workflowname)
   */
  public fun workflowName(): String

  /**
   * A builder for [CfnMatchingWorkflowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the workflow.
     */
    public fun description(description: String)

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
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    public fun outputSourceConfig(outputSourceConfig: IResolvable)

    /**
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    public fun outputSourceConfig(outputSourceConfig: List<Any>)

    /**
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    public fun outputSourceConfig(vararg outputSourceConfig: Any)

    /**
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    public fun resolutionTechniques(resolutionTechniques: IResolvable)

    /**
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    public
        fun resolutionTechniques(resolutionTechniques: CfnMatchingWorkflow.ResolutionTechniquesProperty)

    /**
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e071d33f91722e35f7dc5d6da1e687f2a8d111ae39fd32dbde258193ce07e998")
    public
        fun resolutionTechniques(resolutionTechniques: CfnMatchingWorkflow.ResolutionTechniquesProperty.Builder.() -> Unit)

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
     * There can't be multiple `MatchingWorkflows` with the same name.
     */
    public fun workflowName(workflowName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps.Builder =
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps.builder()

    /**
     * @param description A description of the workflow.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(inputSourceConfig: IResolvable) {
      cdkBuilder.inputSourceConfig(inputSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(inputSourceConfig: List<Any>) {
      cdkBuilder.inputSourceConfig(inputSourceConfig)
    }

    /**
     * @param inputSourceConfig A list of `InputSource` objects, which have the fields
     * `InputSourceARN` and `SchemaName` . 
     */
    override fun inputSourceConfig(vararg inputSourceConfig: Any): Unit =
        inputSourceConfig(inputSourceConfig.toList())

    /**
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    override fun outputSourceConfig(outputSourceConfig: IResolvable) {
      cdkBuilder.outputSourceConfig(outputSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    override fun outputSourceConfig(outputSourceConfig: List<Any>) {
      cdkBuilder.outputSourceConfig(outputSourceConfig)
    }

    /**
     * @param outputSourceConfig A list of `OutputSource` objects, each of which contains fields
     * `OutputS3Path` , `ApplyNormalization` , and `Output` . 
     */
    override fun outputSourceConfig(vararg outputSourceConfig: Any): Unit =
        outputSourceConfig(outputSourceConfig.toList())

    /**
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    override fun resolutionTechniques(resolutionTechniques: IResolvable) {
      cdkBuilder.resolutionTechniques(resolutionTechniques.let(IResolvable::unwrap))
    }

    /**
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    override
        fun resolutionTechniques(resolutionTechniques: CfnMatchingWorkflow.ResolutionTechniquesProperty) {
      cdkBuilder.resolutionTechniques(resolutionTechniques.let(CfnMatchingWorkflow.ResolutionTechniquesProperty::unwrap))
    }

    /**
     * @param resolutionTechniques An object which defines the `resolutionType` and the
     * `ruleBasedProperties` . 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e071d33f91722e35f7dc5d6da1e687f2a8d111ae39fd32dbde258193ce07e998")
    override
        fun resolutionTechniques(resolutionTechniques: CfnMatchingWorkflow.ResolutionTechniquesProperty.Builder.() -> Unit):
        Unit =
        resolutionTechniques(CfnMatchingWorkflow.ResolutionTechniquesProperty(resolutionTechniques))

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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param workflowName The name of the workflow. 
     * There can't be multiple `MatchingWorkflows` with the same name.
     */
    override fun workflowName(workflowName: String) {
      cdkBuilder.workflowName(workflowName)
    }

    public fun build(): software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps,
  ) : CdkObject(cdkObject), CfnMatchingWorkflowProps {
    /**
     * A description of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A list of `InputSource` objects, which have the fields `InputSourceARN` and `SchemaName` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-inputsourceconfig)
     */
    override fun inputSourceConfig(): Any = unwrap(this).getInputSourceConfig()

    /**
     * A list of `OutputSource` objects, each of which contains fields `OutputS3Path` ,
     * `ApplyNormalization` , and `Output` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-outputsourceconfig)
     */
    override fun outputSourceConfig(): Any = unwrap(this).getOutputSourceConfig()

    /**
     * An object which defines the `resolutionType` and the `ruleBasedProperties` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-resolutiontechniques)
     */
    override fun resolutionTechniques(): Any = unwrap(this).getResolutionTechniques()

    /**
     * The Amazon Resource Name (ARN) of the IAM role.
     *
     * AWS Entity Resolution assumes this role to create resources on your behalf as part of
     * workflow execution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the workflow.
     *
     * There can't be multiple `MatchingWorkflows` with the same name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-entityresolution-matchingworkflow.html#cfn-entityresolution-matchingworkflow-workflowname)
     */
    override fun workflowName(): String = unwrap(this).getWorkflowName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMatchingWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps):
        CfnMatchingWorkflowProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMatchingWorkflowProps):
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflowProps
  }
}
