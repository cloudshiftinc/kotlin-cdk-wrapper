@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAssignment internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sso.CfnAssignment,
) : CfnResource(cdkObject), IInspectable {
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun permissionSetArn(): String = unwrap(this).getPermissionSetArn()

  public open fun permissionSetArn(`value`: String) {
    unwrap(this).setPermissionSetArn(`value`)
  }

  public open fun principalId(): String = unwrap(this).getPrincipalId()

  public open fun principalId(`value`: String) {
    unwrap(this).setPrincipalId(`value`)
  }

  public open fun principalType(): String = unwrap(this).getPrincipalType()

  public open fun principalType(`value`: String) {
    unwrap(this).setPrincipalType(`value`)
  }

  public open fun targetId(): String = unwrap(this).getTargetId()

  public open fun targetId(`value`: String) {
    unwrap(this).setTargetId(`value`)
  }

  public open fun targetType(): String = unwrap(this).getTargetType()

  public open fun targetType(`value`: String) {
    unwrap(this).setTargetType(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun instanceArn(instanceArn: String)

    public fun permissionSetArn(permissionSetArn: String)

    public fun principalId(principalId: String)

    public fun principalType(principalType: String)

    public fun targetId(targetId: String)

    public fun targetType(targetType: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnAssignment.Builder =
        software.amazon.awscdk.services.sso.CfnAssignment.Builder.create(scope, id)

    override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    override fun permissionSetArn(permissionSetArn: String) {
      cdkBuilder.permissionSetArn(permissionSetArn)
    }

    override fun principalId(principalId: String) {
      cdkBuilder.principalId(principalId)
    }

    override fun principalType(principalType: String) {
      cdkBuilder.principalType(principalType)
    }

    override fun targetId(targetId: String) {
      cdkBuilder.targetId(targetId)
    }

    override fun targetType(targetType: String) {
      cdkBuilder.targetType(targetType)
    }

    public fun build(): software.amazon.awscdk.services.sso.CfnAssignment = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.sso.CfnAssignment.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAssignment {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAssignment(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnAssignment): CfnAssignment =
        CfnAssignment(cdkObject)

    internal fun unwrap(wrapped: CfnAssignment): software.amazon.awscdk.services.sso.CfnAssignment =
        wrapped.cdkObject
  }
}
