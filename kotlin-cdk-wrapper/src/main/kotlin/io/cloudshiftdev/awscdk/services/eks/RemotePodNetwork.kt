@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Network configuration of pods run on-premises with EKS Hybrid Nodes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * RemotePodNetwork remotePodNetwork = RemotePodNetwork.builder()
 * .cidrs(List.of("cidrs"))
 * .build();
 * ```
 */
public interface RemotePodNetwork {
  /**
   * Specifies the list of remote pod CIDRs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-remotepodnetwork.html#cfn-eks-cluster-remotepodnetwork-cidrs)
   */
  public fun cidrs(): List<String>

  /**
   * A builder for [RemotePodNetwork]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrs Specifies the list of remote pod CIDRs. 
     */
    public fun cidrs(cidrs: List<String>)

    /**
     * @param cidrs Specifies the list of remote pod CIDRs. 
     */
    public fun cidrs(vararg cidrs: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.RemotePodNetwork.Builder =
        software.amazon.awscdk.services.eks.RemotePodNetwork.builder()

    /**
     * @param cidrs Specifies the list of remote pod CIDRs. 
     */
    override fun cidrs(cidrs: List<String>) {
      cdkBuilder.cidrs(cidrs)
    }

    /**
     * @param cidrs Specifies the list of remote pod CIDRs. 
     */
    override fun cidrs(vararg cidrs: String): Unit = cidrs(cidrs.toList())

    public fun build(): software.amazon.awscdk.services.eks.RemotePodNetwork = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.RemotePodNetwork,
  ) : CdkObject(cdkObject),
      RemotePodNetwork {
    /**
     * Specifies the list of remote pod CIDRs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-remotepodnetwork.html#cfn-eks-cluster-remotepodnetwork-cidrs)
     */
    override fun cidrs(): List<String> = unwrap(this).getCidrs()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RemotePodNetwork {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.RemotePodNetwork):
        RemotePodNetwork = CdkObjectWrappers.wrap(cdkObject) as? RemotePodNetwork ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RemotePodNetwork):
        software.amazon.awscdk.services.eks.RemotePodNetwork = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.RemotePodNetwork
  }
}
