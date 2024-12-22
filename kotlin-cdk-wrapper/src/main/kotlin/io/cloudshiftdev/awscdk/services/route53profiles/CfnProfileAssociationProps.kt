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
 * Properties for defining a `CfnProfileAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.route53profiles.*;
 * CfnProfileAssociationProps cfnProfileAssociationProps = CfnProfileAssociationProps.builder()
 * .name("name")
 * .profileId("profileId")
 * .resourceId("resourceId")
 * // the properties below are optional
 * .arn("arn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileassociation.html)
 */
public interface CfnProfileAssociationProps {
  /**
   * The Amazon Resource Name (ARN) of the profile association to a VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileassociation.html#cfn-route53profiles-profileassociation-arn)
   */
  public fun arn(): String? = unwrap(this).getArn()

  /**
   * Name of the Profile association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileassociation.html#cfn-route53profiles-profileassociation-name)
   */
  public fun name(): String

  /**
   * ID of the Profile.
   *
   * Update to this property requires update to the `ResourceId` property as well, because you can
   * only associate one Profile per VPC. For more information, see [Route 53
   * Profiles](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/profiles.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileassociation.html#cfn-route53profiles-profileassociation-profileid)
   */
  public fun profileId(): String

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileassociation.html#cfn-route53profiles-profileassociation-resourceid)
   */
  public fun resourceId(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileassociation.html#cfn-route53profiles-profileassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProfileAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arn The Amazon Resource Name (ARN) of the profile association to a VPC.
     */
    public fun arn(arn: String)

    /**
     * @param name Name of the Profile association. 
     */
    public fun name(name: String)

    /**
     * @param profileId ID of the Profile. 
     * Update to this property requires update to the `ResourceId` property as well, because you can
     * only associate one Profile per VPC. For more information, see [Route 53
     * Profiles](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/profiles.html) .
     */
    public fun profileId(profileId: String)

    /**
     * @param resourceId The ID of the VPC. 
     */
    public fun resourceId(resourceId: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.route53profiles.CfnProfileAssociationProps.Builder =
        software.amazon.awscdk.services.route53profiles.CfnProfileAssociationProps.builder()

    /**
     * @param arn The Amazon Resource Name (ARN) of the profile association to a VPC.
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param name Name of the Profile association. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param profileId ID of the Profile. 
     * Update to this property requires update to the `ResourceId` property as well, because you can
     * only associate one Profile per VPC. For more information, see [Route 53
     * Profiles](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/profiles.html) .
     */
    override fun profileId(profileId: String) {
      cdkBuilder.profileId(profileId)
    }

    /**
     * @param resourceId The ID of the VPC. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.route53profiles.CfnProfileAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.route53profiles.CfnProfileAssociationProps,
  ) : CdkObject(cdkObject),
      CfnProfileAssociationProps {
    /**
     * The Amazon Resource Name (ARN) of the profile association to a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileassociation.html#cfn-route53profiles-profileassociation-arn)
     */
    override fun arn(): String? = unwrap(this).getArn()

    /**
     * Name of the Profile association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileassociation.html#cfn-route53profiles-profileassociation-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * ID of the Profile.
     *
     * Update to this property requires update to the `ResourceId` property as well, because you can
     * only associate one Profile per VPC. For more information, see [Route 53
     * Profiles](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/profiles.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileassociation.html#cfn-route53profiles-profileassociation-profileid)
     */
    override fun profileId(): String = unwrap(this).getProfileId()

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileassociation.html#cfn-route53profiles-profileassociation-resourceid)
     */
    override fun resourceId(): String = unwrap(this).getResourceId()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53profiles-profileassociation.html#cfn-route53profiles-profileassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProfileAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.route53profiles.CfnProfileAssociationProps):
        CfnProfileAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnProfileAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProfileAssociationProps):
        software.amazon.awscdk.services.route53profiles.CfnProfileAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.route53profiles.CfnProfileAssociationProps
  }
}
