@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Allows you to create a workflow with specified steps and step details the workflow invokes after
 * file transfer completes.
 *
 * After creating a workflow, you can associate the workflow created with any transfer servers by
 * specifying the `workflow-details` field in `CreateServer` and `UpdateServer` operations.
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
 * CfnWorkflow cfnWorkflow = CfnWorkflow.Builder.create(this, "MyCfnWorkflow")
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
public open class CfnWorkflow(
  cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkflowProps,
  ) :
      this(software.amazon.awscdk.services.transfer.CfnWorkflow(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnWorkflowProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnWorkflowProps.Builder.() -> Unit,
  ) : this(scope, id, CfnWorkflowProps(props)
  )

  /**
   * Specifies the unique Amazon Resource Name (ARN) for the workflow.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * A unique identifier for a workflow.
   */
  public open fun attrWorkflowId(): String = unwrap(this).getAttrWorkflowId()

  /**
   * Specifies the text description for the workflow.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies the text description for the workflow.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the steps (actions) to take if errors are encountered during execution of the
   * workflow.
   */
  public open fun onExceptionSteps(): Any? = unwrap(this).getOnExceptionSteps()

  /**
   * Specifies the steps (actions) to take if errors are encountered during execution of the
   * workflow.
   */
  public open fun onExceptionSteps(`value`: IResolvable) {
    unwrap(this).setOnExceptionSteps(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the steps (actions) to take if errors are encountered during execution of the
   * workflow.
   */
  public open fun onExceptionSteps(`value`: List<Any>) {
    unwrap(this).setOnExceptionSteps(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies the steps (actions) to take if errors are encountered during execution of the
   * workflow.
   */
  public open fun onExceptionSteps(vararg `value`: Any): Unit = onExceptionSteps(`value`.toList())

  /**
   * Specifies the details for the steps that are in the specified workflow.
   */
  public open fun steps(): Any = unwrap(this).getSteps()

  /**
   * Specifies the details for the steps that are in the specified workflow.
   */
  public open fun steps(`value`: IResolvable) {
    unwrap(this).setSteps(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the details for the steps that are in the specified workflow.
   */
  public open fun steps(`value`: List<Any>) {
    unwrap(this).setSteps(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Specifies the details for the steps that are in the specified workflow.
   */
  public open fun steps(vararg `value`: Any): Unit = steps(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Key-value pairs that can be used to group and search for workflows.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Key-value pairs that can be used to group and search for workflows.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Key-value pairs that can be used to group and search for workflows.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.transfer.CfnWorkflow].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the text description for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-description)
     * @param description Specifies the text description for the workflow. 
     */
    public fun description(description: String)

    /**
     * Specifies the steps (actions) to take if errors are encountered during execution of the
     * workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-onexceptionsteps)
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow. 
     */
    public fun onExceptionSteps(onExceptionSteps: IResolvable)

    /**
     * Specifies the steps (actions) to take if errors are encountered during execution of the
     * workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-onexceptionsteps)
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow. 
     */
    public fun onExceptionSteps(onExceptionSteps: List<Any>)

    /**
     * Specifies the steps (actions) to take if errors are encountered during execution of the
     * workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-onexceptionsteps)
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow. 
     */
    public fun onExceptionSteps(vararg onExceptionSteps: Any)

    /**
     * Specifies the details for the steps that are in the specified workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-steps)
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    public fun steps(steps: IResolvable)

    /**
     * Specifies the details for the steps that are in the specified workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-steps)
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    public fun steps(steps: List<Any>)

    /**
     * Specifies the details for the steps that are in the specified workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-steps)
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    public fun steps(vararg steps: Any)

    /**
     * Key-value pairs that can be used to group and search for workflows.
     *
     * Tags are metadata attached to workflows for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-tags)
     * @param tags Key-value pairs that can be used to group and search for workflows. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key-value pairs that can be used to group and search for workflows.
     *
     * Tags are metadata attached to workflows for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-tags)
     * @param tags Key-value pairs that can be used to group and search for workflows. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnWorkflow.Builder =
        software.amazon.awscdk.services.transfer.CfnWorkflow.Builder.create(scope, id)

    /**
     * Specifies the text description for the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-description)
     * @param description Specifies the text description for the workflow. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies the steps (actions) to take if errors are encountered during execution of the
     * workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-onexceptionsteps)
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow. 
     */
    override fun onExceptionSteps(onExceptionSteps: IResolvable) {
      cdkBuilder.onExceptionSteps(onExceptionSteps.let(IResolvable::unwrap))
    }

    /**
     * Specifies the steps (actions) to take if errors are encountered during execution of the
     * workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-onexceptionsteps)
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow. 
     */
    override fun onExceptionSteps(onExceptionSteps: List<Any>) {
      cdkBuilder.onExceptionSteps(onExceptionSteps.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Specifies the steps (actions) to take if errors are encountered during execution of the
     * workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-onexceptionsteps)
     * @param onExceptionSteps Specifies the steps (actions) to take if errors are encountered
     * during execution of the workflow. 
     */
    override fun onExceptionSteps(vararg onExceptionSteps: Any): Unit =
        onExceptionSteps(onExceptionSteps.toList())

    /**
     * Specifies the details for the steps that are in the specified workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-steps)
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable::unwrap))
    }

    /**
     * Specifies the details for the steps that are in the specified workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-steps)
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Specifies the details for the steps that are in the specified workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-steps)
     * @param steps Specifies the details for the steps that are in the specified workflow. 
     */
    override fun steps(vararg steps: Any): Unit = steps(steps.toList())

    /**
     * Key-value pairs that can be used to group and search for workflows.
     *
     * Tags are metadata attached to workflows for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-tags)
     * @param tags Key-value pairs that can be used to group and search for workflows. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Key-value pairs that can be used to group and search for workflows.
     *
     * Tags are metadata attached to workflows for any purpose.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-transfer-workflow.html#cfn-transfer-workflow-tags)
     * @param tags Key-value pairs that can be used to group and search for workflows. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.transfer.CfnWorkflow = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.transfer.CfnWorkflow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkflow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkflow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow): CfnWorkflow
        = CfnWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflow): software.amazon.awscdk.services.transfer.CfnWorkflow
        = wrapped.cdkObject as software.amazon.awscdk.services.transfer.CfnWorkflow
  }

  /**
   * Details for a step that performs a file copy.
   *
   * Consists of the following values:
   *
   * * A description
   * * An Amazon S3 location for the destination of the file copy.
   * * A flag that indicates whether to overwrite an existing file of the same name. The default is
   * `FALSE` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * CopyStepDetailsProperty copyStepDetailsProperty = CopyStepDetailsProperty.builder()
   * .destinationFileLocation(S3FileLocationProperty.builder()
   * .s3FileLocation(S3InputFileLocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .build())
   * .build())
   * .name("name")
   * .overwriteExisting("overwriteExisting")
   * .sourceFileLocation("sourceFileLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-copystepdetails.html)
   */
  public interface CopyStepDetailsProperty {
    /**
     * Specifies the location for the file being copied.
     *
     * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
     * destination prefix by username or uploaded date.
     *
     * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to copy uploaded files
     * to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that uploaded
     * the file.
     * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to copy uploaded
     * files to an Amazon S3 bucket that is prefixed with the date of the upload.
     *
     *
     * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
     * file is uploaded in UTC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-copystepdetails.html#cfn-transfer-workflow-copystepdetails-destinationfilelocation)
     */
    public fun destinationFileLocation(): Any? = unwrap(this).getDestinationFileLocation()

    /**
     * The name of the step, used as an identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-copystepdetails.html#cfn-transfer-workflow-copystepdetails-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A flag that indicates whether to overwrite an existing file of the same name. The default is
     * `FALSE` .
     *
     * If the workflow is processing a file that has the same name as an existing file, the behavior
     * is as follows:
     *
     * * If `OverwriteExisting` is `TRUE` , the existing file is replaced with the file being
     * processed.
     * * If `OverwriteExisting` is `FALSE` , nothing happens, and the workflow processing stops.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-copystepdetails.html#cfn-transfer-workflow-copystepdetails-overwriteexisting)
     */
    public fun overwriteExisting(): String? = unwrap(this).getOverwriteExisting()

    /**
     * Specifies which file to use as input to the workflow step: either the output from the
     * previous step, or the originally uploaded file for the workflow.
     *
     * * To use the previous file as the input, enter `${previous.file}` . In this case, this
     * workflow step uses the output file from the previous workflow step as input. This is the default
     * value.
     * * To use the originally uploaded file location as input for this step, enter
     * `${original.file}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-copystepdetails.html#cfn-transfer-workflow-copystepdetails-sourcefilelocation)
     */
    public fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

    /**
     * A builder for [CopyStepDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationFileLocation Specifies the location for the file being copied.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      public fun destinationFileLocation(destinationFileLocation: IResolvable)

      /**
       * @param destinationFileLocation Specifies the location for the file being copied.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      public fun destinationFileLocation(destinationFileLocation: S3FileLocationProperty)

      /**
       * @param destinationFileLocation Specifies the location for the file being copied.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7cd6d54a8f85b9454d405adbac4c046f5d96acab55ffa21a0dd2794316ff0b22")
      public
          fun destinationFileLocation(destinationFileLocation: S3FileLocationProperty.Builder.() -> Unit)

      /**
       * @param name The name of the step, used as an identifier.
       */
      public fun name(name: String)

      /**
       * @param overwriteExisting A flag that indicates whether to overwrite an existing file of the
       * same name. The default is `FALSE` .
       * If the workflow is processing a file that has the same name as an existing file, the
       * behavior is as follows:
       *
       * * If `OverwriteExisting` is `TRUE` , the existing file is replaced with the file being
       * processed.
       * * If `OverwriteExisting` is `FALSE` , nothing happens, and the workflow processing stops.
       */
      public fun overwriteExisting(overwriteExisting: String)

      /**
       * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
       * the output from the previous step, or the originally uploaded file for the workflow.
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       */
      public fun sourceFileLocation(sourceFileLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty.builder()

      /**
       * @param destinationFileLocation Specifies the location for the file being copied.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      override fun destinationFileLocation(destinationFileLocation: IResolvable) {
        cdkBuilder.destinationFileLocation(destinationFileLocation.let(IResolvable::unwrap))
      }

      /**
       * @param destinationFileLocation Specifies the location for the file being copied.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      override fun destinationFileLocation(destinationFileLocation: S3FileLocationProperty) {
        cdkBuilder.destinationFileLocation(destinationFileLocation.let(S3FileLocationProperty::unwrap))
      }

      /**
       * @param destinationFileLocation Specifies the location for the file being copied.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7cd6d54a8f85b9454d405adbac4c046f5d96acab55ffa21a0dd2794316ff0b22")
      override
          fun destinationFileLocation(destinationFileLocation: S3FileLocationProperty.Builder.() -> Unit):
          Unit = destinationFileLocation(S3FileLocationProperty(destinationFileLocation))

      /**
       * @param name The name of the step, used as an identifier.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param overwriteExisting A flag that indicates whether to overwrite an existing file of the
       * same name. The default is `FALSE` .
       * If the workflow is processing a file that has the same name as an existing file, the
       * behavior is as follows:
       *
       * * If `OverwriteExisting` is `TRUE` , the existing file is replaced with the file being
       * processed.
       * * If `OverwriteExisting` is `FALSE` , nothing happens, and the workflow processing stops.
       */
      override fun overwriteExisting(overwriteExisting: String) {
        cdkBuilder.overwriteExisting(overwriteExisting)
      }

      /**
       * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
       * the output from the previous step, or the originally uploaded file for the workflow.
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       */
      override fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty,
    ) : CdkObject(cdkObject), CopyStepDetailsProperty {
      /**
       * Specifies the location for the file being copied.
       *
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to copy uploaded
       * files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-copystepdetails.html#cfn-transfer-workflow-copystepdetails-destinationfilelocation)
       */
      override fun destinationFileLocation(): Any? = unwrap(this).getDestinationFileLocation()

      /**
       * The name of the step, used as an identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-copystepdetails.html#cfn-transfer-workflow-copystepdetails-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       *
       * If the workflow is processing a file that has the same name as an existing file, the
       * behavior is as follows:
       *
       * * If `OverwriteExisting` is `TRUE` , the existing file is replaced with the file being
       * processed.
       * * If `OverwriteExisting` is `FALSE` , nothing happens, and the workflow processing stops.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-copystepdetails.html#cfn-transfer-workflow-copystepdetails-overwriteexisting)
       */
      override fun overwriteExisting(): String? = unwrap(this).getOverwriteExisting()

      /**
       * Specifies which file to use as input to the workflow step: either the output from the
       * previous step, or the originally uploaded file for the workflow.
       *
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-copystepdetails.html#cfn-transfer-workflow-copystepdetails-sourcefilelocation)
       */
      override fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CopyStepDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty):
          CopyStepDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as? CopyStepDetailsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CopyStepDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWorkflow.CopyStepDetailsProperty
    }
  }

  /**
   * Details for a step that invokes an AWS Lambda function.
   *
   * Consists of the Lambda function's name, target, and timeout (in seconds).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * CustomStepDetailsProperty customStepDetailsProperty = CustomStepDetailsProperty.builder()
   * .name("name")
   * .sourceFileLocation("sourceFileLocation")
   * .target("target")
   * .timeoutSeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-customstepdetails.html)
   */
  public interface CustomStepDetailsProperty {
    /**
     * The name of the step, used as an identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-customstepdetails.html#cfn-transfer-workflow-customstepdetails-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * Specifies which file to use as input to the workflow step: either the output from the
     * previous step, or the originally uploaded file for the workflow.
     *
     * * To use the previous file as the input, enter `${previous.file}` . In this case, this
     * workflow step uses the output file from the previous workflow step as input. This is the default
     * value.
     * * To use the originally uploaded file location as input for this step, enter
     * `${original.file}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-customstepdetails.html#cfn-transfer-workflow-customstepdetails-sourcefilelocation)
     */
    public fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

    /**
     * The ARN for the Lambda function that is being called.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-customstepdetails.html#cfn-transfer-workflow-customstepdetails-target)
     */
    public fun target(): String? = unwrap(this).getTarget()

    /**
     * Timeout, in seconds, for the step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-customstepdetails.html#cfn-transfer-workflow-customstepdetails-timeoutseconds)
     */
    public fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()

    /**
     * A builder for [CustomStepDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the step, used as an identifier.
       */
      public fun name(name: String)

      /**
       * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
       * the output from the previous step, or the originally uploaded file for the workflow.
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       */
      public fun sourceFileLocation(sourceFileLocation: String)

      /**
       * @param target The ARN for the Lambda function that is being called.
       */
      public fun target(target: String)

      /**
       * @param timeoutSeconds Timeout, in seconds, for the step.
       */
      public fun timeoutSeconds(timeoutSeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty.builder()

      /**
       * @param name The name of the step, used as an identifier.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
       * the output from the previous step, or the originally uploaded file for the workflow.
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       */
      override fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
      }

      /**
       * @param target The ARN for the Lambda function that is being called.
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      /**
       * @param timeoutSeconds Timeout, in seconds, for the step.
       */
      override fun timeoutSeconds(timeoutSeconds: Number) {
        cdkBuilder.timeoutSeconds(timeoutSeconds)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty,
    ) : CdkObject(cdkObject), CustomStepDetailsProperty {
      /**
       * The name of the step, used as an identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-customstepdetails.html#cfn-transfer-workflow-customstepdetails-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * Specifies which file to use as input to the workflow step: either the output from the
       * previous step, or the originally uploaded file for the workflow.
       *
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-customstepdetails.html#cfn-transfer-workflow-customstepdetails-sourcefilelocation)
       */
      override fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

      /**
       * The ARN for the Lambda function that is being called.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-customstepdetails.html#cfn-transfer-workflow-customstepdetails-target)
       */
      override fun target(): String? = unwrap(this).getTarget()

      /**
       * Timeout, in seconds, for the step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-customstepdetails.html#cfn-transfer-workflow-customstepdetails-timeoutseconds)
       */
      override fun timeoutSeconds(): Number? = unwrap(this).getTimeoutSeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CustomStepDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty):
          CustomStepDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomStepDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomStepDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWorkflow.CustomStepDetailsProperty
    }
  }

  /**
   * Details for a step that decrypts an encrypted file.
   *
   * Consists of the following values:
   *
   * * A descriptive name
   * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
   * decrypt.
   * * An S3 or Amazon EFS location for the destination of the file decryption.
   * * A flag that indicates whether to overwrite an existing file of the same name. The default is
   * `FALSE` .
   * * The type of encryption that's used. Currently, only PGP encryption is supported.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * DecryptStepDetailsProperty decryptStepDetailsProperty = DecryptStepDetailsProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html)
   */
  public interface DecryptStepDetailsProperty {
    /**
     * Specifies the location for the file being decrypted.
     *
     * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
     * destination prefix by username or uploaded date.
     *
     * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to decrypt uploaded
     * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
     * uploaded the file.
     * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to decrypt uploaded
     * files to an Amazon S3 bucket that is prefixed with the date of the upload.
     *
     *
     * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
     * file is uploaded in UTC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html#cfn-transfer-workflow-decryptstepdetails-destinationfilelocation)
     */
    public fun destinationFileLocation(): Any? = unwrap(this).getDestinationFileLocation()

    /**
     * The name of the step, used as an identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html#cfn-transfer-workflow-decryptstepdetails-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A flag that indicates whether to overwrite an existing file of the same name. The default is
     * `FALSE` .
     *
     * If the workflow is processing a file that has the same name as an existing file, the behavior
     * is as follows:
     *
     * * If `OverwriteExisting` is `TRUE` , the existing file is replaced with the file being
     * processed.
     * * If `OverwriteExisting` is `FALSE` , nothing happens, and the workflow processing stops.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html#cfn-transfer-workflow-decryptstepdetails-overwriteexisting)
     */
    public fun overwriteExisting(): String? = unwrap(this).getOverwriteExisting()

    /**
     * Specifies which file to use as input to the workflow step: either the output from the
     * previous step, or the originally uploaded file for the workflow.
     *
     * * To use the previous file as the input, enter `${previous.file}` . In this case, this
     * workflow step uses the output file from the previous workflow step as input. This is the default
     * value.
     * * To use the originally uploaded file location as input for this step, enter
     * `${original.file}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html#cfn-transfer-workflow-decryptstepdetails-sourcefilelocation)
     */
    public fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

    /**
     * The type of encryption used.
     *
     * Currently, this value must be `PGP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html#cfn-transfer-workflow-decryptstepdetails-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [DecryptStepDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationFileLocation Specifies the location for the file being decrypted.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to decrypt uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to decrypt
       * uploaded files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      public fun destinationFileLocation(destinationFileLocation: IResolvable)

      /**
       * @param destinationFileLocation Specifies the location for the file being decrypted.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to decrypt uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to decrypt
       * uploaded files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      public fun destinationFileLocation(destinationFileLocation: InputFileLocationProperty)

      /**
       * @param destinationFileLocation Specifies the location for the file being decrypted.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to decrypt uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to decrypt
       * uploaded files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d206b1fd4837a7686be621f37592cc66f513ac0d25d20a550e090b4817ddba")
      public
          fun destinationFileLocation(destinationFileLocation: InputFileLocationProperty.Builder.() -> Unit)

      /**
       * @param name The name of the step, used as an identifier.
       */
      public fun name(name: String)

      /**
       * @param overwriteExisting A flag that indicates whether to overwrite an existing file of the
       * same name. The default is `FALSE` .
       * If the workflow is processing a file that has the same name as an existing file, the
       * behavior is as follows:
       *
       * * If `OverwriteExisting` is `TRUE` , the existing file is replaced with the file being
       * processed.
       * * If `OverwriteExisting` is `FALSE` , nothing happens, and the workflow processing stops.
       */
      public fun overwriteExisting(overwriteExisting: String)

      /**
       * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
       * the output from the previous step, or the originally uploaded file for the workflow.
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       */
      public fun sourceFileLocation(sourceFileLocation: String)

      /**
       * @param type The type of encryption used.
       * Currently, this value must be `PGP` .
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty.builder()

      /**
       * @param destinationFileLocation Specifies the location for the file being decrypted.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to decrypt uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to decrypt
       * uploaded files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      override fun destinationFileLocation(destinationFileLocation: IResolvable) {
        cdkBuilder.destinationFileLocation(destinationFileLocation.let(IResolvable::unwrap))
      }

      /**
       * @param destinationFileLocation Specifies the location for the file being decrypted.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to decrypt uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to decrypt
       * uploaded files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      override fun destinationFileLocation(destinationFileLocation: InputFileLocationProperty) {
        cdkBuilder.destinationFileLocation(destinationFileLocation.let(InputFileLocationProperty::unwrap))
      }

      /**
       * @param destinationFileLocation Specifies the location for the file being decrypted.
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to decrypt uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to decrypt
       * uploaded files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("28d206b1fd4837a7686be621f37592cc66f513ac0d25d20a550e090b4817ddba")
      override
          fun destinationFileLocation(destinationFileLocation: InputFileLocationProperty.Builder.() -> Unit):
          Unit = destinationFileLocation(InputFileLocationProperty(destinationFileLocation))

      /**
       * @param name The name of the step, used as an identifier.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param overwriteExisting A flag that indicates whether to overwrite an existing file of the
       * same name. The default is `FALSE` .
       * If the workflow is processing a file that has the same name as an existing file, the
       * behavior is as follows:
       *
       * * If `OverwriteExisting` is `TRUE` , the existing file is replaced with the file being
       * processed.
       * * If `OverwriteExisting` is `FALSE` , nothing happens, and the workflow processing stops.
       */
      override fun overwriteExisting(overwriteExisting: String) {
        cdkBuilder.overwriteExisting(overwriteExisting)
      }

      /**
       * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
       * the output from the previous step, or the originally uploaded file for the workflow.
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       */
      override fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
      }

      /**
       * @param type The type of encryption used.
       * Currently, this value must be `PGP` .
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty,
    ) : CdkObject(cdkObject), DecryptStepDetailsProperty {
      /**
       * Specifies the location for the file being decrypted.
       *
       * Use `${Transfer:UserName}` or `${Transfer:UploadDate}` in this field to parametrize the
       * destination prefix by username or uploaded date.
       *
       * * Set the value of `DestinationFileLocation` to `${Transfer:UserName}` to decrypt uploaded
       * files to an Amazon S3 bucket that is prefixed with the name of the Transfer Family user that
       * uploaded the file.
       * * Set the value of `DestinationFileLocation` to `${Transfer:UploadDate}` to decrypt
       * uploaded files to an Amazon S3 bucket that is prefixed with the date of the upload.
       *
       *
       * The system resolves `UploadDate` to a date format of *YYYY-MM-DD* , based on the date the
       * file is uploaded in UTC.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html#cfn-transfer-workflow-decryptstepdetails-destinationfilelocation)
       */
      override fun destinationFileLocation(): Any? = unwrap(this).getDestinationFileLocation()

      /**
       * The name of the step, used as an identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html#cfn-transfer-workflow-decryptstepdetails-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       *
       * If the workflow is processing a file that has the same name as an existing file, the
       * behavior is as follows:
       *
       * * If `OverwriteExisting` is `TRUE` , the existing file is replaced with the file being
       * processed.
       * * If `OverwriteExisting` is `FALSE` , nothing happens, and the workflow processing stops.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html#cfn-transfer-workflow-decryptstepdetails-overwriteexisting)
       */
      override fun overwriteExisting(): String? = unwrap(this).getOverwriteExisting()

      /**
       * Specifies which file to use as input to the workflow step: either the output from the
       * previous step, or the originally uploaded file for the workflow.
       *
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html#cfn-transfer-workflow-decryptstepdetails-sourcefilelocation)
       */
      override fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

      /**
       * The type of encryption used.
       *
       * Currently, this value must be `PGP` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-decryptstepdetails.html#cfn-transfer-workflow-decryptstepdetails-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DecryptStepDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty):
          DecryptStepDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DecryptStepDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DecryptStepDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWorkflow.DecryptStepDetailsProperty
    }
  }

  /**
   * An object that contains the name and file location for a file being deleted by a workflow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * DeleteStepDetailsProperty deleteStepDetailsProperty = DeleteStepDetailsProperty.builder()
   * .name("name")
   * .sourceFileLocation("sourceFileLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-deletestepdetails.html)
   */
  public interface DeleteStepDetailsProperty {
    /**
     * The name of the step, used as an identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-deletestepdetails.html#cfn-transfer-workflow-deletestepdetails-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * Specifies which file to use as input to the workflow step: either the output from the
     * previous step, or the originally uploaded file for the workflow.
     *
     * * To use the previous file as the input, enter `${previous.file}` . In this case, this
     * workflow step uses the output file from the previous workflow step as input. This is the default
     * value.
     * * To use the originally uploaded file location as input for this step, enter
     * `${original.file}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-deletestepdetails.html#cfn-transfer-workflow-deletestepdetails-sourcefilelocation)
     */
    public fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

    /**
     * A builder for [DeleteStepDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the step, used as an identifier.
       */
      public fun name(name: String)

      /**
       * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
       * the output from the previous step, or the originally uploaded file for the workflow.
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       */
      public fun sourceFileLocation(sourceFileLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty.builder()

      /**
       * @param name The name of the step, used as an identifier.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
       * the output from the previous step, or the originally uploaded file for the workflow.
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       */
      override fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty,
    ) : CdkObject(cdkObject), DeleteStepDetailsProperty {
      /**
       * The name of the step, used as an identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-deletestepdetails.html#cfn-transfer-workflow-deletestepdetails-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * Specifies which file to use as input to the workflow step: either the output from the
       * previous step, or the originally uploaded file for the workflow.
       *
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-deletestepdetails.html#cfn-transfer-workflow-deletestepdetails-sourcefilelocation)
       */
      override fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeleteStepDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty):
          DeleteStepDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DeleteStepDetailsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeleteStepDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWorkflow.DeleteStepDetailsProperty
    }
  }

  /**
   * Specifies the Amazon EFS identifier and the path for the file being used.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * EfsInputFileLocationProperty efsInputFileLocationProperty =
   * EfsInputFileLocationProperty.builder()
   * .fileSystemId("fileSystemId")
   * .path("path")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-efsinputfilelocation.html)
   */
  public interface EfsInputFileLocationProperty {
    /**
     * The identifier of the file system, assigned by Amazon EFS.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-efsinputfilelocation.html#cfn-transfer-workflow-efsinputfilelocation-filesystemid)
     */
    public fun fileSystemId(): String? = unwrap(this).getFileSystemId()

    /**
     * The pathname for the folder being used by a workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-efsinputfilelocation.html#cfn-transfer-workflow-efsinputfilelocation-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * A builder for [EfsInputFileLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileSystemId The identifier of the file system, assigned by Amazon EFS.
       */
      public fun fileSystemId(fileSystemId: String)

      /**
       * @param path The pathname for the folder being used by a workflow.
       */
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty.Builder
          =
          software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty.builder()

      /**
       * @param fileSystemId The identifier of the file system, assigned by Amazon EFS.
       */
      override fun fileSystemId(fileSystemId: String) {
        cdkBuilder.fileSystemId(fileSystemId)
      }

      /**
       * @param path The pathname for the folder being used by a workflow.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty,
    ) : CdkObject(cdkObject), EfsInputFileLocationProperty {
      /**
       * The identifier of the file system, assigned by Amazon EFS.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-efsinputfilelocation.html#cfn-transfer-workflow-efsinputfilelocation-filesystemid)
       */
      override fun fileSystemId(): String? = unwrap(this).getFileSystemId()

      /**
       * The pathname for the folder being used by a workflow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-efsinputfilelocation.html#cfn-transfer-workflow-efsinputfilelocation-path)
       */
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EfsInputFileLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty):
          EfsInputFileLocationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EfsInputFileLocationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EfsInputFileLocationProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWorkflow.EfsInputFileLocationProperty
    }
  }

  /**
   * Specifies the location for the file that's being processed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * InputFileLocationProperty inputFileLocationProperty = InputFileLocationProperty.builder()
   * .efsFileLocation(EfsInputFileLocationProperty.builder()
   * .fileSystemId("fileSystemId")
   * .path("path")
   * .build())
   * .s3FileLocation(S3InputFileLocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-inputfilelocation.html)
   */
  public interface InputFileLocationProperty {
    /**
     * Specifies the details for the Amazon Elastic File System (Amazon EFS) file that's being
     * decrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-inputfilelocation.html#cfn-transfer-workflow-inputfilelocation-efsfilelocation)
     */
    public fun efsFileLocation(): Any? = unwrap(this).getEfsFileLocation()

    /**
     * Specifies the details for the Amazon S3 file that's being copied or decrypted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-inputfilelocation.html#cfn-transfer-workflow-inputfilelocation-s3filelocation)
     */
    public fun s3FileLocation(): Any? = unwrap(this).getS3FileLocation()

    /**
     * A builder for [InputFileLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param efsFileLocation Specifies the details for the Amazon Elastic File System (Amazon
       * EFS) file that's being decrypted.
       */
      public fun efsFileLocation(efsFileLocation: IResolvable)

      /**
       * @param efsFileLocation Specifies the details for the Amazon Elastic File System (Amazon
       * EFS) file that's being decrypted.
       */
      public fun efsFileLocation(efsFileLocation: EfsInputFileLocationProperty)

      /**
       * @param efsFileLocation Specifies the details for the Amazon Elastic File System (Amazon
       * EFS) file that's being decrypted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49397a7dcf7bcd8b504d41c0da5636a27f6146c4157ffa3e9c52044a3e8b0799")
      public fun efsFileLocation(efsFileLocation: EfsInputFileLocationProperty.Builder.() -> Unit)

      /**
       * @param s3FileLocation Specifies the details for the Amazon S3 file that's being copied or
       * decrypted.
       */
      public fun s3FileLocation(s3FileLocation: IResolvable)

      /**
       * @param s3FileLocation Specifies the details for the Amazon S3 file that's being copied or
       * decrypted.
       */
      public fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty)

      /**
       * @param s3FileLocation Specifies the details for the Amazon S3 file that's being copied or
       * decrypted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be4718862fbc7c4ff9af0f039f9438fbe20f35876c9c4245e4d8ea4a2bb719f")
      public fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty.builder()

      /**
       * @param efsFileLocation Specifies the details for the Amazon Elastic File System (Amazon
       * EFS) file that's being decrypted.
       */
      override fun efsFileLocation(efsFileLocation: IResolvable) {
        cdkBuilder.efsFileLocation(efsFileLocation.let(IResolvable::unwrap))
      }

      /**
       * @param efsFileLocation Specifies the details for the Amazon Elastic File System (Amazon
       * EFS) file that's being decrypted.
       */
      override fun efsFileLocation(efsFileLocation: EfsInputFileLocationProperty) {
        cdkBuilder.efsFileLocation(efsFileLocation.let(EfsInputFileLocationProperty::unwrap))
      }

      /**
       * @param efsFileLocation Specifies the details for the Amazon Elastic File System (Amazon
       * EFS) file that's being decrypted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("49397a7dcf7bcd8b504d41c0da5636a27f6146c4157ffa3e9c52044a3e8b0799")
      override
          fun efsFileLocation(efsFileLocation: EfsInputFileLocationProperty.Builder.() -> Unit):
          Unit = efsFileLocation(EfsInputFileLocationProperty(efsFileLocation))

      /**
       * @param s3FileLocation Specifies the details for the Amazon S3 file that's being copied or
       * decrypted.
       */
      override fun s3FileLocation(s3FileLocation: IResolvable) {
        cdkBuilder.s3FileLocation(s3FileLocation.let(IResolvable::unwrap))
      }

      /**
       * @param s3FileLocation Specifies the details for the Amazon S3 file that's being copied or
       * decrypted.
       */
      override fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty) {
        cdkBuilder.s3FileLocation(s3FileLocation.let(S3InputFileLocationProperty::unwrap))
      }

      /**
       * @param s3FileLocation Specifies the details for the Amazon S3 file that's being copied or
       * decrypted.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5be4718862fbc7c4ff9af0f039f9438fbe20f35876c9c4245e4d8ea4a2bb719f")
      override fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty.Builder.() -> Unit):
          Unit = s3FileLocation(S3InputFileLocationProperty(s3FileLocation))

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty,
    ) : CdkObject(cdkObject), InputFileLocationProperty {
      /**
       * Specifies the details for the Amazon Elastic File System (Amazon EFS) file that's being
       * decrypted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-inputfilelocation.html#cfn-transfer-workflow-inputfilelocation-efsfilelocation)
       */
      override fun efsFileLocation(): Any? = unwrap(this).getEfsFileLocation()

      /**
       * Specifies the details for the Amazon S3 file that's being copied or decrypted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-inputfilelocation.html#cfn-transfer-workflow-inputfilelocation-s3filelocation)
       */
      override fun s3FileLocation(): Any? = unwrap(this).getS3FileLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputFileLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty):
          InputFileLocationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputFileLocationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputFileLocationProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWorkflow.InputFileLocationProperty
    }
  }

  /**
   * Specifies the S3 details for the file being used, such as bucket, ETag, and so forth.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * S3FileLocationProperty s3FileLocationProperty = S3FileLocationProperty.builder()
   * .s3FileLocation(S3InputFileLocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3filelocation.html)
   */
  public interface S3FileLocationProperty {
    /**
     * Specifies the details for the file location for the file that's being used in the workflow.
     *
     * Only applicable if you are using Amazon S3 storage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3filelocation.html#cfn-transfer-workflow-s3filelocation-s3filelocation)
     */
    public fun s3FileLocation(): Any? = unwrap(this).getS3FileLocation()

    /**
     * A builder for [S3FileLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3FileLocation Specifies the details for the file location for the file that's being
       * used in the workflow.
       * Only applicable if you are using Amazon S3 storage.
       */
      public fun s3FileLocation(s3FileLocation: IResolvable)

      /**
       * @param s3FileLocation Specifies the details for the file location for the file that's being
       * used in the workflow.
       * Only applicable if you are using Amazon S3 storage.
       */
      public fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty)

      /**
       * @param s3FileLocation Specifies the details for the file location for the file that's being
       * used in the workflow.
       * Only applicable if you are using Amazon S3 storage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5deeba364254a7436d45af464edae04e28b4856f11f3df8dbc74f70fcaf2cd5d")
      public fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty.builder()

      /**
       * @param s3FileLocation Specifies the details for the file location for the file that's being
       * used in the workflow.
       * Only applicable if you are using Amazon S3 storage.
       */
      override fun s3FileLocation(s3FileLocation: IResolvable) {
        cdkBuilder.s3FileLocation(s3FileLocation.let(IResolvable::unwrap))
      }

      /**
       * @param s3FileLocation Specifies the details for the file location for the file that's being
       * used in the workflow.
       * Only applicable if you are using Amazon S3 storage.
       */
      override fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty) {
        cdkBuilder.s3FileLocation(s3FileLocation.let(S3InputFileLocationProperty::unwrap))
      }

      /**
       * @param s3FileLocation Specifies the details for the file location for the file that's being
       * used in the workflow.
       * Only applicable if you are using Amazon S3 storage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5deeba364254a7436d45af464edae04e28b4856f11f3df8dbc74f70fcaf2cd5d")
      override fun s3FileLocation(s3FileLocation: S3InputFileLocationProperty.Builder.() -> Unit):
          Unit = s3FileLocation(S3InputFileLocationProperty(s3FileLocation))

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty,
    ) : CdkObject(cdkObject), S3FileLocationProperty {
      /**
       * Specifies the details for the file location for the file that's being used in the workflow.
       *
       * Only applicable if you are using Amazon S3 storage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3filelocation.html#cfn-transfer-workflow-s3filelocation-s3filelocation)
       */
      override fun s3FileLocation(): Any? = unwrap(this).getS3FileLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3FileLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty):
          S3FileLocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3FileLocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3FileLocationProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3FileLocationProperty
    }
  }

  /**
   * Specifies the details for the Amazon S3 location for an input file to a workflow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * S3InputFileLocationProperty s3InputFileLocationProperty = S3InputFileLocationProperty.builder()
   * .bucket("bucket")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3inputfilelocation.html)
   */
  public interface S3InputFileLocationProperty {
    /**
     * Specifies the S3 bucket for the customer input file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3inputfilelocation.html#cfn-transfer-workflow-s3inputfilelocation-bucket)
     */
    public fun bucket(): String? = unwrap(this).getBucket()

    /**
     * The name assigned to the file when it was created in Amazon S3.
     *
     * You use the object key to retrieve the object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3inputfilelocation.html#cfn-transfer-workflow-s3inputfilelocation-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * A builder for [S3InputFileLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket Specifies the S3 bucket for the customer input file.
       */
      public fun bucket(bucket: String)

      /**
       * @param key The name assigned to the file when it was created in Amazon S3.
       * You use the object key to retrieve the object.
       */
      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty.builder()

      /**
       * @param bucket Specifies the S3 bucket for the customer input file.
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param key The name assigned to the file when it was created in Amazon S3.
       * You use the object key to retrieve the object.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty,
    ) : CdkObject(cdkObject), S3InputFileLocationProperty {
      /**
       * Specifies the S3 bucket for the customer input file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3inputfilelocation.html#cfn-transfer-workflow-s3inputfilelocation-bucket)
       */
      override fun bucket(): String? = unwrap(this).getBucket()

      /**
       * The name assigned to the file when it was created in Amazon S3.
       *
       * You use the object key to retrieve the object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3inputfilelocation.html#cfn-transfer-workflow-s3inputfilelocation-key)
       */
      override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3InputFileLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty):
          S3InputFileLocationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3InputFileLocationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3InputFileLocationProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3InputFileLocationProperty
    }
  }

  /**
   * Specifies the key-value pair that are assigned to a file during the execution of a Tagging
   * step.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * S3TagProperty s3TagProperty = S3TagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3tag.html)
   */
  public interface S3TagProperty {
    /**
     * The name assigned to the tag that you create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3tag.html#cfn-transfer-workflow-s3tag-key)
     */
    public fun key(): String

    /**
     * The value that corresponds to the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3tag.html#cfn-transfer-workflow-s3tag-value)
     */
    public fun `value`(): String

    /**
     * A builder for [S3TagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The name assigned to the tag that you create. 
       */
      public fun key(key: String)

      /**
       * @param value The value that corresponds to the key. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty.builder()

      /**
       * @param key The name assigned to the tag that you create. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value that corresponds to the key. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty,
    ) : CdkObject(cdkObject), S3TagProperty {
      /**
       * The name assigned to the tag that you create.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3tag.html#cfn-transfer-workflow-s3tag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value that corresponds to the key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-s3tag.html#cfn-transfer-workflow-s3tag-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3TagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty):
          S3TagProperty = CdkObjectWrappers.wrap(cdkObject) as? S3TagProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3TagProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.transfer.CfnWorkflow.S3TagProperty
    }
  }

  /**
   * Details for a step that creates one or more tags.
   *
   * You specify one or more tags. Each tag contains a key-value pair.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.transfer.*;
   * TagStepDetailsProperty tagStepDetailsProperty = TagStepDetailsProperty.builder()
   * .name("name")
   * .sourceFileLocation("sourceFileLocation")
   * .tags(List.of(S3TagProperty.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-tagstepdetails.html)
   */
  public interface TagStepDetailsProperty {
    /**
     * The name of the step, used as an identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-tagstepdetails.html#cfn-transfer-workflow-tagstepdetails-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * Specifies which file to use as input to the workflow step: either the output from the
     * previous step, or the originally uploaded file for the workflow.
     *
     * * To use the previous file as the input, enter `${previous.file}` . In this case, this
     * workflow step uses the output file from the previous workflow step as input. This is the default
     * value.
     * * To use the originally uploaded file location as input for this step, enter
     * `${original.file}` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-tagstepdetails.html#cfn-transfer-workflow-tagstepdetails-sourcefilelocation)
     */
    public fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

    /**
     * Array that contains from 1 to 10 key/value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-tagstepdetails.html#cfn-transfer-workflow-tagstepdetails-tags)
     */
    public fun tags(): List<S3TagProperty> = unwrap(this).getTags()?.map(S3TagProperty::wrap) ?:
        emptyList()

    /**
     * A builder for [TagStepDetailsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the step, used as an identifier.
       */
      public fun name(name: String)

      /**
       * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
       * the output from the previous step, or the originally uploaded file for the workflow.
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       */
      public fun sourceFileLocation(sourceFileLocation: String)

      /**
       * @param tags Array that contains from 1 to 10 key/value pairs.
       */
      public fun tags(tags: List<S3TagProperty>)

      /**
       * @param tags Array that contains from 1 to 10 key/value pairs.
       */
      public fun tags(vararg tags: S3TagProperty)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty.builder()

      /**
       * @param name The name of the step, used as an identifier.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param sourceFileLocation Specifies which file to use as input to the workflow step: either
       * the output from the previous step, or the originally uploaded file for the workflow.
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       */
      override fun sourceFileLocation(sourceFileLocation: String) {
        cdkBuilder.sourceFileLocation(sourceFileLocation)
      }

      /**
       * @param tags Array that contains from 1 to 10 key/value pairs.
       */
      override fun tags(tags: List<S3TagProperty>) {
        cdkBuilder.tags(tags.map(S3TagProperty::unwrap))
      }

      /**
       * @param tags Array that contains from 1 to 10 key/value pairs.
       */
      override fun tags(vararg tags: S3TagProperty): Unit = tags(tags.toList())

      public fun build():
          software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty,
    ) : CdkObject(cdkObject), TagStepDetailsProperty {
      /**
       * The name of the step, used as an identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-tagstepdetails.html#cfn-transfer-workflow-tagstepdetails-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * Specifies which file to use as input to the workflow step: either the output from the
       * previous step, or the originally uploaded file for the workflow.
       *
       * * To use the previous file as the input, enter `${previous.file}` . In this case, this
       * workflow step uses the output file from the previous workflow step as input. This is the
       * default value.
       * * To use the originally uploaded file location as input for this step, enter
       * `${original.file}` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-tagstepdetails.html#cfn-transfer-workflow-tagstepdetails-sourcefilelocation)
       */
      override fun sourceFileLocation(): String? = unwrap(this).getSourceFileLocation()

      /**
       * Array that contains from 1 to 10 key/value pairs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-tagstepdetails.html#cfn-transfer-workflow-tagstepdetails-tags)
       */
      override fun tags(): List<S3TagProperty> = unwrap(this).getTags()?.map(S3TagProperty::wrap) ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagStepDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty):
          TagStepDetailsProperty = CdkObjectWrappers.wrap(cdkObject) as? TagStepDetailsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagStepDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWorkflow.TagStepDetailsProperty
    }
  }

  /**
   * The basic building block of a workflow.
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
   * WorkflowStepProperty workflowStepProperty = WorkflowStepProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html)
   */
  public interface WorkflowStepProperty {
    /**
     * Details for a step that performs a file copy.
     *
     * Consists of the following values:
     *
     * * A description
     * * An Amazon S3 location for the destination of the file copy.
     * * A flag that indicates whether to overwrite an existing file of the same name. The default
     * is `FALSE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-copystepdetails)
     */
    public fun copyStepDetails(): Any? = unwrap(this).getCopyStepDetails()

    /**
     * Details for a step that invokes an AWS Lambda function.
     *
     * Consists of the Lambda function's name, target, and timeout (in seconds).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-customstepdetails)
     */
    public fun customStepDetails(): Any? = unwrap(this).getCustomStepDetails()

    /**
     * Details for a step that decrypts an encrypted file.
     *
     * Consists of the following values:
     *
     * * A descriptive name
     * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
     * decrypt.
     * * An S3 or Amazon EFS location for the destination of the file decryption.
     * * A flag that indicates whether to overwrite an existing file of the same name. The default
     * is `FALSE` .
     * * The type of encryption that's used. Currently, only PGP encryption is supported.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-decryptstepdetails)
     */
    public fun decryptStepDetails(): Any? = unwrap(this).getDecryptStepDetails()

    /**
     * Details for a step that deletes the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-deletestepdetails)
     */
    public fun deleteStepDetails(): Any? = unwrap(this).getDeleteStepDetails()

    /**
     * Details for a step that creates one or more tags.
     *
     * You specify one or more tags. Each tag contains a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-tagstepdetails)
     */
    public fun tagStepDetails(): Any? = unwrap(this).getTagStepDetails()

    /**
     * Currently, the following step types are supported.
     *
     * * *`COPY`* - Copy the file to another location.
     * * *`CUSTOM`* - Perform a custom step with an AWS Lambda function target.
     * * *`DECRYPT`* - Decrypt a file that was encrypted before it was uploaded.
     * * *`DELETE`* - Delete the file.
     * * *`TAG`* - Add a tag to the file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [WorkflowStepProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param copyStepDetails Details for a step that performs a file copy.
       * Consists of the following values:
       *
       * * A description
       * * An Amazon S3 location for the destination of the file copy.
       * * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       */
      public fun copyStepDetails(copyStepDetails: Any)

      /**
       * @param customStepDetails Details for a step that invokes an AWS Lambda function.
       * Consists of the Lambda function's name, target, and timeout (in seconds).
       */
      public fun customStepDetails(customStepDetails: Any)

      /**
       * @param decryptStepDetails Details for a step that decrypts an encrypted file.
       * Consists of the following values:
       *
       * * A descriptive name
       * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
       * decrypt.
       * * An S3 or Amazon EFS location for the destination of the file decryption.
       * * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       * * The type of encryption that's used. Currently, only PGP encryption is supported.
       */
      public fun decryptStepDetails(decryptStepDetails: IResolvable)

      /**
       * @param decryptStepDetails Details for a step that decrypts an encrypted file.
       * Consists of the following values:
       *
       * * A descriptive name
       * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
       * decrypt.
       * * An S3 or Amazon EFS location for the destination of the file decryption.
       * * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       * * The type of encryption that's used. Currently, only PGP encryption is supported.
       */
      public fun decryptStepDetails(decryptStepDetails: DecryptStepDetailsProperty)

      /**
       * @param decryptStepDetails Details for a step that decrypts an encrypted file.
       * Consists of the following values:
       *
       * * A descriptive name
       * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
       * decrypt.
       * * An S3 or Amazon EFS location for the destination of the file decryption.
       * * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       * * The type of encryption that's used. Currently, only PGP encryption is supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1ecb1c1adfefb87617f71a28b53753de53b6cc237ff4207bf5e639516a5e34a")
      public
          fun decryptStepDetails(decryptStepDetails: DecryptStepDetailsProperty.Builder.() -> Unit)

      /**
       * @param deleteStepDetails Details for a step that deletes the file.
       */
      public fun deleteStepDetails(deleteStepDetails: Any)

      /**
       * @param tagStepDetails Details for a step that creates one or more tags.
       * You specify one or more tags. Each tag contains a key-value pair.
       */
      public fun tagStepDetails(tagStepDetails: Any)

      /**
       * @param type Currently, the following step types are supported.
       * * *`COPY`* - Copy the file to another location.
       * * *`CUSTOM`* - Perform a custom step with an AWS Lambda function target.
       * * *`DECRYPT`* - Decrypt a file that was encrypted before it was uploaded.
       * * *`DELETE`* - Delete the file.
       * * *`TAG`* - Add a tag to the file.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty.builder()

      /**
       * @param copyStepDetails Details for a step that performs a file copy.
       * Consists of the following values:
       *
       * * A description
       * * An Amazon S3 location for the destination of the file copy.
       * * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       */
      override fun copyStepDetails(copyStepDetails: Any) {
        cdkBuilder.copyStepDetails(copyStepDetails)
      }

      /**
       * @param customStepDetails Details for a step that invokes an AWS Lambda function.
       * Consists of the Lambda function's name, target, and timeout (in seconds).
       */
      override fun customStepDetails(customStepDetails: Any) {
        cdkBuilder.customStepDetails(customStepDetails)
      }

      /**
       * @param decryptStepDetails Details for a step that decrypts an encrypted file.
       * Consists of the following values:
       *
       * * A descriptive name
       * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
       * decrypt.
       * * An S3 or Amazon EFS location for the destination of the file decryption.
       * * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       * * The type of encryption that's used. Currently, only PGP encryption is supported.
       */
      override fun decryptStepDetails(decryptStepDetails: IResolvable) {
        cdkBuilder.decryptStepDetails(decryptStepDetails.let(IResolvable::unwrap))
      }

      /**
       * @param decryptStepDetails Details for a step that decrypts an encrypted file.
       * Consists of the following values:
       *
       * * A descriptive name
       * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
       * decrypt.
       * * An S3 or Amazon EFS location for the destination of the file decryption.
       * * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       * * The type of encryption that's used. Currently, only PGP encryption is supported.
       */
      override fun decryptStepDetails(decryptStepDetails: DecryptStepDetailsProperty) {
        cdkBuilder.decryptStepDetails(decryptStepDetails.let(DecryptStepDetailsProperty::unwrap))
      }

      /**
       * @param decryptStepDetails Details for a step that decrypts an encrypted file.
       * Consists of the following values:
       *
       * * A descriptive name
       * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
       * decrypt.
       * * An S3 or Amazon EFS location for the destination of the file decryption.
       * * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       * * The type of encryption that's used. Currently, only PGP encryption is supported.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d1ecb1c1adfefb87617f71a28b53753de53b6cc237ff4207bf5e639516a5e34a")
      override
          fun decryptStepDetails(decryptStepDetails: DecryptStepDetailsProperty.Builder.() -> Unit):
          Unit = decryptStepDetails(DecryptStepDetailsProperty(decryptStepDetails))

      /**
       * @param deleteStepDetails Details for a step that deletes the file.
       */
      override fun deleteStepDetails(deleteStepDetails: Any) {
        cdkBuilder.deleteStepDetails(deleteStepDetails)
      }

      /**
       * @param tagStepDetails Details for a step that creates one or more tags.
       * You specify one or more tags. Each tag contains a key-value pair.
       */
      override fun tagStepDetails(tagStepDetails: Any) {
        cdkBuilder.tagStepDetails(tagStepDetails)
      }

      /**
       * @param type Currently, the following step types are supported.
       * * *`COPY`* - Copy the file to another location.
       * * *`CUSTOM`* - Perform a custom step with an AWS Lambda function target.
       * * *`DECRYPT`* - Decrypt a file that was encrypted before it was uploaded.
       * * *`DELETE`* - Delete the file.
       * * *`TAG`* - Add a tag to the file.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty,
    ) : CdkObject(cdkObject), WorkflowStepProperty {
      /**
       * Details for a step that performs a file copy.
       *
       * Consists of the following values:
       *
       * * A description
       * * An Amazon S3 location for the destination of the file copy.
       * * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-copystepdetails)
       */
      override fun copyStepDetails(): Any? = unwrap(this).getCopyStepDetails()

      /**
       * Details for a step that invokes an AWS Lambda function.
       *
       * Consists of the Lambda function's name, target, and timeout (in seconds).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-customstepdetails)
       */
      override fun customStepDetails(): Any? = unwrap(this).getCustomStepDetails()

      /**
       * Details for a step that decrypts an encrypted file.
       *
       * Consists of the following values:
       *
       * * A descriptive name
       * * An Amazon S3 or Amazon Elastic File System (Amazon EFS) location for the source file to
       * decrypt.
       * * An S3 or Amazon EFS location for the destination of the file decryption.
       * * A flag that indicates whether to overwrite an existing file of the same name. The default
       * is `FALSE` .
       * * The type of encryption that's used. Currently, only PGP encryption is supported.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-decryptstepdetails)
       */
      override fun decryptStepDetails(): Any? = unwrap(this).getDecryptStepDetails()

      /**
       * Details for a step that deletes the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-deletestepdetails)
       */
      override fun deleteStepDetails(): Any? = unwrap(this).getDeleteStepDetails()

      /**
       * Details for a step that creates one or more tags.
       *
       * You specify one or more tags. Each tag contains a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-tagstepdetails)
       */
      override fun tagStepDetails(): Any? = unwrap(this).getTagStepDetails()

      /**
       * Currently, the following step types are supported.
       *
       * * *`COPY`* - Copy the file to another location.
       * * *`CUSTOM`* - Perform a custom step with an AWS Lambda function target.
       * * *`DECRYPT`* - Decrypt a file that was encrypted before it was uploaded.
       * * *`DELETE`* - Delete the file.
       * * *`TAG`* - Add a tag to the file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-workflow-workflowstep.html#cfn-transfer-workflow-workflowstep-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowStepProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty):
          WorkflowStepProperty = CdkObjectWrappers.wrap(cdkObject) as? WorkflowStepProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowStepProperty):
          software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnWorkflow.WorkflowStepProperty
    }
  }
}
