@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnInputSecurityGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * Object tags;
 * CfnInputSecurityGroupProps cfnInputSecurityGroupProps = CfnInputSecurityGroupProps.builder()
 * .tags(tags)
 * .whitelistRules(List.of(InputWhitelistRuleCidrProperty.builder()
 * .cidr("cidr")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html)
 */
public interface CfnInputSecurityGroupProps {
  /**
   * A collection of tags for this input security group.
   *
   * Each tag is a key-value pair.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * The list of IPv4 CIDR addresses to include in the input security group as "allowed" addresses.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
   */
  public fun whitelistRules(): Any? = unwrap(this).getWhitelistRules()

  /**
   * A builder for [CfnInputSecurityGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tags A collection of tags for this input security group.
     * Each tag is a key-value pair.
     */
    public fun tags(tags: Any)

    /**
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses.
     */
    public fun whitelistRules(whitelistRules: IResolvable)

    /**
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses.
     */
    public fun whitelistRules(whitelistRules: List<Any>)

    /**
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses.
     */
    public fun whitelistRules(vararg whitelistRules: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps.Builder =
        software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps.builder()

    /**
     * @param tags A collection of tags for this input security group.
     * Each tag is a key-value pair.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses.
     */
    override fun whitelistRules(whitelistRules: IResolvable) {
      cdkBuilder.whitelistRules(whitelistRules.let(IResolvable::unwrap))
    }

    /**
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses.
     */
    override fun whitelistRules(whitelistRules: List<Any>) {
      cdkBuilder.whitelistRules(whitelistRules)
    }

    /**
     * @param whitelistRules The list of IPv4 CIDR addresses to include in the input security group
     * as "allowed" addresses.
     */
    override fun whitelistRules(vararg whitelistRules: Any): Unit =
        whitelistRules(whitelistRules.toList())

    public fun build(): software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps,
  ) : CdkObject(cdkObject), CfnInputSecurityGroupProps {
    /**
     * A collection of tags for this input security group.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * The list of IPv4 CIDR addresses to include in the input security group as "allowed"
     * addresses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-inputsecuritygroup.html#cfn-medialive-inputsecuritygroup-whitelistrules)
     */
    override fun whitelistRules(): Any? = unwrap(this).getWhitelistRules()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInputSecurityGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps):
        CfnInputSecurityGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInputSecurityGroupProps):
        software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.medialive.CfnInputSecurityGroupProps
  }
}
