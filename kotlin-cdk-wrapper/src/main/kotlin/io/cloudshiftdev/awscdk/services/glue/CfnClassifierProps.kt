@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnClassifierProps {
  public fun csvClassifier(): Any? = unwrap(this).getCsvClassifier()

  public fun grokClassifier(): Any? = unwrap(this).getGrokClassifier()

  public fun jsonClassifier(): Any? = unwrap(this).getJsonClassifier()

  public fun xmlClassifier(): Any? = unwrap(this).getXmlClassifier()

  @CdkDslMarker
  public interface Builder {
    public fun csvClassifier(csvClassifier: IResolvable)

    public fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7559b7c2b913f0afc5a442b810dc5a7adf35815d2973a0b9b255b6e565168595")
    public fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty.Builder.() -> Unit)

    public fun grokClassifier(grokClassifier: IResolvable)

    public fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7d8f13e8767596333d6fe10a942ea6a7c64b4e6fa5e982df49b75f2124506ce")
    public
        fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty.Builder.() -> Unit)

    public fun jsonClassifier(jsonClassifier: IResolvable)

    public fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ff448ecc147eb235b6df53d9e732339c04409d6a37ccf00c5afff7459a9e0a9")
    public
        fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty.Builder.() -> Unit)

    public fun xmlClassifier(xmlClassifier: IResolvable)

    public fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8a4c9481a500041da74fef2eaa130373aace84cf1e2307b3a4a198a612a78e2")
    public fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnClassifierProps.Builder =
        software.amazon.awscdk.services.glue.CfnClassifierProps.builder()

    override fun csvClassifier(csvClassifier: IResolvable) {
      cdkBuilder.csvClassifier(csvClassifier.let(IResolvable::unwrap))
    }

    override fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty) {
      cdkBuilder.csvClassifier(csvClassifier.let(CfnClassifier.CsvClassifierProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7559b7c2b913f0afc5a442b810dc5a7adf35815d2973a0b9b255b6e565168595")
    override
        fun csvClassifier(csvClassifier: CfnClassifier.CsvClassifierProperty.Builder.() -> Unit):
        Unit = csvClassifier(CfnClassifier.CsvClassifierProperty(csvClassifier))

    override fun grokClassifier(grokClassifier: IResolvable) {
      cdkBuilder.grokClassifier(grokClassifier.let(IResolvable::unwrap))
    }

    override fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty) {
      cdkBuilder.grokClassifier(grokClassifier.let(CfnClassifier.GrokClassifierProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7d8f13e8767596333d6fe10a942ea6a7c64b4e6fa5e982df49b75f2124506ce")
    override
        fun grokClassifier(grokClassifier: CfnClassifier.GrokClassifierProperty.Builder.() -> Unit):
        Unit = grokClassifier(CfnClassifier.GrokClassifierProperty(grokClassifier))

    override fun jsonClassifier(jsonClassifier: IResolvable) {
      cdkBuilder.jsonClassifier(jsonClassifier.let(IResolvable::unwrap))
    }

    override fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty) {
      cdkBuilder.jsonClassifier(jsonClassifier.let(CfnClassifier.JsonClassifierProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0ff448ecc147eb235b6df53d9e732339c04409d6a37ccf00c5afff7459a9e0a9")
    override
        fun jsonClassifier(jsonClassifier: CfnClassifier.JsonClassifierProperty.Builder.() -> Unit):
        Unit = jsonClassifier(CfnClassifier.JsonClassifierProperty(jsonClassifier))

    override fun xmlClassifier(xmlClassifier: IResolvable) {
      cdkBuilder.xmlClassifier(xmlClassifier.let(IResolvable::unwrap))
    }

    override fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty) {
      cdkBuilder.xmlClassifier(xmlClassifier.let(CfnClassifier.XMLClassifierProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8a4c9481a500041da74fef2eaa130373aace84cf1e2307b3a4a198a612a78e2")
    override
        fun xmlClassifier(xmlClassifier: CfnClassifier.XMLClassifierProperty.Builder.() -> Unit):
        Unit = xmlClassifier(CfnClassifier.XMLClassifierProperty(xmlClassifier))

    public fun build(): software.amazon.awscdk.services.glue.CfnClassifierProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnClassifierProps,
  ) : CdkObject(cdkObject), CfnClassifierProps {
    override fun csvClassifier(): Any? = unwrap(this).getCsvClassifier()

    override fun grokClassifier(): Any? = unwrap(this).getGrokClassifier()

    override fun jsonClassifier(): Any? = unwrap(this).getJsonClassifier()

    override fun xmlClassifier(): Any? = unwrap(this).getXmlClassifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClassifierProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnClassifierProps):
        CfnClassifierProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClassifierProps):
        software.amazon.awscdk.services.glue.CfnClassifierProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.glue.CfnClassifierProps
  }
}
