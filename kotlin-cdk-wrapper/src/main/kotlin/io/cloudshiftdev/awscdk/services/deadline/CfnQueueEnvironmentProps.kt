@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnQueueEnvironment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnQueueEnvironmentProps cfnQueueEnvironmentProps = CfnQueueEnvironmentProps.builder()
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
public interface CfnQueueEnvironmentProps {
  /**
   * The identifier assigned to the farm that contains the queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-farmid)
   */
  public fun farmId(): String

  /**
   * The queue environment's priority.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-priority)
   */
  public fun priority(): Number

  /**
   * The unique identifier of the queue that contains the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-queueid)
   */
  public fun queueId(): String

  /**
   * A JSON or YAML template that describes the processing environment for the queue.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-template)
   */
  public fun template(): String

  /**
   * Specifies whether the template for the queue environment is JSON or YAML.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-templatetype)
   */
  public fun templateType(): String

  /**
   * A builder for [CfnQueueEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param farmId The identifier assigned to the farm that contains the queue. 
     */
    public fun farmId(farmId: String)

    /**
     * @param priority The queue environment's priority. 
     */
    public fun priority(priority: Number)

    /**
     * @param queueId The unique identifier of the queue that contains the environment. 
     */
    public fun queueId(queueId: String)

    /**
     * @param template A JSON or YAML template that describes the processing environment for the
     * queue. 
     */
    public fun template(template: String)

    /**
     * @param templateType Specifies whether the template for the queue environment is JSON or YAML.
     * 
     */
    public fun templateType(templateType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.deadline.CfnQueueEnvironmentProps.Builder =
        software.amazon.awscdk.services.deadline.CfnQueueEnvironmentProps.builder()

    /**
     * @param farmId The identifier assigned to the farm that contains the queue. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * @param priority The queue environment's priority. 
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    /**
     * @param queueId The unique identifier of the queue that contains the environment. 
     */
    override fun queueId(queueId: String) {
      cdkBuilder.queueId(queueId)
    }

    /**
     * @param template A JSON or YAML template that describes the processing environment for the
     * queue. 
     */
    override fun template(template: String) {
      cdkBuilder.template(template)
    }

    /**
     * @param templateType Specifies whether the template for the queue environment is JSON or YAML.
     * 
     */
    override fun templateType(templateType: String) {
      cdkBuilder.templateType(templateType)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnQueueEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnQueueEnvironmentProps,
  ) : CdkObject(cdkObject),
      CfnQueueEnvironmentProps {
    /**
     * The identifier assigned to the farm that contains the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-farmid)
     */
    override fun farmId(): String = unwrap(this).getFarmId()

    /**
     * The queue environment's priority.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-priority)
     */
    override fun priority(): Number = unwrap(this).getPriority()

    /**
     * The unique identifier of the queue that contains the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-queueid)
     */
    override fun queueId(): String = unwrap(this).getQueueId()

    /**
     * A JSON or YAML template that describes the processing environment for the queue.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-template)
     */
    override fun template(): String = unwrap(this).getTemplate()

    /**
     * Specifies whether the template for the queue environment is JSON or YAML.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queueenvironment.html#cfn-deadline-queueenvironment-templatetype)
     */
    override fun templateType(): String = unwrap(this).getTemplateType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueueEnvironmentProps):
        CfnQueueEnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnQueueEnvironmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueEnvironmentProps):
        software.amazon.awscdk.services.deadline.CfnQueueEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.deadline.CfnQueueEnvironmentProps
  }
}
