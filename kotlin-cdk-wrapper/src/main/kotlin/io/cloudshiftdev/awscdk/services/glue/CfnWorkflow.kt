@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Glue::Workflow` is an AWS Glue resource type that manages AWS Glue workflows.
 *
 * A workflow is a container for a set of related jobs, crawlers, and triggers in AWS Glue . Using a
 * workflow, you can design a complex multi-job extract, transform, and load (ETL) activity that AWS
 * Glue can execute and track as single entity.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object defaultRunProperties;
 * Object tags;
 * CfnWorkflow cfnWorkflow = CfnWorkflow.Builder.create(this, "MyCfnWorkflow")
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
public open class CfnWorkflow internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnWorkflow,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A collection of properties to be used as part of each execution of the workflow.
   */
  public open fun defaultRunProperties(): Any? = unwrap(this).getDefaultRunProperties()

  /**
   * A collection of properties to be used as part of each execution of the workflow.
   */
  public open fun defaultRunProperties(`value`: Any) {
    unwrap(this).setDefaultRunProperties(`value`)
  }

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
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or
   * in some cases, to prevent exceeding the maximum number of concurrent runs of any of the component
   * jobs.
   */
  public open fun maxConcurrentRuns(): Number? = unwrap(this).getMaxConcurrentRuns()

  /**
   * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or
   * in some cases, to prevent exceeding the maximum number of concurrent runs of any of the component
   * jobs.
   */
  public open fun maxConcurrentRuns(`value`: Number) {
    unwrap(this).setMaxConcurrentRuns(`value`)
  }

  /**
   * The name of the workflow representing the flow.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the workflow representing the flow.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to use with this workflow.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * The tags to use with this workflow.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnWorkflow].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A collection of properties to be used as part of each execution of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-defaultrunproperties)
     * @param defaultRunProperties A collection of properties to be used as part of each execution
     * of the workflow. 
     */
    public fun defaultRunProperties(defaultRunProperties: Any)

    /**
     * A description of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-description)
     * @param description A description of the workflow. 
     */
    public fun description(description: String)

    /**
     * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or
     * in some cases, to prevent exceeding the maximum number of concurrent runs of any of the
     * component jobs.
     *
     * If you leave this parameter blank, there is no limit to the number of concurrent workflow
     * runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-maxconcurrentruns)
     * @param maxConcurrentRuns You can use this parameter to prevent unwanted multiple updates to
     * data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent
     * runs of any of the component jobs. 
     */
    public fun maxConcurrentRuns(maxConcurrentRuns: Number)

    /**
     * The name of the workflow representing the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-name)
     * @param name The name of the workflow representing the flow. 
     */
    public fun name(name: String)

    /**
     * The tags to use with this workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-tags)
     * @param tags The tags to use with this workflow. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnWorkflow.Builder =
        software.amazon.awscdk.services.glue.CfnWorkflow.Builder.create(scope, id)

    /**
     * A collection of properties to be used as part of each execution of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-defaultrunproperties)
     * @param defaultRunProperties A collection of properties to be used as part of each execution
     * of the workflow. 
     */
    override fun defaultRunProperties(defaultRunProperties: Any) {
      cdkBuilder.defaultRunProperties(defaultRunProperties)
    }

    /**
     * A description of the workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-description)
     * @param description A description of the workflow. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * You can use this parameter to prevent unwanted multiple updates to data, to control costs, or
     * in some cases, to prevent exceeding the maximum number of concurrent runs of any of the
     * component jobs.
     *
     * If you leave this parameter blank, there is no limit to the number of concurrent workflow
     * runs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-maxconcurrentruns)
     * @param maxConcurrentRuns You can use this parameter to prevent unwanted multiple updates to
     * data, to control costs, or in some cases, to prevent exceeding the maximum number of concurrent
     * runs of any of the component jobs. 
     */
    override fun maxConcurrentRuns(maxConcurrentRuns: Number) {
      cdkBuilder.maxConcurrentRuns(maxConcurrentRuns)
    }

    /**
     * The name of the workflow representing the flow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-name)
     * @param name The name of the workflow representing the flow. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags to use with this workflow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-workflow.html#cfn-glue-workflow-tags)
     * @param tags The tags to use with this workflow. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnWorkflow = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnWorkflow.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkflow {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkflow(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnWorkflow): CfnWorkflow =
        CfnWorkflow(cdkObject)

    internal fun unwrap(wrapped: CfnWorkflow): software.amazon.awscdk.services.glue.CfnWorkflow =
        wrapped.cdkObject
  }
}
