@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.waf

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnByteMatchSet internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSet,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun byteMatchTuples(): Any? = unwrap(this).getByteMatchTuples()

  public open fun byteMatchTuples(`value`: IResolvable) {
    unwrap(this).setByteMatchTuples(`value`.let(IResolvable::unwrap))
  }

  public open fun byteMatchTuples(__idx_ac66f0: List<Any>) {
    unwrap(this).setByteMatchTuples(__idx_ac66f0)
  }

  public open fun byteMatchTuples(vararg __idx_ac66f0: Any): Unit =
      byteMatchTuples(__idx_ac66f0.toList())

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun byteMatchTuples(byteMatchTuples: IResolvable)

    public fun byteMatchTuples(byteMatchTuples: List<Any>)

    public fun byteMatchTuples(vararg byteMatchTuples: Any)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.waf.CfnByteMatchSet.Builder =
        software.amazon.awscdk.services.waf.CfnByteMatchSet.Builder.create(scope, id)

    override fun byteMatchTuples(byteMatchTuples: IResolvable) {
      cdkBuilder.byteMatchTuples(byteMatchTuples.let(IResolvable::unwrap))
    }

    override fun byteMatchTuples(byteMatchTuples: List<Any>) {
      cdkBuilder.byteMatchTuples(byteMatchTuples)
    }

    override fun byteMatchTuples(vararg byteMatchTuples: Any): Unit =
        byteMatchTuples(byteMatchTuples.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.waf.CfnByteMatchSet = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.waf.CfnByteMatchSet.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnByteMatchSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnByteMatchSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSet):
        CfnByteMatchSet = CfnByteMatchSet(cdkObject)

    internal fun unwrap(wrapped: CfnByteMatchSet):
        software.amazon.awscdk.services.waf.CfnByteMatchSet = wrapped.cdkObject
  }

  public interface ByteMatchTupleProperty {
    public fun fieldToMatch(): Any

    public fun positionalConstraint(): String

    public fun targetString(): String? = unwrap(this).getTargetString()

    public fun targetStringBase64(): String? = unwrap(this).getTargetStringBase64()

    public fun textTransformation(): String

    @CdkDslMarker
    public interface Builder {
      public fun fieldToMatch(fieldToMatch: IResolvable)

      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afb8058217b3308d25ea9d9c7fa8ef4fbd492d073d812f6635db35fb8b2e74e6")
      public fun fieldToMatch(fieldToMatch: FieldToMatchProperty.Builder.() -> Unit)

      public fun positionalConstraint(positionalConstraint: String)

      public fun targetString(targetString: String)

      public fun targetStringBase64(targetStringBase64: String)

      public fun textTransformation(textTransformation: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.Builder =
          software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty.builder()

      override fun fieldToMatch(fieldToMatch: IResolvable) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(IResolvable::unwrap))
      }

      override fun fieldToMatch(fieldToMatch: FieldToMatchProperty) {
        cdkBuilder.fieldToMatch(fieldToMatch.let(FieldToMatchProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("afb8058217b3308d25ea9d9c7fa8ef4fbd492d073d812f6635db35fb8b2e74e6")
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

      public fun build(): software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty,
    ) : CdkObject(cdkObject), ByteMatchTupleProperty {
      override fun fieldToMatch(): Any = unwrap(this).getFieldToMatch()

      override fun positionalConstraint(): String = unwrap(this).getPositionalConstraint()

      override fun targetString(): String? = unwrap(this).getTargetString()

      override fun targetStringBase64(): String? = unwrap(this).getTargetStringBase64()

      override fun textTransformation(): String = unwrap(this).getTextTransformation()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ByteMatchTupleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty):
          ByteMatchTupleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ByteMatchTupleProperty):
          software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.CfnByteMatchSet.ByteMatchTupleProperty
    }
  }

  public interface FieldToMatchProperty {
    public fun `data`(): String? = unwrap(this).getData()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun `data`(`data`: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty.Builder =
          software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty.builder()

      override fun `data`(`data`: String) {
        cdkBuilder.`data`(`data`)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty,
    ) : CdkObject(cdkObject), FieldToMatchProperty {
      override fun `data`(): String? = unwrap(this).getData()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FieldToMatchProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty):
          FieldToMatchProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FieldToMatchProperty):
          software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.waf.CfnByteMatchSet.FieldToMatchProperty
    }
  }
}
