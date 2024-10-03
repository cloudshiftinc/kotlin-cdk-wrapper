@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Result of the bind when an ECR image is used.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * CodeImageConfig codeImageConfig = CodeImageConfig.builder()
 * .imageUri("imageUri")
 * // the properties below are optional
 * .cmd(List.of("cmd"))
 * .entrypoint(List.of("entrypoint"))
 * .workingDirectory("workingDirectory")
 * .build();
 * ```
 */
public interface CodeImageConfig {
  /**
   * Specify or override the CMD on the specified Docker image or Dockerfile.
   *
   * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
   *
   * Default: - use the CMD specified in the docker image or Dockerfile.
   *
   * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
   */
  public fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

  /**
   * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
   *
   * An ENTRYPOINT allows you to configure a container that will run as an executable.
   * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
   *
   * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
   *
   * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
   */
  public fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

  /**
   * URI to the Docker image.
   */
  public fun imageUri(): String

  /**
   * Specify or override the WORKDIR on the specified Docker image or Dockerfile.
   *
   * A WORKDIR allows you to configure the working directory the container will use.
   *
   * Default: - use the WORKDIR in the docker image or Dockerfile.
   *
   * [Documentation](https://docs.docker.com/engine/reference/builder/#workdir)
   */
  public fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()

  /**
   * A builder for [CodeImageConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    public fun cmd(cmd: List<String>)

    /**
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    public fun cmd(vararg cmd: String)

    /**
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile.
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    public fun entrypoint(entrypoint: List<String>)

    /**
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile.
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    public fun entrypoint(vararg entrypoint: String)

    /**
     * @param imageUri URI to the Docker image. 
     */
    public fun imageUri(imageUri: String)

    /**
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     * Dockerfile.
     * A WORKDIR allows you to configure the working directory the container will use.
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CodeImageConfig.Builder =
        software.amazon.awscdk.services.lambda.CodeImageConfig.builder()

    /**
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    override fun cmd(cmd: List<String>) {
      cdkBuilder.cmd(cmd)
    }

    /**
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    override fun cmd(vararg cmd: String): Unit = cmd(cmd.toList())

    /**
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile.
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    /**
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile.
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     */
    override fun entrypoint(vararg entrypoint: String): Unit = entrypoint(entrypoint.toList())

    /**
     * @param imageUri URI to the Docker image. 
     */
    override fun imageUri(imageUri: String) {
      cdkBuilder.imageUri(imageUri)
    }

    /**
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     * Dockerfile.
     * A WORKDIR allows you to configure the working directory the container will use.
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CodeImageConfig = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.CodeImageConfig,
  ) : CdkObject(cdkObject),
      CodeImageConfig {
    /**
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     */
    override fun cmd(): List<String> = unwrap(this).getCmd() ?: emptyList()

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     */
    override fun entrypoint(): List<String> = unwrap(this).getEntrypoint() ?: emptyList()

    /**
     * URI to the Docker image.
     */
    override fun imageUri(): String = unwrap(this).getImageUri()

    /**
     * Specify or override the WORKDIR on the specified Docker image or Dockerfile.
     *
     * A WORKDIR allows you to configure the working directory the container will use.
     *
     * Default: - use the WORKDIR in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#workdir)
     */
    override fun workingDirectory(): String? = unwrap(this).getWorkingDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeImageConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CodeImageConfig):
        CodeImageConfig = CdkObjectWrappers.wrap(cdkObject) as? CodeImageConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeImageConfig):
        software.amazon.awscdk.services.lambda.CodeImageConfig = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.CodeImageConfig
  }
}
