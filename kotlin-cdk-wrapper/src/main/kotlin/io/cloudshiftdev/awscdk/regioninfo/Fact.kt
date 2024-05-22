@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.regioninfo

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * A database of regional information.
 *
 * Example:
 *
 * ```
 * public class MyFact implements IFact {
 * public final Object region;
 * public final Object name;
 * public final Object value;
 * }
 * Fact.register(new MyFact());
 * ```
 */
public open class Fact(
  cdkObject: software.amazon.awscdk.regioninfo.Fact,
) : CdkObject(cdkObject) {
  public companion object {
    public fun definedFacts(): List<List<String>> =
        software.amazon.awscdk.regioninfo.Fact.definedFacts()

    public fun find(region: String, name: String): String? =
        software.amazon.awscdk.regioninfo.Fact.find(region, name)

    public fun names(): List<String> = software.amazon.awscdk.regioninfo.Fact.getNames()

    public fun regions(): List<String> = software.amazon.awscdk.regioninfo.Fact.getRegions()

    public fun register(fact: IFact) {
      software.amazon.awscdk.regioninfo.Fact.register(fact.let(IFact.Companion::unwrap))
    }

    public fun register(fact: IFact, allowReplacing: Boolean) {
      software.amazon.awscdk.regioninfo.Fact.register(fact.let(IFact.Companion::unwrap),
          allowReplacing)
    }

    public fun requireFact(region: String, name: String): String =
        software.amazon.awscdk.regioninfo.Fact.requireFact(region, name)

    public fun unregister(region: String, name: String) {
      software.amazon.awscdk.regioninfo.Fact.unregister(region, name)
    }

    public fun unregister(
      region: String,
      name: String,
      `value`: String,
    ) {
      software.amazon.awscdk.regioninfo.Fact.unregister(region, name, `value`)
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.regioninfo.Fact): Fact = Fact(cdkObject)

    internal fun unwrap(wrapped: Fact): software.amazon.awscdk.regioninfo.Fact = wrapped.cdkObject
        as software.amazon.awscdk.regioninfo.Fact
  }
}
