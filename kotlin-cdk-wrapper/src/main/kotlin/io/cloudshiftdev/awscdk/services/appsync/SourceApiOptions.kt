@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.Role
import kotlin.Unit
import kotlin.collections.List

public interface SourceApiOptions {
  public fun mergedApiExecutionRole(): Role? =
      unwrap(this).getMergedApiExecutionRole()?.let(Role::wrap)

  public fun sourceApis(): List<SourceApi>

  @CdkDslMarker
  public interface Builder {
    public fun mergedApiExecutionRole(mergedApiExecutionRole: Role)

    public fun sourceApis(sourceApis: List<SourceApi>)

    public fun sourceApis(vararg sourceApis: SourceApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SourceApiOptions.Builder =
        software.amazon.awscdk.services.appsync.SourceApiOptions.builder()

    override fun mergedApiExecutionRole(mergedApiExecutionRole: Role) {
      cdkBuilder.mergedApiExecutionRole(mergedApiExecutionRole.let(Role::unwrap))
    }

    override fun sourceApis(sourceApis: List<SourceApi>) {
      cdkBuilder.sourceApis(sourceApis.map(SourceApi::unwrap))
    }

    override fun sourceApis(vararg sourceApis: SourceApi): Unit = sourceApis(sourceApis.toList())

    public fun build(): software.amazon.awscdk.services.appsync.SourceApiOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.SourceApiOptions,
  ) : CdkObject(cdkObject), SourceApiOptions {
    override fun mergedApiExecutionRole(): Role? =
        unwrap(this).getMergedApiExecutionRole()?.let(Role::wrap)

    override fun sourceApis(): List<SourceApi> = unwrap(this).getSourceApis().map(SourceApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SourceApiOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.SourceApiOptions):
        SourceApiOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceApiOptions):
        software.amazon.awscdk.services.appsync.SourceApiOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.SourceApiOptions
  }
}
