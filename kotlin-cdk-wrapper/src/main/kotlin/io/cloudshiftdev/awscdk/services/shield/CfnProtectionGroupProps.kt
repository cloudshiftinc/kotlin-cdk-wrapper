@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.shield

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnProtectionGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.shield.*;
 * CfnProtectionGroupProps cfnProtectionGroupProps = CfnProtectionGroupProps.builder()
 * .aggregation("aggregation")
 * .pattern("pattern")
 * .protectionGroupId("protectionGroupId")
 * // the properties below are optional
 * .members(List.of("members"))
 * .resourceType("resourceType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html)
 */
public interface CfnProtectionGroupProps {
  /**
   * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and
   * report events.
   *
   * * `Sum` - Use the total traffic across the group. This is a good choice for most cases.
   * Examples include Elastic IP addresses for EC2 instances that scale manually or automatically.
   * * `Mean` - Use the average of the traffic across the group. This is a good choice for resources
   * that share traffic uniformly. Examples include accelerators and load balancers.
   * * `Max` - Use the highest traffic from each resource. This is useful for resources that don't
   * share traffic and for resources that share that traffic in a non-uniform way. Examples include
   * Amazon CloudFront distributions and origin resources for CloudFront distributions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-aggregation)
   */
  public fun aggregation(): String

  /**
   * The ARNs (Amazon Resource Names) of the resources to include in the protection group.
   *
   * You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for any other
   * `Pattern` setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-members)
   */
  public fun members(): List<String> = unwrap(this).getMembers() ?: emptyList()

  /**
   * The criteria to use to choose the protected resources for inclusion in the group.
   *
   * You can include all resources that have protections, provide a list of resource ARNs (Amazon
   * Resource Names), or include all resources of a specified resource type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-pattern)
   */
  public fun pattern(): String

  /**
   * The name of the protection group.
   *
   * You use this to identify the protection group in lists and to manage the protection group, for
   * example to update, delete, or describe it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-protectiongroupid)
   */
  public fun protectionGroupId(): String

  /**
   * The resource type to include in the protection group.
   *
   * All protected resources of this type are included in the protection group. You must set this
   * when you set `Pattern` to `BY_RESOURCE_TYPE` and you must not set it for any other `Pattern`
   * setting.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-resourcetype)
   */
  public fun resourceType(): String? = unwrap(this).getResourceType()

  /**
   * Key:value pairs associated with an AWS resource.
   *
   * The key:value pair can be anything you define. Typically, the tag key represents a category
   * (such as "environment") and the tag value represents a specific value within that category (such
   * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProtectionGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aggregation Defines how AWS Shield combines resource data for the group in order to
     * detect, mitigate, and report events. 
     * * `Sum` - Use the total traffic across the group. This is a good choice for most cases.
     * Examples include Elastic IP addresses for EC2 instances that scale manually or automatically.
     * * `Mean` - Use the average of the traffic across the group. This is a good choice for
     * resources that share traffic uniformly. Examples include accelerators and load balancers.
     * * `Max` - Use the highest traffic from each resource. This is useful for resources that don't
     * share traffic and for resources that share that traffic in a non-uniform way. Examples include
     * Amazon CloudFront distributions and origin resources for CloudFront distributions.
     */
    public fun aggregation(aggregation: String)

    /**
     * @param members The ARNs (Amazon Resource Names) of the resources to include in the protection
     * group.
     * You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for any other
     * `Pattern` setting.
     */
    public fun members(members: List<String>)

    /**
     * @param members The ARNs (Amazon Resource Names) of the resources to include in the protection
     * group.
     * You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for any other
     * `Pattern` setting.
     */
    public fun members(vararg members: String)

    /**
     * @param pattern The criteria to use to choose the protected resources for inclusion in the
     * group. 
     * You can include all resources that have protections, provide a list of resource ARNs (Amazon
     * Resource Names), or include all resources of a specified resource type.
     */
    public fun pattern(pattern: String)

    /**
     * @param protectionGroupId The name of the protection group. 
     * You use this to identify the protection group in lists and to manage the protection group,
     * for example to update, delete, or describe it.
     */
    public fun protectionGroupId(protectionGroupId: String)

    /**
     * @param resourceType The resource type to include in the protection group.
     * All protected resources of this type are included in the protection group. You must set this
     * when you set `Pattern` to `BY_RESOURCE_TYPE` and you must not set it for any other `Pattern`
     * setting.
     */
    public fun resourceType(resourceType: String)

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnProtectionGroupProps.Builder =
        software.amazon.awscdk.services.shield.CfnProtectionGroupProps.builder()

    /**
     * @param aggregation Defines how AWS Shield combines resource data for the group in order to
     * detect, mitigate, and report events. 
     * * `Sum` - Use the total traffic across the group. This is a good choice for most cases.
     * Examples include Elastic IP addresses for EC2 instances that scale manually or automatically.
     * * `Mean` - Use the average of the traffic across the group. This is a good choice for
     * resources that share traffic uniformly. Examples include accelerators and load balancers.
     * * `Max` - Use the highest traffic from each resource. This is useful for resources that don't
     * share traffic and for resources that share that traffic in a non-uniform way. Examples include
     * Amazon CloudFront distributions and origin resources for CloudFront distributions.
     */
    override fun aggregation(aggregation: String) {
      cdkBuilder.aggregation(aggregation)
    }

    /**
     * @param members The ARNs (Amazon Resource Names) of the resources to include in the protection
     * group.
     * You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for any other
     * `Pattern` setting.
     */
    override fun members(members: List<String>) {
      cdkBuilder.members(members)
    }

    /**
     * @param members The ARNs (Amazon Resource Names) of the resources to include in the protection
     * group.
     * You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for any other
     * `Pattern` setting.
     */
    override fun members(vararg members: String): Unit = members(members.toList())

    /**
     * @param pattern The criteria to use to choose the protected resources for inclusion in the
     * group. 
     * You can include all resources that have protections, provide a list of resource ARNs (Amazon
     * Resource Names), or include all resources of a specified resource type.
     */
    override fun pattern(pattern: String) {
      cdkBuilder.pattern(pattern)
    }

    /**
     * @param protectionGroupId The name of the protection group. 
     * You use this to identify the protection group in lists and to manage the protection group,
     * for example to update, delete, or describe it.
     */
    override fun protectionGroupId(protectionGroupId: String) {
      cdkBuilder.protectionGroupId(protectionGroupId)
    }

    /**
     * @param resourceType The resource type to include in the protection group.
     * All protected resources of this type are included in the protection group. You must set this
     * when you set `Pattern` to `BY_RESOURCE_TYPE` and you must not set it for any other `Pattern`
     * setting.
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Key:value pairs associated with an AWS resource.
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.shield.CfnProtectionGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.shield.CfnProtectionGroupProps,
  ) : CdkObject(cdkObject), CfnProtectionGroupProps {
    /**
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and
     * report events.
     *
     * * `Sum` - Use the total traffic across the group. This is a good choice for most cases.
     * Examples include Elastic IP addresses for EC2 instances that scale manually or automatically.
     * * `Mean` - Use the average of the traffic across the group. This is a good choice for
     * resources that share traffic uniformly. Examples include accelerators and load balancers.
     * * `Max` - Use the highest traffic from each resource. This is useful for resources that don't
     * share traffic and for resources that share that traffic in a non-uniform way. Examples include
     * Amazon CloudFront distributions and origin resources for CloudFront distributions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-aggregation)
     */
    override fun aggregation(): String = unwrap(this).getAggregation()

    /**
     * The ARNs (Amazon Resource Names) of the resources to include in the protection group.
     *
     * You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for any other
     * `Pattern` setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-members)
     */
    override fun members(): List<String> = unwrap(this).getMembers() ?: emptyList()

    /**
     * The criteria to use to choose the protected resources for inclusion in the group.
     *
     * You can include all resources that have protections, provide a list of resource ARNs (Amazon
     * Resource Names), or include all resources of a specified resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-pattern)
     */
    override fun pattern(): String = unwrap(this).getPattern()

    /**
     * The name of the protection group.
     *
     * You use this to identify the protection group in lists and to manage the protection group,
     * for example to update, delete, or describe it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-protectiongroupid)
     */
    override fun protectionGroupId(): String = unwrap(this).getProtectionGroupId()

    /**
     * The resource type to include in the protection group.
     *
     * All protected resources of this type are included in the protection group. You must set this
     * when you set `Pattern` to `BY_RESOURCE_TYPE` and you must not set it for any other `Pattern`
     * setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-resourcetype)
     */
    override fun resourceType(): String? = unwrap(this).getResourceType()

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProtectionGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProtectionGroupProps):
        CfnProtectionGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnProtectionGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProtectionGroupProps):
        software.amazon.awscdk.services.shield.CfnProtectionGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.shield.CfnProtectionGroupProps
  }
}
