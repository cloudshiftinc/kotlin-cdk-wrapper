@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnOriginAccessControlProps {
  public fun originAccessControlConfig(): Any

  @CdkDslMarker
  public interface Builder {
    public fun originAccessControlConfig(originAccessControlConfig: IResolvable)

    public
        fun originAccessControlConfig(originAccessControlConfig: CfnOriginAccessControl.OriginAccessControlConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d4d4844e44f794eb2dc7536f5830aef9f447225126a90244342639367790720")
    public
        fun originAccessControlConfig(originAccessControlConfig: CfnOriginAccessControl.OriginAccessControlConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnOriginAccessControlProps.builder()

    override fun originAccessControlConfig(originAccessControlConfig: IResolvable) {
      cdkBuilder.originAccessControlConfig(originAccessControlConfig.let(IResolvable::unwrap))
    }

    override
        fun originAccessControlConfig(originAccessControlConfig: CfnOriginAccessControl.OriginAccessControlConfigProperty) {
      cdkBuilder.originAccessControlConfig(originAccessControlConfig.let(CfnOriginAccessControl.OriginAccessControlConfigProperty::unwrap))
    }

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
