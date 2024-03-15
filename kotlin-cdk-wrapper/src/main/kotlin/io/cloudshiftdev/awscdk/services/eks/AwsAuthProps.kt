@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface AwsAuthProps {
  public fun cluster(): Cluster

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: Cluster)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.AwsAuthProps.Builder =
        software.amazon.awscdk.services.eks.AwsAuthProps.builder()

    override fun cluster(cluster: Cluster) {
      cdkBuilder.cluster(cluster.let(Cluster::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.AwsAuthProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.AwsAuthProps,
  ) : CdkObject(cdkObject), AwsAuthProps {
    override fun cluster(): Cluster = unwrap(this).getCluster().let(Cluster::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsAuthProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AwsAuthProps): AwsAuthProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsAuthProps): software.amazon.awscdk.services.eks.AwsAuthProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.AwsAuthProps
  }
}
