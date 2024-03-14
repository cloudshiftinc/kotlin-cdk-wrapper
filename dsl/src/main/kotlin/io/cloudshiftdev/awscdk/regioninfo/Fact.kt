package io.cloudshiftdev.awscdk.regioninfo

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

public open class Fact internal constructor(
  internal override val cdkObject: software.amazon.awscdk.regioninfo.Fact,
) : CdkObject(cdkObject) {
  public companion object {
    public fun definedFacts(): List<List<String>> =
        software.amazon.awscdk.regioninfo.Fact.definedFacts()

    public fun find(region: String, name: String): String? =
        software.amazon.awscdk.regioninfo.Fact.find(region, name)

    public fun names(): List<String> = software.amazon.awscdk.regioninfo.Fact.getNames()

    public fun regions(): List<String> = software.amazon.awscdk.regioninfo.Fact.getRegions()

    public fun register(fact: IFact) {
      software.amazon.awscdk.regioninfo.Fact.register(fact.let(IFact::unwrap))
    }

    public fun register(fact: IFact, allowReplacing: Boolean) {
      software.amazon.awscdk.regioninfo.Fact.register(fact.let(IFact::unwrap), allowReplacing)
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
  }
}
