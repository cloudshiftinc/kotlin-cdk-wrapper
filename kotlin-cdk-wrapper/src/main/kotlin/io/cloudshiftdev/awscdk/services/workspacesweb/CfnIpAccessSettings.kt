@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.workspacesweb

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnIpAccessSettings internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun additionalEncryptionContext(): Any? =
      unwrap(this).getAdditionalEncryptionContext()

  public open fun additionalEncryptionContext(`value`: IResolvable) {
    unwrap(this).setAdditionalEncryptionContext(`value`.let(IResolvable::unwrap))
  }

  public open fun additionalEncryptionContext(`value`: Map<String, String>) {
    unwrap(this).setAdditionalEncryptionContext(`value`)
  }

  public open fun attrAssociatedPortalArns(): List<String> =
      unwrap(this).getAttrAssociatedPortalArns()

  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  public open fun attrIpAccessSettingsArn(): String = unwrap(this).getAttrIpAccessSettingsArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun customerManagedKey(): String? = unwrap(this).getCustomerManagedKey()

  public open fun customerManagedKey(`value`: String) {
    unwrap(this).setCustomerManagedKey(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipRules(): Any = unwrap(this).getIpRules()

  public open fun ipRules(`value`: IResolvable) {
    unwrap(this).setIpRules(`value`.let(IResolvable::unwrap))
  }

  public open fun ipRules(__idx_ac66f0: List<Any>) {
    unwrap(this).setIpRules(__idx_ac66f0)
  }

  public open fun ipRules(vararg __idx_ac66f0: Any): Unit = ipRules(__idx_ac66f0.toList())

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    public fun customerManagedKey(customerManagedKey: String)

    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun ipRules(ipRules: IResolvable)

    public fun ipRules(ipRules: List<Any>)

    public fun ipRules(vararg ipRules: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.Builder =
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.Builder.create(scope, id)

    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    override fun customerManagedKey(customerManagedKey: String) {
      cdkBuilder.customerManagedKey(customerManagedKey)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun ipRules(ipRules: IResolvable) {
      cdkBuilder.ipRules(ipRules.let(IResolvable::unwrap))
    }

    override fun ipRules(ipRules: List<Any>) {
      cdkBuilder.ipRules(ipRules)
    }

    override fun ipRules(vararg ipRules: Any): Unit = ipRules(ipRules.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIpAccessSettings {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIpAccessSettings(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings):
        CfnIpAccessSettings = CfnIpAccessSettings(cdkObject)

    internal fun unwrap(wrapped: CfnIpAccessSettings):
        software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings = wrapped.cdkObject
  }

  public interface IpRuleProperty {
    public fun description(): String? = unwrap(this).getDescription()

    public fun ipRange(): String

    @CdkDslMarker
    public interface Builder {
      public fun description(description: String)

      public fun ipRange(ipRange: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty.Builder =
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty.builder()

      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      override fun ipRange(ipRange: String) {
        cdkBuilder.ipRange(ipRange)
      }

      public fun build():
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty,
    ) : CdkObject(cdkObject), IpRuleProperty {
      override fun description(): String? = unwrap(this).getDescription()

      override fun ipRange(): String = unwrap(this).getIpRange()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IpRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty):
          IpRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IpRuleProperty):
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.workspacesweb.CfnIpAccessSettings.IpRuleProperty
    }
  }
}