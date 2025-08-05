@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnQueueLimitAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnQueueLimitAssociationProps cfnQueueLimitAssociationProps =
 * CfnQueueLimitAssociationProps.builder()
 * .farmId("farmId")
 * .limitId("limitId")
 * .queueId("queueId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html)
 */
public interface CfnQueueLimitAssociationProps {
  /**
   * The unique identifier of the farm that contains the queue-limit association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-farmid)
   */
  public fun farmId(): String

  /**
   * The unique identifier of the limit in the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-limitid)
   */
  public fun limitId(): String

  /**
   * The unique identifier of the queue in the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-queueid)
   */
  public fun queueId(): String

  /**
   * A builder for [CfnQueueLimitAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param farmId The unique identifier of the farm that contains the queue-limit association. 
     */
    public fun farmId(farmId: String)

    /**
     * @param limitId The unique identifier of the limit in the association. 
     */
    public fun limitId(limitId: String)

    /**
     * @param queueId The unique identifier of the queue in the association. 
     */
    public fun queueId(queueId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.deadline.CfnQueueLimitAssociationProps.Builder =
        software.amazon.awscdk.services.deadline.CfnQueueLimitAssociationProps.builder()

    /**
     * @param farmId The unique identifier of the farm that contains the queue-limit association. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * @param limitId The unique identifier of the limit in the association. 
     */
    override fun limitId(limitId: String) {
      cdkBuilder.limitId(limitId)
    }

    /**
     * @param queueId The unique identifier of the queue in the association. 
     */
    override fun queueId(queueId: String) {
      cdkBuilder.queueId(queueId)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnQueueLimitAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnQueueLimitAssociationProps,
  ) : CdkObject(cdkObject),
      CfnQueueLimitAssociationProps {
    /**
     * The unique identifier of the farm that contains the queue-limit association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-farmid)
     */
    override fun farmId(): String = unwrap(this).getFarmId()

    /**
     * The unique identifier of the limit in the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-limitid)
     */
    override fun limitId(): String = unwrap(this).getLimitId()

    /**
     * The unique identifier of the queue in the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-queueid)
     */
    override fun queueId(): String = unwrap(this).getQueueId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueLimitAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueueLimitAssociationProps):
        CfnQueueLimitAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnQueueLimitAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueLimitAssociationProps):
        software.amazon.awscdk.services.deadline.CfnQueueLimitAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.deadline.CfnQueueLimitAssociationProps
  }
}
