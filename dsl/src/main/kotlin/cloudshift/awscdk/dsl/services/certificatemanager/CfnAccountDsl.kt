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

package cloudshift.awscdk.dsl.services.certificatemanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.certificatemanager.CfnAccount
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnAccountDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccount.Builder = CfnAccount.Builder.create(scope, id)

    public fun expiryEventsConfiguration(expiryEventsConfiguration: IResolvable) {
        cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration)
    }

    public fun expiryEventsConfiguration(expiryEventsConfiguration: CfnAccount.ExpiryEventsConfigurationProperty) {
        cdkBuilder.expiryEventsConfiguration(expiryEventsConfiguration)
    }

    public fun build(): CfnAccount = cdkBuilder.build()
}
