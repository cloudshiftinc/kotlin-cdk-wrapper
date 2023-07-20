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
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnSecurityConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSecurityConfiguration.Builder =
        CfnSecurityConfiguration.Builder.create(scope, id)

    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    public fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnSecurityConfiguration = cdkBuilder.build()
}
