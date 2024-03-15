@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnProjectProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun domainIdentifier(): String

  public fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

  public fun name(): String

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun domainIdentifier(domainIdentifier: String)

    public fun glossaryTerms(glossaryTerms: List<String>)

    public fun glossaryTerms(vararg glossaryTerms: String)

    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnProjectProps.Builder =
        software.amazon.awscdk.services.datazone.CfnProjectProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    override fun glossaryTerms(glossaryTerms: List<String>) {
      cdkBuilder.glossaryTerms(glossaryTerms)
    }

    override fun glossaryTerms(vararg glossaryTerms: String): Unit =
        glossaryTerms(glossaryTerms.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    override fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProjectProps):
        CfnProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.datazone.CfnProjectProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.datazone.CfnProjectProps
  }
}
