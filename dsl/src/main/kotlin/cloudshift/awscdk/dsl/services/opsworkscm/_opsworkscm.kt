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

package cloudshift.awscdk.dsl.services.opsworkscm

import software.amazon.awscdk.services.opsworkscm.CfnServer
import software.amazon.awscdk.services.opsworkscm.CfnServerProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object opsworkscm {
    public inline fun cfnServer(
        scope: Construct,
        id: String,
        block: CfnServerDsl.() -> Unit = {},
    ): CfnServer {
        val builder = CfnServerDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServerEngineAttributeProperty(
        block: CfnServerEngineAttributePropertyDsl.() -> Unit =
            {},
    ): CfnServer.EngineAttributeProperty {
        val builder = CfnServerEngineAttributePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnServerProps(block: CfnServerPropsDsl.() -> Unit = {}): CfnServerProps {
        val builder = CfnServerPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
