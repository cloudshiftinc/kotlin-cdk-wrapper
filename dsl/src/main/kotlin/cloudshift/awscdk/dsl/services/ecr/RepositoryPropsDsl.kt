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

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ecr.LifecycleRule
import software.amazon.awscdk.services.ecr.RepositoryEncryption
import software.amazon.awscdk.services.ecr.RepositoryProps
import software.amazon.awscdk.services.ecr.TagMutability
import software.amazon.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class RepositoryPropsDsl {
    private val cdkBuilder: RepositoryProps.Builder = RepositoryProps.builder()

    private val _lifecycleRules: MutableList<LifecycleRule> = mutableListOf()

    public fun autoDeleteImages(autoDeleteImages: Boolean) {
        cdkBuilder.autoDeleteImages(autoDeleteImages)
    }

    public fun encryption(encryption: RepositoryEncryption) {
        cdkBuilder.encryption(encryption)
    }

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun imageScanOnPush(imageScanOnPush: Boolean) {
        cdkBuilder.imageScanOnPush(imageScanOnPush)
    }

    public fun imageTagMutability(imageTagMutability: TagMutability) {
        cdkBuilder.imageTagMutability(imageTagMutability)
    }

    public fun lifecycleRegistryId(lifecycleRegistryId: String) {
        cdkBuilder.lifecycleRegistryId(lifecycleRegistryId)
    }

    public fun lifecycleRules(lifecycleRules: LifecycleRuleDsl.() -> Unit) {
        _lifecycleRules.add(LifecycleRuleDsl().apply(lifecycleRules).build())
    }

    public fun lifecycleRules(lifecycleRules: Collection<LifecycleRule>) {
        _lifecycleRules.addAll(lifecycleRules)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): RepositoryProps {
        if (_lifecycleRules.isNotEmpty()) cdkBuilder.lifecycleRules(_lifecycleRules)
        return cdkBuilder.build()
    }
}
