@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an environment for a queue that defines how jobs in the queue run.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnQueueEnvironment cfnQueueEnvironment = CfnQueueEnvironment.Builder.create(this,
 * "MyCfnQueueEnvironment")
 * .farmId("farmId")
 * .priority(123)
 * .queueId("queueId")
 * .template("template")
 * .templateType("templateType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html)
 */
public open class CfnQueueEnvironment(
  cdkObject: software.amazon.awscdk.services.deadline.CfnQueueEnvironment,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueEnvironmentProps,
  ) :
      this(software.amazon.awscdk.services.deadline.CfnQueueEnvironment(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnQueueEnvironmentProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueEnvironmentProps.Builder.() -> Unit,
  ) : this(scope, id, CfnQueueEnvironmentProps(props)
  )

  /**
   * The name of the queue environment.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The queue environment ID.
   */
  public open fun attrQueueEnvironmentId(): String = unwrap(this).getAttrQueueEnvironmentId()

  /**
   * The identifier assigned to the farm that contains the queue.
   */
  public open fun farmId(): String = unwrap(this).getFarmId()

  /**
   * The identifier assigned to the farm that contains the queue.
   */
  public open fun farmId(`value`: String) {
    unwrap(this).setFarmId(`value`)
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
   * The queue environment's priority.
   */
  public open fun priority(): Number = unwrap(this).getPriority()

  /**
   * The queue environment's priority.
   */
  public open fun priority(`value`: Number) {
    unwrap(this).setPriority(`value`)
  }

  /**
   * The unique identifier of the queue that contains the environment.
   */
  public open fun queueId(): String = unwrap(this).getQueueId()

  /**
   * The unique identifier of the queue that contains the environment.
   */
  public open fun queueId(`value`: String) {
    unwrap(this).setQueueId(`value`)
  }

  /**
   * A JSON or YAML template that describes the processing environment for the queue.
   */
  public open fun template(): String = unwrap(this).getTemplate()

  /**
   * A JSON or YAML template that describes the processing environment for the queue.
   */
  public open fun template(`value`: String) {
    unwrap(this).setTemplate(`value`)
  }

  /**
   * Specifies whether the template for the queue environment is JSON or YAML.
   */
  public open fun templateType(): String = unwrap(this).getTemplateType()

  /**
   * Specifies whether the template for the queue environment is JSON or YAML.
   */
  public open fun templateType(`value`: String) {
    unwrap(this).setTemplateType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.deadline.CfnQueueEnvironment].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier assigned to the farm that contains the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-farmid)
     * @param farmId The identifier assigned to the farm that contains the queue. 
     */
    public fun farmId(farmId: String)

    /**
     * The queue environment's priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-priority)
     * @param priority The queue environment's priority. 
     */
    public fun priority(priority: Number)

    /**
     * The unique identifier of the queue that contains the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-queueid)
     * @param queueId The unique identifier of the queue that contains the environment. 
     */
    public fun queueId(queueId: String)

    /**
     * A JSON or YAML template that describes the processing environment for the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-template)
     * @param template A JSON or YAML template that describes the processing environment for the
     * queue. 
     */
    public fun template(template: String)

    /**
     * Specifies whether the template for the queue environment is JSON or YAML.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-templatetype)
     * @param templateType Specifies whether the template for the queue environment is JSON or YAML.
     * 
     */
    public fun templateType(templateType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.deadline.CfnQueueEnvironment.Builder =
        software.amazon.awscdk.services.deadline.CfnQueueEnvironment.Builder.create(scope, id)

    /**
     * The identifier assigned to the farm that contains the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-farmid)
     * @param farmId The identifier assigned to the farm that contains the queue. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * The queue environment's priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-priority)
     * @param priority The queue environment's priority. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * The unique identifier of the queue that contains the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-queueid)
     * @param queueId The unique identifier of the queue that contains the environment. 
     */
    override fun queueId(queueId: String) {
      cdkBuilder.queueId(queueId)
    }

    /**
     * A JSON or YAML template that describes the processing environment for the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-template)
     * @param template A JSON or YAML template that describes the processing environment for the
     * queue. 
     */
    override fun template(template: String) {
      cdkBuilder.template(template)
    }

    /**
     * Specifies whether the template for the queue environment is JSON or YAML.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-templatetype)
     * @param templateType Specifies whether the template for the queue environment is JSON or YAML.
     * 
     */
    override fun templateType(templateType: String) {
      cdkBuilder.templateType(templateType)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnQueueEnvironment =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.deadline.CfnQueueEnvironment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueueEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueueEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueueEnvironment):
        CfnQueueEnvironment = CfnQueueEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnQueueEnvironment):
        software.amazon.awscdk.services.deadline.CfnQueueEnvironment = wrapped.cdkObject as
        software.amazon.awscdk.services.deadline.CfnQueueEnvironment
  }
}
