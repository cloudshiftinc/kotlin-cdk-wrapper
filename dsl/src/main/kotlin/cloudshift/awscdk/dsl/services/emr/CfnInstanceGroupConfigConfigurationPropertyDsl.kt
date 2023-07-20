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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnInstanceGroupConfigConfigurationPropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.ConfigurationProperty.Builder =
        CfnInstanceGroupConfig.ConfigurationProperty.builder()

    private val _configurations: MutableList<Any> = mutableListOf()

    public fun classification(classification: String) {
        cdkBuilder.classification(classification)
    }

    public fun configurationProperties(configurationProperties: Map<String, String>) {
        cdkBuilder.configurationProperties(configurationProperties)
    }

    public fun configurationProperties(configurationProperties: IResolvable) {
        cdkBuilder.configurationProperties(configurationProperties)
    }

    public fun configurations(vararg configurations: Any) {
        _configurations.addAll(listOf(*configurations))
    }

    public fun configurations(configurations: Collection<Any>) {
        _configurations.addAll(configurations)
    }

    public fun configurations(configurations: IResolvable) {
        cdkBuilder.configurations(configurations)
    }

    public fun build(): CfnInstanceGroupConfig.ConfigurationProperty {
        if (_configurations.isNotEmpty()) cdkBuilder.configurations(_configurations)
        return cdkBuilder.build()
    }
}
