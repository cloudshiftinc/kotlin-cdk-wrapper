package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Role
import kotlin.Unit
import kotlin.collections.List

public interface SourceApiOptions {
  /**
   * IAM Role used to validate access to source APIs at runtime and to update the merged API
   * endpoint with the source API changes.
   *
   * Default: - An IAM Role with acccess to source schemas will be created
   */
  public fun mergedApiExecutionRole(): Role? =
      unwrap(this).getMergedApiExecutionRole()?.let(Role::wrap)

  /**
   * Definition of source APIs associated with this Merged API.
   */
  public fun sourceApis(): List<SourceApi>

  /**
   * A builder for [SourceApiOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mergedApiExecutionRole IAM Role used to validate access to source APIs at runtime and
     * to update the merged API endpoint with the source API changes.
     */
    public fun mergedApiExecutionRole(mergedApiExecutionRole: Role)

    /**
     * @param sourceApis Definition of source APIs associated with this Merged API. 
     */
    public fun sourceApis(sourceApis: List<SourceApi>)

    /**
     * @param sourceApis Definition of source APIs associated with this Merged API. 
     */
    public fun sourceApis(vararg sourceApis: SourceApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.SourceApiOptions.Builder =
        software.amazon.awscdk.services.appsync.SourceApiOptions.builder()

    /**
     * @param mergedApiExecutionRole IAM Role used to validate access to source APIs at runtime and
     * to update the merged API endpoint with the source API changes.
     */
    override fun mergedApiExecutionRole(mergedApiExecutionRole: Role) {
      cdkBuilder.mergedApiExecutionRole(mergedApiExecutionRole.let(Role::unwrap))
    }

    /**
     * @param sourceApis Definition of source APIs associated with this Merged API. 
     */
    override fun sourceApis(sourceApis: List<SourceApi>) {
      cdkBuilder.sourceApis(sourceApis.map(SourceApi::unwrap))
    }

    /**
     * @param sourceApis Definition of source APIs associated with this Merged API. 
     */
    override fun sourceApis(vararg sourceApis: SourceApi): Unit = sourceApis(sourceApis.toList())

    public fun build(): software.amazon.awscdk.services.appsync.SourceApiOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.SourceApiOptions,
  ) : SourceApiOptions {
    /**
     * IAM Role used to validate access to source APIs at runtime and to update the merged API
     * endpoint with the source API changes.
     *
     * Default: - An IAM Role with acccess to source schemas will be created
     */
    override fun mergedApiExecutionRole(): Role? =
        unwrap(this).getMergedApiExecutionRole()?.let(Role::wrap)

    /**
     * Definition of source APIs associated with this Merged API.
     */
    override fun sourceApis(): List<SourceApi> = unwrap(this).getSourceApis().map(SourceApi::wrap)
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
