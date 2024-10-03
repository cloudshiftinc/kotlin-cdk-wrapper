@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnCloudWatchAlarmTemplateGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * CfnCloudWatchAlarmTemplateGroupProps cfnCloudWatchAlarmTemplateGroupProps =
 * CfnCloudWatchAlarmTemplateGroupProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplategroup.html)
 */
public interface CfnCloudWatchAlarmTemplateGroupProps {
  /**
   * A resource's optional description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplategroup.html#cfn-medialive-cloudwatchalarmtemplategroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A resource's name.
   *
   * Names must be unique within the scope of a resource type in a specific region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplategroup.html#cfn-medialive-cloudwatchalarmtemplategroup-name)
   */
  public fun name(): String

  /**
   * Represents the tags associated with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplategroup.html#cfn-medialive-cloudwatchalarmtemplategroup-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnCloudWatchAlarmTemplateGroupProps]
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
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateGroupProps.Builder =
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateGroupProps.builder()

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
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateGroupProps,
  ) : CdkObject(cdkObject),
      CfnCloudWatchAlarmTemplateGroupProps {
    /**
     * A resource's optional description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplategroup.html#cfn-medialive-cloudwatchalarmtemplategroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A resource's name.
     *
     * Names must be unique within the scope of a resource type in a specific region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplategroup.html#cfn-medialive-cloudwatchalarmtemplategroup-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Represents the tags associated with a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-cloudwatchalarmtemplategroup.html#cfn-medialive-cloudwatchalarmtemplategroup-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnCloudWatchAlarmTemplateGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateGroupProps):
        CfnCloudWatchAlarmTemplateGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCloudWatchAlarmTemplateGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCloudWatchAlarmTemplateGroupProps):
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.medialive.CfnCloudWatchAlarmTemplateGroupProps
  }
}
