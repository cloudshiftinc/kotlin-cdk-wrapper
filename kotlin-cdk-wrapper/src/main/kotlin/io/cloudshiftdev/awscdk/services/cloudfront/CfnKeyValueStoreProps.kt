@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnKeyValueStoreProps {
  public fun comment(): String? = unwrap(this).getComment()

  public fun importSource(): Any? = unwrap(this).getImportSource()

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun importSource(importSource: IResolvable)

    public fun importSource(importSource: CfnKeyValueStore.ImportSourceProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("342ef79ef7792553404ebf0fb3fc5b3d7b128a634712be83b6ee47063f52b84e")
    public fun importSource(importSource: CfnKeyValueStore.ImportSourceProperty.Builder.() -> Unit)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps.Builder
        = software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun importSource(importSource: IResolvable) {
      cdkBuilder.importSource(importSource.let(IResolvable::unwrap))
    }

    override fun importSource(importSource: CfnKeyValueStore.ImportSourceProperty) {
      cdkBuilder.importSource(importSource.let(CfnKeyValueStore.ImportSourceProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("342ef79ef7792553404ebf0fb3fc5b3d7b128a634712be83b6ee47063f52b84e")
    override
        fun importSource(importSource: CfnKeyValueStore.ImportSourceProperty.Builder.() -> Unit):
        Unit = importSource(CfnKeyValueStore.ImportSourceProperty(importSource))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps,
  ) : CdkObject(cdkObject), CfnKeyValueStoreProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun importSource(): Any? = unwrap(this).getImportSource()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeyValueStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps):
        CfnKeyValueStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeyValueStoreProps):
        software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.CfnKeyValueStoreProps
  }
}
