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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnImagePipelineEcrConfigurationPropertyDsl {
    private val cdkBuilder: CfnImagePipeline.EcrConfigurationProperty.Builder =
        CfnImagePipeline.EcrConfigurationProperty.builder()

    private val _containerTags: MutableList<String> = mutableListOf()

    public fun containerTags(vararg containerTags: String) {
        _containerTags.addAll(listOf(*containerTags))
    }

    public fun containerTags(containerTags: Collection<String>) {
        _containerTags.addAll(containerTags)
    }

    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): CfnImagePipeline.EcrConfigurationProperty {
        if (_containerTags.isNotEmpty()) cdkBuilder.containerTags(_containerTags)
        return cdkBuilder.build()
    }
}
