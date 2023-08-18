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
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.amazonmq.CfnConfiguration
import software.constructs.Construct

/**
 * Creates a new configuration for the specified configuration name.
 *
 * Amazon MQ uses the default configuration (the engine type and version).
 *
 * Does not apply to RabbitMQ brokers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * CfnConfiguration cfnConfiguration = CfnConfiguration.Builder.create(this, "MyCfnConfiguration")
 * .data("data")
 * .engineType("engineType")
 * .engineVersion("engineVersion")
 * .name("name")
 * // the properties below are optional
 * .authenticationStrategy("authenticationStrategy")
 * .description("description")
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html)
 */
@CdkDslMarker
public class CfnConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfiguration.Builder = CfnConfiguration.Builder.create(scope, id)

    private val _tags: MutableList<CfnConfiguration.TagsEntryProperty> = mutableListOf()

    /**
     * Optional.
     *
     * The authentication strategy associated with the configuration. The default is `SIMPLE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-authenticationstrategy)
     *
     * @param authenticationStrategy Optional.
     */
    public fun authenticationStrategy(authenticationStrategy: String) {
        cdkBuilder.authenticationStrategy(authenticationStrategy)
    }

    /**
     * The base64-encoded XML configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-data)
     *
     * @param data The base64-encoded XML configuration.
     */
    public fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
    }

    /**
     * The description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-description)
     *
     * @param description The description of the configuration.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The type of broker engine.
     *
     * Note: Currently, Amazon MQ only supports ACTIVEMQ for creating and editing broker
     * configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-enginetype)
     *
     * @param engineType The type of broker engine.
     */
    public fun engineType(engineType: String) {
        cdkBuilder.engineType(engineType)
    }

    /**
     * The version of the broker engine.
     *
     * For a list of supported engine versions, see
     * [](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-engineversion)
     *
     * @param engineVersion The version of the broker engine.
     */
    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The name of the configuration.
     *
     * This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes
     * (- . _ ~). This value must be 1-150 characters long.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-name)
     *
     * @param name The name of the configuration.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Create tags when creating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-tags)
     *
     * @param tags Create tags when creating the configuration.
     */
    public fun tags(tags: CfnConfigurationTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnConfigurationTagsEntryPropertyDsl().apply(tags).build())
    }

    /**
     * Create tags when creating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-tags)
     *
     * @param tags Create tags when creating the configuration.
     */
    public fun tags(tags: Collection<CfnConfiguration.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConfiguration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
