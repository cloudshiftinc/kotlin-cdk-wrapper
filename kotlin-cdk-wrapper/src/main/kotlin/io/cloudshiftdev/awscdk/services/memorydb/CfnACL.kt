@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

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
 * Specifies an Access Control List.
 *
 * For more information, see [Authenticating users with Access Contol Lists
 * (ACLs)](https://docs.aws.amazon.com/memorydb/latest/devguide/clusters.acls.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.memorydb.*;
 * CfnACL cfnACL = CfnACL.Builder.create(this, "MyCfnACL")
 * .aclName("aclName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userNames(List.of("userNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html)
 */
public open class CfnACL internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.memorydb.CfnACL,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnACLProps,
  ) :
      this(software.amazon.awscdk.services.memorydb.CfnACL(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnACLProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnACLProps.Builder.() -> Unit,
  ) : this(scope, id, CfnACLProps(props)
  )

  /**
   * The name of the Access Control List.
   */
  public open fun aclName(): String = unwrap(this).getAclName()

  /**
   * The name of the Access Control List.
   */
  public open fun aclName(`value`: String) {
    unwrap(this).setAclName(`value`)
  }

  /**
   * When you pass the logical ID of this resource to the intrinsic `Ref` function, Ref returns the
   * ARN of the Access Control List, such as `arn:aws:memorydb:us-east-1:123456789012:acl/my-acl`.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Indicates ACL status.
   *
   * *Valid values* : `creating` | `active` | `modifying` | `deleting`
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

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
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The list of users that belong to the Access Control List.
   */
  public open fun userNames(): List<String> = unwrap(this).getUserNames() ?: emptyList()

  /**
   * The list of users that belong to the Access Control List.
   */
  public open fun userNames(`value`: List<String>) {
    unwrap(this).setUserNames(`value`)
  }

  /**
   * The list of users that belong to the Access Control List.
   */
  public open fun userNames(vararg `value`: String): Unit = userNames(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.memorydb.CfnACL].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the Access Control List.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-aclname)
     * @param aclName The name of the Access Control List. 
     */
    public fun aclName(aclName: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The list of users that belong to the Access Control List.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-usernames)
     * @param userNames The list of users that belong to the Access Control List. 
     */
    public fun userNames(userNames: List<String>)

    /**
     * The list of users that belong to the Access Control List.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-usernames)
     * @param userNames The list of users that belong to the Access Control List. 
     */
    public fun userNames(vararg userNames: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnACL.Builder =
        software.amazon.awscdk.services.memorydb.CfnACL.Builder.create(scope, id)

    /**
     * The name of the Access Control List.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-aclname)
     * @param aclName The name of the Access Control List. 
     */
    override fun aclName(aclName: String) {
      cdkBuilder.aclName(aclName)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The list of users that belong to the Access Control List.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-usernames)
     * @param userNames The list of users that belong to the Access Control List. 
     */
    override fun userNames(userNames: List<String>) {
      cdkBuilder.userNames(userNames)
    }

    /**
     * The list of users that belong to the Access Control List.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-usernames)
     * @param userNames The list of users that belong to the Access Control List. 
     */
    override fun userNames(vararg userNames: String): Unit = userNames(userNames.toList())

    public fun build(): software.amazon.awscdk.services.memorydb.CfnACL = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.memorydb.CfnACL.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnACL {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnACL(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnACL): CfnACL =
        CfnACL(cdkObject)

    internal fun unwrap(wrapped: CfnACL): software.amazon.awscdk.services.memorydb.CfnACL =
        wrapped.cdkObject
  }
}
