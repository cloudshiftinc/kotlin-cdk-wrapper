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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecr.IRepository
import software.amazon.awscdk.services.lambda.EcrImageCode

/**
 * Represents a Docker image in ECR that can be bound as Lambda Code.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.*;
 * import software.amazon.awscdk.services.lambda.*;
 * Repository repository;
 * EcrImageCode ecrImageCode = EcrImageCode.Builder.create(repository)
 * .cmd(List.of("cmd"))
 * .entrypoint(List.of("entrypoint"))
 * .tag("tag")
 * .tagOrDigest("tagOrDigest")
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 */
@CdkDslMarker
public class EcrImageCodeDsl(
    repository: IRepository,
) {
    private val cdkBuilder: EcrImageCode.Builder = EcrImageCode.Builder.create(repository)

    private val _cmd: MutableList<String> = mutableListOf()

    private val _entrypoint: MutableList<String> = mutableListOf()

    /**
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     *
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile.
     */
    public fun cmd(vararg cmd: String) {
        _cmd.addAll(listOf(*cmd))
    }

    /**
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     *
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile.
     */
    public fun cmd(cmd: Collection<String>) {
        _cmd.addAll(cmd)
    }

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable. This needs
     * to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     *
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     *   Dockerfile.
     */
    public fun entrypoint(vararg entrypoint: String) {
        _entrypoint.addAll(listOf(*entrypoint))
    }

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable. This needs
     * to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     *
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     *   Dockerfile.
     */
    public fun entrypoint(entrypoint: Collection<String>) {
        _entrypoint.addAll(entrypoint)
    }

    /**
     * (deprecated) The image tag to use when pulling the image from ECR.
     *
     * Default: 'latest'
     *
     * @param tag The image tag to use when pulling the image from ECR.
     * @deprecated use `tagOrDigest`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun tag(tag: String) {
        cdkBuilder.tag(tag)
    }

    /**
     * The image tag or digest to use when pulling the image from ECR (digests must start with
     * `sha256:`).
     *
     * Default: 'latest'
     *
     * @param tagOrDigest The image tag or digest to use when pulling the image from ECR (digests
     *   must start with `sha256:`).
     */
    public fun tagOrDigest(tagOrDigest: String) {
        cdkBuilder.tagOrDigest(tagOrDigest)
    }

    /**
     * Specify or override the WORKDIR on the specified Docker image or Dockerfile.
     *
     * A WORKDIR allows you to configure the working directory the container will use.
     *
     * Default: - use the WORKDIR in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#workdir)
     *
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     *   Dockerfile.
     */
    public fun workingDirectory(workingDirectory: String) {
        cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): EcrImageCode {
        if (_cmd.isNotEmpty()) cdkBuilder.cmd(_cmd)
        if (_entrypoint.isNotEmpty()) cdkBuilder.entrypoint(_entrypoint)
        return cdkBuilder.build()
    }
}
