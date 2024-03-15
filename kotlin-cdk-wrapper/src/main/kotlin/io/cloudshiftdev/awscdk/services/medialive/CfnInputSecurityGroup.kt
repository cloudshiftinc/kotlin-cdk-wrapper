@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::MediaLive::InputSecurityGroup is a MediaLive resource type that creates an input
 * security group.
 *
 * A MediaLive input security group is associated with a MediaLive input. The input security group
 * is an "allow list" of IP addresses that controls whether an external IP address can push content to
 * the associated MediaLive input.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * Object tags;
 * CfnInputSecurityGroup cfnInputSecurityGroup = CfnInputSecurityGroup.Builder.create(this,
 * "MyCfnInputSecurityGroup")
 * .tags(tags)
 * .whitelistRules(List.of(InputWhitelistRuleCidrProperty.builder()
 * .cidr("cidr")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html)
 */
public open class CfnInputSecurityGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.medialive.CfnInputSecurityGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the MediaLive input security group.
   *
   * For example: arn:aws:medialive:us-west-1:111122223333:medialive:inputSecurityGroup:1234567
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Id of the Input Security Group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A collection of tags for this input security group.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * A collection of tags for this input security group.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The list of IPv4 CIDR addresses to include in the input security group as "allowed" addresses.
   */
  public open fun whitelistRules(): Any? = unwrap(this).getWhitelistRules()

  /**
   * The list of IPv4 CIDR addresses to include in the input security group as "allowed" addresses.
   */
  public open fun whitelistRules(`value`: IResolvable) {
    unwrap(this).setWhitelistRules(`value`.let(IResolvable::unwrap))
  }

  /**
   * The list of IPv4 CIDR addresses to include in the input security group as "allowed" addresses.
   */
  public open fun whitelistRules(_idx_ac66f0: List<Any>) {
    unwrap(this).setWhitelistRules(_idx_ac66f0)
  }

  /**
   * The list of IPv4 CIDR addresses to include in the input security group as "allowed" addresses.
   */
  public open fun whitelistRules(vararg _idx_ac66f0: Any): Unit =
      whitelistRules(_idx_ac66f0.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.medialive.CfnInputSecurityGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A collection of tags for this input security group.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-tags)
     * @param tags A collection of tags for this input security group. 
     */
    public fun tags(tags: Any)

    /**
     * The list of IPv4 CIDR addresses to include in the input security group as "allowed"
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses. 
     */
    public fun whitelistRules(whitelistRules: IResolvable)

    /**
     * The list of IPv4 CIDR addresses to include in the input security group as "allowed"
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses. 
     */
    public fun whitelistRules(whitelistRules: List<Any>)

    /**
     * The list of IPv4 CIDR addresses to include in the input security group as "allowed"
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses. 
     */
    public fun whitelistRules(vararg whitelistRules: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.Builder
        = software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.Builder.create(scope, id)

    /**
     * A collection of tags for this input security group.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-tags)
     * @param tags A collection of tags for this input security group. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * The list of IPv4 CIDR addresses to include in the input security group as "allowed"
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses. 
     */
    override fun whitelistRules(whitelistRules: IResolvable) {
      cdkBuilder.whitelistRules(whitelistRules.let(IResolvable::unwrap))
    }

    /**
     * The list of IPv4 CIDR addresses to include in the input security group as "allowed"
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses. 
     */
    override fun whitelistRules(whitelistRules: List<Any>) {
      cdkBuilder.whitelistRules(whitelistRules)
    }

    /**
     * The list of IPv4 CIDR addresses to include in the input security group as "allowed"
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses. 
     */
    override fun whitelistRules(vararg whitelistRules: Any): Unit =
        whitelistRules(whitelistRules.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnInputSecurityGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInputSecurityGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInputSecurityGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInputSecurityGroup):
        CfnInputSecurityGroup = CfnInputSecurityGroup(cdkObject)

    internal fun unwrap(wrapped: CfnInputSecurityGroup):
        software.amazon.awscdk.services.medialive.CfnInputSecurityGroup = wrapped.cdkObject
  }

  /**
   * An IPv4 CIDR range to include in this input security group.
   *
   * The parent of this entity is InputSecurityGroup.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * InputWhitelistRuleCidrProperty inputWhitelistRuleCidrProperty =
   * InputWhitelistRuleCidrProperty.builder()
   * .cidr("cidr")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-inputsecuritygroup-inputwhitelistrulecidr.html)
   */
  public interface InputWhitelistRuleCidrProperty {
    /**
     * An IPv4 CIDR range to include in this input security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-inputsecuritygroup-inputwhitelistrulecidr.html#cfn-medialive-inputsecuritygroup-inputwhitelistrulecidr-cidr)
     */
    public fun cidr(): String? = unwrap(this).getCidr()

    /**
     * A builder for [InputWhitelistRuleCidrProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr An IPv4 CIDR range to include in this input security group.
       */
      public fun cidr(cidr: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty.builder()

      /**
       * @param cidr An IPv4 CIDR range to include in this input security group.
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty,
    ) : CdkObject(cdkObject), InputWhitelistRuleCidrProperty {
      /**
       * An IPv4 CIDR range to include in this input security group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-inputsecuritygroup-inputwhitelistrulecidr.html#cfn-medialive-inputsecuritygroup-inputwhitelistrulecidr-cidr)
       */
      override fun cidr(): String? = unwrap(this).getCidr()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputWhitelistRuleCidrProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty):
          InputWhitelistRuleCidrProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputWhitelistRuleCidrProperty):
          software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInputSecurityGroup.InputWhitelistRuleCidrProperty
    }
  }
}
