@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.awscdk.services.ecr.IRepository as CloudshiftdevAwscdkServicesEcrIRepository
import software.amazon.awscdk.services.ecr.IRepository as AmazonAwscdkServicesEcrIRepository

/**
 * Represents a Docker image in ECR that can be bound as Lambda Code.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecr.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
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
public open class EcrImageCode(
  cdkObject: software.amazon.awscdk.services.lambda.EcrImageCode,
) : Code(cdkObject) {
  public constructor(repository: CloudshiftdevAwscdkServicesEcrIRepository) :
      this(software.amazon.awscdk.services.lambda.EcrImageCode(repository.let(CloudshiftdevAwscdkServicesEcrIRepository::unwrap))
  )

  public constructor(repository: CloudshiftdevAwscdkServicesEcrIRepository,
      props: EcrImageCodeProps) :
      this(software.amazon.awscdk.services.lambda.EcrImageCode(repository.let(CloudshiftdevAwscdkServicesEcrIRepository::unwrap),
      props.let(EcrImageCodeProps::unwrap))
  )

  public constructor(repository: CloudshiftdevAwscdkServicesEcrIRepository,
      props: EcrImageCodeProps.Builder.() -> Unit) : this(repository, EcrImageCodeProps(props)
  )

  /**
   * Called when the lambda or layer is initialized to allow this object to bind to the stack, add
   * resources and have fun.
   *
   * @param _scope 
   */
  public override fun bind(scope: Construct): CodeConfig =
      unwrap(this).bind(scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  /**
   * Determines whether this Code is inline code or not.
   */
  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.EcrImageCode].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile. 
     */
    public fun cmd(cmd: List<String>)

    /**
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile. 
     */
    public fun cmd(vararg cmd: String)

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile. 
     */
    public fun entrypoint(entrypoint: List<String>)

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile. 
     */
    public fun entrypoint(vararg entrypoint: String)

    /**
     * (deprecated) The image tag to use when pulling the image from ECR.
     *
     * Default: 'latest'
     *
     * @deprecated use `tagOrDigest`
     * @param tag The image tag to use when pulling the image from ECR. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun tag(tag: String)

    /**
     * The image tag or digest to use when pulling the image from ECR (digests must start with
     * `sha256:`).
     *
     * Default: 'latest'
     *
     * @param tagOrDigest The image tag or digest to use when pulling the image from ECR (digests
     * must start with `sha256:`). 
     */
    public fun tagOrDigest(tagOrDigest: String)

    /**
     * Specify or override the WORKDIR on the specified Docker image or Dockerfile.
     *
     * A WORKDIR allows you to configure the working directory the container will use.
     *
     * Default: - use the WORKDIR in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#workdir)
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     * Dockerfile. 
     */
    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl(
    repository: AmazonAwscdkServicesEcrIRepository,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EcrImageCode.Builder =
        software.amazon.awscdk.services.lambda.EcrImageCode.Builder.create(repository)

    /**
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile. 
     */
    override fun cmd(cmd: List<String>) {
      cdkBuilder.cmd(cmd)
    }

    /**
     * Specify or override the CMD on the specified Docker image or Dockerfile.
     *
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the CMD specified in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#cmd)
     * @param cmd Specify or override the CMD on the specified Docker image or Dockerfile. 
     */
    override fun cmd(vararg cmd: String): Unit = cmd(cmd.toList())

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile. 
     */
    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    /**
     * Specify or override the ENTRYPOINT on the specified Docker image or Dockerfile.
     *
     * An ENTRYPOINT allows you to configure a container that will run as an executable.
     * This needs to be in the 'exec form', viz., `[ 'executable', 'param1', 'param2' ]`.
     *
     * Default: - use the ENTRYPOINT in the docker image or Dockerfile.
     *
     * [Documentation](https://docs.docker.com/engine/reference/builder/#entrypoint)
     * @param entrypoint Specify or override the ENTRYPOINT on the specified Docker image or
     * Dockerfile. 
     */
    override fun entrypoint(vararg entrypoint: String): Unit = entrypoint(entrypoint.toList())

    /**
     * (deprecated) The image tag to use when pulling the image from ECR.
     *
     * Default: 'latest'
     *
     * @deprecated use `tagOrDigest`
     * @param tag The image tag to use when pulling the image from ECR. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    /**
     * The image tag or digest to use when pulling the image from ECR (digests must start with
     * `sha256:`).
     *
     * Default: 'latest'
     *
     * @param tagOrDigest The image tag or digest to use when pulling the image from ECR (digests
     * must start with `sha256:`). 
     */
    override fun tagOrDigest(tagOrDigest: String) {
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
     * @param workingDirectory Specify or override the WORKDIR on the specified Docker image or
     * Dockerfile. 
     */
    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EcrImageCode = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(repository: CloudshiftdevAwscdkServicesEcrIRepository,
        block: Builder.() -> Unit = {}): EcrImageCode {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesEcrIRepository.unwrap(repository))
      return EcrImageCode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EcrImageCode): EcrImageCode
        = EcrImageCode(cdkObject)

    internal fun unwrap(wrapped: EcrImageCode): software.amazon.awscdk.services.lambda.EcrImageCode
        = wrapped.cdkObject as software.amazon.awscdk.services.lambda.EcrImageCode
  }
}
