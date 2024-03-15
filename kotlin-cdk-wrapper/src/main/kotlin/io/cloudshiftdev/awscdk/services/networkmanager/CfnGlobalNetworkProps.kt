@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnGlobalNetwork`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkmanager.*;
 * CfnGlobalNetworkProps cfnGlobalNetworkProps = CfnGlobalNetworkProps.builder()
 * .createdAt("createdAt")
 * .description("description")
 * .state("state")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html)
 */
public interface CfnGlobalNetworkProps {
  /**
   * The date and time that the global network was created.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-createdat)
   */
  public fun createdAt(): String? = unwrap(this).getCreatedAt()

  /**
   * A description of the global network.
   *
   * Constraints: Maximum length of 256 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The state of the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-state)
   */
  public fun state(): String? = unwrap(this).getState()

  /**
   * The tags for the global network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnGlobalNetworkProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param createdAt The date and time that the global network was created.
     */
    public fun createdAt(createdAt: String)

    /**
     * @param description A description of the global network.
     * Constraints: Maximum length of 256 characters.
     */
    public fun description(description: String)

    /**
     * @param state The state of the global network.
     */
    public fun state(state: String)

    /**
     * @param tags The tags for the global network.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the global network.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps.Builder =
        software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps.builder()

    /**
     * @param createdAt The date and time that the global network was created.
     */
    override fun createdAt(createdAt: String) {
      cdkBuilder.createdAt(createdAt)
    }

    /**
     * @param description A description of the global network.
     * Constraints: Maximum length of 256 characters.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param state The state of the global network.
     */
    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    /**
     * @param tags The tags for the global network.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the global network.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps,
  ) : CdkObject(cdkObject), CfnGlobalNetworkProps {
    /**
     * The date and time that the global network was created.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-createdat)
     */
    override fun createdAt(): String? = unwrap(this).getCreatedAt()

    /**
     * A description of the global network.
     *
     * Constraints: Maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The state of the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-state)
     */
    override fun state(): String? = unwrap(this).getState()

    /**
     * The tags for the global network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-globalnetwork.html#cfn-networkmanager-globalnetwork-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGlobalNetworkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps):
        CfnGlobalNetworkProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalNetworkProps):
        software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.networkmanager.CfnGlobalNetworkProps
  }
}
