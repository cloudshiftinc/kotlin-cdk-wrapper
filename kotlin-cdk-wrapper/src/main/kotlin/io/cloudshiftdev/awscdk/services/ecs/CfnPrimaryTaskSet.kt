@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Modifies which task set in a service is the primary task set.
 *
 * Any parameters that are updated on the primary task set in a service will transition to the
 * service. This is used when a service uses the `EXTERNAL` deployment controller type. For more
 * information, see [Amazon ECS Deployment
 * Types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-types.html) in the
 * *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * CfnPrimaryTaskSet cfnPrimaryTaskSet = CfnPrimaryTaskSet.Builder.create(this,
 * "MyCfnPrimaryTaskSet")
 * .cluster("cluster")
 * .service("service")
 * .taskSetId("taskSetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html)
 */
public open class CfnPrimaryTaskSet(
  cdkObject: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPrimaryTaskSetProps,
  ) :
      this(software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnPrimaryTaskSetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPrimaryTaskSetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPrimaryTaskSetProps(props)
  )

  /**
   * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that
   * the task set exists in.
   */
  public open fun cluster(): String = unwrap(this).getCluster()

  /**
   * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that
   * the task set exists in.
   */
  public open fun cluster(`value`: String) {
    unwrap(this).setCluster(`value`)
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
   * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
   */
  public open fun service(): String = unwrap(this).getService()

  /**
   * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
   */
  public open fun service(`value`: String) {
    unwrap(this).setService(`value`)
  }

  /**
   * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task
   * set in the deployment.
   */
  public open fun taskSetId(): String = unwrap(this).getTaskSetId()

  /**
   * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task
   * set in the deployment.
   */
  public open fun taskSetId(`value`: String) {
    unwrap(this).setTaskSetId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.CfnPrimaryTaskSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that
     * the task set exists in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-cluster)
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts
     * the service that the task set exists in. 
     */
    public fun cluster(cluster: String)

    /**
     * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-service)
     * @param service The short name or full Amazon Resource Name (ARN) of the service that the task
     * set exists in. 
     */
    public fun service(service: String)

    /**
     * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task
     * set in the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-tasksetid)
     * @param taskSetId The short name or full Amazon Resource Name (ARN) of the task set to set as
     * the primary task set in the deployment. 
     */
    public fun taskSetId(taskSetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet.Builder =
        software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet.Builder.create(scope, id)

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that
     * the task set exists in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-cluster)
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts
     * the service that the task set exists in. 
     */
    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-service)
     * @param service The short name or full Amazon Resource Name (ARN) of the service that the task
     * set exists in. 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    /**
     * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task
     * set in the deployment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-primarytaskset.html#cfn-ecs-primarytaskset-tasksetid)
     * @param taskSetId The short name or full Amazon Resource Name (ARN) of the task set to set as
     * the primary task set in the deployment. 
     */
    override fun taskSetId(taskSetId: String) {
      cdkBuilder.taskSetId(taskSetId)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPrimaryTaskSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPrimaryTaskSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet):
        CfnPrimaryTaskSet = CfnPrimaryTaskSet(cdkObject)

    internal fun unwrap(wrapped: CfnPrimaryTaskSet):
        software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet = wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.CfnPrimaryTaskSet
  }
}
