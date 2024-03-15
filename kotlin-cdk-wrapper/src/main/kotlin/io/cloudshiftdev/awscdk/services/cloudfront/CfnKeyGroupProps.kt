@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnKeyGroupProps {
  public fun keyGroupConfig(): Any

  @CdkDslMarker
  public interface Builder {
    public fun keyGroupConfig(keyGroupConfig: IResolvable)

    public fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88705bd949bfebfa3739633b4175fed570a4c214b425cc4a01ff6089be932712")
    public fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps.builder()

    override fun keyGroupConfig(keyGroupConfig: IResolvable) {
      cdkBuilder.keyGroupConfig(keyGroupConfig.let(IResolvable::unwrap))
    }

    override fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty) {
      cdkBuilder.keyGroupConfig(keyGroupConfig.let(CfnKeyGroup.KeyGroupConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88705bd949bfebfa3739633b4175fed570a4c214b425cc4a01ff6089be932712")
    override
        fun keyGroupConfig(keyGroupConfig: CfnKeyGroup.KeyGroupConfigProperty.Builder.() -> Unit):
        Unit = keyGroupConfig(CfnKeyGroup.KeyGroupConfigProperty(keyGroupConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps,
  ) : CdkObject(cdkObject), CfnKeyGroupProps {
    override fun keyGroupConfig(): Any = unwrap(this).getKeyGroupConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeyGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps):
        CfnKeyGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeyGroupProps):
        software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnKeyGroupProps
  }
}
