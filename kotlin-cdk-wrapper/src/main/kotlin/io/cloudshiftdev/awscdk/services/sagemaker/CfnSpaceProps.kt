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

public interface CfnSpaceProps {
  public fun domainId(): String

  public fun ownershipSettings(): Any? = unwrap(this).getOwnershipSettings()

  public fun spaceDisplayName(): String? = unwrap(this).getSpaceDisplayName()

  public fun spaceName(): String

  public fun spaceSettings(): Any? = unwrap(this).getSpaceSettings()

  public fun spaceSharingSettings(): Any? = unwrap(this).getSpaceSharingSettings()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun domainId(domainId: String)

    public fun ownershipSettings(ownershipSettings: IResolvable)

    public fun ownershipSettings(ownershipSettings: CfnSpace.OwnershipSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fa2c12b0082df7e05745cd27d7c9fc6507a3eb201c0f055bd6764419379e319")
    public
        fun ownershipSettings(ownershipSettings: CfnSpace.OwnershipSettingsProperty.Builder.() -> Unit)

    public fun spaceDisplayName(spaceDisplayName: String)

    public fun spaceName(spaceName: String)

    public fun spaceSettings(spaceSettings: IResolvable)

    public fun spaceSettings(spaceSettings: CfnSpace.SpaceSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b528233f1f2ceb5c272d6151b164f4b92ec5f026267911de65c2d50b7e4583")
    public fun spaceSettings(spaceSettings: CfnSpace.SpaceSettingsProperty.Builder.() -> Unit)

    public fun spaceSharingSettings(spaceSharingSettings: IResolvable)

    public fun spaceSharingSettings(spaceSharingSettings: CfnSpace.SpaceSharingSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01896c2fe6975306b642e7ad6d402c0c570b44022d117ad86d226d4067f16f33")
    public
        fun spaceSharingSettings(spaceSharingSettings: CfnSpace.SpaceSharingSettingsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnSpaceProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnSpaceProps.builder()

    override fun domainId(domainId: String) {
      cdkBuilder.domainId(domainId)
    }

    override fun ownershipSettings(ownershipSettings: IResolvable) {
      cdkBuilder.ownershipSettings(ownershipSettings.let(IResolvable::unwrap))
    }

    override fun ownershipSettings(ownershipSettings: CfnSpace.OwnershipSettingsProperty) {
      cdkBuilder.ownershipSettings(ownershipSettings.let(CfnSpace.OwnershipSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fa2c12b0082df7e05745cd27d7c9fc6507a3eb201c0f055bd6764419379e319")
    override
        fun ownershipSettings(ownershipSettings: CfnSpace.OwnershipSettingsProperty.Builder.() -> Unit):
        Unit = ownershipSettings(CfnSpace.OwnershipSettingsProperty(ownershipSettings))

    override fun spaceDisplayName(spaceDisplayName: String) {
      cdkBuilder.spaceDisplayName(spaceDisplayName)
    }

    override fun spaceName(spaceName: String) {
      cdkBuilder.spaceName(spaceName)
    }

    override fun spaceSettings(spaceSettings: IResolvable) {
      cdkBuilder.spaceSettings(spaceSettings.let(IResolvable::unwrap))
    }

    override fun spaceSettings(spaceSettings: CfnSpace.SpaceSettingsProperty) {
      cdkBuilder.spaceSettings(spaceSettings.let(CfnSpace.SpaceSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b528233f1f2ceb5c272d6151b164f4b92ec5f026267911de65c2d50b7e4583")
    override fun spaceSettings(spaceSettings: CfnSpace.SpaceSettingsProperty.Builder.() -> Unit):
        Unit = spaceSettings(CfnSpace.SpaceSettingsProperty(spaceSettings))

    override fun spaceSharingSettings(spaceSharingSettings: IResolvable) {
      cdkBuilder.spaceSharingSettings(spaceSharingSettings.let(IResolvable::unwrap))
    }

    override fun spaceSharingSettings(spaceSharingSettings: CfnSpace.SpaceSharingSettingsProperty) {
      cdkBuilder.spaceSharingSettings(spaceSharingSettings.let(CfnSpace.SpaceSharingSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01896c2fe6975306b642e7ad6d402c0c570b44022d117ad86d226d4067f16f33")
    override
        fun spaceSharingSettings(spaceSharingSettings: CfnSpace.SpaceSharingSettingsProperty.Builder.() -> Unit):
        Unit = spaceSharingSettings(CfnSpace.SpaceSharingSettingsProperty(spaceSharingSettings))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnSpaceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpaceProps,
  ) : CdkObject(cdkObject), CfnSpaceProps {
    override fun domainId(): String = unwrap(this).getDomainId()

    override fun ownershipSettings(): Any? = unwrap(this).getOwnershipSettings()

    override fun spaceDisplayName(): String? = unwrap(this).getSpaceDisplayName()

    override fun spaceName(): String = unwrap(this).getSpaceName()

    override fun spaceSettings(): Any? = unwrap(this).getSpaceSettings()

    override fun spaceSharingSettings(): Any? = unwrap(this).getSpaceSharingSettings()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSpaceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnSpaceProps):
        CfnSpaceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSpaceProps):
        software.amazon.awscdk.services.sagemaker.CfnSpaceProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.sagemaker.CfnSpaceProps
  }
}
