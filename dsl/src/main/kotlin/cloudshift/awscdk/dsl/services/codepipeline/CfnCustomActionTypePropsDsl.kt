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

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType
import software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnCustomActionTypePropsDsl {
    private val cdkBuilder: CfnCustomActionTypeProps.Builder = CfnCustomActionTypeProps.builder()

    private val _configurationProperties: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun category(category: String) {
        cdkBuilder.category(category)
    }

    public fun configurationProperties(vararg configurationProperties: Any) {
        _configurationProperties.addAll(listOf(*configurationProperties))
    }

    public fun configurationProperties(configurationProperties: Collection<Any>) {
        _configurationProperties.addAll(configurationProperties)
    }

    public fun configurationProperties(configurationProperties: IResolvable) {
        cdkBuilder.configurationProperties(configurationProperties)
    }

    public fun inputArtifactDetails(inputArtifactDetails: IResolvable) {
        cdkBuilder.inputArtifactDetails(inputArtifactDetails)
    }

    public fun inputArtifactDetails(inputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty) {
        cdkBuilder.inputArtifactDetails(inputArtifactDetails)
    }

    public fun outputArtifactDetails(outputArtifactDetails: IResolvable) {
        cdkBuilder.outputArtifactDetails(outputArtifactDetails)
    }

    public fun outputArtifactDetails(outputArtifactDetails: CfnCustomActionType.ArtifactDetailsProperty) {
        cdkBuilder.outputArtifactDetails(outputArtifactDetails)
    }

    public fun provider(provider: String) {
        cdkBuilder.provider(provider)
    }

    public fun settings(settings: IResolvable) {
        cdkBuilder.settings(settings)
    }

    public fun settings(settings: CfnCustomActionType.SettingsProperty) {
        cdkBuilder.settings(settings)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnCustomActionTypeProps {
        if (_configurationProperties.isNotEmpty()) {
            cdkBuilder.configurationProperties(_configurationProperties)
        }
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
