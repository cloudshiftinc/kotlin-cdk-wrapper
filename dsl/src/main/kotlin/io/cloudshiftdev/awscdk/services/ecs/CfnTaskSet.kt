package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTaskSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The ID of the task set.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to
   * create the task set in.
   */
  public open fun cluster(): String = unwrap(this).getCluster()

  /**
   * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to
   * create the task set in.
   */
  public open fun cluster(`value`: String) {
    unwrap(this).setCluster(`value`)
  }

  /**
   * An optional non-unique tag that identifies this task set in external systems.
   */
  public open fun externalId(): String? = unwrap(this).getExternalId()

  /**
   * An optional non-unique tag that identifies this task set in external systems.
   */
  public open fun externalId(`value`: String) {
    unwrap(this).setExternalId(`value`)
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
   * The launch type that new tasks in the task set uses.
   */
  public open fun launchType(): String? = unwrap(this).getLaunchType()

  /**
   * The launch type that new tasks in the task set uses.
   */
  public open fun launchType(`value`: String) {
    unwrap(this).setLaunchType(`value`)
  }

  /**
   * A load balancer object representing the load balancer to use with the task set.
   */
  public open fun loadBalancers(): Any? = unwrap(this).getLoadBalancers()

  /**
   * A load balancer object representing the load balancer to use with the task set.
   */
  public open fun loadBalancers(`value`: IResolvable) {
    unwrap(this).setLoadBalancers(`value`.let(IResolvable::unwrap))
  }

  /**
   * A load balancer object representing the load balancer to use with the task set.
   */
  public open fun loadBalancers(__idx_ac66f0: List<Any>) {
    unwrap(this).setLoadBalancers(__idx_ac66f0)
  }

  /**
   * A load balancer object representing the load balancer to use with the task set.
   */
  public open fun loadBalancers(vararg __idx_ac66f0: Any): Unit =
      loadBalancers(__idx_ac66f0.toList())

  /**
   * The network configuration for the task set.
   */
  public open fun networkConfiguration(): Any? = unwrap(this).getNetworkConfiguration()

  /**
   * The network configuration for the task set.
   */
  public open fun networkConfiguration(`value`: IResolvable) {
    unwrap(this).setNetworkConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The network configuration for the task set.
   */
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty) {
    unwrap(this).setNetworkConfiguration(`value`.let(NetworkConfigurationProperty::unwrap))
  }

  /**
   * The network configuration for the task set.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9373718358fe917031751f90c22fedef7cacc83d89402ccecee5e89c526e2171")
  public open fun networkConfiguration(`value`: NetworkConfigurationProperty.Builder.() -> Unit):
      Unit = networkConfiguration(NetworkConfigurationProperty(`value`))

  /**
   * The platform version that the tasks in the task set uses.
   */
  public open fun platformVersion(): String? = unwrap(this).getPlatformVersion()

  /**
   * The platform version that the tasks in the task set uses.
   */
  public open fun platformVersion(`value`: String) {
    unwrap(this).setPlatformVersion(`value`)
  }

  /**
   * A floating-point percentage of your desired number of tasks to place and keep running in the
   * task set.
   */
  public open fun scale(): Any? = unwrap(this).getScale()

  /**
   * A floating-point percentage of your desired number of tasks to place and keep running in the
   * task set.
   */
  public open fun scale(`value`: IResolvable) {
    unwrap(this).setScale(`value`.let(IResolvable::unwrap))
  }

  /**
   * A floating-point percentage of your desired number of tasks to place and keep running in the
   * task set.
   */
  public open fun scale(`value`: ScaleProperty) {
    unwrap(this).setScale(`value`.let(ScaleProperty::unwrap))
  }

  /**
   * A floating-point percentage of your desired number of tasks to place and keep running in the
   * task set.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45b02fd5de48d0ca63425a76e9bdd7f578838bc275473a0e41853cea9914fe36")
  public open fun scale(`value`: ScaleProperty.Builder.() -> Unit): Unit =
      scale(ScaleProperty(`value`))

  /**
   * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
   */
  public open fun service(): String = unwrap(this).getService()

  /**
   * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
   */
  public open fun service(`value`: String) {
    unwrap(this).setService(`value`)
  }

  /**
   * The details of the service discovery registries to assign to this task set.
   */
  public open fun serviceRegistries(): Any? = unwrap(this).getServiceRegistries()

  /**
   * The details of the service discovery registries to assign to this task set.
   */
  public open fun serviceRegistries(`value`: IResolvable) {
    unwrap(this).setServiceRegistries(`value`.let(IResolvable::unwrap))
  }

  /**
   * The details of the service discovery registries to assign to this task set.
   */
  public open fun serviceRegistries(__idx_ac66f0: List<Any>) {
    unwrap(this).setServiceRegistries(__idx_ac66f0)
  }

  /**
   * The details of the service discovery registries to assign to this task set.
   */
  public open fun serviceRegistries(vararg __idx_ac66f0: Any): Unit =
      serviceRegistries(__idx_ac66f0.toList())

  /**
   * The metadata that you apply to the task set to help you categorize and organize them.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The metadata that you apply to the task set to help you categorize and organize them.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The metadata that you apply to the task set to help you categorize and organize them.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The task definition for the tasks in the task set to use.
   */
  public open fun taskDefinition(): String = unwrap(this).getTaskDefinition()

  /**
   * The task definition for the tasks in the task set to use.
   */
  public open fun taskDefinition(`value`: String) {
    unwrap(this).setTaskDefinition(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.CfnTaskSet].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to
     * create the task set in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-cluster)
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts
     * the service to create the task set in. 
     */
    public fun cluster(cluster: String)

    /**
     * An optional non-unique tag that identifies this task set in external systems.
     *
     * If the task set is associated with a service discovery registry, the tasks in this task set
     * will have the `ECS_TASK_SET_EXTERNAL_ID` AWS Cloud Map attribute set to the provided value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-externalid)
     * @param externalId An optional non-unique tag that identifies this task set in external
     * systems. 
     */
    public fun externalId(externalId: String)

    /**
     * The launch type that new tasks in the task set uses.
     *
     * For more information, see [Amazon ECS launch
     * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * If a `launchType` is specified, the `capacityProviderStrategy` parameter must be omitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-launchtype)
     * @param launchType The launch type that new tasks in the task set uses. 
     */
    public fun launchType(launchType: String)

    /**
     * A load balancer object representing the load balancer to use with the task set.
     *
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers)
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set. 
     */
    public fun loadBalancers(loadBalancers: IResolvable)

    /**
     * A load balancer object representing the load balancer to use with the task set.
     *
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers)
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set. 
     */
    public fun loadBalancers(loadBalancers: List<Any>)

    /**
     * A load balancer object representing the load balancer to use with the task set.
     *
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers)
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set. 
     */
    public fun loadBalancers(vararg loadBalancers: Any)

    /**
     * The network configuration for the task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-networkconfiguration)
     * @param networkConfiguration The network configuration for the task set. 
     */
    public fun networkConfiguration(networkConfiguration: IResolvable)

    /**
     * The network configuration for the task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-networkconfiguration)
     * @param networkConfiguration The network configuration for the task set. 
     */
    public fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty)

    /**
     * The network configuration for the task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-networkconfiguration)
     * @param networkConfiguration The network configuration for the task set. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3bf6ca1d6084120fbfe0b89ed81d9751ce1d322ee808677c9cff116d0e02143")
    public
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit)

    /**
     * The platform version that the tasks in the task set uses.
     *
     * A platform version is specified only for tasks using the Fargate launch type. If one isn't
     * specified, the `LATEST` platform version is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-platformversion)
     * @param platformVersion The platform version that the tasks in the task set uses. 
     */
    public fun platformVersion(platformVersion: String)

    /**
     * A floating-point percentage of your desired number of tasks to place and keep running in the
     * task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-scale)
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set. 
     */
    public fun scale(scale: IResolvable)

    /**
     * A floating-point percentage of your desired number of tasks to place and keep running in the
     * task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-scale)
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set. 
     */
    public fun scale(scale: ScaleProperty)

    /**
     * A floating-point percentage of your desired number of tasks to place and keep running in the
     * task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-scale)
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f5196ccfdf1b0ce8f5b1bfba3ca9581ec023dcd6d98a06980164f3d35cc10b9")
    public fun scale(scale: ScaleProperty.Builder.() -> Unit)

    /**
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-service)
     * @param service The short name or full Amazon Resource Name (ARN) of the service to create the
     * task set in. 
     */
    public fun service(service: String)

    /**
     * The details of the service discovery registries to assign to this task set.
     *
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries)
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set. 
     */
    public fun serviceRegistries(serviceRegistries: IResolvable)

    /**
     * The details of the service discovery registries to assign to this task set.
     *
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries)
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set. 
     */
    public fun serviceRegistries(serviceRegistries: List<Any>)

    /**
     * The details of the service discovery registries to assign to this task set.
     *
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries)
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set. 
     */
    public fun serviceRegistries(vararg serviceRegistries: Any)

    /**
     * The metadata that you apply to the task set to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-tags)
     * @param tags The metadata that you apply to the task set to help you categorize and organize
     * them. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The metadata that you apply to the task set to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-tags)
     * @param tags The metadata that you apply to the task set to help you categorize and organize
     * them. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The task definition for the tasks in the task set to use.
     *
     * If a revision isn't specified, the latest `ACTIVE` revision is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-taskdefinition)
     * @param taskDefinition The task definition for the tasks in the task set to use. 
     */
    public fun taskDefinition(taskDefinition: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskSet.Builder =
        software.amazon.awscdk.services.ecs.CfnTaskSet.Builder.create(scope, id)

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to
     * create the task set in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-cluster)
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that hosts
     * the service to create the task set in. 
     */
    override fun cluster(cluster: String) {
      cdkBuilder.cluster(cluster)
    }

    /**
     * An optional non-unique tag that identifies this task set in external systems.
     *
     * If the task set is associated with a service discovery registry, the tasks in this task set
     * will have the `ECS_TASK_SET_EXTERNAL_ID` AWS Cloud Map attribute set to the provided value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-externalid)
     * @param externalId An optional non-unique tag that identifies this task set in external
     * systems. 
     */
    override fun externalId(externalId: String) {
      cdkBuilder.externalId(externalId)
    }

    /**
     * The launch type that new tasks in the task set uses.
     *
     * For more information, see [Amazon ECS launch
     * types](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html) in the
     * *Amazon Elastic Container Service Developer Guide* .
     *
     * If a `launchType` is specified, the `capacityProviderStrategy` parameter must be omitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-launchtype)
     * @param launchType The launch type that new tasks in the task set uses. 
     */
    override fun launchType(launchType: String) {
      cdkBuilder.launchType(launchType)
    }

    /**
     * A load balancer object representing the load balancer to use with the task set.
     *
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers)
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set. 
     */
    override fun loadBalancers(loadBalancers: IResolvable) {
      cdkBuilder.loadBalancers(loadBalancers.let(IResolvable::unwrap))
    }

    /**
     * A load balancer object representing the load balancer to use with the task set.
     *
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers)
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set. 
     */
    override fun loadBalancers(loadBalancers: List<Any>) {
      cdkBuilder.loadBalancers(loadBalancers)
    }

    /**
     * A load balancer object representing the load balancer to use with the task set.
     *
     * The supported load balancer types are either an Application Load Balancer or a Network Load
     * Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers)
     * @param loadBalancers A load balancer object representing the load balancer to use with the
     * task set. 
     */
    override fun loadBalancers(vararg loadBalancers: Any): Unit =
        loadBalancers(loadBalancers.toList())

    /**
     * The network configuration for the task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-networkconfiguration)
     * @param networkConfiguration The network configuration for the task set. 
     */
    override fun networkConfiguration(networkConfiguration: IResolvable) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(IResolvable::unwrap))
    }

    /**
     * The network configuration for the task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-networkconfiguration)
     * @param networkConfiguration The network configuration for the task set. 
     */
    override fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty) {
      cdkBuilder.networkConfiguration(networkConfiguration.let(NetworkConfigurationProperty::unwrap))
    }

    /**
     * The network configuration for the task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-networkconfiguration)
     * @param networkConfiguration The network configuration for the task set. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f3bf6ca1d6084120fbfe0b89ed81d9751ce1d322ee808677c9cff116d0e02143")
    override
        fun networkConfiguration(networkConfiguration: NetworkConfigurationProperty.Builder.() -> Unit):
        Unit = networkConfiguration(NetworkConfigurationProperty(networkConfiguration))

    /**
     * The platform version that the tasks in the task set uses.
     *
     * A platform version is specified only for tasks using the Fargate launch type. If one isn't
     * specified, the `LATEST` platform version is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-platformversion)
     * @param platformVersion The platform version that the tasks in the task set uses. 
     */
    override fun platformVersion(platformVersion: String) {
      cdkBuilder.platformVersion(platformVersion)
    }

    /**
     * A floating-point percentage of your desired number of tasks to place and keep running in the
     * task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-scale)
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set. 
     */
    override fun scale(scale: IResolvable) {
      cdkBuilder.scale(scale.let(IResolvable::unwrap))
    }

    /**
     * A floating-point percentage of your desired number of tasks to place and keep running in the
     * task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-scale)
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set. 
     */
    override fun scale(scale: ScaleProperty) {
      cdkBuilder.scale(scale.let(ScaleProperty::unwrap))
    }

    /**
     * A floating-point percentage of your desired number of tasks to place and keep running in the
     * task set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-scale)
     * @param scale A floating-point percentage of your desired number of tasks to place and keep
     * running in the task set. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f5196ccfdf1b0ce8f5b1bfba3ca9581ec023dcd6d98a06980164f3d35cc10b9")
    override fun scale(scale: ScaleProperty.Builder.() -> Unit): Unit = scale(ScaleProperty(scale))

    /**
     * The short name or full Amazon Resource Name (ARN) of the service to create the task set in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-service)
     * @param service The short name or full Amazon Resource Name (ARN) of the service to create the
     * task set in. 
     */
    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    /**
     * The details of the service discovery registries to assign to this task set.
     *
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries)
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set. 
     */
    override fun serviceRegistries(serviceRegistries: IResolvable) {
      cdkBuilder.serviceRegistries(serviceRegistries.let(IResolvable::unwrap))
    }

    /**
     * The details of the service discovery registries to assign to this task set.
     *
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries)
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set. 
     */
    override fun serviceRegistries(serviceRegistries: List<Any>) {
      cdkBuilder.serviceRegistries(serviceRegistries)
    }

    /**
     * The details of the service discovery registries to assign to this task set.
     *
     * For more information, see [Service
     * discovery](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries)
     * @param serviceRegistries The details of the service discovery registries to assign to this
     * task set. 
     */
    override fun serviceRegistries(vararg serviceRegistries: Any): Unit =
        serviceRegistries(serviceRegistries.toList())

    /**
     * The metadata that you apply to the task set to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-tags)
     * @param tags The metadata that you apply to the task set to help you categorize and organize
     * them. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The metadata that you apply to the task set to help you categorize and organize them.
     *
     * Each tag consists of a key and an optional value. You define both.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8
     * * Maximum value length - 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-tags)
     * @param tags The metadata that you apply to the task set to help you categorize and organize
     * them. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The task definition for the tasks in the task set to use.
     *
     * If a revision isn't specified, the latest `ACTIVE` revision is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-taskdefinition)
     * @param taskDefinition The task definition for the tasks in the task set to use. 
     */
    override fun taskDefinition(taskDefinition: String) {
      cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecs.CfnTaskSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTaskSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTaskSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet): CfnTaskSet =
        CfnTaskSet(cdkObject)

    internal fun unwrap(wrapped: CfnTaskSet): software.amazon.awscdk.services.ecs.CfnTaskSet =
        wrapped.cdkObject
  }

  public interface ScaleProperty {
    /**
     * The unit of measure for the scale value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * The value, specified as a percent total of a service's `desiredCount` , to scale the task
     * set.
     *
     * Accepted values are numbers between 0 and 100.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-value)
     */
    public fun `value`(): Number? = unwrap(this).getValue()

    /**
     * A builder for [ScaleProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit The unit of measure for the scale value.
       */
      public fun unit(unit: String)

      /**
       * @param value The value, specified as a percent total of a service's `desiredCount` , to
       * scale the task set.
       * Accepted values are numbers between 0 and 100.
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty.builder()

      /**
       * @param unit The unit of measure for the scale value.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value The value, specified as a percent total of a service's `desiredCount` , to
       * scale the task set.
       * Accepted values are numbers between 0 and 100.
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty,
    ) : CdkObject(cdkObject), ScaleProperty {
      /**
       * The unit of measure for the scale value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()

      /**
       * The value, specified as a percent total of a service's `desiredCount` , to scale the task
       * set.
       *
       * Accepted values are numbers between 0 and 100.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html#cfn-ecs-taskset-scale-value)
       */
      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScaleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty):
          ScaleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScaleProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CfnTaskSet.ScaleProperty
    }
  }

  public interface LoadBalancerProperty {
    /**
     * The name of the container (as it appears in a container definition) to associate with the
     * load balancer.
     *
     * You need to specify the container name when configuring the target group for an Amazon ECS
     * load balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containername)
     */
    public fun containerName(): String? = unwrap(this).getContainerName()

    /**
     * The port on the container to associate with the load balancer.
     *
     * This port must correspond to a `containerPort` in the task definition the tasks in the
     * service are using. For tasks that use the EC2 launch type, the container instance they're
     * launched on must allow ingress traffic on the `hostPort` of the port mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containerport)
     */
    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    /**
     * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups
     * associated with a service or task set.
     *
     * A target group ARN is only specified when using an Application Load Balancer or Network Load
     * Balancer.
     *
     * For services using the `ECS` deployment controller, you can specify one or multiple target
     * groups. For more information, see [Registering multiple target groups with a
     * service](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     * For services using the `CODE_DEPLOY` deployment controller, you're required to define two
     * target groups for the load balancer. For more information, see [Blue/green deployment with
     * CodeDeploy](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html)
     * in the *Amazon Elastic Container Service Developer Guide* .
     *
     *
     * If your service's task definition uses the `awsvpc` network mode, you must choose `ip` as the
     * target type, not `instance` . Do this when creating your target groups because tasks that use
     * the `awsvpc` network mode are associated with an elastic network interface, not an Amazon EC2
     * instance. This network mode is required for the Fargate launch type.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-targetgrouparn)
     */
    public fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()

    /**
     * A builder for [LoadBalancerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerName The name of the container (as it appears in a container definition) to
       * associate with the load balancer.
       * You need to specify the container name when configuring the target group for an Amazon ECS
       * load balancer.
       */
      public fun containerName(containerName: String)

      /**
       * @param containerPort The port on the container to associate with the load balancer.
       * This port must correspond to a `containerPort` in the task definition the tasks in the
       * service are using. For tasks that use the EC2 launch type, the container instance they're
       * launched on must allow ingress traffic on the `hostPort` of the port mapping.
       */
      public fun containerPort(containerPort: Number)

      /**
       * @param targetGroupArn The full Amazon Resource Name (ARN) of the Elastic Load Balancing
       * target group or groups associated with a service or task set.
       * A target group ARN is only specified when using an Application Load Balancer or Network
       * Load Balancer.
       *
       * For services using the `ECS` deployment controller, you can specify one or multiple target
       * groups. For more information, see [Registering multiple target groups with a
       * service](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * For services using the `CODE_DEPLOY` deployment controller, you're required to define two
       * target groups for the load balancer. For more information, see [Blue/green deployment with
       * CodeDeploy](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * If your service's task definition uses the `awsvpc` network mode, you must choose `ip` as
       * the target type, not `instance` . Do this when creating your target groups because tasks that
       * use the `awsvpc` network mode are associated with an elastic network interface, not an Amazon
       * EC2 instance. This network mode is required for the Fargate launch type.
       */
      public fun targetGroupArn(targetGroupArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty.builder()

      /**
       * @param containerName The name of the container (as it appears in a container definition) to
       * associate with the load balancer.
       * You need to specify the container name when configuring the target group for an Amazon ECS
       * load balancer.
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      /**
       * @param containerPort The port on the container to associate with the load balancer.
       * This port must correspond to a `containerPort` in the task definition the tasks in the
       * service are using. For tasks that use the EC2 launch type, the container instance they're
       * launched on must allow ingress traffic on the `hostPort` of the port mapping.
       */
      override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      /**
       * @param targetGroupArn The full Amazon Resource Name (ARN) of the Elastic Load Balancing
       * target group or groups associated with a service or task set.
       * A target group ARN is only specified when using an Application Load Balancer or Network
       * Load Balancer.
       *
       * For services using the `ECS` deployment controller, you can specify one or multiple target
       * groups. For more information, see [Registering multiple target groups with a
       * service](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * For services using the `CODE_DEPLOY` deployment controller, you're required to define two
       * target groups for the load balancer. For more information, see [Blue/green deployment with
       * CodeDeploy](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * If your service's task definition uses the `awsvpc` network mode, you must choose `ip` as
       * the target type, not `instance` . Do this when creating your target groups because tasks that
       * use the `awsvpc` network mode are associated with an elastic network interface, not an Amazon
       * EC2 instance. This network mode is required for the Fargate launch type.
       */
      override fun targetGroupArn(targetGroupArn: String) {
        cdkBuilder.targetGroupArn(targetGroupArn)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty,
    ) : CdkObject(cdkObject), LoadBalancerProperty {
      /**
       * The name of the container (as it appears in a container definition) to associate with the
       * load balancer.
       *
       * You need to specify the container name when configuring the target group for an Amazon ECS
       * load balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containername)
       */
      override fun containerName(): String? = unwrap(this).getContainerName()

      /**
       * The port on the container to associate with the load balancer.
       *
       * This port must correspond to a `containerPort` in the task definition the tasks in the
       * service are using. For tasks that use the EC2 launch type, the container instance they're
       * launched on must allow ingress traffic on the `hostPort` of the port mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-containerport)
       */
      override fun containerPort(): Number? = unwrap(this).getContainerPort()

      /**
       * The full Amazon Resource Name (ARN) of the Elastic Load Balancing target group or groups
       * associated with a service or task set.
       *
       * A target group ARN is only specified when using an Application Load Balancer or Network
       * Load Balancer.
       *
       * For services using the `ECS` deployment controller, you can specify one or multiple target
       * groups. For more information, see [Registering multiple target groups with a
       * service](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/register-multiple-targetgroups.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       * For services using the `CODE_DEPLOY` deployment controller, you're required to define two
       * target groups for the load balancer. For more information, see [Blue/green deployment with
       * CodeDeploy](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/deployment-type-bluegreen.html)
       * in the *Amazon Elastic Container Service Developer Guide* .
       *
       *
       * If your service's task definition uses the `awsvpc` network mode, you must choose `ip` as
       * the target type, not `instance` . Do this when creating your target groups because tasks that
       * use the `awsvpc` network mode are associated with an elastic network interface, not an Amazon
       * EC2 instance. This network mode is required for the Fargate launch type.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-loadbalancer.html#cfn-ecs-taskset-loadbalancer-targetgrouparn)
       */
      override fun targetGroupArn(): String? = unwrap(this).getTargetGroupArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty):
          LoadBalancerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LoadBalancerProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskSet.LoadBalancerProperty
    }
  }

  public interface ServiceRegistryProperty {
    /**
     * The container name value to be used for your service discovery service.
     *
     * It's already specified in the task definition. If the task definition that your service task
     * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
     * `containerPort` combination from the task definition. If the task definition that your service
     * task specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must
     * specify either a `containerName` and `containerPort` combination or a `port` value. However, you
     * can't specify both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containername)
     */
    public fun containerName(): String? = unwrap(this).getContainerName()

    /**
     * The port value to be used for your service discovery service.
     *
     * It's already specified in the task definition. If the task definition your service task
     * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
     * `containerPort` combination from the task definition. If the task definition your service task
     * specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must specify
     * either a `containerName` and `containerPort` combination or a `port` value. However, you can't
     * specify both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containerport)
     */
    public fun containerPort(): Number? = unwrap(this).getContainerPort()

    /**
     * The port value used if your service discovery service specified an SRV record.
     *
     * This field might be used if both the `awsvpc` network mode and SRV records are used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The Amazon Resource Name (ARN) of the service registry.
     *
     * The currently supported service registry is AWS Cloud Map . For more information, see
     * [CreateService](https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-registryarn)
     */
    public fun registryArn(): String? = unwrap(this).getRegistryArn()

    /**
     * A builder for [ServiceRegistryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerName The container name value to be used for your service discovery
       * service.
       * It's already specified in the task definition. If the task definition that your service
       * task specifies uses the `bridge` or `host` network mode, you must specify a `containerName`
       * and `containerPort` combination from the task definition. If the task definition that your
       * service task specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you
       * must specify either a `containerName` and `containerPort` combination or a `port` value.
       * However, you can't specify both.
       */
      public fun containerName(containerName: String)

      /**
       * @param containerPort The port value to be used for your service discovery service.
       * It's already specified in the task definition. If the task definition your service task
       * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
       * `containerPort` combination from the task definition. If the task definition your service task
       * specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must specify
       * either a `containerName` and `containerPort` combination or a `port` value. However, you can't
       * specify both.
       */
      public fun containerPort(containerPort: Number)

      /**
       * @param port The port value used if your service discovery service specified an SRV record.
       * This field might be used if both the `awsvpc` network mode and SRV records are used.
       */
      public fun port(port: Number)

      /**
       * @param registryArn The Amazon Resource Name (ARN) of the service registry.
       * The currently supported service registry is AWS Cloud Map . For more information, see
       * [CreateService](https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html) .
       */
      public fun registryArn(registryArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty.builder()

      /**
       * @param containerName The container name value to be used for your service discovery
       * service.
       * It's already specified in the task definition. If the task definition that your service
       * task specifies uses the `bridge` or `host` network mode, you must specify a `containerName`
       * and `containerPort` combination from the task definition. If the task definition that your
       * service task specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you
       * must specify either a `containerName` and `containerPort` combination or a `port` value.
       * However, you can't specify both.
       */
      override fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
      }

      /**
       * @param containerPort The port value to be used for your service discovery service.
       * It's already specified in the task definition. If the task definition your service task
       * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
       * `containerPort` combination from the task definition. If the task definition your service task
       * specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must specify
       * either a `containerName` and `containerPort` combination or a `port` value. However, you can't
       * specify both.
       */
      override fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
      }

      /**
       * @param port The port value used if your service discovery service specified an SRV record.
       * This field might be used if both the `awsvpc` network mode and SRV records are used.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param registryArn The Amazon Resource Name (ARN) of the service registry.
       * The currently supported service registry is AWS Cloud Map . For more information, see
       * [CreateService](https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html) .
       */
      override fun registryArn(registryArn: String) {
        cdkBuilder.registryArn(registryArn)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty,
    ) : CdkObject(cdkObject), ServiceRegistryProperty {
      /**
       * The container name value to be used for your service discovery service.
       *
       * It's already specified in the task definition. If the task definition that your service
       * task specifies uses the `bridge` or `host` network mode, you must specify a `containerName`
       * and `containerPort` combination from the task definition. If the task definition that your
       * service task specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you
       * must specify either a `containerName` and `containerPort` combination or a `port` value.
       * However, you can't specify both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containername)
       */
      override fun containerName(): String? = unwrap(this).getContainerName()

      /**
       * The port value to be used for your service discovery service.
       *
       * It's already specified in the task definition. If the task definition your service task
       * specifies uses the `bridge` or `host` network mode, you must specify a `containerName` and
       * `containerPort` combination from the task definition. If the task definition your service task
       * specifies uses the `awsvpc` network mode and a type SRV DNS record is used, you must specify
       * either a `containerName` and `containerPort` combination or a `port` value. However, you can't
       * specify both.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-containerport)
       */
      override fun containerPort(): Number? = unwrap(this).getContainerPort()

      /**
       * The port value used if your service discovery service specified an SRV record.
       *
       * This field might be used if both the `awsvpc` network mode and SRV records are used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The Amazon Resource Name (ARN) of the service registry.
       *
       * The currently supported service registry is AWS Cloud Map . For more information, see
       * [CreateService](https://docs.aws.amazon.com/cloud-map/latest/api/API_CreateService.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-serviceregistry.html#cfn-ecs-taskset-serviceregistry-registryarn)
       */
      override fun registryArn(): String? = unwrap(this).getRegistryArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceRegistryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty):
          ServiceRegistryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceRegistryProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskSet.ServiceRegistryProperty
    }
  }

  public interface NetworkConfigurationProperty {
    /**
     * The VPC subnets and security groups that are associated with a task.
     *
     *
     * All specified subnets and security groups must be from the same VPC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-networkconfiguration.html#cfn-ecs-taskset-networkconfiguration-awsvpcconfiguration)
     */
    public fun awsVpcConfiguration(): Any? = unwrap(this).getAwsVpcConfiguration()

    /**
     * A builder for [NetworkConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param awsVpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      public fun awsVpcConfiguration(awsVpcConfiguration: IResolvable)

      /**
       * @param awsVpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      public fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty)

      /**
       * @param awsVpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86071b226e0630e4028fddeda36d35340516262893df40e8024690acc7b00fde")
      public
          fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty.builder()

      /**
       * @param awsVpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      override fun awsVpcConfiguration(awsVpcConfiguration: IResolvable) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param awsVpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      override fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty) {
        cdkBuilder.awsVpcConfiguration(awsVpcConfiguration.let(AwsVpcConfigurationProperty::unwrap))
      }

      /**
       * @param awsVpcConfiguration The VPC subnets and security groups that are associated with a
       * task.
       *
       * All specified subnets and security groups must be from the same VPC.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("86071b226e0630e4028fddeda36d35340516262893df40e8024690acc7b00fde")
      override
          fun awsVpcConfiguration(awsVpcConfiguration: AwsVpcConfigurationProperty.Builder.() -> Unit):
          Unit = awsVpcConfiguration(AwsVpcConfigurationProperty(awsVpcConfiguration))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty,
    ) : CdkObject(cdkObject), NetworkConfigurationProperty {
      /**
       * The VPC subnets and security groups that are associated with a task.
       *
       *
       * All specified subnets and security groups must be from the same VPC.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-networkconfiguration.html#cfn-ecs-taskset-networkconfiguration-awsvpcconfiguration)
       */
      override fun awsVpcConfiguration(): Any? = unwrap(this).getAwsVpcConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NetworkConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty):
          NetworkConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NetworkConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskSet.NetworkConfigurationProperty
    }
  }

  public interface AwsVpcConfigurationProperty {
    /**
     * Whether the task's elastic network interface receives a public IP address.
     *
     * The default value is `DISABLED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-assignpublicip)
     */
    public fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

    /**
     * The IDs of the security groups associated with the task or service.
     *
     * If you don't specify a security group, the default security group for the VPC is used.
     * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
     *
     *
     * All specified security groups must be from the same VPC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-securitygroups)
     */
    public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    /**
     * The IDs of the subnets associated with the task or service.
     *
     * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
     *
     *
     * All specified subnets must be from the same VPC.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [AwsVpcConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param assignPublicIp Whether the task's elastic network interface receives a public IP
       * address.
       * The default value is `DISABLED` .
       */
      public fun assignPublicIp(assignPublicIp: String)

      /**
       * @param securityGroups The IDs of the security groups associated with the task or service.
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified security groups must be from the same VPC.
       */
      public fun securityGroups(securityGroups: List<String>)

      /**
       * @param securityGroups The IDs of the security groups associated with the task or service.
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified security groups must be from the same VPC.
       */
      public fun securityGroups(vararg securityGroups: String)

      /**
       * @param subnets The IDs of the subnets associated with the task or service. 
       * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified subnets must be from the same VPC.
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets The IDs of the subnets associated with the task or service. 
       * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified subnets must be from the same VPC.
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty.builder()

      /**
       * @param assignPublicIp Whether the task's elastic network interface receives a public IP
       * address.
       * The default value is `DISABLED` .
       */
      override fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
      }

      /**
       * @param securityGroups The IDs of the security groups associated with the task or service.
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified security groups must be from the same VPC.
       */
      override fun securityGroups(securityGroups: List<String>) {
        cdkBuilder.securityGroups(securityGroups)
      }

      /**
       * @param securityGroups The IDs of the security groups associated with the task or service.
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified security groups must be from the same VPC.
       */
      override fun securityGroups(vararg securityGroups: String): Unit =
          securityGroups(securityGroups.toList())

      /**
       * @param subnets The IDs of the subnets associated with the task or service. 
       * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified subnets must be from the same VPC.
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets The IDs of the subnets associated with the task or service. 
       * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified subnets must be from the same VPC.
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty,
    ) : CdkObject(cdkObject), AwsVpcConfigurationProperty {
      /**
       * Whether the task's elastic network interface receives a public IP address.
       *
       * The default value is `DISABLED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-assignpublicip)
       */
      override fun assignPublicIp(): String? = unwrap(this).getAssignPublicIp()

      /**
       * The IDs of the security groups associated with the task or service.
       *
       * If you don't specify a security group, the default security group for the VPC is used.
       * There's a limit of 5 security groups that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified security groups must be from the same VPC.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-securitygroups)
       */
      override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

      /**
       * The IDs of the subnets associated with the task or service.
       *
       * There's a limit of 16 subnets that can be specified per `AwsVpcConfiguration` .
       *
       *
       * All specified subnets must be from the same VPC.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-awsvpcconfiguration.html#cfn-ecs-taskset-awsvpcconfiguration-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AwsVpcConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty):
          AwsVpcConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsVpcConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnTaskSet.AwsVpcConfigurationProperty
    }
  }
}
