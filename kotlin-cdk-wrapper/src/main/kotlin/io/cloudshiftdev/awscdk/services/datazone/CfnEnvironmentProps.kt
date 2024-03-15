@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnEnvironmentProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun domainIdentifier(): String

  public fun environmentProfileIdentifier(): String

  public fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

  public fun name(): String

  public fun projectIdentifier(): String

  public fun userParameters(): Any? = unwrap(this).getUserParameters()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun domainIdentifier(domainIdentifier: String)

    public fun environmentProfileIdentifier(environmentProfileIdentifier: String)

    public fun glossaryTerms(glossaryTerms: List<String>)

    public fun glossaryTerms(vararg glossaryTerms: String)

    public fun name(name: String)

    public fun projectIdentifier(projectIdentifier: String)

    public fun userParameters(userParameters: IResolvable)

    public fun userParameters(userParameters: List<Any>)

    public fun userParameters(vararg userParameters: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironmentProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    override fun environmentProfileIdentifier(environmentProfileIdentifier: String) {
      cdkBuilder.environmentProfileIdentifier(environmentProfileIdentifier)
    }

    override fun glossaryTerms(glossaryTerms: List<String>) {
      cdkBuilder.glossaryTerms(glossaryTerms)
    }

    override fun glossaryTerms(vararg glossaryTerms: String): Unit =
        glossaryTerms(glossaryTerms.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    override fun userParameters(userParameters: IResolvable) {
      cdkBuilder.userParameters(userParameters.let(IResolvable::unwrap))
    }

    override fun userParameters(userParameters: List<Any>) {
      cdkBuilder.userParameters(userParameters)
    }

    override fun userParameters(vararg userParameters: Any): Unit =
        userParameters(userParameters.toList())

    public fun build(): software.amazon.awscdk.services.datazone.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

    override fun environmentProfileIdentifier(): String =
        unwrap(this).getEnvironmentProfileIdentifier()

    override fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

    override fun name(): String = unwrap(this).getName()

    override fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

    override fun userParameters(): Any? = unwrap(this).getUserParameters()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProps):
        CfnEnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.datazone.CfnEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datazone.CfnEnvironmentProps
  }
}
