@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import java.time.Instant
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApplicationAutoScaling::ScalableTarget` resource specifies a resource that Application
 * Auto Scaling can scale, such as an AWS::DynamoDB::Table or AWS::ECS::Service resource.
 *
 * For more information, see [Getting
 * started](https://docs.aws.amazon.com/autoscaling/application/userguide/getting-started.html) in the
 * *Application Auto Scaling User Guide* .
 *
 *
 * If the resource that you want Application Auto Scaling to scale is not yet created in your
 * account, add a dependency on the resource when registering it as a scalable target using the
 * [DependsOn](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * attribute.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * CfnScalableTarget cfnScalableTarget = CfnScalableTarget.Builder.create(this,
 * "MyCfnScalableTarget")
 * .maxCapacity(123)
 * .minCapacity(123)
 * .resourceId("resourceId")
 * .scalableDimension("scalableDimension")
 * .serviceNamespace("serviceNamespace")
 * // the properties below are optional
 * .roleArn("roleArn")
 * .scheduledActions(List.of(ScheduledActionProperty.builder()
 * .schedule("schedule")
 * .scheduledActionName("scheduledActionName")
 * // the properties below are optional
 * .endTime(new Date())
 * .scalableTargetAction(ScalableTargetActionProperty.builder()
 * .maxCapacity(123)
 * .minCapacity(123)
 * .build())
 * .startTime(new Date())
 * .timezone("timezone")
 * .build()))
 * .suspendedState(SuspendedStateProperty.builder()
 * .dynamicScalingInSuspended(false)
 * .dynamicScalingOutSuspended(false)
 * .scheduledScalingSuspended(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html)
 */
public open class CfnScalableTarget internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget,
) : CfnResource(cdkObject), IInspectable {
  /**
   * This value can be returned by using the Ref function.
   *
   * Ref returns the Cloudformation generated ID of the resource in format -
   * ResourceId|ScalableDimension|ServiceNamespace
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The maximum value that you plan to scale out to.
   */
  public open fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

  /**
   * The maximum value that you plan to scale out to.
   */
  public open fun maxCapacity(`value`: Number) {
    unwrap(this).setMaxCapacity(`value`)
  }

  /**
   * The minimum value that you plan to scale in to.
   */
  public open fun minCapacity(): Number = unwrap(this).getMinCapacity()

  /**
   * The minimum value that you plan to scale in to.
   */
  public open fun minCapacity(`value`: Number) {
    unwrap(this).setMinCapacity(`value`)
  }

  /**
   * The identifier of the resource associated with the scalable target.
   */
  public open fun resourceId(): String = unwrap(this).getResourceId()

  /**
   * The identifier of the resource associated with the scalable target.
   */
  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  /**
   * Specify the Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that
   * allows Application Auto Scaling to modify the scalable target on your behalf.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * Specify the Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that
   * allows Application Auto Scaling to modify the scalable target on your behalf.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The scalable dimension associated with the scalable target.
   */
  public open fun scalableDimension(): String = unwrap(this).getScalableDimension()

  /**
   * The scalable dimension associated with the scalable target.
   */
  public open fun scalableDimension(`value`: String) {
    unwrap(this).setScalableDimension(`value`)
  }

  /**
   * The scheduled actions for the scalable target.
   */
  public open fun scheduledActions(): Any? = unwrap(this).getScheduledActions()

  /**
   * The scheduled actions for the scalable target.
   */
  public open fun scheduledActions(`value`: IResolvable) {
    unwrap(this).setScheduledActions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The scheduled actions for the scalable target.
   */
  public open fun scheduledActions(`value`: List<Any>) {
    unwrap(this).setScheduledActions(`value`)
  }

  /**
   * The scheduled actions for the scalable target.
   */
  public open fun scheduledActions(vararg `value`: Any): Unit = scheduledActions(`value`.toList())

  /**
   * The namespace of the AWS service that provides the resource, or a `custom-resource` .
   */
  public open fun serviceNamespace(): String = unwrap(this).getServiceNamespace()

  /**
   * The namespace of the AWS service that provides the resource, or a `custom-resource` .
   */
  public open fun serviceNamespace(`value`: String) {
    unwrap(this).setServiceNamespace(`value`)
  }

  /**
   * An embedded object that contains attributes and attribute values that are used to suspend and
   * resume automatic scaling.
   */
  public open fun suspendedState(): Any? = unwrap(this).getSuspendedState()

  /**
   * An embedded object that contains attributes and attribute values that are used to suspend and
   * resume automatic scaling.
   */
  public open fun suspendedState(`value`: IResolvable) {
    unwrap(this).setSuspendedState(`value`.let(IResolvable::unwrap))
  }

  /**
   * An embedded object that contains attributes and attribute values that are used to suspend and
   * resume automatic scaling.
   */
  public open fun suspendedState(`value`: SuspendedStateProperty) {
    unwrap(this).setSuspendedState(`value`.let(SuspendedStateProperty::unwrap))
  }

  /**
   * An embedded object that contains attributes and attribute values that are used to suspend and
   * resume automatic scaling.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fc42a1409f1bffc5c5950c7b1e14738545b19870e2cc21058c79727ce913b3a8")
  public open fun suspendedState(`value`: SuspendedStateProperty.Builder.() -> Unit): Unit =
      suspendedState(SuspendedStateProperty(`value`))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.applicationautoscaling.CfnScalableTarget].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The maximum value that you plan to scale out to.
     *
     * When a scaling policy is in effect, Application Auto Scaling can scale out (expand) as needed
     * to the maximum capacity limit in response to changing demand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-maxcapacity)
     * @param maxCapacity The maximum value that you plan to scale out to. 
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * The minimum value that you plan to scale in to.
     *
     * When a scaling policy is in effect, Application Auto Scaling can scale in (contract) as
     * needed to the minimum capacity limit in response to changing demand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-mincapacity)
     * @param minCapacity The minimum value that you plan to scale in to. 
     */
    public fun minCapacity(minCapacity: Number)

    /**
     * The identifier of the resource associated with the scalable target.
     *
     * This string consists of the resource type and unique identifier.
     *
     * * ECS service - The resource type is `service` and the unique identifier is the cluster name
     * and service name. Example: `service/default/sample-webapp` .
     * * Spot Fleet - The resource type is `spot-fleet-request` and the unique identifier is the
     * Spot Fleet request ID. Example: `spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE` .
     * * EMR cluster - The resource type is `instancegroup` and the unique identifier is the cluster
     * ID and instance group ID. Example: `instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0` .
     * * AppStream 2.0 fleet - The resource type is `fleet` and the unique identifier is the fleet
     * name. Example: `fleet/sample-fleet` .
     * * DynamoDB table - The resource type is `table` and the unique identifier is the table name.
     * Example: `table/my-table` .
     * * DynamoDB global secondary index - The resource type is `index` and the unique identifier is
     * the index name. Example: `table/my-table/index/my-table-index` .
     * * Aurora DB cluster - The resource type is `cluster` and the unique identifier is the cluster
     * name. Example: `cluster:my-db-cluster` .
     * * SageMaker endpoint variant - The resource type is `variant` and the unique identifier is
     * the resource ID. Example: `endpoint/my-end-point/variant/KMeansClustering` .
     * * Custom resources are not supported with a resource type. This parameter must specify the
     * `OutputValue` from the CloudFormation template stack used to access the resources. The unique
     * identifier is defined by the service provider. More information is available in our [GitHub
     * repository](https://docs.aws.amazon.com/https://github.com/aws/aws-auto-scaling-custom-resource)
     * .
     * * Amazon Comprehend document classification endpoint - The resource type and unique
     * identifier are specified using the endpoint ARN. Example:
     * `arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE` .
     * * Amazon Comprehend entity recognizer endpoint - The resource type and unique identifier are
     * specified using the endpoint ARN. Example:
     * `arn:aws:comprehend:us-west-2:123456789012:entity-recognizer-endpoint/EXAMPLE` .
     * * Lambda provisioned concurrency - The resource type is `function` and the unique identifier
     * is the function name with a function version or alias name suffix that is not `$LATEST` .
     * Example: `function:my-function:prod` or `function:my-function:1` .
     * * Amazon Keyspaces table - The resource type is `table` and the unique identifier is the
     * table name. Example: `keyspace/mykeyspace/table/mytable` .
     * * Amazon MSK cluster - The resource type and unique identifier are specified using the
     * cluster ARN. Example:
     * `arn:aws:kafka:us-east-1:123456789012:cluster/demo-cluster-1/6357e0b2-0e6a-4b86-a0b4-70df934c2e31-5`
     * .
     * * Amazon ElastiCache replication group - The resource type is `replication-group` and the
     * unique identifier is the replication group name. Example: `replication-group/mycluster` .
     * * Neptune cluster - The resource type is `cluster` and the unique identifier is the cluster
     * name. Example: `cluster:mycluster` .
     * * SageMaker serverless endpoint - The resource type is `variant` and the unique identifier is
     * the resource ID. Example: `endpoint/my-end-point/variant/KMeansClustering` .
     * * SageMaker inference component - The resource type is `inference-component` and the unique
     * identifier is the resource ID. Example: `inference-component/my-inference-component` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-resourceid)
     * @param resourceId The identifier of the resource associated with the scalable target. 
     */
    public fun resourceId(resourceId: String)

    /**
     * Specify the Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that
     * allows Application Auto Scaling to modify the scalable target on your behalf.
     *
     * This can be either an IAM service role that Application Auto Scaling can assume to make calls
     * to other AWS resources on your behalf, or a service-linked role for the specified service. For
     * more information, see [How Application Auto Scaling works with
     * IAM](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html)
     * in the *Application Auto Scaling User Guide* .
     *
     * To automatically create a service-linked role (recommended), specify the full ARN of the
     * service-linked role in your stack template. To find the exact ARN of the service-linked role for
     * your AWS or custom resource, see the [Service-linked
     * roles](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-service-linked-roles.html)
     * topic in the *Application Auto Scaling User Guide* . Look for the ARN in the table at the bottom
     * of the page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-rolearn)
     * @param roleArn Specify the Amazon Resource Name (ARN) of an Identity and Access Management
     * (IAM) role that allows Application Auto Scaling to modify the scalable target on your behalf. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The scalable dimension associated with the scalable target.
     *
     * This string consists of the service namespace, resource type, and scaling property.
     *
     * * `ecs:service:DesiredCount` - The desired task count of an ECS service.
     * * `elasticmapreduce:instancegroup:InstanceCount` - The instance count of an EMR Instance
     * Group.
     * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet.
     * * `appstream:fleet:DesiredCapacity` - The desired capacity of an AppStream 2.0 fleet.
     * * `dynamodb:table:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB table.
     * * `dynamodb:table:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB table.
     * * `dynamodb:index:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB global
     * secondary index.
     * * `dynamodb:index:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB global
     * secondary index.
     * * `rds:cluster:ReadReplicaCount` - The count of Aurora Replicas in an Aurora DB cluster.
     * Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
     * * `sagemaker:variant:DesiredInstanceCount` - The number of EC2 instances for a SageMaker
     * model endpoint variant.
     * * `custom-resource:ResourceType:Property` - The scalable dimension for a custom resource
     * provided by your own application or service.
     * * `comprehend:document-classifier-endpoint:DesiredInferenceUnits` - The number of inference
     * units for an Amazon Comprehend document classification endpoint.
     * * `comprehend:entity-recognizer-endpoint:DesiredInferenceUnits` - The number of inference
     * units for an Amazon Comprehend entity recognizer endpoint.
     * * `lambda:function:ProvisionedConcurrency` - The provisioned concurrency for a Lambda
     * function.
     * * `cassandra:table:ReadCapacityUnits` - The provisioned read capacity for an Amazon Keyspaces
     * table.
     * * `cassandra:table:WriteCapacityUnits` - The provisioned write capacity for an Amazon
     * Keyspaces table.
     * * `kafka:broker-storage:VolumeSize` - The provisioned volume size (in GiB) for brokers in an
     * Amazon MSK cluster.
     * * `elasticache:replication-group:NodeGroups` - The number of node groups for an Amazon
     * ElastiCache replication group.
     * * `elasticache:replication-group:Replicas` - The number of replicas per node group for an
     * Amazon ElastiCache replication group.
     * * `neptune:cluster:ReadReplicaCount` - The count of read replicas in an Amazon Neptune DB
     * cluster.
     * * `sagemaker:variant:DesiredProvisionedConcurrency` - The provisioned concurrency for a
     * SageMaker serverless endpoint.
     * * `sagemaker:inference-component:DesiredCopyCount` - The number of copies across an endpoint
     * for a SageMaker inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scalabledimension)
     * @param scalableDimension The scalable dimension associated with the scalable target. 
     */
    public fun scalableDimension(scalableDimension: String)

    /**
     * The scheduled actions for the scalable target.
     *
     * Duplicates aren't allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions)
     * @param scheduledActions The scheduled actions for the scalable target. 
     */
    public fun scheduledActions(scheduledActions: IResolvable)

    /**
     * The scheduled actions for the scalable target.
     *
     * Duplicates aren't allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions)
     * @param scheduledActions The scheduled actions for the scalable target. 
     */
    public fun scheduledActions(scheduledActions: List<Any>)

    /**
     * The scheduled actions for the scalable target.
     *
     * Duplicates aren't allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions)
     * @param scheduledActions The scheduled actions for the scalable target. 
     */
    public fun scheduledActions(vararg scheduledActions: Any)

    /**
     * The namespace of the AWS service that provides the resource, or a `custom-resource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-servicenamespace)
     * @param serviceNamespace The namespace of the AWS service that provides the resource, or a
     * `custom-resource` . 
     */
    public fun serviceNamespace(serviceNamespace: String)

    /**
     * An embedded object that contains attributes and attribute values that are used to suspend and
     * resume automatic scaling.
     *
     * Setting the value of an attribute to `true` suspends the specified scaling activities.
     * Setting it to `false` (default) resumes the specified scaling activities.
     *
     * *Suspension Outcomes*
     *
     * * For `DynamicScalingInSuspended` , while a suspension is in effect, all scale-in activities
     * that are triggered by a scaling policy are suspended.
     * * For `DynamicScalingOutSuspended` , while a suspension is in effect, all scale-out
     * activities that are triggered by a scaling policy are suspended.
     * * For `ScheduledScalingSuspended` , while a suspension is in effect, all scaling activities
     * that involve scheduled actions are suspended.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-suspendedstate)
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling. 
     */
    public fun suspendedState(suspendedState: IResolvable)

    /**
     * An embedded object that contains attributes and attribute values that are used to suspend and
     * resume automatic scaling.
     *
     * Setting the value of an attribute to `true` suspends the specified scaling activities.
     * Setting it to `false` (default) resumes the specified scaling activities.
     *
     * *Suspension Outcomes*
     *
     * * For `DynamicScalingInSuspended` , while a suspension is in effect, all scale-in activities
     * that are triggered by a scaling policy are suspended.
     * * For `DynamicScalingOutSuspended` , while a suspension is in effect, all scale-out
     * activities that are triggered by a scaling policy are suspended.
     * * For `ScheduledScalingSuspended` , while a suspension is in effect, all scaling activities
     * that involve scheduled actions are suspended.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-suspendedstate)
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling. 
     */
    public fun suspendedState(suspendedState: SuspendedStateProperty)

    /**
     * An embedded object that contains attributes and attribute values that are used to suspend and
     * resume automatic scaling.
     *
     * Setting the value of an attribute to `true` suspends the specified scaling activities.
     * Setting it to `false` (default) resumes the specified scaling activities.
     *
     * *Suspension Outcomes*
     *
     * * For `DynamicScalingInSuspended` , while a suspension is in effect, all scale-in activities
     * that are triggered by a scaling policy are suspended.
     * * For `DynamicScalingOutSuspended` , while a suspension is in effect, all scale-out
     * activities that are triggered by a scaling policy are suspended.
     * * For `ScheduledScalingSuspended` , while a suspension is in effect, all scaling activities
     * that involve scheduled actions are suspended.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-suspendedstate)
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c92426d58a0bb3038e5237116a2c51832511f958c67e91a4530463faf342ae7")
    public fun suspendedState(suspendedState: SuspendedStateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.Builder =
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.Builder.create(scope,
        id)

    /**
     * The maximum value that you plan to scale out to.
     *
     * When a scaling policy is in effect, Application Auto Scaling can scale out (expand) as needed
     * to the maximum capacity limit in response to changing demand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-maxcapacity)
     * @param maxCapacity The maximum value that you plan to scale out to. 
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * The minimum value that you plan to scale in to.
     *
     * When a scaling policy is in effect, Application Auto Scaling can scale in (contract) as
     * needed to the minimum capacity limit in response to changing demand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-mincapacity)
     * @param minCapacity The minimum value that you plan to scale in to. 
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * The identifier of the resource associated with the scalable target.
     *
     * This string consists of the resource type and unique identifier.
     *
     * * ECS service - The resource type is `service` and the unique identifier is the cluster name
     * and service name. Example: `service/default/sample-webapp` .
     * * Spot Fleet - The resource type is `spot-fleet-request` and the unique identifier is the
     * Spot Fleet request ID. Example: `spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE` .
     * * EMR cluster - The resource type is `instancegroup` and the unique identifier is the cluster
     * ID and instance group ID. Example: `instancegroup/j-2EEZNYKUA1NTV/ig-1791Y4E1L8YI0` .
     * * AppStream 2.0 fleet - The resource type is `fleet` and the unique identifier is the fleet
     * name. Example: `fleet/sample-fleet` .
     * * DynamoDB table - The resource type is `table` and the unique identifier is the table name.
     * Example: `table/my-table` .
     * * DynamoDB global secondary index - The resource type is `index` and the unique identifier is
     * the index name. Example: `table/my-table/index/my-table-index` .
     * * Aurora DB cluster - The resource type is `cluster` and the unique identifier is the cluster
     * name. Example: `cluster:my-db-cluster` .
     * * SageMaker endpoint variant - The resource type is `variant` and the unique identifier is
     * the resource ID. Example: `endpoint/my-end-point/variant/KMeansClustering` .
     * * Custom resources are not supported with a resource type. This parameter must specify the
     * `OutputValue` from the CloudFormation template stack used to access the resources. The unique
     * identifier is defined by the service provider. More information is available in our [GitHub
     * repository](https://docs.aws.amazon.com/https://github.com/aws/aws-auto-scaling-custom-resource)
     * .
     * * Amazon Comprehend document classification endpoint - The resource type and unique
     * identifier are specified using the endpoint ARN. Example:
     * `arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE` .
     * * Amazon Comprehend entity recognizer endpoint - The resource type and unique identifier are
     * specified using the endpoint ARN. Example:
     * `arn:aws:comprehend:us-west-2:123456789012:entity-recognizer-endpoint/EXAMPLE` .
     * * Lambda provisioned concurrency - The resource type is `function` and the unique identifier
     * is the function name with a function version or alias name suffix that is not `$LATEST` .
     * Example: `function:my-function:prod` or `function:my-function:1` .
     * * Amazon Keyspaces table - The resource type is `table` and the unique identifier is the
     * table name. Example: `keyspace/mykeyspace/table/mytable` .
     * * Amazon MSK cluster - The resource type and unique identifier are specified using the
     * cluster ARN. Example:
     * `arn:aws:kafka:us-east-1:123456789012:cluster/demo-cluster-1/6357e0b2-0e6a-4b86-a0b4-70df934c2e31-5`
     * .
     * * Amazon ElastiCache replication group - The resource type is `replication-group` and the
     * unique identifier is the replication group name. Example: `replication-group/mycluster` .
     * * Neptune cluster - The resource type is `cluster` and the unique identifier is the cluster
     * name. Example: `cluster:mycluster` .
     * * SageMaker serverless endpoint - The resource type is `variant` and the unique identifier is
     * the resource ID. Example: `endpoint/my-end-point/variant/KMeansClustering` .
     * * SageMaker inference component - The resource type is `inference-component` and the unique
     * identifier is the resource ID. Example: `inference-component/my-inference-component` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-resourceid)
     * @param resourceId The identifier of the resource associated with the scalable target. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * Specify the Amazon Resource Name (ARN) of an Identity and Access Management (IAM) role that
     * allows Application Auto Scaling to modify the scalable target on your behalf.
     *
     * This can be either an IAM service role that Application Auto Scaling can assume to make calls
     * to other AWS resources on your behalf, or a service-linked role for the specified service. For
     * more information, see [How Application Auto Scaling works with
     * IAM](https://docs.aws.amazon.com/autoscaling/application/userguide/security_iam_service-with-iam.html)
     * in the *Application Auto Scaling User Guide* .
     *
     * To automatically create a service-linked role (recommended), specify the full ARN of the
     * service-linked role in your stack template. To find the exact ARN of the service-linked role for
     * your AWS or custom resource, see the [Service-linked
     * roles](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-service-linked-roles.html)
     * topic in the *Application Auto Scaling User Guide* . Look for the ARN in the table at the bottom
     * of the page.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-rolearn)
     * @param roleArn Specify the Amazon Resource Name (ARN) of an Identity and Access Management
     * (IAM) role that allows Application Auto Scaling to modify the scalable target on your behalf. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The scalable dimension associated with the scalable target.
     *
     * This string consists of the service namespace, resource type, and scaling property.
     *
     * * `ecs:service:DesiredCount` - The desired task count of an ECS service.
     * * `elasticmapreduce:instancegroup:InstanceCount` - The instance count of an EMR Instance
     * Group.
     * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet.
     * * `appstream:fleet:DesiredCapacity` - The desired capacity of an AppStream 2.0 fleet.
     * * `dynamodb:table:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB table.
     * * `dynamodb:table:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB table.
     * * `dynamodb:index:ReadCapacityUnits` - The provisioned read capacity for a DynamoDB global
     * secondary index.
     * * `dynamodb:index:WriteCapacityUnits` - The provisioned write capacity for a DynamoDB global
     * secondary index.
     * * `rds:cluster:ReadReplicaCount` - The count of Aurora Replicas in an Aurora DB cluster.
     * Available for Aurora MySQL-compatible edition and Aurora PostgreSQL-compatible edition.
     * * `sagemaker:variant:DesiredInstanceCount` - The number of EC2 instances for a SageMaker
     * model endpoint variant.
     * * `custom-resource:ResourceType:Property` - The scalable dimension for a custom resource
     * provided by your own application or service.
     * * `comprehend:document-classifier-endpoint:DesiredInferenceUnits` - The number of inference
     * units for an Amazon Comprehend document classification endpoint.
     * * `comprehend:entity-recognizer-endpoint:DesiredInferenceUnits` - The number of inference
     * units for an Amazon Comprehend entity recognizer endpoint.
     * * `lambda:function:ProvisionedConcurrency` - The provisioned concurrency for a Lambda
     * function.
     * * `cassandra:table:ReadCapacityUnits` - The provisioned read capacity for an Amazon Keyspaces
     * table.
     * * `cassandra:table:WriteCapacityUnits` - The provisioned write capacity for an Amazon
     * Keyspaces table.
     * * `kafka:broker-storage:VolumeSize` - The provisioned volume size (in GiB) for brokers in an
     * Amazon MSK cluster.
     * * `elasticache:replication-group:NodeGroups` - The number of node groups for an Amazon
     * ElastiCache replication group.
     * * `elasticache:replication-group:Replicas` - The number of replicas per node group for an
     * Amazon ElastiCache replication group.
     * * `neptune:cluster:ReadReplicaCount` - The count of read replicas in an Amazon Neptune DB
     * cluster.
     * * `sagemaker:variant:DesiredProvisionedConcurrency` - The provisioned concurrency for a
     * SageMaker serverless endpoint.
     * * `sagemaker:inference-component:DesiredCopyCount` - The number of copies across an endpoint
     * for a SageMaker inference component.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scalabledimension)
     * @param scalableDimension The scalable dimension associated with the scalable target. 
     */
    override fun scalableDimension(scalableDimension: String) {
      cdkBuilder.scalableDimension(scalableDimension)
    }

    /**
     * The scheduled actions for the scalable target.
     *
     * Duplicates aren't allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions)
     * @param scheduledActions The scheduled actions for the scalable target. 
     */
    override fun scheduledActions(scheduledActions: IResolvable) {
      cdkBuilder.scheduledActions(scheduledActions.let(IResolvable::unwrap))
    }

    /**
     * The scheduled actions for the scalable target.
     *
     * Duplicates aren't allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions)
     * @param scheduledActions The scheduled actions for the scalable target. 
     */
    override fun scheduledActions(scheduledActions: List<Any>) {
      cdkBuilder.scheduledActions(scheduledActions)
    }

    /**
     * The scheduled actions for the scalable target.
     *
     * Duplicates aren't allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions)
     * @param scheduledActions The scheduled actions for the scalable target. 
     */
    override fun scheduledActions(vararg scheduledActions: Any): Unit =
        scheduledActions(scheduledActions.toList())

    /**
     * The namespace of the AWS service that provides the resource, or a `custom-resource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-servicenamespace)
     * @param serviceNamespace The namespace of the AWS service that provides the resource, or a
     * `custom-resource` . 
     */
    override fun serviceNamespace(serviceNamespace: String) {
      cdkBuilder.serviceNamespace(serviceNamespace)
    }

    /**
     * An embedded object that contains attributes and attribute values that are used to suspend and
     * resume automatic scaling.
     *
     * Setting the value of an attribute to `true` suspends the specified scaling activities.
     * Setting it to `false` (default) resumes the specified scaling activities.
     *
     * *Suspension Outcomes*
     *
     * * For `DynamicScalingInSuspended` , while a suspension is in effect, all scale-in activities
     * that are triggered by a scaling policy are suspended.
     * * For `DynamicScalingOutSuspended` , while a suspension is in effect, all scale-out
     * activities that are triggered by a scaling policy are suspended.
     * * For `ScheduledScalingSuspended` , while a suspension is in effect, all scaling activities
     * that involve scheduled actions are suspended.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-suspendedstate)
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling. 
     */
    override fun suspendedState(suspendedState: IResolvable) {
      cdkBuilder.suspendedState(suspendedState.let(IResolvable::unwrap))
    }

    /**
     * An embedded object that contains attributes and attribute values that are used to suspend and
     * resume automatic scaling.
     *
     * Setting the value of an attribute to `true` suspends the specified scaling activities.
     * Setting it to `false` (default) resumes the specified scaling activities.
     *
     * *Suspension Outcomes*
     *
     * * For `DynamicScalingInSuspended` , while a suspension is in effect, all scale-in activities
     * that are triggered by a scaling policy are suspended.
     * * For `DynamicScalingOutSuspended` , while a suspension is in effect, all scale-out
     * activities that are triggered by a scaling policy are suspended.
     * * For `ScheduledScalingSuspended` , while a suspension is in effect, all scaling activities
     * that involve scheduled actions are suspended.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-suspendedstate)
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling. 
     */
    override fun suspendedState(suspendedState: SuspendedStateProperty) {
      cdkBuilder.suspendedState(suspendedState.let(SuspendedStateProperty::unwrap))
    }

    /**
     * An embedded object that contains attributes and attribute values that are used to suspend and
     * resume automatic scaling.
     *
     * Setting the value of an attribute to `true` suspends the specified scaling activities.
     * Setting it to `false` (default) resumes the specified scaling activities.
     *
     * *Suspension Outcomes*
     *
     * * For `DynamicScalingInSuspended` , while a suspension is in effect, all scale-in activities
     * that are triggered by a scaling policy are suspended.
     * * For `DynamicScalingOutSuspended` , while a suspension is in effect, all scale-out
     * activities that are triggered by a scaling policy are suspended.
     * * For `ScheduledScalingSuspended` , while a suspension is in effect, all scaling activities
     * that involve scheduled actions are suspended.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-suspendedstate)
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c92426d58a0bb3038e5237116a2c51832511f958c67e91a4530463faf342ae7")
    override fun suspendedState(suspendedState: SuspendedStateProperty.Builder.() -> Unit): Unit =
        suspendedState(SuspendedStateProperty(suspendedState))

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScalableTarget {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScalableTarget(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget):
        CfnScalableTarget = CfnScalableTarget(cdkObject)

    internal fun unwrap(wrapped: CfnScalableTarget):
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget = wrapped.cdkObject
  }

  /**
   * `ScheduledAction` is a property of the
   * [AWS::ApplicationAutoScaling::ScalableTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html)
   * resource that specifies a scheduled action for a scalable target.
   *
   * For more information, see [Scheduled
   * scaling](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-scheduled-scaling.html)
   * in the *Application Auto Scaling User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * ScheduledActionProperty scheduledActionProperty = ScheduledActionProperty.builder()
   * .schedule("schedule")
   * .scheduledActionName("scheduledActionName")
   * // the properties below are optional
   * .endTime(new Date())
   * .scalableTargetAction(ScalableTargetActionProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build())
   * .startTime(new Date())
   * .timezone("timezone")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html)
   */
  public interface ScheduledActionProperty {
    /**
     * The date and time that the action is scheduled to end, in UTC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime)
     */
    public fun endTime(): Any? = unwrap(this).getEndTime()

    /**
     * The new minimum and maximum capacity.
     *
     * You can set both values or just one. At the scheduled time, if the current capacity is below
     * the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If the
     * current capacity is above the maximum capacity, Application Auto Scaling scales in to the
     * maximum capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scalabletargetaction)
     */
    public fun scalableTargetAction(): Any? = unwrap(this).getScalableTargetAction()

    /**
     * The schedule for this action. The following formats are supported:.
     *
     * * At expressions - " `at( *yyyy* - *mm* - *dd* T *hh* : *mm* : *ss* )` "
     * * Rate expressions - " `rate( *value* *unit* )` "
     * * Cron expressions - " `cron( *fields* )` "
     *
     * At expressions are useful for one-time schedules. Cron expressions are useful for scheduled
     * actions that run periodically at a specified date and time, and rate expressions are useful for
     * scheduled actions that run at a regular interval.
     *
     * At and cron expressions use Universal Coordinated Time (UTC) by default.
     *
     * The cron format consists of six fields separated by white spaces: [Minutes] [Hours]
     * [Day_of_Month] [Month] [Day_of_Week] [Year].
     *
     * For rate expressions, *value* is a positive integer and *unit* is `minute` | `minutes` |
     * `hour` | `hours` | `day` | `days` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-schedule)
     */
    public fun schedule(): String

    /**
     * The name of the scheduled action.
     *
     * This name must be unique among all other scheduled actions on the specified scalable target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scheduledactionname)
     */
    public fun scheduledActionName(): String

    /**
     * The date and time that the action is scheduled to begin, in UTC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-starttime)
     */
    public fun startTime(): Any? = unwrap(this).getStartTime()

    /**
     * The time zone used when referring to the date and time of a scheduled action, when the
     * scheduled action uses an at or cron expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-timezone)
     */
    public fun timezone(): String? = unwrap(this).getTimezone()

    /**
     * A builder for [ScheduledActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endTime The date and time that the action is scheduled to end, in UTC.
       */
      public fun endTime(endTime: IResolvable)

      /**
       * @param endTime The date and time that the action is scheduled to end, in UTC.
       */
      public fun endTime(endTime: Instant)

      /**
       * @param scalableTargetAction The new minimum and maximum capacity.
       * You can set both values or just one. At the scheduled time, if the current capacity is
       * below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If
       * the current capacity is above the maximum capacity, Application Auto Scaling scales in to the
       * maximum capacity.
       */
      public fun scalableTargetAction(scalableTargetAction: IResolvable)

      /**
       * @param scalableTargetAction The new minimum and maximum capacity.
       * You can set both values or just one. At the scheduled time, if the current capacity is
       * below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If
       * the current capacity is above the maximum capacity, Application Auto Scaling scales in to the
       * maximum capacity.
       */
      public fun scalableTargetAction(scalableTargetAction: ScalableTargetActionProperty)

      /**
       * @param scalableTargetAction The new minimum and maximum capacity.
       * You can set both values or just one. At the scheduled time, if the current capacity is
       * below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If
       * the current capacity is above the maximum capacity, Application Auto Scaling scales in to the
       * maximum capacity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c45c5e02e114c4c156e6b8b2796dcd8489a0ff765695bba8a8cf4a9185118fe9")
      public
          fun scalableTargetAction(scalableTargetAction: ScalableTargetActionProperty.Builder.() -> Unit)

      /**
       * @param schedule The schedule for this action. The following formats are supported:. 
       * * At expressions - " `at( *yyyy* - *mm* - *dd* T *hh* : *mm* : *ss* )` "
       * * Rate expressions - " `rate( *value* *unit* )` "
       * * Cron expressions - " `cron( *fields* )` "
       *
       * At expressions are useful for one-time schedules. Cron expressions are useful for scheduled
       * actions that run periodically at a specified date and time, and rate expressions are useful
       * for scheduled actions that run at a regular interval.
       *
       * At and cron expressions use Universal Coordinated Time (UTC) by default.
       *
       * The cron format consists of six fields separated by white spaces: [Minutes] [Hours]
       * [Day_of_Month] [Month] [Day_of_Week] [Year].
       *
       * For rate expressions, *value* is a positive integer and *unit* is `minute` | `minutes` |
       * `hour` | `hours` | `day` | `days` .
       */
      public fun schedule(schedule: String)

      /**
       * @param scheduledActionName The name of the scheduled action. 
       * This name must be unique among all other scheduled actions on the specified scalable
       * target.
       */
      public fun scheduledActionName(scheduledActionName: String)

      /**
       * @param startTime The date and time that the action is scheduled to begin, in UTC.
       */
      public fun startTime(startTime: IResolvable)

      /**
       * @param startTime The date and time that the action is scheduled to begin, in UTC.
       */
      public fun startTime(startTime: Instant)

      /**
       * @param timezone The time zone used when referring to the date and time of a scheduled
       * action, when the scheduled action uses an at or cron expression.
       */
      public fun timezone(timezone: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty.builder()

      /**
       * @param endTime The date and time that the action is scheduled to end, in UTC.
       */
      override fun endTime(endTime: IResolvable) {
        cdkBuilder.endTime(endTime.let(IResolvable::unwrap))
      }

      /**
       * @param endTime The date and time that the action is scheduled to end, in UTC.
       */
      override fun endTime(endTime: Instant) {
        cdkBuilder.endTime(endTime)
      }

      /**
       * @param scalableTargetAction The new minimum and maximum capacity.
       * You can set both values or just one. At the scheduled time, if the current capacity is
       * below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If
       * the current capacity is above the maximum capacity, Application Auto Scaling scales in to the
       * maximum capacity.
       */
      override fun scalableTargetAction(scalableTargetAction: IResolvable) {
        cdkBuilder.scalableTargetAction(scalableTargetAction.let(IResolvable::unwrap))
      }

      /**
       * @param scalableTargetAction The new minimum and maximum capacity.
       * You can set both values or just one. At the scheduled time, if the current capacity is
       * below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If
       * the current capacity is above the maximum capacity, Application Auto Scaling scales in to the
       * maximum capacity.
       */
      override fun scalableTargetAction(scalableTargetAction: ScalableTargetActionProperty) {
        cdkBuilder.scalableTargetAction(scalableTargetAction.let(ScalableTargetActionProperty::unwrap))
      }

      /**
       * @param scalableTargetAction The new minimum and maximum capacity.
       * You can set both values or just one. At the scheduled time, if the current capacity is
       * below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If
       * the current capacity is above the maximum capacity, Application Auto Scaling scales in to the
       * maximum capacity.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c45c5e02e114c4c156e6b8b2796dcd8489a0ff765695bba8a8cf4a9185118fe9")
      override
          fun scalableTargetAction(scalableTargetAction: ScalableTargetActionProperty.Builder.() -> Unit):
          Unit = scalableTargetAction(ScalableTargetActionProperty(scalableTargetAction))

      /**
       * @param schedule The schedule for this action. The following formats are supported:. 
       * * At expressions - " `at( *yyyy* - *mm* - *dd* T *hh* : *mm* : *ss* )` "
       * * Rate expressions - " `rate( *value* *unit* )` "
       * * Cron expressions - " `cron( *fields* )` "
       *
       * At expressions are useful for one-time schedules. Cron expressions are useful for scheduled
       * actions that run periodically at a specified date and time, and rate expressions are useful
       * for scheduled actions that run at a regular interval.
       *
       * At and cron expressions use Universal Coordinated Time (UTC) by default.
       *
       * The cron format consists of six fields separated by white spaces: [Minutes] [Hours]
       * [Day_of_Month] [Month] [Day_of_Week] [Year].
       *
       * For rate expressions, *value* is a positive integer and *unit* is `minute` | `minutes` |
       * `hour` | `hours` | `day` | `days` .
       */
      override fun schedule(schedule: String) {
        cdkBuilder.schedule(schedule)
      }

      /**
       * @param scheduledActionName The name of the scheduled action. 
       * This name must be unique among all other scheduled actions on the specified scalable
       * target.
       */
      override fun scheduledActionName(scheduledActionName: String) {
        cdkBuilder.scheduledActionName(scheduledActionName)
      }

      /**
       * @param startTime The date and time that the action is scheduled to begin, in UTC.
       */
      override fun startTime(startTime: IResolvable) {
        cdkBuilder.startTime(startTime.let(IResolvable::unwrap))
      }

      /**
       * @param startTime The date and time that the action is scheduled to begin, in UTC.
       */
      override fun startTime(startTime: Instant) {
        cdkBuilder.startTime(startTime)
      }

      /**
       * @param timezone The time zone used when referring to the date and time of a scheduled
       * action, when the scheduled action uses an at or cron expression.
       */
      override fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty,
    ) : CdkObject(cdkObject), ScheduledActionProperty {
      /**
       * The date and time that the action is scheduled to end, in UTC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime)
       */
      override fun endTime(): Any? = unwrap(this).getEndTime()

      /**
       * The new minimum and maximum capacity.
       *
       * You can set both values or just one. At the scheduled time, if the current capacity is
       * below the minimum capacity, Application Auto Scaling scales out to the minimum capacity. If
       * the current capacity is above the maximum capacity, Application Auto Scaling scales in to the
       * maximum capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scalabletargetaction)
       */
      override fun scalableTargetAction(): Any? = unwrap(this).getScalableTargetAction()

      /**
       * The schedule for this action. The following formats are supported:.
       *
       * * At expressions - " `at( *yyyy* - *mm* - *dd* T *hh* : *mm* : *ss* )` "
       * * Rate expressions - " `rate( *value* *unit* )` "
       * * Cron expressions - " `cron( *fields* )` "
       *
       * At expressions are useful for one-time schedules. Cron expressions are useful for scheduled
       * actions that run periodically at a specified date and time, and rate expressions are useful
       * for scheduled actions that run at a regular interval.
       *
       * At and cron expressions use Universal Coordinated Time (UTC) by default.
       *
       * The cron format consists of six fields separated by white spaces: [Minutes] [Hours]
       * [Day_of_Month] [Month] [Day_of_Week] [Year].
       *
       * For rate expressions, *value* is a positive integer and *unit* is `minute` | `minutes` |
       * `hour` | `hours` | `day` | `days` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-schedule)
       */
      override fun schedule(): String = unwrap(this).getSchedule()

      /**
       * The name of the scheduled action.
       *
       * This name must be unique among all other scheduled actions on the specified scalable
       * target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scheduledactionname)
       */
      override fun scheduledActionName(): String = unwrap(this).getScheduledActionName()

      /**
       * The date and time that the action is scheduled to begin, in UTC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-starttime)
       */
      override fun startTime(): Any? = unwrap(this).getStartTime()

      /**
       * The time zone used when referring to the date and time of a scheduled action, when the
       * scheduled action uses an at or cron expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-timezone)
       */
      override fun timezone(): String? = unwrap(this).getTimezone()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty):
          ScheduledActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ScheduledActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduledActionProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScheduledActionProperty
    }
  }

  /**
   * `SuspendedState` is a property of the
   * [AWS::ApplicationAutoScaling::ScalableTarget](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html)
   * resource that specifies whether the scaling activities for a scalable target are in a suspended
   * state.
   *
   * For more information, see [Suspending and resuming
   * scaling](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-suspend-resume-scaling.html)
   * in the *Application Auto Scaling User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * SuspendedStateProperty suspendedStateProperty = SuspendedStateProperty.builder()
   * .dynamicScalingInSuspended(false)
   * .dynamicScalingOutSuspended(false)
   * .scheduledScalingSuspended(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html)
   */
  public interface SuspendedStateProperty {
    /**
     * Whether scale in by a target tracking scaling policy or a step scaling policy is suspended.
     *
     * Set the value to `true` if you don't want Application Auto Scaling to remove capacity when a
     * scaling policy is triggered. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalinginsuspended)
     */
    public fun dynamicScalingInSuspended(): Any? = unwrap(this).getDynamicScalingInSuspended()

    /**
     * Whether scale out by a target tracking scaling policy or a step scaling policy is suspended.
     *
     * Set the value to `true` if you don't want Application Auto Scaling to add capacity when a
     * scaling policy is triggered. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalingoutsuspended)
     */
    public fun dynamicScalingOutSuspended(): Any? = unwrap(this).getDynamicScalingOutSuspended()

    /**
     * Whether scheduled scaling is suspended.
     *
     * Set the value to `true` if you don't want Application Auto Scaling to add or remove capacity
     * by initiating scheduled actions. The default is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-scheduledscalingsuspended)
     */
    public fun scheduledScalingSuspended(): Any? = unwrap(this).getScheduledScalingSuspended()

    /**
     * A builder for [SuspendedStateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dynamicScalingInSuspended Whether scale in by a target tracking scaling policy or a
       * step scaling policy is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to remove capacity when
       * a scaling policy is triggered. The default is `false` .
       */
      public fun dynamicScalingInSuspended(dynamicScalingInSuspended: Boolean)

      /**
       * @param dynamicScalingInSuspended Whether scale in by a target tracking scaling policy or a
       * step scaling policy is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to remove capacity when
       * a scaling policy is triggered. The default is `false` .
       */
      public fun dynamicScalingInSuspended(dynamicScalingInSuspended: IResolvable)

      /**
       * @param dynamicScalingOutSuspended Whether scale out by a target tracking scaling policy or
       * a step scaling policy is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to add capacity when a
       * scaling policy is triggered. The default is `false` .
       */
      public fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: Boolean)

      /**
       * @param dynamicScalingOutSuspended Whether scale out by a target tracking scaling policy or
       * a step scaling policy is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to add capacity when a
       * scaling policy is triggered. The default is `false` .
       */
      public fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: IResolvable)

      /**
       * @param scheduledScalingSuspended Whether scheduled scaling is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to add or remove
       * capacity by initiating scheduled actions. The default is `false` .
       */
      public fun scheduledScalingSuspended(scheduledScalingSuspended: Boolean)

      /**
       * @param scheduledScalingSuspended Whether scheduled scaling is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to add or remove
       * capacity by initiating scheduled actions. The default is `false` .
       */
      public fun scheduledScalingSuspended(scheduledScalingSuspended: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty.builder()

      /**
       * @param dynamicScalingInSuspended Whether scale in by a target tracking scaling policy or a
       * step scaling policy is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to remove capacity when
       * a scaling policy is triggered. The default is `false` .
       */
      override fun dynamicScalingInSuspended(dynamicScalingInSuspended: Boolean) {
        cdkBuilder.dynamicScalingInSuspended(dynamicScalingInSuspended)
      }

      /**
       * @param dynamicScalingInSuspended Whether scale in by a target tracking scaling policy or a
       * step scaling policy is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to remove capacity when
       * a scaling policy is triggered. The default is `false` .
       */
      override fun dynamicScalingInSuspended(dynamicScalingInSuspended: IResolvable) {
        cdkBuilder.dynamicScalingInSuspended(dynamicScalingInSuspended.let(IResolvable::unwrap))
      }

      /**
       * @param dynamicScalingOutSuspended Whether scale out by a target tracking scaling policy or
       * a step scaling policy is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to add capacity when a
       * scaling policy is triggered. The default is `false` .
       */
      override fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: Boolean) {
        cdkBuilder.dynamicScalingOutSuspended(dynamicScalingOutSuspended)
      }

      /**
       * @param dynamicScalingOutSuspended Whether scale out by a target tracking scaling policy or
       * a step scaling policy is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to add capacity when a
       * scaling policy is triggered. The default is `false` .
       */
      override fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: IResolvable) {
        cdkBuilder.dynamicScalingOutSuspended(dynamicScalingOutSuspended.let(IResolvable::unwrap))
      }

      /**
       * @param scheduledScalingSuspended Whether scheduled scaling is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to add or remove
       * capacity by initiating scheduled actions. The default is `false` .
       */
      override fun scheduledScalingSuspended(scheduledScalingSuspended: Boolean) {
        cdkBuilder.scheduledScalingSuspended(scheduledScalingSuspended)
      }

      /**
       * @param scheduledScalingSuspended Whether scheduled scaling is suspended.
       * Set the value to `true` if you don't want Application Auto Scaling to add or remove
       * capacity by initiating scheduled actions. The default is `false` .
       */
      override fun scheduledScalingSuspended(scheduledScalingSuspended: IResolvable) {
        cdkBuilder.scheduledScalingSuspended(scheduledScalingSuspended.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty,
    ) : CdkObject(cdkObject), SuspendedStateProperty {
      /**
       * Whether scale in by a target tracking scaling policy or a step scaling policy is suspended.
       *
       * Set the value to `true` if you don't want Application Auto Scaling to remove capacity when
       * a scaling policy is triggered. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalinginsuspended)
       */
      override fun dynamicScalingInSuspended(): Any? = unwrap(this).getDynamicScalingInSuspended()

      /**
       * Whether scale out by a target tracking scaling policy or a step scaling policy is
       * suspended.
       *
       * Set the value to `true` if you don't want Application Auto Scaling to add capacity when a
       * scaling policy is triggered. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalingoutsuspended)
       */
      override fun dynamicScalingOutSuspended(): Any? = unwrap(this).getDynamicScalingOutSuspended()

      /**
       * Whether scheduled scaling is suspended.
       *
       * Set the value to `true` if you don't want Application Auto Scaling to add or remove
       * capacity by initiating scheduled actions. The default is `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-scheduledscalingsuspended)
       */
      override fun scheduledScalingSuspended(): Any? = unwrap(this).getScheduledScalingSuspended()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SuspendedStateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty):
          SuspendedStateProperty = CdkObjectWrappers.wrap(cdkObject) as? SuspendedStateProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SuspendedStateProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.SuspendedStateProperty
    }
  }

  /**
   * `ScalableTargetAction` specifies the minimum and maximum capacity for the
   * `ScalableTargetAction` property of the [AWS::ApplicationAutoScaling::ScalableTarget
   * ScheduledAction](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * ScalableTargetActionProperty scalableTargetActionProperty =
   * ScalableTargetActionProperty.builder()
   * .maxCapacity(123)
   * .minCapacity(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html)
   */
  public interface ScalableTargetActionProperty {
    /**
     * The maximum capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-maxcapacity)
     */
    public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    /**
     * The minimum capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-mincapacity)
     */
    public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    /**
     * A builder for [ScalableTargetActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxCapacity The maximum capacity.
       */
      public fun maxCapacity(maxCapacity: Number)

      /**
       * @param minCapacity The minimum capacity.
       */
      public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty.builder()

      /**
       * @param maxCapacity The maximum capacity.
       */
      override fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
      }

      /**
       * @param minCapacity The minimum capacity.
       */
      override fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty,
    ) : CdkObject(cdkObject), ScalableTargetActionProperty {
      /**
       * The maximum capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-maxcapacity)
       */
      override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

      /**
       * The minimum capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html#cfn-applicationautoscaling-scalabletarget-scalabletargetaction-mincapacity)
       */
      override fun minCapacity(): Number? = unwrap(this).getMinCapacity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalableTargetActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty):
          ScalableTargetActionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ScalableTargetActionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalableTargetActionProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget.ScalableTargetActionProperty
    }
  }
}
