@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.msk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnClusterPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.msk.*;
 * Object policy;
 * CfnClusterPolicyProps cfnClusterPolicyProps = CfnClusterPolicyProps.builder()
 * .clusterArn("clusterArn")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html)
 */
public interface CfnClusterPolicyProps {
  /**
   * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html#cfn-msk-clusterpolicy-clusterarn)
   */
  public fun clusterArn(): String

  /**
   * Resource policy for the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html#cfn-msk-clusterpolicy-policy)
   */
  public fun policy(): Any

  /**
   * A builder for [CfnClusterPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterArn The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
     */
    public fun clusterArn(clusterArn: String)

    /**
     * @param policy Resource policy for the cluster. 
     */
    public fun policy(policy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.msk.CfnClusterPolicyProps.Builder =
        software.amazon.awscdk.services.msk.CfnClusterPolicyProps.builder()

    /**
     * @param clusterArn The Amazon Resource Name (ARN) that uniquely identifies the cluster. 
     */
    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * @param policy Resource policy for the cluster. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.msk.CfnClusterPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.msk.CfnClusterPolicyProps,
  ) : CdkObject(cdkObject),
      CfnClusterPolicyProps {
    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html#cfn-msk-clusterpolicy-clusterarn)
     */
    override fun clusterArn(): String = unwrap(this).getClusterArn()

    /**
     * Resource policy for the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-clusterpolicy.html#cfn-msk-clusterpolicy-policy)
     */
    override fun policy(): Any = unwrap(this).getPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.msk.CfnClusterPolicyProps):
        CfnClusterPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterPolicyProps):
        software.amazon.awscdk.services.msk.CfnClusterPolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.msk.CfnClusterPolicyProps
  }
}
