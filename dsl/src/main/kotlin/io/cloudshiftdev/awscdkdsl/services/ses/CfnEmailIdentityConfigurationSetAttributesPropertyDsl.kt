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

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnEmailIdentity

/**
 * Used to associate a configuration set with an email identity.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ses.*;
 * ConfigurationSetAttributesProperty configurationSetAttributesProperty =
 * ConfigurationSetAttributesProperty.builder()
 * .configurationSetName("configurationSetName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-emailidentity-configurationsetattributes.html)
 */
@CdkDslMarker
public class CfnEmailIdentityConfigurationSetAttributesPropertyDsl {
    private val cdkBuilder: CfnEmailIdentity.ConfigurationSetAttributesProperty.Builder =
        CfnEmailIdentity.ConfigurationSetAttributesProperty.builder()

    /** @param configurationSetName The configuration set to associate with an email identity. */
    public fun configurationSetName(configurationSetName: String) {
        cdkBuilder.configurationSetName(configurationSetName)
    }

    public fun build(): CfnEmailIdentity.ConfigurationSetAttributesProperty = cdkBuilder.build()
}
