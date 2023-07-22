@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.nodejs

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.nodejs.BundlingOptions
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunction
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps
import software.constructs.Construct

public object nodejs {
  /**
   * Bundling options.
   *
   * Example:
   *
   * ```
   * NodejsFunction.Builder.create(this, "my-handler")
   * .bundling(BundlingOptions.builder()
   * .dockerImage(DockerImage.fromBuild("/path/to/Dockerfile"))
   * .build())
   * .build();
   * ```
   */
  public inline fun bundlingOptions(block: BundlingOptionsDsl.() -> Unit = {}): BundlingOptions {
    val builder = BundlingOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A Node.js Lambda function bundled using esbuild.
   *
   * Example:
   *
   * ```
   * NodejsFunction.Builder.create(this, "my-handler")
   * .bundling(BundlingOptions.builder()
   * .network("host")
   * .securityOpt("no-new-privileges")
   * .user("user:group")
   * .volumesFrom(List.of("777f7dc92da7"))
   * .volumes(List.of(DockerVolume.builder().hostPath("/host-path").containerPath("/container-path").build()))
   * .build())
   * .build();
   * ```
   */
  public inline fun nodejsFunction(
    scope: Construct,
    id: String,
    block: NodejsFunctionDsl.() -> Unit = {},
  ): NodejsFunction {
    val builder = NodejsFunctionDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for a NodejsFunction.
   *
   * Example:
   *
   * ```
   * NodejsFunction.Builder.create(this, "my-handler")
   * .bundling(BundlingOptions.builder()
   * .network("host")
   * .securityOpt("no-new-privileges")
   * .user("user:group")
   * .volumesFrom(List.of("777f7dc92da7"))
   * .volumes(List.of(DockerVolume.builder().hostPath("/host-path").containerPath("/container-path").build()))
   * .build())
   * .build();
   * ```
   */
  public inline fun nodejsFunctionProps(block: NodejsFunctionPropsDsl.() -> Unit = {}):
      NodejsFunctionProps {
    val builder = NodejsFunctionPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
