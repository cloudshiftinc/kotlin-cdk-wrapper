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

package cloudshift.awscdk.dsl.services.controltower

import software.amazon.awscdk.services.controltower.CfnEnabledControl
import software.amazon.awscdk.services.controltower.CfnEnabledControlProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object controltower {
    public inline fun cfnEnabledControl(
        scope: Construct,
        id: String,
        block: CfnEnabledControlDsl.() -> Unit = {},
    ): CfnEnabledControl {
        val builder = CfnEnabledControlDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnEnabledControlProps(block: CfnEnabledControlPropsDsl.() -> Unit = {}): CfnEnabledControlProps {
        val builder = CfnEnabledControlPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
