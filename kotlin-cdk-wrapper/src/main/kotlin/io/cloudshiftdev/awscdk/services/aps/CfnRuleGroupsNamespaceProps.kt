@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.aps

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnRuleGroupsNamespace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.aps.*;
 * CfnRuleGroupsNamespaceProps cfnRuleGroupsNamespaceProps = CfnRuleGroupsNamespaceProps.builder()
 * .data("data")
 * .name("name")
 * .workspace("workspace")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html)
 */
public interface CfnRuleGroupsNamespaceProps {
  /**
   * The rules file used in the namespace.
   *
   * For more details about the rules file, see [Creating a rules
   * file](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-ruler-rulesfile.html) in the
   * *Amazon Managed Service for Prometheus User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-data)
   */
  public fun `data`(): String

  /**
   * The name of the rule groups namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-name)
   */
  public fun name(): String

  /**
   * The list of tag keys and values that are associated with the rule groups namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An Amazon Managed Service for Prometheus workspace is a logical and isolated Prometheus server
   * dedicated to ingesting, storing, and querying your Prometheus-compatible metrics.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-workspace)
   */
  public fun workspace(): String

  /**
   * A builder for [CfnRuleGroupsNamespaceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param data The rules file used in the namespace. 
     * For more details about the rules file, see [Creating a rules
     * file](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-ruler-rulesfile.html) in the
     * *Amazon Managed Service for Prometheus User Guide* .
     */
    public fun `data`(`data`: String)

    /**
     * @param name The name of the rule groups namespace. 
     */
    public fun name(name: String)

    /**
     * @param tags The list of tag keys and values that are associated with the rule groups
     * namespace.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The list of tag keys and values that are associated with the rule groups
     * namespace.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param workspace An Amazon Managed Service for Prometheus workspace is a logical and isolated
     * Prometheus server dedicated to ingesting, storing, and querying your Prometheus-compatible
     * metrics. 
     */
    public fun workspace(workspace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps.Builder
        = software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps.builder()

    /**
     * @param data The rules file used in the namespace. 
     * For more details about the rules file, see [Creating a rules
     * file](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-ruler-rulesfile.html) in the
     * *Amazon Managed Service for Prometheus User Guide* .
     */
    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    /**
     * @param name The name of the rule groups namespace. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The list of tag keys and values that are associated with the rule groups
     * namespace.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The list of tag keys and values that are associated with the rule groups
     * namespace.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param workspace An Amazon Managed Service for Prometheus workspace is a logical and isolated
     * Prometheus server dedicated to ingesting, storing, and querying your Prometheus-compatible
     * metrics. 
     */
    override fun workspace(workspace: String) {
      cdkBuilder.workspace(workspace)
    }

    public fun build(): software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps,
  ) : CdkObject(cdkObject), CfnRuleGroupsNamespaceProps {
    /**
     * The rules file used in the namespace.
     *
     * For more details about the rules file, see [Creating a rules
     * file](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-ruler-rulesfile.html) in the
     * *Amazon Managed Service for Prometheus User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-data)
     */
    override fun `data`(): String = unwrap(this).getData()

    /**
     * The name of the rule groups namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The list of tag keys and values that are associated with the rule groups namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * An Amazon Managed Service for Prometheus workspace is a logical and isolated Prometheus
     * server dedicated to ingesting, storing, and querying your Prometheus-compatible metrics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-aps-rulegroupsnamespace.html#cfn-aps-rulegroupsnamespace-workspace)
     */
    override fun workspace(): String = unwrap(this).getWorkspace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRuleGroupsNamespaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps):
        CfnRuleGroupsNamespaceProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnRuleGroupsNamespaceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroupsNamespaceProps):
        software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.aps.CfnRuleGroupsNamespaceProps
  }
}
