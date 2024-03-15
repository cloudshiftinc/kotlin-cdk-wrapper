@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface ServiceAccountProps : ServiceAccountOptions {
  public fun cluster(): ICluster

  @CdkDslMarker
  public interface Builder {
    public fun annotations(annotations: Map<String, String>)

    public fun cluster(cluster: ICluster)

    public fun labels(labels: Map<String, String>)

    public fun name(name: String)

    public fun namespace(namespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.ServiceAccountProps.Builder =
        software.amazon.awscdk.services.eks.ServiceAccountProps.builder()

    override fun annotations(annotations: Map<String, String>) {
      cdkBuilder.annotations(annotations)
    }

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    public fun build(): software.amazon.awscdk.services.eks.ServiceAccountProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.ServiceAccountProps,
  ) : CdkObject(cdkObject), ServiceAccountProps {
    override fun annotations(): Map<String, String> = unwrap(this).getAnnotations() ?: emptyMap()

    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)

    override fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

    override fun name(): String? = unwrap(this).getName()

    override fun namespace(): String? = unwrap(this).getNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServiceAccountProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.ServiceAccountProps):
        ServiceAccountProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServiceAccountProps):
        software.amazon.awscdk.services.eks.ServiceAccountProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.ServiceAccountProps
  }
}
