@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnClassifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnClassifier,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun csvClassifier(): Any? = unwrap(this).getCsvClassifier()

  public open fun csvClassifier(`value`: IResolvable) {
    unwrap(this).setCsvClassifier(`value`.let(IResolvable::unwrap))
  }

  public open fun csvClassifier(`value`: CsvClassifierProperty) {
    unwrap(this).setCsvClassifier(`value`.let(CsvClassifierProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26d42a195581c9d7499e99e21bfa83b5e6c077e0646353b1d6f9ec36fd9b12d4")
  public open fun csvClassifier(`value`: CsvClassifierProperty.Builder.() -> Unit): Unit =
      csvClassifier(CsvClassifierProperty(`value`))

  public open fun grokClassifier(): Any? = unwrap(this).getGrokClassifier()

  public open fun grokClassifier(`value`: IResolvable) {
    unwrap(this).setGrokClassifier(`value`.let(IResolvable::unwrap))
  }

  public open fun grokClassifier(`value`: GrokClassifierProperty) {
    unwrap(this).setGrokClassifier(`value`.let(GrokClassifierProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3c25cd51d3a198da2df2a79387516cbcc747b5bc9228546a7337eb7e36b2e176")
  public open fun grokClassifier(`value`: GrokClassifierProperty.Builder.() -> Unit): Unit =
      grokClassifier(GrokClassifierProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jsonClassifier(): Any? = unwrap(this).getJsonClassifier()

  public open fun jsonClassifier(`value`: IResolvable) {
    unwrap(this).setJsonClassifier(`value`.let(IResolvable::unwrap))
  }

  public open fun jsonClassifier(`value`: JsonClassifierProperty) {
    unwrap(this).setJsonClassifier(`value`.let(JsonClassifierProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0108531123dff689ff9883aaaafa8a8b195482264346a018d795f3c4650099f1")
  public open fun jsonClassifier(`value`: JsonClassifierProperty.Builder.() -> Unit): Unit =
      jsonClassifier(JsonClassifierProperty(`value`))

  public open fun xmlClassifier(): Any? = unwrap(this).getXmlClassifier()

  public open fun xmlClassifier(`value`: IResolvable) {
    unwrap(this).setXmlClassifier(`value`.let(IResolvable::unwrap))
  }

  public open fun xmlClassifier(`value`: XMLClassifierProperty) {
    unwrap(this).setXmlClassifier(`value`.let(XMLClassifierProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4f6703481404f179339b6132bf758a32462f982975c50b1d515696776f516f30")
  public open fun xmlClassifier(`value`: XMLClassifierProperty.Builder.() -> Unit): Unit =
      xmlClassifier(XMLClassifierProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun csvClassifier(csvClassifier: IResolvable)

    public fun csvClassifier(csvClassifier: CsvClassifierProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60a6f760c1629132bf7a085003785fc36dc516fed7fc6bcd3e6d075ac4994736")
    public fun csvClassifier(csvClassifier: CsvClassifierProperty.Builder.() -> Unit)

    public fun grokClassifier(grokClassifier: IResolvable)

    public fun grokClassifier(grokClassifier: GrokClassifierProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a8cd8b96e073bdb847bc460ed59f4f7357908441cfcd779bb731890445b35b2")
    public fun grokClassifier(grokClassifier: GrokClassifierProperty.Builder.() -> Unit)

    public fun jsonClassifier(jsonClassifier: IResolvable)

    public fun jsonClassifier(jsonClassifier: JsonClassifierProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f5deea49f8ca1c3de74ecacde35e74f6854219187c2773523245488e79e45a4")
    public fun jsonClassifier(jsonClassifier: JsonClassifierProperty.Builder.() -> Unit)

    public fun xmlClassifier(xmlClassifier: IResolvable)

    public fun xmlClassifier(xmlClassifier: XMLClassifierProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b23edc8214c9ed72c2206a65bc69461e3cbe1492253dd565ee3fd78fc1c82b19")
    public fun xmlClassifier(xmlClassifier: XMLClassifierProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnClassifier.Builder =
        software.amazon.awscdk.services.glue.CfnClassifier.Builder.create(scope, id)

    override fun csvClassifier(csvClassifier: IResolvable) {
      cdkBuilder.csvClassifier(csvClassifier.let(IResolvable::unwrap))
    }

    override fun csvClassifier(csvClassifier: CsvClassifierProperty) {
      cdkBuilder.csvClassifier(csvClassifier.let(CsvClassifierProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60a6f760c1629132bf7a085003785fc36dc516fed7fc6bcd3e6d075ac4994736")
    override fun csvClassifier(csvClassifier: CsvClassifierProperty.Builder.() -> Unit): Unit =
        csvClassifier(CsvClassifierProperty(csvClassifier))

    override fun grokClassifier(grokClassifier: IResolvable) {
      cdkBuilder.grokClassifier(grokClassifier.let(IResolvable::unwrap))
    }

    override fun grokClassifier(grokClassifier: GrokClassifierProperty) {
      cdkBuilder.grokClassifier(grokClassifier.let(GrokClassifierProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5a8cd8b96e073bdb847bc460ed59f4f7357908441cfcd779bb731890445b35b2")
    override fun grokClassifier(grokClassifier: GrokClassifierProperty.Builder.() -> Unit): Unit =
        grokClassifier(GrokClassifierProperty(grokClassifier))

    override fun jsonClassifier(jsonClassifier: IResolvable) {
      cdkBuilder.jsonClassifier(jsonClassifier.let(IResolvable::unwrap))
    }

    override fun jsonClassifier(jsonClassifier: JsonClassifierProperty) {
      cdkBuilder.jsonClassifier(jsonClassifier.let(JsonClassifierProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6f5deea49f8ca1c3de74ecacde35e74f6854219187c2773523245488e79e45a4")
    override fun jsonClassifier(jsonClassifier: JsonClassifierProperty.Builder.() -> Unit): Unit =
        jsonClassifier(JsonClassifierProperty(jsonClassifier))

    override fun xmlClassifier(xmlClassifier: IResolvable) {
      cdkBuilder.xmlClassifier(xmlClassifier.let(IResolvable::unwrap))
    }

    override fun xmlClassifier(xmlClassifier: XMLClassifierProperty) {
      cdkBuilder.xmlClassifier(xmlClassifier.let(XMLClassifierProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b23edc8214c9ed72c2206a65bc69461e3cbe1492253dd565ee3fd78fc1c82b19")
    override fun xmlClassifier(xmlClassifier: XMLClassifierProperty.Builder.() -> Unit): Unit =
        xmlClassifier(XMLClassifierProperty(xmlClassifier))

    public fun build(): software.amazon.awscdk.services.glue.CfnClassifier = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnClassifier.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClassifier {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClassifier(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifier): CfnClassifier
        = CfnClassifier(cdkObject)

    internal fun unwrap(wrapped: CfnClassifier): software.amazon.awscdk.services.glue.CfnClassifier
        = wrapped.cdkObject
  }

  public interface JsonClassifierProperty {
    public fun jsonPath(): String

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun jsonPath(jsonPath: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty.builder()

      override fun jsonPath(jsonPath: String) {
        cdkBuilder.jsonPath(jsonPath)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty,
    ) : CdkObject(cdkObject), JsonClassifierProperty {
      override fun jsonPath(): String = unwrap(this).getJsonPath()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonClassifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty):
          JsonClassifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonClassifierProperty):
          software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnClassifier.JsonClassifierProperty
    }
  }

  public interface GrokClassifierProperty {
    public fun classification(): String

    public fun customPatterns(): String? = unwrap(this).getCustomPatterns()

    public fun grokPattern(): String

    public fun name(): String? = unwrap(this).getName()

    @CdkDslMarker
    public interface Builder {
      public fun classification(classification: String)

      public fun customPatterns(customPatterns: String)

      public fun grokPattern(grokPattern: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty.builder()

      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      override fun customPatterns(customPatterns: String) {
        cdkBuilder.customPatterns(customPatterns)
      }

      override fun grokPattern(grokPattern: String) {
        cdkBuilder.grokPattern(grokPattern)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty,
    ) : CdkObject(cdkObject), GrokClassifierProperty {
      override fun classification(): String = unwrap(this).getClassification()

      override fun customPatterns(): String? = unwrap(this).getCustomPatterns()

      override fun grokPattern(): String = unwrap(this).getGrokPattern()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GrokClassifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty):
          GrokClassifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GrokClassifierProperty):
          software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnClassifier.GrokClassifierProperty
    }
  }

  public interface CsvClassifierProperty {
    public fun allowSingleColumn(): Any? = unwrap(this).getAllowSingleColumn()

    public fun containsCustomDatatype(): List<String> = unwrap(this).getContainsCustomDatatype() ?:
        emptyList()

    public fun containsHeader(): String? = unwrap(this).getContainsHeader()

    public fun customDatatypeConfigured(): Any? = unwrap(this).getCustomDatatypeConfigured()

    public fun delimiter(): String? = unwrap(this).getDelimiter()

    public fun disableValueTrimming(): Any? = unwrap(this).getDisableValueTrimming()

    public fun `header`(): List<String> = unwrap(this).getHeader() ?: emptyList()

    public fun name(): String? = unwrap(this).getName()

    public fun quoteSymbol(): String? = unwrap(this).getQuoteSymbol()

    @CdkDslMarker
    public interface Builder {
      public fun allowSingleColumn(allowSingleColumn: Boolean)

      public fun allowSingleColumn(allowSingleColumn: IResolvable)

      public fun containsCustomDatatype(containsCustomDatatype: List<String>)

      public fun containsCustomDatatype(vararg containsCustomDatatype: String)

      public fun containsHeader(containsHeader: String)

      public fun customDatatypeConfigured(customDatatypeConfigured: Boolean)

      public fun customDatatypeConfigured(customDatatypeConfigured: IResolvable)

      public fun delimiter(delimiter: String)

      public fun disableValueTrimming(disableValueTrimming: Boolean)

      public fun disableValueTrimming(disableValueTrimming: IResolvable)

      public fun `header`(`header`: List<String>)

      public fun `header`(vararg `header`: String)

      public fun name(name: String)

      public fun quoteSymbol(quoteSymbol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty.builder()

      override fun allowSingleColumn(allowSingleColumn: Boolean) {
        cdkBuilder.allowSingleColumn(allowSingleColumn)
      }

      override fun allowSingleColumn(allowSingleColumn: IResolvable) {
        cdkBuilder.allowSingleColumn(allowSingleColumn.let(IResolvable::unwrap))
      }

      override fun containsCustomDatatype(containsCustomDatatype: List<String>) {
        cdkBuilder.containsCustomDatatype(containsCustomDatatype)
      }

      override fun containsCustomDatatype(vararg containsCustomDatatype: String): Unit =
          containsCustomDatatype(containsCustomDatatype.toList())

      override fun containsHeader(containsHeader: String) {
        cdkBuilder.containsHeader(containsHeader)
      }

      override fun customDatatypeConfigured(customDatatypeConfigured: Boolean) {
        cdkBuilder.customDatatypeConfigured(customDatatypeConfigured)
      }

      override fun customDatatypeConfigured(customDatatypeConfigured: IResolvable) {
        cdkBuilder.customDatatypeConfigured(customDatatypeConfigured.let(IResolvable::unwrap))
      }

      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      override fun disableValueTrimming(disableValueTrimming: Boolean) {
        cdkBuilder.disableValueTrimming(disableValueTrimming)
      }

      override fun disableValueTrimming(disableValueTrimming: IResolvable) {
        cdkBuilder.disableValueTrimming(disableValueTrimming.let(IResolvable::unwrap))
      }

      override fun `header`(`header`: List<String>) {
        cdkBuilder.`header`(`header`)
      }

      override fun `header`(vararg `header`: String): Unit = `header`(`header`.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun quoteSymbol(quoteSymbol: String) {
        cdkBuilder.quoteSymbol(quoteSymbol)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty,
    ) : CdkObject(cdkObject), CsvClassifierProperty {
      override fun allowSingleColumn(): Any? = unwrap(this).getAllowSingleColumn()

      override fun containsCustomDatatype(): List<String> = unwrap(this).getContainsCustomDatatype()
          ?: emptyList()

      override fun containsHeader(): String? = unwrap(this).getContainsHeader()

      override fun customDatatypeConfigured(): Any? = unwrap(this).getCustomDatatypeConfigured()

      override fun delimiter(): String? = unwrap(this).getDelimiter()

      override fun disableValueTrimming(): Any? = unwrap(this).getDisableValueTrimming()

      override fun `header`(): List<String> = unwrap(this).getHeader() ?: emptyList()

      override fun name(): String? = unwrap(this).getName()

      override fun quoteSymbol(): String? = unwrap(this).getQuoteSymbol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsvClassifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty):
          CsvClassifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvClassifierProperty):
          software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnClassifier.CsvClassifierProperty
    }
  }

  public interface XMLClassifierProperty {
    public fun classification(): String

    public fun name(): String? = unwrap(this).getName()

    public fun rowTag(): String

    @CdkDslMarker
    public interface Builder {
      public fun classification(classification: String)

      public fun name(name: String)

      public fun rowTag(rowTag: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty.builder()

      override fun classification(classification: String) {
        cdkBuilder.classification(classification)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun rowTag(rowTag: String) {
        cdkBuilder.rowTag(rowTag)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty,
    ) : CdkObject(cdkObject), XMLClassifierProperty {
      override fun classification(): String = unwrap(this).getClassification()

      override fun name(): String? = unwrap(this).getName()

      override fun rowTag(): String = unwrap(this).getRowTag()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): XMLClassifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty):
          XMLClassifierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: XMLClassifierProperty):
          software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnClassifier.XMLClassifierProperty
    }
  }
}
