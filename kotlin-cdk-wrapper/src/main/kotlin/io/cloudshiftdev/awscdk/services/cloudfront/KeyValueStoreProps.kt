@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface KeyValueStoreProps {
  public fun comment(): String? = unwrap(this).getComment()

  public fun keyValueStoreName(): String? = unwrap(this).getKeyValueStoreName()

  public fun source(): ImportSource? = unwrap(this).getSource()?.let(ImportSource::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun keyValueStoreName(keyValueStoreName: String)

    public fun source(source: ImportSource)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.KeyValueStoreProps.Builder =
        software.amazon.awscdk.services.cloudfront.KeyValueStoreProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun keyValueStoreName(keyValueStoreName: String) {
      cdkBuilder.keyValueStoreName(keyValueStoreName)
    }

    override fun source(source: ImportSource) {
      cdkBuilder.source(source.let(ImportSource::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.KeyValueStoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.KeyValueStoreProps,
  ) : CdkObject(cdkObject), KeyValueStoreProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun keyValueStoreName(): String? = unwrap(this).getKeyValueStoreName()

    override fun source(): ImportSource? = unwrap(this).getSource()?.let(ImportSource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyValueStoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.KeyValueStoreProps):
        KeyValueStoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyValueStoreProps):
        software.amazon.awscdk.services.cloudfront.KeyValueStoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.KeyValueStoreProps
  }
}
