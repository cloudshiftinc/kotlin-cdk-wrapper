@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appstream

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CfnStackUserAssociationProps {
  public fun authenticationType(): String

  public fun sendEmailNotification(): Any? = unwrap(this).getSendEmailNotification()

  public fun stackName(): String

  public fun userName(): String

  @CdkDslMarker
  public interface Builder {
    public fun authenticationType(authenticationType: String)

    public fun sendEmailNotification(sendEmailNotification: Boolean)

    public fun sendEmailNotification(sendEmailNotification: IResolvable)

    public fun stackName(stackName: String)

    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.Builder =
        software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps.builder()

    override fun authenticationType(authenticationType: String) {
      cdkBuilder.authenticationType(authenticationType)
    }

    override fun sendEmailNotification(sendEmailNotification: Boolean) {
      cdkBuilder.sendEmailNotification(sendEmailNotification)
    }

    override fun sendEmailNotification(sendEmailNotification: IResolvable) {
      cdkBuilder.sendEmailNotification(sendEmailNotification.let(IResolvable::unwrap))
    }

    override fun stackName(stackName: String) {
      cdkBuilder.stackName(stackName)
    }

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps,
  ) : CdkObject(cdkObject), CfnStackUserAssociationProps {
    override fun authenticationType(): String = unwrap(this).getAuthenticationType()

    override fun sendEmailNotification(): Any? = unwrap(this).getSendEmailNotification()

    override fun stackName(): String = unwrap(this).getStackName()

    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStackUserAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps):
        CfnStackUserAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStackUserAssociationProps):
        software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appstream.CfnStackUserAssociationProps
  }
}
