package io.cloudshiftdev.awscdk.services.eks

import kotlin.Any
import kotlin.String
import kotlin.Unit

public interface AlbControllerProps : AlbControllerOptions {
  public fun cluster(): Cluster

  public interface Builder {
    public fun cluster(cluster: Cluster)

    public fun policy(policy: Any)

    public fun repository(repository: String)

    public fun version(version: AlbControllerVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AlbControllerProps.Builder =
        software.amazon.awscdk.services.eks.AlbControllerProps.builder()

    override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster::unwrap))
    }

    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    override fun repository(repository: String) {
      cdkBuilder.repository(repository)
    }

    override fun version(version: AlbControllerVersion) {
      cdkBuilder.version(version.let(AlbControllerVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AlbControllerProps = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.eks.AlbControllerProps,
  ) : AlbControllerProps {
    override fun cluster(): Cluster = unwrap(this).getCluster().let(Cluster::wrap)

    override fun policy(): Any? = unwrap(this).getPolicy()

    override fun repository(): String? = unwrap(this).getRepository()

    override fun version(): AlbControllerVersion =
        unwrap(this).getVersion().let(AlbControllerVersion::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AlbControllerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AlbControllerProps):
        AlbControllerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlbControllerProps):
        software.amazon.awscdk.services.eks.AlbControllerProps = (wrapped as Wrapper).cdkObject
  }
}
