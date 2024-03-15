@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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
 * The `AWS::ECS::Cluster` resource creates an Amazon Elastic Container Service (Amazon ECS)
 * cluster.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * CfnCluster cfnCluster = CfnCluster.Builder.create(this, "MyCfnCluster")
 * .capacityProviders(List.of("capacityProviders"))
 * .clusterName("clusterName")
 * .clusterSettings(List.of(ClusterSettingsProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .configuration(ClusterConfigurationProperty.builder()
 * .executeCommandConfiguration(ExecuteCommandConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .logConfiguration(ExecuteCommandLogConfigurationProperty.builder()
 * .cloudWatchEncryptionEnabled(false)
 * .cloudWatchLogGroupName("cloudWatchLogGroupName")
 * .s3BucketName("s3BucketName")
 * .s3EncryptionEnabled(false)
 * .s3KeyPrefix("s3KeyPrefix")
 * .build())
 * .logging("logging")
 * .build())
 * .build())
 * .defaultCapacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
 * .base(123)
 * .capacityProvider("capacityProvider")
 * .weight(123)
 * .build()))
 * .serviceConnectDefaults(ServiceConnectDefaultsProperty.builder()
 * .namespace("namespace")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html)
 */
public open class CfnCluster internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the Amazon ECS cluster, such as
   * `arn:aws:ecs:us-east-2:123456789012:cluster/MyECSCluster` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The short name of one or more capacity providers to associate with the cluster.
   */
  public open fun capacityProviders(): List<String> = unwrap(this).getCapacityProviders() ?:
      emptyList()

  /**
   * The short name of one or more capacity providers to associate with the cluster.
   */
  public open fun capacityProviders(`value`: List<String>) {
    unwrap(this).setCapacityProviders(`value`)
  }

  /**
   * The short name of one or more capacity providers to associate with the cluster.
   */
  public open fun capacityProviders(vararg `value`: String): Unit =
      capacityProviders(`value`.toList())

  /**
   * A user-generated string that you use to identify your cluster.
   */
  public open fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * A user-generated string that you use to identify your cluster.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * The settings to use when creating a cluster.
   */
  public open fun clusterSettings(): Any? = unwrap(this).getClusterSettings()

  /**
   * The settings to use when creating a cluster.
   */
  public open fun clusterSettings(`value`: IResolvable) {
    unwrap(this).setClusterSettings(`value`.let(IResolvable::unwrap))
  }

  /**
   * The settings to use when creating a cluster.
   */
  public open fun clusterSettings(__idx_ac66f0: List<Any>) {
    unwrap(this).setClusterSettings(__idx_ac66f0)
  }

  /**
   * The settings to use when creating a cluster.
   */
  public open fun clusterSettings(vararg __idx_ac66f0: Any): Unit =
      clusterSettings(__idx_ac66f0.toList())

  /**
   * The execute command configuration for the cluster.
   */
  public open fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * The execute command configuration for the cluster.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The execute command configuration for the cluster.
   */
  public open fun configuration(`value`: ClusterConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(ClusterConfigurationProperty::unwrap))
  }

  /**
   * The execute command configuration for the cluster.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1e266837809905aa2bb30e14c304754921c7d70fc5aa7a9315dbba12185f3738")
  public open fun configuration(`value`: ClusterConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(ClusterConfigurationProperty(`value`))

  /**
   * The default capacity provider strategy for the cluster.
   */
  public open fun defaultCapacityProviderStrategy(): Any? =
      unwrap(this).getDefaultCapacityProviderStrategy()

  /**
   * The default capacity provider strategy for the cluster.
   */
  public open fun defaultCapacityProviderStrategy(`value`: IResolvable) {
    unwrap(this).setDefaultCapacityProviderStrategy(`value`.let(IResolvable::unwrap))
  }

  /**
   * The default capacity provider strategy for the cluster.
   */
  public open fun defaultCapacityProviderStrategy(__idx_ac66f0: List<Any>) {
    unwrap(this).setDefaultCapacityProviderStrategy(__idx_ac66f0)
  }

  /**
   * The default capacity provider strategy for the cluster.
   */
  public open fun defaultCapacityProviderStrategy(vararg __idx_ac66f0: Any): Unit =
      defaultCapacityProviderStrategy(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Use this parameter to set a default Service Connect namespace.
   */
  public open fun serviceConnectDefaults(): Any? = unwrap(this).getServiceConnectDefaults()

  /**
   * Use this parameter to set a default Service Connect namespace.
   */
  public open fun serviceConnectDefaults(`value`: IResolvable) {
    unwrap(this).setServiceConnectDefaults(`value`.let(IResolvable::unwrap))
  }

  /**
   * Use this parameter to set a default Service Connect namespace.
   */
  public open fun serviceConnectDefaults(`value`: ServiceConnectDefaultsProperty) {
    unwrap(this).setServiceConnectDefaults(`value`.let(ServiceConnectDefaultsProperty::unwrap))
  }

  /**
   * Use this parameter to set a default Service Connect namespace.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("899bfd7e311a635ba16298ea27e86a52fa2a57f2c7d17322af833cb799312769")
  public open
      fun serviceConnectDefaults(`value`: ServiceConnectDefaultsProperty.Builder.() -> Unit): Unit =
      serviceConnectDefaults(ServiceConnectDefaultsProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The metadata that you apply to the cluster to help you categorize and organize them.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The metadata that you apply to the cluster to help you categorize and organize them.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The metadata that you apply to the cluster to help you categorize and organize them.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.CfnCluster].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The short name of one or more capacity providers to associate with the cluster.
     *
     * A capacity provider must be associated with a cluster before it can be included as part of
     * the default capacity provider strategy of the cluster or used in a capacity provider strategy
     * when calling the
     * [CreateService](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html)
     * or [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html)
     * actions.
     *
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must
     * be created but not associated with another cluster. New Auto Scaling group capacity providers
     * can be created with the
     * [CreateCapacityProvider](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateCapacityProvider.html)
     * API operation.
     *
     * To use a AWS Fargate capacity provider, specify either the `FARGATE` or `FARGATE_SPOT`
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     *
     * The
     * [PutCapacityProvider](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutCapacityProvider.html)
     * API operation is used to update the list of available capacity providers for a cluster after the
     * cluster is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-capacityproviders)
     * @param capacityProviders The short name of one or more capacity providers to associate with
     * the cluster. 
     */
    public fun capacityProviders(capacityProviders: List<String>)

    /**
     * The short name of one or more capacity providers to associate with the cluster.
     *
     * A capacity provider must be associated with a cluster before it can be included as part of
     * the default capacity provider strategy of the cluster or used in a capacity provider strategy
     * when calling the
     * [CreateService](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html)
     * or [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html)
     * actions.
     *
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must
     * be created but not associated with another cluster. New Auto Scaling group capacity providers
     * can be created with the
     * [CreateCapacityProvider](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateCapacityProvider.html)
     * API operation.
     *
     * To use a AWS Fargate capacity provider, specify either the `FARGATE` or `FARGATE_SPOT`
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     *
     * The
     * [PutCapacityProvider](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutCapacityProvider.html)
     * API operation is used to update the list of available capacity providers for a cluster after the
     * cluster is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-capacityproviders)
     * @param capacityProviders The short name of one or more capacity providers to associate with
     * the cluster. 
     */
    public fun capacityProviders(vararg capacityProviders: String)

    /**
     * A user-generated string that you use to identify your cluster.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustername)
     * @param clusterName A user-generated string that you use to identify your cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * The settings to use when creating a cluster.
     *
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustersettings)
     * @param clusterSettings The settings to use when creating a cluster. 
     */
    public fun clusterSettings(clusterSettings: IResolvable)

    /**
     * The settings to use when creating a cluster.
     *
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustersettings)
     * @param clusterSettings The settings to use when creating a cluster. 
     */
    public fun clusterSettings(clusterSettings: List<Any>)

    /**
     * The settings to use when creating a cluster.
     *
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustersettings)
     * @param clusterSettings The settings to use when creating a cluster. 
     */
    public fun clusterSettings(vararg clusterSettings: Any)

    /**
     * The execute command configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-configuration)
     * @param configuration The execute command configuration for the cluster. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * The execute command configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-configuration)
     * @param configuration The execute command configuration for the cluster. 
     */
    public fun configuration(configuration: ClusterConfigurationProperty)

    /**
     * The execute command configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-configuration)
     * @param configuration The execute command configuration for the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecbb13bf8972c170b1b30b1e3eebd7a17f7ed6b44e3908d3af4d9a7b84873c18")
    public fun configuration(configuration: ClusterConfigurationProperty.Builder.() -> Unit)

    /**
     * The default capacity provider strategy for the cluster.
     *
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster. 
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable)

    /**
     * The default capacity provider strategy for the cluster.
     *
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster. 
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>)

    /**
     * The default capacity provider strategy for the cluster.
     *
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster. 
     */
    public fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any)

    /**
     * Use this parameter to set a default Service Connect namespace.
     *
     * After you set a default Service Connect namespace, any new services with Service Connect
     * turned on that are created in the cluster are added as client services in the namespace. This
     * setting only applies to new services that set the `enabled` parameter to `true` in the
     * `ServiceConnectConfiguration` . You can set the namespace of each service individually in the
     * `ServiceConnectConfiguration` to override this default parameter.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-serviceconnectdefaults)
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace. 
     */
    public fun serviceConnectDefaults(serviceConnectDefaults: IResolvable)

    /**
     * Use this parameter to set a default Service Connect namespace.
     *
     * After you set a default Service Connect namespace, any new services with Service Connect
     * turned on that are created in the cluster are added as client services in the namespace. This
     * setting only applies to new services that set the `enabled` parameter to `true` in the
     * `ServiceConnectConfiguration` . You can set the namespace of each service individually in the
     * `ServiceConnectConfiguration` to override this default parameter.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-serviceconnectdefaults)
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace. 
     */
    public fun serviceConnectDefaults(serviceConnectDefaults: ServiceConnectDefaultsProperty)

    /**
     * Use this parameter to set a default Service Connect namespace.
     *
     * After you set a default Service Connect namespace, any new services with Service Connect
     * turned on that are created in the cluster are added as client services in the namespace. This
     * setting only applies to new services that set the `enabled` parameter to `true` in the
     * `ServiceConnectConfiguration` . You can set the namespace of each service individually in the
     * `ServiceConnectConfiguration` to override this default parameter.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-serviceconnectdefaults)
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d759decc7c48c6f8e33011e9904f33bc0821b4b354b01bd63de61ef880a9c1f")
    public
        fun serviceConnectDefaults(serviceConnectDefaults: ServiceConnectDefaultsProperty.Builder.() -> Unit)

    /**
     * The metadata that you apply to the cluster to help you categorize and organize them.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-tags)
     * @param tags The metadata that you apply to the cluster to help you categorize and organize
     * them. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The metadata that you apply to the cluster to help you categorize and organize them.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-tags)
     * @param tags The metadata that you apply to the cluster to help you categorize and organize
     * them. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnCluster.Builder =
        software.amazon.awscdk.services.ecs.CfnCluster.Builder.create(scope, id)

    /**
     * The short name of one or more capacity providers to associate with the cluster.
     *
     * A capacity provider must be associated with a cluster before it can be included as part of
     * the default capacity provider strategy of the cluster or used in a capacity provider strategy
     * when calling the
     * [CreateService](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html)
     * or [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html)
     * actions.
     *
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must
     * be created but not associated with another cluster. New Auto Scaling group capacity providers
     * can be created with the
     * [CreateCapacityProvider](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateCapacityProvider.html)
     * API operation.
     *
     * To use a AWS Fargate capacity provider, specify either the `FARGATE` or `FARGATE_SPOT`
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     *
     * The
     * [PutCapacityProvider](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutCapacityProvider.html)
     * API operation is used to update the list of available capacity providers for a cluster after the
     * cluster is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-capacityproviders)
     * @param capacityProviders The short name of one or more capacity providers to associate with
     * the cluster. 
     */
    override fun capacityProviders(capacityProviders: List<String>) {
      cdkBuilder.capacityProviders(capacityProviders)
    }

    /**
     * The short name of one or more capacity providers to associate with the cluster.
     *
     * A capacity provider must be associated with a cluster before it can be included as part of
     * the default capacity provider strategy of the cluster or used in a capacity provider strategy
     * when calling the
     * [CreateService](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html)
     * or [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html)
     * actions.
     *
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must
     * be created but not associated with another cluster. New Auto Scaling group capacity providers
     * can be created with the
     * [CreateCapacityProvider](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateCapacityProvider.html)
     * API operation.
     *
     * To use a AWS Fargate capacity provider, specify either the `FARGATE` or `FARGATE_SPOT`
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only
     * need to be associated with a cluster to be used.
     *
     * The
     * [PutCapacityProvider](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutCapacityProvider.html)
     * API operation is used to update the list of available capacity providers for a cluster after the
     * cluster is created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-capacityproviders)
     * @param capacityProviders The short name of one or more capacity providers to associate with
     * the cluster. 
     */
    override fun capacityProviders(vararg capacityProviders: String): Unit =
        capacityProviders(capacityProviders.toList())

    /**
     * A user-generated string that you use to identify your cluster.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustername)
     * @param clusterName A user-generated string that you use to identify your cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * The settings to use when creating a cluster.
     *
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustersettings)
     * @param clusterSettings The settings to use when creating a cluster. 
     */
    override fun clusterSettings(clusterSettings: IResolvable) {
      cdkBuilder.clusterSettings(clusterSettings.let(IResolvable::unwrap))
    }

    /**
     * The settings to use when creating a cluster.
     *
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustersettings)
     * @param clusterSettings The settings to use when creating a cluster. 
     */
    override fun clusterSettings(clusterSettings: List<Any>) {
      cdkBuilder.clusterSettings(clusterSettings)
    }

    /**
     * The settings to use when creating a cluster.
     *
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustersettings)
     * @param clusterSettings The settings to use when creating a cluster. 
     */
    override fun clusterSettings(vararg clusterSettings: Any): Unit =
        clusterSettings(clusterSettings.toList())

    /**
     * The execute command configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-configuration)
     * @param configuration The execute command configuration for the cluster. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * The execute command configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-configuration)
     * @param configuration The execute command configuration for the cluster. 
     */
    override fun configuration(configuration: ClusterConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(ClusterConfigurationProperty::unwrap))
    }

    /**
     * The execute command configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-configuration)
     * @param configuration The execute command configuration for the cluster. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ecbb13bf8972c170b1b30b1e3eebd7a17f7ed6b44e3908d3af4d9a7b84873c18")
    override fun configuration(configuration: ClusterConfigurationProperty.Builder.() -> Unit): Unit
        = configuration(ClusterConfigurationProperty(configuration))

    /**
     * The default capacity provider strategy for the cluster.
     *
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster. 
     */
    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.let(IResolvable::unwrap))
    }

    /**
     * The default capacity provider strategy for the cluster.
     *
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster. 
     */
    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
    }

    /**
     * The default capacity provider strategy for the cluster.
     *
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-defaultcapacityproviderstrategy)
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster. 
     */
    override fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any): Unit
        = defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.toList())

    /**
     * Use this parameter to set a default Service Connect namespace.
     *
     * After you set a default Service Connect namespace, any new services with Service Connect
     * turned on that are created in the cluster are added as client services in the namespace. This
     * setting only applies to new services that set the `enabled` parameter to `true` in the
     * `ServiceConnectConfiguration` . You can set the namespace of each service individually in the
     * `ServiceConnectConfiguration` to override this default parameter.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-serviceconnectdefaults)
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace. 
     */
    override fun serviceConnectDefaults(serviceConnectDefaults: IResolvable) {
      cdkBuilder.serviceConnectDefaults(serviceConnectDefaults.let(IResolvable::unwrap))
    }

    /**
     * Use this parameter to set a default Service Connect namespace.
     *
     * After you set a default Service Connect namespace, any new services with Service Connect
     * turned on that are created in the cluster are added as client services in the namespace. This
     * setting only applies to new services that set the `enabled` parameter to `true` in the
     * `ServiceConnectConfiguration` . You can set the namespace of each service individually in the
     * `ServiceConnectConfiguration` to override this default parameter.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-serviceconnectdefaults)
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace. 
     */
    override fun serviceConnectDefaults(serviceConnectDefaults: ServiceConnectDefaultsProperty) {
      cdkBuilder.serviceConnectDefaults(serviceConnectDefaults.let(ServiceConnectDefaultsProperty::unwrap))
    }

    /**
     * Use this parameter to set a default Service Connect namespace.
     *
     * After you set a default Service Connect namespace, any new services with Service Connect
     * turned on that are created in the cluster are added as client services in the namespace. This
     * setting only applies to new services that set the `enabled` parameter to `true` in the
     * `ServiceConnectConfiguration` . You can set the namespace of each service individually in the
     * `ServiceConnectConfiguration` to override this default parameter.
     *
     * Tasks that run in a namespace can use short names to connect to services in the namespace.
     * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through
     * a managed proxy container that collects logs and metrics for increased visibility. Only the
     * tasks that Amazon ECS services create are supported with Service Connect. For more information,
     * see [Service
     * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in
     * the *Amazon Elastic Container Service Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-serviceconnectdefaults)
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d759decc7c48c6f8e33011e9904f33bc0821b4b354b01bd63de61ef880a9c1f")
    override
        fun serviceConnectDefaults(serviceConnectDefaults: ServiceConnectDefaultsProperty.Builder.() -> Unit):
        Unit = serviceConnectDefaults(ServiceConnectDefaultsProperty(serviceConnectDefaults))

    /**
     * The metadata that you apply to the cluster to help you categorize and organize them.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-tags)
     * @param tags The metadata that you apply to the cluster to help you categorize and organize
     * them. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The metadata that you apply to the cluster to help you categorize and organize them.
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-tags)
     * @param tags The metadata that you apply to the cluster to help you categorize and organize
     * them. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ecs.CfnCluster.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.ecs.CfnCluster =
        wrapped.cdkObject
  }

  /**
   * The log configuration for the results of the execute command actions.
   *
   * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ExecuteCommandLogConfigurationProperty executeCommandLogConfigurationProperty =
   * ExecuteCommandLogConfigurationProperty.builder()
   * .cloudWatchEncryptionEnabled(false)
   * .cloudWatchLogGroupName("cloudWatchLogGroupName")
   * .s3BucketName("s3BucketName")
   * .s3EncryptionEnabled(false)
   * .s3KeyPrefix("s3KeyPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html)
   */
  public interface ExecuteCommandLogConfigurationProperty {
    /**
     * Determines whether to use encryption on the CloudWatch logs.
     *
     * If not specified, encryption will be off.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html#cfn-ecs-cluster-executecommandlogconfiguration-cloudwatchencryptionenabled)
     */
    public fun cloudWatchEncryptionEnabled(): Any? = unwrap(this).getCloudWatchEncryptionEnabled()

    /**
     * The name of the CloudWatch log group to send logs to.
     *
     *
     * The CloudWatch log group must already be created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html#cfn-ecs-cluster-executecommandlogconfiguration-cloudwatchloggroupname)
     */
    public fun cloudWatchLogGroupName(): String? = unwrap(this).getCloudWatchLogGroupName()

    /**
     * The name of the S3 bucket to send logs to.
     *
     *
     * The S3 bucket must already be created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html#cfn-ecs-cluster-executecommandlogconfiguration-s3bucketname)
     */
    public fun s3BucketName(): String? = unwrap(this).getS3BucketName()

    /**
     * Determines whether to use encryption on the S3 logs.
     *
     * If not specified, encryption is not used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html#cfn-ecs-cluster-executecommandlogconfiguration-s3encryptionenabled)
     */
    public fun s3EncryptionEnabled(): Any? = unwrap(this).getS3EncryptionEnabled()

    /**
     * An optional folder in the S3 bucket to place logs in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html#cfn-ecs-cluster-executecommandlogconfiguration-s3keyprefix)
     */
    public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    /**
     * A builder for [ExecuteCommandLogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cloudWatchEncryptionEnabled Determines whether to use encryption on the CloudWatch
       * logs.
       * If not specified, encryption will be off.
       */
      public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean)

      /**
       * @param cloudWatchEncryptionEnabled Determines whether to use encryption on the CloudWatch
       * logs.
       * If not specified, encryption will be off.
       */
      public fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: IResolvable)

      /**
       * @param cloudWatchLogGroupName The name of the CloudWatch log group to send logs to.
       *
       * The CloudWatch log group must already be created.
       */
      public fun cloudWatchLogGroupName(cloudWatchLogGroupName: String)

      /**
       * @param s3BucketName The name of the S3 bucket to send logs to.
       *
       * The S3 bucket must already be created.
       */
      public fun s3BucketName(s3BucketName: String)

      /**
       * @param s3EncryptionEnabled Determines whether to use encryption on the S3 logs.
       * If not specified, encryption is not used.
       */
      public fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean)

      /**
       * @param s3EncryptionEnabled Determines whether to use encryption on the S3 logs.
       * If not specified, encryption is not used.
       */
      public fun s3EncryptionEnabled(s3EncryptionEnabled: IResolvable)

      /**
       * @param s3KeyPrefix An optional folder in the S3 bucket to place logs in.
       */
      public fun s3KeyPrefix(s3KeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty.builder()

      /**
       * @param cloudWatchEncryptionEnabled Determines whether to use encryption on the CloudWatch
       * logs.
       * If not specified, encryption will be off.
       */
      override fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: Boolean) {
        cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled)
      }

      /**
       * @param cloudWatchEncryptionEnabled Determines whether to use encryption on the CloudWatch
       * logs.
       * If not specified, encryption will be off.
       */
      override fun cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled: IResolvable) {
        cdkBuilder.cloudWatchEncryptionEnabled(cloudWatchEncryptionEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param cloudWatchLogGroupName The name of the CloudWatch log group to send logs to.
       *
       * The CloudWatch log group must already be created.
       */
      override fun cloudWatchLogGroupName(cloudWatchLogGroupName: String) {
        cdkBuilder.cloudWatchLogGroupName(cloudWatchLogGroupName)
      }

      /**
       * @param s3BucketName The name of the S3 bucket to send logs to.
       *
       * The S3 bucket must already be created.
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      /**
       * @param s3EncryptionEnabled Determines whether to use encryption on the S3 logs.
       * If not specified, encryption is not used.
       */
      override fun s3EncryptionEnabled(s3EncryptionEnabled: Boolean) {
        cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled)
      }

      /**
       * @param s3EncryptionEnabled Determines whether to use encryption on the S3 logs.
       * If not specified, encryption is not used.
       */
      override fun s3EncryptionEnabled(s3EncryptionEnabled: IResolvable) {
        cdkBuilder.s3EncryptionEnabled(s3EncryptionEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param s3KeyPrefix An optional folder in the S3 bucket to place logs in.
       */
      override fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty,
    ) : CdkObject(cdkObject), ExecuteCommandLogConfigurationProperty {
      /**
       * Determines whether to use encryption on the CloudWatch logs.
       *
       * If not specified, encryption will be off.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html#cfn-ecs-cluster-executecommandlogconfiguration-cloudwatchencryptionenabled)
       */
      override fun cloudWatchEncryptionEnabled(): Any? =
          unwrap(this).getCloudWatchEncryptionEnabled()

      /**
       * The name of the CloudWatch log group to send logs to.
       *
       *
       * The CloudWatch log group must already be created.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html#cfn-ecs-cluster-executecommandlogconfiguration-cloudwatchloggroupname)
       */
      override fun cloudWatchLogGroupName(): String? = unwrap(this).getCloudWatchLogGroupName()

      /**
       * The name of the S3 bucket to send logs to.
       *
       *
       * The S3 bucket must already be created.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html#cfn-ecs-cluster-executecommandlogconfiguration-s3bucketname)
       */
      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()

      /**
       * Determines whether to use encryption on the S3 logs.
       *
       * If not specified, encryption is not used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html#cfn-ecs-cluster-executecommandlogconfiguration-s3encryptionenabled)
       */
      override fun s3EncryptionEnabled(): Any? = unwrap(this).getS3EncryptionEnabled()

      /**
       * An optional folder in the S3 bucket to place logs in.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandlogconfiguration.html#cfn-ecs-cluster-executecommandlogconfiguration-s3keyprefix)
       */
      override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExecuteCommandLogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty):
          ExecuteCommandLogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecuteCommandLogConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty
    }
  }

  /**
   * The details of the execute command configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ExecuteCommandConfigurationProperty executeCommandConfigurationProperty =
   * ExecuteCommandConfigurationProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .logConfiguration(ExecuteCommandLogConfigurationProperty.builder()
   * .cloudWatchEncryptionEnabled(false)
   * .cloudWatchLogGroupName("cloudWatchLogGroupName")
   * .s3BucketName("s3BucketName")
   * .s3EncryptionEnabled(false)
   * .s3KeyPrefix("s3KeyPrefix")
   * .build())
   * .logging("logging")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandconfiguration.html)
   */
  public interface ExecuteCommandConfigurationProperty {
    /**
     * Specify an AWS Key Management Service key ID to encrypt the data between the local client and
     * the container.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandconfiguration.html#cfn-ecs-cluster-executecommandconfiguration-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The log configuration for the results of the execute command actions.
     *
     * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket. When `logging=OVERRIDE` is
     * specified, a `logConfiguration` must be provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandconfiguration.html#cfn-ecs-cluster-executecommandconfiguration-logconfiguration)
     */
    public fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

    /**
     * The log setting to use for redirecting logs for your execute command results. The following
     * log settings are available.
     *
     * * `NONE` : The execute command session is not logged.
     * * `DEFAULT` : The `awslogs` configuration in the task definition is used. If no logging
     * parameter is specified, it defaults to this value. If no `awslogs` log driver is configured in
     * the task definition, the output won't be logged.
     * * `OVERRIDE` : Specify the logging details as a part of `logConfiguration` . If the
     * `OVERRIDE` logging option is specified, the `logConfiguration` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandconfiguration.html#cfn-ecs-cluster-executecommandconfiguration-logging)
     */
    public fun logging(): String? = unwrap(this).getLogging()

    /**
     * A builder for [ExecuteCommandConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyId Specify an AWS Key Management Service key ID to encrypt the data between
       * the local client and the container.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param logConfiguration The log configuration for the results of the execute command
       * actions.
       * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket. When `logging=OVERRIDE` is
       * specified, a `logConfiguration` must be provided.
       */
      public fun logConfiguration(logConfiguration: IResolvable)

      /**
       * @param logConfiguration The log configuration for the results of the execute command
       * actions.
       * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket. When `logging=OVERRIDE` is
       * specified, a `logConfiguration` must be provided.
       */
      public fun logConfiguration(logConfiguration: ExecuteCommandLogConfigurationProperty)

      /**
       * @param logConfiguration The log configuration for the results of the execute command
       * actions.
       * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket. When `logging=OVERRIDE` is
       * specified, a `logConfiguration` must be provided.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a24f99e0a31bf052a42f798fef13d0e54580ffb764e0589c190da6b7d7a5013")
      public
          fun logConfiguration(logConfiguration: ExecuteCommandLogConfigurationProperty.Builder.() -> Unit)

      /**
       * @param logging The log setting to use for redirecting logs for your execute command
       * results. The following log settings are available.
       * * `NONE` : The execute command session is not logged.
       * * `DEFAULT` : The `awslogs` configuration in the task definition is used. If no logging
       * parameter is specified, it defaults to this value. If no `awslogs` log driver is configured in
       * the task definition, the output won't be logged.
       * * `OVERRIDE` : Specify the logging details as a part of `logConfiguration` . If the
       * `OVERRIDE` logging option is specified, the `logConfiguration` is required.
       */
      public fun logging(logging: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty.builder()

      /**
       * @param kmsKeyId Specify an AWS Key Management Service key ID to encrypt the data between
       * the local client and the container.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param logConfiguration The log configuration for the results of the execute command
       * actions.
       * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket. When `logging=OVERRIDE` is
       * specified, a `logConfiguration` must be provided.
       */
      override fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param logConfiguration The log configuration for the results of the execute command
       * actions.
       * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket. When `logging=OVERRIDE` is
       * specified, a `logConfiguration` must be provided.
       */
      override fun logConfiguration(logConfiguration: ExecuteCommandLogConfigurationProperty) {
        cdkBuilder.logConfiguration(logConfiguration.let(ExecuteCommandLogConfigurationProperty::unwrap))
      }

      /**
       * @param logConfiguration The log configuration for the results of the execute command
       * actions.
       * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket. When `logging=OVERRIDE` is
       * specified, a `logConfiguration` must be provided.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1a24f99e0a31bf052a42f798fef13d0e54580ffb764e0589c190da6b7d7a5013")
      override
          fun logConfiguration(logConfiguration: ExecuteCommandLogConfigurationProperty.Builder.() -> Unit):
          Unit = logConfiguration(ExecuteCommandLogConfigurationProperty(logConfiguration))

      /**
       * @param logging The log setting to use for redirecting logs for your execute command
       * results. The following log settings are available.
       * * `NONE` : The execute command session is not logged.
       * * `DEFAULT` : The `awslogs` configuration in the task definition is used. If no logging
       * parameter is specified, it defaults to this value. If no `awslogs` log driver is configured in
       * the task definition, the output won't be logged.
       * * `OVERRIDE` : Specify the logging details as a part of `logConfiguration` . If the
       * `OVERRIDE` logging option is specified, the `logConfiguration` is required.
       */
      override fun logging(logging: String) {
        cdkBuilder.logging(logging)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty,
    ) : CdkObject(cdkObject), ExecuteCommandConfigurationProperty {
      /**
       * Specify an AWS Key Management Service key ID to encrypt the data between the local client
       * and the container.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandconfiguration.html#cfn-ecs-cluster-executecommandconfiguration-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * The log configuration for the results of the execute command actions.
       *
       * The logs can be sent to CloudWatch Logs or an Amazon S3 bucket. When `logging=OVERRIDE` is
       * specified, a `logConfiguration` must be provided.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandconfiguration.html#cfn-ecs-cluster-executecommandconfiguration-logconfiguration)
       */
      override fun logConfiguration(): Any? = unwrap(this).getLogConfiguration()

      /**
       * The log setting to use for redirecting logs for your execute command results. The following
       * log settings are available.
       *
       * * `NONE` : The execute command session is not logged.
       * * `DEFAULT` : The `awslogs` configuration in the task definition is used. If no logging
       * parameter is specified, it defaults to this value. If no `awslogs` log driver is configured in
       * the task definition, the output won't be logged.
       * * `OVERRIDE` : Specify the logging details as a part of `logConfiguration` . If the
       * `OVERRIDE` logging option is specified, the `logConfiguration` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-executecommandconfiguration.html#cfn-ecs-cluster-executecommandconfiguration-logging)
       */
      override fun logging(): String? = unwrap(this).getLogging()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ExecuteCommandConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty):
          ExecuteCommandConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExecuteCommandConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty
    }
  }

  /**
   * The `CapacityProviderStrategyItem` property specifies the details of the default capacity
   * provider strategy for the cluster.
   *
   * When services or tasks are run in the cluster with no launch type or capacity provider strategy
   * specified, the default capacity provider strategy is used.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * CapacityProviderStrategyItemProperty capacityProviderStrategyItemProperty =
   * CapacityProviderStrategyItemProperty.builder()
   * .base(123)
   * .capacityProvider("capacityProvider")
   * .weight(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-capacityproviderstrategyitem.html)
   */
  public interface CapacityProviderStrategyItemProperty {
    /**
     * The *base* value designates how many tasks, at a minimum, to run on the specified capacity
     * provider.
     *
     * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
     * value is specified, the default value of `0` is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-capacityproviderstrategyitem.html#cfn-ecs-cluster-capacityproviderstrategyitem-base)
     */
    public fun base(): Number? = unwrap(this).getBase()

    /**
     * The short name of the capacity provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-capacityproviderstrategyitem.html#cfn-ecs-cluster-capacityproviderstrategyitem-capacityprovider)
     */
    public fun capacityProvider(): String? = unwrap(this).getCapacityProvider()

    /**
     * The *weight* value designates the relative percentage of the total number of tasks launched
     * that should use the specified capacity provider.
     *
     * The `weight` value is taken into consideration after the `base` value, if defined, is
     * satisfied.
     *
     * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
     * providers are specified within a capacity provider strategy, at least one of the capacity
     * providers must have a weight value greater than zero and any capacity providers with a weight of
     * `0` can't be used to place tasks. If you specify multiple capacity providers in a strategy that
     * all have a weight of `0` , any `RunTask` or `CreateService` actions using the capacity provider
     * strategy will fail.
     *
     * An example scenario for using weights is defining a strategy that contains two capacity
     * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
     * split evenly across the two capacity providers. Using that same logic, if you specify a weight
     * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every one
     * task that's run using *capacityProviderA* , four tasks would use *capacityProviderB* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-capacityproviderstrategyitem.html#cfn-ecs-cluster-capacityproviderstrategyitem-weight)
     */
    public fun weight(): Number? = unwrap(this).getWeight()

    /**
     * A builder for [CapacityProviderStrategyItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param base The *base* value designates how many tasks, at a minimum, to run on the
       * specified capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
       * value is specified, the default value of `0` is used.
       */
      public fun base(base: Number)

      /**
       * @param capacityProvider The short name of the capacity provider.
       */
      public fun capacityProvider(capacityProvider: String)

      /**
       * @param weight The *weight* value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The `weight` value is taken into consideration after the `base` value, if defined, is
       * satisfied.
       *
       * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
       * providers are specified within a capacity provider strategy, at least one of the capacity
       * providers must have a weight value greater than zero and any capacity providers with a weight
       * of `0` can't be used to place tasks. If you specify multiple capacity providers in a strategy
       * that all have a weight of `0` , any `RunTask` or `CreateService` actions using the capacity
       * provider strategy will fail.
       *
       * An example scenario for using weights is defining a strategy that contains two capacity
       * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
       * split evenly across the two capacity providers. Using that same logic, if you specify a weight
       * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every
       * one task that's run using *capacityProviderA* , four tasks would use *capacityProviderB* .
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty.Builder
          =
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty.builder()

      /**
       * @param base The *base* value designates how many tasks, at a minimum, to run on the
       * specified capacity provider.
       * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
       * value is specified, the default value of `0` is used.
       */
      override fun base(base: Number) {
        cdkBuilder.base(base)
      }

      /**
       * @param capacityProvider The short name of the capacity provider.
       */
      override fun capacityProvider(capacityProvider: String) {
        cdkBuilder.capacityProvider(capacityProvider)
      }

      /**
       * @param weight The *weight* value designates the relative percentage of the total number of
       * tasks launched that should use the specified capacity provider.
       * The `weight` value is taken into consideration after the `base` value, if defined, is
       * satisfied.
       *
       * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
       * providers are specified within a capacity provider strategy, at least one of the capacity
       * providers must have a weight value greater than zero and any capacity providers with a weight
       * of `0` can't be used to place tasks. If you specify multiple capacity providers in a strategy
       * that all have a weight of `0` , any `RunTask` or `CreateService` actions using the capacity
       * provider strategy will fail.
       *
       * An example scenario for using weights is defining a strategy that contains two capacity
       * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
       * split evenly across the two capacity providers. Using that same logic, if you specify a weight
       * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every
       * one task that's run using *capacityProviderA* , four tasks would use *capacityProviderB* .
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty,
    ) : CdkObject(cdkObject), CapacityProviderStrategyItemProperty {
      /**
       * The *base* value designates how many tasks, at a minimum, to run on the specified capacity
       * provider.
       *
       * Only one capacity provider in a capacity provider strategy can have a *base* defined. If no
       * value is specified, the default value of `0` is used.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-capacityproviderstrategyitem.html#cfn-ecs-cluster-capacityproviderstrategyitem-base)
       */
      override fun base(): Number? = unwrap(this).getBase()

      /**
       * The short name of the capacity provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-capacityproviderstrategyitem.html#cfn-ecs-cluster-capacityproviderstrategyitem-capacityprovider)
       */
      override fun capacityProvider(): String? = unwrap(this).getCapacityProvider()

      /**
       * The *weight* value designates the relative percentage of the total number of tasks launched
       * that should use the specified capacity provider.
       *
       * The `weight` value is taken into consideration after the `base` value, if defined, is
       * satisfied.
       *
       * If no `weight` value is specified, the default value of `0` is used. When multiple capacity
       * providers are specified within a capacity provider strategy, at least one of the capacity
       * providers must have a weight value greater than zero and any capacity providers with a weight
       * of `0` can't be used to place tasks. If you specify multiple capacity providers in a strategy
       * that all have a weight of `0` , any `RunTask` or `CreateService` actions using the capacity
       * provider strategy will fail.
       *
       * An example scenario for using weights is defining a strategy that contains two capacity
       * providers and both have a weight of `1` , then when the `base` is satisfied, the tasks will be
       * split evenly across the two capacity providers. Using that same logic, if you specify a weight
       * of `1` for *capacityProviderA* and a weight of `4` for *capacityProviderB* , then for every
       * one task that's run using *capacityProviderA* , four tasks would use *capacityProviderB* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-capacityproviderstrategyitem.html#cfn-ecs-cluster-capacityproviderstrategyitem-weight)
       */
      override fun weight(): Number? = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityProviderStrategyItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty):
          CapacityProviderStrategyItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityProviderStrategyItemProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.CapacityProviderStrategyItemProperty
    }
  }

  /**
   * The settings to use when creating a cluster.
   *
   * This parameter is used to turn on CloudWatch Container Insights for a cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ClusterSettingsProperty clusterSettingsProperty = ClusterSettingsProperty.builder()
   * .name("name")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-clustersettings.html)
   */
  public interface ClusterSettingsProperty {
    /**
     * The name of the cluster setting.
     *
     * The value is `containerInsights` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-clustersettings.html#cfn-ecs-cluster-clustersettings-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The value to set for the cluster setting. The supported values are `enabled` and `disabled` .
     *
     * If you set `name` to `containerInsights` and `value` to `enabled` , CloudWatch Container
     * Insights will be on for the cluster, otherwise it will be off unless the `containerInsights`
     * account setting is turned on. If a cluster value is specified, it will override the
     * `containerInsights` value set with
     * [PutAccountSetting](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutAccountSetting.html)
     * or
     * [PutAccountSettingDefault](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutAccountSettingDefault.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-clustersettings.html#cfn-ecs-cluster-clustersettings-value)
     */
    public fun `value`(): String? = unwrap(this).getValue()

    /**
     * A builder for [ClusterSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of the cluster setting.
       * The value is `containerInsights` .
       */
      public fun name(name: String)

      /**
       * @param value The value to set for the cluster setting. The supported values are `enabled`
       * and `disabled` .
       * If you set `name` to `containerInsights` and `value` to `enabled` , CloudWatch Container
       * Insights will be on for the cluster, otherwise it will be off unless the `containerInsights`
       * account setting is turned on. If a cluster value is specified, it will override the
       * `containerInsights` value set with
       * [PutAccountSetting](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutAccountSetting.html)
       * or
       * [PutAccountSettingDefault](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutAccountSettingDefault.html)
       * .
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty.builder()

      /**
       * @param name The name of the cluster setting.
       * The value is `containerInsights` .
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param value The value to set for the cluster setting. The supported values are `enabled`
       * and `disabled` .
       * If you set `name` to `containerInsights` and `value` to `enabled` , CloudWatch Container
       * Insights will be on for the cluster, otherwise it will be off unless the `containerInsights`
       * account setting is turned on. If a cluster value is specified, it will override the
       * `containerInsights` value set with
       * [PutAccountSetting](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutAccountSetting.html)
       * or
       * [PutAccountSettingDefault](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutAccountSettingDefault.html)
       * .
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty,
    ) : CdkObject(cdkObject), ClusterSettingsProperty {
      /**
       * The name of the cluster setting.
       *
       * The value is `containerInsights` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-clustersettings.html#cfn-ecs-cluster-clustersettings-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The value to set for the cluster setting. The supported values are `enabled` and `disabled`
       * .
       *
       * If you set `name` to `containerInsights` and `value` to `enabled` , CloudWatch Container
       * Insights will be on for the cluster, otherwise it will be off unless the `containerInsights`
       * account setting is turned on. If a cluster value is specified, it will override the
       * `containerInsights` value set with
       * [PutAccountSetting](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutAccountSetting.html)
       * or
       * [PutAccountSettingDefault](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutAccountSettingDefault.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-clustersettings.html#cfn-ecs-cluster-clustersettings-value)
       */
      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty):
          ClusterSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterSettingsProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterSettingsProperty
    }
  }

  /**
   * The execute command configuration for the cluster.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ClusterConfigurationProperty clusterConfigurationProperty =
   * ClusterConfigurationProperty.builder()
   * .executeCommandConfiguration(ExecuteCommandConfigurationProperty.builder()
   * .kmsKeyId("kmsKeyId")
   * .logConfiguration(ExecuteCommandLogConfigurationProperty.builder()
   * .cloudWatchEncryptionEnabled(false)
   * .cloudWatchLogGroupName("cloudWatchLogGroupName")
   * .s3BucketName("s3BucketName")
   * .s3EncryptionEnabled(false)
   * .s3KeyPrefix("s3KeyPrefix")
   * .build())
   * .logging("logging")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-clusterconfiguration.html)
   */
  public interface ClusterConfigurationProperty {
    /**
     * The details of the execute command configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-clusterconfiguration.html#cfn-ecs-cluster-clusterconfiguration-executecommandconfiguration)
     */
    public fun executeCommandConfiguration(): Any? = unwrap(this).getExecuteCommandConfiguration()

    /**
     * A builder for [ClusterConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param executeCommandConfiguration The details of the execute command configuration.
       */
      public fun executeCommandConfiguration(executeCommandConfiguration: IResolvable)

      /**
       * @param executeCommandConfiguration The details of the execute command configuration.
       */
      public
          fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfigurationProperty)

      /**
       * @param executeCommandConfiguration The details of the execute command configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2c142dbeb86944d2f38ed48264d7c5a153056a38a629e653a939c6de008408f")
      public
          fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty.builder()

      /**
       * @param executeCommandConfiguration The details of the execute command configuration.
       */
      override fun executeCommandConfiguration(executeCommandConfiguration: IResolvable) {
        cdkBuilder.executeCommandConfiguration(executeCommandConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param executeCommandConfiguration The details of the execute command configuration.
       */
      override
          fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfigurationProperty) {
        cdkBuilder.executeCommandConfiguration(executeCommandConfiguration.let(ExecuteCommandConfigurationProperty::unwrap))
      }

      /**
       * @param executeCommandConfiguration The details of the execute command configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2c142dbeb86944d2f38ed48264d7c5a153056a38a629e653a939c6de008408f")
      override
          fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfigurationProperty.Builder.() -> Unit):
          Unit =
          executeCommandConfiguration(ExecuteCommandConfigurationProperty(executeCommandConfiguration))

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty,
    ) : CdkObject(cdkObject), ClusterConfigurationProperty {
      /**
       * The details of the execute command configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-clusterconfiguration.html#cfn-ecs-cluster-clusterconfiguration-executecommandconfiguration)
       */
      override fun executeCommandConfiguration(): Any? =
          unwrap(this).getExecuteCommandConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ClusterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty):
          ClusterConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ClusterConfigurationProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.ClusterConfigurationProperty
    }
  }

  /**
   * Use this parameter to set a default Service Connect namespace.
   *
   * After you set a default Service Connect namespace, any new services with Service Connect turned
   * on that are created in the cluster are added as client services in the namespace. This setting
   * only applies to new services that set the `enabled` parameter to `true` in the
   * `ServiceConnectConfiguration` . You can set the namespace of each service individually in the
   * `ServiceConnectConfiguration` to override this default parameter.
   *
   * Tasks that run in a namespace can use short names to connect to services in the namespace.
   * Tasks can connect to services across all of the clusters in the namespace. Tasks connect through a
   * managed proxy container that collects logs and metrics for increased visibility. Only the tasks
   * that Amazon ECS services create are supported with Service Connect. For more information, see
   * [Service
   * Connect](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-connect.html) in the
   * *Amazon Elastic Container Service Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ecs.*;
   * ServiceConnectDefaultsProperty serviceConnectDefaultsProperty =
   * ServiceConnectDefaultsProperty.builder()
   * .namespace("namespace")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-serviceconnectdefaults.html)
   */
  public interface ServiceConnectDefaultsProperty {
    /**
     * The namespace name or full Amazon Resource Name (ARN) of the AWS Cloud Map namespace that's
     * used when you create a service and don't specify a Service Connect configuration.
     *
     * The namespace name can include up to 1024 characters. The name is case-sensitive. The name
     * can't include hyphens (-), tilde (~), greater than (&gt;), less than (&lt;), or slash (/).
     *
     * If you enter an existing namespace name or ARN, then that namespace will be used. Any
     * namespace type is supported. The namespace must be in this account and this AWS Region.
     *
     * If you enter a new name, a AWS Cloud Map namespace will be created. Amazon ECS creates a AWS
     * Cloud Map namespace with the "API calls" method of instance discovery only. This instance
     * discovery method is the "HTTP" namespace type in the AWS Command Line Interface . Other types of
     * instance discovery aren't used by Service Connect.
     *
     * If you update the cluster with an empty string `""` for the namespace name, the cluster
     * configuration for Service Connect is removed. Note that the namespace will remain in AWS Cloud
     * Map and must be deleted separately.
     *
     * For more information about AWS Cloud Map , see [Working with
     * Services](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-services.html) in the
     * *AWS Cloud Map Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-serviceconnectdefaults.html#cfn-ecs-cluster-serviceconnectdefaults-namespace)
     */
    public fun namespace(): String? = unwrap(this).getNamespace()

    /**
     * A builder for [ServiceConnectDefaultsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param namespace The namespace name or full Amazon Resource Name (ARN) of the AWS Cloud Map
       * namespace that's used when you create a service and don't specify a Service Connect
       * configuration.
       * The namespace name can include up to 1024 characters. The name is case-sensitive. The name
       * can't include hyphens (-), tilde (~), greater than (&gt;), less than (&lt;), or slash (/).
       *
       * If you enter an existing namespace name or ARN, then that namespace will be used. Any
       * namespace type is supported. The namespace must be in this account and this AWS Region.
       *
       * If you enter a new name, a AWS Cloud Map namespace will be created. Amazon ECS creates a
       * AWS Cloud Map namespace with the "API calls" method of instance discovery only. This instance
       * discovery method is the "HTTP" namespace type in the AWS Command Line Interface . Other types
       * of instance discovery aren't used by Service Connect.
       *
       * If you update the cluster with an empty string `""` for the namespace name, the cluster
       * configuration for Service Connect is removed. Note that the namespace will remain in AWS Cloud
       * Map and must be deleted separately.
       *
       * For more information about AWS Cloud Map , see [Working with
       * Services](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-services.html) in the
       * *AWS Cloud Map Developer Guide* .
       */
      public fun namespace(namespace: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty.Builder =
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty.builder()

      /**
       * @param namespace The namespace name or full Amazon Resource Name (ARN) of the AWS Cloud Map
       * namespace that's used when you create a service and don't specify a Service Connect
       * configuration.
       * The namespace name can include up to 1024 characters. The name is case-sensitive. The name
       * can't include hyphens (-), tilde (~), greater than (&gt;), less than (&lt;), or slash (/).
       *
       * If you enter an existing namespace name or ARN, then that namespace will be used. Any
       * namespace type is supported. The namespace must be in this account and this AWS Region.
       *
       * If you enter a new name, a AWS Cloud Map namespace will be created. Amazon ECS creates a
       * AWS Cloud Map namespace with the "API calls" method of instance discovery only. This instance
       * discovery method is the "HTTP" namespace type in the AWS Command Line Interface . Other types
       * of instance discovery aren't used by Service Connect.
       *
       * If you update the cluster with an empty string `""` for the namespace name, the cluster
       * configuration for Service Connect is removed. Note that the namespace will remain in AWS Cloud
       * Map and must be deleted separately.
       *
       * For more information about AWS Cloud Map , see [Working with
       * Services](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-services.html) in the
       * *AWS Cloud Map Developer Guide* .
       */
      override fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
      }

      public fun build():
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty,
    ) : CdkObject(cdkObject), ServiceConnectDefaultsProperty {
      /**
       * The namespace name or full Amazon Resource Name (ARN) of the AWS Cloud Map namespace that's
       * used when you create a service and don't specify a Service Connect configuration.
       *
       * The namespace name can include up to 1024 characters. The name is case-sensitive. The name
       * can't include hyphens (-), tilde (~), greater than (&gt;), less than (&lt;), or slash (/).
       *
       * If you enter an existing namespace name or ARN, then that namespace will be used. Any
       * namespace type is supported. The namespace must be in this account and this AWS Region.
       *
       * If you enter a new name, a AWS Cloud Map namespace will be created. Amazon ECS creates a
       * AWS Cloud Map namespace with the "API calls" method of instance discovery only. This instance
       * discovery method is the "HTTP" namespace type in the AWS Command Line Interface . Other types
       * of instance discovery aren't used by Service Connect.
       *
       * If you update the cluster with an empty string `""` for the namespace name, the cluster
       * configuration for Service Connect is removed. Note that the namespace will remain in AWS Cloud
       * Map and must be deleted separately.
       *
       * For more information about AWS Cloud Map , see [Working with
       * Services](https://docs.aws.amazon.com/cloud-map/latest/dg/working-with-services.html) in the
       * *AWS Cloud Map Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-cluster-serviceconnectdefaults.html#cfn-ecs-cluster-serviceconnectdefaults-namespace)
       */
      override fun namespace(): String? = unwrap(this).getNamespace()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServiceConnectDefaultsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty):
          ServiceConnectDefaultsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServiceConnectDefaultsProperty):
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ecs.CfnCluster.ServiceConnectDefaultsProperty
    }
  }
}
