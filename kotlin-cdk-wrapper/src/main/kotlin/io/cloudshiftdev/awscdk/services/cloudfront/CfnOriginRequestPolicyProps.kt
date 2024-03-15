@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnOriginRequestPolicyProps {
  public fun originRequestPolicyConfig(): Any

  @CdkDslMarker
  public interface Builder {
    public fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable)

    public
        fun originRequestPolicyConfig(originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4982562ca569c3fdd76b6317d4458aa682e55ca7380b5c18d73f336307cf195a")
    public
        fun originRequestPolicyConfig(originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps.builder()

    override fun originRequestPolicyConfig(originRequestPolicyConfig: IResolvable) {
      cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig.let(IResolvable::unwrap))
    }

    override
        fun originRequestPolicyConfig(originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty) {
      cdkBuilder.originRequestPolicyConfig(originRequestPolicyConfig.let(CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4982562ca569c3fdd76b6317d4458aa682e55ca7380b5c18d73f336307cf195a")
    override
        fun originRequestPolicyConfig(originRequestPolicyConfig: CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        originRequestPolicyConfig(CfnOriginRequestPolicy.OriginRequestPolicyConfigProperty(originRequestPolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps,
  ) : CdkObject(cdkObject), CfnOriginRequestPolicyProps {
    override fun originRequestPolicyConfig(): Any = unwrap(this).getOriginRequestPolicyConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOriginRequestPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps):
        CfnOriginRequestPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOriginRequestPolicyProps):
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicyProps
  }
}
