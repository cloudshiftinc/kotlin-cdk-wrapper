@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnQueueFleetAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnQueueFleetAssociationProps cfnQueueFleetAssociationProps =
 * CfnQueueFleetAssociationProps.builder()
 * .farmId("farmId")
 * .fleetId("fleetId")
 * .queueId("queueId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html)
 */
public interface CfnQueueFleetAssociationProps {
  /**
   * The identifier of the farm that contains the queue and the fleet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-farmid)
   */
  public fun farmId(): String

  /**
   * The fleet ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-fleetid)
   */
  public fun fleetId(): String

  /**
   * The queue ID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-queueid)
   */
  public fun queueId(): String

  /**
   * A builder for [CfnQueueFleetAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param farmId The identifier of the farm that contains the queue and the fleet. 
     */
    public fun farmId(farmId: String)

    /**
     * @param fleetId The fleet ID. 
     */
    public fun fleetId(fleetId: String)

    /**
     * @param queueId The queue ID. 
     */
    public fun queueId(queueId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.deadline.CfnQueueFleetAssociationProps.Builder =
        software.amazon.awscdk.services.deadline.CfnQueueFleetAssociationProps.builder()

    /**
     * @param farmId The identifier of the farm that contains the queue and the fleet. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * @param fleetId The fleet ID. 
     */
    override fun fleetId(fleetId: String) {
      cdkBuilder.fleetId(fleetId)
    }

    /**
     * @param queueId The queue ID. 
     */
    override fun queueId(queueId: String) {
      cdkBuilder.queueId(queueId)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnQueueFleetAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.deadline.CfnQueueFleetAssociationProps,
  ) : CdkObject(cdkObject),
      CfnQueueFleetAssociationProps {
    /**
     * The identifier of the farm that contains the queue and the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-farmid)
     */
    override fun farmId(): String = unwrap(this).getFarmId()

    /**
     * The fleet ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-fleetid)
     */
    override fun fleetId(): String = unwrap(this).getFleetId()

    /**
     * The queue ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-queueid)
     */
    override fun queueId(): String = unwrap(this).getQueueId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueFleetAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueueFleetAssociationProps):
        CfnQueueFleetAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnQueueFleetAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueFleetAssociationProps):
        software.amazon.awscdk.services.deadline.CfnQueueFleetAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.deadline.CfnQueueFleetAssociationProps
  }
}
