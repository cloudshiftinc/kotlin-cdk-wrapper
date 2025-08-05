@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnVpcOrigin`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnVpcOriginProps cfnVpcOriginProps = CfnVpcOriginProps.builder()
 * .vpcOriginEndpointConfig(VpcOriginEndpointConfigProperty.builder()
 * .arn("arn")
 * .name("name")
 * // the properties below are optional
 * .httpPort(123)
 * .httpsPort(123)
 * .originProtocolPolicy("originProtocolPolicy")
 * .originSslProtocols(List.of("originSslProtocols"))
 * .build())
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html)
 */
public interface CfnVpcOriginProps {
  /**
   * A complex type that contains zero or more `Tag` elements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The VPC origin endpoint configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig)
   */
  public fun vpcOriginEndpointConfig(): Any

  /**
   * A builder for [CfnVpcOriginProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    public fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: IResolvable)

    /**
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    public
        fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: CfnVpcOrigin.VpcOriginEndpointConfigProperty)

    /**
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("342e4f61e349fc2a3f1dc94b89048f69700c38969eea4690c3a2a49b89ab2807")
    public
        fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: CfnVpcOrigin.VpcOriginEndpointConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnVpcOriginProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnVpcOriginProps.builder()

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A complex type that contains zero or more `Tag` elements.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    override fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: IResolvable) {
      cdkBuilder.vpcOriginEndpointConfig(vpcOriginEndpointConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    override
        fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: CfnVpcOrigin.VpcOriginEndpointConfigProperty) {
      cdkBuilder.vpcOriginEndpointConfig(vpcOriginEndpointConfig.let(CfnVpcOrigin.VpcOriginEndpointConfigProperty.Companion::unwrap))
    }

    /**
     * @param vpcOriginEndpointConfig The VPC origin endpoint configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("342e4f61e349fc2a3f1dc94b89048f69700c38969eea4690c3a2a49b89ab2807")
    override
        fun vpcOriginEndpointConfig(vpcOriginEndpointConfig: CfnVpcOrigin.VpcOriginEndpointConfigProperty.Builder.() -> Unit):
        Unit =
        vpcOriginEndpointConfig(CfnVpcOrigin.VpcOriginEndpointConfigProperty(vpcOriginEndpointConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnVpcOriginProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudfront.CfnVpcOriginProps,
  ) : CdkObject(cdkObject),
      CfnVpcOriginProps {
    /**
     * A complex type that contains zero or more `Tag` elements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The VPC origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-vpcorigin.html#cfn-cloudfront-vpcorigin-vpcoriginendpointconfig)
     */
    override fun vpcOriginEndpointConfig(): Any = unwrap(this).getVpcOriginEndpointConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVpcOriginProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnVpcOriginProps):
        CfnVpcOriginProps = CdkObjectWrappers.wrap(cdkObject) as? CfnVpcOriginProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVpcOriginProps):
        software.amazon.awscdk.services.cloudfront.CfnVpcOriginProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnVpcOriginProps
  }
}
