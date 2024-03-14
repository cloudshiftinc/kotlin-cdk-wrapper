package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit

public interface InstanceEngineBindOptions {
  public fun domain(): String? = unwrap(this).getDomain()

  public fun optionGroup(): IOptionGroup? = unwrap(this).getOptionGroup()?.let(IOptionGroup::wrap)

  public fun s3ExportRole(): IRole? = unwrap(this).getS3ExportRole()?.let(IRole::wrap)

  public fun s3ImportRole(): IRole? = unwrap(this).getS3ImportRole()?.let(IRole::wrap)

  public fun timezone(): String? = unwrap(this).getTimezone()

  public interface Builder {
    public fun domain(domain: String) {
    }

    public fun optionGroup(optionGroup: IOptionGroup) {
    }

    public fun s3ExportRole(s3ExportRole: IRole) {
    }

    public fun s3ImportRole(s3ImportRole: IRole) {
    }

    public fun timezone(timezone: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.InstanceEngineBindOptions.Builder =
        software.amazon.awscdk.services.rds.InstanceEngineBindOptions.builder()

    public override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    public override fun optionGroup(optionGroup: IOptionGroup) {
      cdkBuilder.optionGroup(optionGroup.let(IOptionGroup::unwrap))
    }

    public override fun s3ExportRole(s3ExportRole: IRole) {
      cdkBuilder.s3ExportRole(s3ExportRole.let(IRole::unwrap))
    }

    public override fun s3ImportRole(s3ImportRole: IRole) {
      cdkBuilder.s3ImportRole(s3ImportRole.let(IRole::unwrap))
    }

    public override fun timezone(timezone: String) {
      cdkBuilder.timezone(timezone)
    }

    public fun build(): software.amazon.awscdk.services.rds.InstanceEngineBindOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.InstanceEngineBindOptions,
  ) : InstanceEngineBindOptions {
    public override fun domain(): String? = unwrap(this).getDomain()

    public override fun optionGroup(): IOptionGroup? =
        unwrap(this).getOptionGroup()?.let(IOptionGroup::wrap)

    public override fun s3ExportRole(): IRole? = unwrap(this).getS3ExportRole()?.let(IRole::wrap)

    public override fun s3ImportRole(): IRole? = unwrap(this).getS3ImportRole()?.let(IRole::wrap)

    public override fun timezone(): String? = unwrap(this).getTimezone()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceEngineBindOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.InstanceEngineBindOptions):
        InstanceEngineBindOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceEngineBindOptions):
        software.amazon.awscdk.services.rds.InstanceEngineBindOptions = (wrapped as
        Wrapper).cdkObject
  }
}
