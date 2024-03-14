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

public open class CfnEnvironmentProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProfile,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrCreatedBy(): String = unwrap(this).getAttrCreatedBy()

  public open fun attrDomainId(): String = unwrap(this).getAttrDomainId()

  public open fun attrEnvironmentBlueprintId(): String =
      unwrap(this).getAttrEnvironmentBlueprintId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  public open fun awsAccountId(): String = unwrap(this).getAwsAccountId()

  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  public open fun awsAccountRegion(): String = unwrap(this).getAwsAccountRegion()

  public open fun awsAccountRegion(`value`: String) {
    unwrap(this).setAwsAccountRegion(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun domainIdentifier(): String = unwrap(this).getDomainIdentifier()

  public open fun domainIdentifier(`value`: String) {
    unwrap(this).setDomainIdentifier(`value`)
  }

  public open fun environmentBlueprintIdentifier(): String =
      unwrap(this).getEnvironmentBlueprintIdentifier()

  public open fun environmentBlueprintIdentifier(`value`: String) {
    unwrap(this).setEnvironmentBlueprintIdentifier(`value`)
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
    public fun awsAccountId(awsAccountId: String) {
    }

    public fun awsAccountRegion(awsAccountRegion: String) {
    }

    public fun description(description: String) {
    }

    public fun domainIdentifier(domainIdentifier: String) {
    }

    public fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String) {
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
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.Builder =
        software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.Builder.create(scope, id)

    public override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    public override fun awsAccountRegion(awsAccountRegion: String) {
      cdkBuilder.awsAccountRegion(awsAccountRegion)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun domainIdentifier(domainIdentifier: String) {
      cdkBuilder.domainIdentifier(domainIdentifier)
    }

    public override fun environmentBlueprintIdentifier(environmentBlueprintIdentifier: String) {
      cdkBuilder.environmentBlueprintIdentifier(environmentBlueprintIdentifier)
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

    public fun build(): software.amazon.awscdk.services.datazone.CfnEnvironmentProfile =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEnvironmentProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEnvironmentProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProfile):
        CfnEnvironmentProfile = CfnEnvironmentProfile(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProfile):
        software.amazon.awscdk.services.datazone.CfnEnvironmentProfile = wrapped.cdkObject
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
          software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty.Builder
          =
          software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty.builder()

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty,
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
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty):
          EnvironmentParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnvironmentParameterProperty):
          software.amazon.awscdk.services.datazone.CfnEnvironmentProfile.EnvironmentParameterProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
