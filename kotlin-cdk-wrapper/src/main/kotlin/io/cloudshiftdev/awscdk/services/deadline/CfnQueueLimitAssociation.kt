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
 * Associates a limit with a particular queue.
 *
 * After the limit is associated, all workers for jobs that specify the limit associated with the
 * queue are subject to the limit. You can't associate two limits with the same `amountRequirementName`
 * to the same queue.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.deadline.*;
 * CfnQueueLimitAssociation cfnQueueLimitAssociation = CfnQueueLimitAssociation.Builder.create(this,
 * "MyCfnQueueLimitAssociation")
 * .farmId("farmId")
 * .limitId("limitId")
 * .queueId("queueId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html)
 */
public open class CfnQueueLimitAssociation(
  cdkObject: software.amazon.awscdk.services.deadline.CfnQueueLimitAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueLimitAssociationProps,
  ) :
      this(software.amazon.awscdk.services.deadline.CfnQueueLimitAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnQueueLimitAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnQueueLimitAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnQueueLimitAssociationProps(props)
  )

  /**
   * The unique identifier of the farm that contains the queue-limit association.
   */
  public open fun farmId(): String = unwrap(this).getFarmId()

  /**
   * The unique identifier of the farm that contains the queue-limit association.
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
   * The unique identifier of the limit in the association.
   */
  public open fun limitId(): String = unwrap(this).getLimitId()

  /**
   * The unique identifier of the limit in the association.
   */
  public open fun limitId(`value`: String) {
    unwrap(this).setLimitId(`value`)
  }

  /**
   * The unique identifier of the queue in the association.
   */
  public open fun queueId(): String = unwrap(this).getQueueId()

  /**
   * The unique identifier of the queue in the association.
   */
  public open fun queueId(`value`: String) {
    unwrap(this).setQueueId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.deadline.CfnQueueLimitAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier of the farm that contains the queue-limit association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-farmid)
     * @param farmId The unique identifier of the farm that contains the queue-limit association. 
     */
    public fun farmId(farmId: String)

    /**
     * The unique identifier of the limit in the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-limitid)
     * @param limitId The unique identifier of the limit in the association. 
     */
    public fun limitId(limitId: String)

    /**
     * The unique identifier of the queue in the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-queueid)
     * @param queueId The unique identifier of the queue in the association. 
     */
    public fun queueId(queueId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.deadline.CfnQueueLimitAssociation.Builder =
        software.amazon.awscdk.services.deadline.CfnQueueLimitAssociation.Builder.create(scope, id)

    /**
     * The unique identifier of the farm that contains the queue-limit association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-farmid)
     * @param farmId The unique identifier of the farm that contains the queue-limit association. 
     */
    override fun farmId(farmId: String) {
      cdkBuilder.farmId(farmId)
    }

    /**
     * The unique identifier of the limit in the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-limitid)
     * @param limitId The unique identifier of the limit in the association. 
     */
    override fun limitId(limitId: String) {
      cdkBuilder.limitId(limitId)
    }

    /**
     * The unique identifier of the queue in the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-deadline-queuelimitassociation.html#cfn-deadline-queuelimitassociation-queueid)
     * @param queueId The unique identifier of the queue in the association. 
     */
    override fun queueId(queueId: String) {
      cdkBuilder.queueId(queueId)
    }

    public fun build(): software.amazon.awscdk.services.deadline.CfnQueueLimitAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.deadline.CfnQueueLimitAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueueLimitAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueueLimitAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.deadline.CfnQueueLimitAssociation):
        CfnQueueLimitAssociation = CfnQueueLimitAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnQueueLimitAssociation):
        software.amazon.awscdk.services.deadline.CfnQueueLimitAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.deadline.CfnQueueLimitAssociation
  }
}
