@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53recoverycontrol

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnControlPanel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53recoverycontrol.*;
 * CfnControlPanelProps cfnControlPanelProps = CfnControlPanelProps.builder()
 * .name("name")
 * // the properties below are optional
 * .clusterArn("clusterArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html)
 */
public interface CfnControlPanelProps {
  /**
   * The Amazon Resource Name (ARN) of the cluster for the control panel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-clusterarn)
   */
  public fun clusterArn(): String? = unwrap(this).getClusterArn()

  /**
   * The name of the control panel.
   *
   * You can use any non-white space character in the name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-name)
   */
  public fun name(): String

  /**
   * The tags associated with the control panel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnControlPanelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterArn The Amazon Resource Name (ARN) of the cluster for the control panel.
     */
    public fun clusterArn(clusterArn: String)

    /**
     * @param name The name of the control panel. 
     * You can use any non-white space character in the name.
     */
    public fun name(name: String)

    /**
     * @param tags The tags associated with the control panel.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags associated with the control panel.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps.builder()

    /**
     * @param clusterArn The Amazon Resource Name (ARN) of the cluster for the control panel.
     */
    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * @param name The name of the control panel. 
     * You can use any non-white space character in the name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags associated with the control panel.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags associated with the control panel.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps,
  ) : CdkObject(cdkObject), CfnControlPanelProps {
    /**
     * The Amazon Resource Name (ARN) of the cluster for the control panel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-clusterarn)
     */
    override fun clusterArn(): String? = unwrap(this).getClusterArn()

    /**
     * The name of the control panel.
     *
     * You can use any non-white space character in the name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tags associated with the control panel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html#cfn-route53recoverycontrol-controlpanel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnControlPanelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps):
        CfnControlPanelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnControlPanelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnControlPanelProps):
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps
  }
}
