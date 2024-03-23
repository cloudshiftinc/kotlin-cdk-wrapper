@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnWorkflow`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.transfer.*;
 * Object copyStepDetails;
 * Object customStepDetails;
 * Object deleteStepDetails;
 * Object tagStepDetails;
 * CfnWorkflowProps cfnWorkflowProps = CfnWorkflowProps.builder()
 * .steps(List.of(WorkflowStepProperty.builder()
 * .copyStepDetails(copyStepDetails)
 * .customStepDetails(customStepDetails)
 * .decryptStepDetails(DecryptStepDetailsProperty.builder()
 * .destinationFileLocation(InputFileLocationProperty.builder()
 * .efsFileLocation(EfsInputFileLocationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .path("path")
 * .build())
 * .s3FileLocation(S3InputFileLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .build())
 * .name("name")
 * .overwriteExisting("overwriteExisting")
 * .sourceFileLocation("sourceFileLocation")
 * .type("type")
 * .build())
 * .deleteStepDetails(deleteStepDetails)
 * .tagStepDetails(tagStepDetails)
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .onExceptionSteps(List.of(WorkflowStepProperty.builder()
 * .copyStepDetails(copyStepDetails)
 * .customStepDetails(customStepDetails)
 * .decryptStepDetails(DecryptStepDetailsProperty.builder()
 * .destinationFileLocation(InputFileLocationProperty.builder()
 * .efsFileLocation(EfsInputFileLocationProperty.builder()
 * .fileSystemId("fileSystemId")
 * .path("path")
 * .build())
 * .s3FileLocation(S3InputFileLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .build())
 * .build())
 * .name("name")
 * .overwriteExisting("overwriteExisting")
 * .sourceFileLocation("sourceFileLocation")
 * .type("type")
 * .build())
 * .deleteStepDetails(deleteStepDetails)
 * .tagStepDetails(tagStepDetails)
 * .type("type")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html)
 */
public interface CfnWorkflowProps {
  /**
   * Specifies the text description for the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies the steps (actions) to take if errors are encountered during execution of the
   * workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-onexceptionsteps)
   */
  public fun onExceptionSteps(): Any? = unwrap(this).getOnExceptionSteps()

  /**
   * Specifies the details for the steps that are in the specified workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-steps)
   */
  public fun steps(): Any

  /**
   * Key-value pairs that can be used to group and search for workflows.
   *
   * Tags are metadata attached to workflows for any purpose.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnWorkflowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Specifies the text description for the workflow.
     */
    public fun description(description: String)

    /**
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow.
     */
    public fun onExceptionSteps(onExceptionSteps: IResolvable)

    /**
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow.
     */
    public fun onExceptionSteps(onExceptionSteps: List<Any>)

    /**
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow.
     */
    public fun onExceptionSteps(vararg onExceptionSteps: Any)

    /**
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    public fun steps(steps: IResolvable)

    /**
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    public fun steps(steps: List<Any>)

    /**
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    public fun steps(vararg steps: Any)

    /**
     * @param tags Key-value pairs that can be used to group and search for workflows.
     * Tags are metadata attached to workflows for any purpose.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key-value pairs that can be used to group and search for workflows.
     * Tags are metadata attached to workflows for any purpose.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnWorkflowProps.Builder =
        software.amazon.awscdk.services.transfer.CfnWorkflowProps.builder()

    /**
     * @param description Specifies the text description for the workflow.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow.
     */
    override fun onExceptionSteps(onExceptionSteps: IResolvable) {
      cdkBuilder.onExceptionSteps(onExceptionSteps.let(IResolvable::unwrap))
    }

    /**
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow.
     */
    override fun onExceptionSteps(onExceptionSteps: List<Any>) {
      cdkBuilder.onExceptionSteps(onExceptionSteps)
    }

    /**
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow.
     */
    override fun onExceptionSteps(vararg onExceptionSteps: Any): Unit =
        onExceptionSteps(onExceptionSteps.toList())

    /**
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable::unwrap))
    }

    /**
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps)
    }

    /**
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    override fun steps(vararg steps: Any): Unit = steps(steps.toList())

    /**
     * @param tags Key-value pairs that can be used to group and search for workflows.
     * Tags are metadata attached to workflows for any purpose.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Key-value pairs that can be used to group and search for workflows.
     * Tags are metadata attached to workflows for any purpose.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.transfer.CfnWorkflowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflowProps,
  ) : CdkObject(cdkObject), CfnWorkflowProps {
    /**
     * Specifies the text description for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies the steps (actions) to take if errors are encountered during execution of the
     * workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-onexceptionsteps)
     */
    override fun onExceptionSteps(): Any? = unwrap(this).getOnExceptionSteps()

    /**
     * Specifies the details for the steps that are in the specified workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-steps)
     */
    override fun steps(): Any = unwrap(this).getSteps()

    /**
     * Key-value pairs that can be used to group and search for workflows.
     *
     * Tags are metadata attached to workflows for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflowProps):
        CfnWorkflowProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkflowProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflowProps):
        software.amazon.awscdk.services.transfer.CfnWorkflowProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.transfer.CfnWorkflowProps
  }
}
