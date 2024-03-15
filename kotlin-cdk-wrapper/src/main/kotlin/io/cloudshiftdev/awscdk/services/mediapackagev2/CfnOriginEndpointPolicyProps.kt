@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnOriginEndpointPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
 * Object policy;
 * CfnOriginEndpointPolicyProps cfnOriginEndpointPolicyProps =
 * CfnOriginEndpointPolicyProps.builder()
 * .channelGroupName("channelGroupName")
 * .channelName("channelName")
 * .originEndpointName("originEndpointName")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html)
 */
public interface CfnOriginEndpointPolicyProps {
  /**
   * The name of the channel group associated with the origin endpoint policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-channelgroupname)
   */
  public fun channelGroupName(): String

  /**
   * The channel name associated with the origin endpoint policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-channelname)
   */
  public fun channelName(): String

  /**
   * The name of the origin endpoint associated with the origin endpoint policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-originendpointname)
   */
  public fun originEndpointName(): String

  /**
   * The policy associated with the origin endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-policy)
   */
  public fun policy(): Any

  /**
   * A builder for [CfnOriginEndpointPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelGroupName The name of the channel group associated with the origin endpoint
     * policy. 
     */
    public fun channelGroupName(channelGroupName: String)

    /**
     * @param channelName The channel name associated with the origin endpoint policy. 
     */
    public fun channelName(channelName: String)

    /**
     * @param originEndpointName The name of the origin endpoint associated with the origin endpoint
     * policy. 
     */
    public fun originEndpointName(originEndpointName: String)

    /**
     * @param policy The policy associated with the origin endpoint. 
     */
    public fun policy(policy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps.builder()

    /**
     * @param channelGroupName The name of the channel group associated with the origin endpoint
     * policy. 
     */
    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    /**
     * @param channelName The channel name associated with the origin endpoint policy. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * @param originEndpointName The name of the origin endpoint associated with the origin endpoint
     * policy. 
     */
    override fun originEndpointName(originEndpointName: String) {
      cdkBuilder.originEndpointName(originEndpointName)
    }

    /**
     * @param policy The policy associated with the origin endpoint. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps,
  ) : CdkObject(cdkObject), CfnOriginEndpointPolicyProps {
    /**
     * The name of the channel group associated with the origin endpoint policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-channelgroupname)
     */
    override fun channelGroupName(): String = unwrap(this).getChannelGroupName()

    /**
     * The channel name associated with the origin endpoint policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-channelname)
     */
    override fun channelName(): String = unwrap(this).getChannelName()

    /**
     * The name of the origin endpoint associated with the origin endpoint policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-originendpointname)
     */
    override fun originEndpointName(): String = unwrap(this).getOriginEndpointName()

    /**
     * The policy associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpointpolicy.html#cfn-mediapackagev2-originendpointpolicy-policy)
     */
    override fun policy(): Any = unwrap(this).getPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOriginEndpointPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps):
        CfnOriginEndpointPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOriginEndpointPolicyProps):
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointPolicyProps
  }
}
