@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnWorkflow`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object defaultRunProperties;
 * Object tags;
 * CfnWorkflowProps cfnWorkflowProps = CfnWorkflowProps.builder()
 * .defaultRunProperties(defaultRunProperties)
 * .description("description")
 * .maxConcurrentRuns(123)
 * .name("name")
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html)
 */
public interface CfnWorkflowProps {
  /**
   * A collection of properties to be used as part of each execution of the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-defaultrunproperties)
   */
  public fun defaultRunProperties(): Any? = unwrap(this).getDefaultRunProperties()

  /**
   * A description of the workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or
   * in some cases, to prevent exceeding the maximum number of concurrent runs of any of the component
   * jobs.
   *
   * If you leave this parameter blank, there is no limit to the number of concurrent workflow runs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-maxconcurrentruns)
   */
  public fun maxConcurrentRuns(): Number? = unwrap(this).getMaxConcurrentRuns()

  /**
   * The name of the workflow representing the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags to use with this workflow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnWorkflowProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultRunProperties A collection of properties to be used as part of each execution
     * of the workflow.
     */
    public fun defaultRunProperties(defaultRunProperties: Any)

    /**
     * @param description A description of the workflow.
     */
    public fun description(description: String)

    /**
     * @param maxConcurrentRuns You can use this parameter to prevent unwanted multiple updates to
     * data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent
     * runs of any of the component jobs.
     * If you leave this parameter blank, there is no limit to the number of concurrent workflow
     * runs.
     */
    public fun maxConcurrentRuns(maxConcurrentRuns: Number)

    /**
     * @param name The name of the workflow representing the flow.
     */
    public fun name(name: String)

    /**
     * @param tags The tags to use with this workflow.
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnWorkflowProps.Builder =
        software.amazon.awscdk.services.glue.CfnWorkflowProps.builder()

    /**
     * @param defaultRunProperties A collection of properties to be used as part of each execution
     * of the workflow.
     */
    override fun defaultRunProperties(defaultRunProperties: Any) {
      cdkBuilder.defaultRunProperties(defaultRunProperties)
    }

    /**
     * @param description A description of the workflow.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param maxConcurrentRuns You can use this parameter to prevent unwanted multiple updates to
     * data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent
     * runs of any of the component jobs.
     * If you leave this parameter blank, there is no limit to the number of concurrent workflow
     * runs.
     */
    override fun maxConcurrentRuns(maxConcurrentRuns: Number) {
      cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
    }

    /**
     * @param name The name of the workflow representing the flow.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags to use with this workflow.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnWorkflowProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.glue.CfnWorkflowProps,
  ) : CdkObject(cdkObject), CfnWorkflowProps {
    /**
     * A collection of properties to be used as part of each execution of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-defaultrunproperties)
     */
    override fun defaultRunProperties(): Any? = unwrap(this).getDefaultRunProperties()

    /**
     * A description of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or
     * in some cases, to prevent exceeding the maximum number of concurrent runs of any of the
     * component jobs.
     *
     * If you leave this parameter blank, there is no limit to the number of concurrent workflow
     * runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-maxconcurrentruns)
     */
    override fun maxConcurrentRuns(): Number? = unwrap(this).getMaxConcurrentRuns()

    /**
     * The name of the workflow representing the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags to use with this workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkflowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnWorkflowProps):
        CfnWorkflowProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkflowProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflowProps):
        software.amazon.awscdk.services.glue.CfnWorkflowProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnWorkflowProps
  }
}
