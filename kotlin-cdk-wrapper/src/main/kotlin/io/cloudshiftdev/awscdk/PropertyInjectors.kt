@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * This is a collection of ProjectInjectors assigned to this scope.
 *
 * It is keyed by constructUniqueId.  There can be only one ProjectInjector for a constructUniqueId.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * PropertyInjectors propertyInjectors = PropertyInjectors.of(this);
 * ```
 */
public open class PropertyInjectors(
  cdkObject: software.amazon.awscdk.PropertyInjectors,
) : CdkObject(cdkObject) {
  /**
   * Add a list of  IPropertyInjectors to this collection of PropertyInjectors.
   *
   * @param propsInjectors * a list of IPropertyInjector. 
   */
  public open fun add(vararg propsInjectors: IPropertyInjector) {
    unwrap(this).add(*propsInjectors.map{CdkObjectWrappers.unwrap(it) as
        software.amazon.awscdk.IPropertyInjector}.toTypedArray())
  }

  /**
   * Get the PropertyInjector that is registered to the Construct's uniqueId.
   *
   * @return 
   * * the IPropertyInjector for that construct uniqueId
   * @param uniqueId * the construct uniqueId. 
   */
  public open fun doFor(uniqueId: String): IPropertyInjector? =
      unwrap(this).doFor(uniqueId)?.let(IPropertyInjector::wrap)

  /**
   * The scope attached to Injectors.
   */
  public open fun scope(): IConstruct = unwrap(this).getScope().let(IConstruct::wrap)

  /**
   * This returns a list of the Constructs that are supporting by this PropertyInjectors.
   *
   * @return a list of string showing the supported Constructs.
   */
  public open fun supportedClasses(): List<String> = unwrap(this).supportedClasses()

  public companion object {
    public fun hasPropertyInjectors(x: Any): Boolean =
        software.amazon.awscdk.PropertyInjectors.hasPropertyInjectors(x)

    public fun of(scope: IConstruct): PropertyInjectors =
        software.amazon.awscdk.PropertyInjectors.of(scope.let(IConstruct.Companion::unwrap)).let(PropertyInjectors::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.PropertyInjectors): PropertyInjectors =
        PropertyInjectors(cdkObject)

    internal fun unwrap(wrapped: PropertyInjectors): software.amazon.awscdk.PropertyInjectors =
        wrapped.cdkObject as software.amazon.awscdk.PropertyInjectors
  }
}
