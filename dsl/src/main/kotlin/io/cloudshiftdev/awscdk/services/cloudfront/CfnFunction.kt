package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnFunction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunction,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrFunctionArn(): String = unwrap(this).getAttrFunctionArn()

  public open fun attrFunctionMetadataFunctionArn(): String =
      unwrap(this).getAttrFunctionMetadataFunctionArn()

  public open fun attrStage(): String = unwrap(this).getAttrStage()

  public open fun autoPublish(): Any? = unwrap(this).getAutoPublish()

  public open fun autoPublish(`value`: Boolean) {
    unwrap(this).setAutoPublish(`value`)
  }

  public open fun autoPublish(`value`: IResolvable) {
    unwrap(this).setAutoPublish(`value`.let(IResolvable::unwrap))
  }

  public open fun functionCode(): String = unwrap(this).getFunctionCode()

  public open fun functionCode(`value`: String) {
    unwrap(this).setFunctionCode(`value`)
  }

  public open fun functionConfig(): Any = unwrap(this).getFunctionConfig()

  public open fun functionConfig(`value`: IResolvable) {
    unwrap(this).setFunctionConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun functionConfig(`value`: FunctionConfigProperty) {
    unwrap(this).setFunctionConfig(`value`.let(FunctionConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d912ed670a3ed0b41b0337bba5deb4a03a5b2a78d72502f6996ffa6e761d20ca")
  public open fun functionConfig(`value`: FunctionConfigProperty.Builder.() -> Unit): Unit =
      functionConfig(FunctionConfigProperty(`value`))

  public open fun functionMetadata(): Any? = unwrap(this).getFunctionMetadata()

  public open fun functionMetadata(`value`: IResolvable) {
    unwrap(this).setFunctionMetadata(`value`.let(IResolvable::unwrap))
  }

  public open fun functionMetadata(`value`: FunctionMetadataProperty) {
    unwrap(this).setFunctionMetadata(`value`.let(FunctionMetadataProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c649f2b311bf6e070d9e89c5aaf1ca59c8567f1f17657c5cd93b5a8a0cb18ea1")
  public open fun functionMetadata(`value`: FunctionMetadataProperty.Builder.() -> Unit): Unit =
      functionMetadata(FunctionMetadataProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun autoPublish(autoPublish: Boolean)

    public fun autoPublish(autoPublish: IResolvable)

    public fun functionCode(functionCode: String)

    public fun functionConfig(functionConfig: IResolvable)

    public fun functionConfig(functionConfig: FunctionConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fce6d74021529b7d490dff859dc0036e222c115069813d8f548ff68f74b843bc")
    public fun functionConfig(functionConfig: FunctionConfigProperty.Builder.() -> Unit)

    public fun functionMetadata(functionMetadata: IResolvable)

    public fun functionMetadata(functionMetadata: FunctionMetadataProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d795f119cc42115758eadb9d3fbc68e16bd1a5de441d59689f44259f847f0d41")
    public fun functionMetadata(functionMetadata: FunctionMetadataProperty.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnFunction.Builder =
        software.amazon.awscdk.services.cloudfront.CfnFunction.Builder.create(scope, id)

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

    override fun functionConfig(functionConfig: FunctionConfigProperty) {
      cdkBuilder.functionConfig(functionConfig.let(FunctionConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fce6d74021529b7d490dff859dc0036e222c115069813d8f548ff68f74b843bc")
    override fun functionConfig(functionConfig: FunctionConfigProperty.Builder.() -> Unit): Unit =
        functionConfig(FunctionConfigProperty(functionConfig))

    override fun functionMetadata(functionMetadata: IResolvable) {
      cdkBuilder.functionMetadata(functionMetadata.let(IResolvable::unwrap))
    }

    override fun functionMetadata(functionMetadata: FunctionMetadataProperty) {
      cdkBuilder.functionMetadata(functionMetadata.let(FunctionMetadataProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d795f119cc42115758eadb9d3fbc68e16bd1a5de441d59689f44259f847f0d41")
    override fun functionMetadata(functionMetadata: FunctionMetadataProperty.Builder.() -> Unit):
        Unit = functionMetadata(FunctionMetadataProperty(functionMetadata))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnFunction = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFunction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFunction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunction):
        CfnFunction = CfnFunction(cdkObject)

    internal fun unwrap(wrapped: CfnFunction):
        software.amazon.awscdk.services.cloudfront.CfnFunction = wrapped.cdkObject
  }

  public interface FunctionMetadataProperty {
    public fun functionArn(): String? = unwrap(this).getFunctionArn()

    public interface Builder {
      public fun functionArn(functionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty.builder()

      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty,
    ) : FunctionMetadataProperty {
      override fun functionArn(): String? = unwrap(this).getFunctionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty):
          FunctionMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionMetadataProperty):
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FunctionConfigProperty {
    public fun comment(): String

    public fun keyValueStoreAssociations(): Any? = unwrap(this).getKeyValueStoreAssociations()

    public fun runtime(): String

    public interface Builder {
      public fun comment(comment: String)

      public fun keyValueStoreAssociations(keyValueStoreAssociations: IResolvable)

      public fun keyValueStoreAssociations(keyValueStoreAssociations: List<Any>)

      public fun runtime(runtime: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty.Builder =
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty.builder()

      override fun comment(comment: String) {
        cdkBuilder.comment(comment)
      }

      override fun keyValueStoreAssociations(keyValueStoreAssociations: IResolvable) {
        cdkBuilder.keyValueStoreAssociations(keyValueStoreAssociations.let(IResolvable::unwrap))
      }

      override fun keyValueStoreAssociations(keyValueStoreAssociations: List<Any>) {
        cdkBuilder.keyValueStoreAssociations(keyValueStoreAssociations)
      }

      override fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty,
    ) : FunctionConfigProperty {
      override fun comment(): String = unwrap(this).getComment()

      override fun keyValueStoreAssociations(): Any? = unwrap(this).getKeyValueStoreAssociations()

      override fun runtime(): String = unwrap(this).getRuntime()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FunctionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty):
          FunctionConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FunctionConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface KeyValueStoreAssociationProperty {
    public fun keyValueStoreArn(): String

    public interface Builder {
      public fun keyValueStoreArn(keyValueStoreArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty.builder()

      override fun keyValueStoreArn(keyValueStoreArn: String) {
        cdkBuilder.keyValueStoreArn(keyValueStoreArn)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty,
    ) : KeyValueStoreAssociationProperty {
      override fun keyValueStoreArn(): String = unwrap(this).getKeyValueStoreArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValueStoreAssociationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty):
          KeyValueStoreAssociationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValueStoreAssociationProperty):
          software.amazon.awscdk.services.cloudfront.CfnFunction.KeyValueStoreAssociationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
