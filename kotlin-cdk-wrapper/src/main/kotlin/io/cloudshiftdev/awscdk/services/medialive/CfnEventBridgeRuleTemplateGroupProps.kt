@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnEventBridgeRuleTemplateGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnEventBridgeRuleTemplateGroupProps cfnEventBridgeRuleTemplateGroupProps =
 * CfnEventBridgeRuleTemplateGroupProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html)
 */
public interface CfnEventBridgeRuleTemplateGroupProps {
  /**
   * A resource's optional description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A resource's name.
   *
   * Names must be unique within the scope of a resource type in a specific region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-name)
   */
  public fun name(): String

  /**
   * Represents the tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnEventBridgeRuleTemplateGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A resource's optional description.
     */
    public fun description(description: String)

    /**
     * @param name A resource's name. 
     * Names must be unique within the scope of a resource type in a specific region.
     */
    public fun name(name: String)

    /**
     * @param tags Represents the tags associated with a resource.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroupProps.Builder =
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroupProps.builder()

    /**
     * @param description A resource's optional description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name A resource's name. 
     * Names must be unique within the scope of a resource type in a specific region.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Represents the tags associated with a resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build():
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroupProps,
  ) : CdkObject(cdkObject),
      CfnEventBridgeRuleTemplateGroupProps {
    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-eventbridgeruletemplategroup.html#cfn-medialive-eventbridgeruletemplategroup-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnEventBridgeRuleTemplateGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroupProps):
        CfnEventBridgeRuleTemplateGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnEventBridgeRuleTemplateGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventBridgeRuleTemplateGroupProps):
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.medialive.CfnEventBridgeRuleTemplateGroupProps
  }
}
