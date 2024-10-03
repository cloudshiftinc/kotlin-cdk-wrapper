@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnInstance`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sso.*;
 * CfnInstanceProps cfnInstanceProps = CfnInstanceProps.builder()
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html)
 */
public interface CfnInstanceProps {
  /**
   * The name of the Identity Center instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html#cfn-sso-instance-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Specifies tags to be attached to the instance of IAM Identity Center.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html#cfn-sso-instance-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnInstanceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the Identity Center instance.
     */
    public fun name(name: String)

    /**
     * @param tags Specifies tags to be attached to the instance of IAM Identity Center.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies tags to be attached to the instance of IAM Identity Center.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnInstanceProps.Builder =
        software.amazon.awscdk.services.sso.CfnInstanceProps.builder()

    /**
     * @param name The name of the Identity Center instance.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Specifies tags to be attached to the instance of IAM Identity Center.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Specifies tags to be attached to the instance of IAM Identity Center.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sso.CfnInstanceProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sso.CfnInstanceProps,
  ) : CdkObject(cdkObject),
      CfnInstanceProps {
    /**
     * The name of the Identity Center instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html#cfn-sso-instance-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specifies tags to be attached to the instance of IAM Identity Center.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instance.html#cfn-sso-instance-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnInstanceProps):
        CfnInstanceProps = CdkObjectWrappers.wrap(cdkObject) as? CfnInstanceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProps):
        software.amazon.awscdk.services.sso.CfnInstanceProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sso.CfnInstanceProps
  }
}
