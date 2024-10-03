@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apptest

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for defining a `CfnTestCase`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apptest.*;
 * CfnTestCaseProps cfnTestCaseProps = CfnTestCaseProps.builder()
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
public interface CfnTestCaseProps {
  /**
   * The description of the test case.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the test case.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-name)
   */
  public fun name(): String

  /**
   * The steps in the test case.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-steps)
   */
  public fun steps(): Any

  /**
   * The specified tags of the test case.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnTestCaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the test case.
     */
    public fun description(description: String)

    /**
     * @param name The name of the test case. 
     */
    public fun name(name: String)

    /**
     * @param steps The steps in the test case. 
     */
    public fun steps(steps: IResolvable)

    /**
     * @param steps The steps in the test case. 
     */
    public fun steps(steps: List<Any>)

    /**
     * @param steps The steps in the test case. 
     */
    public fun steps(vararg steps: Any)

    /**
     * @param tags The specified tags of the test case.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apptest.CfnTestCaseProps.Builder =
        software.amazon.awscdk.services.apptest.CfnTestCaseProps.builder()

    /**
     * @param description The description of the test case.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the test case. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param steps The steps in the test case. 
     */
    override fun steps(steps: IResolvable) {
      cdkBuilder.steps(steps.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param steps The steps in the test case. 
     */
    override fun steps(steps: List<Any>) {
      cdkBuilder.steps(steps.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param steps The steps in the test case. 
     */
    override fun steps(vararg steps: Any): Unit = steps(steps.toList())

    /**
     * @param tags The specified tags of the test case.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.apptest.CfnTestCaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apptest.CfnTestCaseProps,
  ) : CdkObject(cdkObject),
      CfnTestCaseProps {
    /**
     * The description of the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The steps in the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-steps)
     */
    override fun steps(): Any = unwrap(this).getSteps()

    /**
     * The specified tags of the test case.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apptest-testcase.html#cfn-apptest-testcase-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTestCaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apptest.CfnTestCaseProps):
        CfnTestCaseProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTestCaseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTestCaseProps):
        software.amazon.awscdk.services.apptest.CfnTestCaseProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apptest.CfnTestCaseProps
  }
}
