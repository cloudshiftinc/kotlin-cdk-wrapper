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

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class
CfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.Builder =
        CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.builder()

    private val _accessControlAttributes: MutableList<Any> = mutableListOf()

    public fun accessControlAttributes(vararg accessControlAttributes: Any) {
        _accessControlAttributes.addAll(listOf(*accessControlAttributes))
    }

    public fun accessControlAttributes(accessControlAttributes: Collection<Any>) {
        _accessControlAttributes.addAll(accessControlAttributes)
    }

    public fun accessControlAttributes(accessControlAttributes: IResolvable) {
        cdkBuilder.accessControlAttributes(accessControlAttributes)
    }

    public fun build(): CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty {
        if (_accessControlAttributes.isNotEmpty()) {
            cdkBuilder.accessControlAttributes(_accessControlAttributes)
        }
        return cdkBuilder.build()
    }
}
