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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration

/**
 * These are IAM Identity Center identity store attributes that you can configure for use in
 * attributes-based access control (ABAC).
 *
 * You can create permissions policies that determine who can access your AWS resources based upon
 * the configured attribute values. When you enable ABAC and specify `AccessControlAttributes` , IAM
 * Identity Center passes the attribute values of the authenticated user into IAM for use in policy
 * evaluation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sso.*;
 * AccessControlAttributeProperty accessControlAttributeProperty =
 * AccessControlAttributeProperty.builder()
 * .key("key")
 * .value(AccessControlAttributeValueProperty.builder()
 * .source(List.of("source"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattribute.html)
 */
@CdkDslMarker
public class CfnInstanceAccessControlAttributeConfigurationAccessControlAttributePropertyDsl {
    private val cdkBuilder:
        CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.Builder =
        CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty.builder()

    /**
     * @param key The name of the attribute associated with your identities in your identity source.
     *   This is used to map a specified attribute in your identity source with an attribute in IAM
     *   Identity Center .
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value used for mapping a specified attribute to an identity source. */
    public fun `value`(`value`: IResolvable) {
        cdkBuilder.`value`(`value`)
    }

    /** @param value The value used for mapping a specified attribute to an identity source. */
    public fun `value`(
        `value`: CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeValueProperty
    ) {
        cdkBuilder.`value`(`value`)
    }

    public fun build():
        CfnInstanceAccessControlAttributeConfiguration.AccessControlAttributeProperty =
        cdkBuilder.build()
}
