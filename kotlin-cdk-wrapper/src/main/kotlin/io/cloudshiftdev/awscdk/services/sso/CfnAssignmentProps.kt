@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sso

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnAssignmentProps {
  public fun instanceArn(): String

  public fun permissionSetArn(): String

  public fun principalId(): String

  public fun principalType(): String

  public fun targetId(): String

  public fun targetType(): String

  @CdkDslMarker
  public interface Builder {
    public fun instanceArn(instanceArn: String)

    public fun permissionSetArn(permissionSetArn: String)

    public fun principalId(principalId: String)

    public fun principalType(principalType: String)

    public fun targetId(targetId: String)

    public fun targetType(targetType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sso.CfnAssignmentProps.Builder =
        software.amazon.awscdk.services.sso.CfnAssignmentProps.builder()

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

    public fun build(): software.amazon.awscdk.services.sso.CfnAssignmentProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sso.CfnAssignmentProps,
  ) : CdkObject(cdkObject), CfnAssignmentProps {
    override fun instanceArn(): String = unwrap(this).getInstanceArn()

    override fun permissionSetArn(): String = unwrap(this).getPermissionSetArn()

    override fun principalId(): String = unwrap(this).getPrincipalId()

    override fun principalType(): String = unwrap(this).getPrincipalType()

    override fun targetId(): String = unwrap(this).getTargetId()

    override fun targetType(): String = unwrap(this).getTargetType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAssignmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sso.CfnAssignmentProps):
        CfnAssignmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAssignmentProps):
        software.amazon.awscdk.services.sso.CfnAssignmentProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sso.CfnAssignmentProps
  }
}
