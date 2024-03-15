@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnUserPoolUserToGroupAttachmentProps {
  public fun groupName(): String

  public fun userPoolId(): String

  public fun username(): String

  @CdkDslMarker
  public interface Builder {
    public fun groupName(groupName: String)

    public fun userPoolId(userPoolId: String)

    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps.builder()

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps,
  ) : CdkObject(cdkObject), CfnUserPoolUserToGroupAttachmentProps {
    override fun groupName(): String = unwrap(this).getGroupName()

    override fun userPoolId(): String = unwrap(this).getUserPoolId()

    override fun username(): String = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnUserPoolUserToGroupAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps):
        CfnUserPoolUserToGroupAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUserToGroupAttachmentProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolUserToGroupAttachmentProps
  }
}
