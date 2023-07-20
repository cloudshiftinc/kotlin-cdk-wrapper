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

package cloudshift.awscdk.dsl.services.codestarconnections

import software.amazon.awscdk.services.codestarconnections.CfnConnection
import software.amazon.awscdk.services.codestarconnections.CfnConnectionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object codestarconnections {
    public inline fun cfnConnection(
        scope: Construct,
        id: String,
        block: CfnConnectionDsl.() -> Unit = {},
    ): CfnConnection {
        val builder = CfnConnectionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnConnectionProps(block: CfnConnectionPropsDsl.() -> Unit = {}): CfnConnectionProps {
        val builder = CfnConnectionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
