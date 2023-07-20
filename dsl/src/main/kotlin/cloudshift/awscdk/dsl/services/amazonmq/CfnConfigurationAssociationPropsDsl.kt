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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnConfigurationAssociationPropsDsl {
    private val cdkBuilder: CfnConfigurationAssociationProps.Builder =
        CfnConfigurationAssociationProps.builder()

    public fun broker(broker: String) {
        cdkBuilder.broker(broker)
    }

    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    public fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty) {
        cdkBuilder.configuration(configuration)
    }

    public fun build(): CfnConfigurationAssociationProps = cdkBuilder.build()
}
