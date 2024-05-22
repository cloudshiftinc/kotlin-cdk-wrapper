@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
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
 * The `AWS::ApplicationAutoScaling::ScalingPolicy` resource defines a scaling policy that
 * Application Auto Scaling uses to adjust the capacity of a scalable target.
 *
 * For more information, see [Target tracking scaling
 * policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html)
 * and [Step scaling
 * policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html)
 * in the *Application Auto Scaling User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * CfnScalingPolicy cfnScalingPolicy = CfnScalingPolicy.Builder.create(this, "MyCfnScalingPolicy")
 * .policyName("policyName")
 * .policyType("policyType")
 * // the properties below are optional
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
public open class CfnScalingPolicy(
  cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnScalingPolicyProps,
  ) :
      this(software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnScalingPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnScalingPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnScalingPolicyProps(props)
  )

  /**
   * Returns the ARN of a scaling policy.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the scaling policy.
   */
  public open fun policyName(): String = unwrap(this).getPolicyName()

  /**
   * The name of the scaling policy.
   */
  public open fun policyName(`value`: String) {
    unwrap(this).setPolicyName(`value`)
  }

  /**
   * The scaling policy type.
   */
  public open fun policyType(): String = unwrap(this).getPolicyType()

  /**
   * The scaling policy type.
   */
  public open fun policyType(`value`: String) {
    unwrap(this).setPolicyType(`value`)
  }

  /**
   * The identifier of the resource associated with the scaling policy.
   */
  public open fun resourceId(): String? = unwrap(this).getResourceId()

  /**
   * The identifier of the resource associated with the scaling policy.
   */
  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  /**
   * The scalable dimension.
   *
   * This string consists of the service namespace, resource type, and scaling property.
   */
  public open fun scalableDimension(): String? = unwrap(this).getScalableDimension()

  /**
   * The scalable dimension.
   *
   * This string consists of the service namespace, resource type, and scaling property.
   */
  public open fun scalableDimension(`value`: String) {
    unwrap(this).setScalableDimension(`value`)
  }

  /**
   * The CloudFormation-generated ID of an Application Auto Scaling scalable target.
   */
  public open fun scalingTargetId(): String? = unwrap(this).getScalingTargetId()

  /**
   * The CloudFormation-generated ID of an Application Auto Scaling scalable target.
   */
  public open fun scalingTargetId(`value`: String) {
    unwrap(this).setScalingTargetId(`value`)
  }

  /**
   * The namespace of the AWS service that provides the resource, or a `custom-resource` .
   */
  public open fun serviceNamespace(): String? = unwrap(this).getServiceNamespace()

  /**
   * The namespace of the AWS service that provides the resource, or a `custom-resource` .
   */
  public open fun serviceNamespace(`value`: String) {
    unwrap(this).setServiceNamespace(`value`)
  }

  /**
   * A step scaling policy.
   */
  public open fun stepScalingPolicyConfiguration(): Any? =
      unwrap(this).getStepScalingPolicyConfiguration()

  /**
   * A step scaling policy.
   */
  public open fun stepScalingPolicyConfiguration(`value`: IResolvable) {
    unwrap(this).setStepScalingPolicyConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A step scaling policy.
   */
  public open fun stepScalingPolicyConfiguration(`value`: StepScalingPolicyConfigurationProperty) {
    unwrap(this).setStepScalingPolicyConfiguration(`value`.let(StepScalingPolicyConfigurationProperty.Companion::unwrap))
  }

  /**
   * A step scaling policy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2df0af46892172e27dec0b892edddd5997339da20decaa56018eea5abeb90f6c")
  public open
      fun stepScalingPolicyConfiguration(`value`: StepScalingPolicyConfigurationProperty.Builder.() -> Unit):
      Unit = stepScalingPolicyConfiguration(StepScalingPolicyConfigurationProperty(`value`))

  /**
   * A target tracking scaling policy.
   */
  public open fun targetTrackingScalingPolicyConfiguration(): Any? =
      unwrap(this).getTargetTrackingScalingPolicyConfiguration()

  /**
   * A target tracking scaling policy.
   */
  public open fun targetTrackingScalingPolicyConfiguration(`value`: IResolvable) {
    unwrap(this).setTargetTrackingScalingPolicyConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A target tracking scaling policy.
   */
  public open
      fun targetTrackingScalingPolicyConfiguration(`value`: TargetTrackingScalingPolicyConfigurationProperty) {
    unwrap(this).setTargetTrackingScalingPolicyConfiguration(`value`.let(TargetTrackingScalingPolicyConfigurationProperty.Companion::unwrap))
  }

  /**
   * A target tracking scaling policy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("74ed5148a1eadf12fcbce08abc20a4d1a727bbdd42219b76e6deac4420c304ef")
  public open
      fun targetTrackingScalingPolicyConfiguration(`value`: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
      Unit =
      targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty(`value`))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.applicationautoscaling.CfnScalingPolicy].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param policyName The name of the scaling policy. 
     */
    public fun policyName(policyName: String)

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
     * @param policyType The scaling policy type. 
     */
    public fun policyType(policyType: String)

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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid)
     * @param resourceId The identifier of the resource associated with the scaling policy. 
     */
    public fun resourceId(resourceId: String)

    /**
     * The scalable dimension. This string consists of the service namespace, resource type, and
     * scaling property.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension)
     * @param scalableDimension The scalable dimension. This string consists of the service
     * namespace, resource type, and scaling property. 
     */
    public fun scalableDimension(scalableDimension: String)

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
     * @param scalingTargetId The CloudFormation-generated ID of an Application Auto Scaling
     * scalable target. 
     */
    public fun scalingTargetId(scalingTargetId: String)

    /**
     * The namespace of the AWS service that provides the resource, or a `custom-resource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace)
     * @param serviceNamespace The namespace of the AWS service that provides the resource, or a
     * `custom-resource` . 
     */
    public fun serviceNamespace(serviceNamespace: String)

    /**
     * A step scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
     * @param stepScalingPolicyConfiguration A step scaling policy. 
     */
    public fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: IResolvable)

    /**
     * A step scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
     * @param stepScalingPolicyConfiguration A step scaling policy. 
     */
    public
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: StepScalingPolicyConfigurationProperty)

    /**
     * A step scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
     * @param stepScalingPolicyConfiguration A step scaling policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4233461c421591e47c223b679b39f21d2831ceb9981e55c0db6210e958ba422")
    public
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: StepScalingPolicyConfigurationProperty.Builder.() -> Unit)

    /**
     * A target tracking scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy. 
     */
    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable)

    /**
     * A target tracking scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy. 
     */
    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty)

    /**
     * A target tracking scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bb01833b031a51b7934bf5f38185ed693f8bf70cbf1dc28a15524df83ee436b")
    public
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.Builder =
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.Builder.create(scope,
        id)

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
     * @param policyName The name of the scaling policy. 
     */
    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

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
     * @param policyType The scaling policy type. 
     */
    override fun policyType(policyType: String) {
      cdkBuilder.policyType(policyType)
    }

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
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-resourceid)
     * @param resourceId The identifier of the resource associated with the scaling policy. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * The scalable dimension. This string consists of the service namespace, resource type, and
     * scaling property.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-scalabledimension)
     * @param scalableDimension The scalable dimension. This string consists of the service
     * namespace, resource type, and scaling property. 
     */
    override fun scalableDimension(scalableDimension: String) {
      cdkBuilder.scalableDimension(scalableDimension)
    }

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
     * @param scalingTargetId The CloudFormation-generated ID of an Application Auto Scaling
     * scalable target. 
     */
    override fun scalingTargetId(scalingTargetId: String) {
      cdkBuilder.scalingTargetId(scalingTargetId)
    }

    /**
     * The namespace of the AWS service that provides the resource, or a `custom-resource` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-servicenamespace)
     * @param serviceNamespace The namespace of the AWS service that provides the resource, or a
     * `custom-resource` . 
     */
    override fun serviceNamespace(serviceNamespace: String) {
      cdkBuilder.serviceNamespace(serviceNamespace)
    }

    /**
     * A step scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
     * @param stepScalingPolicyConfiguration A step scaling policy. 
     */
    override fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: IResolvable) {
      cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * A step scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
     * @param stepScalingPolicyConfiguration A step scaling policy. 
     */
    override
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: StepScalingPolicyConfigurationProperty) {
      cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration.let(StepScalingPolicyConfigurationProperty.Companion::unwrap))
    }

    /**
     * A step scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration)
     * @param stepScalingPolicyConfiguration A step scaling policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4233461c421591e47c223b679b39f21d2831ceb9981e55c0db6210e958ba422")
    override
        fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: StepScalingPolicyConfigurationProperty.Builder.() -> Unit):
        Unit =
        stepScalingPolicyConfiguration(StepScalingPolicyConfigurationProperty(stepScalingPolicyConfiguration))

    /**
     * A target tracking scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy. 
     */
    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
      cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * A target tracking scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy. 
     */
    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty) {
      cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration.let(TargetTrackingScalingPolicyConfigurationProperty.Companion::unwrap))
    }

    /**
     * A target tracking scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration)
     * @param targetTrackingScalingPolicyConfiguration A target tracking scaling policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bb01833b031a51b7934bf5f38185ed693f8bf70cbf1dc28a15524df83ee436b")
    override
        fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: TargetTrackingScalingPolicyConfigurationProperty.Builder.() -> Unit):
        Unit =
        targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty(targetTrackingScalingPolicyConfiguration))

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScalingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScalingPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy):
        CfnScalingPolicy = CfnScalingPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnScalingPolicy):
        software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy = wrapped.cdkObject
        as software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
  }

  /**
   * Contains customized metric specification information for a target tracking scaling policy for
   * Application Auto Scaling.
   *
   * For information about the available metrics for a service, see [AWS services that publish
   * CloudWatch
   * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
   * in the *Amazon CloudWatch User Guide* .
   *
   * To create your customized metric specification:
   *
   * * Add values for each required parameter from CloudWatch. You can use an existing metric, or a
   * new metric that you create. To use your own metric, you must first publish the metric to
   * CloudWatch. For more information, see [Publish custom
   * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/publishingMetrics.html) in
   * the *Amazon CloudWatch User Guide* .
   * * Choose a metric that changes proportionally with capacity. The value of the metric should
   * increase or decrease in inverse proportion to the number of capacity units. That is, the value of
   * the metric should decrease when capacity increases, and increase when capacity decreases.
   *
   * For an example of how creating new metrics can be useful, see [Scaling based on Amazon
   * SQS](https://docs.aws.amazon.com/autoscaling/ec2/userguide/as-using-sqs-queue.html) in the *Amazon
   * EC2 Auto Scaling User Guide* . This topic mentions Auto Scaling groups, but the same scenario for
   * Amazon SQS can apply to the target tracking scaling policies that you create for a Spot Fleet by
   * using Application Auto Scaling.
   *
   * For more information about the CloudWatch terminology below, see [Amazon CloudWatch
   * concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html)
   * .
   *
   * `CustomizedMetricSpecification` is a property of the
   * [AWS::ApplicationAutoScaling::ScalingPolicy
   * TargetTrackingScalingPolicyConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * CustomizedMetricSpecificationProperty customizedMetricSpecificationProperty =
   * CustomizedMetricSpecificationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html)
   */
  public interface CustomizedMetricSpecificationProperty {
    /**
     * The dimensions of the metric.
     *
     * Conditional: If you published your metric with dimensions, you must specify the same
     * dimensions in your scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-dimensions)
     */
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The name of the metric.
     *
     * To get the exact metric name, namespace, and dimensions, inspect the
     * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
     * object that's returned by a call to
     * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-metricname)
     */
    public fun metricName(): String? = unwrap(this).getMetricName()

    /**
     * The metrics to include in the target tracking scaling policy, as a metric data query.
     *
     * This can include both raw metric and metric math expressions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-metrics)
     */
    public fun metrics(): Any? = unwrap(this).getMetrics()

    /**
     * The namespace of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * The statistic of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-statistic)
     */
    public fun statistic(): String? = unwrap(this).getStatistic()

    /**
     * The unit of the metric.
     *
     * For a complete list of the units that CloudWatch supports, see the
     * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
     * data type in the *Amazon CloudWatch API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [CustomizedMetricSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(vararg dimensions: Any)

      /**
       * @param metricName The name of the metric.
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that's returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      public fun metricName(metricName: String)

      /**
       * @param metrics The metrics to include in the target tracking scaling policy, as a metric
       * data query.
       * This can include both raw metric and metric math expressions.
       */
      public fun metrics(metrics: IResolvable)

      /**
       * @param metrics The metrics to include in the target tracking scaling policy, as a metric
       * data query.
       * This can include both raw metric and metric math expressions.
       */
      public fun metrics(metrics: List<Any>)

      /**
       * @param metrics The metrics to include in the target tracking scaling policy, as a metric
       * data query.
       * This can include both raw metric and metric math expressions.
       */
      public fun metrics(vararg metrics: Any)

      /**
       * @param namespace The namespace of the metric.
       */
      public fun namespace(namespace: String)

      /**
       * @param statistic The statistic of the metric.
       */
      public fun statistic(statistic: String)

      /**
       * @param unit The unit of the metric.
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty.builder()

      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dimensions The dimensions of the metric.
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      /**
       * @param metricName The name of the metric.
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that's returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param metrics The metrics to include in the target tracking scaling policy, as a metric
       * data query.
       * This can include both raw metric and metric math expressions.
       */
      override fun metrics(metrics: IResolvable) {
        cdkBuilder.metrics(metrics.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metrics The metrics to include in the target tracking scaling policy, as a metric
       * data query.
       * This can include both raw metric and metric math expressions.
       */
      override fun metrics(metrics: List<Any>) {
        cdkBuilder.metrics(metrics.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param metrics The metrics to include in the target tracking scaling policy, as a metric
       * data query.
       * This can include both raw metric and metric math expressions.
       */
      override fun metrics(vararg metrics: Any): Unit = metrics(metrics.toList())

      /**
       * @param namespace The namespace of the metric.
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      /**
       * @param statistic The statistic of the metric.
       */
      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      /**
       * @param unit The unit of the metric.
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty,
    ) : CdkObject(cdkObject), CustomizedMetricSpecificationProperty {
      /**
       * The dimensions of the metric.
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-dimensions)
       */
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      /**
       * The name of the metric.
       *
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that's returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-metricname)
       */
      override fun metricName(): String? = unwrap(this).getMetricName()

      /**
       * The metrics to include in the target tracking scaling policy, as a metric data query.
       *
       * This can include both raw metric and metric math expressions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-metrics)
       */
      override fun metrics(): Any? = unwrap(this).getMetrics()

      /**
       * The namespace of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()

      /**
       * The statistic of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-statistic)
       */
      override fun statistic(): String? = unwrap(this).getStatistic()

      /**
       * The unit of the metric.
       *
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-customizedmetricspecification-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CustomizedMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty):
          CustomizedMetricSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CustomizedMetricSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CustomizedMetricSpecificationProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.CustomizedMetricSpecificationProperty
    }
  }

  /**
   * `MetricDimension` specifies a name/value pair that is part of the identity of a CloudWatch
   * metric for the `Dimensions` property of the [AWS::ApplicationAutoScaling::ScalingPolicy
   * CustomizedMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html)
   * property type. Duplicate dimensions are not allowed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html)
   */
  public interface MetricDimensionProperty {
    /**
     * The name of the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-name)
     */
    public fun name(): String

    /**
     * The value of the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-value)
     */
    public fun `value`(): String

    /**
     * A builder for [MetricDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the dimension. 
       */
      public fun name(name: String)

      /**
       * @param value The value of the dimension. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty.builder()

      /**
       * @param name The name of the dimension. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the dimension. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty,
    ) : CdkObject(cdkObject), MetricDimensionProperty {
      /**
       * The name of the dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The value of the dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-metricdimension.html#cfn-applicationautoscaling-scalingpolicy-metricdimension-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty):
          MetricDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricDimensionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricDimensionProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.MetricDimensionProperty
    }
  }

  /**
   * Contains predefined metric specification information for a target tracking scaling policy for
   * Application Auto Scaling.
   *
   * `PredefinedMetricSpecification` is a property of the
   * [AWS::ApplicationAutoScaling::ScalingPolicy
   * TargetTrackingScalingPolicyConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * PredefinedMetricSpecificationProperty predefinedMetricSpecificationProperty =
   * PredefinedMetricSpecificationProperty.builder()
   * .predefinedMetricType("predefinedMetricType")
   * // the properties below are optional
   * .resourceLabel("resourceLabel")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html)
   */
  public interface PredefinedMetricSpecificationProperty {
    /**
     * The metric type.
     *
     * The `ALBRequestCountPerTarget` metric type applies only to Spot fleet requests and ECS
     * services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
     */
    public fun predefinedMetricType(): String

    /**
     * Identifies the resource associated with the metric type.
     *
     * You can't specify a resource label unless the metric type is `ALBRequestCountPerTarget` and
     * there is a target group attached to the Spot Fleet or ECS service.
     *
     * You create the resource label by appending the final portion of the load balancer ARN and the
     * final portion of the target group ARN into a single value, separated by a forward slash (/). The
     * format of the resource label is:
     *
     * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
     *
     * Where:
     *
     * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
     * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target group
     * ARN.
     *
     * To find the ARN for an Application Load Balancer, use the
     * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
     * API operation. To find the ARN for the target group, use the
     * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
     * API operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
     */
    public fun resourceLabel(): String? = unwrap(this).getResourceLabel()

    /**
     * A builder for [PredefinedMetricSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param predefinedMetricType The metric type. 
       * The `ALBRequestCountPerTarget` metric type applies only to Spot fleet requests and ECS
       * services.
       */
      public fun predefinedMetricType(predefinedMetricType: String)

      /**
       * @param resourceLabel Identifies the resource associated with the metric type.
       * You can't specify a resource label unless the metric type is `ALBRequestCountPerTarget` and
       * there is a target group attached to the Spot Fleet or ECS service.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       */
      public fun resourceLabel(resourceLabel: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty.builder()

      /**
       * @param predefinedMetricType The metric type. 
       * The `ALBRequestCountPerTarget` metric type applies only to Spot fleet requests and ECS
       * services.
       */
      override fun predefinedMetricType(predefinedMetricType: String) {
        cdkBuilder.predefinedMetricType(predefinedMetricType)
      }

      /**
       * @param resourceLabel Identifies the resource associated with the metric type.
       * You can't specify a resource label unless the metric type is `ALBRequestCountPerTarget` and
       * there is a target group attached to the Spot Fleet or ECS service.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       */
      override fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty,
    ) : CdkObject(cdkObject), PredefinedMetricSpecificationProperty {
      /**
       * The metric type.
       *
       * The `ALBRequestCountPerTarget` metric type applies only to Spot fleet requests and ECS
       * services.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-predefinedmetrictype)
       */
      override fun predefinedMetricType(): String = unwrap(this).getPredefinedMetricType()

      /**
       * Identifies the resource associated with the metric type.
       *
       * You can't specify a resource label unless the metric type is `ALBRequestCountPerTarget` and
       * there is a target group attached to the Spot Fleet or ECS service.
       *
       * You create the resource label by appending the final portion of the load balancer ARN and
       * the final portion of the target group ARN into a single value, separated by a forward slash
       * (/). The format of the resource label is:
       *
       * `app/my-alb/778d41231b141a0f/targetgroup/my-alb-target-group/943f017f100becff` .
       *
       * Where:
       *
       * * app/<load-balancer-name>/<load-balancer-id> is the final portion of the load balancer ARN
       * * targetgroup/<target-group-name>/<target-group-id> is the final portion of the target
       * group ARN.
       *
       * To find the ARN for an Application Load Balancer, use the
       * [DescribeLoadBalancers](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeLoadBalancers.html)
       * API operation. To find the ARN for the target group, use the
       * [DescribeTargetGroups](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_DescribeTargetGroups.html)
       * API operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-predefinedmetricspecification.html#cfn-applicationautoscaling-scalingpolicy-predefinedmetricspecification-resourcelabel)
       */
      override fun resourceLabel(): String? = unwrap(this).getResourceLabel()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PredefinedMetricSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty):
          PredefinedMetricSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PredefinedMetricSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredefinedMetricSpecificationProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.PredefinedMetricSpecificationProperty
    }
  }

  /**
   * `StepAdjustment` specifies a step adjustment for the `StepAdjustments` property of the
   * [AWS::ApplicationAutoScaling::ScalingPolicy
   * StepScalingPolicyConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html)
   * property type.
   *
   * For the following examples, suppose that you have an alarm with a breach threshold of 50:
   *
   * * To trigger a step adjustment when the metric is greater than or equal to 50 and less than 60,
   * specify a lower bound of 0 and an upper bound of 10.
   * * To trigger a step adjustment when the metric is greater than 40 and less than or equal to 50,
   * specify a lower bound of -10 and an upper bound of 0.
   *
   * For more information, see [Step
   * adjustments](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html#as-scaling-steps)
   * in the *Application Auto Scaling User Guide* .
   *
   * You can find a sample template snippet in the
   * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html#aws-resource-applicationautoscaling-scalingpolicy--examples)
   * section of the `AWS::ApplicationAutoScaling::ScalingPolicy` documentation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * StepAdjustmentProperty stepAdjustmentProperty = StepAdjustmentProperty.builder()
   * .scalingAdjustment(123)
   * // the properties below are optional
   * .metricIntervalLowerBound(123)
   * .metricIntervalUpperBound(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepadjustment.html)
   */
  public interface StepAdjustmentProperty {
    /**
     * The lower bound for the difference between the alarm threshold and the CloudWatch metric.
     *
     * If the metric value is above the breach threshold, the lower bound is inclusive (the metric
     * must be greater than or equal to the threshold plus the lower bound). Otherwise, it is exclusive
     * (the metric must be greater than the threshold plus the lower bound). A null value indicates
     * negative infinity.
     *
     * You must specify at least one upper or lower bound.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepadjustment-metricintervallowerbound)
     */
    public fun metricIntervalLowerBound(): Number? = unwrap(this).getMetricIntervalLowerBound()

    /**
     * The upper bound for the difference between the alarm threshold and the CloudWatch metric.
     *
     * If the metric value is above the breach threshold, the upper bound is exclusive (the metric
     * must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric
     * must be less than or equal to the threshold plus the upper bound). A null value indicates
     * positive infinity.
     *
     * You must specify at least one upper or lower bound.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepadjustment-metricintervalupperbound)
     */
    public fun metricIntervalUpperBound(): Number? = unwrap(this).getMetricIntervalUpperBound()

    /**
     * The amount by which to scale.
     *
     * The adjustment is based on the value that you specified in the `AdjustmentType` property
     * (either an absolute number or a percentage). A positive value adds to the current capacity and a
     * negative number subtracts from the current capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepadjustment-scalingadjustment)
     */
    public fun scalingAdjustment(): Number

    /**
     * A builder for [StepAdjustmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metricIntervalLowerBound The lower bound for the difference between the alarm
       * threshold and the CloudWatch metric.
       * If the metric value is above the breach threshold, the lower bound is inclusive (the metric
       * must be greater than or equal to the threshold plus the lower bound). Otherwise, it is
       * exclusive (the metric must be greater than the threshold plus the lower bound). A null value
       * indicates negative infinity.
       *
       * You must specify at least one upper or lower bound.
       */
      public fun metricIntervalLowerBound(metricIntervalLowerBound: Number)

      /**
       * @param metricIntervalUpperBound The upper bound for the difference between the alarm
       * threshold and the CloudWatch metric.
       * If the metric value is above the breach threshold, the upper bound is exclusive (the metric
       * must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric
       * must be less than or equal to the threshold plus the upper bound). A null value indicates
       * positive infinity.
       *
       * You must specify at least one upper or lower bound.
       */
      public fun metricIntervalUpperBound(metricIntervalUpperBound: Number)

      /**
       * @param scalingAdjustment The amount by which to scale. 
       * The adjustment is based on the value that you specified in the `AdjustmentType` property
       * (either an absolute number or a percentage). A positive value adds to the current capacity and
       * a negative number subtracts from the current capacity.
       */
      public fun scalingAdjustment(scalingAdjustment: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty.builder()

      /**
       * @param metricIntervalLowerBound The lower bound for the difference between the alarm
       * threshold and the CloudWatch metric.
       * If the metric value is above the breach threshold, the lower bound is inclusive (the metric
       * must be greater than or equal to the threshold plus the lower bound). Otherwise, it is
       * exclusive (the metric must be greater than the threshold plus the lower bound). A null value
       * indicates negative infinity.
       *
       * You must specify at least one upper or lower bound.
       */
      override fun metricIntervalLowerBound(metricIntervalLowerBound: Number) {
        cdkBuilder.metricIntervalLowerBound(metricIntervalLowerBound)
      }

      /**
       * @param metricIntervalUpperBound The upper bound for the difference between the alarm
       * threshold and the CloudWatch metric.
       * If the metric value is above the breach threshold, the upper bound is exclusive (the metric
       * must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric
       * must be less than or equal to the threshold plus the upper bound). A null value indicates
       * positive infinity.
       *
       * You must specify at least one upper or lower bound.
       */
      override fun metricIntervalUpperBound(metricIntervalUpperBound: Number) {
        cdkBuilder.metricIntervalUpperBound(metricIntervalUpperBound)
      }

      /**
       * @param scalingAdjustment The amount by which to scale. 
       * The adjustment is based on the value that you specified in the `AdjustmentType` property
       * (either an absolute number or a percentage). A positive value adds to the current capacity and
       * a negative number subtracts from the current capacity.
       */
      override fun scalingAdjustment(scalingAdjustment: Number) {
        cdkBuilder.scalingAdjustment(scalingAdjustment)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty,
    ) : CdkObject(cdkObject), StepAdjustmentProperty {
      /**
       * The lower bound for the difference between the alarm threshold and the CloudWatch metric.
       *
       * If the metric value is above the breach threshold, the lower bound is inclusive (the metric
       * must be greater than or equal to the threshold plus the lower bound). Otherwise, it is
       * exclusive (the metric must be greater than the threshold plus the lower bound). A null value
       * indicates negative infinity.
       *
       * You must specify at least one upper or lower bound.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepadjustment-metricintervallowerbound)
       */
      override fun metricIntervalLowerBound(): Number? = unwrap(this).getMetricIntervalLowerBound()

      /**
       * The upper bound for the difference between the alarm threshold and the CloudWatch metric.
       *
       * If the metric value is above the breach threshold, the upper bound is exclusive (the metric
       * must be less than the threshold plus the upper bound). Otherwise, it is inclusive (the metric
       * must be less than or equal to the threshold plus the upper bound). A null value indicates
       * positive infinity.
       *
       * You must specify at least one upper or lower bound.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepadjustment-metricintervalupperbound)
       */
      override fun metricIntervalUpperBound(): Number? = unwrap(this).getMetricIntervalUpperBound()

      /**
       * The amount by which to scale.
       *
       * The adjustment is based on the value that you specified in the `AdjustmentType` property
       * (either an absolute number or a percentage). A positive value adds to the current capacity and
       * a negative number subtracts from the current capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepadjustment.html#cfn-applicationautoscaling-scalingpolicy-stepadjustment-scalingadjustment)
       */
      override fun scalingAdjustment(): Number = unwrap(this).getScalingAdjustment()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StepAdjustmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty):
          StepAdjustmentProperty = CdkObjectWrappers.wrap(cdkObject) as? StepAdjustmentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepAdjustmentProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepAdjustmentProperty
    }
  }

  /**
   * `StepScalingPolicyConfiguration` is a property of the
   * [AWS::ApplicationAutoScaling::ScalingPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
   * resource that specifies a step scaling policy configuration for Application Auto Scaling.
   *
   * For more information, see [Step scaling
   * policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-step-scaling-policies.html)
   * in the *Application Auto Scaling User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * StepScalingPolicyConfigurationProperty stepScalingPolicyConfigurationProperty =
   * StepScalingPolicyConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html)
   */
  public interface StepScalingPolicyConfigurationProperty {
    /**
     * Specifies whether the `ScalingAdjustment` value in the `StepAdjustment` property is an
     * absolute number or a percentage of the current capacity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-adjustmenttype)
     */
    public fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

    /**
     * The amount of time, in seconds, to wait for a previous scaling activity to take effect.
     *
     * If not specified, the default value is 300. For more information, see [Cooldown
     * period](https://docs.aws.amazon.com/autoscaling/application/userguide/step-scaling-policy-overview.html#step-scaling-cooldown)
     * in the *Application Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-cooldown)
     */
    public fun cooldown(): Number? = unwrap(this).getCooldown()

    /**
     * The aggregation type for the CloudWatch metrics.
     *
     * Valid values are `Minimum` , `Maximum` , and `Average` . If the aggregation type is null, the
     * value is treated as `Average` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-metricaggregationtype)
     */
    public fun metricAggregationType(): String? = unwrap(this).getMetricAggregationType()

    /**
     * The minimum value to scale by when the adjustment type is `PercentChangeInCapacity` .
     *
     * For example, suppose that you create a step scaling policy to scale out an Amazon ECS service
     * by 25 percent and you specify a `MinAdjustmentMagnitude` of 2. If the service has 4 tasks and
     * the scaling policy is performed, 25 percent of 4 is 1. However, because you specified a
     * `MinAdjustmentMagnitude` of 2, Application Auto Scaling scales out the service by 2 tasks.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-minadjustmentmagnitude)
     */
    public fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

    /**
     * A set of adjustments that enable you to scale based on the size of the alarm breach.
     *
     * At least one step adjustment is required if you are adding a new step scaling policy
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustments)
     */
    public fun stepAdjustments(): Any? = unwrap(this).getStepAdjustments()

    /**
     * A builder for [StepScalingPolicyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adjustmentType Specifies whether the `ScalingAdjustment` value in the
       * `StepAdjustment` property is an absolute number or a percentage of the current capacity.
       */
      public fun adjustmentType(adjustmentType: String)

      /**
       * @param cooldown The amount of time, in seconds, to wait for a previous scaling activity to
       * take effect.
       * If not specified, the default value is 300. For more information, see [Cooldown
       * period](https://docs.aws.amazon.com/autoscaling/application/userguide/step-scaling-policy-overview.html#step-scaling-cooldown)
       * in the *Application Auto Scaling User Guide* .
       */
      public fun cooldown(cooldown: Number)

      /**
       * @param metricAggregationType The aggregation type for the CloudWatch metrics.
       * Valid values are `Minimum` , `Maximum` , and `Average` . If the aggregation type is null,
       * the value is treated as `Average` .
       */
      public fun metricAggregationType(metricAggregationType: String)

      /**
       * @param minAdjustmentMagnitude The minimum value to scale by when the adjustment type is
       * `PercentChangeInCapacity` .
       * For example, suppose that you create a step scaling policy to scale out an Amazon ECS
       * service by 25 percent and you specify a `MinAdjustmentMagnitude` of 2. If the service has 4
       * tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you
       * specified a `MinAdjustmentMagnitude` of 2, Application Auto Scaling scales out the service by
       * 2 tasks.
       */
      public fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number)

      /**
       * @param stepAdjustments A set of adjustments that enable you to scale based on the size of
       * the alarm breach.
       * At least one step adjustment is required if you are adding a new step scaling policy
       * configuration.
       */
      public fun stepAdjustments(stepAdjustments: IResolvable)

      /**
       * @param stepAdjustments A set of adjustments that enable you to scale based on the size of
       * the alarm breach.
       * At least one step adjustment is required if you are adding a new step scaling policy
       * configuration.
       */
      public fun stepAdjustments(stepAdjustments: List<Any>)

      /**
       * @param stepAdjustments A set of adjustments that enable you to scale based on the size of
       * the alarm breach.
       * At least one step adjustment is required if you are adding a new step scaling policy
       * configuration.
       */
      public fun stepAdjustments(vararg stepAdjustments: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty.builder()

      /**
       * @param adjustmentType Specifies whether the `ScalingAdjustment` value in the
       * `StepAdjustment` property is an absolute number or a percentage of the current capacity.
       */
      override fun adjustmentType(adjustmentType: String) {
        cdkBuilder.adjustmentType(adjustmentType)
      }

      /**
       * @param cooldown The amount of time, in seconds, to wait for a previous scaling activity to
       * take effect.
       * If not specified, the default value is 300. For more information, see [Cooldown
       * period](https://docs.aws.amazon.com/autoscaling/application/userguide/step-scaling-policy-overview.html#step-scaling-cooldown)
       * in the *Application Auto Scaling User Guide* .
       */
      override fun cooldown(cooldown: Number) {
        cdkBuilder.cooldown(cooldown)
      }

      /**
       * @param metricAggregationType The aggregation type for the CloudWatch metrics.
       * Valid values are `Minimum` , `Maximum` , and `Average` . If the aggregation type is null,
       * the value is treated as `Average` .
       */
      override fun metricAggregationType(metricAggregationType: String) {
        cdkBuilder.metricAggregationType(metricAggregationType)
      }

      /**
       * @param minAdjustmentMagnitude The minimum value to scale by when the adjustment type is
       * `PercentChangeInCapacity` .
       * For example, suppose that you create a step scaling policy to scale out an Amazon ECS
       * service by 25 percent and you specify a `MinAdjustmentMagnitude` of 2. If the service has 4
       * tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you
       * specified a `MinAdjustmentMagnitude` of 2, Application Auto Scaling scales out the service by
       * 2 tasks.
       */
      override fun minAdjustmentMagnitude(minAdjustmentMagnitude: Number) {
        cdkBuilder.minAdjustmentMagnitude(minAdjustmentMagnitude)
      }

      /**
       * @param stepAdjustments A set of adjustments that enable you to scale based on the size of
       * the alarm breach.
       * At least one step adjustment is required if you are adding a new step scaling policy
       * configuration.
       */
      override fun stepAdjustments(stepAdjustments: IResolvable) {
        cdkBuilder.stepAdjustments(stepAdjustments.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stepAdjustments A set of adjustments that enable you to scale based on the size of
       * the alarm breach.
       * At least one step adjustment is required if you are adding a new step scaling policy
       * configuration.
       */
      override fun stepAdjustments(stepAdjustments: List<Any>) {
        cdkBuilder.stepAdjustments(stepAdjustments.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param stepAdjustments A set of adjustments that enable you to scale based on the size of
       * the alarm breach.
       * At least one step adjustment is required if you are adding a new step scaling policy
       * configuration.
       */
      override fun stepAdjustments(vararg stepAdjustments: Any): Unit =
          stepAdjustments(stepAdjustments.toList())

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty,
    ) : CdkObject(cdkObject), StepScalingPolicyConfigurationProperty {
      /**
       * Specifies whether the `ScalingAdjustment` value in the `StepAdjustment` property is an
       * absolute number or a percentage of the current capacity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-adjustmenttype)
       */
      override fun adjustmentType(): String? = unwrap(this).getAdjustmentType()

      /**
       * The amount of time, in seconds, to wait for a previous scaling activity to take effect.
       *
       * If not specified, the default value is 300. For more information, see [Cooldown
       * period](https://docs.aws.amazon.com/autoscaling/application/userguide/step-scaling-policy-overview.html#step-scaling-cooldown)
       * in the *Application Auto Scaling User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-cooldown)
       */
      override fun cooldown(): Number? = unwrap(this).getCooldown()

      /**
       * The aggregation type for the CloudWatch metrics.
       *
       * Valid values are `Minimum` , `Maximum` , and `Average` . If the aggregation type is null,
       * the value is treated as `Average` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-metricaggregationtype)
       */
      override fun metricAggregationType(): String? = unwrap(this).getMetricAggregationType()

      /**
       * The minimum value to scale by when the adjustment type is `PercentChangeInCapacity` .
       *
       * For example, suppose that you create a step scaling policy to scale out an Amazon ECS
       * service by 25 percent and you specify a `MinAdjustmentMagnitude` of 2. If the service has 4
       * tasks and the scaling policy is performed, 25 percent of 4 is 1. However, because you
       * specified a `MinAdjustmentMagnitude` of 2, Application Auto Scaling scales out the service by
       * 2 tasks.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-minadjustmentmagnitude)
       */
      override fun minAdjustmentMagnitude(): Number? = unwrap(this).getMinAdjustmentMagnitude()

      /**
       * A set of adjustments that enable you to scale based on the size of the alarm breach.
       *
       * At least one step adjustment is required if you are adding a new step scaling policy
       * configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-stepscalingpolicyconfiguration-stepadjustments)
       */
      override fun stepAdjustments(): Any? = unwrap(this).getStepAdjustments()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          StepScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty):
          StepScalingPolicyConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          StepScalingPolicyConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: StepScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.StepScalingPolicyConfigurationProperty
    }
  }

  /**
   * The metric data to return.
   *
   * Also defines whether this call is returning data for one metric only, or whether it is
   * performing a math expression on the values of returned metric statistics to create a new time
   * series. A time series is a series of data points, each of which is associated with a timestamp.
   *
   * You can call for a single metric or perform math expressions on multiple metrics. Any
   * expressions used in a metric specification must eventually return a single time series.
   *
   * For more information and examples, see [Create a target tracking scaling policy for Application
   * Auto Scaling using metric
   * math](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking-metric-math.html)
   * in the *Application Auto Scaling User Guide* .
   *
   * `TargetTrackingMetricDataQuery` is a property of the
   * [AWS::ApplicationAutoScaling::ScalingPolicy
   * CustomizedMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-customizedmetricspecification.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * TargetTrackingMetricDataQueryProperty targetTrackingMetricDataQueryProperty =
   * TargetTrackingMetricDataQueryProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html)
   */
  public interface TargetTrackingMetricDataQueryProperty {
    /**
     * The math expression to perform on the returned data, if this object is performing a math
     * expression.
     *
     * This expression can use the `Id` of the other metrics to refer to those metrics, and can also
     * use the `Id` of other expressions to use the result of those expressions.
     *
     * Conditional: Within each `TargetTrackingMetricDataQuery` object, you must specify either
     * `Expression` or `MetricStat` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery-expression)
     */
    public fun expression(): String? = unwrap(this).getExpression()

    /**
     * A short name that identifies the object's results in the response.
     *
     * This name must be unique among all `MetricDataQuery` objects specified for a single scaling
     * policy. If you are performing math expressions on this set of data, this name represents that
     * data and can serve as a variable in the mathematical expression. The valid characters are
     * letters, numbers, and underscores. The first character must be a lowercase letter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * A human-readable label for this metric or expression.
     *
     * This is especially useful if this is a math expression, so that you know what the value
     * represents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery-label)
     */
    public fun label(): String? = unwrap(this).getLabel()

    /**
     * Information about the metric data to return.
     *
     * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
     * `MetricStat` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery-metricstat)
     */
    public fun metricStat(): Any? = unwrap(this).getMetricStat()

    /**
     * Indicates whether to return the timestamps and raw data values of this metric.
     *
     * If you use any math expressions, specify `true` for this value for only the final math
     * expression that the metric specification is based on. You must specify `false` for `ReturnData`
     * for all the other metrics and expressions used in the metric specification.
     *
     * If you are only retrieving metrics and not performing any math expressions, do not specify
     * anything for `ReturnData` . This sets it to its default ( `true` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery-returndata)
     */
    public fun returnData(): Any? = unwrap(this).getReturnData()

    /**
     * A builder for [TargetTrackingMetricDataQueryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression The math expression to perform on the returned data, if this object is
       * performing a math expression.
       * This expression can use the `Id` of the other metrics to refer to those metrics, and can
       * also use the `Id` of other expressions to use the result of those expressions.
       *
       * Conditional: Within each `TargetTrackingMetricDataQuery` object, you must specify either
       * `Expression` or `MetricStat` , but not both.
       */
      public fun expression(expression: String)

      /**
       * @param id A short name that identifies the object's results in the response.
       * This name must be unique among all `MetricDataQuery` objects specified for a single scaling
       * policy. If you are performing math expressions on this set of data, this name represents that
       * data and can serve as a variable in the mathematical expression. The valid characters are
       * letters, numbers, and underscores. The first character must be a lowercase letter.
       */
      public fun id(id: String)

      /**
       * @param label A human-readable label for this metric or expression.
       * This is especially useful if this is a math expression, so that you know what the value
       * represents.
       */
      public fun label(label: String)

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      public fun metricStat(metricStat: IResolvable)

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      public fun metricStat(metricStat: TargetTrackingMetricStatProperty)

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("212adca6a74036f0fadf8d3aab1a9cd434f87243e7be7d72832b6caf3cc86131")
      public fun metricStat(metricStat: TargetTrackingMetricStatProperty.Builder.() -> Unit)

      /**
       * @param returnData Indicates whether to return the timestamps and raw data values of this
       * metric.
       * If you use any math expressions, specify `true` for this value for only the final math
       * expression that the metric specification is based on. You must specify `false` for
       * `ReturnData` for all the other metrics and expressions used in the metric specification.
       *
       * If you are only retrieving metrics and not performing any math expressions, do not specify
       * anything for `ReturnData` . This sets it to its default ( `true` ).
       */
      public fun returnData(returnData: Boolean)

      /**
       * @param returnData Indicates whether to return the timestamps and raw data values of this
       * metric.
       * If you use any math expressions, specify `true` for this value for only the final math
       * expression that the metric specification is based on. You must specify `false` for
       * `ReturnData` for all the other metrics and expressions used in the metric specification.
       *
       * If you are only retrieving metrics and not performing any math expressions, do not specify
       * anything for `ReturnData` . This sets it to its default ( `true` ).
       */
      public fun returnData(returnData: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty.builder()

      /**
       * @param expression The math expression to perform on the returned data, if this object is
       * performing a math expression.
       * This expression can use the `Id` of the other metrics to refer to those metrics, and can
       * also use the `Id` of other expressions to use the result of those expressions.
       *
       * Conditional: Within each `TargetTrackingMetricDataQuery` object, you must specify either
       * `Expression` or `MetricStat` , but not both.
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param id A short name that identifies the object's results in the response.
       * This name must be unique among all `MetricDataQuery` objects specified for a single scaling
       * policy. If you are performing math expressions on this set of data, this name represents that
       * data and can serve as a variable in the mathematical expression. The valid characters are
       * letters, numbers, and underscores. The first character must be a lowercase letter.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param label A human-readable label for this metric or expression.
       * This is especially useful if this is a math expression, so that you know what the value
       * represents.
       */
      override fun label(label: String) {
        cdkBuilder.label(label)
      }

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      override fun metricStat(metricStat: IResolvable) {
        cdkBuilder.metricStat(metricStat.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      override fun metricStat(metricStat: TargetTrackingMetricStatProperty) {
        cdkBuilder.metricStat(metricStat.let(TargetTrackingMetricStatProperty.Companion::unwrap))
      }

      /**
       * @param metricStat Information about the metric data to return.
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("212adca6a74036f0fadf8d3aab1a9cd434f87243e7be7d72832b6caf3cc86131")
      override fun metricStat(metricStat: TargetTrackingMetricStatProperty.Builder.() -> Unit): Unit
          = metricStat(TargetTrackingMetricStatProperty(metricStat))

      /**
       * @param returnData Indicates whether to return the timestamps and raw data values of this
       * metric.
       * If you use any math expressions, specify `true` for this value for only the final math
       * expression that the metric specification is based on. You must specify `false` for
       * `ReturnData` for all the other metrics and expressions used in the metric specification.
       *
       * If you are only retrieving metrics and not performing any math expressions, do not specify
       * anything for `ReturnData` . This sets it to its default ( `true` ).
       */
      override fun returnData(returnData: Boolean) {
        cdkBuilder.returnData(returnData)
      }

      /**
       * @param returnData Indicates whether to return the timestamps and raw data values of this
       * metric.
       * If you use any math expressions, specify `true` for this value for only the final math
       * expression that the metric specification is based on. You must specify `false` for
       * `ReturnData` for all the other metrics and expressions used in the metric specification.
       *
       * If you are only retrieving metrics and not performing any math expressions, do not specify
       * anything for `ReturnData` . This sets it to its default ( `true` ).
       */
      override fun returnData(returnData: IResolvable) {
        cdkBuilder.returnData(returnData.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty,
    ) : CdkObject(cdkObject), TargetTrackingMetricDataQueryProperty {
      /**
       * The math expression to perform on the returned data, if this object is performing a math
       * expression.
       *
       * This expression can use the `Id` of the other metrics to refer to those metrics, and can
       * also use the `Id` of other expressions to use the result of those expressions.
       *
       * Conditional: Within each `TargetTrackingMetricDataQuery` object, you must specify either
       * `Expression` or `MetricStat` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery-expression)
       */
      override fun expression(): String? = unwrap(this).getExpression()

      /**
       * A short name that identifies the object's results in the response.
       *
       * This name must be unique among all `MetricDataQuery` objects specified for a single scaling
       * policy. If you are performing math expressions on this set of data, this name represents that
       * data and can serve as a variable in the mathematical expression. The valid characters are
       * letters, numbers, and underscores. The first character must be a lowercase letter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery-id)
       */
      override fun id(): String? = unwrap(this).getId()

      /**
       * A human-readable label for this metric or expression.
       *
       * This is especially useful if this is a math expression, so that you know what the value
       * represents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery-label)
       */
      override fun label(): String? = unwrap(this).getLabel()

      /**
       * Information about the metric data to return.
       *
       * Conditional: Within each `MetricDataQuery` object, you must specify either `Expression` or
       * `MetricStat` , but not both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery-metricstat)
       */
      override fun metricStat(): Any? = unwrap(this).getMetricStat()

      /**
       * Indicates whether to return the timestamps and raw data values of this metric.
       *
       * If you use any math expressions, specify `true` for this value for only the final math
       * expression that the metric specification is based on. You must specify `false` for
       * `ReturnData` for all the other metrics and expressions used in the metric specification.
       *
       * If you are only retrieving metrics and not performing any math expressions, do not specify
       * anything for `ReturnData` . This sets it to its default ( `true` ).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery-returndata)
       */
      override fun returnData(): Any? = unwrap(this).getReturnData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingMetricDataQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty):
          TargetTrackingMetricDataQueryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetTrackingMetricDataQueryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingMetricDataQueryProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDataQueryProperty
    }
  }

  /**
   * `TargetTrackingMetricDimension` specifies a name/value pair that is part of the identity of a
   * CloudWatch metric for the `Dimensions` property of the [AWS::ApplicationAutoScaling::ScalingPolicy
   * TargetTrackingMetric](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetric.html)
   * property type. Duplicate dimensions are not allowed.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * TargetTrackingMetricDimensionProperty targetTrackingMetricDimensionProperty =
   * TargetTrackingMetricDimensionProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdimension.html)
   */
  public interface TargetTrackingMetricDimensionProperty {
    /**
     * The name of the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdimension.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdimension-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value of the dimension.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdimension.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdimension-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [TargetTrackingMetricDimensionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the dimension.
       */
      public fun name(name: String)

      /**
       * @param value The value of the dimension.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty.builder()

      /**
       * @param name The name of the dimension.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value of the dimension.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty,
    ) : CdkObject(cdkObject), TargetTrackingMetricDimensionProperty {
      /**
       * The name of the dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdimension.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdimension-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value of the dimension.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdimension.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricdimension-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingMetricDimensionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty):
          TargetTrackingMetricDimensionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetTrackingMetricDimensionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingMetricDimensionProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricDimensionProperty
    }
  }

  /**
   * Represents a specific metric for a target tracking scaling policy for Application Auto Scaling.
   *
   * Metric is a property of the [AWS::ApplicationAutoScaling::ScalingPolicy
   * TargetTrackingMetricStat](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricstat.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * TargetTrackingMetricProperty targetTrackingMetricProperty =
   * TargetTrackingMetricProperty.builder()
   * .dimensions(List.of(TargetTrackingMetricDimensionProperty.builder()
   * .name("name")
   * .value("value")
   * .build()))
   * .metricName("metricName")
   * .namespace("namespace")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetric.html)
   */
  public interface TargetTrackingMetricProperty {
    /**
     * The dimensions for the metric.
     *
     * For the list of available dimensions, see the AWS documentation available from the table in
     * [AWS services that publish CloudWatch
     * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * Conditional: If you published your metric with dimensions, you must specify the same
     * dimensions in your scaling policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetric.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetric-dimensions)
     */
    public fun dimensions(): Any? = unwrap(this).getDimensions()

    /**
     * The name of the metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetric.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetric-metricname)
     */
    public fun metricName(): String? = unwrap(this).getMetricName()

    /**
     * The namespace of the metric.
     *
     * For more information, see the table in [AWS services that publish CloudWatch
     * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetric.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetric-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * A builder for [TargetTrackingMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(dimensions: IResolvable)

      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(dimensions: List<Any>)

      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      public fun dimensions(vararg dimensions: Any)

      /**
       * @param metricName The name of the metric.
       */
      public fun metricName(metricName: String)

      /**
       * @param namespace The namespace of the metric.
       * For more information, see the table in [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty.builder()

      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(dimensions: List<Any>) {
        cdkBuilder.dimensions(dimensions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param dimensions The dimensions for the metric.
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       */
      override fun dimensions(vararg dimensions: Any): Unit = dimensions(dimensions.toList())

      /**
       * @param metricName The name of the metric.
       */
      override fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
      }

      /**
       * @param namespace The namespace of the metric.
       * For more information, see the table in [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty,
    ) : CdkObject(cdkObject), TargetTrackingMetricProperty {
      /**
       * The dimensions for the metric.
       *
       * For the list of available dimensions, see the AWS documentation available from the table in
       * [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * Conditional: If you published your metric with dimensions, you must specify the same
       * dimensions in your scaling policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetric.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetric-dimensions)
       */
      override fun dimensions(): Any? = unwrap(this).getDimensions()

      /**
       * The name of the metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetric.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetric-metricname)
       */
      override fun metricName(): String? = unwrap(this).getMetricName()

      /**
       * The namespace of the metric.
       *
       * For more information, see the table in [AWS services that publish CloudWatch
       * metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/aws-services-cloudwatch-metrics.html)
       * in the *Amazon CloudWatch User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetric.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetric-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetTrackingMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty):
          TargetTrackingMetricProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetTrackingMetricProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingMetricProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricProperty
    }
  }

  /**
   * This structure defines the CloudWatch metric to return, along with the statistic and unit.
   *
   * `TargetTrackingMetricStat` is a property of the [AWS::ApplicationAutoScaling::ScalingPolicy
   * TargetTrackingMetricDataQuery](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdataquery.html)
   * property type.
   *
   * For more information about the CloudWatch terminology below, see [Amazon CloudWatch
   * concepts](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html)
   * in the *Amazon CloudWatch User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * TargetTrackingMetricStatProperty targetTrackingMetricStatProperty =
   * TargetTrackingMetricStatProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricstat.html)
   */
  public interface TargetTrackingMetricStatProperty {
    /**
     * The CloudWatch metric to return, including the metric name, namespace, and dimensions.
     *
     * To get the exact metric name, namespace, and dimensions, inspect the
     * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
     * object that is returned by a call to
     * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricstat.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricstat-metric)
     */
    public fun metric(): Any? = unwrap(this).getMetric()

    /**
     * The statistic to return.
     *
     * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
     * see the table in
     * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
     * in the *Amazon CloudWatch User Guide* .
     *
     * The most commonly used metric for scaling is `Average` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricstat.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricstat-stat)
     */
    public fun stat(): String? = unwrap(this).getStat()

    /**
     * The unit to use for the returned data points.
     *
     * For a complete list of the units that CloudWatch supports, see the
     * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
     * data type in the *Amazon CloudWatch API Reference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricstat.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricstat-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * A builder for [TargetTrackingMetricStatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions.
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      public fun metric(metric: IResolvable)

      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions.
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      public fun metric(metric: TargetTrackingMetricProperty)

      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions.
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1a4e1aa6ba488e4ff61ccab0feebf5b3aadf6fb5a9a2d56771735f9dcdfed9")
      public fun metric(metric: TargetTrackingMetricProperty.Builder.() -> Unit)

      /**
       * @param stat The statistic to return.
       * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
       * see the table in
       * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
       * in the *Amazon CloudWatch User Guide* .
       *
       * The most commonly used metric for scaling is `Average` .
       */
      public fun stat(stat: String)

      /**
       * @param unit The unit to use for the returned data points.
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       */
      public fun unit(unit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty.builder()

      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions.
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions.
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      override fun metric(metric: TargetTrackingMetricProperty) {
        cdkBuilder.metric(metric.let(TargetTrackingMetricProperty.Companion::unwrap))
      }

      /**
       * @param metric The CloudWatch metric to return, including the metric name, namespace, and
       * dimensions.
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5c1a4e1aa6ba488e4ff61ccab0feebf5b3aadf6fb5a9a2d56771735f9dcdfed9")
      override fun metric(metric: TargetTrackingMetricProperty.Builder.() -> Unit): Unit =
          metric(TargetTrackingMetricProperty(metric))

      /**
       * @param stat The statistic to return.
       * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
       * see the table in
       * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
       * in the *Amazon CloudWatch User Guide* .
       *
       * The most commonly used metric for scaling is `Average` .
       */
      override fun stat(stat: String) {
        cdkBuilder.stat(stat)
      }

      /**
       * @param unit The unit to use for the returned data points.
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty,
    ) : CdkObject(cdkObject), TargetTrackingMetricStatProperty {
      /**
       * The CloudWatch metric to return, including the metric name, namespace, and dimensions.
       *
       * To get the exact metric name, namespace, and dimensions, inspect the
       * [Metric](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_Metric.html)
       * object that is returned by a call to
       * [ListMetrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_ListMetrics.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricstat.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricstat-metric)
       */
      override fun metric(): Any? = unwrap(this).getMetric()

      /**
       * The statistic to return.
       *
       * It can include any CloudWatch statistic or extended statistic. For a list of valid values,
       * see the table in
       * [Statistics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cloudwatch_concepts.html#Statistic)
       * in the *Amazon CloudWatch User Guide* .
       *
       * The most commonly used metric for scaling is `Average` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricstat.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricstat-stat)
       */
      override fun stat(): String? = unwrap(this).getStat()

      /**
       * The unit to use for the returned data points.
       *
       * For a complete list of the units that CloudWatch supports, see the
       * [MetricDatum](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_MetricDatum.html)
       * data type in the *Amazon CloudWatch API Reference* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricstat.html#cfn-applicationautoscaling-scalingpolicy-targettrackingmetricstat-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetTrackingMetricStatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty):
          TargetTrackingMetricStatProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetTrackingMetricStatProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingMetricStatProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingMetricStatProperty
    }
  }

  /**
   * `TargetTrackingScalingPolicyConfiguration` is a property of the
   * [AWS::ApplicationAutoScaling::ScalingPolicy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationautoscaling-scalingpolicy.html)
   * resource that specifies a target tracking scaling policy configuration for Application Auto
   * Scaling. Use a target tracking scaling policy to adjust the capacity of the specified scalable
   * target in response to actual workloads, so that resource utilization remains at or near the target
   * utilization value.
   *
   * For more information, see [Target tracking scaling
   * policies](https://docs.aws.amazon.com/autoscaling/application/userguide/application-auto-scaling-target-tracking.html)
   * in the *Application Auto Scaling User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
   * TargetTrackingScalingPolicyConfigurationProperty
   * targetTrackingScalingPolicyConfigurationProperty =
   * TargetTrackingScalingPolicyConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html)
   */
  public interface TargetTrackingScalingPolicyConfigurationProperty {
    /**
     * A customized metric.
     *
     * You can specify either a predefined metric or a customized metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-customizedmetricspecification)
     */
    public fun customizedMetricSpecification(): Any? =
        unwrap(this).getCustomizedMetricSpecification()

    /**
     * Indicates whether scale in by the target tracking scaling policy is disabled.
     *
     * If the value is `true` , scale in is disabled and the target tracking scaling policy won't
     * remove capacity from the scalable target. Otherwise, scale in is enabled and the target tracking
     * scaling policy can remove capacity from the scalable target. The default value is `false` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein)
     */
    public fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

    /**
     * A predefined metric.
     *
     * You can specify either a predefined metric or a customized metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-predefinedmetricspecification)
     */
    public fun predefinedMetricSpecification(): Any? =
        unwrap(this).getPredefinedMetricSpecification()

    /**
     * The amount of time, in seconds, after a scale-in activity completes before another scale-in
     * activity can start.
     *
     * For more information and for default values, see [Define cooldown
     * periods](https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown)
     * in the *Application Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown)
     */
    public fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

    /**
     * The amount of time, in seconds, to wait for a previous scale-out activity to take effect.
     *
     * For more information and for default values, see [Define cooldown
     * periods](https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown)
     * in the *Application Auto Scaling User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown)
     */
    public fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

    /**
     * The target value for the metric.
     *
     * Although this property accepts numbers of type Double, it won't accept values that are either
     * too small or too large. Values must be in the range of -2^360 to 2^360. The value must be a
     * valid number based on the choice of metric. For example, if the metric is CPU utilization, then
     * the target value is a percent value that represents how much of the CPU can be used before
     * scaling out.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue)
     */
    public fun targetValue(): Number

    /**
     * A builder for [TargetTrackingScalingPolicyConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param customizedMetricSpecification A customized metric.
       * You can specify either a predefined metric or a customized metric.
       */
      public fun customizedMetricSpecification(customizedMetricSpecification: IResolvable)

      /**
       * @param customizedMetricSpecification A customized metric.
       * You can specify either a predefined metric or a customized metric.
       */
      public
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty)

      /**
       * @param customizedMetricSpecification A customized metric.
       * You can specify either a predefined metric or a customized metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0fe2d38cab95b93f60665ae50eacec48c022280a20a01316669b2fe3c29e9e41")
      public
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty.Builder.() -> Unit)

      /**
       * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
       * disabled.
       * If the value is `true` , scale in is disabled and the target tracking scaling policy won't
       * remove capacity from the scalable target. Otherwise, scale in is enabled and the target
       * tracking scaling policy can remove capacity from the scalable target. The default value is
       * `false` .
       */
      public fun disableScaleIn(disableScaleIn: Boolean)

      /**
       * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
       * disabled.
       * If the value is `true` , scale in is disabled and the target tracking scaling policy won't
       * remove capacity from the scalable target. Otherwise, scale in is enabled and the target
       * tracking scaling policy can remove capacity from the scalable target. The default value is
       * `false` .
       */
      public fun disableScaleIn(disableScaleIn: IResolvable)

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You can specify either a predefined metric or a customized metric.
       */
      public fun predefinedMetricSpecification(predefinedMetricSpecification: IResolvable)

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You can specify either a predefined metric or a customized metric.
       */
      public
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty)

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You can specify either a predefined metric or a customized metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e620e4bb9d79b0fdbbba8341f5cd87f28064dcd828e54b89de06cfc98c2c766a")
      public
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty.Builder.() -> Unit)

      /**
       * @param scaleInCooldown The amount of time, in seconds, after a scale-in activity completes
       * before another scale-in activity can start.
       * For more information and for default values, see [Define cooldown
       * periods](https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown)
       * in the *Application Auto Scaling User Guide* .
       */
      public fun scaleInCooldown(scaleInCooldown: Number)

      /**
       * @param scaleOutCooldown The amount of time, in seconds, to wait for a previous scale-out
       * activity to take effect.
       * For more information and for default values, see [Define cooldown
       * periods](https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown)
       * in the *Application Auto Scaling User Guide* .
       */
      public fun scaleOutCooldown(scaleOutCooldown: Number)

      /**
       * @param targetValue The target value for the metric. 
       * Although this property accepts numbers of type Double, it won't accept values that are
       * either too small or too large. Values must be in the range of -2^360 to 2^360. The value must
       * be a valid number based on the choice of metric. For example, if the metric is CPU
       * utilization, then the target value is a percent value that represents how much of the CPU can
       * be used before scaling out.
       */
      public fun targetValue(targetValue: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.builder()

      /**
       * @param customizedMetricSpecification A customized metric.
       * You can specify either a predefined metric or a customized metric.
       */
      override fun customizedMetricSpecification(customizedMetricSpecification: IResolvable) {
        cdkBuilder.customizedMetricSpecification(customizedMetricSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param customizedMetricSpecification A customized metric.
       * You can specify either a predefined metric or a customized metric.
       */
      override
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty) {
        cdkBuilder.customizedMetricSpecification(customizedMetricSpecification.let(CustomizedMetricSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param customizedMetricSpecification A customized metric.
       * You can specify either a predefined metric or a customized metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0fe2d38cab95b93f60665ae50eacec48c022280a20a01316669b2fe3c29e9e41")
      override
          fun customizedMetricSpecification(customizedMetricSpecification: CustomizedMetricSpecificationProperty.Builder.() -> Unit):
          Unit =
          customizedMetricSpecification(CustomizedMetricSpecificationProperty(customizedMetricSpecification))

      /**
       * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
       * disabled.
       * If the value is `true` , scale in is disabled and the target tracking scaling policy won't
       * remove capacity from the scalable target. Otherwise, scale in is enabled and the target
       * tracking scaling policy can remove capacity from the scalable target. The default value is
       * `false` .
       */
      override fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
      }

      /**
       * @param disableScaleIn Indicates whether scale in by the target tracking scaling policy is
       * disabled.
       * If the value is `true` , scale in is disabled and the target tracking scaling policy won't
       * remove capacity from the scalable target. Otherwise, scale in is enabled and the target
       * tracking scaling policy can remove capacity from the scalable target. The default value is
       * `false` .
       */
      override fun disableScaleIn(disableScaleIn: IResolvable) {
        cdkBuilder.disableScaleIn(disableScaleIn.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You can specify either a predefined metric or a customized metric.
       */
      override fun predefinedMetricSpecification(predefinedMetricSpecification: IResolvable) {
        cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You can specify either a predefined metric or a customized metric.
       */
      override
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty) {
        cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification.let(PredefinedMetricSpecificationProperty.Companion::unwrap))
      }

      /**
       * @param predefinedMetricSpecification A predefined metric.
       * You can specify either a predefined metric or a customized metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e620e4bb9d79b0fdbbba8341f5cd87f28064dcd828e54b89de06cfc98c2c766a")
      override
          fun predefinedMetricSpecification(predefinedMetricSpecification: PredefinedMetricSpecificationProperty.Builder.() -> Unit):
          Unit =
          predefinedMetricSpecification(PredefinedMetricSpecificationProperty(predefinedMetricSpecification))

      /**
       * @param scaleInCooldown The amount of time, in seconds, after a scale-in activity completes
       * before another scale-in activity can start.
       * For more information and for default values, see [Define cooldown
       * periods](https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown)
       * in the *Application Auto Scaling User Guide* .
       */
      override fun scaleInCooldown(scaleInCooldown: Number) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
      }

      /**
       * @param scaleOutCooldown The amount of time, in seconds, to wait for a previous scale-out
       * activity to take effect.
       * For more information and for default values, see [Define cooldown
       * periods](https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown)
       * in the *Application Auto Scaling User Guide* .
       */
      override fun scaleOutCooldown(scaleOutCooldown: Number) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
      }

      /**
       * @param targetValue The target value for the metric. 
       * Although this property accepts numbers of type Double, it won't accept values that are
       * either too small or too large. Values must be in the range of -2^360 to 2^360. The value must
       * be a valid number based on the choice of metric. For example, if the metric is CPU
       * utilization, then the target value is a percent value that represents how much of the CPU can
       * be used before scaling out.
       */
      override fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
      }

      public fun build():
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty,
    ) : CdkObject(cdkObject), TargetTrackingScalingPolicyConfigurationProperty {
      /**
       * A customized metric.
       *
       * You can specify either a predefined metric or a customized metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-customizedmetricspecification)
       */
      override fun customizedMetricSpecification(): Any? =
          unwrap(this).getCustomizedMetricSpecification()

      /**
       * Indicates whether scale in by the target tracking scaling policy is disabled.
       *
       * If the value is `true` , scale in is disabled and the target tracking scaling policy won't
       * remove capacity from the scalable target. Otherwise, scale in is enabled and the target
       * tracking scaling policy can remove capacity from the scalable target. The default value is
       * `false` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-disablescalein)
       */
      override fun disableScaleIn(): Any? = unwrap(this).getDisableScaleIn()

      /**
       * A predefined metric.
       *
       * You can specify either a predefined metric or a customized metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-predefinedmetricspecification)
       */
      override fun predefinedMetricSpecification(): Any? =
          unwrap(this).getPredefinedMetricSpecification()

      /**
       * The amount of time, in seconds, after a scale-in activity completes before another scale-in
       * activity can start.
       *
       * For more information and for default values, see [Define cooldown
       * periods](https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown)
       * in the *Application Auto Scaling User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleincooldown)
       */
      override fun scaleInCooldown(): Number? = unwrap(this).getScaleInCooldown()

      /**
       * The amount of time, in seconds, to wait for a previous scale-out activity to take effect.
       *
       * For more information and for default values, see [Define cooldown
       * periods](https://docs.aws.amazon.com/autoscaling/application/userguide/target-tracking-scaling-policy-overview.html#target-tracking-cooldown)
       * in the *Application Auto Scaling User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-scaleoutcooldown)
       */
      override fun scaleOutCooldown(): Number? = unwrap(this).getScaleOutCooldown()

      /**
       * The target value for the metric.
       *
       * Although this property accepts numbers of type Double, it won't accept values that are
       * either too small or too large. Values must be in the range of -2^360 to 2^360. The value must
       * be a valid number based on the choice of metric. For example, if the metric is CPU
       * utilization, then the target value is a percent value that represents how much of the CPU can
       * be used before scaling out.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration.html#cfn-applicationautoscaling-scalingpolicy-targettrackingscalingpolicyconfiguration-targetvalue)
       */
      override fun targetValue(): Number = unwrap(this).getTargetValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetTrackingScalingPolicyConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty):
          TargetTrackingScalingPolicyConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetTrackingScalingPolicyConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetTrackingScalingPolicyConfigurationProperty):
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty
    }
  }
}
