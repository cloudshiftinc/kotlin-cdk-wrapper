@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudformation

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnHookTypeConfigProps {
  public fun configuration(): String

  public fun configurationAlias(): String? = unwrap(this).getConfigurationAlias()

  public fun typeArn(): String? = unwrap(this).getTypeArn()

  public fun typeName(): String? = unwrap(this).getTypeName()

  @CdkDslMarker
  public interface Builder {
    public fun configuration(configuration: String)

    public fun configurationAlias(configurationAlias: String)

    public fun typeArn(typeArn: String)

    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps.Builder =
        software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps.builder()

    override fun configuration(configuration: String) {
      cdkBuilder.configuration(configuration)
    }

    override fun configurationAlias(configurationAlias: String) {
      cdkBuilder.configurationAlias(configurationAlias)
    }

    override fun typeArn(typeArn: String) {
      cdkBuilder.typeArn(typeArn)
    }

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps,
  ) : CdkObject(cdkObject), CfnHookTypeConfigProps {
    override fun configuration(): String = unwrap(this).getConfiguration()

    override fun configurationAlias(): String? = unwrap(this).getConfigurationAlias()

    override fun typeArn(): String? = unwrap(this).getTypeArn()

    override fun typeName(): String? = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnHookTypeConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps):
        CfnHookTypeConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnHookTypeConfigProps):
        software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cloudformation.CfnHookTypeConfigProps
  }
}
