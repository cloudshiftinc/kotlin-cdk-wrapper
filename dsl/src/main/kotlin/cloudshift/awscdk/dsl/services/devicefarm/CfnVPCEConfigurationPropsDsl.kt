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

package cloudshift.awscdk.dsl.services.devicefarm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVPCEConfigurationPropsDsl {
    private val cdkBuilder: CfnVPCEConfigurationProps.Builder = CfnVPCEConfigurationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun serviceDnsName(serviceDnsName: String) {
        cdkBuilder.serviceDnsName(serviceDnsName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun vpceConfigurationDescription(vpceConfigurationDescription: String) {
        cdkBuilder.vpceConfigurationDescription(vpceConfigurationDescription)
    }

    public fun vpceConfigurationName(vpceConfigurationName: String) {
        cdkBuilder.vpceConfigurationName(vpceConfigurationName)
    }

    public fun vpceServiceName(vpceServiceName: String) {
        cdkBuilder.vpceServiceName(vpceServiceName)
    }

    public fun build(): CfnVPCEConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
