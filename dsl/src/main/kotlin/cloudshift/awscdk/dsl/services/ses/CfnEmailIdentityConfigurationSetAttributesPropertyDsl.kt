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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import kotlin.String

@CdkDslMarker
public class CfnEmailIdentityConfigurationSetAttributesPropertyDsl {
    private val cdkBuilder: CfnEmailIdentity.ConfigurationSetAttributesProperty.Builder =
        CfnEmailIdentity.ConfigurationSetAttributesProperty.builder()

    public fun configurationSetName(configurationSetName: String) {
        cdkBuilder.configurationSetName(configurationSetName)
    }

    public fun build(): CfnEmailIdentity.ConfigurationSetAttributesProperty = cdkBuilder.build()
}
