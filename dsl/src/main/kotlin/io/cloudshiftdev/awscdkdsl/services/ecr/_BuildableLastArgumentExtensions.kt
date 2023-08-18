@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ecr

import io.cloudshiftdev.awscdkdsl.services.events.OnEventOptionsDsl
import io.cloudshiftdev.awscdkdsl.services.iam.PolicyStatementDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import software.amazon.awscdk.services.ecr.CfnRepository
import software.amazon.awscdk.services.ecr.IRepository
import software.amazon.awscdk.services.ecr.Repository
import software.amazon.awscdk.services.ecr.RepositoryBase
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult

/** The replication configuration for a registry. */
public inline fun CfnReplicationConfiguration.setReplicationConfiguration(
    block: CfnReplicationConfigurationReplicationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnReplicationConfigurationReplicationConfigurationPropertyDsl()
    builder.apply(block)
    return setReplicationConfiguration(builder.build())
}

/** The encryption configuration for the repository. */
public inline fun CfnRepository.setEncryptionConfiguration(
    block: CfnRepositoryEncryptionConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRepositoryEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return setEncryptionConfiguration(builder.build())
}

/** The image scanning configuration for the repository. */
public inline fun CfnRepository.setImageScanningConfiguration(
    block: CfnRepositoryImageScanningConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRepositoryImageScanningConfigurationPropertyDsl()
    builder.apply(block)
    return setImageScanningConfiguration(builder.build())
}

/** Creates or updates a lifecycle policy. */
public inline fun CfnRepository.setLifecyclePolicy(
    block: CfnRepositoryLifecyclePolicyPropertyDsl.() -> Unit = {}
) {
    val builder = CfnRepositoryLifecyclePolicyPropertyDsl()
    builder.apply(block)
    return setLifecyclePolicy(builder.build())
}

/**
 * Add a policy statement to the repository's resource policy.
 *
 * @param statement
 */
public inline fun IRepository.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

/**
 * Define a CloudWatch event that triggers when something happens to this repository.
 *
 * Requires that there exists at least one CloudTrail Trail in your account that captures the event.
 * This method will not create the Trail.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun IRepository.onCloudTrailEvent(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onCloudTrailEvent(arg0, builder.build())
}

/**
 * Defines an AWS CloudWatch event rule that can trigger a target when an image is pushed to this
 * repository.
 *
 * Requires that there exists at least one CloudTrail Trail in your account that captures the event.
 * This method will not create the Trail.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun IRepository.onCloudTrailImagePushed(
    arg0: String,
    block: OnCloudTrailImagePushedOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnCloudTrailImagePushedOptionsDsl()
    builder.apply(block)
    return onCloudTrailImagePushed(arg0, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers for repository events.
 *
 * Use `rule.addEventPattern(pattern)` to specify a filter.
 *
 * @param id
 * @param options
 */
public inline fun IRepository.onEvent(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(arg0, builder.build())
}

/**
 * Defines an AWS CloudWatch event rule that can trigger a target when the image scan is completed.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun IRepository.onImageScanCompleted(
    arg0: String,
    block: OnImageScanCompletedOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnImageScanCompletedOptionsDsl()
    builder.apply(block)
    return onImageScanCompleted(arg0, builder.build())
}

/**
 * Add a life cycle rule to the repository.
 *
 * Life cycle rules automatically expire images from the repository that match certain conditions.
 *
 * @param rule
 */
public inline fun Repository.addLifecycleRule(block: LifecycleRuleDsl.() -> Unit = {}) {
    val builder = LifecycleRuleDsl()
    builder.apply(block)
    return addLifecycleRule(builder.build())
}

/**
 * Add a policy statement to the repository's resource policy.
 *
 * While other resources policies in AWS either require or accept a resource section, Cfn for ECR
 * does not allow us to specify a resource policy. It will fail if a resource section is present at
 * all.
 *
 * @param statement
 */
public inline fun Repository.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

/**
 * Add a policy statement to the repository's resource policy.
 *
 * @param statement
 */
public inline fun RepositoryBase.addToResourcePolicy(
    block: PolicyStatementDsl.() -> Unit = {}
): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

/**
 * Define a CloudWatch event that triggers when something happens to this repository.
 *
 * Requires that there exists at least one CloudTrail Trail in your account that captures the event.
 * This method will not create the Trail.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun RepositoryBase.onCloudTrailEvent(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onCloudTrailEvent(id, builder.build())
}

/**
 * Defines an AWS CloudWatch event rule that can trigger a target when an image is pushed to this
 * repository.
 *
 * Requires that there exists at least one CloudTrail Trail in your account that captures the event.
 * This method will not create the Trail.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun RepositoryBase.onCloudTrailImagePushed(
    id: String,
    block: OnCloudTrailImagePushedOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnCloudTrailImagePushedOptionsDsl()
    builder.apply(block)
    return onCloudTrailImagePushed(id, builder.build())
}

/**
 * Defines a CloudWatch event rule which triggers for repository events.
 *
 * Use `rule.addEventPattern(pattern)` to specify a filter.
 *
 * @param id
 * @param options
 */
public inline fun RepositoryBase.onEvent(
    id: String,
    block: OnEventOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(id, builder.build())
}

/**
 * Defines an AWS CloudWatch event rule that can trigger a target when an image scan is completed.
 *
 * @param id The id of the rule.
 * @param options Options for adding the rule.
 */
public inline fun RepositoryBase.onImageScanCompleted(
    id: String,
    block: OnImageScanCompletedOptionsDsl.() -> Unit = {}
): Rule {
    val builder = OnImageScanCompletedOptionsDsl()
    builder.apply(block)
    return onImageScanCompleted(id, builder.build())
}
