@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53profiles

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53profiles.*;
 * CfnProfileProps cfnProfileProps = CfnProfileProps.builder()
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profile.html)
 */
public interface CfnProfileProps {
  /**
   * Name of the Profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profile.html#cfn-route53profiles-profile-name)
   */
  public fun name(): String

  /**
   * A list of the tag keys and values that you want to associate with the profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profile.html#cfn-route53profiles-profile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Name of the Profile. 
     */
    public fun name(name: String)

    /**
     * @param tags A list of the tag keys and values that you want to associate with the profile.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of the tag keys and values that you want to associate with the profile.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53profiles.CfnProfileProps.Builder
        = software.amazon.awscdk.services.route53profiles.CfnProfileProps.builder()

    /**
     * @param name Name of the Profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags A list of the tag keys and values that you want to associate with the profile.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A list of the tag keys and values that you want to associate with the profile.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53profiles.CfnProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53profiles.CfnProfileProps,
  ) : CdkObject(cdkObject), CfnProfileProps {
    /**
     * Name of the Profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profile.html#cfn-route53profiles-profile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A list of the tag keys and values that you want to associate with the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profile.html#cfn-route53profiles-profile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53profiles.CfnProfileProps):
        CfnProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfileProps):
        software.amazon.awscdk.services.route53profiles.CfnProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53profiles.CfnProfileProps
  }
}
