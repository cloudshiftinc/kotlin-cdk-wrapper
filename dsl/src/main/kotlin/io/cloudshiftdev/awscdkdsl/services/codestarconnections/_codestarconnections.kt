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

package io.cloudshiftdev.awscdkdsl.services.codestarconnections

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarconnections.CfnConnection
import software.amazon.awscdk.services.codestarconnections.CfnConnectionProps
import software.amazon.awscdk.services.codestarconnections.CfnRepositoryLink
import software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps
import software.amazon.awscdk.services.codestarconnections.CfnSyncConfiguration
import software.amazon.awscdk.services.codestarconnections.CfnSyncConfigurationProps
import software.constructs.Construct

public object codestarconnections {
    /**
     * The AWS::CodeStarConnections::Connection resource can be used to connect external source
     * providers with services like AWS CodePipeline .
     *
     * *Note:* A connection created through AWS CloudFormation is in `PENDING` status by default.
     * You can make its status `AVAILABLE` by updating the connection in the console.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codestarconnections.*;
     * CfnConnection cfnConnection = CfnConnection.Builder.create(this, "MyCfnConnection")
     * .connectionName("connectionName")
     * // the properties below are optional
     * .hostArn("hostArn")
     * .providerType("providerType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html)
     */
    public inline fun cfnConnection(
        scope: Construct,
        id: String,
        block: CfnConnectionDsl.() -> Unit = {},
    ): CfnConnection {
        val builder = CfnConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnConnection`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codestarconnections.*;
     * CfnConnectionProps cfnConnectionProps = CfnConnectionProps.builder()
     * .connectionName("connectionName")
     * // the properties below are optional
     * .hostArn("hostArn")
     * .providerType("providerType")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-connection.html)
     */
    public inline fun cfnConnectionProps(
        block: CfnConnectionPropsDsl.() -> Unit = {}
    ): CfnConnectionProps {
        val builder = CfnConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information about the repository link resource, such as the repository link ARN, the
     * associated connection ARN, encryption key ARN, and owner ID.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codestarconnections.*;
     * CfnRepositoryLink cfnRepositoryLink = CfnRepositoryLink.Builder.create(this,
     * "MyCfnRepositoryLink")
     * .connectionArn("connectionArn")
     * .ownerId("ownerId")
     * .repositoryName("repositoryName")
     * // the properties below are optional
     * .encryptionKeyArn("encryptionKeyArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html)
     */
    public inline fun cfnRepositoryLink(
        scope: Construct,
        id: String,
        block: CfnRepositoryLinkDsl.() -> Unit = {},
    ): CfnRepositoryLink {
        val builder = CfnRepositoryLinkDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnRepositoryLink`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codestarconnections.*;
     * CfnRepositoryLinkProps cfnRepositoryLinkProps = CfnRepositoryLinkProps.builder()
     * .connectionArn("connectionArn")
     * .ownerId("ownerId")
     * .repositoryName("repositoryName")
     * // the properties below are optional
     * .encryptionKeyArn("encryptionKeyArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-repositorylink.html)
     */
    public inline fun cfnRepositoryLinkProps(
        block: CfnRepositoryLinkPropsDsl.() -> Unit = {}
    ): CfnRepositoryLinkProps {
        val builder = CfnRepositoryLinkPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Information, such as repository, branch, provider, and resource names for a specific sync
     * configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codestarconnections.*;
     * CfnSyncConfiguration cfnSyncConfiguration = CfnSyncConfiguration.Builder.create(this,
     * "MyCfnSyncConfiguration")
     * .branch("branch")
     * .configFile("configFile")
     * .repositoryLinkId("repositoryLinkId")
     * .resourceName("resourceName")
     * .roleArn("roleArn")
     * .syncType("syncType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html)
     */
    public inline fun cfnSyncConfiguration(
        scope: Construct,
        id: String,
        block: CfnSyncConfigurationDsl.() -> Unit = {},
    ): CfnSyncConfiguration {
        val builder = CfnSyncConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSyncConfiguration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.codestarconnections.*;
     * CfnSyncConfigurationProps cfnSyncConfigurationProps = CfnSyncConfigurationProps.builder()
     * .branch("branch")
     * .configFile("configFile")
     * .repositoryLinkId("repositoryLinkId")
     * .resourceName("resourceName")
     * .roleArn("roleArn")
     * .syncType("syncType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarconnections-syncconfiguration.html)
     */
    public inline fun cfnSyncConfigurationProps(
        block: CfnSyncConfigurationPropsDsl.() -> Unit = {}
    ): CfnSyncConfigurationProps {
        val builder = CfnSyncConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
