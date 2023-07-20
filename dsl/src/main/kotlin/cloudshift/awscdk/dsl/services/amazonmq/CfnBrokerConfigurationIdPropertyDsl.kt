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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.amazonmq.CfnBroker
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnBrokerConfigurationIdPropertyDsl {
    private val cdkBuilder: CfnBroker.ConfigurationIdProperty.Builder =
        CfnBroker.ConfigurationIdProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun revision(revision: Number) {
        cdkBuilder.revision(revision)
    }

    public fun build(): CfnBroker.ConfigurationIdProperty = cdkBuilder.build()
}
