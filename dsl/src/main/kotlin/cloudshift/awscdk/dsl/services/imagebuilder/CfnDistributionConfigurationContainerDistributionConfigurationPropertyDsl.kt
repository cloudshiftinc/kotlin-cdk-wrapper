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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDistributionConfigurationContainerDistributionConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.Builder =
        CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.builder()

    private val _containerTags: MutableList<String> = mutableListOf()

    public fun containerTags(vararg containerTags: String) {
        _containerTags.addAll(listOf(*containerTags))
    }

    public fun containerTags(containerTags: Collection<String>) {
        _containerTags.addAll(containerTags)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun targetRepository(targetRepository: IResolvable) {
        cdkBuilder.targetRepository(targetRepository)
    }

    public fun targetRepository(targetRepository: CfnDistributionConfiguration.TargetContainerRepositoryProperty) {
        cdkBuilder.targetRepository(targetRepository)
    }

    public fun build(): CfnDistributionConfiguration.ContainerDistributionConfigurationProperty {
        if (_containerTags.isNotEmpty()) cdkBuilder.containerTags(_containerTags)
        return cdkBuilder.build()
    }
}
