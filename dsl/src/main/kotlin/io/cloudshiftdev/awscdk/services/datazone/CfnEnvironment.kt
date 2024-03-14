package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnEnvironment internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironment,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAwsAccountId(): String = unwrap(this).getAttrAwsAccountId()

  public open fun attrAwsAccountRegion(): String = unwrap(this).getAttrAwsAccountRegion()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  public open fun attrEnvironmentBlueprintId(): String =
      unwrap(this).getAttrEnvironmentBlueprintId()

  public open fun attrEnvironmentProfileId(): String = unwrap(this).getAttrEnvironmentProfileId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  public open fun attrProvider(): String = unwrap(this).getAttrProvider()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  public open fun environmentProfileIdentifier(): String =
      unwrap(this).getEnvironmentProfileIdentifier()

  public open fun environmentProfileIdentifier(`value`: String) {
    unwrap(this).setEnvironmentProfileIdentifier(`value`)
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

  public open fun projectIdentifier(): String = unwrap(this).getProjectIdentifier()

  public open fun projectIdentifier(`value`: String) {
    unwrap(this).setProjectIdentifier(`value`)
  }

  public open fun userParameters(): Any? = unwrap(this).getUserParameters()

  public open fun userParameters(`value`: IResolvable) {
    unwrap(this).setUserParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun userParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setUserParameters(__idx_ac66f0)
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun domainIdentifier(domainIdentifier: String) {
    }

    public fun environmentProfileIdentifier(environmentProfileIdentifier: String) {
    }

    public fun glossaryTerms(glossaryTerms: List<String>) {
    }

    public fun name(name: String) {
    }

    public fun projectIdentifier(projectIdentifier: String) {
    }

    public fun userParameters(userParameters: IResolvable) {
    }

    public fun userParameters(userParameters: List<Any>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnEnvironment.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironment.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    public override fun environmentProfileIdentifier(environmentProfileIdentifier: String) {
      cdkBuilder.environmentProfileIdentifier(environmentProfileIdentifier)
    }

    public override fun glossaryTerms(glossaryTerms: List<String>) {
      cdkBuilder.glossaryTerms(glossaryTerms)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun projectIdentifier(projectIdentifier: String) {
      cdkBuilder.projectIdentifier(projectIdentifier)
    }

    public override fun userParameters(userParameters: IResolvable) {
      cdkBuilder.userParameters(userParameters.let(IResolvable::unwrap))
    }

    public override fun userParameters(userParameters: List<Any>) {
      cdkBuilder.userParameters(userParameters)
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnEnvironment = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironment):
        CfnEnvironment = CfnEnvironment(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironment):
        software.amazon.awscdk.services.datazone.CfnEnvironment = wrapped.cdkObject
  }

  public interface EnvironmentParameterProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun `value`(): String? = unwrap(this).getValue()

    public interface Builder {
      public fun name(name: String) {
      }

      public fun `value`(`value`: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty,
    ) : EnvironmentParameterProperty {
      public override fun name(): String? = unwrap(this).getName()

      public override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty):
          EnvironmentParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentParameterProperty):
          software.amazon.awscdk.services.datazone.CfnEnvironment.EnvironmentParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
