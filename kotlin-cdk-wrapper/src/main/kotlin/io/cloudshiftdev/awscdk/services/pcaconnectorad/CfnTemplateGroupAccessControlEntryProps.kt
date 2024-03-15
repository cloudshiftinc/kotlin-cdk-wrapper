@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnTemplateGroupAccessControlEntryProps {
  public fun accessRights(): Any

  public fun groupDisplayName(): String

  public fun groupSecurityIdentifier(): String? = unwrap(this).getGroupSecurityIdentifier()

  public fun templateArn(): String? = unwrap(this).getTemplateArn()

  @CdkDslMarker
  public interface Builder {
    public fun accessRights(accessRights: IResolvable)

    public fun accessRights(accessRights: CfnTemplateGroupAccessControlEntry.AccessRightsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f404de33d4aeb61aba75d433049d802f08c7ac57ed851c90713d729d5b1114d2")
    public
        fun accessRights(accessRights: CfnTemplateGroupAccessControlEntry.AccessRightsProperty.Builder.() -> Unit)

    public fun groupDisplayName(groupDisplayName: String)

    public fun groupSecurityIdentifier(groupSecurityIdentifier: String)

    public fun templateArn(templateArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps.Builder
        =
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps.builder()

    override fun accessRights(accessRights: IResolvable) {
      cdkBuilder.accessRights(accessRights.let(IResolvable::unwrap))
    }

    override
        fun accessRights(accessRights: CfnTemplateGroupAccessControlEntry.AccessRightsProperty) {
      cdkBuilder.accessRights(accessRights.let(CfnTemplateGroupAccessControlEntry.AccessRightsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f404de33d4aeb61aba75d433049d802f08c7ac57ed851c90713d729d5b1114d2")
    override
        fun accessRights(accessRights: CfnTemplateGroupAccessControlEntry.AccessRightsProperty.Builder.() -> Unit):
        Unit = accessRights(CfnTemplateGroupAccessControlEntry.AccessRightsProperty(accessRights))

    override fun groupDisplayName(groupDisplayName: String) {
      cdkBuilder.groupDisplayName(groupDisplayName)
    }

    override fun groupSecurityIdentifier(groupSecurityIdentifier: String) {
      cdkBuilder.groupSecurityIdentifier(groupSecurityIdentifier)
    }

    override fun templateArn(templateArn: String) {
      cdkBuilder.templateArn(templateArn)
    }

    public fun build():
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps,
  ) : CdkObject(cdkObject), CfnTemplateGroupAccessControlEntryProps {
    override fun accessRights(): Any = unwrap(this).getAccessRights()

    override fun groupDisplayName(): String = unwrap(this).getGroupDisplayName()

    override fun groupSecurityIdentifier(): String? = unwrap(this).getGroupSecurityIdentifier()

    override fun templateArn(): String? = unwrap(this).getTemplateArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTemplateGroupAccessControlEntryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps):
        CfnTemplateGroupAccessControlEntryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTemplateGroupAccessControlEntryProps):
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntryProps
  }
}
