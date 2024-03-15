@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pcaconnectorad

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTemplateGroupAccessControlEntry internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry,
) : CfnResource(cdkObject), IInspectable {
  public open fun accessRights(): Any = unwrap(this).getAccessRights()

  public open fun accessRights(`value`: IResolvable) {
    unwrap(this).setAccessRights(`value`.let(IResolvable::unwrap))
  }

  public open fun accessRights(`value`: AccessRightsProperty) {
    unwrap(this).setAccessRights(`value`.let(AccessRightsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa486cd76485348b0a9d65bdf244b58032e087fe8977ba2f6fdd8d1b72813035")
  public open fun accessRights(`value`: AccessRightsProperty.Builder.() -> Unit): Unit =
      accessRights(AccessRightsProperty(`value`))

  public open fun groupDisplayName(): String = unwrap(this).getGroupDisplayName()

  public open fun groupDisplayName(`value`: String) {
    unwrap(this).setGroupDisplayName(`value`)
  }

  public open fun groupSecurityIdentifier(): String? = unwrap(this).getGroupSecurityIdentifier()

  public open fun groupSecurityIdentifier(`value`: String) {
    unwrap(this).setGroupSecurityIdentifier(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun templateArn(): String? = unwrap(this).getTemplateArn()

  public open fun templateArn(`value`: String) {
    unwrap(this).setTemplateArn(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun accessRights(accessRights: IResolvable)

    public fun accessRights(accessRights: AccessRightsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3154abc80697ff539e3d8f90809f827be838479098259ed8b2b6a017eaadaae5")
    public fun accessRights(accessRights: AccessRightsProperty.Builder.() -> Unit)

    public fun groupDisplayName(groupDisplayName: String)

    public fun groupSecurityIdentifier(groupSecurityIdentifier: String)

    public fun templateArn(templateArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.Builder =
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.Builder.create(scope,
        id)

    override fun accessRights(accessRights: IResolvable) {
      cdkBuilder.accessRights(accessRights.let(IResolvable::unwrap))
    }

    override fun accessRights(accessRights: AccessRightsProperty) {
      cdkBuilder.accessRights(accessRights.let(AccessRightsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3154abc80697ff539e3d8f90809f827be838479098259ed8b2b6a017eaadaae5")
    override fun accessRights(accessRights: AccessRightsProperty.Builder.() -> Unit): Unit =
        accessRights(AccessRightsProperty(accessRights))

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
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTemplateGroupAccessControlEntry {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTemplateGroupAccessControlEntry(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry):
        CfnTemplateGroupAccessControlEntry = CfnTemplateGroupAccessControlEntry(cdkObject)

    internal fun unwrap(wrapped: CfnTemplateGroupAccessControlEntry):
        software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry =
        wrapped.cdkObject
  }

  public interface AccessRightsProperty {
    public fun autoEnroll(): String? = unwrap(this).getAutoEnroll()

    public fun enroll(): String? = unwrap(this).getEnroll()

    @CdkDslMarker
    public interface Builder {
      public fun autoEnroll(autoEnroll: String)

      public fun enroll(enroll: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty.Builder
          =
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty.builder()

      override fun autoEnroll(autoEnroll: String) {
        cdkBuilder.autoEnroll(autoEnroll)
      }

      override fun enroll(enroll: String) {
        cdkBuilder.enroll(enroll)
      }

      public fun build():
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty,
    ) : CdkObject(cdkObject), AccessRightsProperty {
      override fun autoEnroll(): String? = unwrap(this).getAutoEnroll()

      override fun enroll(): String? = unwrap(this).getEnroll()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessRightsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty):
          AccessRightsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessRightsProperty):
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.pcaconnectorad.CfnTemplateGroupAccessControlEntry.AccessRightsProperty
    }
  }
}
