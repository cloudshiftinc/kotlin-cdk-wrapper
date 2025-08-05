@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * This interface define an inject function that operates on a Construct's Property.
 *
 * The Construct must have a constructUniqueId to uniquely identify itself.
 */
public interface IPropertyInjector {
  /**
   * The unique Id of the Construct class.
   */
  public fun constructUniqueId(): String

  /**
   * The injector to be applied to the constructor properties of the Construct.
   *
   * @param originalProps 
   * @param context 
   */
  public fun inject(originalProps: Any, context: InjectionContext): Any

  /**
   * The injector to be applied to the constructor properties of the Construct.
   *
   * @param originalProps 
   * @param context 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9adb9b5243b33a0713cbb5984859dbcb6627adb495b93aaff1a3140fd13ceb3")
  public fun inject(originalProps: Any, context: InjectionContext.Builder.() -> Unit): Any

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IPropertyInjector,
  ) : CdkObject(cdkObject),
      IPropertyInjector {
    /**
     * The unique Id of the Construct class.
     */
    override fun constructUniqueId(): String = unwrap(this).getConstructUniqueId()

    /**
     * The injector to be applied to the constructor properties of the Construct.
     *
     * @param originalProps 
     * @param context 
     */
    override fun inject(originalProps: Any, context: InjectionContext): Any =
        unwrap(this).inject(originalProps, context.let(InjectionContext.Companion::unwrap))

    /**
     * The injector to be applied to the constructor properties of the Construct.
     *
     * @param originalProps 
     * @param context 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9adb9b5243b33a0713cbb5984859dbcb6627adb495b93aaff1a3140fd13ceb3")
    override fun inject(originalProps: Any, context: InjectionContext.Builder.() -> Unit): Any =
        inject(originalProps, InjectionContext(context))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IPropertyInjector): IPropertyInjector =
        CdkObjectWrappers.wrap(cdkObject) as? IPropertyInjector ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPropertyInjector): software.amazon.awscdk.IPropertyInjector =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.IPropertyInjector
  }
}
