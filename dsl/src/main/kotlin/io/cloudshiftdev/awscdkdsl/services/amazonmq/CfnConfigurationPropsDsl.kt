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
import software.amazon.awscdk.services.amazonmq.CfnConfigurationProps

/**
 * Properties for defining a `CfnConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.amazonmq.*;
 * CfnConfigurationProps cfnConfigurationProps = CfnConfigurationProps.builder()
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
public class CfnConfigurationPropsDsl {
    private val cdkBuilder: CfnConfigurationProps.Builder = CfnConfigurationProps.builder()

    private val _tags: MutableList<CfnConfiguration.TagsEntryProperty> = mutableListOf()

    /**
     * @param authenticationStrategy Optional. The authentication strategy associated with the
     *   configuration. The default is `SIMPLE` .
     */
    public fun authenticationStrategy(authenticationStrategy: String) {
        cdkBuilder.authenticationStrategy(authenticationStrategy)
    }

    /** @param data The base64-encoded XML configuration. */
    public fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
    }

    /** @param description The description of the configuration. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param engineType The type of broker engine. Note: Currently, Amazon MQ only supports
     *   ACTIVEMQ for creating and editing broker configurations.
     */
    public fun engineType(engineType: String) {
        cdkBuilder.engineType(engineType)
    }

    /**
     * @param engineVersion The version of the broker engine. For a list of supported engine
     *   versions, see
     *   [](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html)
     */
    public fun engineVersion(engineVersion: String) {
        cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param name The name of the configuration. This value can contain only alphanumeric
     *   characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 1-150
     *   characters long.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param tags Create tags when creating the configuration. */
    public fun tags(tags: CfnConfigurationTagsEntryPropertyDsl.() -> Unit) {
        _tags.add(CfnConfigurationTagsEntryPropertyDsl().apply(tags).build())
    }

    /** @param tags Create tags when creating the configuration. */
    public fun tags(tags: Collection<CfnConfiguration.TagsEntryProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
