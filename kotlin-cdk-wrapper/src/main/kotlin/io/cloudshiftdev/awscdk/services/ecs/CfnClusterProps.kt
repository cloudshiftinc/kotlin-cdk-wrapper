@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
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
public interface CfnClusterProps {
  /**
   * The short name of one or more capacity providers to associate with the cluster.
   *
   * A capacity provider must be associated with a cluster before it can be included as part of the
   * default capacity provider strategy of the cluster or used in a capacity provider strategy when
   * calling the
   * [CreateService](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateService.html)
   * or [RunTask](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) actions.
   *
   * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must
   * be created but not associated with another cluster. New Auto Scaling group capacity providers can
   * be created with the
   * [CreateCapacityProvider](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_CreateCapacityProvider.html)
   * API operation.
   *
   * To use a AWS Fargate capacity provider, specify either the `FARGATE` or `FARGATE_SPOT` capacity
   * providers. The AWS Fargate capacity providers are available to all accounts and only need to be
   * associated with a cluster to be used.
   *
   * The
   * [PutCapacityProvider](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_PutCapacityProvider.html)
   * API operation is used to update the list of available capacity providers for a cluster after the
   * cluster is created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-capacityproviders)
   */
  public fun capacityProviders(): List<String> = unwrap(this).getCapacityProviders() ?: emptyList()

  /**
   * A user-generated string that you use to identify your cluster.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustername)
   */
  public fun clusterName(): String? = unwrap(this).getClusterName()

  /**
   * The settings to use when creating a cluster.
   *
   * This parameter is used to turn on CloudWatch Container Insights for a cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustersettings)
   */
  public fun clusterSettings(): Any? = unwrap(this).getClusterSettings()

  /**
   * The execute command configuration for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-configuration)
   */
  public fun configuration(): Any? = unwrap(this).getConfiguration()

  /**
   * The default capacity provider strategy for the cluster.
   *
   * When services or tasks are run in the cluster with no launch type or capacity provider strategy
   * specified, the default capacity provider strategy is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-defaultcapacityproviderstrategy)
   */
  public fun defaultCapacityProviderStrategy(): Any? =
      unwrap(this).getDefaultCapacityProviderStrategy()

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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-serviceconnectdefaults)
   */
  public fun serviceConnectDefaults(): Any? = unwrap(this).getServiceConnectDefaults()

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
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param capacityProviders The short name of one or more capacity providers to associate with
     * the cluster.
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
     */
    public fun capacityProviders(capacityProviders: List<String>)

    /**
     * @param capacityProviders The short name of one or more capacity providers to associate with
     * the cluster.
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
     */
    public fun capacityProviders(vararg capacityProviders: String)

    /**
     * @param clusterName A user-generated string that you use to identify your cluster.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the name.
     */
    public fun clusterName(clusterName: String)

    /**
     * @param clusterSettings The settings to use when creating a cluster.
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     */
    public fun clusterSettings(clusterSettings: IResolvable)

    /**
     * @param clusterSettings The settings to use when creating a cluster.
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     */
    public fun clusterSettings(clusterSettings: List<Any>)

    /**
     * @param clusterSettings The settings to use when creating a cluster.
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     */
    public fun clusterSettings(vararg clusterSettings: Any)

    /**
     * @param configuration The execute command configuration for the cluster.
     */
    public fun configuration(configuration: IResolvable)

    /**
     * @param configuration The execute command configuration for the cluster.
     */
    public fun configuration(configuration: CfnCluster.ClusterConfigurationProperty)

    /**
     * @param configuration The execute command configuration for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e6e99b1e2f459f41708260072121e7085e08fc6e0db3469037f419267c72f8c")
    public
        fun configuration(configuration: CfnCluster.ClusterConfigurationProperty.Builder.() -> Unit)

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster.
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable)

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster.
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     */
    public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>)

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster.
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     */
    public fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any)

    /**
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace.
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
     */
    public fun serviceConnectDefaults(serviceConnectDefaults: IResolvable)

    /**
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace.
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
     */
    public
        fun serviceConnectDefaults(serviceConnectDefaults: CfnCluster.ServiceConnectDefaultsProperty)

    /**
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1abda0c5f82eecb52744b5c85186bd1ab6cbb213d95643185e65bc73b8067583")
    public
        fun serviceConnectDefaults(serviceConnectDefaults: CfnCluster.ServiceConnectDefaultsProperty.Builder.() -> Unit)

    /**
     * @param tags The metadata that you apply to the cluster to help you categorize and organize
     * them.
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
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The metadata that you apply to the cluster to help you categorize and organize
     * them.
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
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CfnClusterProps.Builder =
        software.amazon.awscdk.services.ecs.CfnClusterProps.builder()

    /**
     * @param capacityProviders The short name of one or more capacity providers to associate with
     * the cluster.
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
     */
    override fun capacityProviders(capacityProviders: List<String>) {
      cdkBuilder.capacityProviders(capacityProviders)
    }

    /**
     * @param capacityProviders The short name of one or more capacity providers to associate with
     * the cluster.
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
     */
    override fun capacityProviders(vararg capacityProviders: String): Unit =
        capacityProviders(capacityProviders.toList())

    /**
     * @param clusterName A user-generated string that you use to identify your cluster.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the name.
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param clusterSettings The settings to use when creating a cluster.
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     */
    override fun clusterSettings(clusterSettings: IResolvable) {
      cdkBuilder.clusterSettings(clusterSettings.let(IResolvable::unwrap))
    }

    /**
     * @param clusterSettings The settings to use when creating a cluster.
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     */
    override fun clusterSettings(clusterSettings: List<Any>) {
      cdkBuilder.clusterSettings(clusterSettings)
    }

    /**
     * @param clusterSettings The settings to use when creating a cluster.
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     */
    override fun clusterSettings(vararg clusterSettings: Any): Unit =
        clusterSettings(clusterSettings.toList())

    /**
     * @param configuration The execute command configuration for the cluster.
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    /**
     * @param configuration The execute command configuration for the cluster.
     */
    override fun configuration(configuration: CfnCluster.ClusterConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnCluster.ClusterConfigurationProperty::unwrap))
    }

    /**
     * @param configuration The execute command configuration for the cluster.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e6e99b1e2f459f41708260072121e7085e08fc6e0db3469037f419267c72f8c")
    override
        fun configuration(configuration: CfnCluster.ClusterConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnCluster.ClusterConfigurationProperty(configuration))

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster.
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     */
    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.let(IResolvable::unwrap))
    }

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster.
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     */
    override fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: List<Any>) {
      cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
    }

    /**
     * @param defaultCapacityProviderStrategy The default capacity provider strategy for the
     * cluster.
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     */
    override fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any): Unit
        = defaultCapacityProviderStrategy(defaultCapacityProviderStrategy.toList())

    /**
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace.
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
     */
    override fun serviceConnectDefaults(serviceConnectDefaults: IResolvable) {
      cdkBuilder.serviceConnectDefaults(serviceConnectDefaults.let(IResolvable::unwrap))
    }

    /**
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace.
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
     */
    override
        fun serviceConnectDefaults(serviceConnectDefaults: CfnCluster.ServiceConnectDefaultsProperty) {
      cdkBuilder.serviceConnectDefaults(serviceConnectDefaults.let(CfnCluster.ServiceConnectDefaultsProperty::unwrap))
    }

    /**
     * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace.
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
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1abda0c5f82eecb52744b5c85186bd1ab6cbb213d95643185e65bc73b8067583")
    override
        fun serviceConnectDefaults(serviceConnectDefaults: CfnCluster.ServiceConnectDefaultsProperty.Builder.() -> Unit):
        Unit =
        serviceConnectDefaults(CfnCluster.ServiceConnectDefaultsProperty(serviceConnectDefaults))

    /**
     * @param tags The metadata that you apply to the cluster to help you categorize and organize
     * them.
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
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The metadata that you apply to the cluster to help you categorize and organize
     * them.
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
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ecs.CfnClusterProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
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
     */
    override fun capacityProviders(): List<String> = unwrap(this).getCapacityProviders() ?:
        emptyList()

    /**
     * A user-generated string that you use to identify your cluster.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustername)
     */
    override fun clusterName(): String? = unwrap(this).getClusterName()

    /**
     * The settings to use when creating a cluster.
     *
     * This parameter is used to turn on CloudWatch Container Insights for a cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustersettings)
     */
    override fun clusterSettings(): Any? = unwrap(this).getClusterSettings()

    /**
     * The execute command configuration for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-configuration)
     */
    override fun configuration(): Any? = unwrap(this).getConfiguration()

    /**
     * The default capacity provider strategy for the cluster.
     *
     * When services or tasks are run in the cluster with no launch type or capacity provider
     * strategy specified, the default capacity provider strategy is used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-defaultcapacityproviderstrategy)
     */
    override fun defaultCapacityProviderStrategy(): Any? =
        unwrap(this).getDefaultCapacityProviderStrategy()

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
     */
    override fun serviceConnectDefaults(): Any? = unwrap(this).getServiceConnectDefaults()

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
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.ecs.CfnClusterProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.CfnClusterProps
  }
}
