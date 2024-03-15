@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnOriginAccessControl`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnOriginAccessControlProps cfnOriginAccessControlProps = CfnOriginAccessControlProps.builder()
 * .originAccessControlConfig(OriginAccessControlConfigProperty.builder()
 * .name("name")
 * .originAccessControlOriginType("originAccessControlOriginType")
 * .signingBehavior("signingBehavior")
 * .signingProtocol("signingProtocol")
 * // the properties below are optional
 * .description("description")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html)
 */
public interface CfnOriginAccessControlProps {
  /**
   * The origin access control.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig)
   */
  public fun originAccessControlConfig(): Any

  /**
   * A builder for [CfnOriginAccessControlProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param originAccessControlConfig The origin access control. 
     */
    public fun originAccessControlConfig(originAccessControlConfig: IResolvable)

    /**
     * @param originAccessControlConfig The origin access control. 
     */
    public
        fun originAccessControlConfig(originAccessControlConfig: CfnOriginAccessControl.OriginAccessControlConfigProperty)

    /**
     * @param originAccessControlConfig The origin access control. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d4d4844e44f794eb2dc7536f5830aef9f447225126a90244342639367790720")
    public
        fun originAccessControlConfig(originAccessControlConfig: CfnOriginAccessControl.OriginAccessControlConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps.builder()

    /**
     * @param originAccessControlConfig The origin access control. 
     */
    override fun originAccessControlConfig(originAccessControlConfig: IResolvable) {
      cdkBuilder.originAccessControlConfig(originAccessControlConfig.let(IResolvable::unwrap))
    }

    /**
     * @param originAccessControlConfig The origin access control. 
     */
    override
        fun originAccessControlConfig(originAccessControlConfig: CfnOriginAccessControl.OriginAccessControlConfigProperty) {
      cdkBuilder.originAccessControlConfig(originAccessControlConfig.let(CfnOriginAccessControl.OriginAccessControlConfigProperty::unwrap))
    }

    /**
     * @param originAccessControlConfig The origin access control. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d4d4844e44f794eb2dc7536f5830aef9f447225126a90244342639367790720")
    override
        fun originAccessControlConfig(originAccessControlConfig: CfnOriginAccessControl.OriginAccessControlConfigProperty.Builder.() -> Unit):
        Unit =
        originAccessControlConfig(CfnOriginAccessControl.OriginAccessControlConfigProperty(originAccessControlConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps,
  ) : CdkObject(cdkObject), CfnOriginAccessControlProps {
    /**
     * The origin access control.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-originaccesscontrol.html#cfn-cloudfront-originaccesscontrol-originaccesscontrolconfig)
     */
    override fun originAccessControlConfig(): Any = unwrap(this).getOriginAccessControlConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOriginAccessControlProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps):
        CfnOriginAccessControlProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOriginAccessControlProps):
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps
  }
}
