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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.CodeImageConfig

/**
 * Result of the bind when an ECR image is used.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CodeImageConfig codeImageConfig = CodeImageConfig.builder()
 * .imageUri("imageUri")
 * // the properties below are optional
 * .cmd(List.of("cmd"))
 * .entrypoint(List.of("entrypoint"))
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 */
@CdkDslMarker
public class CodeImageConfigDsl {
    private val cdkBuilder: CodeImageConfig.Builder = CodeImageConfig.builder()

    private val _cmd: MutableList<String> = mutableListOf()

    private val _entrypoint: MutableList<String> = mutableListOf()

    /**
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile. This
     *   needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    public fun cmd(vararg cmd: String) {
        _cmd.addAll(listOf(*cmd))
    }

    /**
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile. This
     *   needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    public fun cmd(cmd: Collection<String>) {
        _cmd.addAll(cmd)
    }

    /**
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     *   Dockerfile. An ENTRYPOINT allows you to configure a container that will run as an
     *   executable. This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2'
     *   ]`.
     */
    public fun entrypoint(vararg entrypoint: String) {
        _entrypoint.addAll(listOf(*entrypoint))
    }

    /**
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     *   Dockerfile. An ENTRYPOINT allows you to configure a container that will run as an
     *   executable. This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2'
     *   ]`.
     */
    public fun entrypoint(entrypoint: Collection<String>) {
        _entrypoint.addAll(entrypoint)
    }

    /** @param imageUri URI to the Docker image. */
    public fun imageUri(imageUri: String) {
        cdkBuilder.imageUri(imageUri)
    }

    /**
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     *   Dockerfile. A WORKDIR allows you to configure the working directory the container will use.
     */
    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): CodeImageConfig {
        if (_cmd.isNotEmpty()) cdkBuilder.cmd(_cmd)
        if (_entrypoint.isNotEmpty()) cdkBuilder.entrypoint(_entrypoint)
        return cdkBuilder.build()
    }
}
