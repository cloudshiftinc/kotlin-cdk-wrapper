package io.cloudshiftdev.awscdk.services.waf.regional

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

public open class CfnByteMatchSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun byteMatchTuples(): Any? = unwrap(this).getByteMatchTuples()

  public open fun byteMatchTuples(`value`: IResolvable) {
    unwrap(this).setByteMatchTuples(`value`.let(IResolvable::unwrap))
  }

  public open fun byteMatchTuples(__idx_ac66f0: List<Any>) {
    unwrap(this).setByteMatchTuples(__idx_ac66f0)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun byteMatchTuples(byteMatchTuples: IResolvable)

    public fun byteMatchTuples(byteMatchTuples: List<Any>)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.Builder =
        software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.Builder.create(scope, id)

    override fun byteMatchTuples(byteMatchTuples: IResolvable) {
      cdkBuilder.byteMatchTuples(byteMatchTuples.let(IResolvable::unwrap))
    }

    override fun byteMatchTuples(byteMatchTuples: List<Any>) {
      cdkBuilder.byteMatchTuples(byteMatchTuples)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.regional.CfnByteMatchSet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnByteMatchSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnByteMatchSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet):
        CfnByteMatchSet = CfnByteMatchSet(cdkObject)

    internal fun unwrap(wrapped: CfnByteMatchSet):
        software.amazon.awscdk.services.waf.regional.CfnByteMatchSet = wrapped.cdkObject
  }

  public interface ByteMatchTupleProperty {
    public fun fieldToMatch(): Any

    public fun positionalConstraint(): String

    public fun targetString(): String? = unwrap(this).getTargetString()

    public fun targetStringBase64(): String? = unwrap(this).getTargetStringBase64()

    public fun textTransformation(): String

    public interface Builder {
      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("707acbb9af795be8650a72d4653d6e4e6a7fc0c2c2bb4cb1d10d23edd24e98f3")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun positionalConstraint(positionalConstraint: String)

      public fun targetString(targetString: String)

      public fun targetStringBase64(targetStringBase64: String)

      public fun textTransformation(textTransformation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("707acbb9af795be8650a72d4653d6e4e6a7fc0c2c2bb4cb1d10d23edd24e98f3")
      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit): Unit =
          fieldToMatch(FieldToMatchProperty(fieldToMatch))

      override fun positionalConstraint(positionalConstraint: String) {
        cdkBuilder.positionalConstraint(positionalConstraint)
      }

      override fun targetString(targetString: String) {
        cdkBuilder.targetString(targetString)
      }

      override fun targetStringBase64(targetStringBase64: String) {
        cdkBuilder.targetStringBase64(targetStringBase64)
      }

      override fun textTransformation(textTransformation: String) {
        cdkBuilder.textTransformation(textTransformation)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty,
    ) : ByteMatchTupleProperty {
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      override fun positionalConstraint(): String = unwrap(this).getPositionalConstraint()

      override fun targetString(): String? = unwrap(this).getTargetString()

      override fun targetStringBase64(): String? = unwrap(this).getTargetStringBase64()

      override fun textTransformation(): String = unwrap(this).getTextTransformation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ByteMatchTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty):
          ByteMatchTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ByteMatchTupleProperty):
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.ByteMatchTupleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FieldToMatchProperty {
    public fun `data`(): String? = unwrap(this).getData()

    public fun type(): String

    public interface Builder {
      public fun `data`(`data`: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty.Builder
          =
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty.builder()

      override fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty,
    ) : FieldToMatchProperty {
      override fun `data`(): String? = unwrap(this).getData()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.regional.CfnByteMatchSet.FieldToMatchProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
