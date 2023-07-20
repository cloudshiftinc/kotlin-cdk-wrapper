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

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationComponentConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.ComponentConfigurationProperty.Builder =
        CfnApplication.ComponentConfigurationProperty.builder()

    private val _subComponentTypeConfigurations: MutableList<Any> = mutableListOf()

    public fun configurationDetails(configurationDetails: IResolvable) {
        cdkBuilder.configurationDetails(configurationDetails)
    }

    public fun configurationDetails(configurationDetails: CfnApplication.ConfigurationDetailsProperty) {
        cdkBuilder.configurationDetails(configurationDetails)
    }

    public fun subComponentTypeConfigurations(vararg subComponentTypeConfigurations: Any) {
        _subComponentTypeConfigurations.addAll(listOf(*subComponentTypeConfigurations))
    }

    public fun subComponentTypeConfigurations(subComponentTypeConfigurations: Collection<Any>) {
        _subComponentTypeConfigurations.addAll(subComponentTypeConfigurations)
    }

    public fun subComponentTypeConfigurations(subComponentTypeConfigurations: IResolvable) {
        cdkBuilder.subComponentTypeConfigurations(subComponentTypeConfigurations)
    }

    public fun build(): CfnApplication.ComponentConfigurationProperty {
        if (_subComponentTypeConfigurations.isNotEmpty()) {
            cdkBuilder.subComponentTypeConfigurations(_subComponentTypeConfigurations)
        }
        return cdkBuilder.build()
    }
}
