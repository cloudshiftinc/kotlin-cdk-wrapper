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

package io.cloudshiftdev.awscdkdsl.services.amazonmq

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociationProps

/**
 * Properties for defining a `CfnConfigurationAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * CfnConfigurationAssociationProps cfnConfigurationAssociationProps =
 * CfnConfigurationAssociationProps.builder()
 * .broker("broker")
 * .configuration(ConfigurationIdProperty.builder()
 * .id("id")
 * .revision(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html)
 */
@CdkDslMarker
public class CfnConfigurationAssociationPropsDsl {
    private val cdkBuilder: CfnConfigurationAssociationProps.Builder =
        CfnConfigurationAssociationProps.builder()

    /** @param broker The broker to associate with a configuration. */
    public fun broker(broker: String) {
        cdkBuilder.broker(broker)
    }

    /** @param configuration The configuration to associate with a broker. */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /** @param configuration The configuration to associate with a broker. */
    public fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty) {
        cdkBuilder.configuration(configuration)
    }

    public fun build(): CfnConfigurationAssociationProps = cdkBuilder.build()
}
