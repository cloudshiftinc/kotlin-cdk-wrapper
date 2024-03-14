package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.services.iam.Role
import kotlin.Unit
import kotlin.collections.List

public interface SourceApiOptions {
  public fun mergedApiExecutionRole(): Role? =
      unwrap(this).getMergedApiExecutionRole()?.let(Role::wrap)

  public fun sourceApis(): List<SourceApi>

  public interface Builder {
    public fun mergedApiExecutionRole(mergedApiExecutionRole: Role) {
    }

    public fun sourceApis(sourceApis: List<SourceApi>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SourceApiOptions.Builder =
        software.amazon.awscdk.services.appsync.SourceApiOptions.builder()

    public override fun mergedApiExecutionRole(mergedApiExecutionRole: Role) {
      cdkBuilder.mergedApiExecutionRole(mergedApiExecutionRole.let(Role::unwrap))
    }

    public override fun sourceApis(sourceApis: List<SourceApi>) {
      cdkBuilder.sourceApis(sourceApis.map(SourceApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appsync.SourceApiOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.SourceApiOptions,
  ) : SourceApiOptions {
    public override fun mergedApiExecutionRole(): Role? =
        unwrap(this).getMergedApiExecutionRole()?.let(Role::wrap)

    public override fun sourceApis(): List<SourceApi> =
        unwrap(this).getSourceApis().map(SourceApi::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SourceApiOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApiOptions):
        SourceApiOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceApiOptions):
        software.amazon.awscdk.services.appsync.SourceApiOptions = (wrapped as Wrapper).cdkObject
  }
}
