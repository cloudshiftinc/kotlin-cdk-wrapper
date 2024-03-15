@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.signer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProfilePermission internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.signer.CfnProfilePermission,
) : CfnResource(cdkObject), IInspectable {
  public open fun action(): String = unwrap(this).getAction()

  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun principal(): String = unwrap(this).getPrincipal()

  public open fun principal(`value`: String) {
    unwrap(this).setPrincipal(`value`)
  }

  public open fun profileName(): String = unwrap(this).getProfileName()

  public open fun profileName(`value`: String) {
    unwrap(this).setProfileName(`value`)
  }

  public open fun profileVersion(): String? = unwrap(this).getProfileVersion()

  public open fun profileVersion(`value`: String) {
    unwrap(this).setProfileVersion(`value`)
  }

  public open fun statementId(): String = unwrap(this).getStatementId()

  public open fun statementId(`value`: String) {
    unwrap(this).setStatementId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun action(action: String)

    public fun principal(principal: String)

    public fun profileName(profileName: String)

    public fun profileVersion(profileVersion: String)

    public fun statementId(statementId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.signer.CfnProfilePermission.Builder =
        software.amazon.awscdk.services.signer.CfnProfilePermission.Builder.create(scope, id)

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun principal(principal: String) {
      cdkBuilder.principal(principal)
    }

    override fun profileName(profileName: String) {
      cdkBuilder.profileName(profileName)
    }

    override fun profileVersion(profileVersion: String) {
      cdkBuilder.profileVersion(profileVersion)
    }

    override fun statementId(statementId: String) {
      cdkBuilder.statementId(statementId)
    }

    public fun build(): software.amazon.awscdk.services.signer.CfnProfilePermission =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.signer.CfnProfilePermission.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProfilePermission {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProfilePermission(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.signer.CfnProfilePermission):
        CfnProfilePermission = CfnProfilePermission(cdkObject)

    internal fun unwrap(wrapped: CfnProfilePermission):
        software.amazon.awscdk.services.signer.CfnProfilePermission = wrapped.cdkObject
  }
}
