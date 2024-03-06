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

package io.cloudshiftdev.awscdkdsl.services.cloudfront.experimental

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction
import software.amazon.awscdk.services.cloudfront.experimental.EdgeFunctionProps
import software.constructs.Construct

public object experimental {
    /**
     * A Lambda&#64;Edge function.
     *
     * Convenience resource for requesting a Lambda function in the 'us-east-1' region for use with
     * Lambda&#64;Edge. Implements several restrictions enforced by Lambda&#64;Edge.
     *
     * Note that this construct requires that the 'us-east-1' region has been bootstrapped. See
     * https://docs.aws.amazon.com/cdk/latest/guide/bootstrapping.html or 'cdk bootstrap --help' for
     * options.
     *
     * Example:
     * ```
     * Bucket myBucket;
     * // A Lambda&#64;Edge function added to default behavior of a Distribution
     * // and triggered on every request
     * EdgeFunction myFunc = EdgeFunction.Builder.create(this, "MyFunction")
     * .runtime(Runtime.NODEJS_LATEST)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .build();
     * Distribution.Builder.create(this, "myDist")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new S3Origin(myBucket))
     * .edgeLambdas(List.of(EdgeLambda.builder()
     * .functionVersion(myFunc.getCurrentVersion())
     * .eventType(LambdaEdgeEventType.VIEWER_REQUEST)
     * .build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun edgeFunction(
        scope: Construct,
        id: String,
        block: EdgeFunctionDsl.() -> Unit = {},
    ): EdgeFunction {
        val builder = EdgeFunctionDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a Lambda&#64;Edge function.
     *
     * Example:
     * ```
     * Bucket myBucket;
     * // A Lambda&#64;Edge function added to default behavior of a Distribution
     * // and triggered on every request
     * EdgeFunction myFunc = EdgeFunction.Builder.create(this, "MyFunction")
     * .runtime(Runtime.NODEJS_LATEST)
     * .handler("index.handler")
     * .code(Code.fromAsset(join(__dirname, "lambda-handler")))
     * .build();
     * Distribution.Builder.create(this, "myDist")
     * .defaultBehavior(BehaviorOptions.builder()
     * .origin(new S3Origin(myBucket))
     * .edgeLambdas(List.of(EdgeLambda.builder()
     * .functionVersion(myFunc.getCurrentVersion())
     * .eventType(LambdaEdgeEventType.VIEWER_REQUEST)
     * .build()))
     * .build())
     * .build();
     * ```
     */
    public inline fun edgeFunctionProps(
        block: EdgeFunctionPropsDsl.() -> Unit = {}
    ): EdgeFunctionProps {
        val builder = EdgeFunctionPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
