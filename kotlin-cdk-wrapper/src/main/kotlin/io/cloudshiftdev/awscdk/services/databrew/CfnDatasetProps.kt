@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDatasetProps {
  public fun format(): String? = unwrap(this).getFormat()

  public fun formatOptions(): Any? = unwrap(this).getFormatOptions()

  public fun input(): Any

  public fun name(): String

  public fun pathOptions(): Any? = unwrap(this).getPathOptions()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun format(format: String)

    public fun formatOptions(formatOptions: IResolvable)

    public fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4deaca63807d44b4c625ffd9c847ac5ca86181d42412bd3e9c47e0d97f735d0")
    public fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty.Builder.() -> Unit)

    public fun input(input: IResolvable)

    public fun input(input: CfnDataset.InputProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f013cf1ecace500063a17f672e3caead05eaf780a680a2d87630a7ffaf3ce5ed")
    public fun input(input: CfnDataset.InputProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun pathOptions(pathOptions: IResolvable)

    public fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5dd025b80104e8acc63e6144c3bdb40a4e3581dff482613280a7ee4078dea7")
    public fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnDatasetProps.Builder =
        software.amazon.awscdk.services.databrew.CfnDatasetProps.builder()

    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    override fun formatOptions(formatOptions: IResolvable) {
      cdkBuilder.formatOptions(formatOptions.let(IResolvable::unwrap))
    }

    override fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty) {
      cdkBuilder.formatOptions(formatOptions.let(CfnDataset.FormatOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4deaca63807d44b4c625ffd9c847ac5ca86181d42412bd3e9c47e0d97f735d0")
    override fun formatOptions(formatOptions: CfnDataset.FormatOptionsProperty.Builder.() -> Unit):
        Unit = formatOptions(CfnDataset.FormatOptionsProperty(formatOptions))

    override fun input(input: IResolvable) {
      cdkBuilder.input(input.let(IResolvable::unwrap))
    }

    override fun input(input: CfnDataset.InputProperty) {
      cdkBuilder.input(input.let(CfnDataset.InputProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f013cf1ecace500063a17f672e3caead05eaf780a680a2d87630a7ffaf3ce5ed")
    override fun input(input: CfnDataset.InputProperty.Builder.() -> Unit): Unit =
        input(CfnDataset.InputProperty(input))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun pathOptions(pathOptions: IResolvable) {
      cdkBuilder.pathOptions(pathOptions.let(IResolvable::unwrap))
    }

    override fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty) {
      cdkBuilder.pathOptions(pathOptions.let(CfnDataset.PathOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8d5dd025b80104e8acc63e6144c3bdb40a4e3581dff482613280a7ee4078dea7")
    override fun pathOptions(pathOptions: CfnDataset.PathOptionsProperty.Builder.() -> Unit): Unit =
        pathOptions(CfnDataset.PathOptionsProperty(pathOptions))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnDatasetProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.databrew.CfnDatasetProps,
  ) : CdkObject(cdkObject), CfnDatasetProps {
    override fun format(): String? = unwrap(this).getFormat()

    override fun formatOptions(): Any? = unwrap(this).getFormatOptions()

    override fun input(): Any = unwrap(this).getInput()

    override fun name(): String = unwrap(this).getName()

    override fun pathOptions(): Any? = unwrap(this).getPathOptions()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatasetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDatasetProps):
        CfnDatasetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatasetProps):
        software.amazon.awscdk.services.databrew.CfnDatasetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.databrew.CfnDatasetProps
  }
}
