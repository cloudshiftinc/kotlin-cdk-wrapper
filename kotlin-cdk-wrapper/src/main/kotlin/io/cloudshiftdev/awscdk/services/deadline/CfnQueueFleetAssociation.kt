@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.deadline

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an association between a queue and a fleet.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnQueueFleetAssociation cfnQueueFleetAssociation = CfnQueueFleetAssociation.Builder.create(this,
 * "MyCfnQueueFleetAssociation")
 * .farmId("farmId")
 * .fleetId("fleetId")
 * .queueId("queueId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html)
 */
public open class CfnQueueFleetAssociation(
  cdkObject: software.amazon.awscdk.services.deadline.CfnQueueFleetAssociation,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueFleetAssociationProps,
  ) :
      this(software.amazon.awscdk.services.deadline.CfnQueueFleetAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnQueueFleetAssociationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueFleetAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnQueueFleetAssociationProps(props)
  )

  /**
   * The identifier of the farm that contains the queue and the fleet.
   */
  public open fun farmId(): String = unwrap(this).getFarmId()

  /**
   * The identifier of the farm that contains the queue and the fleet.
   */
  public open fun farmId(`value`: String) {
    unwrap(this).setFarmId(`value`)
  }

  /**
   * The fleet ID.
   */
  public open fun fleetId(): String = unwrap(this).getFleetId()

  /**
   * The fleet ID.
   */
  public open fun fleetId(`value`: String) {
    unwrap(this).setFleetId(`value`)
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
   * The queue ID.
   */
  public open fun queueId(): String = unwrap(this).getQueueId()

  /**
   * The queue ID.
   */
  public open fun queueId(`value`: String) {
    unwrap(this).setQueueId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.deadline.CfnQueueFleetAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the farm that contains the queue and the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-farmid)
     * @param farmId The identifier of the farm that contains the queue and the fleet. 
     */
    public fun farmId(farmId: String)

    /**
     * The fleet ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-fleetid)
     * @param fleetId The fleet ID. 
     */
    public fun fleetId(fleetId: String)

    /**
     * The queue ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-queueid)
     * @param queueId The queue ID. 
     */
    public fun queueId(queueId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.deadline.CfnQueueFleetAssociation.Builder =
        software.amazon.awscdk.services.deadline.CfnQueueFleetAssociation.Builder.create(scope, id)

    /**
     * The identifier of the farm that contains the queue and the fleet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-farmid)
     * @param farmId The identifier of the farm that contains the queue and the fleet. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * The fleet ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-fleetid)
     * @param fleetId The fleet ID. 
     */
    override fun fleetId(fleetId: String) {
      cdkBuilder.fleetId(fleetId)
    }

    /**
     * The queue ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuefleetassociation.html#cfn-deadline-queuefleetassociation-queueid)
     * @param queueId The queue ID. 
     */
    override fun queueId(queueId: String) {
      cdkBuilder.queueId(queueId)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnQueueFleetAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.deadline.CfnQueueFleetAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueueFleetAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueueFleetAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueueFleetAssociation):
        CfnQueueFleetAssociation = CfnQueueFleetAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnQueueFleetAssociation):
        software.amazon.awscdk.services.deadline.CfnQueueFleetAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.deadline.CfnQueueFleetAssociation
  }
}
