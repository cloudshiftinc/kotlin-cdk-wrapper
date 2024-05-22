@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ElastiCache::SecurityGroup` resource creates a cache security group.
 *
 * For more information about cache security groups, go to
 * [CacheSecurityGroups](https://docs.aws.amazon.com/AmazonElastiCache/latest/mem-ug/VPCs.html) in the
 * *Amazon ElastiCache User Guide* or go to
 * [CreateCacheSecurityGroup](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSecurityGroup.html)
 * in the *Amazon ElastiCache API Reference Guide* .
 *
 * For more information, see
 * [CreateCacheSubnetGroup](https://docs.aws.amazon.com/AmazonElastiCache/latest/APIReference/API_CreateCacheSubnetGroup.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnSecurityGroup cfnSecurityGroup = CfnSecurityGroup.Builder.create(this, "MyCfnSecurityGroup")
 * .description("description")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html)
 */
public open class CfnSecurityGroup(
  cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityGroupProps,
  ) :
      this(software.amazon.awscdk.services.elasticache.CfnSecurityGroup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSecurityGroupProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSecurityGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSecurityGroupProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description for the cache security group.
   */
  public open fun description(): String = unwrap(this).getDescription()

  /**
   * A description for the cache security group.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A tag that can be added to an ElastiCache security group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A tag that can be added to an ElastiCache security group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A tag that can be added to an ElastiCache security group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticache.CfnSecurityGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description for the cache security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html#cfn-elasticache-securitygroup-description)
     * @param description A description for the cache security group. 
     */
    public fun description(description: String)

    /**
     * A tag that can be added to an ElastiCache security group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * security groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html#cfn-elasticache-securitygroup-tags)
     * @param tags A tag that can be added to an ElastiCache security group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A tag that can be added to an ElastiCache security group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * security groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html#cfn-elasticache-securitygroup-tags)
     * @param tags A tag that can be added to an ElastiCache security group. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnSecurityGroup.Builder =
        software.amazon.awscdk.services.elasticache.CfnSecurityGroup.Builder.create(scope, id)

    /**
     * A description for the cache security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html#cfn-elasticache-securitygroup-description)
     * @param description A description for the cache security group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A tag that can be added to an ElastiCache security group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * security groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html#cfn-elasticache-securitygroup-tags)
     * @param tags A tag that can be added to an ElastiCache security group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A tag that can be added to an ElastiCache security group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * security groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html#cfn-elasticache-securitygroup-tags)
     * @param tags A tag that can be added to an ElastiCache security group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnSecurityGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticache.CfnSecurityGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSecurityGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSecurityGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroup):
        CfnSecurityGroup = CfnSecurityGroup(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroup):
        software.amazon.awscdk.services.elasticache.CfnSecurityGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.elasticache.CfnSecurityGroup
  }
}
