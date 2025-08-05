@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit

/**
 * This defines the values needed for Injection.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import software.constructs.*;
 * Construct construct;
 * InjectionContext injectionContext = InjectionContext.builder()
 * .id("id")
 * .scope(construct)
 * .build();
 * ```
 */
public interface InjectionContext {
  /**
   * id from the Construct constructor.
   */
  public fun id(): String

  /**
   * scope from the  constructor.
   */
  public fun scope(): Construct

  /**
   * A builder for [InjectionContext]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param id id from the Construct constructor. 
     */
    public fun id(id: String)

    /**
     * @param scope scope from the  constructor. 
     */
    public fun scope(scope: Construct)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.InjectionContext.Builder =
        software.amazon.awscdk.InjectionContext.builder()

    /**
     * @param id id from the Construct constructor. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param scope scope from the  constructor. 
     */
    override fun scope(scope: Construct) {
      cdkBuilder.scope(scope.let(Construct.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.InjectionContext = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.InjectionContext,
  ) : CdkObject(cdkObject),
      InjectionContext {
    /**
     * id from the Construct constructor.
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * scope from the  constructor.
     */
    override fun scope(): Construct = unwrap(this).getScope().let(Construct::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InjectionContext {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.InjectionContext): InjectionContext =
        CdkObjectWrappers.wrap(cdkObject) as? InjectionContext ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: InjectionContext): software.amazon.awscdk.InjectionContext =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.InjectionContext
  }
}
