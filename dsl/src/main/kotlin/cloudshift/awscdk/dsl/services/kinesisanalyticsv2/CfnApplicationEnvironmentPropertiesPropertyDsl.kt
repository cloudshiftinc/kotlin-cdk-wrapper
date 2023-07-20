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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnApplicationEnvironmentPropertiesPropertyDsl {
    private val cdkBuilder: CfnApplication.EnvironmentPropertiesProperty.Builder =
        CfnApplication.EnvironmentPropertiesProperty.builder()

    private val _propertyGroups: MutableList<Any> = mutableListOf()

    public fun propertyGroups(vararg propertyGroups: Any) {
        _propertyGroups.addAll(listOf(*propertyGroups))
    }

    public fun propertyGroups(propertyGroups: Collection<Any>) {
        _propertyGroups.addAll(propertyGroups)
    }

    public fun propertyGroups(propertyGroups: IResolvable) {
        cdkBuilder.propertyGroups(propertyGroups)
    }

    public fun build(): CfnApplication.EnvironmentPropertiesProperty {
        if (_propertyGroups.isNotEmpty()) cdkBuilder.propertyGroups(_propertyGroups)
        return cdkBuilder.build()
    }
}
