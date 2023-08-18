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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration

/**
 * The value used for mapping a specified attribute to an identity source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sso.*;
 * AccessControlAttributeValueProperty accessControlAttributeValueProperty =
 * AccessControlAttributeValueProperty.builder()
 * .source(List.of("source"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributevalue.html)
 */
@CdkDslMarker
public class CfnInstanceAccessControlAttributeConfigurationAccessControlAttributeValuePropertyDsl {
    private val cdkBuilder:
        CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty.Builder =
        CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty.builder()

    private val _source: MutableList<String> = mutableListOf()

    /**
     * @param source The identity source to use when mapping a specified attribute to IAM Identity
     *   Center .
     */
    public fun source(vararg source: String) {
        _source.addAll(listOf(*source))
    }

    /**
     * @param source The identity source to use when mapping a specified attribute to IAM Identity
     *   Center .
     */
    public fun source(source: Collection<String>) {
        _source.addAll(source)
    }

    public fun build():
        CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty {
        if (_source.isNotEmpty()) cdkBuilder.source(_source)
        return cdkBuilder.build()
    }
}
