package io.cloudshiftdev.awscdk.services.b2bi

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProfile internal constructor(
  private val cdkObject: software.amazon.awscdk.services.b2bi.CfnProfile,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrLogGroupName(): String = unwrap(this).getAttrLogGroupName()

  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  public open fun attrProfileArn(): String = unwrap(this).getAttrProfileArn()

  public open fun attrProfileId(): String = unwrap(this).getAttrProfileId()

  public open fun businessName(): String = unwrap(this).getBusinessName()

  public open fun businessName(`value`: String) {
    unwrap(this).setBusinessName(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun email(): String? = unwrap(this).getEmail()

  public open fun email(`value`: String) {
    unwrap(this).setEmail(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun logging(): String = unwrap(this).getLogging()

  public open fun logging(`value`: String) {
    unwrap(this).setLogging(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun phone(): String = unwrap(this).getPhone()

  public open fun phone(`value`: String) {
    unwrap(this).setPhone(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun businessName(businessName: String)

    public fun email(email: String)

    public fun logging(logging: String)

    public fun name(name: String)

    public fun phone(phone: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.b2bi.CfnProfile.Builder =
        software.amazon.awscdk.services.b2bi.CfnProfile.Builder.create(scope, id)

    override fun businessName(businessName: String) {
      cdkBuilder.businessName(businessName)
    }

    override fun email(email: String) {
      cdkBuilder.email(email)
    }

    override fun logging(logging: String) {
      cdkBuilder.logging(logging)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun phone(phone: String) {
      cdkBuilder.phone(phone)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.b2bi.CfnProfile = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.b2bi.CfnProfile): CfnProfile =
        CfnProfile(cdkObject)

    internal fun unwrap(wrapped: CfnProfile): software.amazon.awscdk.services.b2bi.CfnProfile =
        wrapped.cdkObject
  }
}
