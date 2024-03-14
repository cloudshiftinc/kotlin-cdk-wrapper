package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.awscdk.services.ecr.IRepository as CloudshiftdevAwscdkServicesEcrIRepository
import software.amazon.awscdk.services.ecr.IRepository as AmazonAwscdkServicesEcrIRepository

public open class EcrImageCode internal constructor(
  private val cdkObject: software.amazon.awscdk.services.lambda.EcrImageCode,
) : Code(cdkObject) {
  public override fun bind(_scope: Construct): CodeConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap)).let(CodeConfig::wrap)

  public open fun isInline(): Boolean = unwrap(this).getIsInline()

  public interface Builder {
    public fun cmd(cmd: List<String>)

    public fun entrypoint(entrypoint: List<String>)

    @Deprecated(message = "deprecated in CDK")
    public fun tag(tag: String)

    public fun tagOrDigest(tagOrDigest: String)

    public fun workingDirectory(workingDirectory: String)
  }

  private class BuilderImpl(
    repository: AmazonAwscdkServicesEcrIRepository,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EcrImageCode.Builder =
        software.amazon.awscdk.services.lambda.EcrImageCode.Builder.create(repository)

    override fun cmd(cmd: List<String>) {
      cdkBuilder.cmd(cmd)
    }

    override fun entrypoint(entrypoint: List<String>) {
      cdkBuilder.entrypoint(entrypoint)
    }

    @Deprecated(message = "deprecated in CDK")
    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    override fun tagOrDigest(tagOrDigest: String) {
      cdkBuilder.tagOrDigest(tagOrDigest)
    }

    override fun workingDirectory(workingDirectory: String) {
      cdkBuilder.workingDirectory(workingDirectory)
    }

    public fun build(): software.amazon.awscdk.services.lambda.EcrImageCode = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(repository: CloudshiftdevAwscdkServicesEcrIRepository,
        block: Builder.() -> Unit = {}): EcrImageCode {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesEcrIRepository.unwrap(repository))
      return EcrImageCode(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EcrImageCode): EcrImageCode
        = EcrImageCode(cdkObject)

    internal fun unwrap(wrapped: EcrImageCode): software.amazon.awscdk.services.lambda.EcrImageCode
        = wrapped.cdkObject
  }
}
