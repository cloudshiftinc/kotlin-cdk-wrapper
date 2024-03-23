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
 * Properties for defining a `CfnCluster`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53recoverycontrol.*;
 * CfnClusterProps cfnClusterProps = CfnClusterProps.builder()
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html)
 */
public interface CfnClusterProps {
  /**
   * Name of the cluster.
   *
   * You can use any non-white space character in the name except the following: &amp; &gt; &lt; '
   * (single quote) " (double quote) ; (semicolon).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html#cfn-route53recoverycontrol-cluster-name)
   */
  public fun name(): String

  /**
   * The tags associated with the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html#cfn-route53recoverycontrol-cluster-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnClusterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Name of the cluster. 
     * You can use any non-white space character in the name except the following: &amp; &gt; &lt; '
     * (single quote) " (double quote) ; (semicolon).
     */
    public fun name(name: String)

    /**
     * @param tags The tags associated with the cluster.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags associated with the cluster.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps.Builder =
        software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps.builder()

    /**
     * @param name Name of the cluster. 
     * You can use any non-white space character in the name except the following: &amp; &gt; &lt; '
     * (single quote) " (double quote) ; (semicolon).
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags associated with the cluster.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags associated with the cluster.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps,
  ) : CdkObject(cdkObject), CfnClusterProps {
    /**
     * Name of the cluster.
     *
     * You can use any non-white space character in the name except the following: &amp; &gt; &lt; '
     * (single quote) " (double quote) ; (semicolon).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html#cfn-route53recoverycontrol-cluster-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tags associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-cluster.html#cfn-route53recoverycontrol-cluster-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps):
        CfnClusterProps = CdkObjectWrappers.wrap(cdkObject) as? CfnClusterProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClusterProps):
        software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps
  }
}
