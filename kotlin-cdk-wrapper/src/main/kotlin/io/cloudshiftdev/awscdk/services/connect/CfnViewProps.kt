@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnView`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * Object template;
 * CfnViewProps cfnViewProps = CfnViewProps.builder()
 * .actions(List.of("actions"))
 * .instanceArn("instanceArn")
 * .name("name")
 * .template(template)
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html)
 */
public interface CfnViewProps {
  /**
   * A list of actions possible from the view.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-actions)
   */
  public fun actions(): List<String>

  /**
   * The description of the view.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The name of the view.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-name)
   */
  public fun name(): String

  /**
   * The tags associated with the view resource (not specific to view version).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The view template representing the structure of the view.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-template)
   */
  public fun template(): Any

  /**
   * A builder for [CfnViewProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions A list of actions possible from the view. 
     */
    public fun actions(actions: List<String>)

    /**
     * @param actions A list of actions possible from the view. 
     */
    public fun actions(vararg actions: String)

    /**
     * @param description The description of the view.
     */
    public fun description(description: String)

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param name The name of the view. 
     */
    public fun name(name: String)

    /**
     * @param tags The tags associated with the view resource (not specific to view version).
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags associated with the view resource (not specific to view version).
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param template The view template representing the structure of the view. 
     */
    public fun template(template: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnViewProps.Builder =
        software.amazon.awscdk.services.connect.CfnViewProps.builder()

    /**
     * @param actions A list of actions possible from the view. 
     */
    override fun actions(actions: List<String>) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param actions A list of actions possible from the view. 
     */
    override fun actions(vararg actions: String): Unit = actions(actions.toList())

    /**
     * @param description The description of the view.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param name The name of the view. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags associated with the view resource (not specific to view version).
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags associated with the view resource (not specific to view version).
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param template The view template representing the structure of the view. 
     */
    override fun template(template: Any) {
      cdkBuilder.template(template)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnViewProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnViewProps,
  ) : CdkObject(cdkObject), CfnViewProps {
    /**
     * A list of actions possible from the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-actions)
     */
    override fun actions(): List<String> = unwrap(this).getActions()

    /**
     * The description of the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The name of the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tags associated with the view resource (not specific to view version).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The view template representing the structure of the view.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-view.html#cfn-connect-view-template)
     */
    override fun template(): Any = unwrap(this).getTemplate()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnViewProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnViewProps): CfnViewProps
        = CdkObjectWrappers.wrap(cdkObject) as CfnViewProps

    internal fun unwrap(wrapped: CfnViewProps): software.amazon.awscdk.services.connect.CfnViewProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnViewProps
  }
}
