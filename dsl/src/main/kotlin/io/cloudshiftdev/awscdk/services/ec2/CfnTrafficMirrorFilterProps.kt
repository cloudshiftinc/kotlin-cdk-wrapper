package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrafficMirrorFilterProps {
  /**
   * The description of the Traffic Mirror filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The network service traffic that is associated with the Traffic Mirror filter.
   *
   * Valid values are `amazon-dns` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-networkservices)
   */
  public fun networkServices(): List<String> = unwrap(this).getNetworkServices() ?: emptyList()

  /**
   * The tags to assign to a Traffic Mirror filter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnTrafficMirrorFilterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the Traffic Mirror filter.
     */
    public fun description(description: String)

    /**
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     * filter.
     * Valid values are `amazon-dns` .
     */
    public fun networkServices(networkServices: List<String>)

    /**
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     * filter.
     * Valid values are `amazon-dns` .
     */
    public fun networkServices(vararg networkServices: String)

    /**
     * @param tags The tags to assign to a Traffic Mirror filter.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to a Traffic Mirror filter.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps.Builder
        = software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps.builder()

    /**
     * @param description The description of the Traffic Mirror filter.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     * filter.
     * Valid values are `amazon-dns` .
     */
    override fun networkServices(networkServices: List<String>) {
      cdkBuilder.networkServices(networkServices)
    }

    /**
     * @param networkServices The network service traffic that is associated with the Traffic Mirror
     * filter.
     * Valid values are `amazon-dns` .
     */
    override fun networkServices(vararg networkServices: String): Unit =
        networkServices(networkServices.toList())

    /**
     * @param tags The tags to assign to a Traffic Mirror filter.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to assign to a Traffic Mirror filter.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps,
  ) : CdkObject(cdkObject), CfnTrafficMirrorFilterProps {
    /**
     * The description of the Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The network service traffic that is associated with the Traffic Mirror filter.
     *
     * Valid values are `amazon-dns` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-networkservices)
     */
    override fun networkServices(): List<String> = unwrap(this).getNetworkServices() ?: emptyList()

    /**
     * The tags to assign to a Traffic Mirror filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trafficmirrorfilter.html#cfn-ec2-trafficmirrorfilter-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficMirrorFilterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps):
        CfnTrafficMirrorFilterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorFilterProps):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTrafficMirrorFilterProps
  }
}
