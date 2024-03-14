package io.cloudshiftdev.awscdk.services.datazone

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDomain internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datazone.CfnDomain,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  public open fun attrManagedAccountId(): String = unwrap(this).getAttrManagedAccountId()

  public open fun attrPortalUrl(): String = unwrap(this).getAttrPortalUrl()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun domainExecutionRole(): String = unwrap(this).getDomainExecutionRole()

  public open fun domainExecutionRole(`value`: String) {
    unwrap(this).setDomainExecutionRole(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyIdentifier(): String? = unwrap(this).getKmsKeyIdentifier()

  public open fun kmsKeyIdentifier(`value`: String) {
    unwrap(this).setKmsKeyIdentifier(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun singleSignOn(): Any? = unwrap(this).getSingleSignOn()

  public open fun singleSignOn(`value`: IResolvable) {
    unwrap(this).setSingleSignOn(`value`.let(IResolvable::unwrap))
  }

  public open fun singleSignOn(`value`: SingleSignOnProperty) {
    unwrap(this).setSingleSignOn(`value`.let(SingleSignOnProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a6b45bf40a62726ba529988df977430697c80719b9d27405e76c09ee677de45")
  public open fun singleSignOn(`value`: SingleSignOnProperty.Builder.() -> Unit): Unit =
      singleSignOn(SingleSignOnProperty(`value`))

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun domainExecutionRole(domainExecutionRole: String)

    public fun kmsKeyIdentifier(kmsKeyIdentifier: String)

    public fun name(name: String)

    public fun singleSignOn(singleSignOn: IResolvable)

    public fun singleSignOn(singleSignOn: SingleSignOnProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6adb1e434f0d2756f8c41bacbf5ec78c9a577d076b52aa3ad1bd491c81e6cfcd")
    public fun singleSignOn(singleSignOn: SingleSignOnProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datazone.CfnDomain.Builder =
        software.amazon.awscdk.services.datazone.CfnDomain.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun domainExecutionRole(domainExecutionRole: String) {
      cdkBuilder.domainExecutionRole(domainExecutionRole)
    }

    override fun kmsKeyIdentifier(kmsKeyIdentifier: String) {
      cdkBuilder.kmsKeyIdentifier(kmsKeyIdentifier)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun singleSignOn(singleSignOn: IResolvable) {
      cdkBuilder.singleSignOn(singleSignOn.let(IResolvable::unwrap))
    }

    override fun singleSignOn(singleSignOn: SingleSignOnProperty) {
      cdkBuilder.singleSignOn(singleSignOn.let(SingleSignOnProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6adb1e434f0d2756f8c41bacbf5ec78c9a577d076b52aa3ad1bd491c81e6cfcd")
    override fun singleSignOn(singleSignOn: SingleSignOnProperty.Builder.() -> Unit): Unit =
        singleSignOn(SingleSignOnProperty(singleSignOn))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.datazone.CfnDomain = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDomain {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDomain(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDomain): CfnDomain =
        CfnDomain(cdkObject)

    internal fun unwrap(wrapped: CfnDomain): software.amazon.awscdk.services.datazone.CfnDomain =
        wrapped.cdkObject
  }

  public interface SingleSignOnProperty {
    public fun type(): String? = unwrap(this).getType()

    public fun userAssignment(): String? = unwrap(this).getUserAssignment()

    public interface Builder {
      public fun type(type: String)

      public fun userAssignment(userAssignment: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty.Builder =
          software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty.builder()

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun userAssignment(userAssignment: String) {
        cdkBuilder.userAssignment(userAssignment)
      }

      public fun build(): software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty,
    ) : SingleSignOnProperty {
      override fun type(): String? = unwrap(this).getType()

      override fun userAssignment(): String? = unwrap(this).getUserAssignment()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SingleSignOnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty):
          SingleSignOnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleSignOnProperty):
          software.amazon.awscdk.services.datazone.CfnDomain.SingleSignOnProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
