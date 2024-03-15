@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecr.assets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface DockerCacheOption {
  public fun params(): Map<String, String> = unwrap(this).getParams() ?: emptyMap()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun params(params: Map<String, String>)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecr.assets.DockerCacheOption.Builder =
        software.amazon.awscdk.services.ecr.assets.DockerCacheOption.builder()

    override fun params(params: Map<String, String>) {
      cdkBuilder.params(params)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ecr.assets.DockerCacheOption =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecr.assets.DockerCacheOption,
  ) : CdkObject(cdkObject), DockerCacheOption {
    override fun params(): Map<String, String> = unwrap(this).getParams() ?: emptyMap()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerCacheOption {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecr.assets.DockerCacheOption):
        DockerCacheOption = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerCacheOption):
        software.amazon.awscdk.services.ecr.assets.DockerCacheOption = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecr.assets.DockerCacheOption
  }
}
