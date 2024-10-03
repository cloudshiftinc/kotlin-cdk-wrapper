@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnLocation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnLocationProps cfnLocationProps = CfnLocationProps.builder()
 * .locationName("locationName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-location.html)
 */
public interface CfnLocationProps {
  /**
   * A descriptive name for the custom location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-location.html#cfn-gamelift-location-locationname)
   */
  public fun locationName(): String

  /**
   * A list of labels to assign to the new resource.
   *
   * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
   * management, access management, and cost allocation. For more information, see [Tagging AWS
   * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
   * Rareference* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-location.html#cfn-gamelift-location-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param locationName A descriptive name for the custom location. 
     */
    public fun locationName(locationName: String)

    /**
     * @param tags A list of labels to assign to the new resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management, and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Rareference* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of labels to assign to the new resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management, and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Rareference* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnLocationProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnLocationProps.builder()

    /**
     * @param locationName A descriptive name for the custom location. 
     */
    override fun locationName(locationName: String) {
      cdkBuilder.locationName(locationName)
    }

    /**
     * @param tags A list of labels to assign to the new resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management, and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Rareference* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of labels to assign to the new resource.
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management, and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Rareference* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.gamelift.CfnLocationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.gamelift.CfnLocationProps,
  ) : CdkObject(cdkObject),
      CfnLocationProps {
    /**
     * A descriptive name for the custom location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-location.html#cfn-gamelift-location-locationname)
     */
    override fun locationName(): String = unwrap(this).getLocationName()

    /**
     * A list of labels to assign to the new resource.
     *
     * Tags are developer-defined key-value pairs. Tagging AWS resources are useful for resource
     * management, access management, and cost allocation. For more information, see [Tagging AWS
     * Resources](https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html) in the *AWS General
     * Rareference* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-location.html#cfn-gamelift-location-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnLocationProps):
        CfnLocationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLocationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationProps):
        software.amazon.awscdk.services.gamelift.CfnLocationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.gamelift.CfnLocationProps
  }
}
