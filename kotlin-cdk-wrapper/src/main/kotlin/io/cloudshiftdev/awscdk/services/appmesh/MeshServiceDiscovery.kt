@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface MeshServiceDiscovery {
  public fun ipPreference(): IpPreference? = unwrap(this).getIpPreference()?.let(IpPreference::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun ipPreference(ipPreference: IpPreference)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.MeshServiceDiscovery.Builder =
        software.amazon.awscdk.services.appmesh.MeshServiceDiscovery.builder()

    override fun ipPreference(ipPreference: IpPreference) {
      cdkBuilder.ipPreference(ipPreference.let(IpPreference::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.MeshServiceDiscovery =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.MeshServiceDiscovery,
  ) : CdkObject(cdkObject), MeshServiceDiscovery {
    override fun ipPreference(): IpPreference? =
        unwrap(this).getIpPreference()?.let(IpPreference::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MeshServiceDiscovery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MeshServiceDiscovery):
        MeshServiceDiscovery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MeshServiceDiscovery):
        software.amazon.awscdk.services.appmesh.MeshServiceDiscovery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.MeshServiceDiscovery
  }
}
