@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apptest

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a test case for an application.
 *
 * For more information about test cases, see [Test
 * cases](https://docs.aws.amazon.com/m2/latest/userguide/testing-test-cases.html) and [Application
 * Testing concepts](https://docs.aws.amazon.com/m2/latest/userguide/concepts-apptest.html) in the *AWS
 * Mainframe Modernization User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apptest.*;
 * CfnTestCase cfnTestCase = CfnTestCase.Builder.create(this, "MyCfnTestCase")
 * .name("name")
 * .steps(List.of(StepProperty.builder()
 * .action(StepActionProperty.builder()
 * .compareAction(CompareActionProperty.builder()
 * .input(InputProperty.builder()
 * .file(InputFileProperty.builder()
 * .fileMetadata(FileMetadataProperty.builder()
 * .databaseCdc(DatabaseCDCProperty.builder()
 * .sourceMetadata(SourceDatabaseMetadataProperty.builder()
 * .captureTool("captureTool")
 * .type("type")
 * .build())
 * .targetMetadata(TargetDatabaseMetadataProperty.builder()
 * .captureTool("captureTool")
 * .type("type")
 * .build())
 * .build())
 * .dataSets(List.of(DataSetProperty.builder()
 * .ccsid("ccsid")
 * .format("format")
 * .length(123)
 * .name("name")
 * .type("type")
 * .build()))
 * .build())
 * .sourceLocation("sourceLocation")
 * .targetLocation("targetLocation")
 * .build())
 * .build())
 * // the properties below are optional
 * .output(OutputProperty.builder()
 * .file(OutputFileProperty.builder()
 * .fileLocation("fileLocation")
 * .build())
 * .build())
 * .build())
 * .mainframeAction(MainframeActionProperty.builder()
 * .actionType(MainframeActionTypeProperty.builder()
 * .batch(BatchProperty.builder()
 * .batchJobName("batchJobName")
 * // the properties below are optional
 * .batchJobParameters(Map.of(
 * "batchJobParametersKey", "batchJobParameters"))
 * .exportDataSetNames(List.of("exportDataSetNames"))
 * .build())
 * .tn3270(TN3270Property.builder()
 * .script(ScriptProperty.builder()
 * .scriptLocation("scriptLocation")
 * .type("type")
 * .build())
 * // the properties below are optional
 * .exportDataSetNames(List.of("exportDataSetNames"))
 * .build())
 * .build())
 * .resource("resource")
 * // the properties below are optional
 * .properties(MainframeActionPropertiesProperty.builder()
 * .dmsTaskArn("dmsTaskArn")
 * .build())
 * .build())
 * .resourceAction(ResourceActionProperty.builder()
 * .cloudFormationAction(CloudFormationActionProperty.builder()
 * .resource("resource")
 * // the properties below are optional
 * .actionType("actionType")
 * .build())
 * .m2ManagedApplicationAction(M2ManagedApplicationActionProperty.builder()
 * .actionType("actionType")
 * .resource("resource")
 * // the properties below are optional
 * .properties(M2ManagedActionPropertiesProperty.builder()
 * .forceStop(false)
 * .importDataSetLocation("importDataSetLocation")
 * .build())
 * .build())
 * .m2NonManagedApplicationAction(M2NonManagedApplicationActionProperty.builder()
 * .actionType("actionType")
 * .resource("resource")
 * .build())
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html)
 */
public open class CfnTestCase(
  cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTestCaseProps,
  ) :
      this(software.amazon.awscdk.services.apptest.CfnTestCase(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTestCaseProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTestCaseProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTestCaseProps(props)
  )

  /**
   * The creation time of the test case.
   */
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  /**
   * The last update time of the test case.
   */
  public open fun attrLastUpdateTime(): String = unwrap(this).getAttrLastUpdateTime()

  /**
   *
   */
  public open fun attrLatestVersion(): IResolvable =
      unwrap(this).getAttrLatestVersion().let(IResolvable::wrap)

  /**
   * The status of the test case.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon Resource Name (ARN) of the test case.
   */
  public open fun attrTestCaseArn(): String = unwrap(this).getAttrTestCaseArn()

  /**
   * The response test case ID of the test case.
   */
  public open fun attrTestCaseId(): String = unwrap(this).getAttrTestCaseId()

  /**
   * The version of the test case.
   */
  public open fun attrTestCaseVersion(): IResolvable =
      unwrap(this).getAttrTestCaseVersion().let(IResolvable::wrap)

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the test case.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the test case.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the test case.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the test case.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The steps in the test case.
   */
  public open fun steps(): Any = unwrap(this).getSteps()

  /**
   * The steps in the test case.
   */
  public open fun steps(`value`: IResolvable) {
    unwrap(this).setSteps(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The steps in the test case.
   */
  public open fun steps(`value`: List<Any>) {
    unwrap(this).setSteps(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The steps in the test case.
   */
  public open fun steps(vararg `value`: Any): Unit = steps(`value`.toList())

  /**
   * The specified tags of the test case.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The specified tags of the test case.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apptest.CfnTestCase].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-description)
     * @param description The description of the test case. 
     */
    public fun description(description: String)

    /**
     * The name of the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-name)
     * @param name The name of the test case. 
     */
    public fun name(name: String)

    /**
     * The steps in the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-steps)
     * @param steps The steps in the test case. 
     */
    public fun steps(steps: IResolvable)

    /**
     * The steps in the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-steps)
     * @param steps The steps in the test case. 
     */
    public fun steps(steps: List<Any>)

    /**
     * The steps in the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-steps)
     * @param steps The steps in the test case. 
     */
    public fun steps(vararg steps: Any)

    /**
     * The specified tags of the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-tags)
     * @param tags The specified tags of the test case. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apptest.CfnTestCase.Builder =
        software.amazon.awscdk.services.apptest.CfnTestCase.Builder.create(scope, id)

    /**
     * The description of the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-description)
     * @param description The description of the test case. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-name)
     * @param name The name of the test case. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The steps in the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-steps)
     * @param steps The steps in the test case. 
     */
    override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable.Companion::unwrap))
    }

    /**
     * The steps in the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-steps)
     * @param steps The steps in the test case. 
     */
    override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The steps in the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-steps)
     * @param steps The steps in the test case. 
     */
    override fun steps(vararg steps: Any): Unit = steps(steps.toList())

    /**
     * The specified tags of the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-tags)
     * @param tags The specified tags of the test case. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apptest.CfnTestCase.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTestCase {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTestCase(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase): CfnTestCase =
        CfnTestCase(cdkObject)

    internal fun unwrap(wrapped: CfnTestCase): software.amazon.awscdk.services.apptest.CfnTestCase =
        wrapped.cdkObject as software.amazon.awscdk.services.apptest.CfnTestCase
  }

  /**
   * Defines a batch.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * BatchProperty batchProperty = BatchProperty.builder()
   * .batchJobName("batchJobName")
   * // the properties below are optional
   * .batchJobParameters(Map.of(
   * "batchJobParametersKey", "batchJobParameters"))
   * .exportDataSetNames(List.of("exportDataSetNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-batch.html)
   */
  public interface BatchProperty {
    /**
     * The job name of the batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-batch.html#cfn-apptest-testcase-batch-batchjobname)
     */
    public fun batchJobName(): String

    /**
     * The batch job parameters of the batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-batch.html#cfn-apptest-testcase-batch-batchjobparameters)
     */
    public fun batchJobParameters(): Any? = unwrap(this).getBatchJobParameters()

    /**
     * The export data set names of the batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-batch.html#cfn-apptest-testcase-batch-exportdatasetnames)
     */
    public fun exportDataSetNames(): List<String> = unwrap(this).getExportDataSetNames() ?:
        emptyList()

    /**
     * A builder for [BatchProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchJobName The job name of the batch. 
       */
      public fun batchJobName(batchJobName: String)

      /**
       * @param batchJobParameters The batch job parameters of the batch.
       */
      public fun batchJobParameters(batchJobParameters: Map<String, String>)

      /**
       * @param batchJobParameters The batch job parameters of the batch.
       */
      public fun batchJobParameters(batchJobParameters: IResolvable)

      /**
       * @param exportDataSetNames The export data set names of the batch.
       */
      public fun exportDataSetNames(exportDataSetNames: List<String>)

      /**
       * @param exportDataSetNames The export data set names of the batch.
       */
      public fun exportDataSetNames(vararg exportDataSetNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.BatchProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.BatchProperty.builder()

      /**
       * @param batchJobName The job name of the batch. 
       */
      override fun batchJobName(batchJobName: String) {
        cdkBuilder.batchJobName(batchJobName)
      }

      /**
       * @param batchJobParameters The batch job parameters of the batch.
       */
      override fun batchJobParameters(batchJobParameters: Map<String, String>) {
        cdkBuilder.batchJobParameters(batchJobParameters)
      }

      /**
       * @param batchJobParameters The batch job parameters of the batch.
       */
      override fun batchJobParameters(batchJobParameters: IResolvable) {
        cdkBuilder.batchJobParameters(batchJobParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param exportDataSetNames The export data set names of the batch.
       */
      override fun exportDataSetNames(exportDataSetNames: List<String>) {
        cdkBuilder.exportDataSetNames(exportDataSetNames)
      }

      /**
       * @param exportDataSetNames The export data set names of the batch.
       */
      override fun exportDataSetNames(vararg exportDataSetNames: String): Unit =
          exportDataSetNames(exportDataSetNames.toList())

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.BatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.BatchProperty,
    ) : CdkObject(cdkObject),
        BatchProperty {
      /**
       * The job name of the batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-batch.html#cfn-apptest-testcase-batch-batchjobname)
       */
      override fun batchJobName(): String = unwrap(this).getBatchJobName()

      /**
       * The batch job parameters of the batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-batch.html#cfn-apptest-testcase-batch-batchjobparameters)
       */
      override fun batchJobParameters(): Any? = unwrap(this).getBatchJobParameters()

      /**
       * The export data set names of the batch.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-batch.html#cfn-apptest-testcase-batch-exportdatasetnames)
       */
      override fun exportDataSetNames(): List<String> = unwrap(this).getExportDataSetNames() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.BatchProperty):
          BatchProperty = CdkObjectWrappers.wrap(cdkObject) as? BatchProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: BatchProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.BatchProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.apptest.CfnTestCase.BatchProperty
    }
  }

  /**
   * Specifies the CloudFormation action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * CloudFormationActionProperty cloudFormationActionProperty =
   * CloudFormationActionProperty.builder()
   * .resource("resource")
   * // the properties below are optional
   * .actionType("actionType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-cloudformationaction.html)
   */
  public interface CloudFormationActionProperty {
    /**
     * The action type of the CloudFormation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-cloudformationaction.html#cfn-apptest-testcase-cloudformationaction-actiontype)
     */
    public fun actionType(): String? = unwrap(this).getActionType()

    /**
     * The resource of the CloudFormation action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-cloudformationaction.html#cfn-apptest-testcase-cloudformationaction-resource)
     */
    public fun resource(): String

    /**
     * A builder for [CloudFormationActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionType The action type of the CloudFormation action.
       */
      public fun actionType(actionType: String)

      /**
       * @param resource The resource of the CloudFormation action. 
       */
      public fun resource(resource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.CloudFormationActionProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.CloudFormationActionProperty.builder()

      /**
       * @param actionType The action type of the CloudFormation action.
       */
      override fun actionType(actionType: String) {
        cdkBuilder.actionType(actionType)
      }

      /**
       * @param resource The resource of the CloudFormation action. 
       */
      override fun resource(resource: String) {
        cdkBuilder.resource(resource)
      }

      public fun build():
          software.amazon.awscdk.services.apptest.CfnTestCase.CloudFormationActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.CloudFormationActionProperty,
    ) : CdkObject(cdkObject),
        CloudFormationActionProperty {
      /**
       * The action type of the CloudFormation action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-cloudformationaction.html#cfn-apptest-testcase-cloudformationaction-actiontype)
       */
      override fun actionType(): String? = unwrap(this).getActionType()

      /**
       * The resource of the CloudFormation action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-cloudformationaction.html#cfn-apptest-testcase-cloudformationaction-resource)
       */
      override fun resource(): String = unwrap(this).getResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CloudFormationActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.CloudFormationActionProperty):
          CloudFormationActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CloudFormationActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudFormationActionProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.CloudFormationActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.CloudFormationActionProperty
    }
  }

  /**
   * Compares the action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * CompareActionProperty compareActionProperty = CompareActionProperty.builder()
   * .input(InputProperty.builder()
   * .file(InputFileProperty.builder()
   * .fileMetadata(FileMetadataProperty.builder()
   * .databaseCdc(DatabaseCDCProperty.builder()
   * .sourceMetadata(SourceDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .targetMetadata(TargetDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .build())
   * .dataSets(List.of(DataSetProperty.builder()
   * .ccsid("ccsid")
   * .format("format")
   * .length(123)
   * .name("name")
   * .type("type")
   * .build()))
   * .build())
   * .sourceLocation("sourceLocation")
   * .targetLocation("targetLocation")
   * .build())
   * .build())
   * // the properties below are optional
   * .output(OutputProperty.builder()
   * .file(OutputFileProperty.builder()
   * .fileLocation("fileLocation")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-compareaction.html)
   */
  public interface CompareActionProperty {
    /**
     * The input of the compare action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-compareaction.html#cfn-apptest-testcase-compareaction-input)
     */
    public fun input(): Any

    /**
     * The output of the compare action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-compareaction.html#cfn-apptest-testcase-compareaction-output)
     */
    public fun output(): Any? = unwrap(this).getOutput()

    /**
     * A builder for [CompareActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param input The input of the compare action. 
       */
      public fun input(input: IResolvable)

      /**
       * @param input The input of the compare action. 
       */
      public fun input(input: InputProperty)

      /**
       * @param input The input of the compare action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d4edfc09b8f498d6c0c655cbb1264a110e9e728ce5fd0eb6b6948244e35be3d")
      public fun input(input: InputProperty.Builder.() -> Unit)

      /**
       * @param output The output of the compare action.
       */
      public fun output(output: IResolvable)

      /**
       * @param output The output of the compare action.
       */
      public fun output(output: OutputProperty)

      /**
       * @param output The output of the compare action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d6523100d492627e37ddfe081427f4fe51ee132ffdb536b3dbd13d97943552a")
      public fun output(output: OutputProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.CompareActionProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.CompareActionProperty.builder()

      /**
       * @param input The input of the compare action. 
       */
      override fun input(input: IResolvable) {
        cdkBuilder.input(input.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param input The input of the compare action. 
       */
      override fun input(input: InputProperty) {
        cdkBuilder.input(input.let(InputProperty.Companion::unwrap))
      }

      /**
       * @param input The input of the compare action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d4edfc09b8f498d6c0c655cbb1264a110e9e728ce5fd0eb6b6948244e35be3d")
      override fun input(input: InputProperty.Builder.() -> Unit): Unit =
          input(InputProperty(input))

      /**
       * @param output The output of the compare action.
       */
      override fun output(output: IResolvable) {
        cdkBuilder.output(output.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param output The output of the compare action.
       */
      override fun output(output: OutputProperty) {
        cdkBuilder.output(output.let(OutputProperty.Companion::unwrap))
      }

      /**
       * @param output The output of the compare action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d6523100d492627e37ddfe081427f4fe51ee132ffdb536b3dbd13d97943552a")
      override fun output(output: OutputProperty.Builder.() -> Unit): Unit =
          output(OutputProperty(output))

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.CompareActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.CompareActionProperty,
    ) : CdkObject(cdkObject),
        CompareActionProperty {
      /**
       * The input of the compare action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-compareaction.html#cfn-apptest-testcase-compareaction-input)
       */
      override fun input(): Any = unwrap(this).getInput()

      /**
       * The output of the compare action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-compareaction.html#cfn-apptest-testcase-compareaction-output)
       */
      override fun output(): Any? = unwrap(this).getOutput()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CompareActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.CompareActionProperty):
          CompareActionProperty = CdkObjectWrappers.wrap(cdkObject) as? CompareActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CompareActionProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.CompareActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.CompareActionProperty
    }
  }

  /**
   * Defines a data set.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * DataSetProperty dataSetProperty = DataSetProperty.builder()
   * .ccsid("ccsid")
   * .format("format")
   * .length(123)
   * .name("name")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-dataset.html)
   */
  public interface DataSetProperty {
    /**
     * The CCSID of the data set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-dataset.html#cfn-apptest-testcase-dataset-ccsid)
     */
    public fun ccsid(): String

    /**
     * The format of the data set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-dataset.html#cfn-apptest-testcase-dataset-format)
     */
    public fun format(): String

    /**
     * The length of the data set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-dataset.html#cfn-apptest-testcase-dataset-length)
     */
    public fun length(): Number

    /**
     * The name of the data set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-dataset.html#cfn-apptest-testcase-dataset-name)
     */
    public fun name(): String

    /**
     * The type of the data set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-dataset.html#cfn-apptest-testcase-dataset-type)
     */
    public fun type(): String

    /**
     * A builder for [DataSetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ccsid The CCSID of the data set. 
       */
      public fun ccsid(ccsid: String)

      /**
       * @param format The format of the data set. 
       */
      public fun format(format: String)

      /**
       * @param length The length of the data set. 
       */
      public fun length(length: Number)

      /**
       * @param name The name of the data set. 
       */
      public fun name(name: String)

      /**
       * @param type The type of the data set. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.DataSetProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.DataSetProperty.builder()

      /**
       * @param ccsid The CCSID of the data set. 
       */
      override fun ccsid(ccsid: String) {
        cdkBuilder.ccsid(ccsid)
      }

      /**
       * @param format The format of the data set. 
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      /**
       * @param length The length of the data set. 
       */
      override fun length(length: Number) {
        cdkBuilder.length(length)
      }

      /**
       * @param name The name of the data set. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type The type of the data set. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.DataSetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.DataSetProperty,
    ) : CdkObject(cdkObject),
        DataSetProperty {
      /**
       * The CCSID of the data set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-dataset.html#cfn-apptest-testcase-dataset-ccsid)
       */
      override fun ccsid(): String = unwrap(this).getCcsid()

      /**
       * The format of the data set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-dataset.html#cfn-apptest-testcase-dataset-format)
       */
      override fun format(): String = unwrap(this).getFormat()

      /**
       * The length of the data set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-dataset.html#cfn-apptest-testcase-dataset-length)
       */
      override fun length(): Number = unwrap(this).getLength()

      /**
       * The name of the data set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-dataset.html#cfn-apptest-testcase-dataset-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The type of the data set.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-dataset.html#cfn-apptest-testcase-dataset-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.DataSetProperty):
          DataSetProperty = CdkObjectWrappers.wrap(cdkObject) as? DataSetProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSetProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.DataSetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.DataSetProperty
    }
  }

  /**
   * Defines the Change Data Capture (CDC) of the database.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * DatabaseCDCProperty databaseCDCProperty = DatabaseCDCProperty.builder()
   * .sourceMetadata(SourceDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .targetMetadata(TargetDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-databasecdc.html)
   */
  public interface DatabaseCDCProperty {
    /**
     * The source metadata of the database CDC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-databasecdc.html#cfn-apptest-testcase-databasecdc-sourcemetadata)
     */
    public fun sourceMetadata(): Any

    /**
     * The target metadata of the database CDC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-databasecdc.html#cfn-apptest-testcase-databasecdc-targetmetadata)
     */
    public fun targetMetadata(): Any

    /**
     * A builder for [DatabaseCDCProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceMetadata The source metadata of the database CDC. 
       */
      public fun sourceMetadata(sourceMetadata: IResolvable)

      /**
       * @param sourceMetadata The source metadata of the database CDC. 
       */
      public fun sourceMetadata(sourceMetadata: SourceDatabaseMetadataProperty)

      /**
       * @param sourceMetadata The source metadata of the database CDC. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66749d24db4a7f70a4637ee4b751d5fbbc3ea7fad7486734b76ffb41f8ee3174")
      public fun sourceMetadata(sourceMetadata: SourceDatabaseMetadataProperty.Builder.() -> Unit)

      /**
       * @param targetMetadata The target metadata of the database CDC. 
       */
      public fun targetMetadata(targetMetadata: IResolvable)

      /**
       * @param targetMetadata The target metadata of the database CDC. 
       */
      public fun targetMetadata(targetMetadata: TargetDatabaseMetadataProperty)

      /**
       * @param targetMetadata The target metadata of the database CDC. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("425745a9430d64632705e8c16d3ab3458aadada79e9179f6870f8afa98049cdc")
      public fun targetMetadata(targetMetadata: TargetDatabaseMetadataProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.DatabaseCDCProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.DatabaseCDCProperty.builder()

      /**
       * @param sourceMetadata The source metadata of the database CDC. 
       */
      override fun sourceMetadata(sourceMetadata: IResolvable) {
        cdkBuilder.sourceMetadata(sourceMetadata.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sourceMetadata The source metadata of the database CDC. 
       */
      override fun sourceMetadata(sourceMetadata: SourceDatabaseMetadataProperty) {
        cdkBuilder.sourceMetadata(sourceMetadata.let(SourceDatabaseMetadataProperty.Companion::unwrap))
      }

      /**
       * @param sourceMetadata The source metadata of the database CDC. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("66749d24db4a7f70a4637ee4b751d5fbbc3ea7fad7486734b76ffb41f8ee3174")
      override
          fun sourceMetadata(sourceMetadata: SourceDatabaseMetadataProperty.Builder.() -> Unit):
          Unit = sourceMetadata(SourceDatabaseMetadataProperty(sourceMetadata))

      /**
       * @param targetMetadata The target metadata of the database CDC. 
       */
      override fun targetMetadata(targetMetadata: IResolvable) {
        cdkBuilder.targetMetadata(targetMetadata.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param targetMetadata The target metadata of the database CDC. 
       */
      override fun targetMetadata(targetMetadata: TargetDatabaseMetadataProperty) {
        cdkBuilder.targetMetadata(targetMetadata.let(TargetDatabaseMetadataProperty.Companion::unwrap))
      }

      /**
       * @param targetMetadata The target metadata of the database CDC. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("425745a9430d64632705e8c16d3ab3458aadada79e9179f6870f8afa98049cdc")
      override
          fun targetMetadata(targetMetadata: TargetDatabaseMetadataProperty.Builder.() -> Unit):
          Unit = targetMetadata(TargetDatabaseMetadataProperty(targetMetadata))

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.DatabaseCDCProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.DatabaseCDCProperty,
    ) : CdkObject(cdkObject),
        DatabaseCDCProperty {
      /**
       * The source metadata of the database CDC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-databasecdc.html#cfn-apptest-testcase-databasecdc-sourcemetadata)
       */
      override fun sourceMetadata(): Any = unwrap(this).getSourceMetadata()

      /**
       * The target metadata of the database CDC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-databasecdc.html#cfn-apptest-testcase-databasecdc-targetmetadata)
       */
      override fun targetMetadata(): Any = unwrap(this).getTargetMetadata()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseCDCProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.DatabaseCDCProperty):
          DatabaseCDCProperty = CdkObjectWrappers.wrap(cdkObject) as? DatabaseCDCProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseCDCProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.DatabaseCDCProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.DatabaseCDCProperty
    }
  }

  /**
   * Specifies a file metadata.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * FileMetadataProperty fileMetadataProperty = FileMetadataProperty.builder()
   * .databaseCdc(DatabaseCDCProperty.builder()
   * .sourceMetadata(SourceDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .targetMetadata(TargetDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .build())
   * .dataSets(List.of(DataSetProperty.builder()
   * .ccsid("ccsid")
   * .format("format")
   * .length(123)
   * .name("name")
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-filemetadata.html)
   */
  public interface FileMetadataProperty {
    /**
     * The data sets of the file metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-filemetadata.html#cfn-apptest-testcase-filemetadata-datasets)
     */
    public fun dataSets(): Any? = unwrap(this).getDataSets()

    /**
     * The database CDC of the file metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-filemetadata.html#cfn-apptest-testcase-filemetadata-databasecdc)
     */
    public fun databaseCdc(): Any? = unwrap(this).getDatabaseCdc()

    /**
     * A builder for [FileMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSets The data sets of the file metadata.
       */
      public fun dataSets(dataSets: IResolvable)

      /**
       * @param dataSets The data sets of the file metadata.
       */
      public fun dataSets(dataSets: List<Any>)

      /**
       * @param dataSets The data sets of the file metadata.
       */
      public fun dataSets(vararg dataSets: Any)

      /**
       * @param databaseCdc The database CDC of the file metadata.
       */
      public fun databaseCdc(databaseCdc: IResolvable)

      /**
       * @param databaseCdc The database CDC of the file metadata.
       */
      public fun databaseCdc(databaseCdc: DatabaseCDCProperty)

      /**
       * @param databaseCdc The database CDC of the file metadata.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d78dfcabeba03616e6144b03671d4c920d13017d1fc3224d29b36ff5a42fa041")
      public fun databaseCdc(databaseCdc: DatabaseCDCProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.FileMetadataProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.FileMetadataProperty.builder()

      /**
       * @param dataSets The data sets of the file metadata.
       */
      override fun dataSets(dataSets: IResolvable) {
        cdkBuilder.dataSets(dataSets.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dataSets The data sets of the file metadata.
       */
      override fun dataSets(dataSets: List<Any>) {
        cdkBuilder.dataSets(dataSets.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dataSets The data sets of the file metadata.
       */
      override fun dataSets(vararg dataSets: Any): Unit = dataSets(dataSets.toList())

      /**
       * @param databaseCdc The database CDC of the file metadata.
       */
      override fun databaseCdc(databaseCdc: IResolvable) {
        cdkBuilder.databaseCdc(databaseCdc.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param databaseCdc The database CDC of the file metadata.
       */
      override fun databaseCdc(databaseCdc: DatabaseCDCProperty) {
        cdkBuilder.databaseCdc(databaseCdc.let(DatabaseCDCProperty.Companion::unwrap))
      }

      /**
       * @param databaseCdc The database CDC of the file metadata.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d78dfcabeba03616e6144b03671d4c920d13017d1fc3224d29b36ff5a42fa041")
      override fun databaseCdc(databaseCdc: DatabaseCDCProperty.Builder.() -> Unit): Unit =
          databaseCdc(DatabaseCDCProperty(databaseCdc))

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.FileMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.FileMetadataProperty,
    ) : CdkObject(cdkObject),
        FileMetadataProperty {
      /**
       * The data sets of the file metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-filemetadata.html#cfn-apptest-testcase-filemetadata-datasets)
       */
      override fun dataSets(): Any? = unwrap(this).getDataSets()

      /**
       * The database CDC of the file metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-filemetadata.html#cfn-apptest-testcase-filemetadata-databasecdc)
       */
      override fun databaseCdc(): Any? = unwrap(this).getDatabaseCdc()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FileMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.FileMetadataProperty):
          FileMetadataProperty = CdkObjectWrappers.wrap(cdkObject) as? FileMetadataProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FileMetadataProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.FileMetadataProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.FileMetadataProperty
    }
  }

  /**
   * Specifies the input file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * InputFileProperty inputFileProperty = InputFileProperty.builder()
   * .fileMetadata(FileMetadataProperty.builder()
   * .databaseCdc(DatabaseCDCProperty.builder()
   * .sourceMetadata(SourceDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .targetMetadata(TargetDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .build())
   * .dataSets(List.of(DataSetProperty.builder()
   * .ccsid("ccsid")
   * .format("format")
   * .length(123)
   * .name("name")
   * .type("type")
   * .build()))
   * .build())
   * .sourceLocation("sourceLocation")
   * .targetLocation("targetLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-inputfile.html)
   */
  public interface InputFileProperty {
    /**
     * The file metadata of the input file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-inputfile.html#cfn-apptest-testcase-inputfile-filemetadata)
     */
    public fun fileMetadata(): Any

    /**
     * The source location of the input file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-inputfile.html#cfn-apptest-testcase-inputfile-sourcelocation)
     */
    public fun sourceLocation(): String

    /**
     * The target location of the input file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-inputfile.html#cfn-apptest-testcase-inputfile-targetlocation)
     */
    public fun targetLocation(): String

    /**
     * A builder for [InputFileProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileMetadata The file metadata of the input file. 
       */
      public fun fileMetadata(fileMetadata: IResolvable)

      /**
       * @param fileMetadata The file metadata of the input file. 
       */
      public fun fileMetadata(fileMetadata: FileMetadataProperty)

      /**
       * @param fileMetadata The file metadata of the input file. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77102f9773221e40bd8d881eca6eabd4a6830a955191c8d43ec4898a6b0edd78")
      public fun fileMetadata(fileMetadata: FileMetadataProperty.Builder.() -> Unit)

      /**
       * @param sourceLocation The source location of the input file. 
       */
      public fun sourceLocation(sourceLocation: String)

      /**
       * @param targetLocation The target location of the input file. 
       */
      public fun targetLocation(targetLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.InputFileProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.InputFileProperty.builder()

      /**
       * @param fileMetadata The file metadata of the input file. 
       */
      override fun fileMetadata(fileMetadata: IResolvable) {
        cdkBuilder.fileMetadata(fileMetadata.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param fileMetadata The file metadata of the input file. 
       */
      override fun fileMetadata(fileMetadata: FileMetadataProperty) {
        cdkBuilder.fileMetadata(fileMetadata.let(FileMetadataProperty.Companion::unwrap))
      }

      /**
       * @param fileMetadata The file metadata of the input file. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77102f9773221e40bd8d881eca6eabd4a6830a955191c8d43ec4898a6b0edd78")
      override fun fileMetadata(fileMetadata: FileMetadataProperty.Builder.() -> Unit): Unit =
          fileMetadata(FileMetadataProperty(fileMetadata))

      /**
       * @param sourceLocation The source location of the input file. 
       */
      override fun sourceLocation(sourceLocation: String) {
        cdkBuilder.sourceLocation(sourceLocation)
      }

      /**
       * @param targetLocation The target location of the input file. 
       */
      override fun targetLocation(targetLocation: String) {
        cdkBuilder.targetLocation(targetLocation)
      }

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.InputFileProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.InputFileProperty,
    ) : CdkObject(cdkObject),
        InputFileProperty {
      /**
       * The file metadata of the input file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-inputfile.html#cfn-apptest-testcase-inputfile-filemetadata)
       */
      override fun fileMetadata(): Any = unwrap(this).getFileMetadata()

      /**
       * The source location of the input file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-inputfile.html#cfn-apptest-testcase-inputfile-sourcelocation)
       */
      override fun sourceLocation(): String = unwrap(this).getSourceLocation()

      /**
       * The target location of the input file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-inputfile.html#cfn-apptest-testcase-inputfile-targetlocation)
       */
      override fun targetLocation(): String = unwrap(this).getTargetLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputFileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.InputFileProperty):
          InputFileProperty = CdkObjectWrappers.wrap(cdkObject) as? InputFileProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputFileProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.InputFileProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.InputFileProperty
    }
  }

  /**
   * Specifies the input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * InputProperty inputProperty = InputProperty.builder()
   * .file(InputFileProperty.builder()
   * .fileMetadata(FileMetadataProperty.builder()
   * .databaseCdc(DatabaseCDCProperty.builder()
   * .sourceMetadata(SourceDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .targetMetadata(TargetDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .build())
   * .dataSets(List.of(DataSetProperty.builder()
   * .ccsid("ccsid")
   * .format("format")
   * .length(123)
   * .name("name")
   * .type("type")
   * .build()))
   * .build())
   * .sourceLocation("sourceLocation")
   * .targetLocation("targetLocation")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-input.html)
   */
  public interface InputProperty {
    /**
     * The file in the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-input.html#cfn-apptest-testcase-input-file)
     */
    public fun `file`(): Any

    /**
     * A builder for [InputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param file The file in the input. 
       */
      public fun `file`(`file`: IResolvable)

      /**
       * @param file The file in the input. 
       */
      public fun `file`(`file`: InputFileProperty)

      /**
       * @param file The file in the input. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26cc8ec6a3d524e0d92eb0634e023030efaf08098434d9f497c56c121543a617")
      public fun `file`(`file`: InputFileProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.InputProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.InputProperty.builder()

      /**
       * @param file The file in the input. 
       */
      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param file The file in the input. 
       */
      override fun `file`(`file`: InputFileProperty) {
        cdkBuilder.`file`(`file`.let(InputFileProperty.Companion::unwrap))
      }

      /**
       * @param file The file in the input. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26cc8ec6a3d524e0d92eb0634e023030efaf08098434d9f497c56c121543a617")
      override fun `file`(`file`: InputFileProperty.Builder.() -> Unit): Unit =
          `file`(InputFileProperty(`file`))

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.InputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.InputProperty,
    ) : CdkObject(cdkObject),
        InputProperty {
      /**
       * The file in the input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-input.html#cfn-apptest-testcase-input-file)
       */
      override fun `file`(): Any = unwrap(this).getFile()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.InputProperty):
          InputProperty = CdkObjectWrappers.wrap(cdkObject) as? InputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.InputProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.apptest.CfnTestCase.InputProperty
    }
  }

  /**
   * Specifies the Mainframe Modernization managed action properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * M2ManagedActionPropertiesProperty m2ManagedActionPropertiesProperty =
   * M2ManagedActionPropertiesProperty.builder()
   * .forceStop(false)
   * .importDataSetLocation("importDataSetLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedactionproperties.html)
   */
  public interface M2ManagedActionPropertiesProperty {
    /**
     * Force stops the Mainframe Modernization managed action properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedactionproperties.html#cfn-apptest-testcase-m2managedactionproperties-forcestop)
     */
    public fun forceStop(): Any? = unwrap(this).getForceStop()

    /**
     * The import data set location of the Mainframe Modernization managed action properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedactionproperties.html#cfn-apptest-testcase-m2managedactionproperties-importdatasetlocation)
     */
    public fun importDataSetLocation(): String? = unwrap(this).getImportDataSetLocation()

    /**
     * A builder for [M2ManagedActionPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param forceStop Force stops the Mainframe Modernization managed action properties.
       */
      public fun forceStop(forceStop: Boolean)

      /**
       * @param forceStop Force stops the Mainframe Modernization managed action properties.
       */
      public fun forceStop(forceStop: IResolvable)

      /**
       * @param importDataSetLocation The import data set location of the Mainframe Modernization
       * managed action properties.
       */
      public fun importDataSetLocation(importDataSetLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedActionPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedActionPropertiesProperty.builder()

      /**
       * @param forceStop Force stops the Mainframe Modernization managed action properties.
       */
      override fun forceStop(forceStop: Boolean) {
        cdkBuilder.forceStop(forceStop)
      }

      /**
       * @param forceStop Force stops the Mainframe Modernization managed action properties.
       */
      override fun forceStop(forceStop: IResolvable) {
        cdkBuilder.forceStop(forceStop.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param importDataSetLocation The import data set location of the Mainframe Modernization
       * managed action properties.
       */
      override fun importDataSetLocation(importDataSetLocation: String) {
        cdkBuilder.importDataSetLocation(importDataSetLocation)
      }

      public fun build():
          software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedActionPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedActionPropertiesProperty,
    ) : CdkObject(cdkObject),
        M2ManagedActionPropertiesProperty {
      /**
       * Force stops the Mainframe Modernization managed action properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedactionproperties.html#cfn-apptest-testcase-m2managedactionproperties-forcestop)
       */
      override fun forceStop(): Any? = unwrap(this).getForceStop()

      /**
       * The import data set location of the Mainframe Modernization managed action properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedactionproperties.html#cfn-apptest-testcase-m2managedactionproperties-importdatasetlocation)
       */
      override fun importDataSetLocation(): String? = unwrap(this).getImportDataSetLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          M2ManagedActionPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedActionPropertiesProperty):
          M2ManagedActionPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          M2ManagedActionPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: M2ManagedActionPropertiesProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedActionPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedActionPropertiesProperty
    }
  }

  /**
   * Specifies the Mainframe Modernization managed application action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * M2ManagedApplicationActionProperty m2ManagedApplicationActionProperty =
   * M2ManagedApplicationActionProperty.builder()
   * .actionType("actionType")
   * .resource("resource")
   * // the properties below are optional
   * .properties(M2ManagedActionPropertiesProperty.builder()
   * .forceStop(false)
   * .importDataSetLocation("importDataSetLocation")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedapplicationaction.html)
   */
  public interface M2ManagedApplicationActionProperty {
    /**
     * The action type of the Mainframe Modernization managed application action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedapplicationaction.html#cfn-apptest-testcase-m2managedapplicationaction-actiontype)
     */
    public fun actionType(): String

    /**
     * The properties of the Mainframe Modernization managed application action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedapplicationaction.html#cfn-apptest-testcase-m2managedapplicationaction-properties)
     */
    public fun properties(): Any? = unwrap(this).getProperties()

    /**
     * The resource of the Mainframe Modernization managed application action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedapplicationaction.html#cfn-apptest-testcase-m2managedapplicationaction-resource)
     */
    public fun resource(): String

    /**
     * A builder for [M2ManagedApplicationActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionType The action type of the Mainframe Modernization managed application
       * action. 
       */
      public fun actionType(actionType: String)

      /**
       * @param properties The properties of the Mainframe Modernization managed application action.
       */
      public fun properties(properties: IResolvable)

      /**
       * @param properties The properties of the Mainframe Modernization managed application action.
       */
      public fun properties(properties: M2ManagedActionPropertiesProperty)

      /**
       * @param properties The properties of the Mainframe Modernization managed application action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("944446da07e38844a68957c7b5492e431b43813cba9b75b759cd485a08407f80")
      public fun properties(properties: M2ManagedActionPropertiesProperty.Builder.() -> Unit)

      /**
       * @param resource The resource of the Mainframe Modernization managed application action. 
       */
      public fun resource(resource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedApplicationActionProperty.Builder
          =
          software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedApplicationActionProperty.builder()

      /**
       * @param actionType The action type of the Mainframe Modernization managed application
       * action. 
       */
      override fun actionType(actionType: String) {
        cdkBuilder.actionType(actionType)
      }

      /**
       * @param properties The properties of the Mainframe Modernization managed application action.
       */
      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param properties The properties of the Mainframe Modernization managed application action.
       */
      override fun properties(properties: M2ManagedActionPropertiesProperty) {
        cdkBuilder.properties(properties.let(M2ManagedActionPropertiesProperty.Companion::unwrap))
      }

      /**
       * @param properties The properties of the Mainframe Modernization managed application action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("944446da07e38844a68957c7b5492e431b43813cba9b75b759cd485a08407f80")
      override fun properties(properties: M2ManagedActionPropertiesProperty.Builder.() -> Unit):
          Unit = properties(M2ManagedActionPropertiesProperty(properties))

      /**
       * @param resource The resource of the Mainframe Modernization managed application action. 
       */
      override fun resource(resource: String) {
        cdkBuilder.resource(resource)
      }

      public fun build():
          software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedApplicationActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedApplicationActionProperty,
    ) : CdkObject(cdkObject),
        M2ManagedApplicationActionProperty {
      /**
       * The action type of the Mainframe Modernization managed application action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedapplicationaction.html#cfn-apptest-testcase-m2managedapplicationaction-actiontype)
       */
      override fun actionType(): String = unwrap(this).getActionType()

      /**
       * The properties of the Mainframe Modernization managed application action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedapplicationaction.html#cfn-apptest-testcase-m2managedapplicationaction-properties)
       */
      override fun properties(): Any? = unwrap(this).getProperties()

      /**
       * The resource of the Mainframe Modernization managed application action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2managedapplicationaction.html#cfn-apptest-testcase-m2managedapplicationaction-resource)
       */
      override fun resource(): String = unwrap(this).getResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          M2ManagedApplicationActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedApplicationActionProperty):
          M2ManagedApplicationActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          M2ManagedApplicationActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: M2ManagedApplicationActionProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedApplicationActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.M2ManagedApplicationActionProperty
    }
  }

  /**
   * Specifies the Mainframe Modernization non-managed application action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * M2NonManagedApplicationActionProperty m2NonManagedApplicationActionProperty =
   * M2NonManagedApplicationActionProperty.builder()
   * .actionType("actionType")
   * .resource("resource")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2nonmanagedapplicationaction.html)
   */
  public interface M2NonManagedApplicationActionProperty {
    /**
     * The action type of the Mainframe Modernization non-managed application action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2nonmanagedapplicationaction.html#cfn-apptest-testcase-m2nonmanagedapplicationaction-actiontype)
     */
    public fun actionType(): String

    /**
     * The resource of the Mainframe Modernization non-managed application action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2nonmanagedapplicationaction.html#cfn-apptest-testcase-m2nonmanagedapplicationaction-resource)
     */
    public fun resource(): String

    /**
     * A builder for [M2NonManagedApplicationActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionType The action type of the Mainframe Modernization non-managed application
       * action. 
       */
      public fun actionType(actionType: String)

      /**
       * @param resource The resource of the Mainframe Modernization non-managed application action.
       * 
       */
      public fun resource(resource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.M2NonManagedApplicationActionProperty.Builder
          =
          software.amazon.awscdk.services.apptest.CfnTestCase.M2NonManagedApplicationActionProperty.builder()

      /**
       * @param actionType The action type of the Mainframe Modernization non-managed application
       * action. 
       */
      override fun actionType(actionType: String) {
        cdkBuilder.actionType(actionType)
      }

      /**
       * @param resource The resource of the Mainframe Modernization non-managed application action.
       * 
       */
      override fun resource(resource: String) {
        cdkBuilder.resource(resource)
      }

      public fun build():
          software.amazon.awscdk.services.apptest.CfnTestCase.M2NonManagedApplicationActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.M2NonManagedApplicationActionProperty,
    ) : CdkObject(cdkObject),
        M2NonManagedApplicationActionProperty {
      /**
       * The action type of the Mainframe Modernization non-managed application action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2nonmanagedapplicationaction.html#cfn-apptest-testcase-m2nonmanagedapplicationaction-actiontype)
       */
      override fun actionType(): String = unwrap(this).getActionType()

      /**
       * The resource of the Mainframe Modernization non-managed application action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-m2nonmanagedapplicationaction.html#cfn-apptest-testcase-m2nonmanagedapplicationaction-resource)
       */
      override fun resource(): String = unwrap(this).getResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          M2NonManagedApplicationActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.M2NonManagedApplicationActionProperty):
          M2NonManagedApplicationActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          M2NonManagedApplicationActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: M2NonManagedApplicationActionProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.M2NonManagedApplicationActionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.M2NonManagedApplicationActionProperty
    }
  }

  /**
   * Specifies the mainframe action properties.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * MainframeActionPropertiesProperty mainframeActionPropertiesProperty =
   * MainframeActionPropertiesProperty.builder()
   * .dmsTaskArn("dmsTaskArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeactionproperties.html)
   */
  public interface MainframeActionPropertiesProperty {
    /**
     * The DMS task ARN of the mainframe action properties.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeactionproperties.html#cfn-apptest-testcase-mainframeactionproperties-dmstaskarn)
     */
    public fun dmsTaskArn(): String? = unwrap(this).getDmsTaskArn()

    /**
     * A builder for [MainframeActionPropertiesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dmsTaskArn The DMS task ARN of the mainframe action properties.
       */
      public fun dmsTaskArn(dmsTaskArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionPropertiesProperty.builder()

      /**
       * @param dmsTaskArn The DMS task ARN of the mainframe action properties.
       */
      override fun dmsTaskArn(dmsTaskArn: String) {
        cdkBuilder.dmsTaskArn(dmsTaskArn)
      }

      public fun build():
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionPropertiesProperty,
    ) : CdkObject(cdkObject),
        MainframeActionPropertiesProperty {
      /**
       * The DMS task ARN of the mainframe action properties.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeactionproperties.html#cfn-apptest-testcase-mainframeactionproperties-dmstaskarn)
       */
      override fun dmsTaskArn(): String? = unwrap(this).getDmsTaskArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MainframeActionPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionPropertiesProperty):
          MainframeActionPropertiesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MainframeActionPropertiesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MainframeActionPropertiesProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionPropertiesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionPropertiesProperty
    }
  }

  /**
   * Specifies the mainframe action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * MainframeActionProperty mainframeActionProperty = MainframeActionProperty.builder()
   * .actionType(MainframeActionTypeProperty.builder()
   * .batch(BatchProperty.builder()
   * .batchJobName("batchJobName")
   * // the properties below are optional
   * .batchJobParameters(Map.of(
   * "batchJobParametersKey", "batchJobParameters"))
   * .exportDataSetNames(List.of("exportDataSetNames"))
   * .build())
   * .tn3270(TN3270Property.builder()
   * .script(ScriptProperty.builder()
   * .scriptLocation("scriptLocation")
   * .type("type")
   * .build())
   * // the properties below are optional
   * .exportDataSetNames(List.of("exportDataSetNames"))
   * .build())
   * .build())
   * .resource("resource")
   * // the properties below are optional
   * .properties(MainframeActionPropertiesProperty.builder()
   * .dmsTaskArn("dmsTaskArn")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeaction.html)
   */
  public interface MainframeActionProperty {
    /**
     * The action type of the mainframe action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeaction.html#cfn-apptest-testcase-mainframeaction-actiontype)
     */
    public fun actionType(): Any

    /**
     * The properties of the mainframe action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeaction.html#cfn-apptest-testcase-mainframeaction-properties)
     */
    public fun properties(): Any? = unwrap(this).getProperties()

    /**
     * The resource of the mainframe action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeaction.html#cfn-apptest-testcase-mainframeaction-resource)
     */
    public fun resource(): String

    /**
     * A builder for [MainframeActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param actionType The action type of the mainframe action. 
       */
      public fun actionType(actionType: IResolvable)

      /**
       * @param actionType The action type of the mainframe action. 
       */
      public fun actionType(actionType: MainframeActionTypeProperty)

      /**
       * @param actionType The action type of the mainframe action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d01d53070fad24bf9ae1410c1cb56a89948232314d70086636c653013ac34bbc")
      public fun actionType(actionType: MainframeActionTypeProperty.Builder.() -> Unit)

      /**
       * @param properties The properties of the mainframe action.
       */
      public fun properties(properties: IResolvable)

      /**
       * @param properties The properties of the mainframe action.
       */
      public fun properties(properties: MainframeActionPropertiesProperty)

      /**
       * @param properties The properties of the mainframe action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92f2c77b8ba2c742b1d12629f73ae08234f27a2c02fa37f353dfb35335baeb00")
      public fun properties(properties: MainframeActionPropertiesProperty.Builder.() -> Unit)

      /**
       * @param resource The resource of the mainframe action. 
       */
      public fun resource(resource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionProperty.builder()

      /**
       * @param actionType The action type of the mainframe action. 
       */
      override fun actionType(actionType: IResolvable) {
        cdkBuilder.actionType(actionType.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param actionType The action type of the mainframe action. 
       */
      override fun actionType(actionType: MainframeActionTypeProperty) {
        cdkBuilder.actionType(actionType.let(MainframeActionTypeProperty.Companion::unwrap))
      }

      /**
       * @param actionType The action type of the mainframe action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d01d53070fad24bf9ae1410c1cb56a89948232314d70086636c653013ac34bbc")
      override fun actionType(actionType: MainframeActionTypeProperty.Builder.() -> Unit): Unit =
          actionType(MainframeActionTypeProperty(actionType))

      /**
       * @param properties The properties of the mainframe action.
       */
      override fun properties(properties: IResolvable) {
        cdkBuilder.properties(properties.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param properties The properties of the mainframe action.
       */
      override fun properties(properties: MainframeActionPropertiesProperty) {
        cdkBuilder.properties(properties.let(MainframeActionPropertiesProperty.Companion::unwrap))
      }

      /**
       * @param properties The properties of the mainframe action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("92f2c77b8ba2c742b1d12629f73ae08234f27a2c02fa37f353dfb35335baeb00")
      override fun properties(properties: MainframeActionPropertiesProperty.Builder.() -> Unit):
          Unit = properties(MainframeActionPropertiesProperty(properties))

      /**
       * @param resource The resource of the mainframe action. 
       */
      override fun resource(resource: String) {
        cdkBuilder.resource(resource)
      }

      public fun build():
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionProperty,
    ) : CdkObject(cdkObject),
        MainframeActionProperty {
      /**
       * The action type of the mainframe action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeaction.html#cfn-apptest-testcase-mainframeaction-actiontype)
       */
      override fun actionType(): Any = unwrap(this).getActionType()

      /**
       * The properties of the mainframe action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeaction.html#cfn-apptest-testcase-mainframeaction-properties)
       */
      override fun properties(): Any? = unwrap(this).getProperties()

      /**
       * The resource of the mainframe action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeaction.html#cfn-apptest-testcase-mainframeaction-resource)
       */
      override fun resource(): String = unwrap(this).getResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MainframeActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionProperty):
          MainframeActionProperty = CdkObjectWrappers.wrap(cdkObject) as? MainframeActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MainframeActionProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionProperty
    }
  }

  /**
   * Specifies the mainframe action type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * MainframeActionTypeProperty mainframeActionTypeProperty = MainframeActionTypeProperty.builder()
   * .batch(BatchProperty.builder()
   * .batchJobName("batchJobName")
   * // the properties below are optional
   * .batchJobParameters(Map.of(
   * "batchJobParametersKey", "batchJobParameters"))
   * .exportDataSetNames(List.of("exportDataSetNames"))
   * .build())
   * .tn3270(TN3270Property.builder()
   * .script(ScriptProperty.builder()
   * .scriptLocation("scriptLocation")
   * .type("type")
   * .build())
   * // the properties below are optional
   * .exportDataSetNames(List.of("exportDataSetNames"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeactiontype.html)
   */
  public interface MainframeActionTypeProperty {
    /**
     * The batch of the mainframe action type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeactiontype.html#cfn-apptest-testcase-mainframeactiontype-batch)
     */
    public fun batch(): Any? = unwrap(this).getBatch()

    /**
     * The tn3270 port of the mainframe action type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeactiontype.html#cfn-apptest-testcase-mainframeactiontype-tn3270)
     */
    public fun tn3270(): Any? = unwrap(this).getTn3270()

    /**
     * A builder for [MainframeActionTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batch The batch of the mainframe action type.
       */
      public fun batch(batch: IResolvable)

      /**
       * @param batch The batch of the mainframe action type.
       */
      public fun batch(batch: BatchProperty)

      /**
       * @param batch The batch of the mainframe action type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b612ec102a58f696a4de03b1bd23ea02c5d30dec415ad34c868a2453a4012a1")
      public fun batch(batch: BatchProperty.Builder.() -> Unit)

      /**
       * @param tn3270 The tn3270 port of the mainframe action type.
       */
      public fun tn3270(tn3270: IResolvable)

      /**
       * @param tn3270 The tn3270 port of the mainframe action type.
       */
      public fun tn3270(tn3270: TN3270Property)

      /**
       * @param tn3270 The tn3270 port of the mainframe action type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8793375e77a4a61aa1840f07e436fc5e616c2e0e2236e23842436a61d609a957")
      public fun tn3270(tn3270: TN3270Property.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionTypeProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionTypeProperty.builder()

      /**
       * @param batch The batch of the mainframe action type.
       */
      override fun batch(batch: IResolvable) {
        cdkBuilder.batch(batch.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param batch The batch of the mainframe action type.
       */
      override fun batch(batch: BatchProperty) {
        cdkBuilder.batch(batch.let(BatchProperty.Companion::unwrap))
      }

      /**
       * @param batch The batch of the mainframe action type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b612ec102a58f696a4de03b1bd23ea02c5d30dec415ad34c868a2453a4012a1")
      override fun batch(batch: BatchProperty.Builder.() -> Unit): Unit =
          batch(BatchProperty(batch))

      /**
       * @param tn3270 The tn3270 port of the mainframe action type.
       */
      override fun tn3270(tn3270: IResolvable) {
        cdkBuilder.tn3270(tn3270.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tn3270 The tn3270 port of the mainframe action type.
       */
      override fun tn3270(tn3270: TN3270Property) {
        cdkBuilder.tn3270(tn3270.let(TN3270Property.Companion::unwrap))
      }

      /**
       * @param tn3270 The tn3270 port of the mainframe action type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8793375e77a4a61aa1840f07e436fc5e616c2e0e2236e23842436a61d609a957")
      override fun tn3270(tn3270: TN3270Property.Builder.() -> Unit): Unit =
          tn3270(TN3270Property(tn3270))

      public fun build():
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionTypeProperty,
    ) : CdkObject(cdkObject),
        MainframeActionTypeProperty {
      /**
       * The batch of the mainframe action type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeactiontype.html#cfn-apptest-testcase-mainframeactiontype-batch)
       */
      override fun batch(): Any? = unwrap(this).getBatch()

      /**
       * The tn3270 port of the mainframe action type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-mainframeactiontype.html#cfn-apptest-testcase-mainframeactiontype-tn3270)
       */
      override fun tn3270(): Any? = unwrap(this).getTn3270()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MainframeActionTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionTypeProperty):
          MainframeActionTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MainframeActionTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MainframeActionTypeProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionTypeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.MainframeActionTypeProperty
    }
  }

  /**
   * Specifies an output file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * OutputFileProperty outputFileProperty = OutputFileProperty.builder()
   * .fileLocation("fileLocation")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-outputfile.html)
   */
  public interface OutputFileProperty {
    /**
     * The file location of the output file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-outputfile.html#cfn-apptest-testcase-outputfile-filelocation)
     */
    public fun fileLocation(): String? = unwrap(this).getFileLocation()

    /**
     * A builder for [OutputFileProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fileLocation The file location of the output file.
       */
      public fun fileLocation(fileLocation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.OutputFileProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.OutputFileProperty.builder()

      /**
       * @param fileLocation The file location of the output file.
       */
      override fun fileLocation(fileLocation: String) {
        cdkBuilder.fileLocation(fileLocation)
      }

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.OutputFileProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.OutputFileProperty,
    ) : CdkObject(cdkObject),
        OutputFileProperty {
      /**
       * The file location of the output file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-outputfile.html#cfn-apptest-testcase-outputfile-filelocation)
       */
      override fun fileLocation(): String? = unwrap(this).getFileLocation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputFileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.OutputFileProperty):
          OutputFileProperty = CdkObjectWrappers.wrap(cdkObject) as? OutputFileProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputFileProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.OutputFileProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.OutputFileProperty
    }
  }

  /**
   * Specifies an output.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * OutputProperty outputProperty = OutputProperty.builder()
   * .file(OutputFileProperty.builder()
   * .fileLocation("fileLocation")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-output.html)
   */
  public interface OutputProperty {
    /**
     * The file of the output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-output.html#cfn-apptest-testcase-output-file)
     */
    public fun `file`(): Any

    /**
     * A builder for [OutputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param file The file of the output. 
       */
      public fun `file`(`file`: IResolvable)

      /**
       * @param file The file of the output. 
       */
      public fun `file`(`file`: OutputFileProperty)

      /**
       * @param file The file of the output. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cecd242f1eda71e763716a9774a644f731d090b61ba23b97e7bc88b20ab78c3b")
      public fun `file`(`file`: OutputFileProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.OutputProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.OutputProperty.builder()

      /**
       * @param file The file of the output. 
       */
      override fun `file`(`file`: IResolvable) {
        cdkBuilder.`file`(`file`.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param file The file of the output. 
       */
      override fun `file`(`file`: OutputFileProperty) {
        cdkBuilder.`file`(`file`.let(OutputFileProperty.Companion::unwrap))
      }

      /**
       * @param file The file of the output. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cecd242f1eda71e763716a9774a644f731d090b61ba23b97e7bc88b20ab78c3b")
      override fun `file`(`file`: OutputFileProperty.Builder.() -> Unit): Unit =
          `file`(OutputFileProperty(`file`))

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.OutputProperty,
    ) : CdkObject(cdkObject),
        OutputProperty {
      /**
       * The file of the output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-output.html#cfn-apptest-testcase-output-file)
       */
      override fun `file`(): Any = unwrap(this).getFile()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.OutputProperty):
          OutputProperty = CdkObjectWrappers.wrap(cdkObject) as? OutputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.OutputProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.apptest.CfnTestCase.OutputProperty
    }
  }

  /**
   * Specifies a resource action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * ResourceActionProperty resourceActionProperty = ResourceActionProperty.builder()
   * .cloudFormationAction(CloudFormationActionProperty.builder()
   * .resource("resource")
   * // the properties below are optional
   * .actionType("actionType")
   * .build())
   * .m2ManagedApplicationAction(M2ManagedApplicationActionProperty.builder()
   * .actionType("actionType")
   * .resource("resource")
   * // the properties below are optional
   * .properties(M2ManagedActionPropertiesProperty.builder()
   * .forceStop(false)
   * .importDataSetLocation("importDataSetLocation")
   * .build())
   * .build())
   * .m2NonManagedApplicationAction(M2NonManagedApplicationActionProperty.builder()
   * .actionType("actionType")
   * .resource("resource")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-resourceaction.html)
   */
  public interface ResourceActionProperty {
    /**
     * The CloudFormation action of the resource action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-resourceaction.html#cfn-apptest-testcase-resourceaction-cloudformationaction)
     */
    public fun cloudFormationAction(): Any? = unwrap(this).getCloudFormationAction()

    /**
     * The Mainframe Modernization managed application action of the resource action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-resourceaction.html#cfn-apptest-testcase-resourceaction-m2managedapplicationaction)
     */
    public fun m2ManagedApplicationAction(): Any? = unwrap(this).getM2ManagedApplicationAction()

    /**
     * The Mainframe Modernization non-managed application action of the resource action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-resourceaction.html#cfn-apptest-testcase-resourceaction-m2nonmanagedapplicationaction)
     */
    public fun m2NonManagedApplicationAction(): Any? =
        unwrap(this).getM2NonManagedApplicationAction()

    /**
     * A builder for [ResourceActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudFormationAction The CloudFormation action of the resource action.
       */
      public fun cloudFormationAction(cloudFormationAction: IResolvable)

      /**
       * @param cloudFormationAction The CloudFormation action of the resource action.
       */
      public fun cloudFormationAction(cloudFormationAction: CloudFormationActionProperty)

      /**
       * @param cloudFormationAction The CloudFormation action of the resource action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0775a66d584d398931428bd4b7ea953f8ad2bd15a7fce84dea53c023b4227948")
      public
          fun cloudFormationAction(cloudFormationAction: CloudFormationActionProperty.Builder.() -> Unit)

      /**
       * @param m2ManagedApplicationAction The Mainframe Modernization managed application action of
       * the resource action.
       */
      public fun m2ManagedApplicationAction(m2ManagedApplicationAction: IResolvable)

      /**
       * @param m2ManagedApplicationAction The Mainframe Modernization managed application action of
       * the resource action.
       */
      public
          fun m2ManagedApplicationAction(m2ManagedApplicationAction: M2ManagedApplicationActionProperty)

      /**
       * @param m2ManagedApplicationAction The Mainframe Modernization managed application action of
       * the resource action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33ef903c6260d5dd886a0ee467682811185c48d5f661ca8dffb94b2ff48bbf39")
      public
          fun m2ManagedApplicationAction(m2ManagedApplicationAction: M2ManagedApplicationActionProperty.Builder.() -> Unit)

      /**
       * @param m2NonManagedApplicationAction The Mainframe Modernization non-managed application
       * action of the resource action.
       */
      public fun m2NonManagedApplicationAction(m2NonManagedApplicationAction: IResolvable)

      /**
       * @param m2NonManagedApplicationAction The Mainframe Modernization non-managed application
       * action of the resource action.
       */
      public
          fun m2NonManagedApplicationAction(m2NonManagedApplicationAction: M2NonManagedApplicationActionProperty)

      /**
       * @param m2NonManagedApplicationAction The Mainframe Modernization non-managed application
       * action of the resource action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a94e10f8f972e82ae97d654862c6c766a8ff5bcf0d94b7386796bd653b1b5b4")
      public
          fun m2NonManagedApplicationAction(m2NonManagedApplicationAction: M2NonManagedApplicationActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.ResourceActionProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.ResourceActionProperty.builder()

      /**
       * @param cloudFormationAction The CloudFormation action of the resource action.
       */
      override fun cloudFormationAction(cloudFormationAction: IResolvable) {
        cdkBuilder.cloudFormationAction(cloudFormationAction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cloudFormationAction The CloudFormation action of the resource action.
       */
      override fun cloudFormationAction(cloudFormationAction: CloudFormationActionProperty) {
        cdkBuilder.cloudFormationAction(cloudFormationAction.let(CloudFormationActionProperty.Companion::unwrap))
      }

      /**
       * @param cloudFormationAction The CloudFormation action of the resource action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0775a66d584d398931428bd4b7ea953f8ad2bd15a7fce84dea53c023b4227948")
      override
          fun cloudFormationAction(cloudFormationAction: CloudFormationActionProperty.Builder.() -> Unit):
          Unit = cloudFormationAction(CloudFormationActionProperty(cloudFormationAction))

      /**
       * @param m2ManagedApplicationAction The Mainframe Modernization managed application action of
       * the resource action.
       */
      override fun m2ManagedApplicationAction(m2ManagedApplicationAction: IResolvable) {
        cdkBuilder.m2ManagedApplicationAction(m2ManagedApplicationAction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param m2ManagedApplicationAction The Mainframe Modernization managed application action of
       * the resource action.
       */
      override
          fun m2ManagedApplicationAction(m2ManagedApplicationAction: M2ManagedApplicationActionProperty) {
        cdkBuilder.m2ManagedApplicationAction(m2ManagedApplicationAction.let(M2ManagedApplicationActionProperty.Companion::unwrap))
      }

      /**
       * @param m2ManagedApplicationAction The Mainframe Modernization managed application action of
       * the resource action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("33ef903c6260d5dd886a0ee467682811185c48d5f661ca8dffb94b2ff48bbf39")
      override
          fun m2ManagedApplicationAction(m2ManagedApplicationAction: M2ManagedApplicationActionProperty.Builder.() -> Unit):
          Unit =
          m2ManagedApplicationAction(M2ManagedApplicationActionProperty(m2ManagedApplicationAction))

      /**
       * @param m2NonManagedApplicationAction The Mainframe Modernization non-managed application
       * action of the resource action.
       */
      override fun m2NonManagedApplicationAction(m2NonManagedApplicationAction: IResolvable) {
        cdkBuilder.m2NonManagedApplicationAction(m2NonManagedApplicationAction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param m2NonManagedApplicationAction The Mainframe Modernization non-managed application
       * action of the resource action.
       */
      override
          fun m2NonManagedApplicationAction(m2NonManagedApplicationAction: M2NonManagedApplicationActionProperty) {
        cdkBuilder.m2NonManagedApplicationAction(m2NonManagedApplicationAction.let(M2NonManagedApplicationActionProperty.Companion::unwrap))
      }

      /**
       * @param m2NonManagedApplicationAction The Mainframe Modernization non-managed application
       * action of the resource action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6a94e10f8f972e82ae97d654862c6c766a8ff5bcf0d94b7386796bd653b1b5b4")
      override
          fun m2NonManagedApplicationAction(m2NonManagedApplicationAction: M2NonManagedApplicationActionProperty.Builder.() -> Unit):
          Unit =
          m2NonManagedApplicationAction(M2NonManagedApplicationActionProperty(m2NonManagedApplicationAction))

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.ResourceActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.ResourceActionProperty,
    ) : CdkObject(cdkObject),
        ResourceActionProperty {
      /**
       * The CloudFormation action of the resource action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-resourceaction.html#cfn-apptest-testcase-resourceaction-cloudformationaction)
       */
      override fun cloudFormationAction(): Any? = unwrap(this).getCloudFormationAction()

      /**
       * The Mainframe Modernization managed application action of the resource action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-resourceaction.html#cfn-apptest-testcase-resourceaction-m2managedapplicationaction)
       */
      override fun m2ManagedApplicationAction(): Any? = unwrap(this).getM2ManagedApplicationAction()

      /**
       * The Mainframe Modernization non-managed application action of the resource action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-resourceaction.html#cfn-apptest-testcase-resourceaction-m2nonmanagedapplicationaction)
       */
      override fun m2NonManagedApplicationAction(): Any? =
          unwrap(this).getM2NonManagedApplicationAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.ResourceActionProperty):
          ResourceActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceActionProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.ResourceActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.ResourceActionProperty
    }
  }

  /**
   * Specifies the script.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * ScriptProperty scriptProperty = ScriptProperty.builder()
   * .scriptLocation("scriptLocation")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-script.html)
   */
  public interface ScriptProperty {
    /**
     * The script location of the scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-script.html#cfn-apptest-testcase-script-scriptlocation)
     */
    public fun scriptLocation(): String

    /**
     * The type of the scripts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-script.html#cfn-apptest-testcase-script-type)
     */
    public fun type(): String

    /**
     * A builder for [ScriptProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param scriptLocation The script location of the scripts. 
       */
      public fun scriptLocation(scriptLocation: String)

      /**
       * @param type The type of the scripts. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.ScriptProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.ScriptProperty.builder()

      /**
       * @param scriptLocation The script location of the scripts. 
       */
      override fun scriptLocation(scriptLocation: String) {
        cdkBuilder.scriptLocation(scriptLocation)
      }

      /**
       * @param type The type of the scripts. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.ScriptProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.ScriptProperty,
    ) : CdkObject(cdkObject),
        ScriptProperty {
      /**
       * The script location of the scripts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-script.html#cfn-apptest-testcase-script-scriptlocation)
       */
      override fun scriptLocation(): String = unwrap(this).getScriptLocation()

      /**
       * The type of the scripts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-script.html#cfn-apptest-testcase-script-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScriptProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.ScriptProperty):
          ScriptProperty = CdkObjectWrappers.wrap(cdkObject) as? ScriptProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.ScriptProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.apptest.CfnTestCase.ScriptProperty
    }
  }

  /**
   * Specifies the source database metadata.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * SourceDatabaseMetadataProperty sourceDatabaseMetadataProperty =
   * SourceDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-sourcedatabasemetadata.html)
   */
  public interface SourceDatabaseMetadataProperty {
    /**
     * The capture tool of the source database metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-sourcedatabasemetadata.html#cfn-apptest-testcase-sourcedatabasemetadata-capturetool)
     */
    public fun captureTool(): String

    /**
     * The type of the source database metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-sourcedatabasemetadata.html#cfn-apptest-testcase-sourcedatabasemetadata-type)
     */
    public fun type(): String

    /**
     * A builder for [SourceDatabaseMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param captureTool The capture tool of the source database metadata. 
       */
      public fun captureTool(captureTool: String)

      /**
       * @param type The type of the source database metadata. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.SourceDatabaseMetadataProperty.Builder
          =
          software.amazon.awscdk.services.apptest.CfnTestCase.SourceDatabaseMetadataProperty.builder()

      /**
       * @param captureTool The capture tool of the source database metadata. 
       */
      override fun captureTool(captureTool: String) {
        cdkBuilder.captureTool(captureTool)
      }

      /**
       * @param type The type of the source database metadata. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.apptest.CfnTestCase.SourceDatabaseMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.SourceDatabaseMetadataProperty,
    ) : CdkObject(cdkObject),
        SourceDatabaseMetadataProperty {
      /**
       * The capture tool of the source database metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-sourcedatabasemetadata.html#cfn-apptest-testcase-sourcedatabasemetadata-capturetool)
       */
      override fun captureTool(): String = unwrap(this).getCaptureTool()

      /**
       * The type of the source database metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-sourcedatabasemetadata.html#cfn-apptest-testcase-sourcedatabasemetadata-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SourceDatabaseMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.SourceDatabaseMetadataProperty):
          SourceDatabaseMetadataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SourceDatabaseMetadataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceDatabaseMetadataProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.SourceDatabaseMetadataProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.SourceDatabaseMetadataProperty
    }
  }

  /**
   * Specifies a step action.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * StepActionProperty stepActionProperty = StepActionProperty.builder()
   * .compareAction(CompareActionProperty.builder()
   * .input(InputProperty.builder()
   * .file(InputFileProperty.builder()
   * .fileMetadata(FileMetadataProperty.builder()
   * .databaseCdc(DatabaseCDCProperty.builder()
   * .sourceMetadata(SourceDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .targetMetadata(TargetDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .build())
   * .dataSets(List.of(DataSetProperty.builder()
   * .ccsid("ccsid")
   * .format("format")
   * .length(123)
   * .name("name")
   * .type("type")
   * .build()))
   * .build())
   * .sourceLocation("sourceLocation")
   * .targetLocation("targetLocation")
   * .build())
   * .build())
   * // the properties below are optional
   * .output(OutputProperty.builder()
   * .file(OutputFileProperty.builder()
   * .fileLocation("fileLocation")
   * .build())
   * .build())
   * .build())
   * .mainframeAction(MainframeActionProperty.builder()
   * .actionType(MainframeActionTypeProperty.builder()
   * .batch(BatchProperty.builder()
   * .batchJobName("batchJobName")
   * // the properties below are optional
   * .batchJobParameters(Map.of(
   * "batchJobParametersKey", "batchJobParameters"))
   * .exportDataSetNames(List.of("exportDataSetNames"))
   * .build())
   * .tn3270(TN3270Property.builder()
   * .script(ScriptProperty.builder()
   * .scriptLocation("scriptLocation")
   * .type("type")
   * .build())
   * // the properties below are optional
   * .exportDataSetNames(List.of("exportDataSetNames"))
   * .build())
   * .build())
   * .resource("resource")
   * // the properties below are optional
   * .properties(MainframeActionPropertiesProperty.builder()
   * .dmsTaskArn("dmsTaskArn")
   * .build())
   * .build())
   * .resourceAction(ResourceActionProperty.builder()
   * .cloudFormationAction(CloudFormationActionProperty.builder()
   * .resource("resource")
   * // the properties below are optional
   * .actionType("actionType")
   * .build())
   * .m2ManagedApplicationAction(M2ManagedApplicationActionProperty.builder()
   * .actionType("actionType")
   * .resource("resource")
   * // the properties below are optional
   * .properties(M2ManagedActionPropertiesProperty.builder()
   * .forceStop(false)
   * .importDataSetLocation("importDataSetLocation")
   * .build())
   * .build())
   * .m2NonManagedApplicationAction(M2NonManagedApplicationActionProperty.builder()
   * .actionType("actionType")
   * .resource("resource")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-stepaction.html)
   */
  public interface StepActionProperty {
    /**
     * The compare action of the step action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-stepaction.html#cfn-apptest-testcase-stepaction-compareaction)
     */
    public fun compareAction(): Any? = unwrap(this).getCompareAction()

    /**
     * The mainframe action of the step action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-stepaction.html#cfn-apptest-testcase-stepaction-mainframeaction)
     */
    public fun mainframeAction(): Any? = unwrap(this).getMainframeAction()

    /**
     * The resource action of the step action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-stepaction.html#cfn-apptest-testcase-stepaction-resourceaction)
     */
    public fun resourceAction(): Any? = unwrap(this).getResourceAction()

    /**
     * A builder for [StepActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param compareAction The compare action of the step action.
       */
      public fun compareAction(compareAction: IResolvable)

      /**
       * @param compareAction The compare action of the step action.
       */
      public fun compareAction(compareAction: CompareActionProperty)

      /**
       * @param compareAction The compare action of the step action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38230f0db88d60f407c2eef3f29aee7552f8c8492234dc866ce931c1e7d8343e")
      public fun compareAction(compareAction: CompareActionProperty.Builder.() -> Unit)

      /**
       * @param mainframeAction The mainframe action of the step action.
       */
      public fun mainframeAction(mainframeAction: IResolvable)

      /**
       * @param mainframeAction The mainframe action of the step action.
       */
      public fun mainframeAction(mainframeAction: MainframeActionProperty)

      /**
       * @param mainframeAction The mainframe action of the step action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88fe29815036d357ae72af885721e9ba4fd008e52ffb90fadf442ece85bc0739")
      public fun mainframeAction(mainframeAction: MainframeActionProperty.Builder.() -> Unit)

      /**
       * @param resourceAction The resource action of the step action.
       */
      public fun resourceAction(resourceAction: IResolvable)

      /**
       * @param resourceAction The resource action of the step action.
       */
      public fun resourceAction(resourceAction: ResourceActionProperty)

      /**
       * @param resourceAction The resource action of the step action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e22dfab5bccda5871aa9fdb69cbf00b842a1a7bbdcf6253113a032d11aaa951b")
      public fun resourceAction(resourceAction: ResourceActionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.StepActionProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.StepActionProperty.builder()

      /**
       * @param compareAction The compare action of the step action.
       */
      override fun compareAction(compareAction: IResolvable) {
        cdkBuilder.compareAction(compareAction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param compareAction The compare action of the step action.
       */
      override fun compareAction(compareAction: CompareActionProperty) {
        cdkBuilder.compareAction(compareAction.let(CompareActionProperty.Companion::unwrap))
      }

      /**
       * @param compareAction The compare action of the step action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38230f0db88d60f407c2eef3f29aee7552f8c8492234dc866ce931c1e7d8343e")
      override fun compareAction(compareAction: CompareActionProperty.Builder.() -> Unit): Unit =
          compareAction(CompareActionProperty(compareAction))

      /**
       * @param mainframeAction The mainframe action of the step action.
       */
      override fun mainframeAction(mainframeAction: IResolvable) {
        cdkBuilder.mainframeAction(mainframeAction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mainframeAction The mainframe action of the step action.
       */
      override fun mainframeAction(mainframeAction: MainframeActionProperty) {
        cdkBuilder.mainframeAction(mainframeAction.let(MainframeActionProperty.Companion::unwrap))
      }

      /**
       * @param mainframeAction The mainframe action of the step action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88fe29815036d357ae72af885721e9ba4fd008e52ffb90fadf442ece85bc0739")
      override fun mainframeAction(mainframeAction: MainframeActionProperty.Builder.() -> Unit):
          Unit = mainframeAction(MainframeActionProperty(mainframeAction))

      /**
       * @param resourceAction The resource action of the step action.
       */
      override fun resourceAction(resourceAction: IResolvable) {
        cdkBuilder.resourceAction(resourceAction.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param resourceAction The resource action of the step action.
       */
      override fun resourceAction(resourceAction: ResourceActionProperty) {
        cdkBuilder.resourceAction(resourceAction.let(ResourceActionProperty.Companion::unwrap))
      }

      /**
       * @param resourceAction The resource action of the step action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e22dfab5bccda5871aa9fdb69cbf00b842a1a7bbdcf6253113a032d11aaa951b")
      override fun resourceAction(resourceAction: ResourceActionProperty.Builder.() -> Unit): Unit =
          resourceAction(ResourceActionProperty(resourceAction))

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.StepActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.StepActionProperty,
    ) : CdkObject(cdkObject),
        StepActionProperty {
      /**
       * The compare action of the step action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-stepaction.html#cfn-apptest-testcase-stepaction-compareaction)
       */
      override fun compareAction(): Any? = unwrap(this).getCompareAction()

      /**
       * The mainframe action of the step action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-stepaction.html#cfn-apptest-testcase-stepaction-mainframeaction)
       */
      override fun mainframeAction(): Any? = unwrap(this).getMainframeAction()

      /**
       * The resource action of the step action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-stepaction.html#cfn-apptest-testcase-stepaction-resourceaction)
       */
      override fun resourceAction(): Any? = unwrap(this).getResourceAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StepActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.StepActionProperty):
          StepActionProperty = CdkObjectWrappers.wrap(cdkObject) as? StepActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepActionProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.StepActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.StepActionProperty
    }
  }

  /**
   * Defines a step.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * StepProperty stepProperty = StepProperty.builder()
   * .action(StepActionProperty.builder()
   * .compareAction(CompareActionProperty.builder()
   * .input(InputProperty.builder()
   * .file(InputFileProperty.builder()
   * .fileMetadata(FileMetadataProperty.builder()
   * .databaseCdc(DatabaseCDCProperty.builder()
   * .sourceMetadata(SourceDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .targetMetadata(TargetDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build())
   * .build())
   * .dataSets(List.of(DataSetProperty.builder()
   * .ccsid("ccsid")
   * .format("format")
   * .length(123)
   * .name("name")
   * .type("type")
   * .build()))
   * .build())
   * .sourceLocation("sourceLocation")
   * .targetLocation("targetLocation")
   * .build())
   * .build())
   * // the properties below are optional
   * .output(OutputProperty.builder()
   * .file(OutputFileProperty.builder()
   * .fileLocation("fileLocation")
   * .build())
   * .build())
   * .build())
   * .mainframeAction(MainframeActionProperty.builder()
   * .actionType(MainframeActionTypeProperty.builder()
   * .batch(BatchProperty.builder()
   * .batchJobName("batchJobName")
   * // the properties below are optional
   * .batchJobParameters(Map.of(
   * "batchJobParametersKey", "batchJobParameters"))
   * .exportDataSetNames(List.of("exportDataSetNames"))
   * .build())
   * .tn3270(TN3270Property.builder()
   * .script(ScriptProperty.builder()
   * .scriptLocation("scriptLocation")
   * .type("type")
   * .build())
   * // the properties below are optional
   * .exportDataSetNames(List.of("exportDataSetNames"))
   * .build())
   * .build())
   * .resource("resource")
   * // the properties below are optional
   * .properties(MainframeActionPropertiesProperty.builder()
   * .dmsTaskArn("dmsTaskArn")
   * .build())
   * .build())
   * .resourceAction(ResourceActionProperty.builder()
   * .cloudFormationAction(CloudFormationActionProperty.builder()
   * .resource("resource")
   * // the properties below are optional
   * .actionType("actionType")
   * .build())
   * .m2ManagedApplicationAction(M2ManagedApplicationActionProperty.builder()
   * .actionType("actionType")
   * .resource("resource")
   * // the properties below are optional
   * .properties(M2ManagedActionPropertiesProperty.builder()
   * .forceStop(false)
   * .importDataSetLocation("importDataSetLocation")
   * .build())
   * .build())
   * .m2NonManagedApplicationAction(M2NonManagedApplicationActionProperty.builder()
   * .actionType("actionType")
   * .resource("resource")
   * .build())
   * .build())
   * .build())
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-step.html)
   */
  public interface StepProperty {
    /**
     * The action of the step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-step.html#cfn-apptest-testcase-step-action)
     */
    public fun action(): Any

    /**
     * The description of the step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-step.html#cfn-apptest-testcase-step-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the step.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-step.html#cfn-apptest-testcase-step-name)
     */
    public fun name(): String

    /**
     * A builder for [StepProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action of the step. 
       */
      public fun action(action: IResolvable)

      /**
       * @param action The action of the step. 
       */
      public fun action(action: StepActionProperty)

      /**
       * @param action The action of the step. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d544d32141cd16c4048bf7a7d59815b9329ee697b9e039fd6b9fc1c58a9a7cf3")
      public fun action(action: StepActionProperty.Builder.() -> Unit)

      /**
       * @param description The description of the step.
       */
      public fun description(description: String)

      /**
       * @param name The name of the step. 
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.StepProperty.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.StepProperty.builder()

      /**
       * @param action The action of the step. 
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param action The action of the step. 
       */
      override fun action(action: StepActionProperty) {
        cdkBuilder.action(action.let(StepActionProperty.Companion::unwrap))
      }

      /**
       * @param action The action of the step. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d544d32141cd16c4048bf7a7d59815b9329ee697b9e039fd6b9fc1c58a9a7cf3")
      override fun action(action: StepActionProperty.Builder.() -> Unit): Unit =
          action(StepActionProperty(action))

      /**
       * @param description The description of the step.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param name The name of the step. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.StepProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.StepProperty,
    ) : CdkObject(cdkObject),
        StepProperty {
      /**
       * The action of the step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-step.html#cfn-apptest-testcase-step-action)
       */
      override fun action(): Any = unwrap(this).getAction()

      /**
       * The description of the step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-step.html#cfn-apptest-testcase-step-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The name of the step.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-step.html#cfn-apptest-testcase-step-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StepProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.StepProperty):
          StepProperty = CdkObjectWrappers.wrap(cdkObject) as? StepProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.StepProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.apptest.CfnTestCase.StepProperty
    }
  }

  /**
   * Specifies the TN3270 protocol.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * TN3270Property tN3270Property = TN3270Property.builder()
   * .script(ScriptProperty.builder()
   * .scriptLocation("scriptLocation")
   * .type("type")
   * .build())
   * // the properties below are optional
   * .exportDataSetNames(List.of("exportDataSetNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-tn3270.html)
   */
  public interface TN3270Property {
    /**
     * The data set names of the TN3270 protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-tn3270.html#cfn-apptest-testcase-tn3270-exportdatasetnames)
     */
    public fun exportDataSetNames(): List<String> = unwrap(this).getExportDataSetNames() ?:
        emptyList()

    /**
     * The script of the TN3270 protocol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-tn3270.html#cfn-apptest-testcase-tn3270-script)
     */
    public fun script(): Any

    /**
     * A builder for [TN3270Property]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param exportDataSetNames The data set names of the TN3270 protocol.
       */
      public fun exportDataSetNames(exportDataSetNames: List<String>)

      /**
       * @param exportDataSetNames The data set names of the TN3270 protocol.
       */
      public fun exportDataSetNames(vararg exportDataSetNames: String)

      /**
       * @param script The script of the TN3270 protocol. 
       */
      public fun script(script: IResolvable)

      /**
       * @param script The script of the TN3270 protocol. 
       */
      public fun script(script: ScriptProperty)

      /**
       * @param script The script of the TN3270 protocol. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("08c3ae5d104a7649bcced85d6a3fe3dce1a0ce9a24e68b5018459656144a8946")
      public fun script(script: ScriptProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.TN3270Property.Builder =
          software.amazon.awscdk.services.apptest.CfnTestCase.TN3270Property.builder()

      /**
       * @param exportDataSetNames The data set names of the TN3270 protocol.
       */
      override fun exportDataSetNames(exportDataSetNames: List<String>) {
        cdkBuilder.exportDataSetNames(exportDataSetNames)
      }

      /**
       * @param exportDataSetNames The data set names of the TN3270 protocol.
       */
      override fun exportDataSetNames(vararg exportDataSetNames: String): Unit =
          exportDataSetNames(exportDataSetNames.toList())

      /**
       * @param script The script of the TN3270 protocol. 
       */
      override fun script(script: IResolvable) {
        cdkBuilder.script(script.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param script The script of the TN3270 protocol. 
       */
      override fun script(script: ScriptProperty) {
        cdkBuilder.script(script.let(ScriptProperty.Companion::unwrap))
      }

      /**
       * @param script The script of the TN3270 protocol. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("08c3ae5d104a7649bcced85d6a3fe3dce1a0ce9a24e68b5018459656144a8946")
      override fun script(script: ScriptProperty.Builder.() -> Unit): Unit =
          script(ScriptProperty(script))

      public fun build(): software.amazon.awscdk.services.apptest.CfnTestCase.TN3270Property =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.TN3270Property,
    ) : CdkObject(cdkObject),
        TN3270Property {
      /**
       * The data set names of the TN3270 protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-tn3270.html#cfn-apptest-testcase-tn3270-exportdatasetnames)
       */
      override fun exportDataSetNames(): List<String> = unwrap(this).getExportDataSetNames() ?:
          emptyList()

      /**
       * The script of the TN3270 protocol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-tn3270.html#cfn-apptest-testcase-tn3270-script)
       */
      override fun script(): Any = unwrap(this).getScript()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TN3270Property {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.TN3270Property):
          TN3270Property = CdkObjectWrappers.wrap(cdkObject) as? TN3270Property ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TN3270Property):
          software.amazon.awscdk.services.apptest.CfnTestCase.TN3270Property = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.apptest.CfnTestCase.TN3270Property
    }
  }

  /**
   * Specifies a target database metadata.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * TargetDatabaseMetadataProperty targetDatabaseMetadataProperty =
   * TargetDatabaseMetadataProperty.builder()
   * .captureTool("captureTool")
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-targetdatabasemetadata.html)
   */
  public interface TargetDatabaseMetadataProperty {
    /**
     * The capture tool of the target database metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-targetdatabasemetadata.html#cfn-apptest-testcase-targetdatabasemetadata-capturetool)
     */
    public fun captureTool(): String

    /**
     * The type of the target database metadata.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-targetdatabasemetadata.html#cfn-apptest-testcase-targetdatabasemetadata-type)
     */
    public fun type(): String

    /**
     * A builder for [TargetDatabaseMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param captureTool The capture tool of the target database metadata. 
       */
      public fun captureTool(captureTool: String)

      /**
       * @param type The type of the target database metadata. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.TargetDatabaseMetadataProperty.Builder
          =
          software.amazon.awscdk.services.apptest.CfnTestCase.TargetDatabaseMetadataProperty.builder()

      /**
       * @param captureTool The capture tool of the target database metadata. 
       */
      override fun captureTool(captureTool: String) {
        cdkBuilder.captureTool(captureTool)
      }

      /**
       * @param type The type of the target database metadata. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.apptest.CfnTestCase.TargetDatabaseMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.TargetDatabaseMetadataProperty,
    ) : CdkObject(cdkObject),
        TargetDatabaseMetadataProperty {
      /**
       * The capture tool of the target database metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-targetdatabasemetadata.html#cfn-apptest-testcase-targetdatabasemetadata-capturetool)
       */
      override fun captureTool(): String = unwrap(this).getCaptureTool()

      /**
       * The type of the target database metadata.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-targetdatabasemetadata.html#cfn-apptest-testcase-targetdatabasemetadata-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetDatabaseMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.TargetDatabaseMetadataProperty):
          TargetDatabaseMetadataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetDatabaseMetadataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetDatabaseMetadataProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.TargetDatabaseMetadataProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.TargetDatabaseMetadataProperty
    }
  }

  /**
   * Specifies the latest version of a test case.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apptest.*;
   * TestCaseLatestVersionProperty testCaseLatestVersionProperty =
   * TestCaseLatestVersionProperty.builder()
   * .status("status")
   * .version(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-testcaselatestversion.html)
   */
  public interface TestCaseLatestVersionProperty {
    /**
     * The status of the test case latest version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-testcaselatestversion.html#cfn-apptest-testcase-testcaselatestversion-status)
     */
    public fun status(): String

    /**
     * The version of the test case latest version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-testcaselatestversion.html#cfn-apptest-testcase-testcaselatestversion-version)
     */
    public fun version(): Number

    /**
     * A builder for [TestCaseLatestVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param status The status of the test case latest version. 
       */
      public fun status(status: String)

      /**
       * @param version The version of the test case latest version. 
       */
      public fun version(version: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apptest.CfnTestCase.TestCaseLatestVersionProperty.Builder
          =
          software.amazon.awscdk.services.apptest.CfnTestCase.TestCaseLatestVersionProperty.builder()

      /**
       * @param status The status of the test case latest version. 
       */
      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      /**
       * @param version The version of the test case latest version. 
       */
      override fun version(version: Number) {
        cdkBuilder.version(version)
      }

      public fun build():
          software.amazon.awscdk.services.apptest.CfnTestCase.TestCaseLatestVersionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.TestCaseLatestVersionProperty,
    ) : CdkObject(cdkObject),
        TestCaseLatestVersionProperty {
      /**
       * The status of the test case latest version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-testcaselatestversion.html#cfn-apptest-testcase-testcaselatestversion-status)
       */
      override fun status(): String = unwrap(this).getStatus()

      /**
       * The version of the test case latest version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apptest-testcase-testcaselatestversion.html#cfn-apptest-testcase-testcaselatestversion-version)
       */
      override fun version(): Number = unwrap(this).getVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TestCaseLatestVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCase.TestCaseLatestVersionProperty):
          TestCaseLatestVersionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TestCaseLatestVersionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TestCaseLatestVersionProperty):
          software.amazon.awscdk.services.apptest.CfnTestCase.TestCaseLatestVersionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apptest.CfnTestCase.TestCaseLatestVersionProperty
    }
  }
}
