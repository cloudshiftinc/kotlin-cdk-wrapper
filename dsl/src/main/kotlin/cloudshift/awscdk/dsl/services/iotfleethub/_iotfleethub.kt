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

package cloudshift.awscdk.dsl.services.iotfleethub

import software.amazon.awscdk.services.iotfleethub.CfnApplication
import software.amazon.awscdk.services.iotfleethub.CfnApplicationProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object iotfleethub {
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
