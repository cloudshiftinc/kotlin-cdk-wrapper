package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPredefinedAttribute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnPredefinedAttribute,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun values(): Any = unwrap(this).getValues()

  public open fun values(`value`: IResolvable) {
    unwrap(this).setValues(`value`.let(IResolvable::unwrap))
  }

  public open fun values(`value`: ValuesProperty) {
    unwrap(this).setValues(`value`.let(ValuesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c969f79d1592c06ea11474ff7965a0a5b7c4a29fb2c4eb202d8edda231d604cf")
  public open fun values(`value`: ValuesProperty.Builder.() -> Unit): Unit =
      values(ValuesProperty(`value`))

  public interface Builder {
    public fun instanceArn(instanceArn: String) {
    }

    public fun name(name: String) {
    }

    public fun values(values: IResolvable) {
    }

    public fun values(values: ValuesProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ca05e794ede7220981b4a1b47c982b834db1d4785ca333d1e4e8f843ec36be5")
    public fun values(values: ValuesProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnPredefinedAttribute.Builder =
        software.amazon.awscdk.services.connect.CfnPredefinedAttribute.Builder.create(scope, id)

    public override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun values(values: IResolvable) {
      cdkBuilder.values(values.let(IResolvable::unwrap))
    }

    public override fun values(values: ValuesProperty) {
      cdkBuilder.values(values.let(ValuesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ca05e794ede7220981b4a1b47c982b834db1d4785ca333d1e4e8f843ec36be5")
    public override fun values(values: ValuesProperty.Builder.() -> Unit): Unit =
        values(ValuesProperty(values))

    public fun build(): software.amazon.awscdk.services.connect.CfnPredefinedAttribute =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPredefinedAttribute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPredefinedAttribute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPredefinedAttribute):
        CfnPredefinedAttribute = CfnPredefinedAttribute(cdkObject)

    internal fun unwrap(wrapped: CfnPredefinedAttribute):
        software.amazon.awscdk.services.connect.CfnPredefinedAttribute = wrapped.cdkObject
  }

  public interface ValuesProperty {
    public fun stringList(): List<String> = unwrap(this).getStringList() ?: emptyList()

    public interface Builder {
      public fun stringList(stringList: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty.Builder =
          software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty.builder()

      public override fun stringList(stringList: List<String>) {
        cdkBuilder.stringList(stringList)
      }

      public fun build():
          software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty,
    ) : ValuesProperty {
      public override fun stringList(): List<String> = unwrap(this).getStringList() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValuesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty):
          ValuesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValuesProperty):
          software.amazon.awscdk.services.connect.CfnPredefinedAttribute.ValuesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
