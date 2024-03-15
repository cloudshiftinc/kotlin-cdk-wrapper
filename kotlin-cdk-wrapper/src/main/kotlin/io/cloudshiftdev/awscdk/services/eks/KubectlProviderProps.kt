@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Properties for a KubectlProvider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * Cluster cluster;
 * KubectlProviderProps kubectlProviderProps = KubectlProviderProps.builder()
 * .cluster(cluster)
 * .build();
 * ```
 */
public interface KubectlProviderProps {
  /**
   * The cluster to control.
   */
  public fun cluster(): ICluster

  /**
   * A builder for [KubectlProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cluster The cluster to control. 
     */
    public fun cluster(cluster: ICluster)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.KubectlProviderProps.Builder =
        software.amazon.awscdk.services.eks.KubectlProviderProps.builder()

    /**
     * @param cluster The cluster to control. 
     */
    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.eks.KubectlProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.KubectlProviderProps,
  ) : CdkObject(cdkObject), KubectlProviderProps {
    /**
     * The cluster to control.
     */
    override fun cluster(): ICluster = unwrap(this).getCluster().let(ICluster::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KubectlProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubectlProviderProps):
        KubectlProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KubectlProviderProps):
        software.amazon.awscdk.services.eks.KubectlProviderProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.KubectlProviderProps
  }
}
