package io.cloudshiftdev.awscdk

import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ILocalBundling {
  public fun tryBundle(arg0: String, arg1: BundlingOptions): Boolean

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("20d66aa0f98dd5c1f458da3bb81456739e3ba5b9094de168036e0dc9ebf92d07")
  public fun tryBundle(arg0: String, arg1: BundlingOptions.Builder.() -> Unit): Boolean

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ILocalBundling,
  ) : ILocalBundling {
    public override fun tryBundle(arg0: String, arg1: BundlingOptions): Boolean =
        unwrap(this).tryBundle(arg0, arg1.let(BundlingOptions::unwrap))

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20d66aa0f98dd5c1f458da3bb81456739e3ba5b9094de168036e0dc9ebf92d07")
    public override fun tryBundle(arg0: String, arg1: BundlingOptions.Builder.() -> Unit): Boolean =
        tryBundle(arg0, BundlingOptions(arg1))
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ILocalBundling): ILocalBundling =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILocalBundling): software.amazon.awscdk.ILocalBundling = (wrapped
        as Wrapper).cdkObject
  }
}
