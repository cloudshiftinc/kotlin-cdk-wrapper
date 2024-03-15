@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface AlbControllerOptions {
  public fun policy(): Any? = unwrap(this).getPolicy()

  public fun repository(): String? = unwrap(this).getRepository()

  public fun version(): AlbControllerVersion

  @CdkDslMarker
  public interface Builder {
    public fun policy(policy: Any)

    public fun repository(repository: String)

    public fun version(version: AlbControllerVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AlbControllerOptions.Builder =
        software.amazon.awscdk.services.eks.AlbControllerOptions.builder()

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    override fun version(version: AlbControllerVersion) {
      cdkBuilder.version(version.let(AlbControllerVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AlbControllerOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.AlbControllerOptions,
  ) : CdkObject(cdkObject), AlbControllerOptions {
    override fun policy(): Any? = unwrap(this).getPolicy()

    override fun repository(): String? = unwrap(this).getRepository()

    override fun version(): AlbControllerVersion =
        unwrap(this).getVersion().let(AlbControllerVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlbControllerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AlbControllerOptions):
        AlbControllerOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlbControllerOptions):
        software.amazon.awscdk.services.eks.AlbControllerOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.AlbControllerOptions
  }
}
