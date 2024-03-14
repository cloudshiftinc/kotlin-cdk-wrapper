package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Unit

public interface ClusterEngineBindOptions {
  public fun parameterGroup(): IParameterGroup? =
      unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

  public fun s3ExportRole(): IRole? = unwrap(this).getS3ExportRole()?.let(IRole::wrap)

  public fun s3ImportRole(): IRole? = unwrap(this).getS3ImportRole()?.let(IRole::wrap)

  public interface Builder {
    public fun parameterGroup(parameterGroup: IParameterGroup)

    public fun s3ExportRole(s3ExportRole: IRole)

    public fun s3ImportRole(s3ImportRole: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ClusterEngineBindOptions.Builder =
        software.amazon.awscdk.services.rds.ClusterEngineBindOptions.builder()

    override fun parameterGroup(parameterGroup: IParameterGroup) {
      cdkBuilder.parameterGroup(parameterGroup.let(IParameterGroup::unwrap))
    }

    override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole::unwrap))
    }

    override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.ClusterEngineBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ClusterEngineBindOptions,
  ) : ClusterEngineBindOptions {
    override fun parameterGroup(): IParameterGroup? =
        unwrap(this).getParameterGroup()?.let(IParameterGroup::wrap)

    override fun s3ExportRole(): IRole? = unwrap(this).getS3ExportRole()?.let(IRole::wrap)

    override fun s3ImportRole(): IRole? = unwrap(this).getS3ImportRole()?.let(IRole::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterEngineBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterEngineBindOptions):
        ClusterEngineBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterEngineBindOptions):
        software.amazon.awscdk.services.rds.ClusterEngineBindOptions = (wrapped as
        Wrapper).cdkObject
  }
}
