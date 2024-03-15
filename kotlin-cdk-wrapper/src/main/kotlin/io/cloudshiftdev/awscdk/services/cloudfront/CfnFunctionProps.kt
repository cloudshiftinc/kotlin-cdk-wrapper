@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnFunctionProps {
  public fun autoPublish(): Any? = unwrap(this).getAutoPublish()

  public fun functionCode(): String

  public fun functionConfig(): Any

  public fun functionMetadata(): Any? = unwrap(this).getFunctionMetadata()

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun autoPublish(autoPublish: Boolean)

    public fun autoPublish(autoPublish: IResolvable)

    public fun functionCode(functionCode: String)

    public fun functionConfig(functionConfig: IResolvable)

    public fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abf836aa1432e8ae186b892d4d11c27da62ccda66f6b8ed59feca83059031fa5")
    public fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty.Builder.() -> Unit)

    public fun functionMetadata(functionMetadata: IResolvable)

    public fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77c70be04fb52a1846f7d7c8f7b5681da95a5df0066b40b9daa89f31a44ae89b")
    public
        fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnFunctionProps.Builder =
        software.amazon.awscdk.services.cloudfront.CfnFunctionProps.builder()

    override fun autoPublish(autoPublish: Boolean) {
      cdkBuilder.autoPublish(autoPublish)
    }

    override fun autoPublish(autoPublish: IResolvable) {
      cdkBuilder.autoPublish(autoPublish.let(IResolvable::unwrap))
    }

    override fun functionCode(functionCode: String) {
      cdkBuilder.functionCode(functionCode)
    }

    override fun functionConfig(functionConfig: IResolvable) {
      cdkBuilder.functionConfig(functionConfig.let(IResolvable::unwrap))
    }

    override fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty) {
      cdkBuilder.functionConfig(functionConfig.let(CfnFunction.FunctionConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("abf836aa1432e8ae186b892d4d11c27da62ccda66f6b8ed59feca83059031fa5")
    override
        fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty.Builder.() -> Unit):
        Unit = functionConfig(CfnFunction.FunctionConfigProperty(functionConfig))

    override fun functionMetadata(functionMetadata: IResolvable) {
      cdkBuilder.functionMetadata(functionMetadata.let(IResolvable::unwrap))
    }

    override fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty) {
      cdkBuilder.functionMetadata(functionMetadata.let(CfnFunction.FunctionMetadataProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77c70be04fb52a1846f7d7c8f7b5681da95a5df0066b40b9daa89f31a44ae89b")
    override
        fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty.Builder.() -> Unit):
        Unit = functionMetadata(CfnFunction.FunctionMetadataProperty(functionMetadata))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnFunctionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunctionProps,
  ) : CdkObject(cdkObject), CfnFunctionProps {
    override fun autoPublish(): Any? = unwrap(this).getAutoPublish()

    override fun functionCode(): String = unwrap(this).getFunctionCode()

    override fun functionConfig(): Any = unwrap(this).getFunctionConfig()

    override fun functionMetadata(): Any? = unwrap(this).getFunctionMetadata()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFunctionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunctionProps):
        CfnFunctionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFunctionProps):
        software.amazon.awscdk.services.cloudfront.CfnFunctionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnFunctionProps
  }
}
