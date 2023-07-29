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

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.amazonmq.CfnConfigurationAssociation
import software.constructs.Construct

/**
 * Use the AWS CloudFormation `AWS::AmazonMQ::ConfigurationAssociation` resource to associate a
 * configuration with a broker, or return information about the specified ConfigurationAssociation.
 *
 * Only use one per broker, and don't use a configuration on the broker resource if you have
 * associated a configuration with that broker.
 *
 * Does not apply to RabbitMQ brokers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * CfnConfigurationAssociation cfnConfigurationAssociation =
 * CfnConfigurationAssociation.Builder.create(this, "MyCfnConfigurationAssociation")
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
public class CfnConfigurationAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfigurationAssociation.Builder =
        CfnConfigurationAssociation.Builder.create(scope, id)

    /**
     * The broker to associate with a configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-broker)
     *
     * @param broker The broker to associate with a configuration.
     */
    public fun broker(broker: String) {
        cdkBuilder.broker(broker)
    }

    /**
     * The configuration to associate with a broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
     *
     * @param configuration The configuration to associate with a broker.
     */
    public fun configuration(configuration: IResolvable) {
        cdkBuilder.configuration(configuration)
    }

    /**
     * The configuration to associate with a broker.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configurationassociation.html#cfn-amazonmq-configurationassociation-configuration)
     *
     * @param configuration The configuration to associate with a broker.
     */
    public fun configuration(configuration: CfnConfigurationAssociation.ConfigurationIdProperty) {
        cdkBuilder.configuration(configuration)
    }

    public fun build(): CfnConfigurationAssociation = cdkBuilder.build()
}
