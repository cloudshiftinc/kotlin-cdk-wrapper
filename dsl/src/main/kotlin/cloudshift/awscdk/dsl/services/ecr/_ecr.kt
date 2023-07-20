@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecr

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
import kotlin.String
import kotlin.Unit

public object ecr {
    public inline fun cfnPublicRepository(
        scope: Construct,
        id: String,
        block: CfnPublicRepositoryDsl.() -> Unit = {},
    ): CfnPublicRepository {
        val builder = CfnPublicRepositoryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPublicRepositoryProps(block: CfnPublicRepositoryPropsDsl.() -> Unit = {}): CfnPublicRepositoryProps {
        val builder = CfnPublicRepositoryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPublicRepositoryRepositoryCatalogDataProperty(
        block: CfnPublicRepositoryRepositoryCatalogDataPropertyDsl.() -> Unit =
            {},
    ): CfnPublicRepository.RepositoryCatalogDataProperty {
        val builder = CfnPublicRepositoryRepositoryCatalogDataPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPullThroughCacheRule(
        scope: Construct,
        id: String,
        block: CfnPullThroughCacheRuleDsl.() -> Unit = {},
    ): CfnPullThroughCacheRule {
        val builder = CfnPullThroughCacheRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnPullThroughCacheRuleProps(
        block: CfnPullThroughCacheRulePropsDsl.() -> Unit =
            {},
    ): CfnPullThroughCacheRuleProps {
        val builder = CfnPullThroughCacheRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRegistryPolicy(
        scope: Construct,
        id: String,
        block: CfnRegistryPolicyDsl.() -> Unit = {},
    ): CfnRegistryPolicy {
        val builder = CfnRegistryPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRegistryPolicyProps(block: CfnRegistryPolicyPropsDsl.() -> Unit = {}): CfnRegistryPolicyProps {
        val builder = CfnRegistryPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnReplicationConfiguration(
        scope: Construct,
        id: String,
        block: CfnReplicationConfigurationDsl.() -> Unit = {},
    ): CfnReplicationConfiguration {
        val builder = CfnReplicationConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnReplicationConfigurationProps(
        block: CfnReplicationConfigurationPropsDsl.() -> Unit =
            {},
    ): CfnReplicationConfigurationProps {
        val builder = CfnReplicationConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnReplicationConfigurationReplicationConfigurationProperty(
        block: CfnReplicationConfigurationReplicationConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnReplicationConfiguration.ReplicationConfigurationProperty {
        val builder = CfnReplicationConfigurationReplicationConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnReplicationConfigurationReplicationDestinationProperty(
        block: CfnReplicationConfigurationReplicationDestinationPropertyDsl.() -> Unit =
            {},
    ): CfnReplicationConfiguration.ReplicationDestinationProperty {
        val builder = CfnReplicationConfigurationReplicationDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnReplicationConfigurationReplicationRuleProperty(
        block: CfnReplicationConfigurationReplicationRulePropertyDsl.() -> Unit =
            {},
    ): CfnReplicationConfiguration.ReplicationRuleProperty {
        val builder = CfnReplicationConfigurationReplicationRulePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnReplicationConfigurationRepositoryFilterProperty(
        block: CfnReplicationConfigurationRepositoryFilterPropertyDsl.() -> Unit =
            {},
    ): CfnReplicationConfiguration.RepositoryFilterProperty {
        val builder = CfnReplicationConfigurationRepositoryFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRepository(
        scope: Construct,
        id: String,
        block: CfnRepositoryDsl.() -> Unit = {},
    ): CfnRepository {
        val builder = CfnRepositoryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRepositoryEncryptionConfigurationProperty(
        block: CfnRepositoryEncryptionConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnRepository.EncryptionConfigurationProperty {
        val builder = CfnRepositoryEncryptionConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRepositoryImageScanningConfigurationProperty(
        block: CfnRepositoryImageScanningConfigurationPropertyDsl.() -> Unit =
            {},
    ): CfnRepository.ImageScanningConfigurationProperty {
        val builder = CfnRepositoryImageScanningConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRepositoryLifecyclePolicyProperty(
        block: CfnRepositoryLifecyclePolicyPropertyDsl.() -> Unit =
            {},
    ): CfnRepository.LifecyclePolicyProperty {
        val builder = CfnRepositoryLifecyclePolicyPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnRepositoryProps(block: CfnRepositoryPropsDsl.() -> Unit = {}): CfnRepositoryProps {
        val builder = CfnRepositoryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lifecycleRule(block: LifecycleRuleDsl.() -> Unit = {}): LifecycleRule {
        val builder = LifecycleRuleDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun onCloudTrailImagePushedOptions(block: OnCloudTrailImagePushedOptionsDsl.() -> Unit = {}): OnCloudTrailImagePushedOptions {
        val builder = OnCloudTrailImagePushedOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun onImageScanCompletedOptions(
        block: OnImageScanCompletedOptionsDsl.() -> Unit =
            {},
    ): OnImageScanCompletedOptions {
        val builder = OnImageScanCompletedOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun repository(
        scope: Construct,
        id: String,
        block: RepositoryDsl.() -> Unit = {},
    ): Repository {
        val builder = RepositoryDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun repositoryAttributes(block: RepositoryAttributesDsl.() -> Unit = {}): RepositoryAttributes {
        val builder = RepositoryAttributesDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun repositoryProps(block: RepositoryPropsDsl.() -> Unit = {}): RepositoryProps {
        val builder = RepositoryPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
