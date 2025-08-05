@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Network configuration of nodes run on-premises with EKS Hybrid Nodes.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * RemoteNodeNetwork remoteNodeNetwork = RemoteNodeNetwork.builder()
 * .cidrs(List.of("cidrs"))
 * .build();
 * ```
 */
public interface RemoteNodeNetwork {
  /**
   * Specifies the list of remote node CIDRs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-remotenodenetwork.html#cfn-eks-cluster-remotenodenetwork-cidrs)
   */
  public fun cidrs(): List<String>

  /**
   * A builder for [RemoteNodeNetwork]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidrs Specifies the list of remote node CIDRs. 
     */
    public fun cidrs(cidrs: List<String>)

    /**
     * @param cidrs Specifies the list of remote node CIDRs. 
     */
    public fun cidrs(vararg cidrs: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.RemoteNodeNetwork.Builder =
        software.amazon.awscdk.services.eks.RemoteNodeNetwork.builder()

    /**
     * @param cidrs Specifies the list of remote node CIDRs. 
     */
    override fun cidrs(cidrs: List<String>) {
      cdkBuilder.cidrs(cidrs)
    }

    /**
     * @param cidrs Specifies the list of remote node CIDRs. 
     */
    override fun cidrs(vararg cidrs: String): Unit = cidrs(cidrs.toList())

    public fun build(): software.amazon.awscdk.services.eks.RemoteNodeNetwork = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.RemoteNodeNetwork,
  ) : CdkObject(cdkObject),
      RemoteNodeNetwork {
    /**
     * Specifies the list of remote node CIDRs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-remotenodenetwork.html#cfn-eks-cluster-remotenodenetwork-cidrs)
     */
    override fun cidrs(): List<String> = unwrap(this).getCidrs()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RemoteNodeNetwork {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.RemoteNodeNetwork):
        RemoteNodeNetwork = CdkObjectWrappers.wrap(cdkObject) as? RemoteNodeNetwork ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RemoteNodeNetwork):
        software.amazon.awscdk.services.eks.RemoteNodeNetwork = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.eks.RemoteNodeNetwork
  }
}
