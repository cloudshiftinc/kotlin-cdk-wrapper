@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.memorydb

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnACL`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.memorydb.*;
 * CfnACLProps cfnACLProps = CfnACLProps.builder()
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
public interface CfnACLProps {
  /**
   * The name of the Access Control List.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-aclname)
   */
  public fun aclName(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The list of users that belong to the Access Control List.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-usernames)
   */
  public fun userNames(): List<String> = unwrap(this).getUserNames() ?: emptyList()

  /**
   * A builder for [CfnACLProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param aclName The name of the Access Control List. 
     */
    public fun aclName(aclName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userNames The list of users that belong to the Access Control List.
     */
    public fun userNames(userNames: List<String>)

    /**
     * @param userNames The list of users that belong to the Access Control List.
     */
    public fun userNames(vararg userNames: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnACLProps.Builder =
        software.amazon.awscdk.services.memorydb.CfnACLProps.builder()

    /**
     * @param aclName The name of the Access Control List. 
     */
    override fun aclName(aclName: String) {
      cdkBuilder.aclName(aclName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userNames The list of users that belong to the Access Control List.
     */
    override fun userNames(userNames: List<String>) {
      cdkBuilder.userNames(userNames)
    }

    /**
     * @param userNames The list of users that belong to the Access Control List.
     */
    override fun userNames(vararg userNames: String): Unit = userNames(userNames.toList())

    public fun build(): software.amazon.awscdk.services.memorydb.CfnACLProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.memorydb.CfnACLProps,
  ) : CdkObject(cdkObject), CfnACLProps {
    /**
     * The name of the Access Control List.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-aclname)
     */
    override fun aclName(): String = unwrap(this).getAclName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The list of users that belong to the Access Control List.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-memorydb-acl.html#cfn-memorydb-acl-usernames)
     */
    override fun userNames(): List<String> = unwrap(this).getUserNames() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnACLProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnACLProps): CfnACLProps
        = CdkObjectWrappers.wrap(cdkObject) as? CfnACLProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnACLProps): software.amazon.awscdk.services.memorydb.CfnACLProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.memorydb.CfnACLProps
  }
}
