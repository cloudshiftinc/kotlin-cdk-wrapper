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
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnConfigurationAssociationConfigurationIdPropertyDsl {
    private val cdkBuilder: CfnConfigurationAssociation.ConfigurationIdProperty.Builder =
        CfnConfigurationAssociation.ConfigurationIdProperty.builder()

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun revision(revision: Number) {
        cdkBuilder.revision(revision)
    }

    public fun build(): CfnConfigurationAssociation.ConfigurationIdProperty = cdkBuilder.build()
}
