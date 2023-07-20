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

import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration
import software.amazon.awscdk.services.ecr.CfnRepository
import software.amazon.awscdk.services.ecr.IRepository
import software.amazon.awscdk.services.ecr.Repository
import software.amazon.awscdk.services.ecr.RepositoryBase
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import kotlin.String
import kotlin.Unit

public inline fun IRepository.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

public inline fun IRepository.onCloudTrailEvent(
    arg0: String,
    block: OnEventOptionsDsl.() -> Unit =
        {},
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onCloudTrailEvent(arg0, builder.build())
}

public inline fun IRepository.onCloudTrailImagePushed(
    arg0: String,
    block: OnCloudTrailImagePushedOptionsDsl.() -> Unit = {},
): Rule {
    val builder = OnCloudTrailImagePushedOptionsDsl()
    builder.apply(block)
    return onCloudTrailImagePushed(arg0, builder.build())
}

public inline fun IRepository.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(arg0, builder.build())
}

public inline fun IRepository.onImageScanCompleted(
    arg0: String,
    block: OnImageScanCompletedOptionsDsl.() -> Unit = {},
): Rule {
    val builder = OnImageScanCompletedOptionsDsl()
    builder.apply(block)
    return onImageScanCompleted(arg0, builder.build())
}

public inline fun CfnReplicationConfiguration.setReplicationConfiguration(
    block: CfnReplicationConfigurationReplicationConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnReplicationConfigurationReplicationConfigurationPropertyDsl()
    builder.apply(block)
    return setReplicationConfiguration(builder.build())
}

public inline fun RepositoryBase.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

public inline fun RepositoryBase.onCloudTrailEvent(
    id: String,
    block: OnEventOptionsDsl.() -> Unit =
        {},
): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onCloudTrailEvent(id, builder.build())
}

public inline fun RepositoryBase.onCloudTrailImagePushed(
    id: String,
    block: OnCloudTrailImagePushedOptionsDsl.() -> Unit = {},
): Rule {
    val builder = OnCloudTrailImagePushedOptionsDsl()
    builder.apply(block)
    return onCloudTrailImagePushed(id, builder.build())
}

public inline fun RepositoryBase.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit = {}): Rule {
    val builder = OnEventOptionsDsl()
    builder.apply(block)
    return onEvent(id, builder.build())
}

public inline fun RepositoryBase.onImageScanCompleted(
    id: String,
    block: OnImageScanCompletedOptionsDsl.() -> Unit = {},
): Rule {
    val builder = OnImageScanCompletedOptionsDsl()
    builder.apply(block)
    return onImageScanCompleted(id, builder.build())
}

public inline fun Repository.addLifecycleRule(block: LifecycleRuleDsl.() -> Unit = {}) {
    val builder = LifecycleRuleDsl()
    builder.apply(block)
    return addLifecycleRule(builder.build())
}

public inline fun Repository.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}): AddToResourcePolicyResult {
    val builder = PolicyStatementDsl()
    builder.apply(block)
    return addToResourcePolicy(builder.build())
}

public inline fun CfnRepository.setEncryptionConfiguration(
    block: CfnRepositoryEncryptionConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnRepositoryEncryptionConfigurationPropertyDsl()
    builder.apply(block)
    return setEncryptionConfiguration(builder.build())
}

public inline fun CfnRepository.setImageScanningConfiguration(
    block: CfnRepositoryImageScanningConfigurationPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnRepositoryImageScanningConfigurationPropertyDsl()
    builder.apply(block)
    return setImageScanningConfiguration(builder.build())
}

public inline fun CfnRepository.setLifecyclePolicy(
    block: CfnRepositoryLifecyclePolicyPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnRepositoryLifecyclePolicyPropertyDsl()
    builder.apply(block)
    return setLifecyclePolicy(builder.build())
}
