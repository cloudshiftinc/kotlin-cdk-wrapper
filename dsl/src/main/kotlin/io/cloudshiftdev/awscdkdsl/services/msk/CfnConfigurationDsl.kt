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
import software.constructs.Construct

/**
 * Creates a new MSK configuration.
 *
 * To see an example of how to use this operation, first save the following text to a file and name
 * the file config-file.txt .
 *
 * `auto.create.topics.enable = true zookeeper.connection.timeout.ms = 1000 log.roll.ms = 604800000`
 *
 * Now run the following Python 3.6 script in the folder where you saved config-file.txt . This
 * script uses the properties specified in config-file.txt to create a configuration named
 * `SalesClusterConfiguration` . This configuration can work with Apache Kafka versions 1.1.1 and
 * 2.1.0.
 *
 * ```
 * import boto3 client = boto3.client('kafka') config_file = open('config-file.txt', 'r')
 * server_properties = config_file.read() response = client.create_configuration(
 * Name='SalesClusterConfiguration', Description='The configuration to use on all sales clusters.',
 * KafkaVersions=['1.1.1', '2.1.0'], ServerProperties=server_properties
 * ) print(response)
 * ```
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * CfnConfiguration cfnConfiguration = CfnConfiguration.Builder.create(this, "MyCfnConfiguration")
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
public class CfnConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConfiguration.Builder = CfnConfiguration.Builder.create(scope, id)

    private val _kafkaVersionsList: MutableList<String> = mutableListOf()

    /**
     * The description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-description)
     *
     * @param description The description of the configuration.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
     *
     * @param kafkaVersionsList
     */
    public fun kafkaVersionsList(vararg kafkaVersionsList: String) {
        _kafkaVersionsList.addAll(listOf(*kafkaVersionsList))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-kafkaversionslist)
     *
     * @param kafkaVersionsList
     */
    public fun kafkaVersionsList(kafkaVersionsList: Collection<String>) {
        _kafkaVersionsList.addAll(kafkaVersionsList)
    }

    /**
     * Latest revision of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     *
     * @param latestRevision Latest revision of the configuration.
     */
    public fun latestRevision(latestRevision: IResolvable) {
        cdkBuilder.latestRevision(latestRevision)
    }

    /**
     * Latest revision of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-latestrevision)
     *
     * @param latestRevision Latest revision of the configuration.
     */
    public fun latestRevision(latestRevision: CfnConfiguration.LatestRevisionProperty) {
        cdkBuilder.latestRevision(latestRevision)
    }

    /**
     * The name of the configuration.
     *
     * Configuration names are strings that match the regex "^[0-9A-Za-z][0-9A-Za-z-]{0,}$".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-name)
     *
     * @param name The name of the configuration.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Contents of the server.properties file. When using the API, you must ensure that the contents
     * of the file are base64 encoded. When using the console, the SDK, or the CLI, the contents of
     * server.properties can be in plaintext.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-configuration.html#cfn-msk-configuration-serverproperties)
     *
     * @param serverProperties Contents of the server.properties file. When using the API, you must
     *   ensure that the contents of the file are base64 encoded. When using the console, the SDK,
     *   or the CLI, the contents of server.properties can be in plaintext.
     */
    public fun serverProperties(serverProperties: String) {
        cdkBuilder.serverProperties(serverProperties)
    }

    public fun build(): CfnConfiguration {
        if (_kafkaVersionsList.isNotEmpty()) cdkBuilder.kafkaVersionsList(_kafkaVersionsList)
        return cdkBuilder.build()
    }
}
