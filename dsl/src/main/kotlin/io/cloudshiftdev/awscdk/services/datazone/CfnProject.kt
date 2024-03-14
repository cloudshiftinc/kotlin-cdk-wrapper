package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProject internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datazone.CfnProject,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  public open fun glossaryTerms(): List<String> = unwrap(this).getGlossaryTerms() ?: emptyList()

  public open fun glossaryTerms(`value`: List<String>) {
    unwrap(this).setGlossaryTerms(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun domainIdentifier(domainIdentifier: String)

    public fun glossaryTerms(glossaryTerms: List<String>)

    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnProject.Builder =
        software.amazon.awscdk.services.datazone.CfnProject.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    override fun glossaryTerms(glossaryTerms: List<String>) {
      cdkBuilder.glossaryTerms(glossaryTerms)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnProject = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.datazone.CfnProject =
        wrapped.cdkObject
  }
}
