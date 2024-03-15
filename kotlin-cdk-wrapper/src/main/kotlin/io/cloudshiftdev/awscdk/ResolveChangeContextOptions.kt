@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface ResolveChangeContextOptions {
  public fun allowIntrinsicKeys(): Boolean? = unwrap(this).getAllowIntrinsicKeys()

  public fun removeEmpty(): Boolean? = unwrap(this).getRemoveEmpty()

  @CdkDslMarker
  public interface Builder {
    public fun allowIntrinsicKeys(allowIntrinsicKeys: Boolean)

    public fun removeEmpty(removeEmpty: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ResolveChangeContextOptions.Builder =
        software.amazon.awscdk.ResolveChangeContextOptions.builder()

    override fun allowIntrinsicKeys(allowIntrinsicKeys: Boolean) {
      cdkBuilder.allowIntrinsicKeys(allowIntrinsicKeys)
    }

    override fun removeEmpty(removeEmpty: Boolean) {
      cdkBuilder.removeEmpty(removeEmpty)
    }

    public fun build(): software.amazon.awscdk.ResolveChangeContextOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ResolveChangeContextOptions,
  ) : CdkObject(cdkObject), ResolveChangeContextOptions {
    override fun allowIntrinsicKeys(): Boolean? = unwrap(this).getAllowIntrinsicKeys()

    override fun removeEmpty(): Boolean? = unwrap(this).getRemoveEmpty()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ResolveChangeContextOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ResolveChangeContextOptions):
        ResolveChangeContextOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResolveChangeContextOptions):
        software.amazon.awscdk.ResolveChangeContextOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.ResolveChangeContextOptions
  }
}
