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
import software.amazon.awscdk.services.imagebuilder.CfnImage
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnImageEcrConfigurationPropertyDsl {
    private val cdkBuilder: CfnImage.EcrConfigurationProperty.Builder =
        CfnImage.EcrConfigurationProperty.builder()

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

    public fun build(): CfnImage.EcrConfigurationProperty {
        if (_containerTags.isNotEmpty()) cdkBuilder.containerTags(_containerTags)
        return cdkBuilder.build()
    }
}
