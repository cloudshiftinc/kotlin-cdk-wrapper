@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStorageLensGroupProps {
  public fun filter(): Any

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun filter(filter: IResolvable)

    public fun filter(filter: CfnStorageLensGroup.FilterProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("978e6f5a2e9415841fa801dda7b16e69be0b2f44ba8f8444847eb16a01605d1c")
    public fun filter(filter: CfnStorageLensGroup.FilterProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.CfnStorageLensGroupProps.Builder =
        software.amazon.awscdk.services.s3.CfnStorageLensGroupProps.builder()

    override fun filter(filter: IResolvable) {
      cdkBuilder.filter(filter.let(IResolvable::unwrap))
    }

    override fun filter(filter: CfnStorageLensGroup.FilterProperty) {
      cdkBuilder.filter(filter.let(CfnStorageLensGroup.FilterProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("978e6f5a2e9415841fa801dda7b16e69be0b2f44ba8f8444847eb16a01605d1c")
    override fun filter(filter: CfnStorageLensGroup.FilterProperty.Builder.() -> Unit): Unit =
        filter(CfnStorageLensGroup.FilterProperty(filter))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3.CfnStorageLensGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroupProps,
  ) : CdkObject(cdkObject), CfnStorageLensGroupProps {
    override fun filter(): Any = unwrap(this).getFilter()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStorageLensGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.CfnStorageLensGroupProps):
        CfnStorageLensGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStorageLensGroupProps):
        software.amazon.awscdk.services.s3.CfnStorageLensGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3.CfnStorageLensGroupProps
  }
}
