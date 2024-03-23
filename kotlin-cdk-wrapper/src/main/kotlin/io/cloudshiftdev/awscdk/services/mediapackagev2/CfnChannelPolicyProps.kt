@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnChannelPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
 * Object policy;
 * CfnChannelPolicyProps cfnChannelPolicyProps = CfnChannelPolicyProps.builder()
 * .channelGroupName("channelGroupName")
 * .channelName("channelName")
 * .policy(policy)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html)
 */
public interface CfnChannelPolicyProps {
  /**
   * The name of the channel group associated with the channel policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-channelgroupname)
   */
  public fun channelGroupName(): String

  /**
   * The name of the channel associated with the channel policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-channelname)
   */
  public fun channelName(): String

  /**
   * The policy associated with the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-policy)
   */
  public fun policy(): Any

  /**
   * A builder for [CfnChannelPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelGroupName The name of the channel group associated with the channel policy. 
     */
    public fun channelGroupName(channelGroupName: String)

    /**
     * @param channelName The name of the channel associated with the channel policy. 
     */
    public fun channelName(channelName: String)

    /**
     * @param policy The policy associated with the channel. 
     */
    public fun policy(policy: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps.builder()

    /**
     * @param channelGroupName The name of the channel group associated with the channel policy. 
     */
    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    /**
     * @param channelName The name of the channel associated with the channel policy. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * @param policy The policy associated with the channel. 
     */
    override fun policy(policy: Any) {
      cdkBuilder.policy(policy)
    }

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps,
  ) : CdkObject(cdkObject), CfnChannelPolicyProps {
    /**
     * The name of the channel group associated with the channel policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-channelgroupname)
     */
    override fun channelGroupName(): String = unwrap(this).getChannelGroupName()

    /**
     * The name of the channel associated with the channel policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-channelname)
     */
    override fun channelName(): String = unwrap(this).getChannelName()

    /**
     * The policy associated with the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-channelpolicy.html#cfn-mediapackagev2-channelpolicy-policy)
     */
    override fun policy(): Any = unwrap(this).getPolicy()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps):
        CfnChannelPolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnChannelPolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelPolicyProps):
        software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediapackagev2.CfnChannelPolicyProps
  }
}
