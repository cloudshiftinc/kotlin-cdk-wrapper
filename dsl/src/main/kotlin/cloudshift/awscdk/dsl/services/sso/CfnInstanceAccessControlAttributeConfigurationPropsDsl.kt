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
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnInstanceAccessControlAttributeConfigurationPropsDsl {
    private val cdkBuilder: CfnInstanceAccessControlAttributeConfigurationProps.Builder =
        CfnInstanceAccessControlAttributeConfigurationProps.builder()

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

    @Deprecated(message = "deprecated in CDK")
    public fun instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration: IResolvable) {
        cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun instanceAccessControlAttributeConfiguration(
        instanceAccessControlAttributeConfiguration:
            CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty,
    ) {
        cdkBuilder.instanceAccessControlAttributeConfiguration(instanceAccessControlAttributeConfiguration)
    }

    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    public fun build(): CfnInstanceAccessControlAttributeConfigurationProps {
        if (_accessControlAttributes.isNotEmpty()) {
            cdkBuilder.accessControlAttributes(_accessControlAttributes)
        }
        return cdkBuilder.build()
    }
}
