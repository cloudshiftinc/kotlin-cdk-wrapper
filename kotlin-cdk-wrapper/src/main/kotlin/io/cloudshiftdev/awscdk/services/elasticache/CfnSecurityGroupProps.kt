@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSecurityGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticache.*;
 * CfnSecurityGroupProps cfnSecurityGroupProps = CfnSecurityGroupProps.builder()
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
public interface CfnSecurityGroupProps {
  /**
   * A description for the cache security group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html#cfn-elasticache-securitygroup-description)
   */
  public fun description(): String

  /**
   * A tag that can be added to an ElastiCache security group.
   *
   * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
   * security groups. A tag with a null Value is permitted.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html#cfn-elasticache-securitygroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnSecurityGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the cache security group. 
     */
    public fun description(description: String)

    /**
     * @param tags A tag that can be added to an ElastiCache security group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * security groups. A tag with a null Value is permitted.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A tag that can be added to an ElastiCache security group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * security groups. A tag with a null Value is permitted.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps.builder()

    /**
     * @param description A description for the cache security group. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param tags A tag that can be added to an ElastiCache security group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * security groups. A tag with a null Value is permitted.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A tag that can be added to an ElastiCache security group.
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * security groups. A tag with a null Value is permitted.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps,
  ) : CdkObject(cdkObject), CfnSecurityGroupProps {
    /**
     * A description for the cache security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html#cfn-elasticache-securitygroup-description)
     */
    override fun description(): String = unwrap(this).getDescription()

    /**
     * A tag that can be added to an ElastiCache security group.
     *
     * Tags are composed of a Key/Value pair. You can use tags to categorize and track all your
     * security groups. A tag with a null Value is permitted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticache-securitygroup.html#cfn-elasticache-securitygroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps):
        CfnSecurityGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityGroupProps):
        software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticache.CfnSecurityGroupProps
  }
}
