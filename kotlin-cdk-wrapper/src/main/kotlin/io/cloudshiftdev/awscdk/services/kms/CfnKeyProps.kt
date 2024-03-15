@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kms

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnKeyProps {
  public fun bypassPolicyLockoutSafetyCheck(): Any? =
      unwrap(this).getBypassPolicyLockoutSafetyCheck()

  public fun description(): String? = unwrap(this).getDescription()

  public fun enableKeyRotation(): Any? = unwrap(this).getEnableKeyRotation()

  public fun enabled(): Any? = unwrap(this).getEnabled()

  public fun keyPolicy(): Any? = unwrap(this).getKeyPolicy()

  public fun keySpec(): String? = unwrap(this).getKeySpec()

  public fun keyUsage(): String? = unwrap(this).getKeyUsage()

  public fun multiRegion(): Any? = unwrap(this).getMultiRegion()

  public fun origin(): String? = unwrap(this).getOrigin()

  public fun pendingWindowInDays(): Number? = unwrap(this).getPendingWindowInDays()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kms.CfnKeyProps.Builder =
        software.amazon.awscdk.services.kms.CfnKeyProps.builder()

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

    public fun build(): software.amazon.awscdk.services.kms.CfnKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kms.CfnKeyProps,
  ) : CdkObject(cdkObject), CfnKeyProps {
    override fun bypassPolicyLockoutSafetyCheck(): Any? =
        unwrap(this).getBypassPolicyLockoutSafetyCheck()

    override fun description(): String? = unwrap(this).getDescription()

    override fun enableKeyRotation(): Any? = unwrap(this).getEnableKeyRotation()

    override fun enabled(): Any? = unwrap(this).getEnabled()

    override fun keyPolicy(): Any? = unwrap(this).getKeyPolicy()

    override fun keySpec(): String? = unwrap(this).getKeySpec()

    override fun keyUsage(): String? = unwrap(this).getKeyUsage()

    override fun multiRegion(): Any? = unwrap(this).getMultiRegion()

    override fun origin(): String? = unwrap(this).getOrigin()

    override fun pendingWindowInDays(): Number? = unwrap(this).getPendingWindowInDays()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kms.CfnKeyProps): CfnKeyProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeyProps): software.amazon.awscdk.services.kms.CfnKeyProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.kms.CfnKeyProps
  }
}
