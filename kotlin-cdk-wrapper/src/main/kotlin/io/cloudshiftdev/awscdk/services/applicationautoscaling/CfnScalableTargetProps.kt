@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnScalableTarget`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * CfnScalableTargetProps cfnScalableTargetProps = CfnScalableTargetProps.builder()
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
public interface CfnScalableTargetProps {
  /**
   * The maximum value that you plan to scale out to.
   *
   * When a scaling policy is in effect, Application Auto Scaling can scale out (expand) as needed
   * to the maximum capacity limit in response to changing demand.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-maxcapacity)
   */
  public fun maxCapacity(): Number

  /**
   * The minimum value that you plan to scale in to.
   *
   * When a scaling policy is in effect, Application Auto Scaling can scale in (contract) as needed
   * to the minimum capacity limit in response to changing demand.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-mincapacity)
   */
  public fun minCapacity(): Number

  /**
   * The identifier of the resource associated with the scalable target.
   *
   * This string consists of the resource type and unique identifier.
   *
   * * ECS service - The resource type is `service` and the unique identifier is the cluster name
   * and service name. Example: `service/my-cluster/my-service` .
   * * Spot Fleet - The resource type is `spot-fleet-request` and the unique identifier is the Spot
   * Fleet request ID. Example: `spot-fleet-request/sfr-73fbd2ce-aa30-494c-8788-1cee4EXAMPLE` .
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
   * * SageMaker endpoint variant - The resource type is `variant` and the unique identifier is the
   * resource ID. Example: `endpoint/my-end-point/variant/KMeansClustering` .
   * * Custom resources are not supported with a resource type. This parameter must specify the
   * `OutputValue` from the CloudFormation template stack used to access the resources. The unique
   * identifier is defined by the service provider. More information is available in our [GitHub
   * repository](https://docs.aws.amazon.com/https://github.com/aws/aws-auto-scaling-custom-resource) .
   * * Amazon Comprehend document classification endpoint - The resource type and unique identifier
   * are specified using the endpoint ARN. Example:
   * `arn:aws:comprehend:us-west-2:123456789012:document-classifier-endpoint/EXAMPLE` .
   * * Amazon Comprehend entity recognizer endpoint - The resource type and unique identifier are
   * specified using the endpoint ARN. Example:
   * `arn:aws:comprehend:us-west-2:123456789012:entity-recognizer-endpoint/EXAMPLE` .
   * * Lambda provisioned concurrency - The resource type is `function` and the unique identifier is
   * the function name with a function version or alias name suffix that is not `$LATEST` . Example:
   * `function:my-function:prod` or `function:my-function:1` .
   * * Amazon Keyspaces table - The resource type is `table` and the unique identifier is the table
   * name. Example: `keyspace/mykeyspace/table/mytable` .
   * * Amazon MSK cluster - The resource type and unique identifier are specified using the cluster
   * ARN. Example:
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
   */
  public fun resourceId(): String

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
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The scalable dimension associated with the scalable target.
   *
   * This string consists of the service namespace, resource type, and scaling property.
   *
   * * `ecs:service:DesiredCount` - The desired task count of an ECS service.
   * * `elasticmapreduce:instancegroup:InstanceCount` - The instance count of an EMR Instance Group.
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
   * * `sagemaker:variant:DesiredInstanceCount` - The number of EC2 instances for a SageMaker model
   * endpoint variant.
   * * `custom-resource:ResourceType:Property` - The scalable dimension for a custom resource
   * provided by your own application or service.
   * * `comprehend:document-classifier-endpoint:DesiredInferenceUnits` - The number of inference
   * units for an Amazon Comprehend document classification endpoint.
   * * `comprehend:entity-recognizer-endpoint:DesiredInferenceUnits` - The number of inference units
   * for an Amazon Comprehend entity recognizer endpoint.
   * * `lambda:function:ProvisionedConcurrency` - The provisioned concurrency for a Lambda function.
   * * `cassandra:table:ReadCapacityUnits` - The provisioned read capacity for an Amazon Keyspaces
   * table.
   * * `cassandra:table:WriteCapacityUnits` - The provisioned write capacity for an Amazon Keyspaces
   * table.
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
   */
  public fun scalableDimension(): String

  /**
   * The scheduled actions for the scalable target.
   *
   * Duplicates aren't allowed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions)
   */
  public fun scheduledActions(): Any? = unwrap(this).getScheduledActions()

  /**
   * The namespace of the AWS service that provides the resource, or a `custom-resource` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-servicenamespace)
   */
  public fun serviceNamespace(): String

  /**
   * An embedded object that contains attributes and attribute values that are used to suspend and
   * resume automatic scaling.
   *
   * Setting the value of an attribute to `true` suspends the specified scaling activities. Setting
   * it to `false` (default) resumes the specified scaling activities.
   *
   * *Suspension Outcomes*
   *
   * * For `DynamicScalingInSuspended` , while a suspension is in effect, all scale-in activities
   * that are triggered by a scaling policy are suspended.
   * * For `DynamicScalingOutSuspended` , while a suspension is in effect, all scale-out activities
   * that are triggered by a scaling policy are suspended.
   * * For `ScheduledScalingSuspended` , while a suspension is in effect, all scaling activities
   * that involve scheduled actions are suspended.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-suspendedstate)
   */
  public fun suspendedState(): Any? = unwrap(this).getSuspendedState()

  /**
   * A builder for [CfnScalableTargetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxCapacity The maximum value that you plan to scale out to. 
     * When a scaling policy is in effect, Application Auto Scaling can scale out (expand) as needed
     * to the maximum capacity limit in response to changing demand.
     */
    public fun maxCapacity(maxCapacity: Number)

    /**
     * @param minCapacity The minimum value that you plan to scale in to. 
     * When a scaling policy is in effect, Application Auto Scaling can scale in (contract) as
     * needed to the minimum capacity limit in response to changing demand.
     */
    public fun minCapacity(minCapacity: Number)

    /**
     * @param resourceId The identifier of the resource associated with the scalable target. 
     * This string consists of the resource type and unique identifier.
     *
     * * ECS service - The resource type is `service` and the unique identifier is the cluster name
     * and service name. Example: `service/my-cluster/my-service` .
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
     */
    public fun resourceId(resourceId: String)

    /**
     * @param roleArn Specify the Amazon Resource Name (ARN) of an Identity and Access Management
     * (IAM) role that allows Application Auto Scaling to modify the scalable target on your behalf.
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
     */
    public fun roleArn(roleArn: String)

    /**
     * @param scalableDimension The scalable dimension associated with the scalable target. 
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
     */
    public fun scalableDimension(scalableDimension: String)

    /**
     * @param scheduledActions The scheduled actions for the scalable target.
     * Duplicates aren't allowed.
     */
    public fun scheduledActions(scheduledActions: IResolvable)

    /**
     * @param scheduledActions The scheduled actions for the scalable target.
     * Duplicates aren't allowed.
     */
    public fun scheduledActions(scheduledActions: List<Any>)

    /**
     * @param scheduledActions The scheduled actions for the scalable target.
     * Duplicates aren't allowed.
     */
    public fun scheduledActions(vararg scheduledActions: Any)

    /**
     * @param serviceNamespace The namespace of the AWS service that provides the resource, or a
     * `custom-resource` . 
     */
    public fun serviceNamespace(serviceNamespace: String)

    /**
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling.
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
     */
    public fun suspendedState(suspendedState: IResolvable)

    /**
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling.
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
     */
    public fun suspendedState(suspendedState: CfnScalableTarget.SuspendedStateProperty)

    /**
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab2c3e04fe94bc2b4f933aed3a9f82b44a117cda5d66c8e959e1b4101b80c1f5")
    public
        fun suspendedState(suspendedState: CfnScalableTarget.SuspendedStateProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps.builder()

    /**
     * @param maxCapacity The maximum value that you plan to scale out to. 
     * When a scaling policy is in effect, Application Auto Scaling can scale out (expand) as needed
     * to the maximum capacity limit in response to changing demand.
     */
    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity The minimum value that you plan to scale in to. 
     * When a scaling policy is in effect, Application Auto Scaling can scale in (contract) as
     * needed to the minimum capacity limit in response to changing demand.
     */
    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param resourceId The identifier of the resource associated with the scalable target. 
     * This string consists of the resource type and unique identifier.
     *
     * * ECS service - The resource type is `service` and the unique identifier is the cluster name
     * and service name. Example: `service/my-cluster/my-service` .
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
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param roleArn Specify the Amazon Resource Name (ARN) of an Identity and Access Management
     * (IAM) role that allows Application Auto Scaling to modify the scalable target on your behalf.
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
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param scalableDimension The scalable dimension associated with the scalable target. 
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
     */
    override fun scalableDimension(scalableDimension: String) {
      cdkBuilder.scalableDimension(scalableDimension)
    }

    /**
     * @param scheduledActions The scheduled actions for the scalable target.
     * Duplicates aren't allowed.
     */
    override fun scheduledActions(scheduledActions: IResolvable) {
      cdkBuilder.scheduledActions(scheduledActions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scheduledActions The scheduled actions for the scalable target.
     * Duplicates aren't allowed.
     */
    override fun scheduledActions(scheduledActions: List<Any>) {
      cdkBuilder.scheduledActions(scheduledActions.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param scheduledActions The scheduled actions for the scalable target.
     * Duplicates aren't allowed.
     */
    override fun scheduledActions(vararg scheduledActions: Any): Unit =
        scheduledActions(scheduledActions.toList())

    /**
     * @param serviceNamespace The namespace of the AWS service that provides the resource, or a
     * `custom-resource` . 
     */
    override fun serviceNamespace(serviceNamespace: String) {
      cdkBuilder.serviceNamespace(serviceNamespace)
    }

    /**
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling.
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
     */
    override fun suspendedState(suspendedState: IResolvable) {
      cdkBuilder.suspendedState(suspendedState.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling.
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
     */
    override fun suspendedState(suspendedState: CfnScalableTarget.SuspendedStateProperty) {
      cdkBuilder.suspendedState(suspendedState.let(CfnScalableTarget.SuspendedStateProperty.Companion::unwrap))
    }

    /**
     * @param suspendedState An embedded object that contains attributes and attribute values that
     * are used to suspend and resume automatic scaling.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab2c3e04fe94bc2b4f933aed3a9f82b44a117cda5d66c8e959e1b4101b80c1f5")
    override
        fun suspendedState(suspendedState: CfnScalableTarget.SuspendedStateProperty.Builder.() -> Unit):
        Unit = suspendedState(CfnScalableTarget.SuspendedStateProperty(suspendedState))

    public fun build():
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps,
  ) : CdkObject(cdkObject), CfnScalableTargetProps {
    /**
     * The maximum value that you plan to scale out to.
     *
     * When a scaling policy is in effect, Application Auto Scaling can scale out (expand) as needed
     * to the maximum capacity limit in response to changing demand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-maxcapacity)
     */
    override fun maxCapacity(): Number = unwrap(this).getMaxCapacity()

    /**
     * The minimum value that you plan to scale in to.
     *
     * When a scaling policy is in effect, Application Auto Scaling can scale in (contract) as
     * needed to the minimum capacity limit in response to changing demand.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-mincapacity)
     */
    override fun minCapacity(): Number = unwrap(this).getMinCapacity()

    /**
     * The identifier of the resource associated with the scalable target.
     *
     * This string consists of the resource type and unique identifier.
     *
     * * ECS service - The resource type is `service` and the unique identifier is the cluster name
     * and service name. Example: `service/my-cluster/my-service` .
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
     */
    override fun resourceId(): String = unwrap(this).getResourceId()

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
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

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
     */
    override fun scalableDimension(): String = unwrap(this).getScalableDimension()

    /**
     * The scheduled actions for the scalable target.
     *
     * Duplicates aren't allowed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-scheduledactions)
     */
    override fun scheduledActions(): Any? = unwrap(this).getScheduledActions()

    /**
     * The namespace of the AWS service that provides the resource, or a `custom-resource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalabletarget.html#cfn-applicationautoscaling-scalabletarget-servicenamespace)
     */
    override fun serviceNamespace(): String = unwrap(this).getServiceNamespace()

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
     */
    override fun suspendedState(): Any? = unwrap(this).getSuspendedState()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScalableTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps):
        CfnScalableTargetProps = CdkObjectWrappers.wrap(cdkObject) as? CfnScalableTargetProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScalableTargetProps):
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.CfnScalableTargetProps
  }
}
