@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnKey internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kms.CfnKey,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrKeyId(): String = unwrap(this).getAttrKeyId()

  public open fun bypassPolicyLockoutSafetyCheck(): Any? =
      unwrap(this).getBypassPolicyLockoutSafetyCheck()

  public open fun bypassPolicyLockoutSafetyCheck(`value`: Boolean) {
    unwrap(this).setBypassPolicyLockoutSafetyCheck(`value`)
  }

  public open fun bypassPolicyLockoutSafetyCheck(`value`: IResolvable) {
    unwrap(this).setBypassPolicyLockoutSafetyCheck(`value`.let(IResolvable::unwrap))
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun enableKeyRotation(): Any? = unwrap(this).getEnableKeyRotation()

  public open fun enableKeyRotation(`value`: Boolean) {
    unwrap(this).setEnableKeyRotation(`value`)
  }

  public open fun enableKeyRotation(`value`: IResolvable) {
    unwrap(this).setEnableKeyRotation(`value`.let(IResolvable::unwrap))
  }

  public open fun enabled(): Any? = unwrap(this).getEnabled()

  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun keyPolicy(): Any? = unwrap(this).getKeyPolicy()

  public open fun keyPolicy(`value`: Any) {
    unwrap(this).setKeyPolicy(`value`)
  }

  public open fun keySpec(): String? = unwrap(this).getKeySpec()

  public open fun keySpec(`value`: String) {
    unwrap(this).setKeySpec(`value`)
  }

  public open fun keyUsage(): String? = unwrap(this).getKeyUsage()

  public open fun keyUsage(`value`: String) {
    unwrap(this).setKeyUsage(`value`)
  }

  public open fun multiRegion(): Any? = unwrap(this).getMultiRegion()

  public open fun multiRegion(`value`: Boolean) {
    unwrap(this).setMultiRegion(`value`)
  }

  public open fun multiRegion(`value`: IResolvable) {
    unwrap(this).setMultiRegion(`value`.let(IResolvable::unwrap))
  }

  public open fun origin(): String? = unwrap(this).getOrigin()

  public open fun origin(`value`: String) {
    unwrap(this).setOrigin(`value`)
  }

  public open fun pendingWindowInDays(): Number? = unwrap(this).getPendingWindowInDays()

  public open fun pendingWindowInDays(`value`: Number) {
    unwrap(this).setPendingWindowInDays(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean)

    public fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable)

    public fun description(description: String)

    public fun enableKeyRotation(enableKeyRotation: Boolean)

    public fun enableKeyRotation(enableKeyRotation: IResolvable)

    public fun enabled(enabled: Boolean)

    public fun enabled(enabled: IResolvable)

    public fun keyPolicy(keyPolicy: Any)

    public fun keySpec(keySpec: String)

    public fun keyUsage(keyUsage: String)

    public fun multiRegion(multiRegion: Boolean)

    public fun multiRegion(multiRegion: IResolvable)

    public fun origin(origin: String)

    public fun pendingWindowInDays(pendingWindowInDays: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.CfnKey.Builder =
        software.amazon.awscdk.services.kms.CfnKey.Builder.create(scope, id)

    override fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: Boolean) {
      cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck)
    }

    override fun bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck: IResolvable) {
      cdkBuilder.bypassPolicyLockoutSafetyCheck(bypassPolicyLockoutSafetyCheck.let(IResolvable::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    override fun enableKeyRotation(enableKeyRotation: IResolvable) {
      cdkBuilder.enableKeyRotation(enableKeyRotation.let(IResolvable::unwrap))
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    override fun keyPolicy(keyPolicy: Any) {
      cdkBuilder.keyPolicy(keyPolicy)
    }

    override fun keySpec(keySpec: String) {
      cdkBuilder.keySpec(keySpec)
    }

    override fun keyUsage(keyUsage: String) {
      cdkBuilder.keyUsage(keyUsage)
    }

    override fun multiRegion(multiRegion: Boolean) {
      cdkBuilder.multiRegion(multiRegion)
    }

    override fun multiRegion(multiRegion: IResolvable) {
      cdkBuilder.multiRegion(multiRegion.let(IResolvable::unwrap))
    }

    override fun origin(origin: String) {
      cdkBuilder.origin(origin)
    }

    override fun pendingWindowInDays(pendingWindowInDays: Number) {
      cdkBuilder.pendingWindowInDays(pendingWindowInDays)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kms.CfnKey = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kms.CfnKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.CfnKey): CfnKey =
        CfnKey(cdkObject)

    internal fun unwrap(wrapped: CfnKey): software.amazon.awscdk.services.kms.CfnKey =
        wrapped.cdkObject
  }
}
