@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnPublicKeyProps {
  public fun publicKeyConfig(): Any

  @CdkDslMarker
  public interface Builder {
    public fun publicKeyConfig(publicKeyConfig: IResolvable)

    public fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("668258ebd243d2e60b2cac045f934d9bece5add5db46f94c9cb13c6c8fcadafd")
    public
        fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps.builder()

    override fun publicKeyConfig(publicKeyConfig: IResolvable) {
      cdkBuilder.publicKeyConfig(publicKeyConfig.let(IResolvable::unwrap))
    }

    override fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty) {
      cdkBuilder.publicKeyConfig(publicKeyConfig.let(CfnPublicKey.PublicKeyConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("668258ebd243d2e60b2cac045f934d9bece5add5db46f94c9cb13c6c8fcadafd")
    override
        fun publicKeyConfig(publicKeyConfig: CfnPublicKey.PublicKeyConfigProperty.Builder.() -> Unit):
        Unit = publicKeyConfig(CfnPublicKey.PublicKeyConfigProperty(publicKeyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps,
  ) : CdkObject(cdkObject), CfnPublicKeyProps {
    override fun publicKeyConfig(): Any = unwrap(this).getPublicKeyConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPublicKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps):
        CfnPublicKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPublicKeyProps):
        software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps
  }
}
