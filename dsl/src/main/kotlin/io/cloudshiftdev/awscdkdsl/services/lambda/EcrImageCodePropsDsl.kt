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
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.EcrImageCodeProps

/**
 * Properties to initialize a new EcrImageCode.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * EcrImageCodeProps ecrImageCodeProps = EcrImageCodeProps.builder()
 * .cmd(List.of("cmd"))
 * .entrypoint(List.of("entrypoint"))
 * .tag("tag")
 * .tagOrDigest("tagOrDigest")
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 */
@CdkDslMarker
public class EcrImageCodePropsDsl {
    private val cdkBuilder: EcrImageCodeProps.Builder = EcrImageCodeProps.builder()

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

    /**
     * @param tag The image tag to use when pulling the image from ECR.
     * @deprecated use `tagOrDigest`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun tag(tag: String) {
        cdkBuilder.tag(tag)
    }

    /**
     * @param tagOrDigest The image tag or digest to use when pulling the image from ECR (digests
     *   must start with `sha256:`).
     */
    public fun tagOrDigest(tagOrDigest: String) {
        cdkBuilder.tagOrDigest(tagOrDigest)
    }

    /**
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     *   Dockerfile. A WORKDIR allows you to configure the working directory the container will use.
     */
    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): EcrImageCodeProps {
        if (_cmd.isNotEmpty()) cdkBuilder.cmd(_cmd)
        if (_entrypoint.isNotEmpty()) cdkBuilder.entrypoint(_entrypoint)
        return cdkBuilder.build()
    }
}
