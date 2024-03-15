@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnUserProfileProps {
  public fun domainId(): String

  public fun singleSignOnUserIdentifier(): String? = unwrap(this).getSingleSignOnUserIdentifier()

  public fun singleSignOnUserValue(): String? = unwrap(this).getSingleSignOnUserValue()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userProfileName(): String

  public fun userSettings(): Any? = unwrap(this).getUserSettings()

  @CdkDslMarker
  public interface Builder {
    public fun domainId(domainId: String)

    public fun singleSignOnUserIdentifier(singleSignOnUserIdentifier: String)

    public fun singleSignOnUserValue(singleSignOnUserValue: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userProfileName(userProfileName: String)

    public fun userSettings(userSettings: IResolvable)

    public fun userSettings(userSettings: CfnUserProfile.UserSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bcf6fd929ae9cd9adb24082a8e008715a7f32f53b602961c419112dbda2b75c")
    public fun userSettings(userSettings: CfnUserProfile.UserSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnUserProfileProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnUserProfileProps.builder()

    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    override fun singleSignOnUserIdentifier(singleSignOnUserIdentifier: String) {
      cdkBuilder.singleSignOnUserIdentifier(singleSignOnUserIdentifier)
    }

    override fun singleSignOnUserValue(singleSignOnUserValue: String) {
      cdkBuilder.singleSignOnUserValue(singleSignOnUserValue)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userProfileName(userProfileName: String) {
      cdkBuilder.userProfileName(userProfileName)
    }

    override fun userSettings(userSettings: IResolvable) {
      cdkBuilder.userSettings(userSettings.let(IResolvable::unwrap))
    }

    override fun userSettings(userSettings: CfnUserProfile.UserSettingsProperty) {
      cdkBuilder.userSettings(userSettings.let(CfnUserProfile.UserSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5bcf6fd929ae9cd9adb24082a8e008715a7f32f53b602961c419112dbda2b75c")
    override fun userSettings(userSettings: CfnUserProfile.UserSettingsProperty.Builder.() -> Unit):
        Unit = userSettings(CfnUserProfile.UserSettingsProperty(userSettings))

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnUserProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfileProps,
  ) : CdkObject(cdkObject), CfnUserProfileProps {
    override fun domainId(): String = unwrap(this).getDomainId()

    override fun singleSignOnUserIdentifier(): String? =
        unwrap(this).getSingleSignOnUserIdentifier()

    override fun singleSignOnUserValue(): String? = unwrap(this).getSingleSignOnUserValue()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userProfileName(): String = unwrap(this).getUserProfileName()

    override fun userSettings(): Any? = unwrap(this).getUserSettings()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnUserProfileProps):
        CfnUserProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProfileProps):
        software.amazon.awscdk.services.sagemaker.CfnUserProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnUserProfileProps
  }
}
