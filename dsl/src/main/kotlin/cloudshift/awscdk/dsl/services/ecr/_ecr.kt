@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnPublicRepository
import software.amazon.awscdk.services.ecr.CfnPublicRepositoryProps
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRule
import software.amazon.awscdk.services.ecr.CfnPullThroughCacheRuleProps
import software.amazon.awscdk.services.ecr.CfnRegistryPolicy
import software.amazon.awscdk.services.ecr.CfnRegistryPolicyProps
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import software.amazon.awscdk.services.ecr.CfnReplicationConfigurationProps
import software.amazon.awscdk.services.ecr.CfnRepository
import software.amazon.awscdk.services.ecr.CfnRepositoryProps
import software.amazon.awscdk.services.ecr.LifecycleRule
import software.amazon.awscdk.services.ecr.OnCloudTrailImagePushedOptions
import software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions
import software.amazon.awscdk.services.ecr.Repository
import software.amazon.awscdk.services.ecr.RepositoryAttributes
import software.amazon.awscdk.services.ecr.RepositoryProps
import software.constructs.Construct

public object ecr {
  /**
   * The `AWS::ECR::PublicRepository` resource specifies an Amazon Elastic Container Registry Public
   * (Amazon ECR Public) repository, where users can push and pull Docker images, Open Container
   * Initiative (OCI) images, and OCI compatible artifacts.
   *
   * For more information, see [Amazon ECR public
   * repositories](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repositories.html) in the
   * *Amazon ECR Public User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * Object repositoryCatalogData;
   * Object repositoryPolicyText;
   * CfnPublicRepository cfnPublicRepository = CfnPublicRepository.Builder.create(this,
   * "MyCfnPublicRepository")
   * .repositoryCatalogData(repositoryCatalogData)
   * .repositoryName("repositoryName")
   * .repositoryPolicyText(repositoryPolicyText)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html)
   */
  public inline fun cfnPublicRepository(
    scope: Construct,
    id: String,
    block: CfnPublicRepositoryDsl.() -> Unit = {},
  ): CfnPublicRepository {
    val builder = CfnPublicRepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPublicRepository`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * Object repositoryCatalogData;
   * Object repositoryPolicyText;
   * CfnPublicRepositoryProps cfnPublicRepositoryProps = CfnPublicRepositoryProps.builder()
   * .repositoryCatalogData(repositoryCatalogData)
   * .repositoryName("repositoryName")
   * .repositoryPolicyText(repositoryPolicyText)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-publicrepository.html)
   */
  public inline fun cfnPublicRepositoryProps(block: CfnPublicRepositoryPropsDsl.() -> Unit = {}):
      CfnPublicRepositoryProps {
    val builder = CfnPublicRepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The details about the repository that are publicly visible in the Amazon ECR Public Gallery.
   *
   * For more information, see [Amazon ECR Public repository catalog
   * data](https://docs.aws.amazon.com/AmazonECR/latest/public/public-repository-catalog-data.html) in
   * the *Amazon ECR Public User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * RepositoryCatalogDataProperty repositoryCatalogDataProperty =
   * RepositoryCatalogDataProperty.builder()
   * .aboutText("aboutText")
   * .architectures(List.of("architectures"))
   * .operatingSystems(List.of("operatingSystems"))
   * .repositoryDescription("repositoryDescription")
   * .usageText("usageText")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-publicrepository-repositorycatalogdata.html)
   */
  public inline
      fun cfnPublicRepositoryRepositoryCatalogDataProperty(block: CfnPublicRepositoryRepositoryCatalogDataPropertyDsl.() -> Unit
      = {}): CfnPublicRepository.RepositoryCatalogDataProperty {
    val builder = CfnPublicRepositoryRepositoryCatalogDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a pull through cache rule.
   *
   * A pull through cache rule provides a way to cache images from an external public registry in
   * your Amazon ECR private registry.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * CfnPullThroughCacheRule cfnPullThroughCacheRule = CfnPullThroughCacheRule.Builder.create(this,
   * "MyCfnPullThroughCacheRule")
   * .ecrRepositoryPrefix("ecrRepositoryPrefix")
   * .upstreamRegistryUrl("upstreamRegistryUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html)
   */
  public inline fun cfnPullThroughCacheRule(
    scope: Construct,
    id: String,
    block: CfnPullThroughCacheRuleDsl.() -> Unit = {},
  ): CfnPullThroughCacheRule {
    val builder = CfnPullThroughCacheRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnPullThroughCacheRule`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * CfnPullThroughCacheRuleProps cfnPullThroughCacheRuleProps =
   * CfnPullThroughCacheRuleProps.builder()
   * .ecrRepositoryPrefix("ecrRepositoryPrefix")
   * .upstreamRegistryUrl("upstreamRegistryUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-pullthroughcacherule.html)
   */
  public inline fun cfnPullThroughCacheRuleProps(block: CfnPullThroughCacheRulePropsDsl.() -> Unit =
      {}): CfnPullThroughCacheRuleProps {
    val builder = CfnPullThroughCacheRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::ECR::RegistryPolicy` resource creates or updates the permissions policy for a private
   * registry.
   *
   * A private registry policy is used to specify permissions for another AWS account and is used
   * when configuring cross-account replication. For more information, see [Registry
   * permissions](https://docs.aws.amazon.com/AmazonECR/latest/userguide/registry-permissions.html) in
   * the *Amazon Elastic Container Registry User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * Object policyText;
   * CfnRegistryPolicy cfnRegistryPolicy = CfnRegistryPolicy.Builder.create(this,
   * "MyCfnRegistryPolicy")
   * .policyText(policyText)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html)
   */
  public inline fun cfnRegistryPolicy(
    scope: Construct,
    id: String,
    block: CfnRegistryPolicyDsl.() -> Unit = {},
  ): CfnRegistryPolicy {
    val builder = CfnRegistryPolicyDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRegistryPolicy`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * Object policyText;
   * CfnRegistryPolicyProps cfnRegistryPolicyProps = CfnRegistryPolicyProps.builder()
   * .policyText(policyText)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-registrypolicy.html)
   */
  public inline fun cfnRegistryPolicyProps(block: CfnRegistryPolicyPropsDsl.() -> Unit = {}):
      CfnRegistryPolicyProps {
    val builder = CfnRegistryPolicyPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::ECR::ReplicationConfiguration` resource creates or updates the replication
   * configuration for a private registry.
   *
   * The first time a replication configuration is applied to a private registry, a service-linked
   * IAM role is created in your account for the replication process. For more information, see [Using
   * Service-Linked Roles for Amazon
   * ECR](https://docs.aws.amazon.com/AmazonECR/latest/userguide/using-service-linked-roles.html) in
   * the *Amazon Elastic Container Registry User Guide* .
   *
   *
   * When configuring cross-account replication, the destination account must grant the source
   * account permission to replicate. This permission is controlled using a private registry
   * permissions policy. For more information, see `AWS::ECR::RegistryPolicy` .
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * CfnReplicationConfiguration cfnReplicationConfiguration =
   * CfnReplicationConfiguration.Builder.create(this, "MyCfnReplicationConfiguration")
   * .replicationConfiguration(ReplicationConfigurationProperty.builder()
   * .rules(List.of(ReplicationRuleProperty.builder()
   * .destinations(List.of(ReplicationDestinationProperty.builder()
   * .region("region")
   * .registryId("registryId")
   * .build()))
   * // the properties below are optional
   * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
   * .filter("filter")
   * .filterType("filterType")
   * .build()))
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html)
   */
  public inline fun cfnReplicationConfiguration(
    scope: Construct,
    id: String,
    block: CfnReplicationConfigurationDsl.() -> Unit = {},
  ): CfnReplicationConfiguration {
    val builder = CfnReplicationConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnReplicationConfiguration`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * CfnReplicationConfigurationProps cfnReplicationConfigurationProps =
   * CfnReplicationConfigurationProps.builder()
   * .replicationConfiguration(ReplicationConfigurationProperty.builder()
   * .rules(List.of(ReplicationRuleProperty.builder()
   * .destinations(List.of(ReplicationDestinationProperty.builder()
   * .region("region")
   * .registryId("registryId")
   * .build()))
   * // the properties below are optional
   * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
   * .filter("filter")
   * .filterType("filterType")
   * .build()))
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-replicationconfiguration.html)
   */
  public inline
      fun cfnReplicationConfigurationProps(block: CfnReplicationConfigurationPropsDsl.() -> Unit =
      {}): CfnReplicationConfigurationProps {
    val builder = CfnReplicationConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The replication configuration for a registry.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * ReplicationConfigurationProperty replicationConfigurationProperty =
   * ReplicationConfigurationProperty.builder()
   * .rules(List.of(ReplicationRuleProperty.builder()
   * .destinations(List.of(ReplicationDestinationProperty.builder()
   * .region("region")
   * .registryId("registryId")
   * .build()))
   * // the properties below are optional
   * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
   * .filter("filter")
   * .filterType("filterType")
   * .build()))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationconfiguration.html)
   */
  public inline
      fun cfnReplicationConfigurationReplicationConfigurationProperty(block: CfnReplicationConfigurationReplicationConfigurationPropertyDsl.() -> Unit
      = {}): CfnReplicationConfiguration.ReplicationConfigurationProperty {
    val builder = CfnReplicationConfigurationReplicationConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An array of objects representing the destination for a replication rule.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * ReplicationDestinationProperty replicationDestinationProperty =
   * ReplicationDestinationProperty.builder()
   * .region("region")
   * .registryId("registryId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationdestination.html)
   */
  public inline
      fun cfnReplicationConfigurationReplicationDestinationProperty(block: CfnReplicationConfigurationReplicationDestinationPropertyDsl.() -> Unit
      = {}): CfnReplicationConfiguration.ReplicationDestinationProperty {
    val builder = CfnReplicationConfigurationReplicationDestinationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An array of objects representing the replication destinations and repository filters for a
   * replication configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * ReplicationRuleProperty replicationRuleProperty = ReplicationRuleProperty.builder()
   * .destinations(List.of(ReplicationDestinationProperty.builder()
   * .region("region")
   * .registryId("registryId")
   * .build()))
   * // the properties below are optional
   * .repositoryFilters(List.of(RepositoryFilterProperty.builder()
   * .filter("filter")
   * .filterType("filterType")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-replicationrule.html)
   */
  public inline
      fun cfnReplicationConfigurationReplicationRuleProperty(block: CfnReplicationConfigurationReplicationRulePropertyDsl.() -> Unit
      = {}): CfnReplicationConfiguration.ReplicationRuleProperty {
    val builder = CfnReplicationConfigurationReplicationRulePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The filter settings used with image replication.
   *
   * Specifying a repository filter to a replication rule provides a method for controlling which
   * repositories in a private registry are replicated. If no filters are added, the contents of all
   * repositories are replicated.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * RepositoryFilterProperty repositoryFilterProperty = RepositoryFilterProperty.builder()
   * .filter("filter")
   * .filterType("filterType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-replicationconfiguration-repositoryfilter.html)
   */
  public inline
      fun cfnReplicationConfigurationRepositoryFilterProperty(block: CfnReplicationConfigurationRepositoryFilterPropertyDsl.() -> Unit
      = {}): CfnReplicationConfiguration.RepositoryFilterProperty {
    val builder = CfnReplicationConfigurationRepositoryFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `AWS::ECR::Repository` resource specifies an Amazon Elastic Container Registry (Amazon ECR)
   * repository, where users can push and pull Docker images, Open Container Initiative (OCI) images,
   * and OCI compatible artifacts.
   *
   * For more information, see [Amazon ECR private
   * repositories](https://docs.aws.amazon.com/AmazonECR/latest/userguide/Repositories.html) in the
   * *Amazon ECR User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * Object repositoryPolicyText;
   * CfnRepository cfnRepository = CfnRepository.Builder.create(this, "MyCfnRepository")
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionType("encryptionType")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .imageScanningConfiguration(ImageScanningConfigurationProperty.builder()
   * .scanOnPush(false)
   * .build())
   * .imageTagMutability("imageTagMutability")
   * .lifecyclePolicy(LifecyclePolicyProperty.builder()
   * .lifecyclePolicyText("lifecyclePolicyText")
   * .registryId("registryId")
   * .build())
   * .repositoryName("repositoryName")
   * .repositoryPolicyText(repositoryPolicyText)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html)
   */
  public inline fun cfnRepository(
    scope: Construct,
    id: String,
    block: CfnRepositoryDsl.() -> Unit = {},
  ): CfnRepository {
    val builder = CfnRepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The encryption configuration for the repository. This determines how the contents of your
   * repository are encrypted at rest.
   *
   * By default, when no encryption configuration is set or the `AES256` encryption type is used,
   * Amazon ECR uses server-side encryption with Amazon S3-managed encryption keys which encrypts your
   * data at rest using an AES-256 encryption algorithm. This does not require any action on your part.
   *
   * For more control over the encryption of the contents of your repository, you can use
   * server-side encryption with AWS Key Management Service key stored in AWS Key Management Service (
   * AWS KMS ) to encrypt your images. For more information, see [Amazon ECR encryption at
   * rest](https://docs.aws.amazon.com/AmazonECR/latest/userguide/encryption-at-rest.html) in the
   * *Amazon Elastic Container Registry User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * EncryptionConfigurationProperty encryptionConfigurationProperty =
   * EncryptionConfigurationProperty.builder()
   * .encryptionType("encryptionType")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-encryptionconfiguration.html)
   */
  public inline
      fun cfnRepositoryEncryptionConfigurationProperty(block: CfnRepositoryEncryptionConfigurationPropertyDsl.() -> Unit
      = {}): CfnRepository.EncryptionConfigurationProperty {
    val builder = CfnRepositoryEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The image scanning configuration for a repository.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * ImageScanningConfigurationProperty imageScanningConfigurationProperty =
   * ImageScanningConfigurationProperty.builder()
   * .scanOnPush(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-imagescanningconfiguration.html)
   */
  public inline
      fun cfnRepositoryImageScanningConfigurationProperty(block: CfnRepositoryImageScanningConfigurationPropertyDsl.() -> Unit
      = {}): CfnRepository.ImageScanningConfigurationProperty {
    val builder = CfnRepositoryImageScanningConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The `LifecyclePolicy` property type specifies a lifecycle policy.
   *
   * For information about lifecycle policy syntax, see [Lifecycle policy
   * template](https://docs.aws.amazon.com/AmazonECR/latest/userguide/LifecyclePolicies.html) in the
   * *Amazon ECR User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * LifecyclePolicyProperty lifecyclePolicyProperty = LifecyclePolicyProperty.builder()
   * .lifecyclePolicyText("lifecyclePolicyText")
   * .registryId("registryId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html)
   */
  public inline
      fun cfnRepositoryLifecyclePolicyProperty(block: CfnRepositoryLifecyclePolicyPropertyDsl.() -> Unit
      = {}): CfnRepository.LifecyclePolicyProperty {
    val builder = CfnRepositoryLifecyclePolicyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRepository`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * Object repositoryPolicyText;
   * CfnRepositoryProps cfnRepositoryProps = CfnRepositoryProps.builder()
   * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
   * .encryptionType("encryptionType")
   * // the properties below are optional
   * .kmsKey("kmsKey")
   * .build())
   * .imageScanningConfiguration(ImageScanningConfigurationProperty.builder()
   * .scanOnPush(false)
   * .build())
   * .imageTagMutability("imageTagMutability")
   * .lifecyclePolicy(LifecyclePolicyProperty.builder()
   * .lifecyclePolicyText("lifecyclePolicyText")
   * .registryId("registryId")
   * .build())
   * .repositoryName("repositoryName")
   * .repositoryPolicyText(repositoryPolicyText)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html)
   */
  public inline fun cfnRepositoryProps(block: CfnRepositoryPropsDsl.() -> Unit = {}):
      CfnRepositoryProps {
    val builder = CfnRepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * An ECR life cycle rule.
   *
   * Example:
   *
   * ```
   * Repository repository;
   * repository.addLifecycleRule(LifecycleRule.builder().tagPrefixList(List.of("prod")).maxImageCount(9999).build());
   * repository.addLifecycleRule(LifecycleRule.builder().maxImageAge(Duration.days(30)).build());
   * ```
   */
  public inline fun lifecycleRule(block: LifecycleRuleDsl.() -> Unit = {}): LifecycleRule {
    val builder = LifecycleRuleDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for the onCloudTrailImagePushed method.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * import software.amazon.awscdk.services.events.*;
   * import software.constructs.*;
   * Construct construct;
   * Object detail;
   * IRuleTarget ruleTarget;
   * OnCloudTrailImagePushedOptions onCloudTrailImagePushedOptions =
   * OnCloudTrailImagePushedOptions.builder()
   * .crossStackScope(construct)
   * .description("description")
   * .eventPattern(EventPattern.builder()
   * .account(List.of("account"))
   * .detail(Map.of(
   * "detailKey", detail))
   * .detailType(List.of("detailType"))
   * .id(List.of("id"))
   * .region(List.of("region"))
   * .resources(List.of("resources"))
   * .source(List.of("source"))
   * .time(List.of("time"))
   * .version(List.of("version"))
   * .build())
   * .imageTag("imageTag")
   * .ruleName("ruleName")
   * .target(ruleTarget)
   * .build();
   * ```
   */
  public inline
      fun onCloudTrailImagePushedOptions(block: OnCloudTrailImagePushedOptionsDsl.() -> Unit = {}):
      OnCloudTrailImagePushedOptions {
    val builder = OnCloudTrailImagePushedOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Options for the OnImageScanCompleted method.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * import software.amazon.awscdk.services.events.*;
   * import software.constructs.*;
   * Construct construct;
   * Object detail;
   * IRuleTarget ruleTarget;
   * OnImageScanCompletedOptions onImageScanCompletedOptions = OnImageScanCompletedOptions.builder()
   * .crossStackScope(construct)
   * .description("description")
   * .eventPattern(EventPattern.builder()
   * .account(List.of("account"))
   * .detail(Map.of(
   * "detailKey", detail))
   * .detailType(List.of("detailType"))
   * .id(List.of("id"))
   * .region(List.of("region"))
   * .resources(List.of("resources"))
   * .source(List.of("source"))
   * .time(List.of("time"))
   * .version(List.of("version"))
   * .build())
   * .imageTags(List.of("imageTags"))
   * .ruleName("ruleName")
   * .target(ruleTarget)
   * .build();
   * ```
   */
  public inline fun onImageScanCompletedOptions(block: OnImageScanCompletedOptionsDsl.() -> Unit =
      {}): OnImageScanCompletedOptions {
    val builder = OnImageScanCompletedOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Define an ECR repository.
   *
   * Example:
   *
   * ```
   * import software.amazon.awscdk.services.ecr.*;
   * Service.Builder.create(this, "Service")
   * .source(Source.fromEcr(EcrProps.builder()
   * .imageConfiguration(ImageConfiguration.builder().port(80).build())
   * .repository(Repository.fromRepositoryName(this, "NginxRepository", "nginx"))
   * .tagOrDigest("latest")
   * .build()))
   * .build();
   * ```
   */
  public inline fun repository(
    scope: Construct,
    id: String,
    block: RepositoryDsl.() -> Unit = {},
  ): Repository {
    val builder = RepositoryDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.ecr.*;
   * RepositoryAttributes repositoryAttributes = RepositoryAttributes.builder()
   * .repositoryArn("repositoryArn")
   * .repositoryName("repositoryName")
   * .build();
   * ```
   */
  public inline fun repositoryAttributes(block: RepositoryAttributesDsl.() -> Unit = {}):
      RepositoryAttributes {
    val builder = RepositoryAttributesDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * Repository.Builder.create(this, "Repo").imageTagMutability(TagMutability.IMMUTABLE).build();
   * ```
   */
  public inline fun repositoryProps(block: RepositoryPropsDsl.() -> Unit = {}): RepositoryProps {
    val builder = RepositoryPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
