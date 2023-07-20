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

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration
import software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps
import kotlin.String

@CdkDslMarker
public class CfnSecurityConfigurationPropsDsl {
    private val cdkBuilder: CfnSecurityConfigurationProps.Builder =
        CfnSecurityConfigurationProps.builder()

    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    public fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnSecurityConfigurationProps = cdkBuilder.build()
}
