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

package cloudshift.awscdk.dsl.services.elasticsearch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticsearch.CfnDomain
import kotlin.Boolean

@CdkDslMarker
public class CfnDomainAdvancedSecurityOptionsInputPropertyDsl {
    private val cdkBuilder: CfnDomain.AdvancedSecurityOptionsInputProperty.Builder =
        CfnDomain.AdvancedSecurityOptionsInputProperty.builder()

    public fun anonymousAuthEnabled(anonymousAuthEnabled: Boolean) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled)
    }

    public fun anonymousAuthEnabled(anonymousAuthEnabled: IResolvable) {
        cdkBuilder.anonymousAuthEnabled(anonymousAuthEnabled)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: Boolean) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled)
    }

    public fun internalUserDatabaseEnabled(internalUserDatabaseEnabled: IResolvable) {
        cdkBuilder.internalUserDatabaseEnabled(internalUserDatabaseEnabled)
    }

    public fun masterUserOptions(masterUserOptions: IResolvable) {
        cdkBuilder.masterUserOptions(masterUserOptions)
    }

    public fun masterUserOptions(masterUserOptions: CfnDomain.MasterUserOptionsProperty) {
        cdkBuilder.masterUserOptions(masterUserOptions)
    }

    public fun build(): CfnDomain.AdvancedSecurityOptionsInputProperty = cdkBuilder.build()
}
