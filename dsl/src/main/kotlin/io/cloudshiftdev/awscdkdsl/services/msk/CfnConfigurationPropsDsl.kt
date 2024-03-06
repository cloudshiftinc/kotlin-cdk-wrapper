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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnConfiguration
import software.amazon.awscdk.services.msk.CfnConfigurationProps

/**
 * Properties for defining a `CfnConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * CfnConfigurationProps cfnConfigurationProps = CfnConfigurationProps.builder()
 * .name("name")
 * .serverProperties("serverProperties")
 * // the properties below are optional
 * .description("description")
 * .kafkaVersionsList(List.of("kafkaVersionsList"))
 * .latestRevision(LatestRevisionProperty.builder()
 * .creationTime("creationTime")
 * .description("description")
 * .revision(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html)
 */
@CdkDslMarker
public class CfnConfigurationPropsDsl {
    private val cdkBuilder: CfnConfigurationProps.Builder = CfnConfigurationProps.builder()

    private val _kafkaVersionsList: MutableList<String> = mutableListOf()

    /** @param description The description of the configuration. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param kafkaVersionsList the value to be set. */
    public fun kafkaVersionsList(vararg kafkaVersionsList: String) {
        _kafkaVersionsList.addAll(listOf(*kafkaVersionsList))
    }

    /** @param kafkaVersionsList the value to be set. */
    public fun kafkaVersionsList(kafkaVersionsList: Collection<String>) {
        _kafkaVersionsList.addAll(kafkaVersionsList)
    }

    /** @param latestRevision Latest revision of the configuration. */
    public fun latestRevision(latestRevision: IResolvable) {
        cdkBuilder.latestRevision(latestRevision)
    }

    /** @param latestRevision Latest revision of the configuration. */
    public fun latestRevision(latestRevision: CfnConfiguration.LatestRevisionProperty) {
        cdkBuilder.latestRevision(latestRevision)
    }

    /**
     * @param name The name of the configuration. Configuration names are strings that match the
     *   regex "^[0-9A-Za-z][0-9A-Za-z-]{0,}$".
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param serverProperties Contents of the server.properties file. When using the API, you must
     *   ensure that the contents of the file are base64 encoded. When using the console, the SDK,
     *   or the CLI, the contents of server.properties can be in plaintext.
     */
    public fun serverProperties(serverProperties: String) {
        cdkBuilder.serverProperties(serverProperties)
    }

    public fun build(): CfnConfigurationProps {
        if (_kafkaVersionsList.isNotEmpty()) cdkBuilder.kafkaVersionsList(_kafkaVersionsList)
        return cdkBuilder.build()
    }
}
