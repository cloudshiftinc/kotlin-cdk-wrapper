@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.sso

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration

/**
 * The InstanceAccessControlAttributeConfiguration property has been deprecated but is still
 * supported for backwards compatibility purposes.
 *
 * We recomend that you use AccessControlAttributes property instead.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sso.*;
 * InstanceAccessControlAttributeConfigurationProperty
 * instanceAccessControlAttributeConfigurationProperty =
 * InstanceAccessControlAttributeConfigurationProperty.builder()
 * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
 * .key("key")
 * .value(AccessControlAttributeValueProperty.builder()
 * .source(List.of("source"))
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration.html)
 */
@CdkDslMarker
public class CfnInstanceAccessControlAttributeConfigurationInstanceAccessControlAttributeConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty.Builder =
        CfnInstanceAccessControlAttributeConfiguration
            .InstanceAccessControlAttributeConfigurationProperty
            .builder()

    private val _accessControlAttributes: MutableList<Any> = mutableListOf()

    /** @param accessControlAttributes the value to be set. */
    public fun accessControlAttributes(vararg accessControlAttributes: Any) {
        _accessControlAttributes.addAll(listOf(*accessControlAttributes))
    }

    /** @param accessControlAttributes the value to be set. */
    public fun accessControlAttributes(accessControlAttributes: Collection<Any>) {
        _accessControlAttributes.addAll(accessControlAttributes)
    }

    /** @param accessControlAttributes the value to be set. */
    public fun accessControlAttributes(accessControlAttributes: IResolvable) {
        cdkBuilder.accessControlAttributes(accessControlAttributes)
    }

    public fun build():
        CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty {
        if (_accessControlAttributes.isNotEmpty())
            cdkBuilder.accessControlAttributes(_accessControlAttributes)
        return cdkBuilder.build()
    }
}
