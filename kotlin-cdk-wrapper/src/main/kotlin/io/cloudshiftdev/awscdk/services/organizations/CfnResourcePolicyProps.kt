@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.organizations

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnResourcePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.organizations.*;
 * Object content;
 * CfnResourcePolicyProps cfnResourcePolicyProps = CfnResourcePolicyProps.builder()
 * .content(content)
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html)
 */
public interface CfnResourcePolicyProps {
  /**
   * The policy text of the organization resource policy.
   *
   * You can specify the resource policy content as a JSON object or a JSON string.
   *
   *
   * When you specify the resource policy content as a JSON string, you can't perform drift
   * detection on the CloudFormation stack. For this reason, we recommend specifying the resource
   * policy content as a JSON object instead.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html#cfn-organizations-resourcepolicy-content)
   */
  public fun content(): Any

  /**
   * A list of tags that you want to attach to the newly created resource policy.
   *
   * For each tag in the list, you must specify both a tag key and a value. You can set the value to
   * an empty string, but you can't set it to `null` . For more information about tagging, see [Tagging
   * AWS Organizations
   * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
   * *AWS Organizations User Guide* .
   *
   *
   * If any one of the tags is not valid or if you exceed the allowed number of tags for the
   * resource policy, then the entire request fails and the resource policy is not created.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html#cfn-organizations-resourcepolicy-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnResourcePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param content The policy text of the organization resource policy. 
     * You can specify the resource policy content as a JSON object or a JSON string.
     *
     *
     * When you specify the resource policy content as a JSON string, you can't perform drift
     * detection on the CloudFormation stack. For this reason, we recommend specifying the resource
     * policy content as a JSON object instead.
     */
    public fun content(content: Any)

    /**
     * @param tags A list of tags that you want to attach to the newly created resource policy.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * *AWS Organizations User Guide* .
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for the
     * resource policy, then the entire request fails and the resource policy is not created.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of tags that you want to attach to the newly created resource policy.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * *AWS Organizations User Guide* .
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for the
     * resource policy, then the entire request fails and the resource policy is not created.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.organizations.CfnResourcePolicyProps.Builder =
        software.amazon.awscdk.services.organizations.CfnResourcePolicyProps.builder()

    /**
     * @param content The policy text of the organization resource policy. 
     * You can specify the resource policy content as a JSON object or a JSON string.
     *
     *
     * When you specify the resource policy content as a JSON string, you can't perform drift
     * detection on the CloudFormation stack. For this reason, we recommend specifying the resource
     * policy content as a JSON object instead.
     */
    override fun content(content: Any) {
      cdkBuilder.content(content)
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created resource policy.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * *AWS Organizations User Guide* .
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for the
     * resource policy, then the entire request fails and the resource policy is not created.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of tags that you want to attach to the newly created resource policy.
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * *AWS Organizations User Guide* .
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for the
     * resource policy, then the entire request fails and the resource policy is not created.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.organizations.CfnResourcePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.organizations.CfnResourcePolicyProps,
  ) : CdkObject(cdkObject), CfnResourcePolicyProps {
    /**
     * The policy text of the organization resource policy.
     *
     * You can specify the resource policy content as a JSON object or a JSON string.
     *
     *
     * When you specify the resource policy content as a JSON string, you can't perform drift
     * detection on the CloudFormation stack. For this reason, we recommend specifying the resource
     * policy content as a JSON object instead.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html#cfn-organizations-resourcepolicy-content)
     */
    override fun content(): Any = unwrap(this).getContent()

    /**
     * A list of tags that you want to attach to the newly created resource policy.
     *
     * For each tag in the list, you must specify both a tag key and a value. You can set the value
     * to an empty string, but you can't set it to `null` . For more information about tagging, see
     * [Tagging AWS Organizations
     * resources](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_tagging.html) in the
     * *AWS Organizations User Guide* .
     *
     *
     * If any one of the tags is not valid or if you exceed the allowed number of tags for the
     * resource policy, then the entire request fails and the resource policy is not created.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-organizations-resourcepolicy.html#cfn-organizations-resourcepolicy-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourcePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.organizations.CfnResourcePolicyProps):
        CfnResourcePolicyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnResourcePolicyProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourcePolicyProps):
        software.amazon.awscdk.services.organizations.CfnResourcePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.organizations.CfnResourcePolicyProps
  }
}
