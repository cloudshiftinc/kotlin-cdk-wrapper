@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnCluster
import software.constructs.Construct

@CdkDslMarker
public class CfnClusterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCluster.Builder = CfnCluster.Builder.create(scope, id)

  private val _capacityProviders: MutableList<String> = mutableListOf()

  private val _clusterSettings: MutableList<Any> = mutableListOf()

  private val _defaultCapacityProviderStrategy: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

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
   * @param capacityProviders The short name of one or more capacity providers to associate with the
   * cluster. 
   */
  public fun capacityProviders(vararg capacityProviders: String) {
    _capacityProviders.addAll(listOf(*capacityProviders))
  }

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
   * @param capacityProviders The short name of one or more capacity providers to associate with the
   * cluster. 
   */
  public fun capacityProviders(capacityProviders: Collection<String>) {
    _capacityProviders.addAll(capacityProviders)
  }

  /**
   * A user-generated string that you use to identify your cluster.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustername)
   * @param clusterName A user-generated string that you use to identify your cluster. 
   */
  public fun clusterName(clusterName: String) {
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
  public fun clusterSettings(vararg clusterSettings: Any) {
    _clusterSettings.addAll(listOf(*clusterSettings))
  }

  /**
   * The settings to use when creating a cluster.
   *
   * This parameter is used to turn on CloudWatch Container Insights for a cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustersettings)
   * @param clusterSettings The settings to use when creating a cluster. 
   */
  public fun clusterSettings(clusterSettings: Collection<Any>) {
    _clusterSettings.addAll(clusterSettings)
  }

  /**
   * The settings to use when creating a cluster.
   *
   * This parameter is used to turn on CloudWatch Container Insights for a cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-clustersettings)
   * @param clusterSettings The settings to use when creating a cluster. 
   */
  public fun clusterSettings(clusterSettings: IResolvable) {
    cdkBuilder.clusterSettings(clusterSettings)
  }

  /**
   * The execute command configuration for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-configuration)
   * @param configuration The execute command configuration for the cluster. 
   */
  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * The execute command configuration for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-configuration)
   * @param configuration The execute command configuration for the cluster. 
   */
  public fun configuration(configuration: CfnCluster.ClusterConfigurationProperty) {
    cdkBuilder.configuration(configuration)
  }

  /**
   * The default capacity provider strategy for the cluster.
   *
   * When services or tasks are run in the cluster with no launch type or capacity provider strategy
   * specified, the default capacity provider strategy is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-defaultcapacityproviderstrategy)
   * @param defaultCapacityProviderStrategy The default capacity provider strategy for the cluster. 
   */
  public fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any) {
    _defaultCapacityProviderStrategy.addAll(listOf(*defaultCapacityProviderStrategy))
  }

  /**
   * The default capacity provider strategy for the cluster.
   *
   * When services or tasks are run in the cluster with no launch type or capacity provider strategy
   * specified, the default capacity provider strategy is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-defaultcapacityproviderstrategy)
   * @param defaultCapacityProviderStrategy The default capacity provider strategy for the cluster. 
   */
  public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: Collection<Any>) {
    _defaultCapacityProviderStrategy.addAll(defaultCapacityProviderStrategy)
  }

  /**
   * The default capacity provider strategy for the cluster.
   *
   * When services or tasks are run in the cluster with no launch type or capacity provider strategy
   * specified, the default capacity provider strategy is used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-defaultcapacityproviderstrategy)
   * @param defaultCapacityProviderStrategy The default capacity provider strategy for the cluster. 
   */
  public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
    cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-serviceconnectdefaults)
   * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace. 
   */
  public fun serviceConnectDefaults(serviceConnectDefaults: IResolvable) {
    cdkBuilder.serviceConnectDefaults(serviceConnectDefaults)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-cluster.html#cfn-ecs-cluster-serviceconnectdefaults)
   * @param serviceConnectDefaults Use this parameter to set a default Service Connect namespace. 
   */
  public
      fun serviceConnectDefaults(serviceConnectDefaults: CfnCluster.ServiceConnectDefaultsProperty) {
    cdkBuilder.serviceConnectDefaults(serviceConnectDefaults)
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
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
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
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCluster {
    if(_capacityProviders.isNotEmpty()) cdkBuilder.capacityProviders(_capacityProviders)
    if(_clusterSettings.isNotEmpty()) cdkBuilder.clusterSettings(_clusterSettings)
    if(_defaultCapacityProviderStrategy.isNotEmpty())
        cdkBuilder.defaultCapacityProviderStrategy(_defaultCapacityProviderStrategy)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
