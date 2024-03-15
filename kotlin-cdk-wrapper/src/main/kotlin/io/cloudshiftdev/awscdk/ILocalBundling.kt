@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ILocalBundling {
  public fun tryBundle(arg0: String, arg1: BundlingOptions): Boolean

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("20d66aa0f98dd5c1f458da3bb81456739e3ba5b9094de168036e0dc9ebf92d07")
  public fun tryBundle(arg0: String, arg1: BundlingOptions.Builder.() -> Unit): Boolean

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ILocalBundling,
  ) : CdkObject(cdkObject), ILocalBundling {
    override fun tryBundle(arg0: String, arg1: BundlingOptions): Boolean =
        unwrap(this).tryBundle(arg0, arg1.let(BundlingOptions::unwrap))

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20d66aa0f98dd5c1f458da3bb81456739e3ba5b9094de168036e0dc9ebf92d07")
    override fun tryBundle(arg0: String, arg1: BundlingOptions.Builder.() -> Unit): Boolean =
        tryBundle(arg0, BundlingOptions(arg1))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ILocalBundling): ILocalBundling =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILocalBundling): software.amazon.awscdk.ILocalBundling = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.ILocalBundling
  }
}
