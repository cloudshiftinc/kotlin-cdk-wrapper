@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53profiles

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A complex type that includes settings for a Route 53 Profile.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53profiles.*;
 * CfnProfile cfnProfile = CfnProfile.Builder.create(this, "MyCfnProfile")
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
public open class CfnProfile(
  cdkObject: software.amazon.awscdk.services.route53profiles.CfnProfile,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProfileProps,
  ) :
      this(software.amazon.awscdk.services.route53profiles.CfnProfile(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnProfileProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProfileProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProfileProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the Profile.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The `ClientToken` value that was assigned when the Profile was created.
   */
  public open fun attrClientToken(): String = unwrap(this).getAttrClientToken()

  /**
   * ID of the Profile.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Name of the Profile.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * Name of the Profile.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A list of the tag keys and values that you want to associate with the profile.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of the tag keys and values that you want to associate with the profile.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of the tag keys and values that you want to associate with the profile.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53profiles.CfnProfile].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Name of the Profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profile.html#cfn-route53profiles-profile-name)
     * @param name Name of the Profile. 
     */
    public fun name(name: String)

    /**
     * A list of the tag keys and values that you want to associate with the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profile.html#cfn-route53profiles-profile-tags)
     * @param tags A list of the tag keys and values that you want to associate with the profile. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of the tag keys and values that you want to associate with the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profile.html#cfn-route53profiles-profile-tags)
     * @param tags A list of the tag keys and values that you want to associate with the profile. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53profiles.CfnProfile.Builder =
        software.amazon.awscdk.services.route53profiles.CfnProfile.Builder.create(scope, id)

    /**
     * Name of the Profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profile.html#cfn-route53profiles-profile-name)
     * @param name Name of the Profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A list of the tag keys and values that you want to associate with the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profile.html#cfn-route53profiles-profile-tags)
     * @param tags A list of the tag keys and values that you want to associate with the profile. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of the tag keys and values that you want to associate with the profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profile.html#cfn-route53profiles-profile-tags)
     * @param tags A list of the tag keys and values that you want to associate with the profile. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53profiles.CfnProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.route53profiles.CfnProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53profiles.CfnProfile):
        CfnProfile = CfnProfile(cdkObject)

    internal fun unwrap(wrapped: CfnProfile):
        software.amazon.awscdk.services.route53profiles.CfnProfile = wrapped.cdkObject as
        software.amazon.awscdk.services.route53profiles.CfnProfile
  }
}
