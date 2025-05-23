@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnScalingPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * CfnScalingPolicyProps cfnScalingPolicyProps = CfnScalingPolicyProps.builder()
 * .policyName("policyName")
 * .policyType("policyType")
 * // the properties below are optional
 * .predictiveScalingPolicyConfiguration(PredictiveScalingPolicyConfigurationProperty.builder()
 * .metricSpecifications(List.of(PredictiveScalingMetricSpecificationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .customizedCapacityMetricSpecification(PredictiveScalingCustomizedCapacityMetricProperty.builder()
 * .metricDataQueries(List.of(PredictiveScalingMetricDataQueryProperty.builder()
 * .expression("expression")
 * .id("id")
 * .label("label")
 * .metricStat(PredictiveScalingMetricStatProperty.builder()
 * .metric(PredictiveScalingMetricProperty.builder()
 * .dimensions(List.of(PredictiveScalingMetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .stat("stat")
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .customizedLoadMetricSpecification(PredictiveScalingCustomizedLoadMetricProperty.builder()
 * .metricDataQueries(List.of(PredictiveScalingMetricDataQueryProperty.builder()
 * .expression("expression")
 * .id("id")
 * .label("label")
 * .metricStat(PredictiveScalingMetricStatProperty.builder()
 * .metric(PredictiveScalingMetricProperty.builder()
 * .dimensions(List.of(PredictiveScalingMetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .stat("stat")
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .customizedScalingMetricSpecification(PredictiveScalingCustomizedScalingMetricProperty.builder()
 * .metricDataQueries(List.of(PredictiveScalingMetricDataQueryProperty.builder()
 * .expression("expression")
 * .id("id")
 * .label("label")
 * .metricStat(PredictiveScalingMetricStatProperty.builder()
 * .metric(PredictiveScalingMetricProperty.builder()
 * .dimensions(List.of(PredictiveScalingMetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .stat("stat")
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .build())
 * .predefinedLoadMetricSpecification(PredictiveScalingPredefinedLoadMetricProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .predefinedMetricPairSpecification(PredictiveScalingPredefinedMetricPairProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .predefinedScalingMetricSpecification(PredictiveScalingPredefinedScalingMetricProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .build()))
 * // the properties below are optional
 * .maxCapacityBreachBehavior("maxCapacityBreachBehavior")
 * .maxCapacityBuffer(123)
 * .mode("mode")
 * .schedulingBufferTime(123)
 * .build())
 * .resourceId("resourceId")
 * .scalableDimension("scalableDimension")
 * .scalingTargetId("scalingTargetId")
 * .serviceNamespace("serviceNamespace")
 * .stepScalingPolicyConfiguration(StepScalingPolicyConfigurationProperty.builder()
 * .adjustmentType("adjustmentType")
 * .cooldown(123)
 * .metricAggregationType("metricAggregationType")
 * .minAdjustmentMagnitude(123)
 * .stepAdjustments(List.of(StepAdjustmentProperty.builder()
 * .scalingAdjustment(123)
 * // the properties below are optional
 * .metricIntervalLowerBound(123)
 * .metricIntervalUpperBound(123)
 * .build()))
 * .build())
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .customizedMetricSpecification(CustomizedMetricSpecificationProperty.builder()
 * .dimensions(List.of(MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .metrics(List.of(TargetTrackingMetricDataQueryProperty.builder()
 * .expression("expression")
 * .id("id")
 * .label("label")
 * .metricStat(TargetTrackingMetricStatProperty.builder()
 * .metric(TargetTrackingMetricProperty.builder()
 * .dimensions(List.of(TargetTrackingMetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .build())
 * .stat("stat")
 * .unit("unit")
 * .build())
 * .returnData(false)
 * .build()))
 * .namespace("namespace")
 * .statistic("statistic")
 * .unit("unit")
 * .build())
 * .disableScaleIn(false)
 * .predefinedMetricSpecification(PredefinedMetricSpecificationProperty.builder()
 * .predefinedMetricType("predefinedMetricType")
 * // the properties below are optional
 * .resourceLabel("resourceLabel")
 * .build())
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
 */
public interface CfnScalingPolicyProps {
  /**
   * The name of the scaling policy.
   *
   * Updates to the name of a target tracking scaling policy are not supported, unless you also
   * update the metric used for scaling. To change only a target tracking scaling policy's name, first
   * delete the policy by removing the existing `AWS::ApplicationAutoScaling::ScalingPolicy` resource
   * from the template and updating the stack. Then, recreate the resource with the same settings and a
   * different name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname)
   */
  public fun policyName(): String

  /**
   * The scaling policy type.
   *
   * The following policy types are supported:
   *
   * `TargetTrackingScaling` —Not supported for Amazon EMR
   *
   * `StepScaling` —Not supported for DynamoDB, Amazon Comprehend, Lambda, Amazon Keyspaces, Amazon
   * MSK, Amazon ElastiCache, or Neptune.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype)
   */
  public fun policyType(): String

  /**
   * The predictive scaling policy configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-predictivescalingpolicyconfiguration)
   */
  public fun predictiveScalingPolicyConfiguration(): Any? =
      unwrap(this).getPredictiveScalingPolicyConfiguration()

  /**
   * The identifier of the resource associated with the scaling policy.
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
   * * Pool of WorkSpaces - The resource type is `workspacespool` and the unique identifier is the
   * pool ID. Example: `workspacespool/wspool-123456` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid)
   */
  public fun resourceId(): String? = unwrap(this).getResourceId()

  /**
   * The scalable dimension. This string consists of the service namespace, resource type, and
   * scaling property.
   *
   * * `ecs:service:DesiredCount` - The task count of an ECS service.
   * * `elasticmapreduce:instancegroup:InstanceCount` - The instance count of an EMR Instance Group.
   * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet.
   * * `appstream:fleet:DesiredCapacity` - The capacity of an AppStream 2.0 fleet.
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
   * * `workspaces:workspacespool:DesiredUserSessions` - The number of user sessions for the
   * WorkSpaces in the pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension)
   */
  public fun scalableDimension(): String? = unwrap(this).getScalableDimension()

  /**
   * The CloudFormation-generated ID of an Application Auto Scaling scalable target.
   *
   * For more information about the ID, see the Return Value section of the
   * `AWS::ApplicationAutoScaling::ScalableTarget` resource.
   *
   *
   * You must specify either the `ScalingTargetId` property, or the `ResourceId` ,
   * `ScalableDimension` , and `ServiceNamespace` properties, but not both.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid)
   */
  public fun scalingTargetId(): String? = unwrap(this).getScalingTargetId()

  /**
   * The namespace of the AWS service that provides the resource, or a `custom-resource` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace)
   */
  public fun serviceNamespace(): String? = unwrap(this).getServiceNamespace()

  /**
   * A step scaling policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
   */
  public fun stepScalingPolicyConfiguration(): Any? =
      unwrap(this).getStepScalingPolicyConfiguration()

  /**
   * A target tracking scaling policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
   */
  public fun targetTrackingScalingPolicyConfiguration(): Any? =
      unwrap(this).getTargetTrackingScalingPolicyConfiguration()

  /**
   * A builder for [CfnScalingPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param policyName The name of the scaling policy. 
     * Updates to the name of a target tracking scaling policy are not supported, unless you also
     * update the metric used for scaling. To change only a target tracking scaling policy's name,
     * first delete the policy by removing the existing `AWS::ApplicationAutoScaling::ScalingPolicy`
     * resource from the template and updating the stack. Then, recreate the resource with the same
     * settings and a different name.
     */
    public fun policyName(policyName: String)

    /**
     * @param policyType The scaling policy type. 
     * The following policy types are supported:
     *
     * `TargetTrackingScaling` —Not supported for Amazon EMR
     *
     * `StepScaling` —Not supported for DynamoDB, Amazon Comprehend, Lambda, Amazon Keyspaces,
     * Amazon MSK, Amazon ElastiCache, or Neptune.
     */
    public fun policyType(policyType: String)

    /**
     * @param predictiveScalingPolicyConfiguration The predictive scaling policy configuration.
     */
    public
        fun predictiveScalingPolicyConfiguration(predictiveScalingPolicyConfiguration: IResolvable)

    /**
     * @param predictiveScalingPolicyConfiguration The predictive scaling policy configuration.
     */
    public
        fun predictiveScalingPolicyConfiguration(predictiveScalingPolicyConfiguration: CfnScalingPolicy.PredictiveScalingPolicyConfigurationProperty)

    /**
     * @param predictiveScalingPolicyConfiguration The predictive scaling policy configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dce1718f8f7f3b9756fb453b7fbb3152af93e5579c209f001784e01c37dcd5a0")
    public
        fun predictiveScalingPolicyConfiguration(predictiveScalingPolicyConfiguration: CfnScalingPolicy.PredictiveScalingPolicyConfigurationProperty.Builder.() -> Unit)

    /**
     * @param resourceId The identifier of the resource associated with the scaling policy.
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
     * * Pool of WorkSpaces - The resource type is `workspacespool` and the unique identifier is the
     * pool ID. Example: `workspacespool/wspool-123456` .
     */
    public fun resourceId(resourceId: String)

    /**
     * @param scalableDimension The scalable dimension. This string consists of the service
     * namespace, resource type, and scaling property.
     * * `ecs:service:DesiredCount` - The task count of an ECS service.
     * * `elasticmapreduce:instancegroup:InstanceCount` - The instance count of an EMR Instance
     * Group.
     * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet.
     * * `appstream:fleet:DesiredCapacity` - The capacity of an AppStream 2.0 fleet.
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
     * * `workspaces:workspacespool:DesiredUserSessions` - The number of user sessions for the
     * WorkSpaces in the pool.
     */
    public fun scalableDimension(scalableDimension: String)

    /**
     * @param scalingTargetId The CloudFormation-generated ID of an Application Auto Scaling
     * scalable target.
     * For more information about the ID, see the Return Value section of the
     * `AWS::ApplicationAutoScaling::ScalableTarget` resource.
     *
     *
     * You must specify either the `ScalingTargetId` property, or the `ResourceId` ,
     * `ScalableDimension` , and `ServiceNamespace` properties, but not both.
     */
    public fun scalingTargetId(scalingTargetId: String)

    /**
     * @param serviceNamespace The namespace of the AWS service that provides the resource, or a
     * `custom-resource` .
     */
    public fun serviceNamespace(serviceNamespace: String)

    /**
     * @param stepScalingPolicyConfiguration A step scaling policy.
     */
    public fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: IResolvable)

    /**
     * @param stepScalingPolicyConfiguration A step scaling policy.
     */
    public
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: CfnScalingPolicy.StepScalingPolicyConfigurationProperty)

    /**
     * @param stepScalingPolicyConfiguration A step scaling policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71fac3959c2671e86a61f305aff57438b0f425b2b8dd9ed953e52f32ed9f0c4b")
    public
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.() -> Unit)

    /**
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy.
     */
    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable)

    /**
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy.
     */
    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty)

    /**
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc54aad19adc8a5dfa48a678d72440787f5979b0e288efc6b04a7ab37c1c3849")
    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.Builder =
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps.builder()

    /**
     * @param policyName The name of the scaling policy. 
     * Updates to the name of a target tracking scaling policy are not supported, unless you also
     * update the metric used for scaling. To change only a target tracking scaling policy's name,
     * first delete the policy by removing the existing `AWS::ApplicationAutoScaling::ScalingPolicy`
     * resource from the template and updating the stack. Then, recreate the resource with the same
     * settings and a different name.
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    /**
     * @param policyType The scaling policy type. 
     * The following policy types are supported:
     *
     * `TargetTrackingScaling` —Not supported for Amazon EMR
     *
     * `StepScaling` —Not supported for DynamoDB, Amazon Comprehend, Lambda, Amazon Keyspaces,
     * Amazon MSK, Amazon ElastiCache, or Neptune.
     */
    override fun policyType(policyType: String) {
      cdkBuilder.policyType(policyType)
    }

    /**
     * @param predictiveScalingPolicyConfiguration The predictive scaling policy configuration.
     */
    override
        fun predictiveScalingPolicyConfiguration(predictiveScalingPolicyConfiguration: IResolvable) {
      cdkBuilder.predictiveScalingPolicyConfiguration(predictiveScalingPolicyConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param predictiveScalingPolicyConfiguration The predictive scaling policy configuration.
     */
    override
        fun predictiveScalingPolicyConfiguration(predictiveScalingPolicyConfiguration: CfnScalingPolicy.PredictiveScalingPolicyConfigurationProperty) {
      cdkBuilder.predictiveScalingPolicyConfiguration(predictiveScalingPolicyConfiguration.let(CfnScalingPolicy.PredictiveScalingPolicyConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param predictiveScalingPolicyConfiguration The predictive scaling policy configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dce1718f8f7f3b9756fb453b7fbb3152af93e5579c209f001784e01c37dcd5a0")
    override
        fun predictiveScalingPolicyConfiguration(predictiveScalingPolicyConfiguration: CfnScalingPolicy.PredictiveScalingPolicyConfigurationProperty.Builder.() -> Unit):
        Unit =
        predictiveScalingPolicyConfiguration(CfnScalingPolicy.PredictiveScalingPolicyConfigurationProperty(predictiveScalingPolicyConfiguration))

    /**
     * @param resourceId The identifier of the resource associated with the scaling policy.
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
     * * Pool of WorkSpaces - The resource type is `workspacespool` and the unique identifier is the
     * pool ID. Example: `workspacespool/wspool-123456` .
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param scalableDimension The scalable dimension. This string consists of the service
     * namespace, resource type, and scaling property.
     * * `ecs:service:DesiredCount` - The task count of an ECS service.
     * * `elasticmapreduce:instancegroup:InstanceCount` - The instance count of an EMR Instance
     * Group.
     * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet.
     * * `appstream:fleet:DesiredCapacity` - The capacity of an AppStream 2.0 fleet.
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
     * * `workspaces:workspacespool:DesiredUserSessions` - The number of user sessions for the
     * WorkSpaces in the pool.
     */
    override fun scalableDimension(scalableDimension: String) {
      cdkBuilder.scalableDimension(scalableDimension)
    }

    /**
     * @param scalingTargetId The CloudFormation-generated ID of an Application Auto Scaling
     * scalable target.
     * For more information about the ID, see the Return Value section of the
     * `AWS::ApplicationAutoScaling::ScalableTarget` resource.
     *
     *
     * You must specify either the `ScalingTargetId` property, or the `ResourceId` ,
     * `ScalableDimension` , and `ServiceNamespace` properties, but not both.
     */
    override fun scalingTargetId(scalingTargetId: String) {
      cdkBuilder.scalingTargetId(scalingTargetId)
    }

    /**
     * @param serviceNamespace The namespace of the AWS service that provides the resource, or a
     * `custom-resource` .
     */
    override fun serviceNamespace(serviceNamespace: String) {
      cdkBuilder.serviceNamespace(serviceNamespace)
    }

    /**
     * @param stepScalingPolicyConfiguration A step scaling policy.
     */
    override fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: IResolvable) {
      cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param stepScalingPolicyConfiguration A step scaling policy.
     */
    override
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: CfnScalingPolicy.StepScalingPolicyConfigurationProperty) {
      cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration.let(CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param stepScalingPolicyConfiguration A step scaling policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("71fac3959c2671e86a61f305aff57438b0f425b2b8dd9ed953e52f32ed9f0c4b")
    override
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder.() -> Unit):
        Unit =
        stepScalingPolicyConfiguration(CfnScalingPolicy.StepScalingPolicyConfigurationProperty(stepScalingPolicyConfiguration))

    /**
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy.
     */
    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
      cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy.
     */
    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty) {
      cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc54aad19adc8a5dfa48a678d72440787f5979b0e288efc6b04a7ab37c1c3849")
    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
        Unit =
        targetTrackingScalingPolicyConfiguration(CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty(targetTrackingScalingPolicyConfiguration))

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps,
  ) : CdkObject(cdkObject),
      CfnScalingPolicyProps {
    /**
     * The name of the scaling policy.
     *
     * Updates to the name of a target tracking scaling policy are not supported, unless you also
     * update the metric used for scaling. To change only a target tracking scaling policy's name,
     * first delete the policy by removing the existing `AWS::ApplicationAutoScaling::ScalingPolicy`
     * resource from the template and updating the stack. Then, recreate the resource with the same
     * settings and a different name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policyname)
     */
    override fun policyName(): String = unwrap(this).getPolicyName()

    /**
     * The scaling policy type.
     *
     * The following policy types are supported:
     *
     * `TargetTrackingScaling` —Not supported for Amazon EMR
     *
     * `StepScaling` —Not supported for DynamoDB, Amazon Comprehend, Lambda, Amazon Keyspaces,
     * Amazon MSK, Amazon ElastiCache, or Neptune.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-policytype)
     */
    override fun policyType(): String = unwrap(this).getPolicyType()

    /**
     * The predictive scaling policy configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-predictivescalingpolicyconfiguration)
     */
    override fun predictiveScalingPolicyConfiguration(): Any? =
        unwrap(this).getPredictiveScalingPolicyConfiguration()

    /**
     * The identifier of the resource associated with the scaling policy.
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
     * * Pool of WorkSpaces - The resource type is `workspacespool` and the unique identifier is the
     * pool ID. Example: `workspacespool/wspool-123456` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid)
     */
    override fun resourceId(): String? = unwrap(this).getResourceId()

    /**
     * The scalable dimension. This string consists of the service namespace, resource type, and
     * scaling property.
     *
     * * `ecs:service:DesiredCount` - The task count of an ECS service.
     * * `elasticmapreduce:instancegroup:InstanceCount` - The instance count of an EMR Instance
     * Group.
     * * `ec2:spot-fleet-request:TargetCapacity` - The target capacity of a Spot Fleet.
     * * `appstream:fleet:DesiredCapacity` - The capacity of an AppStream 2.0 fleet.
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
     * * `workspaces:workspacespool:DesiredUserSessions` - The number of user sessions for the
     * WorkSpaces in the pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension)
     */
    override fun scalableDimension(): String? = unwrap(this).getScalableDimension()

    /**
     * The CloudFormation-generated ID of an Application Auto Scaling scalable target.
     *
     * For more information about the ID, see the Return Value section of the
     * `AWS::ApplicationAutoScaling::ScalableTarget` resource.
     *
     *
     * You must specify either the `ScalingTargetId` property, or the `ResourceId` ,
     * `ScalableDimension` , and `ServiceNamespace` properties, but not both.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalingtargetid)
     */
    override fun scalingTargetId(): String? = unwrap(this).getScalingTargetId()

    /**
     * The namespace of the AWS service that provides the resource, or a `custom-resource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace)
     */
    override fun serviceNamespace(): String? = unwrap(this).getServiceNamespace()

    /**
     * A step scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
     */
    override fun stepScalingPolicyConfiguration(): Any? =
        unwrap(this).getStepScalingPolicyConfiguration()

    /**
     * A target tracking scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
     */
    override fun targetTrackingScalingPolicyConfiguration(): Any? =
        unwrap(this).getTargetTrackingScalingPolicyConfiguration()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScalingPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps):
        CfnScalingPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnScalingPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScalingPolicyProps):
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps
  }
}
