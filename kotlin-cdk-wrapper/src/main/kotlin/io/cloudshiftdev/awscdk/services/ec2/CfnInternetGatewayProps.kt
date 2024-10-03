@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnInternetGateway`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnInternetGatewayProps cfnInternetGatewayProps = CfnInternetGatewayProps.builder()
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html)
 */
public interface CfnInternetGatewayProps {
  /**
   * Any tags to assign to the internet gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html#cfn-ec2-internetgateway-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnInternetGatewayProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tags Any tags to assign to the internet gateway.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags to assign to the internet gateway.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnInternetGatewayProps.Builder =
        software.amazon.awscdk.services.ec2.CfnInternetGatewayProps.builder()

    /**
     * @param tags Any tags to assign to the internet gateway.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Any tags to assign to the internet gateway.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnInternetGatewayProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnInternetGatewayProps,
  ) : CdkObject(cdkObject),
      CfnInternetGatewayProps {
    /**
     * Any tags to assign to the internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-internetgateway.html#cfn-ec2-internetgateway-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInternetGatewayProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnInternetGatewayProps):
        CfnInternetGatewayProps = CdkObjectWrappers.wrap(cdkObject) as? CfnInternetGatewayProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInternetGatewayProps):
        software.amazon.awscdk.services.ec2.CfnInternetGatewayProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnInternetGatewayProps
  }
}
