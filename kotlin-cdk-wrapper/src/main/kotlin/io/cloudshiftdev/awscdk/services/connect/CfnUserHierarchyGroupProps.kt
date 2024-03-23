@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnUserHierarchyGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.connect.*;
 * CfnUserHierarchyGroupProps cfnUserHierarchyGroupProps = CfnUserHierarchyGroupProps.builder()
 * .instanceArn("instanceArn")
 * .name("name")
 * // the properties below are optional
 * .parentGroupArn("parentGroupArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html)
 */
public interface CfnUserHierarchyGroupProps {
  /**
   * The Amazon Resource Name (ARN) of the user hierarchy group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html#cfn-connect-userhierarchygroup-instancearn)
   */
  public fun instanceArn(): String

  /**
   * The name of the user hierarchy group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html#cfn-connect-userhierarchygroup-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of the parent group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html#cfn-connect-userhierarchygroup-parentgrouparn)
   */
  public fun parentGroupArn(): String? = unwrap(this).getParentGroupArn()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html#cfn-connect-userhierarchygroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnUserHierarchyGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the user hierarchy group. 
     */
    public fun instanceArn(instanceArn: String)

    /**
     * @param name The name of the user hierarchy group. 
     */
    public fun name(name: String)

    /**
     * @param parentGroupArn The Amazon Resource Name (ARN) of the parent group.
     */
    public fun parentGroupArn(parentGroupArn: String)

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
        software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps.Builder =
        software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps.builder()

    /**
     * @param instanceArn The Amazon Resource Name (ARN) of the user hierarchy group. 
     */
    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    /**
     * @param name The name of the user hierarchy group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param parentGroupArn The Amazon Resource Name (ARN) of the parent group.
     */
    override fun parentGroupArn(parentGroupArn: String) {
      cdkBuilder.parentGroupArn(parentGroupArn)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps,
  ) : CdkObject(cdkObject), CfnUserHierarchyGroupProps {
    /**
     * The Amazon Resource Name (ARN) of the user hierarchy group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html#cfn-connect-userhierarchygroup-instancearn)
     */
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    /**
     * The name of the user hierarchy group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html#cfn-connect-userhierarchygroup-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of the parent group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html#cfn-connect-userhierarchygroup-parentgrouparn)
     */
    override fun parentGroupArn(): String? = unwrap(this).getParentGroupArn()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-userhierarchygroup.html#cfn-connect-userhierarchygroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserHierarchyGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps):
        CfnUserHierarchyGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnUserHierarchyGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserHierarchyGroupProps):
        software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnUserHierarchyGroupProps
  }
}
