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

package cloudshift.awscdk.dsl.services.cloudfront.experimental

import software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction
import software.amazon.awscdk.services.cloudfront.experimental.EdgeFunctionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object experimental {
    public inline fun edgeFunction(
        scope: Construct,
        id: String,
        block: EdgeFunctionDsl.() -> Unit = {},
    ): EdgeFunction {
        val builder = EdgeFunctionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun edgeFunctionProps(block: EdgeFunctionPropsDsl.() -> Unit = {}): EdgeFunctionProps {
        val builder = EdgeFunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
