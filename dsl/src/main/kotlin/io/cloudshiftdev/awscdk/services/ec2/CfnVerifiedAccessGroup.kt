package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVerifiedAccessGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  public open fun attrOwner(): String = unwrap(this).getAttrOwner()

  public open fun attrVerifiedAccessGroupArn(): String =
      unwrap(this).getAttrVerifiedAccessGroupArn()

  public open fun attrVerifiedAccessGroupId(): String = unwrap(this).getAttrVerifiedAccessGroupId()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDocument(): String? = unwrap(this).getPolicyDocument()

  public open fun policyDocument(`value`: String) {
    unwrap(this).setPolicyDocument(`value`)
  }

  public open fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

  public open fun policyEnabled(`value`: Boolean) {
    unwrap(this).setPolicyEnabled(`value`)
  }

  public open fun policyEnabled(`value`: IResolvable) {
    unwrap(this).setPolicyEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  public open fun sseSpecification(`value`: IResolvable) {
    unwrap(this).setSseSpecification(`value`.let(IResolvable::unwrap))
  }

  public open fun sseSpecification(`value`: SseSpecificationProperty) {
    unwrap(this).setSseSpecification(`value`.let(SseSpecificationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45cdfe29f25455bca600e9bf5b7b542b3d8f545e9bb2500df14674db74279be5")
  public open fun sseSpecification(`value`: SseSpecificationProperty.Builder.() -> Unit): Unit =
      sseSpecification(SseSpecificationProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun verifiedAccessInstanceId(): String = unwrap(this).getVerifiedAccessInstanceId()

  public open fun verifiedAccessInstanceId(`value`: String) {
    unwrap(this).setVerifiedAccessInstanceId(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun policyDocument(policyDocument: String)

    public fun policyEnabled(policyEnabled: Boolean)

    public fun policyEnabled(policyEnabled: IResolvable)

    public fun sseSpecification(sseSpecification: IResolvable)

    public fun sseSpecification(sseSpecification: SseSpecificationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f60a3a4d6c62fc065963b9fee159523f4c390b096d88be623010b2d68d950fbe")
    public fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun verifiedAccessInstanceId(verifiedAccessInstanceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.Builder =
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyEnabled(policyEnabled: Boolean) {
      cdkBuilder.policyEnabled(policyEnabled)
    }

    override fun policyEnabled(policyEnabled: IResolvable) {
      cdkBuilder.policyEnabled(policyEnabled.let(IResolvable::unwrap))
    }

    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    override fun sseSpecification(sseSpecification: SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(SseSpecificationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f60a3a4d6c62fc065963b9fee159523f4c390b096d88be623010b2d68d950fbe")
    override fun sseSpecification(sseSpecification: SseSpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(SseSpecificationProperty(sseSpecification))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun verifiedAccessInstanceId(verifiedAccessInstanceId: String) {
      cdkBuilder.verifiedAccessInstanceId(verifiedAccessInstanceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVerifiedAccessGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVerifiedAccessGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup):
        CfnVerifiedAccessGroup = CfnVerifiedAccessGroup(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessGroup):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup = wrapped.cdkObject
  }

  public interface SseSpecificationProperty {
    public fun customerManagedKeyEnabled(): Any? = unwrap(this).getCustomerManagedKeyEnabled()

    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    public interface Builder {
      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean)

      public fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable)

      public fun kmsKeyArn(kmsKeyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty.builder()

      override fun customerManagedKeyEnabled(customerManagedKeyEnabled: Boolean) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled)
      }

      override fun customerManagedKeyEnabled(customerManagedKeyEnabled: IResolvable) {
        cdkBuilder.customerManagedKeyEnabled(customerManagedKeyEnabled.let(IResolvable::unwrap))
      }

      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty,
    ) : SseSpecificationProperty {
      override fun customerManagedKeyEnabled(): Any? = unwrap(this).getCustomerManagedKeyEnabled()

      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SseSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty):
          SseSpecificationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SseSpecificationProperty):
          software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroup.SseSpecificationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
