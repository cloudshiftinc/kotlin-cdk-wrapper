package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.Unit

public interface ResolveChangeContextOptions {
  public fun allowIntrinsicKeys(): Boolean? = unwrap(this).getAllowIntrinsicKeys()

  public fun removeEmpty(): Boolean? = unwrap(this).getRemoveEmpty()

  public interface Builder {
    public fun allowIntrinsicKeys(allowIntrinsicKeys: Boolean) {
    }

    public fun removeEmpty(removeEmpty: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ResolveChangeContextOptions.Builder =
        software.amazon.awscdk.ResolveChangeContextOptions.builder()

    public override fun allowIntrinsicKeys(allowIntrinsicKeys: Boolean) {
      cdkBuilder.allowIntrinsicKeys(allowIntrinsicKeys)
    }

    public override fun removeEmpty(removeEmpty: Boolean) {
      cdkBuilder.removeEmpty(removeEmpty)
    }

    public fun build(): software.amazon.awscdk.ResolveChangeContextOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ResolveChangeContextOptions,
  ) : ResolveChangeContextOptions {
    public override fun allowIntrinsicKeys(): Boolean? = unwrap(this).getAllowIntrinsicKeys()

    public override fun removeEmpty(): Boolean? = unwrap(this).getRemoveEmpty()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResolveChangeContextOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ResolveChangeContextOptions):
        ResolveChangeContextOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResolveChangeContextOptions):
        software.amazon.awscdk.ResolveChangeContextOptions = (wrapped as Wrapper).cdkObject
  }
}
