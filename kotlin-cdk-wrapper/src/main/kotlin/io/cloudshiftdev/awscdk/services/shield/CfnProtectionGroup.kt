@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.shield

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
 * Creates a grouping of protected resources so they can be handled as a collective.
 *
 * This resource grouping improves the accuracy of detection and reduces false positives.
 *
 * To configure this resource through AWS CloudFormation , you must be subscribed to AWS Shield
 * Advanced . You can subscribe through the [Shield Advanced
 * console](https://docs.aws.amazon.com/wafv2/shieldv2#/) and through the APIs. For more information,
 * see [Subscribe to AWS Shield
 * Advanced](https://docs.aws.amazon.com/waf/latest/developerguide/enable-ddos-prem.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.shield.*;
 * CfnProtectionGroup cfnProtectionGroup = CfnProtectionGroup.Builder.create(this,
 * "MyCfnProtectionGroup")
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
public open class CfnProtectionGroup(
  cdkObject: software.amazon.awscdk.services.shield.CfnProtectionGroup,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProtectionGroupProps,
  ) :
      this(software.amazon.awscdk.services.shield.CfnProtectionGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnProtectionGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnProtectionGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnProtectionGroupProps(props)
  )

  /**
   * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and
   * report events.
   */
  public open fun aggregation(): String = unwrap(this).getAggregation()

  /**
   * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and
   * report events.
   */
  public open fun aggregation(`value`: String) {
    unwrap(this).setAggregation(`value`)
  }

  /**
   * The ARN (Amazon Resource Name) of the new protection group.
   */
  public open fun attrProtectionGroupArn(): String = unwrap(this).getAttrProtectionGroupArn()

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
   * The ARNs (Amazon Resource Names) of the resources to include in the protection group.
   */
  public open fun members(): List<String> = unwrap(this).getMembers() ?: emptyList()

  /**
   * The ARNs (Amazon Resource Names) of the resources to include in the protection group.
   */
  public open fun members(`value`: List<String>) {
    unwrap(this).setMembers(`value`)
  }

  /**
   * The ARNs (Amazon Resource Names) of the resources to include in the protection group.
   */
  public open fun members(vararg `value`: String): Unit = members(`value`.toList())

  /**
   * The criteria to use to choose the protected resources for inclusion in the group.
   */
  public open fun pattern(): String = unwrap(this).getPattern()

  /**
   * The criteria to use to choose the protected resources for inclusion in the group.
   */
  public open fun pattern(`value`: String) {
    unwrap(this).setPattern(`value`)
  }

  /**
   * The name of the protection group.
   */
  public open fun protectionGroupId(): String = unwrap(this).getProtectionGroupId()

  /**
   * The name of the protection group.
   */
  public open fun protectionGroupId(`value`: String) {
    unwrap(this).setProtectionGroupId(`value`)
  }

  /**
   * The resource type to include in the protection group.
   */
  public open fun resourceType(): String? = unwrap(this).getResourceType()

  /**
   * The resource type to include in the protection group.
   */
  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  /**
   * Key:value pairs associated with an AWS resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Key:value pairs associated with an AWS resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Key:value pairs associated with an AWS resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.shield.CfnProtectionGroup].
   */
  @CdkDslMarker
  public interface Builder {
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
     * @param aggregation Defines how AWS Shield combines resource data for the group in order to
     * detect, mitigate, and report events. 
     */
    public fun aggregation(aggregation: String)

    /**
     * The ARNs (Amazon Resource Names) of the resources to include in the protection group.
     *
     * You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for any other
     * `Pattern` setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-members)
     * @param members The ARNs (Amazon Resource Names) of the resources to include in the protection
     * group. 
     */
    public fun members(members: List<String>)

    /**
     * The ARNs (Amazon Resource Names) of the resources to include in the protection group.
     *
     * You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for any other
     * `Pattern` setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-members)
     * @param members The ARNs (Amazon Resource Names) of the resources to include in the protection
     * group. 
     */
    public fun members(vararg members: String)

    /**
     * The criteria to use to choose the protected resources for inclusion in the group.
     *
     * You can include all resources that have protections, provide a list of resource ARNs (Amazon
     * Resource Names), or include all resources of a specified resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-pattern)
     * @param pattern The criteria to use to choose the protected resources for inclusion in the
     * group. 
     */
    public fun pattern(pattern: String)

    /**
     * The name of the protection group.
     *
     * You use this to identify the protection group in lists and to manage the protection group,
     * for example to update, delete, or describe it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-protectiongroupid)
     * @param protectionGroupId The name of the protection group. 
     */
    public fun protectionGroupId(protectionGroupId: String)

    /**
     * The resource type to include in the protection group.
     *
     * All protected resources of this type are included in the protection group. You must set this
     * when you set `Pattern` to `BY_RESOURCE_TYPE` and you must not set it for any other `Pattern`
     * setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-resourcetype)
     * @param resourceType The resource type to include in the protection group. 
     */
    public fun resourceType(resourceType: String)

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-tags)
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-tags)
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.shield.CfnProtectionGroup.Builder =
        software.amazon.awscdk.services.shield.CfnProtectionGroup.Builder.create(scope, id)

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
     * @param aggregation Defines how AWS Shield combines resource data for the group in order to
     * detect, mitigate, and report events. 
     */
    override fun aggregation(aggregation: String) {
      cdkBuilder.aggregation(aggregation)
    }

    /**
     * The ARNs (Amazon Resource Names) of the resources to include in the protection group.
     *
     * You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for any other
     * `Pattern` setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-members)
     * @param members The ARNs (Amazon Resource Names) of the resources to include in the protection
     * group. 
     */
    override fun members(members: List<String>) {
      cdkBuilder.members(members)
    }

    /**
     * The ARNs (Amazon Resource Names) of the resources to include in the protection group.
     *
     * You must set this when you set `Pattern` to `ARBITRARY` and you must not set it for any other
     * `Pattern` setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-members)
     * @param members The ARNs (Amazon Resource Names) of the resources to include in the protection
     * group. 
     */
    override fun members(vararg members: String): Unit = members(members.toList())

    /**
     * The criteria to use to choose the protected resources for inclusion in the group.
     *
     * You can include all resources that have protections, provide a list of resource ARNs (Amazon
     * Resource Names), or include all resources of a specified resource type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-pattern)
     * @param pattern The criteria to use to choose the protected resources for inclusion in the
     * group. 
     */
    override fun pattern(pattern: String) {
      cdkBuilder.pattern(pattern)
    }

    /**
     * The name of the protection group.
     *
     * You use this to identify the protection group in lists and to manage the protection group,
     * for example to update, delete, or describe it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-protectiongroupid)
     * @param protectionGroupId The name of the protection group. 
     */
    override fun protectionGroupId(protectionGroupId: String) {
      cdkBuilder.protectionGroupId(protectionGroupId)
    }

    /**
     * The resource type to include in the protection group.
     *
     * All protected resources of this type are included in the protection group. You must set this
     * when you set `Pattern` to `BY_RESOURCE_TYPE` and you must not set it for any other `Pattern`
     * setting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-resourcetype)
     * @param resourceType The resource type to include in the protection group. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-tags)
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Key:value pairs associated with an AWS resource.
     *
     * The key:value pair can be anything you define. Typically, the tag key represents a category
     * (such as "environment") and the tag value represents a specific value within that category (such
     * as "test," "development," or "production"). You can add up to 50 tags to each AWS resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-shield-protectiongroup.html#cfn-shield-protectiongroup-tags)
     * @param tags Key:value pairs associated with an AWS resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.shield.CfnProtectionGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.shield.CfnProtectionGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProtectionGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProtectionGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.shield.CfnProtectionGroup):
        CfnProtectionGroup = CfnProtectionGroup(cdkObject)

    internal fun unwrap(wrapped: CfnProtectionGroup):
        software.amazon.awscdk.services.shield.CfnProtectionGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.shield.CfnProtectionGroup
  }
}
