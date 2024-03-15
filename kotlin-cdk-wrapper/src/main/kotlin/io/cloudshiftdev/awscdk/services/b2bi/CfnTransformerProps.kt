@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTransformerProps {
  public fun ediType(): Any

  public fun fileFormat(): String

  public fun mappingTemplate(): String

  public fun modifiedAt(): String? = unwrap(this).getModifiedAt()

  public fun name(): String

  public fun sampleDocument(): String? = unwrap(this).getSampleDocument()

  public fun status(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun ediType(ediType: IResolvable)

    public fun ediType(ediType: CfnTransformer.EdiTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43dfb7623ba7c0be3753c5a8e6d48637881f83f119dcc1a38e79a217562d2f85")
    public fun ediType(ediType: CfnTransformer.EdiTypeProperty.Builder.() -> Unit)

    public fun fileFormat(fileFormat: String)

    public fun mappingTemplate(mappingTemplate: String)

    public fun modifiedAt(modifiedAt: String)

    public fun name(name: String)

    public fun sampleDocument(sampleDocument: String)

    public fun status(status: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnTransformerProps.Builder =
        software.amazon.awscdk.services.b2bi.CfnTransformerProps.builder()

    override fun ediType(ediType: IResolvable) {
      cdkBuilder.ediType(ediType.let(IResolvable::unwrap))
    }

    override fun ediType(ediType: CfnTransformer.EdiTypeProperty) {
      cdkBuilder.ediType(ediType.let(CfnTransformer.EdiTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("43dfb7623ba7c0be3753c5a8e6d48637881f83f119dcc1a38e79a217562d2f85")
    override fun ediType(ediType: CfnTransformer.EdiTypeProperty.Builder.() -> Unit): Unit =
        ediType(CfnTransformer.EdiTypeProperty(ediType))

    override fun fileFormat(fileFormat: String) {
      cdkBuilder.fileFormat(fileFormat)
    }

    override fun mappingTemplate(mappingTemplate: String) {
      cdkBuilder.mappingTemplate(mappingTemplate)
    }

    override fun modifiedAt(modifiedAt: String) {
      cdkBuilder.modifiedAt(modifiedAt)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun sampleDocument(sampleDocument: String) {
      cdkBuilder.sampleDocument(sampleDocument)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.b2bi.CfnTransformerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformerProps,
  ) : CdkObject(cdkObject), CfnTransformerProps {
    override fun ediType(): Any = unwrap(this).getEdiType()

    override fun fileFormat(): String = unwrap(this).getFileFormat()

    override fun mappingTemplate(): String = unwrap(this).getMappingTemplate()

    override fun modifiedAt(): String? = unwrap(this).getModifiedAt()

    override fun name(): String = unwrap(this).getName()

    override fun sampleDocument(): String? = unwrap(this).getSampleDocument()

    override fun status(): String = unwrap(this).getStatus()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransformerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnTransformerProps):
        CfnTransformerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransformerProps):
        software.amazon.awscdk.services.b2bi.CfnTransformerProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.b2bi.CfnTransformerProps
  }
}
