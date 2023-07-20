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
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnRepository
import software.amazon.awscdk.services.ecr.CfnRepositoryProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRepositoryPropsDsl {
    private val cdkBuilder: CfnRepositoryProps.Builder = CfnRepositoryProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    public fun encryptionConfiguration(encryptionConfiguration: CfnRepository.EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    public fun imageScanningConfiguration(imageScanningConfiguration: CfnRepository.ImageScanningConfigurationProperty) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    public fun imageTagMutability(imageTagMutability: String) {
        cdkBuilder.imageTagMutability(imageTagMutability)
    }

    public fun lifecyclePolicy(lifecyclePolicy: IResolvable) {
        cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    public fun lifecyclePolicy(lifecyclePolicy: CfnRepository.LifecyclePolicyProperty) {
        cdkBuilder.lifecyclePolicy(lifecyclePolicy)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun repositoryPolicyText(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.repositoryPolicyText(builder.map)
    }

    public fun repositoryPolicyText(repositoryPolicyText: Any) {
        cdkBuilder.repositoryPolicyText(repositoryPolicyText)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnRepositoryProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
