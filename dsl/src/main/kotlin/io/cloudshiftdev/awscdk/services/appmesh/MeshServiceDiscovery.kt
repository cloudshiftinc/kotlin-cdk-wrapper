package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Unit

public interface MeshServiceDiscovery {
  public fun ipPreference(): IpPreference? = unwrap(this).getIpPreference()?.let(IpPreference::wrap)

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.MeshServiceDiscovery,
  ) : MeshServiceDiscovery {
    override fun ipPreference(): IpPreference? =
        unwrap(this).getIpPreference()?.let(IpPreference::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): MeshServiceDiscovery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MeshServiceDiscovery):
        MeshServiceDiscovery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MeshServiceDiscovery):
        software.amazon.awscdk.services.appmesh.MeshServiceDiscovery = (wrapped as
        Wrapper).cdkObject
  }
}
