package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface EcrImageCodeProps {
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
   * (deprecated) The image tag to use when pulling the image from ECR.
   *
   * Default: 'latest'
   *
   * @deprecated use `tagOrDigest`
   */
  @Deprecated(message = "deprecated in CDK")
  public fun tag(): String? = unwrap(this).getTag()

  /**
   * The image tag or digest to use when pulling the image from ECR (digests must start with
   * `sha256:`).
   *
   * Default: 'latest'
   */
  public fun tagOrDigest(): String? = unwrap(this).getTagOrDigest()

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
   * A builder for [EcrImageCodeProps]
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
     * @param tag The image tag to use when pulling the image from ECR.
     * @deprecated use `tagOrDigest`
     */
    @Deprecated(message = "deprecated in CDK")
    public fun tag(tag: String)

    /**
     * @param tagOrDigest The image tag or digest to use when pulling the image from ECR (digests
     * must start with `sha256:`).
     */
    public fun tagOrDigest(tagOrDigest: String)

    /**
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     * Dockerfile.
     * A WORKDIR allows you to configure the working directory the container will use.
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EcrImageCodeProps.Builder =
        software.amazon.awscdk.services.lambda.EcrImageCodeProps.builder()

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
     * @param tag The image tag to use when pulling the image from ECR.
     * @deprecated use `tagOrDigest`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    /**
     * @param tagOrDigest The image tag or digest to use when pulling the image from ECR (digests
     * must start with `sha256:`).
     */
    override fun tagOrDigest(tagOrDigest: String) {
      cdkBuilder.tagOrDigest(tagOrDigest)
    }

    /**
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     * Dockerfile.
     * A WORKDIR allows you to configure the working directory the container will use.
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EcrImageCodeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.EcrImageCodeProps,
  ) : CdkObject(cdkObject), EcrImageCodeProps {
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
     * (deprecated) The image tag to use when pulling the image from ECR.
     *
     * Default: 'latest'
     *
     * @deprecated use `tagOrDigest`
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tag(): String? = unwrap(this).getTag()

    /**
     * The image tag or digest to use when pulling the image from ECR (digests must start with
     * `sha256:`).
     *
     * Default: 'latest'
     */
    override fun tagOrDigest(): String? = unwrap(this).getTagOrDigest()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): EcrImageCodeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EcrImageCodeProps):
        EcrImageCodeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcrImageCodeProps):
        software.amazon.awscdk.services.lambda.EcrImageCodeProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lambda.EcrImageCodeProps
  }
}
