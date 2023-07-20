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

package cloudshift.awscdk.dsl.services.lambda.nodejs

import software.amazon.awscdk.services.lambda.nodejs.BundlingOptions
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunction
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object nodejs {
    public inline fun bundlingOptions(block: BundlingOptionsDsl.() -> Unit = {}): BundlingOptions {
        val builder = BundlingOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun nodejsFunction(
        scope: Construct,
        id: String,
        block: NodejsFunctionDsl.() -> Unit = {},
    ): NodejsFunction {
        val builder = NodejsFunctionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun nodejsFunctionProps(block: NodejsFunctionPropsDsl.() -> Unit = {}): NodejsFunctionProps {
        val builder = NodejsFunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
