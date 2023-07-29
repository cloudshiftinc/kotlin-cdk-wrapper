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

package cloudshift.awscdk.dsl.services.codestarconnections

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarconnections.CfnConnection
import software.amazon.awscdk.services.codestarconnections.CfnConnectionProps
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
}
