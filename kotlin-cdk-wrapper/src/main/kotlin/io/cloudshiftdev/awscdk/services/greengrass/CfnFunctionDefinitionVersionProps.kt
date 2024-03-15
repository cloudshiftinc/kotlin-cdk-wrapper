@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFunctionDefinitionVersionProps {
  public fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

  public fun functionDefinitionId(): String

  public fun functions(): Any

  @CdkDslMarker
  public interface Builder {
    public fun defaultConfig(defaultConfig: IResolvable)

    public fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72e8a8fbd45c3987c4719cf5146f49005d607ef4201abddfde1130ad2b202f2d")
    public
        fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty.Builder.() -> Unit)

    public fun functionDefinitionId(functionDefinitionId: String)

    public fun functions(functions: IResolvable)

    public fun functions(functions: List<Any>)

    public fun functions(vararg functions: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps.builder()

    override fun defaultConfig(defaultConfig: IResolvable) {
      cdkBuilder.defaultConfig(defaultConfig.let(IResolvable::unwrap))
    }

    override fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty) {
      cdkBuilder.defaultConfig(defaultConfig.let(CfnFunctionDefinitionVersion.DefaultConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72e8a8fbd45c3987c4719cf5146f49005d607ef4201abddfde1130ad2b202f2d")
    override
        fun defaultConfig(defaultConfig: CfnFunctionDefinitionVersion.DefaultConfigProperty.Builder.() -> Unit):
        Unit = defaultConfig(CfnFunctionDefinitionVersion.DefaultConfigProperty(defaultConfig))

    override fun functionDefinitionId(functionDefinitionId: String) {
      cdkBuilder.functionDefinitionId(functionDefinitionId)
    }

    override fun functions(functions: IResolvable) {
      cdkBuilder.functions(functions.let(IResolvable::unwrap))
    }

    override fun functions(functions: List<Any>) {
      cdkBuilder.functions(functions)
    }

    override fun functions(vararg functions: Any): Unit = functions(functions.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnFunctionDefinitionVersionProps {
    override fun defaultConfig(): Any? = unwrap(this).getDefaultConfig()

    override fun functionDefinitionId(): String = unwrap(this).getFunctionDefinitionId()

    override fun functions(): Any = unwrap(this).getFunctions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps):
        CfnFunctionDefinitionVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnFunctionDefinitionVersionProps
  }
}
